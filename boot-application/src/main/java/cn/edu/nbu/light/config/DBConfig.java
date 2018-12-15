package cn.edu.nbu.light.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/21 10:23
 */
@Configuration
@EnableTransactionManagement
@Import(MapperScannerConfig.class)
public class DBConfig {

//    @Value("${spring.datasource.url}")
//    private String url;
//    @Value("${spring.datasource.username}")
//    private String userName;
//    @Value("${spring.datasource.password}")
//    private String password;
    @Resource
    private Environment environment;

    private static final Logger LOGGER = LoggerFactory.getLogger(DBConfig.class);

    //必须加prefix参数(任意值均可)，否则会报错------------------------------------------------------------------------------------------------------------------
    @Primary
    @ConfigurationProperties("spring.datasource.druid")
    @Bean(name = "dataSource", initMethod = "init", destroyMethod = "close")
    public DataSource dataSource() throws SQLException {
        LOGGER.debug("----------配置datasource信息开始");
        DataSource dataSource = DruidDataSourceBuilder.create().build();
        LOGGER.debug("----------配置datasource信息结束");
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        LOGGER.debug("----------配置sqlSessionFactory信息开始");
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
        LOGGER.debug("----------配置sqlSessionFactory信息结束");
        return sqlSessionFactory.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

    @Bean
    public AnnotationTransactionAttributeSource annotationTransactionAttributeSource() {
        AnnotationTransactionAttributeSource annotationTransactionAttributeSource = new AnnotationTransactionAttributeSource();
        return annotationTransactionAttributeSource;
    }









    public void show(){
//        System.out.println("spring.datasource.url:" + this.url);
//        System.out.println("spring.datasource.username:" + this.userName);
//        System.out.println("spring.datasource.password:" + this.password);

        System.out.println("spring.datasource.url:" + environment.getProperty("spring.datasource.url"));
        System.out.println("spring.datasource.username:" + environment.getProperty("spring.datasource.username"));
        System.out.println("spring.datasource.password:" + environment.getProperty("spring.datasource.password"));
    }
}

package cn.edu.nbu.light.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author fanwh
 * @version v1.0
 * @decription
 * @create on 2018/3/21 11:20
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class DataSourceProperties {
    private String url;
    private String userName;
    private String password;

    public void show(){
        System.out.println("spring.datasource.url=" + this.url);
        System.out.println("spring.datasource.userName=" + this.userName);
        System.out.println("spring.datasource.password=" +this.password);
    }
}

/**
 * @decription
 * @author fanwh
 * @version v1.0
 * @create on 2018/3/20 18:18
 */
package cn.edu.nbu.light;

/**
 * spring boot 常用 注解
 *
 * @Configuration                 # 作用于类上，相当于一个 xml 配置文件
 @Bean                          # 作用于方法上，相当于 xml 配置中的 <bean>
 @SpringBootApplication         # Spring Boot的核心注解，是一个组合注解，用于启动类上
 @EnableAutoConfiguration       # 启用自动配置，允许加载第三方 Jar 包的配置
 @ComponentScan                 # 默认扫描 @SpringBootApplication 所在类的同级目录以及它的子目录
 @PropertySource                # 加载 properties 文件
 @Value                         # 将配置文件的属性注入到 Bean 中特定的成员变量
 @EnableConfigurationProperties # 开启一个特性，让配置文件的属性可以注入到 Bean 中，与 @ConfigurationProperties 结合使用
 @ConfigurationProperties       # 关联配置文件中的属性到 Bean 中
 @Import                        # 加载指定 Class 文件，其生命周期被 Spring 管理
 @ImportResource                # 加载 xml 文件
 */

/**
 * spring boot 常用conditional注解
 * @ConditionalOnBean              # 当指定 Bean 存在时进行装配
 @ConditionalOnMissingBean       # 当指定 Bean 不存在时进行装配
 @ConditionalOnClass             # 当指定 Class 在 classpath 中时进行装配
 @ConditionalOnMissingClass      # 当指定 Class 不在 classpath 中时进行装配
 @ConditionalOnExpression        # 根据 SpEL 表达式进行装配
 @ConditionalOnJava              # 根据 JVM 版本进行装配
 @ConditionalOnJndi              # 根据 JNDI 进行装配
 @ConditionalOnWebApplication    # 当上下文是 WebApplication 时进行装配
 @ConditionalOnNotWebApplication # 当上下文不是 WebApplication 时进行装配
 @ConditionalOnProperty          # 当指定的属性名的值为指定的值时进行装配
 @ConditionalOnResource          # 当指定的资源在 classpath 中时进行装配
 @ConditionalOnCloudPlatform     #
 @ConditionalOnSingleCandidate   #
 */
//博客地址
//https://www.extlight.com/2017/11/23/Spring-Boot-%E5%85%A5%E9%97%A8%E4%B9%8B%E5%9F%BA%E7%A1%80%E7%AF%87%EF%BC%88%E4%B8%80%EF%BC%89/
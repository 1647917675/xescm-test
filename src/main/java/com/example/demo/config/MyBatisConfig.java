package com.example.demo.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 *
 *
 * @author MT
 * @date 2016/9/18
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.example.demo.mapper"})
public class MyBatisConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public org.apache.tomcat.jdbc.pool.DataSource dataSource(){
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setTypeAliasesPackage("com.example.demo.domain");
        ////加载配置文件用查找器
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("supportMethodsArguments","true");
        properties.setProperty("returnPageInfo","check");
        properties.setProperty("params","count=countSql");
        pageHelper.setProperties(properties);
        //添加插件
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        //加载mapper配置文件
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/example/demo/mapper/*.xml"));
        logger.info("url ----------------------------------------------");
        logger.info("url ----------------------------------------------");
        logger.info("url ----------------------------------------------");
        logger.info("url ----------------------------------------------");

        logger.info("url ----------------------------------------------");
        return sqlSessionFactoryBean.getObject();
    }

    //加载事务管理器
    @Bean
    public PlatformTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

}
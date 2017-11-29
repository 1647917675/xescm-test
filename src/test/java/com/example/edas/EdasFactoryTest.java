package com.example.edas;

import com.example.demo.DemoApplication;
import com.example.demo.edas.EdasPropertySourceLoaderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {DemoApplication.class})
public class EdasFactoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    @DisplayName("test factory")
    public void testEdasFactory() throws Exception {
        Assertions.assertTrue(EdasPropertySourceLoaderImpl.getFactory() != null);
        logger.info("查看edas的提供的服务{}",EdasPropertySourceLoaderImpl.getFactory().consumers());
        logger.info("查看edas的提供的服务{}",EdasPropertySourceLoaderImpl.getFactory().providers());
    }
    @Value("${xescm.edas.group}")
    private String env;

    @Test
    @DisplayName("test 是不是dev的环境")
    public void testSpring2() throws Exception {
        System.out.println(env);
        Assertions.assertTrue(env.equalsIgnoreCase("dev"));
    }
}

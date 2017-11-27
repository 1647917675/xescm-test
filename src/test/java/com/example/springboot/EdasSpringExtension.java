package com.example.springboot;

import com.taobao.hsf.lightapi.ServiceFactory;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Deprecated
public class EdasSpringExtension extends SpringExtension {
    private static Logger logger = LoggerFactory.getLogger(EdasSpringExtension.class);

    private static final String application = "edas.properties";

    private final static String hsfSar = "hsf.sar";

    private static  ServiceFactory factory ;

    static {
        String path = EdasSpringExtension.class.getResource("/").getPath();
        logger.info("加载当前的classpath的目录：{}",path);
        String config = path + application;
        String hsfSarPath = getHsfSarPath(config).replace("//", "////");
        factory = ServiceFactory.getInstanceWithPath(hsfSarPath);
        logger.info("加载alibaba hsf的sar的依赖");
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        super.beforeAll(context);
    }

    /**
     *  获取hsf的文件的目录
     * @param applicationConfigPath
     * @return
     * @throws IOException
     */
    public static String getHsfSarPath(String applicationConfigPath) {
        FileInputStream fileInputStream = null;
        Properties properties = new Properties();
        try {
            fileInputStream = new FileInputStream(new File(applicationConfigPath));
             properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = properties.getProperty(hsfSar);
        return path;
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        super.beforeEach(context);
    }


}

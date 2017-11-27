package com.example.demo.edas;

import com.taobao.hsf.lightapi.ServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author lw
 */
public class EdasPropertySourceLoaderImpl implements PropertySourceLoader {

    private static Logger logger = LoggerFactory.getLogger(EdasPropertySourceLoaderImpl.class);

    private static final String TAO_BAO_HSF_PATH = "taobao-hsf.sar";

    private static  ServiceFactory factory ;

    static {

        try {
            String path = EdasPropertySourceLoaderImpl.class.getResource("/").getPath();
            logger.info("加载当前的classpath的目录：{}",path);
            //只有在测试的环节下才会加载库存
            if (path.contains("test-classes")){
                logger.info("只有在测试的环节中，才会加载taobao-hsf的依赖文件");
                String taobaoHsfPath = path + "//" +TAO_BAO_HSF_PATH;
                factory = ServiceFactory.getInstanceWithPath(taobaoHsfPath);
                logger.info("加载alibaba hsf的sar的依赖");
            }

        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }

    @Override
    public String[] getFileExtensions() {
        return new String[0];
    }

    @Override
    public PropertySource<?> load(String name, Resource resource, String profile) throws IOException {
        return null;
    }

    /**
     *   返回edas的factory
     * @return
     */
    public static ServiceFactory getFactory() {
        return factory;
    }
}

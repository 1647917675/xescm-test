package com.example.springboot;

import com.example.demo.edas.EdasPropertySourceLoaderImpl;
import com.taobao.hsf.lightapi.ServiceFactory;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@Deprecated
public class EdasSpringExtension extends SpringExtension {
    private static Logger logger = LoggerFactory.getLogger(EdasPropertySourceLoaderImpl.class);

    private static final String TAO_BAO_HSF_PATH = "taobao-hsf.sar";

    private static  ServiceFactory factory ;

    static {

        try {
            String path = EdasSpringExtension.class.getResource("/").getPath();
            logger.info("加载当前的classpath的目录：{}",path);
            //只有在测试的环节下才会加载库存
            if (path.contains("test-classes")){
//                logger.info("只有在测试的环节中，才会加载taobao-hsf的依赖文件");
                String taobaoHsfPath = path + "//" +TAO_BAO_HSF_PATH;
                factory = ServiceFactory.getInstanceWithPath(taobaoHsfPath);
                logger.info("加载alibaba hsf的sar的依赖");
            }

        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        super.beforeAll(context);
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        super.beforeEach(context);
    }


}

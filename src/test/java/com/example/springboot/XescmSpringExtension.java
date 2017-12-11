package com.example.springboot;

import com.example.annocation.ContinuousIntegration;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.lang.reflect.AnnotatedElement;
import java.util.Optional;

import static org.junit.platform.commons.util.AnnotationUtils.findAnnotation;

/**i
 * 〈功能简述〉<br/>
 * 〈鲜易SpringExtension〉
 *
 * @author lw
 * @date 2017/12/5
 * @since 1.0.0
 */
public class XescmSpringExtension extends SpringExtension implements ExecutionCondition {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String ENV = "env";
    private static final String ENV_DEV_VALUE = "dev";
    private static final ConditionEvaluationResult ENABLED = ConditionEvaluationResult.enabled(
            "@edas持续集成的");

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {

        Optional<AnnotatedElement> element = context.getElement();
        Optional<ContinuousIntegration> continuousIntegration = findAnnotation(element, ContinuousIntegration.class);

        //说明是spring环境
        if (getApplicationContext(context) != null){
            String env = getApplicationContext(context).getEnvironment().getProperty(ENV);
            logger.info("当前环境的env{}",env);
            logger.info("annotation{}",continuousIntegration.isPresent());
            if (ENV_DEV_VALUE.equalsIgnoreCase(env) && continuousIntegration.isPresent()){
                return ConditionEvaluationResult.disabled("本地开发环境不用走持续集成");
            }
        }
        return ENABLED;
    }
}
package com.example.annocation;

import org.apiguardian.api.API;

import java.lang.annotation.*;

import static org.apiguardian.api.API.Status.STABLE;

/**
 * 〈功能简述〉<br/>
 * 〈用于区别持续集成和单元测试〉
 *
 * @author lw
 * @date 2017/12/5
 * @since 1.0.0
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(status = STABLE, since = "5.0")
public @interface ContinuousIntegration {

}
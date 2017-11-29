package com.example.annocation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Tag("fast")
public @interface Fast {
}

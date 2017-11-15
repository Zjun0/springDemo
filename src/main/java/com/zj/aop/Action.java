package com.zj.aop;

import java.lang.annotation.*;

/**
 * @author: zj
 * @date: ${date}
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}

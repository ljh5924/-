package com.zhy.aspect.annotation;

import java.lang.annotation.*;

/**
 * @author: ljh123
 * @Date: 2023/11/1 13:25
 * Describe:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PermissionCheck {

    String value();

}

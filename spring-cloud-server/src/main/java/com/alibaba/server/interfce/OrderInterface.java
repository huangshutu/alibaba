package com.alibaba.server.interfce;

import java.lang.annotation.*;

/**
 * @description:
 * @author: shutu
 * @date: 2023/10/6 1:55
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface OrderInterface {
    String name() default "huang";
}

package com.github.common.annotation;

import java.lang.annotation.*;

@Target(value={ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Ignore {
}

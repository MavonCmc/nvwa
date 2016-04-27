package org.bigmouth.nvwa.validate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Only for String.
 * 
 * @author nada
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateLength {

	int min() default 0;

	int max() default Integer.MAX_VALUE;
}

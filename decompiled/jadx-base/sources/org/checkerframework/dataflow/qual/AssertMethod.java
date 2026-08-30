package org.checkerframework.dataflow.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface AssertMethod {
    boolean isAssertFalse() default false;

    int parameter() default 1;

    java.lang.Class<?> value() default java.lang.AssertionError.class;
}

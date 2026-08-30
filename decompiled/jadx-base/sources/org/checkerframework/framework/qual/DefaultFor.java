package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DefaultFor {
    java.lang.String[] names() default {};

    java.lang.String[] namesExceptions() default {};

    org.checkerframework.framework.qual.TypeKind[] typeKinds() default {};

    java.lang.Class<?>[] types() default {};

    org.checkerframework.framework.qual.TypeUseLocation[] value() default {};
}

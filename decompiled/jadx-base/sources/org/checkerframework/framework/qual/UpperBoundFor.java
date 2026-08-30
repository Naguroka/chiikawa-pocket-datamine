package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface UpperBoundFor {
    org.checkerframework.framework.qual.TypeKind[] typeKinds() default {};

    java.lang.Class<?>[] types() default {};
}

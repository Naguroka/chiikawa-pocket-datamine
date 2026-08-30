package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface QualifierForLiterals {
    java.lang.String[] stringPatterns() default {};

    org.checkerframework.framework.qual.LiteralKind[] value() default {};
}

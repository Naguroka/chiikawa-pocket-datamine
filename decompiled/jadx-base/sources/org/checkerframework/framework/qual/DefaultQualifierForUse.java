package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DefaultQualifierForUse {
    java.lang.Class<? extends java.lang.annotation.Annotation>[] value() default {};
}

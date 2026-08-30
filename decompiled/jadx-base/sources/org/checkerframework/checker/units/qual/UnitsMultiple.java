package org.checkerframework.checker.units.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface UnitsMultiple {
    org.checkerframework.checker.units.qual.Prefix prefix() default org.checkerframework.checker.units.qual.Prefix.one;

    java.lang.Class<? extends java.lang.annotation.Annotation> quantity();
}

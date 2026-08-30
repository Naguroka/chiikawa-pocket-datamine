package org.checkerframework.checker.units.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.units.qual.Luminance.class})
public @interface cd {
    org.checkerframework.checker.units.qual.Prefix value() default org.checkerframework.checker.units.qual.Prefix.one;
}

package org.checkerframework.checker.regex.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({})
@org.checkerframework.framework.qual.InvisibleQualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.regex.qual.UnknownRegex.class})
public @interface PartialRegex {
    java.lang.String value() default "";
}

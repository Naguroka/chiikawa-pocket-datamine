package org.checkerframework.checker.mustcall.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Inherited
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface InheritableMustCall {
    java.lang.String[] value() default {};
}

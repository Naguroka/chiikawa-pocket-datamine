package com.google.common.annotations;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface GwtCompatible {
    boolean emulated() default false;

    boolean serializable() default false;
}

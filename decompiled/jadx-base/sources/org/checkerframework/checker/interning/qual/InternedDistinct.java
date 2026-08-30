package org.checkerframework.checker.interning.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.DefaultFor({org.checkerframework.framework.qual.TypeUseLocation.LOWER_BOUND})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.interning.qual.Interned.class})
public @interface InternedDistinct {
}

package org.checkerframework.checker.index.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.index.qual.SubstringIndexUnknown.class})
public @interface SubstringIndexFor {
    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String[] offset();

    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String[] value();
}

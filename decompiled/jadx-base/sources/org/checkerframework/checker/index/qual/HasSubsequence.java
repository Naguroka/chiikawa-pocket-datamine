package org.checkerframework.checker.index.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface HasSubsequence {
    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String from();

    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String subsequence();

    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String to();
}

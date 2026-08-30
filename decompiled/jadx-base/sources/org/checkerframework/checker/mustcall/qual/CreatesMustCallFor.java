package org.checkerframework.checker.mustcall.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@org.checkerframework.framework.qual.InheritedAnnotation
@java.lang.annotation.Repeatable(org.checkerframework.checker.mustcall.qual.CreatesMustCallFor.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface CreatesMustCallFor {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.mustcall.qual.CreatesMustCallFor[] value();
    }

    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String value() default "this";
}

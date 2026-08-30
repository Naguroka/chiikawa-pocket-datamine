package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.framework.qual.RequiresQualifier.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RequiresQualifier {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.framework.qual.RequiresQualifier[] value();
    }

    java.lang.String[] expression();

    java.lang.Class<? extends java.lang.annotation.Annotation> qualifier();
}

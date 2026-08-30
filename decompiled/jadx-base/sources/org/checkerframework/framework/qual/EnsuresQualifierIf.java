package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@org.checkerframework.framework.qual.InheritedAnnotation
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.framework.qual.EnsuresQualifierIf.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresQualifierIf {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.framework.qual.EnsuresQualifierIf[] value();
    }

    java.lang.String[] expression();

    java.lang.Class<? extends java.lang.annotation.Annotation> qualifier();

    boolean result();
}

package org.checkerframework.framework.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PACKAGE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.framework.qual.DefaultQualifier.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface DefaultQualifier {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PACKAGE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.framework.qual.DefaultQualifier[] value();
    }

    org.checkerframework.framework.qual.TypeUseLocation[] locations() default {org.checkerframework.framework.qual.TypeUseLocation.ALL};

    java.lang.Class<? extends java.lang.annotation.Annotation> value();
}

package org.checkerframework.common.value.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.InheritedAnnotation
@org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.common.value.qual.MinLen.class)
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.common.value.qual.EnsuresMinLenIf.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresMinLenIf {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.common.value.qual.MinLen.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.common.value.qual.EnsuresMinLenIf[] value();
    }

    java.lang.String[] expression();

    boolean result();

    @org.checkerframework.framework.qual.QualifierArgument("value")
    int targetValue() default 0;
}

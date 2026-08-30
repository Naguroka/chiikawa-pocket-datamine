package org.checkerframework.checker.calledmethods.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.InheritedAnnotation
@org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.calledmethods.qual.CalledMethods.class)
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresCalledMethodsIf {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.calledmethods.qual.CalledMethods.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf[] value();
    }

    java.lang.String[] expression();

    @org.checkerframework.framework.qual.QualifierArgument("value")
    java.lang.String[] methods();

    boolean result();
}

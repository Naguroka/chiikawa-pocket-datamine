package org.checkerframework.checker.calledmethods.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PostconditionAnnotation(qualifier = org.checkerframework.checker.calledmethods.qual.CalledMethods.class)
@org.checkerframework.framework.qual.InheritedAnnotation
@java.lang.annotation.Repeatable(org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List.class)
public @interface EnsuresCalledMethods {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.PostconditionAnnotation(qualifier = org.checkerframework.checker.calledmethods.qual.CalledMethods.class)
    @org.checkerframework.framework.qual.InheritedAnnotation
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods[] value();
    }

    @org.checkerframework.framework.qual.QualifierArgument("value")
    java.lang.String[] methods();

    java.lang.String[] value();
}

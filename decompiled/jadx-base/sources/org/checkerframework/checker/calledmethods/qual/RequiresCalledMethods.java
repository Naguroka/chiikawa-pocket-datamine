package org.checkerframework.checker.calledmethods.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.calledmethods.qual.CalledMethods.class)
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.checker.calledmethods.qual.RequiresCalledMethods.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RequiresCalledMethods {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.calledmethods.qual.CalledMethods.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.calledmethods.qual.RequiresCalledMethods[] value();
    }

    @org.checkerframework.framework.qual.QualifierArgument("value")
    java.lang.String[] methods();

    java.lang.String[] value();
}

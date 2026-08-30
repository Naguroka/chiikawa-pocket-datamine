package org.checkerframework.checker.optional.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.optional.qual.Present.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RequiresPresent {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.optional.qual.Present.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.optional.qual.RequiresPresent[] value();
    }

    java.lang.String[] value();
}

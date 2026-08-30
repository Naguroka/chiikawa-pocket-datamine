package org.checkerframework.checker.optional.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.InheritedAnnotation
@org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.optional.qual.Present.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresPresentIf {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.optional.qual.Present.class)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.optional.qual.EnsuresPresentIf[] value();
    }

    java.lang.String[] expression();

    boolean result();
}

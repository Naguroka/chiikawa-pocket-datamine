package org.checkerframework.checker.nullness.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.InheritedAnnotation
@org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.nullness.qual.KeyFor.class)
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.checker.nullness.qual.EnsuresKeyForIf.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresKeyForIf {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.nullness.qual.KeyFor.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.nullness.qual.EnsuresKeyForIf[] value();
    }

    java.lang.String[] expression();

    @org.checkerframework.framework.qual.QualifierArgument("value")
    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String[] map();

    boolean result();
}

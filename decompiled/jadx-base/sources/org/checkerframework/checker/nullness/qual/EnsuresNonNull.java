package org.checkerframework.checker.nullness.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PostconditionAnnotation(qualifier = org.checkerframework.checker.nullness.qual.NonNull.class)
@org.checkerframework.framework.qual.InheritedAnnotation
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.checker.nullness.qual.EnsuresNonNull.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresNonNull {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.PostconditionAnnotation(qualifier = org.checkerframework.checker.nullness.qual.NonNull.class)
    @org.checkerframework.framework.qual.InheritedAnnotation
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.nullness.qual.EnsuresNonNull[] value();
    }

    java.lang.String[] value();
}

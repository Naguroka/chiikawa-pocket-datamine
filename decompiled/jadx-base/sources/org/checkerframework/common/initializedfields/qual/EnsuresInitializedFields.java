package org.checkerframework.common.initializedfields.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PostconditionAnnotation(qualifier = org.checkerframework.common.initializedfields.qual.InitializedFields.class)
@org.checkerframework.framework.qual.InheritedAnnotation
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.common.initializedfields.qual.EnsuresInitializedFields.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresInitializedFields {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.PostconditionAnnotation(qualifier = org.checkerframework.common.initializedfields.qual.InitializedFields.class)
    @org.checkerframework.framework.qual.InheritedAnnotation
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.common.initializedfields.qual.EnsuresInitializedFields[] value();
    }

    @org.checkerframework.framework.qual.QualifierArgument("value")
    java.lang.String[] fields();

    java.lang.String[] value() default {"this"};
}

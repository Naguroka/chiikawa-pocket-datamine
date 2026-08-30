package com.google.errorprone.annotations;

/* JADX INFO: loaded from: classes5.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.METHOD})
public @interface RestrictedApi {
    java.lang.String allowedOnPath() default "";

    java.lang.Class<? extends java.lang.annotation.Annotation>[] allowlistAnnotations() default {};

    java.lang.Class<? extends java.lang.annotation.Annotation>[] allowlistWithWarningAnnotations() default {};

    java.lang.String explanation();

    java.lang.String link() default "";
}

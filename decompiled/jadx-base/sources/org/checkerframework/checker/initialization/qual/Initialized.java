package org.checkerframework.checker.initialization.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.DefaultFor({org.checkerframework.framework.qual.TypeUseLocation.IMPLICIT_UPPER_BOUND, org.checkerframework.framework.qual.TypeUseLocation.IMPLICIT_LOWER_BOUND, org.checkerframework.framework.qual.TypeUseLocation.EXCEPTION_PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.initialization.qual.UnknownInitialization.class})
@org.checkerframework.framework.qual.DefaultQualifierInHierarchy
public @interface Initialized {
}

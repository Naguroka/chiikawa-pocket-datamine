package org.checkerframework.checker.lock.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.lock.qual.GuardedByUnknown.class})
@org.checkerframework.framework.qual.DefaultFor(typeKinds = {org.checkerframework.framework.qual.TypeKind.BOOLEAN, org.checkerframework.framework.qual.TypeKind.BYTE, org.checkerframework.framework.qual.TypeKind.CHAR, org.checkerframework.framework.qual.TypeKind.DOUBLE, org.checkerframework.framework.qual.TypeKind.FLOAT, org.checkerframework.framework.qual.TypeKind.INT, org.checkerframework.framework.qual.TypeKind.LONG, org.checkerframework.framework.qual.TypeKind.SHORT}, types = {java.lang.String.class, java.lang.Void.class}, value = {org.checkerframework.framework.qual.TypeUseLocation.EXCEPTION_PARAMETER, org.checkerframework.framework.qual.TypeUseLocation.UPPER_BOUND})
@java.lang.annotation.Documented
@org.checkerframework.framework.qual.UpperBoundFor(typeKinds = {org.checkerframework.framework.qual.TypeKind.BOOLEAN, org.checkerframework.framework.qual.TypeKind.BYTE, org.checkerframework.framework.qual.TypeKind.CHAR, org.checkerframework.framework.qual.TypeKind.DOUBLE, org.checkerframework.framework.qual.TypeKind.FLOAT, org.checkerframework.framework.qual.TypeKind.INT, org.checkerframework.framework.qual.TypeKind.LONG, org.checkerframework.framework.qual.TypeKind.SHORT}, types = {java.lang.String.class})
@org.checkerframework.framework.qual.DefaultQualifierInHierarchy
public @interface GuardedBy {
    @org.checkerframework.framework.qual.JavaExpression
    java.lang.String[] value() default {};
}

package org.checkerframework.checker.signedness.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.signedness.qual.UnknownSignedness.class})
@org.checkerframework.framework.qual.DefaultFor(typeKinds = {org.checkerframework.framework.qual.TypeKind.BYTE, org.checkerframework.framework.qual.TypeKind.INT, org.checkerframework.framework.qual.TypeKind.LONG, org.checkerframework.framework.qual.TypeKind.SHORT, org.checkerframework.framework.qual.TypeKind.FLOAT, org.checkerframework.framework.qual.TypeKind.DOUBLE}, types = {java.lang.Byte.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Short.class, java.lang.Float.class, java.lang.Double.class}, value = {org.checkerframework.framework.qual.TypeUseLocation.EXCEPTION_PARAMETER})
@java.lang.annotation.Documented
@org.checkerframework.framework.qual.UpperBoundFor(typeKinds = {org.checkerframework.framework.qual.TypeKind.FLOAT, org.checkerframework.framework.qual.TypeKind.DOUBLE}, types = {java.lang.Float.class, java.lang.Double.class})
@org.checkerframework.framework.qual.DefaultQualifierInHierarchy
public @interface Signed {
}

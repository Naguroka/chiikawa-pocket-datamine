package org.checkerframework.checker.signedness.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.DefaultFor(typeKinds = {org.checkerframework.framework.qual.TypeKind.CHAR}, types = {java.lang.Character.class})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.signedness.qual.UnknownSignedness.class})
@org.checkerframework.framework.qual.UpperBoundFor(typeKinds = {org.checkerframework.framework.qual.TypeKind.CHAR}, types = {java.lang.Character.class})
public @interface Unsigned {
}

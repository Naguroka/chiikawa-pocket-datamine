package org.checkerframework.checker.interning.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.QualifierForLiterals({org.checkerframework.framework.qual.LiteralKind.PRIMITIVE, org.checkerframework.framework.qual.LiteralKind.STRING})
@org.checkerframework.framework.qual.DefaultFor(typeKinds = {org.checkerframework.framework.qual.TypeKind.BOOLEAN, org.checkerframework.framework.qual.TypeKind.BYTE, org.checkerframework.framework.qual.TypeKind.CHAR, org.checkerframework.framework.qual.TypeKind.DOUBLE, org.checkerframework.framework.qual.TypeKind.FLOAT, org.checkerframework.framework.qual.TypeKind.INT, org.checkerframework.framework.qual.TypeKind.LONG, org.checkerframework.framework.qual.TypeKind.SHORT})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.interning.qual.UnknownInterned.class})
public @interface Interned {
}

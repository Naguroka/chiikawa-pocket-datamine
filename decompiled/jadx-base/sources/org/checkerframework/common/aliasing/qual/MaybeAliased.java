package org.checkerframework.common.aliasing.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
@org.checkerframework.framework.qual.DefaultFor(types = {java.lang.Void.class}, value = {org.checkerframework.framework.qual.TypeUseLocation.UPPER_BOUND, org.checkerframework.framework.qual.TypeUseLocation.LOWER_BOUND})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({})
@org.checkerframework.framework.qual.DefaultQualifierInHierarchy
public @interface MaybeAliased {
}

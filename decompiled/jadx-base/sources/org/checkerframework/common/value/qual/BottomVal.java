package org.checkerframework.common.value.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.TargetLocations({org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_LOWER_BOUND, org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_UPPER_BOUND})
@org.checkerframework.framework.qual.InvisibleQualifier
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.common.value.qual.ArrayLen.class, org.checkerframework.common.value.qual.BoolVal.class, org.checkerframework.common.value.qual.DoubleVal.class, org.checkerframework.common.value.qual.IntVal.class, org.checkerframework.common.value.qual.StringVal.class, org.checkerframework.common.value.qual.MatchesRegex.class, org.checkerframework.common.value.qual.DoesNotMatchRegex.class, org.checkerframework.common.value.qual.ArrayLenRange.class, org.checkerframework.common.value.qual.IntRange.class, org.checkerframework.common.value.qual.IntRangeFromPositive.class, org.checkerframework.common.value.qual.IntRangeFromGTENegativeOne.class, org.checkerframework.common.value.qual.IntRangeFromNonNegative.class})
public @interface BottomVal {
}

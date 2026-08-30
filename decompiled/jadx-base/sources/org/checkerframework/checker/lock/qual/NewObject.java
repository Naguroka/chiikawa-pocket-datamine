package org.checkerframework.checker.lock.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
@org.checkerframework.framework.qual.QualifierForLiterals({org.checkerframework.framework.qual.LiteralKind.STRING, org.checkerframework.framework.qual.LiteralKind.PRIMITIVE})
@org.checkerframework.framework.qual.TargetLocations({org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_LOWER_BOUND, org.checkerframework.framework.qual.TypeUseLocation.EXPLICIT_UPPER_BOUND})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.lock.qual.GuardedBy.class, org.checkerframework.checker.lock.qual.GuardSatisfied.class})
@org.checkerframework.framework.qual.DefaultFor({org.checkerframework.framework.qual.TypeUseLocation.CONSTRUCTOR_RESULT})
@java.lang.annotation.Documented
public @interface NewObject {
}

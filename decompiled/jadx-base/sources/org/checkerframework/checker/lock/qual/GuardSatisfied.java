package org.checkerframework.checker.lock.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
@org.checkerframework.framework.qual.TargetLocations({org.checkerframework.framework.qual.TypeUseLocation.RECEIVER, org.checkerframework.framework.qual.TypeUseLocation.PARAMETER, org.checkerframework.framework.qual.TypeUseLocation.RETURN})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.checkerframework.framework.qual.SubtypeOf({org.checkerframework.checker.lock.qual.GuardedByUnknown.class})
public @interface GuardSatisfied {
    int value() default -1;
}

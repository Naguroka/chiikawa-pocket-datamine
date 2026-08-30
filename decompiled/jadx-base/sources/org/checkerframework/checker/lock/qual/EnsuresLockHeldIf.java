package org.checkerframework.checker.lock.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.InheritedAnnotation
@org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.lock.qual.LockHeld.class)
@java.lang.annotation.Documented
@java.lang.annotation.Repeatable(org.checkerframework.checker.lock.qual.EnsuresLockHeldIf.List.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface EnsuresLockHeldIf {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @org.checkerframework.framework.qual.InheritedAnnotation
    @org.checkerframework.framework.qual.ConditionalPostconditionAnnotation(qualifier = org.checkerframework.checker.lock.qual.LockHeld.class)
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface List {
        org.checkerframework.checker.lock.qual.EnsuresLockHeldIf[] value();
    }

    java.lang.String[] expression();

    boolean result();
}

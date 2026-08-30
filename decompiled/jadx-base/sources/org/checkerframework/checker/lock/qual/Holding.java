package org.checkerframework.checker.lock.qual;

/* JADX INFO: loaded from: classes6.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@org.checkerframework.framework.qual.PreconditionAnnotation(qualifier = org.checkerframework.checker.lock.qual.LockHeld.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Holding {
    java.lang.String[] value();
}

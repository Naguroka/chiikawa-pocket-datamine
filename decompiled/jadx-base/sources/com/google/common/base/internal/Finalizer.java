package com.google.common.base.internal;

/* JADX INFO: loaded from: classes5.dex */
public class Finalizer implements java.lang.Runnable {
    private static final java.lang.String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";

    @javax.annotation.CheckForNull
    private static final java.lang.reflect.Constructor<java.lang.Thread> bigThreadConstructor;

    @javax.annotation.CheckForNull
    private static final java.lang.reflect.Field inheritableThreadLocals;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.base.internal.Finalizer.class.getName());
    private final java.lang.ref.WeakReference<java.lang.Class<?>> finalizableReferenceClassReference;
    private final java.lang.ref.PhantomReference<java.lang.Object> frqReference;
    private final java.lang.ref.ReferenceQueue<java.lang.Object> queue;

    static {
        java.lang.reflect.Constructor<java.lang.Thread> bigThreadConstructor2 = getBigThreadConstructor();
        bigThreadConstructor = bigThreadConstructor2;
        inheritableThreadLocals = bigThreadConstructor2 == null ? getInheritableThreadLocalsField() : null;
    }

    public static void startFinalizer(java.lang.Class<?> finalizableReferenceClass, java.lang.ref.ReferenceQueue<java.lang.Object> queue, java.lang.ref.PhantomReference<java.lang.Object> frqReference) {
        java.lang.Thread thread;
        if (!finalizableReferenceClass.getName().equals(FINALIZABLE_REFERENCE)) {
            throw new java.lang.IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        com.google.common.base.internal.Finalizer finalizer = new com.google.common.base.internal.Finalizer(finalizableReferenceClass, queue, frqReference);
        java.lang.String name = com.google.common.base.internal.Finalizer.class.getName();
        java.lang.reflect.Constructor<java.lang.Thread> constructor = bigThreadConstructor;
        if (constructor != null) {
            try {
                thread = constructor.newInstance(null, finalizer, name, 0L, false);
            } catch (java.lang.Throwable th) {
                logger.log(java.util.logging.Level.INFO, "Failed to create a thread without inherited thread-local values", th);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new java.lang.Thread(null, finalizer, name);
        }
        thread.setDaemon(true);
        try {
            java.lang.reflect.Field field = inheritableThreadLocals;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (java.lang.Throwable th2) {
            logger.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th2);
        }
        thread.start();
    }

    private Finalizer(java.lang.Class<?> finalizableReferenceClass, java.lang.ref.ReferenceQueue<java.lang.Object> queue, java.lang.ref.PhantomReference<java.lang.Object> frqReference) {
        this.queue = queue;
        this.finalizableReferenceClassReference = new java.lang.ref.WeakReference<>(finalizableReferenceClass);
        this.frqReference = frqReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.queue.remove())) {
        }
    }

    private boolean cleanUp(java.lang.ref.Reference<?> firstReference) {
        java.lang.ref.Reference<? extends java.lang.Object> referencePoll;
        java.lang.reflect.Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod == null || !finalizeReference(firstReference, finalizeReferentMethod)) {
            return false;
        }
        do {
            referencePoll = this.queue.poll();
            if (referencePoll == null) {
                return true;
            }
        } while (finalizeReference(referencePoll, finalizeReferentMethod));
        return false;
    }

    private boolean finalizeReference(java.lang.ref.Reference<?> reference, java.lang.reflect.Method finalizeReferentMethod) {
        reference.clear();
        if (reference == this.frqReference) {
            return false;
        }
        try {
            finalizeReferentMethod.invoke(reference, new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th) {
            logger.log(java.util.logging.Level.SEVERE, "Error cleaning up after reference.", th);
            return true;
        }
    }

    @javax.annotation.CheckForNull
    private java.lang.reflect.Method getFinalizeReferentMethod() {
        java.lang.Class<?> cls = this.finalizableReferenceClassReference.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Field getInheritableThreadLocalsField() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            logger.log(java.util.logging.Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    @javax.annotation.CheckForNull
    private static java.lang.reflect.Constructor<java.lang.Thread> getBigThreadConstructor() {
        try {
            return java.lang.Thread.class.getConstructor(java.lang.ThreadGroup.class, java.lang.Runnable.class, java.lang.String.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}

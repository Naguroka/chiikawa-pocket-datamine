package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class FinalizableWeakReference<T> extends java.lang.ref.WeakReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizableWeakReference(@javax.annotation.CheckForNull T referent, com.google.common.base.FinalizableReferenceQueue queue) {
        super(referent, queue.queue);
        queue.cleanUp();
    }
}

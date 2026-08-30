package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class FinalizableSoftReference<T> extends java.lang.ref.SoftReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizableSoftReference(@javax.annotation.CheckForNull T referent, com.google.common.base.FinalizableReferenceQueue queue) {
        super(referent, queue.queue);
        queue.cleanUp();
    }
}

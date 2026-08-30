package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class FinalizablePhantomReference<T> extends java.lang.ref.PhantomReference<T> implements com.google.common.base.FinalizableReference {
    protected FinalizablePhantomReference(@javax.annotation.CheckForNull T referent, com.google.common.base.FinalizableReferenceQueue queue) {
        super(referent, queue.queue);
        queue.cleanUp();
    }
}

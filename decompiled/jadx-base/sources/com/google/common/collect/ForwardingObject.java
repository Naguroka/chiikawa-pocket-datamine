package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingObject {
    protected abstract java.lang.Object delegate();

    protected ForwardingObject() {
    }

    public java.lang.String toString() {
        return delegate().toString();
    }
}

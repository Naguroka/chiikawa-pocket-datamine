package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class SettableFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
    public static <V> com.google.common.util.concurrent.SettableFuture<V> create() {
        return new com.google.common.util.concurrent.SettableFuture<>();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean set(@com.google.common.util.concurrent.ParametricNullness V value) {
        return super.set(value);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean setException(java.lang.Throwable throwable) {
        return super.setException(throwable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> future) {
        return super.setFuture(future);
    }

    private SettableFuture() {
    }
}

package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use the methods in Futures (like immediateFuture) or SettableFuture")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface ListenableFuture<V> extends java.util.concurrent.Future<V> {
    void addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor);
}

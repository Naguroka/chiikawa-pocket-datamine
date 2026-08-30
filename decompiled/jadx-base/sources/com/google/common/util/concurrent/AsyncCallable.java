package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface AsyncCallable<V> {
    com.google.common.util.concurrent.ListenableFuture<V> call() throws java.lang.Exception;
}

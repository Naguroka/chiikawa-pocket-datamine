package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface AsyncFunction<I, O> {
    com.google.common.util.concurrent.ListenableFuture<O> apply(@com.google.common.util.concurrent.ParametricNullness I input) throws java.lang.Exception;
}

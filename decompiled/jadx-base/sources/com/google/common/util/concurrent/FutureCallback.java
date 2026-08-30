package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable t);

    void onSuccess(@com.google.common.util.concurrent.ParametricNullness V result);
}

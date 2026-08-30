package com.google.firebase.inject;

/* JADX INFO: loaded from: classes5.dex */
public interface Deferred<T> {

    public interface DeferredHandler<T> {
        void handle(com.google.firebase.inject.Provider<T> provider);
    }

    void whenAvailable(com.google.firebase.inject.Deferred.DeferredHandler<T> deferredHandler);
}

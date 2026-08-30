package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public class Lazy<T> implements com.google.firebase.inject.Provider<T> {
    private static final java.lang.Object UNINITIALIZED = new java.lang.Object();
    private volatile java.lang.Object instance;
    private volatile com.google.firebase.inject.Provider<T> provider;

    Lazy(T t) {
        this.instance = UNINITIALIZED;
        this.instance = t;
    }

    public Lazy(com.google.firebase.inject.Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t = (T) this.instance;
        java.lang.Object obj = UNINITIALIZED;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.instance;
                if (t == obj) {
                    t = this.provider.get();
                    this.instance = t;
                    this.provider = null;
                }
            }
        }
        return t;
    }

    boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }
}

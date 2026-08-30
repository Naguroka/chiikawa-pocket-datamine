package com.google.android.datatransport.runtime.dagger.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class InstanceFactory<T> implements com.google.android.datatransport.runtime.dagger.internal.Factory<T>, com.google.android.datatransport.runtime.dagger.Lazy<T> {
    private static final com.google.android.datatransport.runtime.dagger.internal.InstanceFactory<java.lang.Object> NULL_INSTANCE_FACTORY = new com.google.android.datatransport.runtime.dagger.internal.InstanceFactory<>(null);
    private final T instance;

    public static <T> com.google.android.datatransport.runtime.dagger.internal.Factory<T> create(T t) {
        return new com.google.android.datatransport.runtime.dagger.internal.InstanceFactory(com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> com.google.android.datatransport.runtime.dagger.internal.Factory<T> createNullable(T t) {
        if (t == null) {
            return nullInstanceFactory();
        }
        return new com.google.android.datatransport.runtime.dagger.internal.InstanceFactory(t);
    }

    private static <T> com.google.android.datatransport.runtime.dagger.internal.InstanceFactory<T> nullInstanceFactory() {
        return (com.google.android.datatransport.runtime.dagger.internal.InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    private InstanceFactory(T t) {
        this.instance = t;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.instance;
    }
}

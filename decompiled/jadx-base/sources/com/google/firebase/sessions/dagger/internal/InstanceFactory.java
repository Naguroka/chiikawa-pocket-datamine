package com.google.firebase.sessions.dagger.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class InstanceFactory<T> implements com.google.firebase.sessions.dagger.internal.Factory<T>, com.google.firebase.sessions.dagger.Lazy<T> {
    private static final com.google.firebase.sessions.dagger.internal.InstanceFactory<java.lang.Object> NULL_INSTANCE_FACTORY = new com.google.firebase.sessions.dagger.internal.InstanceFactory<>(null);
    private final T instance;

    public static <T> com.google.firebase.sessions.dagger.internal.Factory<T> create(T t) {
        return new com.google.firebase.sessions.dagger.internal.InstanceFactory(com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> com.google.firebase.sessions.dagger.internal.Factory<T> createNullable(T t) {
        if (t == null) {
            return nullInstanceFactory();
        }
        return new com.google.firebase.sessions.dagger.internal.InstanceFactory(t);
    }

    private static <T> com.google.firebase.sessions.dagger.internal.InstanceFactory<T> nullInstanceFactory() {
        return (com.google.firebase.sessions.dagger.internal.InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    private InstanceFactory(T t) {
        this.instance = t;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.instance;
    }
}

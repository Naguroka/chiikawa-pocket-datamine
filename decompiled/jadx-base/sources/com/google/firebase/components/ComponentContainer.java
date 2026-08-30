package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public interface ComponentContainer {
    <T> com.google.firebase.inject.Deferred<T> getDeferred(com.google.firebase.components.Qualified<T> qualified);

    <T> com.google.firebase.inject.Provider<T> getProvider(com.google.firebase.components.Qualified<T> qualified);

    <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(com.google.firebase.components.Qualified<T> qualified);

    default <T> T get(java.lang.Class<T> cls) {
        return (T) get(com.google.firebase.components.Qualified.unqualified(cls));
    }

    default <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> cls) {
        return getProvider(com.google.firebase.components.Qualified.unqualified(cls));
    }

    default <T> com.google.firebase.inject.Deferred<T> getDeferred(java.lang.Class<T> cls) {
        return getDeferred(com.google.firebase.components.Qualified.unqualified(cls));
    }

    default <T> java.util.Set<T> setOf(java.lang.Class<T> cls) {
        return setOf(com.google.firebase.components.Qualified.unqualified(cls));
    }

    default <T> com.google.firebase.inject.Provider<java.util.Set<T>> setOfProvider(java.lang.Class<T> cls) {
        return setOfProvider(com.google.firebase.components.Qualified.unqualified(cls));
    }

    default <T> T get(com.google.firebase.components.Qualified<T> qualified) {
        com.google.firebase.inject.Provider<T> provider = getProvider(qualified);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    default <T> java.util.Set<T> setOf(com.google.firebase.components.Qualified<T> qualified) {
        return setOfProvider(qualified).get();
    }
}

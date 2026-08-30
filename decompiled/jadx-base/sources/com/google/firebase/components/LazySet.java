package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
class LazySet<T> implements com.google.firebase.inject.Provider<java.util.Set<T>> {
    private volatile java.util.Set<T> actualSet = null;
    private volatile java.util.Set<com.google.firebase.inject.Provider<T>> providers = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    LazySet(java.util.Collection<com.google.firebase.inject.Provider<T>> collection) {
        this.providers.addAll(collection);
    }

    static com.google.firebase.components.LazySet<?> fromCollection(java.util.Collection<com.google.firebase.inject.Provider<?>> collection) {
        return new com.google.firebase.components.LazySet<>((java.util.Set) collection);
    }

    @Override // com.google.firebase.inject.Provider
    public java.util.Set<T> get() {
        if (this.actualSet == null) {
            synchronized (this) {
                if (this.actualSet == null) {
                    this.actualSet = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
                    updateSet();
                }
            }
        }
        return java.util.Collections.unmodifiableSet(this.actualSet);
    }

    synchronized void add(com.google.firebase.inject.Provider<T> provider) {
        if (this.actualSet == null) {
            this.providers.add(provider);
        } else {
            this.actualSet.add(provider.get());
        }
    }

    private synchronized void updateSet() {
        java.util.Iterator<com.google.firebase.inject.Provider<T>> it = this.providers.iterator();
        while (it.hasNext()) {
            this.actualSet.add(it.next().get());
        }
        this.providers = null;
    }
}

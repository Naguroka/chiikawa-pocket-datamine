package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class MutableTypeToInstanceMap<B> extends com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>, B> implements com.google.common.reflect.TypeToInstanceMap<B> {
    private final java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> backingMap = com.google.common.collect.Maps.newHashMap();

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T getInstance(java.lang.Class<T> cls) {
        return (T) trustedGet(com.google.common.reflect.TypeToken.of((java.lang.Class) cls));
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> typeToken) {
        return (T) trustedGet(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T putInstance(java.lang.Class<T> cls, @com.google.common.reflect.ParametricNullness T t) {
        return (T) trustedPut(com.google.common.reflect.TypeToken.of((java.lang.Class) cls), t);
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> typeToken, @com.google.common.reflect.ParametricNullness T t) {
        return (T) trustedPut(typeToken.rejectTypeVariables(), t);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public B put(com.google.common.reflect.TypeToken<? extends B> key, @com.google.common.reflect.ParametricNullness B value) {
        throw new java.lang.UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @java.lang.Deprecated
    public void putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>, ? extends B> map) {
        throw new java.lang.UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<com.google.common.reflect.TypeToken<? extends B>, B>> entrySet() {
        return com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.transformEntries(super.entrySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> delegate() {
        return this.backingMap;
    }

    @javax.annotation.CheckForNull
    private <T extends B> T trustedPut(com.google.common.reflect.TypeToken<T> typeToken, @com.google.common.reflect.ParametricNullness T t) {
        return this.backingMap.put(typeToken, t);
    }

    @javax.annotation.CheckForNull
    private <T extends B> T trustedGet(com.google.common.reflect.TypeToken<T> typeToken) {
        return this.backingMap.get(typeToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class UnmodifiableEntry<K, V> extends com.google.common.collect.ForwardingMapEntry<K, V> {
        private final java.util.Map.Entry<K, V> delegate;

        public static /* synthetic */ com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry $r8$lambda$12WO2KxIwAy1IhqjHhPWXgv0Osg(java.util.Map.Entry entry) {
            return new com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry(entry);
        }

        static <K, V> java.util.Set<java.util.Map.Entry<K, V>> transformEntries(final java.util.Set<java.util.Map.Entry<K, V>> entries) {
            return new com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>>() { // from class: com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
                public java.util.Set<java.util.Map.Entry<K, V>> delegate() {
                    return entries;
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.transformEntries(super.iterator());
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public java.lang.Object[] toArray() {
                    return standardToArray();
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public <T> T[] toArray(T[] tArr) {
                    return (T[]) standardToArray(tArr);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> transformEntries(java.util.Iterator<java.util.Map.Entry<K, V>> entries) {
            return com.google.common.collect.Iterators.transform(entries, new com.google.common.base.Function() { // from class: com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.$r8$lambda$12WO2KxIwAy1IhqjHhPWXgv0Osg((java.util.Map.Entry) obj);
                }
            });
        }

        private UnmodifiableEntry(java.util.Map.Entry<K, V> delegate) {
            this.delegate = (java.util.Map.Entry) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public java.util.Map.Entry<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        @com.google.common.reflect.ParametricNullness
        public V setValue(@com.google.common.reflect.ParametricNullness V value) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}

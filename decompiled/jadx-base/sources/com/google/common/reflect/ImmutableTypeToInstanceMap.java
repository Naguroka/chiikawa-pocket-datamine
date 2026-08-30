package com.google.common.reflect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.reflect.ElementTypesAreNonnullByDefault
public final class ImmutableTypeToInstanceMap<B> extends com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>, B> implements com.google.common.reflect.TypeToInstanceMap<B> {
    private final com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> delegate;

    public static <B> com.google.common.reflect.ImmutableTypeToInstanceMap<B> of() {
        return new com.google.common.reflect.ImmutableTypeToInstanceMap<>(com.google.common.collect.ImmutableMap.of());
    }

    public static <B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> builder() {
        return new com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<>();
    }

    public static final class Builder<B> {
        private final com.google.common.collect.ImmutableMap.Builder<com.google.common.reflect.TypeToken<? extends B>, B> mapBuilder;

        private Builder() {
            this.mapBuilder = com.google.common.collect.ImmutableMap.builder();
        }

        public <T extends B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> put(java.lang.Class<T> key, T value) {
            this.mapBuilder.put(com.google.common.reflect.TypeToken.of((java.lang.Class) key), value);
            return this;
        }

        public <T extends B> com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B> put(com.google.common.reflect.TypeToken<T> key, T value) {
            this.mapBuilder.put(key.rejectTypeVariables(), value);
            return this;
        }

        public com.google.common.reflect.ImmutableTypeToInstanceMap<B> build() {
            return new com.google.common.reflect.ImmutableTypeToInstanceMap<>(this.mapBuilder.buildOrThrow());
        }
    }

    private ImmutableTypeToInstanceMap(com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>, B> delegate) {
        this.delegate = delegate;
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> typeToken) {
        return (T) trustedGet(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T getInstance(java.lang.Class<T> cls) {
        return (T) trustedGet(com.google.common.reflect.TypeToken.of((java.lang.Class) cls));
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> type, T value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public <T extends B> T putInstance(java.lang.Class<T> type, T value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public B put(com.google.common.reflect.TypeToken<? extends B> key, B value) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @java.lang.Deprecated
    public void putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>, ? extends B> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> delegate() {
        return this.delegate;
    }

    @javax.annotation.CheckForNull
    private <T extends B> T trustedGet(com.google.common.reflect.TypeToken<T> typeToken) {
        return this.delegate.get(typeToken);
    }
}

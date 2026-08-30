package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable(containerOf = {"B"})
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class ImmutableClassToInstanceMap<B> extends com.google.common.collect.ForwardingMap<java.lang.Class<? extends B>, B> implements com.google.common.collect.ClassToInstanceMap<B>, java.io.Serializable {
    private static final com.google.common.collect.ImmutableClassToInstanceMap<java.lang.Object> EMPTY = new com.google.common.collect.ImmutableClassToInstanceMap<>(com.google.common.collect.ImmutableMap.of());
    private final com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> delegate;

    public static <B> com.google.common.collect.ImmutableClassToInstanceMap<B> of() {
        return (com.google.common.collect.ImmutableClassToInstanceMap<B>) EMPTY;
    }

    public static <B, T extends B> com.google.common.collect.ImmutableClassToInstanceMap<B> of(java.lang.Class<T> type, T value) {
        return new com.google.common.collect.ImmutableClassToInstanceMap<>(com.google.common.collect.ImmutableMap.of(type, value));
    }

    public static <B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> builder() {
        return new com.google.common.collect.ImmutableClassToInstanceMap.Builder<>();
    }

    public static final class Builder<B> {
        private final com.google.common.collect.ImmutableMap.Builder<java.lang.Class<? extends B>, B> mapBuilder = com.google.common.collect.ImmutableMap.builder();

        public <T extends B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> put(java.lang.Class<T> key, T value) {
            this.mapBuilder.put(key, value);
            return this;
        }

        public <T extends B> com.google.common.collect.ImmutableClassToInstanceMap.Builder<B> putAll(java.util.Map<? extends java.lang.Class<? extends T>, ? extends T> map) {
            for (java.util.Map.Entry<? extends java.lang.Class<? extends T>, ? extends T> entry : map.entrySet()) {
                java.lang.Class key = entry.getKey();
                T value = entry.getValue();
                this.mapBuilder.put((java.lang.Class<? extends B>) key, (B) cast(key, value));
            }
            return this;
        }

        private static <T> T cast(java.lang.Class<T> cls, java.lang.Object obj) {
            return (T) com.google.common.primitives.Primitives.wrap(cls).cast(obj);
        }

        public com.google.common.collect.ImmutableClassToInstanceMap<B> build() {
            com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> immutableMapBuildOrThrow = this.mapBuilder.buildOrThrow();
            if (immutableMapBuildOrThrow.isEmpty()) {
                return com.google.common.collect.ImmutableClassToInstanceMap.of();
            }
            return new com.google.common.collect.ImmutableClassToInstanceMap<>(immutableMapBuildOrThrow);
        }
    }

    public static <B, S extends B> com.google.common.collect.ImmutableClassToInstanceMap<B> copyOf(java.util.Map<? extends java.lang.Class<? extends S>, ? extends S> map) {
        if (map instanceof com.google.common.collect.ImmutableClassToInstanceMap) {
            return (com.google.common.collect.ImmutableClassToInstanceMap) map;
        }
        return new com.google.common.collect.ImmutableClassToInstanceMap.Builder().putAll(map).build();
    }

    private ImmutableClassToInstanceMap(com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>, B> delegate) {
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public java.util.Map<java.lang.Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T getInstance(java.lang.Class<T> cls) {
        return this.delegate.get(com.google.common.base.Preconditions.checkNotNull(cls));
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public <T extends B> T putInstance(java.lang.Class<T> type, T value) {
        throw new java.lang.UnsupportedOperationException();
    }

    java.lang.Object readResolve() {
        return isEmpty() ? of() : this;
    }
}

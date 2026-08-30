package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class EnumBiMap<K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> extends com.google.common.collect.AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    transient java.lang.Class<K> keyTypeOrObjectUnderJ2cl;
    transient java.lang.Class<V> valueTypeOrObjectUnderJ2cl;

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object forcePut(@com.google.common.collect.ParametricNullness java.lang.Object key, @com.google.common.collect.ParametricNullness java.lang.Object value) {
        return super.forcePut(key, value);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object put(@com.google.common.collect.ParametricNullness java.lang.Object key, @com.google.common.collect.ParametricNullness java.lang.Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ void putAll(java.util.Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ java.lang.Object remove(@javax.annotation.CheckForNull java.lang.Object key) {
        return super.remove(key);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ java.util.Set values() {
        return super.values();
    }

    public static <K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> com.google.common.collect.EnumBiMap<K, V> create(java.lang.Class<K> keyType, java.lang.Class<V> valueType) {
        return new com.google.common.collect.EnumBiMap<>(keyType, valueType);
    }

    public static <K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> com.google.common.collect.EnumBiMap<K, V> create(java.util.Map<K, V> map) {
        com.google.common.collect.EnumBiMap<K, V> enumBiMapCreate = create(inferKeyTypeOrObjectUnderJ2cl(map), inferValueTypeOrObjectUnderJ2cl(map));
        enumBiMapCreate.putAll(map);
        return enumBiMapCreate;
    }

    private EnumBiMap(java.lang.Class<K> keyTypeOrObjectUnderJ2cl, java.lang.Class<V> valueTypeOrObjectUnderJ2cl) {
        super(new java.util.EnumMap(keyTypeOrObjectUnderJ2cl), new java.util.EnumMap(valueTypeOrObjectUnderJ2cl));
        this.keyTypeOrObjectUnderJ2cl = keyTypeOrObjectUnderJ2cl;
        this.valueTypeOrObjectUnderJ2cl = valueTypeOrObjectUnderJ2cl;
    }

    static <K extends java.lang.Enum<K>> java.lang.Class<K> inferKeyTypeOrObjectUnderJ2cl(java.util.Map<K, ?> map) {
        if (map instanceof com.google.common.collect.EnumBiMap) {
            return ((com.google.common.collect.EnumBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        if (map instanceof com.google.common.collect.EnumHashBiMap) {
            return ((com.google.common.collect.EnumHashBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        com.google.common.base.Preconditions.checkArgument(!map.isEmpty());
        return com.google.common.collect.Platform.getDeclaringClassOrObjectForJ2cl(map.keySet().iterator().next());
    }

    private static <V extends java.lang.Enum<V>> java.lang.Class<V> inferValueTypeOrObjectUnderJ2cl(java.util.Map<?, V> map) {
        if (map instanceof com.google.common.collect.EnumBiMap) {
            return ((com.google.common.collect.EnumBiMap) map).valueTypeOrObjectUnderJ2cl;
        }
        com.google.common.base.Preconditions.checkArgument(!map.isEmpty());
        return com.google.common.collect.Platform.getDeclaringClassOrObjectForJ2cl(map.values().iterator().next());
    }

    public java.lang.Class<K> keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    public java.lang.Class<V> valueType() {
        return this.valueTypeOrObjectUnderJ2cl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public K checkKey(K key) {
        return (K) com.google.common.base.Preconditions.checkNotNull(key);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public V checkValue(V value) {
        return (V) com.google.common.base.Preconditions.checkNotNull(value);
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        stream.writeObject(this.valueTypeOrObjectUnderJ2cl);
        com.google.common.collect.Serialization.writeMap(this, stream);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        this.keyTypeOrObjectUnderJ2cl = (java.lang.Class) java.util.Objects.requireNonNull(stream.readObject());
        this.valueTypeOrObjectUnderJ2cl = (java.lang.Class) java.util.Objects.requireNonNull(stream.readObject());
        setDelegates(new java.util.EnumMap(this.keyTypeOrObjectUnderJ2cl), new java.util.EnumMap(this.valueTypeOrObjectUnderJ2cl));
        com.google.common.collect.Serialization.populateMap(this, stream);
    }
}

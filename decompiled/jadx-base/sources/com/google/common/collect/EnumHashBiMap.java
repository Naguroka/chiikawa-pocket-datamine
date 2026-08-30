package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class EnumHashBiMap<K extends java.lang.Enum<K>, V> extends com.google.common.collect.AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    transient java.lang.Class<K> keyTypeOrObjectUnderJ2cl;

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

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
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

    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.EnumHashBiMap<K, V> create(java.lang.Class<K> keyType) {
        return new com.google.common.collect.EnumHashBiMap<>(keyType);
    }

    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.EnumHashBiMap<K, V> create(java.util.Map<K, ? extends V> map) {
        com.google.common.collect.EnumHashBiMap<K, V> enumHashBiMapCreate = create(com.google.common.collect.EnumBiMap.inferKeyTypeOrObjectUnderJ2cl(map));
        enumHashBiMapCreate.putAll(map);
        return enumHashBiMapCreate;
    }

    private EnumHashBiMap(java.lang.Class<K> keyType) {
        super(new java.util.EnumMap(keyType), new java.util.HashMap());
        this.keyTypeOrObjectUnderJ2cl = keyType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public K checkKey(K key) {
        return (K) com.google.common.base.Preconditions.checkNotNull(key);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public V put(K k, @com.google.common.collect.ParametricNullness V v) {
        return (V) super.put(k, (java.lang.Object) v);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public V forcePut(K k, @com.google.common.collect.ParametricNullness V v) {
        return (V) super.forcePut(k, (java.lang.Object) v);
    }

    public java.lang.Class<K> keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        com.google.common.collect.Serialization.writeMap(this, stream);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        this.keyTypeOrObjectUnderJ2cl = (java.lang.Class) java.util.Objects.requireNonNull(stream.readObject());
        setDelegates(new java.util.EnumMap(this.keyTypeOrObjectUnderJ2cl), new java.util.HashMap());
        com.google.common.collect.Serialization.populateMap(this, stream);
    }
}

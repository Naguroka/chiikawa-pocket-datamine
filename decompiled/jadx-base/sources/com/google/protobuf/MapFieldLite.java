package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class MapFieldLite<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.protobuf.MapFieldLite<?, ?> EMPTY_MAP_FIELD;
    private boolean isMutable;

    private MapFieldLite() {
        this.isMutable = true;
    }

    private MapFieldLite(java.util.Map<K, V> map) {
        super(map);
        this.isMutable = true;
    }

    static {
        com.google.protobuf.MapFieldLite<?, ?> mapFieldLite = new com.google.protobuf.MapFieldLite<>();
        EMPTY_MAP_FIELD = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    public static <K, V> com.google.protobuf.MapFieldLite<K, V> emptyMapField() {
        return (com.google.protobuf.MapFieldLite<K, V>) EMPTY_MAP_FIELD;
    }

    public void mergeFrom(com.google.protobuf.MapFieldLite<K, V> mapFieldLite) {
        ensureMutable();
        if (mapFieldLite.isEmpty()) {
            return;
        }
        putAll(mapFieldLite);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        ensureMutable();
        com.google.protobuf.Internal.checkNotNull(k);
        com.google.protobuf.Internal.checkNotNull(v);
        return (V) super.put(k, v);
    }

    public V put(java.util.Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        ensureMutable();
        checkForNullKeysAndValues(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    private static void checkForNullKeysAndValues(java.util.Map<?, ?> map) {
        for (java.lang.Object obj : map.keySet()) {
            com.google.protobuf.Internal.checkNotNull(obj);
            com.google.protobuf.Internal.checkNotNull(map.get(obj));
        }
    }

    private static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return java.util.Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    static <K, V> boolean equals(java.util.Map<K, V> map, java.util.Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && equals((java.util.Map) this, (java.util.Map) obj);
    }

    private static int calculateHashCodeForObject(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.protobuf.Internal.hashCode((byte[]) obj);
        }
        if (obj instanceof com.google.protobuf.Internal.EnumLite) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    static <K, V> int calculateHashCodeForMap(java.util.Map<K, V> map) {
        int iCalculateHashCodeForObject = 0;
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            iCalculateHashCodeForObject += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return iCalculateHashCodeForObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    private static java.lang.Object copy(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> java.util.Map<K, V> copy(java.util.Map<K, V> map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    public com.google.protobuf.MapFieldLite<K, V> mutableCopy() {
        return isEmpty() ? new com.google.protobuf.MapFieldLite<>() : new com.google.protobuf.MapFieldLite<>(this);
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    private void ensureMutable() {
        if (!isMutable()) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}

package androidx.arch.core.internal;

/* JADX INFO: loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends androidx.arch.core.internal.SafeIterableMap<K, V> {
    private final java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap.Entry<K, V>> mHashMap = new java.util.HashMap<>();

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected androidx.arch.core.internal.SafeIterableMap.Entry<K, V> get(K k) {
        return this.mHashMap.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(K k, V v) {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = get(k);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k, put(k, v));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.mHashMap.remove(k);
        return v;
    }

    public boolean contains(K k) {
        return this.mHashMap.containsKey(k);
    }

    public java.util.Map.Entry<K, V> ceil(K k) {
        if (contains(k)) {
            return this.mHashMap.get(k).mPrevious;
        }
        return null;
    }
}

package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
class zzmi<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private boolean zzot;
    private final int zzvd;
    private java.util.List<com.google.android.gms.internal.drive.zzmp> zzve;
    private java.util.Map<K, V> zzvf;
    private volatile com.google.android.gms.internal.drive.zzmr zzvg;
    private java.util.Map<K, V> zzvh;
    private volatile com.google.android.gms.internal.drive.zzml zzvi;

    static <FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>> com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object> zzav(int i) {
        return new com.google.android.gms.internal.drive.zzmj(i);
    }

    private zzmi(int i) {
        this.zzvd = i;
        this.zzve = java.util.Collections.emptyList();
        this.zzvf = java.util.Collections.emptyMap();
        this.zzvh = java.util.Collections.emptyMap();
    }

    public void zzbp() {
        java.util.Map<K, V> mapUnmodifiableMap;
        java.util.Map<K, V> mapUnmodifiableMap2;
        if (this.zzot) {
            return;
        }
        if (this.zzvf.isEmpty()) {
            mapUnmodifiableMap = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap = java.util.Collections.unmodifiableMap(this.zzvf);
        }
        this.zzvf = mapUnmodifiableMap;
        if (this.zzvh.isEmpty()) {
            mapUnmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = java.util.Collections.unmodifiableMap(this.zzvh);
        }
        this.zzvh = mapUnmodifiableMap2;
        this.zzot = true;
    }

    public final boolean isImmutable() {
        return this.zzot;
    }

    public final int zzer() {
        return this.zzve.size();
    }

    public final java.util.Map.Entry<K, V> zzaw(int i) {
        return this.zzve.get(i);
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzes() {
        if (this.zzvf.isEmpty()) {
            return com.google.android.gms.internal.drive.zzmm.zzex();
        }
        return this.zzvf.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzve.size() + this.zzvf.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza(comparable) >= 0 || this.zzvf.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return (V) this.zzve.get(iZza).getValue();
        }
        return this.zzvf.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        zzeu();
        int iZza = zza(k);
        if (iZza >= 0) {
            return (V) this.zzve.get(iZza).setValue(v);
        }
        zzeu();
        if (this.zzve.isEmpty() && !(this.zzve instanceof java.util.ArrayList)) {
            this.zzve = new java.util.ArrayList(this.zzvd);
        }
        int i = -(iZza + 1);
        if (i >= this.zzvd) {
            return zzev().put(k, v);
        }
        int size = this.zzve.size();
        int i2 = this.zzvd;
        if (size == i2) {
            com.google.android.gms.internal.drive.zzmp zzmpVarRemove = this.zzve.remove(i2 - 1);
            zzev().put((java.lang.Comparable) zzmpVarRemove.getKey(), zzmpVarRemove.getValue());
        }
        this.zzve.add(i, new com.google.android.gms.internal.drive.zzmp(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzeu();
        if (!this.zzve.isEmpty()) {
            this.zzve.clear();
        }
        if (this.zzvf.isEmpty()) {
            return;
        }
        this.zzvf.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        zzeu();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzax(iZza);
        }
        if (this.zzvf.isEmpty()) {
            return null;
        }
        return this.zzvf.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzax(int i) {
        zzeu();
        V v = (V) this.zzve.remove(i).getValue();
        if (!this.zzvf.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzev().entrySet().iterator();
            this.zzve.add(new com.google.android.gms.internal.drive.zzmp(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzve.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((java.lang.Comparable) this.zzve.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo((java.lang.Comparable) this.zzve.get(i2).getKey());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.zzvg == null) {
            this.zzvg = new com.google.android.gms.internal.drive.zzmr(this, null);
        }
        return this.zzvg;
    }

    final java.util.Set<java.util.Map.Entry<K, V>> zzet() {
        if (this.zzvi == null) {
            this.zzvi = new com.google.android.gms.internal.drive.zzml(this, null);
        }
        return this.zzvi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzeu() {
        if (this.zzot) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap<K, V> zzev() {
        zzeu();
        if (this.zzvf.isEmpty() && !(this.zzvf instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzvf = treeMap;
            this.zzvh = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzvf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzmi)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.drive.zzmi zzmiVar = (com.google.android.gms.internal.drive.zzmi) obj;
        int size = size();
        if (size != zzmiVar.size()) {
            return false;
        }
        int iZzer = zzer();
        if (iZzer != zzmiVar.zzer()) {
            return entrySet().equals(zzmiVar.entrySet());
        }
        for (int i = 0; i < iZzer; i++) {
            if (!zzaw(i).equals(zzmiVar.zzaw(i))) {
                return false;
            }
        }
        if (iZzer != size) {
            return this.zzvf.equals(zzmiVar.zzvf);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzer = zzer();
        int iHashCode = 0;
        for (int i = 0; i < iZzer; i++) {
            iHashCode += this.zzve.get(i).hashCode();
        }
        return this.zzvf.size() > 0 ? iHashCode + this.zzvf.hashCode() : iHashCode;
    }

    /* synthetic */ zzmi(int i, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(i);
    }
}

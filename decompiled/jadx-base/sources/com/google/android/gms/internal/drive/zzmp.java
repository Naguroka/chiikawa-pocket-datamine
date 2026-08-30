package com.google.android.gms.internal.drive;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes3.dex */
final class zzmp<K, V> implements java.lang.Comparable<com.google.android.gms.internal.drive.zzmp>, java.util.Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;

    /* JADX INFO: Incorrect field signature: TK; */
    private final java.lang.Comparable zzvn;

    zzmp(com.google.android.gms.internal.drive.zzmi zzmiVar, java.util.Map.Entry<K, V> entry) {
        this(zzmiVar, (java.lang.Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    zzmp(com.google.android.gms.internal.drive.zzmi zzmiVar, K k, V v) {
        this.zzvk = zzmiVar;
        this.zzvn = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzvk.zzeu();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return equals(this.zzvn, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.zzvn;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.value;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzvn);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.value);
        return new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 1 + java.lang.String.valueOf(strValueOf2).length()).append(strValueOf).append(com.ironsource.y8.i.b).append(strValueOf2).toString();
    }

    private static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.zzvn;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.google.android.gms.internal.drive.zzmp zzmpVar) {
        return ((java.lang.Comparable) getKey()).compareTo((java.lang.Comparable) zzmpVar.getKey());
    }
}

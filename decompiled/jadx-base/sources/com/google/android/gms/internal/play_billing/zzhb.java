package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhb extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzhd zza;

    /* synthetic */ zzhb(com.google.android.gms.internal.play_billing.zzhd zzhdVar, com.google.android.gms.internal.play_billing.zzhc zzhcVar) {
        java.util.Objects.requireNonNull(zzhdVar);
        this.zza = zzhdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.zza.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_billing.zzha(this.zza, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zza.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}

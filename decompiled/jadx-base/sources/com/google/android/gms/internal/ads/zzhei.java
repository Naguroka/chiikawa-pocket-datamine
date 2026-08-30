package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhei extends java.util.AbstractList {
    private static final com.google.android.gms.internal.ads.zzhej zzc = com.google.android.gms.internal.ads.zzhej.zzb(com.google.android.gms.internal.ads.zzhei.class);
    final java.util.List zza;
    final java.util.Iterator zzb;

    public zzhei(java.util.List list, java.util.Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        if (this.zza.size() > i) {
            return this.zza.get(i);
        }
        if (!this.zzb.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.zza.add(this.zzb.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzheh(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        com.google.android.gms.internal.ads.zzhej zzhejVar = zzc;
        zzhejVar.zza("potentially expensive size() call");
        zzhejVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}

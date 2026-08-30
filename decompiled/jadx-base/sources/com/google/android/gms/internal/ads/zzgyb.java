package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgyb extends java.util.AbstractList {
    private final com.google.android.gms.internal.ads.zzgxz zza;
    private final com.google.android.gms.internal.ads.zzgya zzb;

    public zzgyb(com.google.android.gms.internal.ads.zzgxz zzgxzVar, com.google.android.gms.internal.ads.zzgya zzgyaVar) {
        this.zza = zzgxzVar;
        this.zzb = zzgyaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        return this.zzb.zzb(this.zza.zzd(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfza extends com.google.android.gms.internal.ads.zzfxn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzb zza;

    zzfza(com.google.android.gms.internal.ads.zzfzb zzfzbVar) {
        this.zza = zzfzbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        com.google.android.gms.internal.ads.zzfun.zza(i, this.zza.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        int i2 = i + i;
        return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(this.zza.zzb[i2]), java.util.Objects.requireNonNull(this.zza.zzb[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    public final boolean zzf() {
        return true;
    }
}

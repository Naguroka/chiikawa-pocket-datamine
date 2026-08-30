package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzd extends com.google.android.gms.internal.ads.zzfxn {
    private final transient java.lang.Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzfzd(java.lang.Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.ads.zzfun.zza(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.util.Objects.requireNonNull(this.zza[i + i + this.zzb]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }
}

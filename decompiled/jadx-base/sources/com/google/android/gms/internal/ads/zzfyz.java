package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfyz extends com.google.android.gms.internal.ads.zzfxn {
    static final com.google.android.gms.internal.ads.zzfxn zza = new com.google.android.gms.internal.ads.zzfyz(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzfyz(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.ads.zzfun.zza(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxn, com.google.android.gms.internal.ads.zzfxi
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final java.lang.Object[] zzg() {
        return this.zzb;
    }
}

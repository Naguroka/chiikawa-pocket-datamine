package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfxm extends com.google.android.gms.internal.ads.zzfxn {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfxn zzc;

    zzfxm(com.google.android.gms.internal.ads.zzfxn zzfxnVar, int i, int i2) {
        this.zzc = zzfxnVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.ads.zzfun.zza(i, this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxn, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    @javax.annotation.CheckForNull
    final java.lang.Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfxn
    /* JADX INFO: renamed from: zzh */
    public final com.google.android.gms.internal.ads.zzfxn subList(int i, int i2) {
        com.google.android.gms.internal.ads.zzfun.zzk(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}

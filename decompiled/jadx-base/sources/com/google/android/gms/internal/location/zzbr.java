package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbr extends com.google.android.gms.internal.location.zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.location.zzbs zzc;

    zzbr(com.google.android.gms.internal.location.zzbs zzbsVar, int i, int i2) {
        this.zzc = zzbsVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.location.zzbm.zza(i, this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final java.lang.Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs
    /* JADX INFO: renamed from: zzh */
    public final com.google.android.gms.internal.location.zzbs subList(int i, int i2) {
        com.google.android.gms.internal.location.zzbm.zzc(i, i2, this.zzb);
        com.google.android.gms.internal.location.zzbs zzbsVar = this.zzc;
        int i3 = this.zza;
        return zzbsVar.subList(i + i3, i2 + i3);
    }
}

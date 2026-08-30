package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfkk extends com.google.android.gms.internal.ads.zzbwv {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgdb zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbwp zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkl zzc;

    zzfkk(com.google.android.gms.internal.ads.zzfkl zzfklVar, com.google.android.gms.internal.ads.zzgdb zzgdbVar, com.google.android.gms.internal.ads.zzbwp zzbwpVar) {
        this.zza = zzgdbVar;
        this.zzb = zzbwpVar;
        this.zzc = zzfklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load rewarded ad with error: " + zzeVar.zzb().toString() + ", adUnitId: " + this.zzc.zze.zza);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        com.google.android.gms.internal.ads.zzfjd.zza(this.zzb, this.zza);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfje extends com.google.android.gms.internal.ads.zzbaf {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgdb zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfjf zzc;

    zzfje(com.google.android.gms.internal.ads.zzfjf zzfjfVar, com.google.android.gms.internal.ads.zzgdb zzgdbVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzgdbVar;
        this.zzb = zzftVar;
        this.zzc = zzfjfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad with error parcel: " + zzeVar.zzb().toString() + " for ad unit: " + this.zzb.zza);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzd(com.google.android.gms.internal.ads.zzbad zzbadVar) {
        com.google.android.gms.internal.ads.zzfjd.zza(zzbadVar, this.zza);
    }
}

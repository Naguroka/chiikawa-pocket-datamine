package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfjh extends com.google.android.gms.ads.internal.client.zzbn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgdb zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfji zzc;

    zzfjh(com.google.android.gms.internal.ads.zzfji zzfjiVar, com.google.android.gms.internal.ads.zzgdb zzgdbVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = zzgdbVar;
        this.zzb = zzbyVar;
        this.zzc = zzfjiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad with error: " + zzeVar.zzb().toString() + " for ad unit: " + this.zzc.zze.zza);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        com.google.android.gms.internal.ads.zzfjd.zza(this.zzb, this.zza);
    }
}

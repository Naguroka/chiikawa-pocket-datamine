package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbzc implements java.lang.Runnable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zzb;

    zzbzc(com.google.android.gms.internal.ads.zzbzd zzbzdVar, android.content.Context context, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = context;
        this.zzb = zzcabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException | com.google.android.gms.common.GooglePlayServicesRepairableException | java.io.IOException | java.lang.IllegalStateException e) {
            this.zzb.zzd(e);
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception while getting advertising Id info", e);
        }
    }
}

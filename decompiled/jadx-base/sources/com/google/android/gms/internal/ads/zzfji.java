package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfji extends com.google.android.gms.internal.ads.zzfkh {
    public zzfji(com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzbpe zzbpeVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfjg zzfjgVar, com.google.android.gms.common.util.Clock clock) {
        super(clientApi, context, i, zzbpeVar, zzftVar, zzcfVar, scheduledExecutorService, zzfjgVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    protected final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzgdb zzgdbVarZze = com.google.android.gms.internal.ads.zzgdb.zze();
        com.google.android.gms.ads.internal.client.zzby zzbyVarZze = this.zza.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), new com.google.android.gms.ads.internal.client.zzs(), this.zze.zza, this.zzd, this.zzc);
        if (zzbyVarZze != null) {
            try {
                zzbyVarZze.zzy(this.zze.zzc, new com.google.android.gms.internal.ads.zzfjh(this, zzgdbVarZze, zzbyVarZze));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to load interstitial ad.", e);
                zzgdbVarZze.zzd(new com.google.android.gms.internal.ads.zzfjc(1, "remote exception"));
            }
        } else {
            zzgdbVarZze.zzd(new com.google.android.gms.internal.ads.zzfjc(1, "Failed to create an interstitial ad manager."));
        }
        return zzgdbVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    protected final /* bridge */ /* synthetic */ java.util.Optional zzb(java.lang.Object obj) {
        try {
            return java.util.Optional.ofNullable(((com.google.android.gms.ads.internal.client.zzby) obj).zzk());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for  the interstitial ad.", e);
            return java.util.Optional.empty();
        }
    }
}

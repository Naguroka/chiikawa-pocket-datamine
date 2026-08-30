package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfkl extends com.google.android.gms.internal.ads.zzfkh {
    public zzfkl(com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzbpe zzbpeVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfjg zzfjgVar, com.google.android.gms.common.util.Clock clock) {
        super(clientApi, context, i, zzbpeVar, zzftVar, zzcfVar, scheduledExecutorService, zzfjgVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    protected final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzgdb zzgdbVarZze = com.google.android.gms.internal.ads.zzgdb.zze();
        com.google.android.gms.internal.ads.zzbwp zzbwpVarZzp = this.zza.zzp(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), this.zze.zza, this.zzd, this.zzc);
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = new com.google.android.gms.internal.ads.zzfkk(this, zzgdbVarZze, zzbwpVarZzp);
        if (zzbwpVarZzp != null) {
            try {
                zzbwpVarZzp.zzf(this.zze.zzc, zzfkkVar);
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load rewarded ad.");
                zzgdbVarZze.zzd(new com.google.android.gms.internal.ads.zzfjc(1, "remote exception"));
            }
        } else {
            zzgdbVarZze.zzd(new com.google.android.gms.internal.ads.zzfjc(1, "Failed to create a rewarded ad."));
        }
        return zzgdbVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    protected final /* bridge */ /* synthetic */ java.util.Optional zzb(java.lang.Object obj) {
        try {
            return java.util.Optional.ofNullable(((com.google.android.gms.internal.ads.zzbwp) obj).zzc());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the rewarded ad.", e);
            return java.util.Optional.empty();
        }
    }
}

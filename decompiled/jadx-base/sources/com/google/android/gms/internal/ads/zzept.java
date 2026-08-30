package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzept implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;

    public zzept(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzfxs zzfxsVarZzn;
        com.google.android.gms.internal.ads.zzeol zzeolVarZza = com.google.android.gms.internal.ads.zzeon.zza();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.zza.zzb();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeg)).booleanValue()) {
            zzfxsVarZzn = com.google.android.gms.internal.ads.zzfxs.zzo(new com.google.android.gms.internal.ads.zzesd(zzeolVarZza, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeh)).intValue(), scheduledExecutorService));
        } else {
            zzfxsVarZzn = com.google.android.gms.internal.ads.zzfxs.zzn();
        }
        com.google.android.gms.internal.ads.zzhez.zzb(zzfxsVarZzn);
        return zzfxsVarZzn;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdrw {
    private final com.google.android.gms.internal.ads.zzdsb zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.Map zzc;

    public zzdrw(com.google.android.gms.internal.ads.zzdsb zzdsbVar, java.util.concurrent.Executor executor) {
        this.zza = zzdsbVar;
        this.zzc = zzdsbVar.zza();
        this.zzb = executor;
    }

    public final com.google.android.gms.internal.ads.zzdrv zza() {
        com.google.android.gms.internal.ads.zzdrv zzdrvVar = new com.google.android.gms.internal.ads.zzdrv(this);
        com.google.android.gms.internal.ads.zzdrv.zza(zzdrvVar);
        return zzdrvVar;
    }

    public final void zze() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlw)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = zza();
            zzdrvVarZza.zzb("action", "pecr");
            zzdrvVarZza.zzg();
        }
    }
}

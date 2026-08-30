package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class zzcai {
    private final com.google.android.gms.internal.ads.zzcab zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;

    public zzcai() {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        this.zza = zzcabVar;
        this.zzb = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.internal.ads.zzgch.zzr(zzcabVar, new com.google.android.gms.internal.ads.zzcag(this), com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    @java.lang.Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @java.lang.Deprecated
    public final void zzg() {
        this.zza.zzd(new java.lang.Exception());
    }

    @java.lang.Deprecated
    public final void zzh(java.lang.Throwable th, java.lang.String str) {
        this.zza.zzd(th);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, str);
        }
    }

    @java.lang.Deprecated
    public final void zzi(java.lang.Object obj) {
        this.zza.zzc(obj);
    }

    @java.lang.Deprecated
    public final void zzj(com.google.android.gms.internal.ads.zzcaf zzcafVar, com.google.android.gms.internal.ads.zzcad zzcadVar) {
        com.google.android.gms.internal.ads.zzgch.zzr(this.zza, new com.google.android.gms.internal.ads.zzcah(this, zzcafVar, zzcadVar), com.google.android.gms.internal.ads.zzbzw.zzg);
    }
}

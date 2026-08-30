package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcha {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final android.content.Context zzb;
    private final long zzc;
    private final java.lang.ref.WeakReference zzd;

    /* synthetic */ zzcha(com.google.android.gms.internal.ads.zzcgy zzcgyVar, com.google.android.gms.internal.ads.zzcgz zzcgzVar) {
        this.zza = zzcgyVar.zza;
        this.zzb = zzcgyVar.zzb;
        this.zzd = zzcgyVar.zzd;
        this.zzc = zzcgyVar.zzc;
    }

    final long zza() {
        return this.zzc;
    }

    final android.content.Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzk zzc() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    final com.google.android.gms.internal.ads.zzbfe zzd() {
        return new com.google.android.gms.internal.ads.zzbfe(this.zzb);
    }

    final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze() {
        return this.zza;
    }

    final java.lang.String zzf() {
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(this.zzb, this.zza.afmaVersion);
    }

    final java.lang.ref.WeakReference zzg() {
        return this.zzd;
    }
}

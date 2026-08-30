package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaiu {
    public final com.google.android.gms.internal.ads.zzajb zza;
    public final com.google.android.gms.internal.ads.zzaje zzb;
    public final com.google.android.gms.internal.ads.zzadt zzc;
    public final com.google.android.gms.internal.ads.zzadu zzd;
    public int zze;

    public zzaiu(com.google.android.gms.internal.ads.zzajb zzajbVar, com.google.android.gms.internal.ads.zzaje zzajeVar, com.google.android.gms.internal.ads.zzadt zzadtVar) {
        this.zza = zzajbVar;
        this.zzb = zzajeVar;
        this.zzc = zzadtVar;
        this.zzd = androidx.media3.common.MimeTypes.AUDIO_TRUEHD.equals(zzajbVar.zzg.zzo) ? new com.google.android.gms.internal.ads.zzadu() : null;
    }
}

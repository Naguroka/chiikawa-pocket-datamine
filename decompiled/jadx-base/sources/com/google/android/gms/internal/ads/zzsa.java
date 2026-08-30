package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzsa {
    public final com.google.android.gms.internal.ads.zzsg zza;
    public final android.media.MediaFormat zzb;
    public final com.google.android.gms.internal.ads.zzab zzc;
    public final android.view.Surface zzd;
    public final android.media.MediaCrypto zze = null;
    public final com.google.android.gms.internal.ads.zzrz zzf;

    private zzsa(com.google.android.gms.internal.ads.zzsg zzsgVar, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.zzab zzabVar, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, com.google.android.gms.internal.ads.zzrz zzrzVar) {
        this.zza = zzsgVar;
        this.zzb = mediaFormat;
        this.zzc = zzabVar;
        this.zzd = surface;
        this.zzf = zzrzVar;
    }

    public static com.google.android.gms.internal.ads.zzsa zza(com.google.android.gms.internal.ads.zzsg zzsgVar, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.zzab zzabVar, android.media.MediaCrypto mediaCrypto, com.google.android.gms.internal.ads.zzrz zzrzVar) {
        return new com.google.android.gms.internal.ads.zzsa(zzsgVar, mediaFormat, zzabVar, null, null, zzrzVar);
    }

    public static com.google.android.gms.internal.ads.zzsa zzb(com.google.android.gms.internal.ads.zzsg zzsgVar, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.zzab zzabVar, android.view.Surface surface, android.media.MediaCrypto mediaCrypto) {
        return new com.google.android.gms.internal.ads.zzsa(zzsgVar, mediaFormat, zzabVar, surface, null, null);
    }
}

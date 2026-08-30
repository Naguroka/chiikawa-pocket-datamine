package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzsj extends java.lang.Exception {
    public final java.lang.String zza;
    public final boolean zzb;
    public final com.google.android.gms.internal.ads.zzsg zzc;
    public final java.lang.String zzd;

    public zzsj(com.google.android.gms.internal.ads.zzab zzabVar, java.lang.Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzabVar.toString(), th, zzabVar.zzo, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + java.lang.Math.abs(i), null);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzsj zza(com.google.android.gms.internal.ads.zzsj zzsjVar, com.google.android.gms.internal.ads.zzsj zzsjVar2) {
        return new com.google.android.gms.internal.ads.zzsj(zzsjVar.getMessage(), zzsjVar.getCause(), zzsjVar.zza, false, zzsjVar.zzc, zzsjVar.zzd, zzsjVar2);
    }

    public zzsj(com.google.android.gms.internal.ads.zzab zzabVar, java.lang.Throwable th, boolean z, com.google.android.gms.internal.ads.zzsg zzsgVar) {
        this("Decoder init failed: " + zzsgVar.zza + ", " + zzabVar.toString(), th, zzabVar.zzo, false, zzsgVar, th instanceof android.media.MediaCodec.CodecException ? ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzsj(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z, com.google.android.gms.internal.ads.zzsg zzsgVar, java.lang.String str3, com.google.android.gms.internal.ads.zzsj zzsjVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsgVar;
        this.zzd = str3;
    }
}

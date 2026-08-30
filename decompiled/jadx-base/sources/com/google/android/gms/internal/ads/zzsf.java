package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzsf extends com.google.android.gms.internal.ads.zzhf {
    public final java.lang.String zza;
    public final int zzb;

    public zzsf(java.lang.Throwable th, com.google.android.gms.internal.ads.zzsg zzsgVar) {
        super("Decoder failed: ".concat(java.lang.String.valueOf(zzsgVar == null ? null : zzsgVar.zza)), th);
        boolean z = th instanceof android.media.MediaCodec.CodecException;
        java.lang.String diagnosticInfo = z ? ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.zza = diagnosticInfo;
        this.zzb = com.google.android.gms.internal.ads.zzei.zza >= 23 ? z ? ((android.media.MediaCodec.CodecException) th).getErrorCode() : 0 : com.google.android.gms.internal.ads.zzei.zzm(diagnosticInfo);
    }
}

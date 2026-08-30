package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhc {
    private final android.media.MediaCodec.CryptoInfo zza;
    private final android.media.MediaCodec.CryptoInfo.Pattern zzb = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzhc zzhcVar, int i, int i2) {
        zzhcVar.zzb.set(i, i2);
        zzhcVar.zza.setPattern(zzhcVar.zzb);
    }
}

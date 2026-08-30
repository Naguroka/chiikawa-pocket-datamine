package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzsw implements com.google.android.gms.internal.ads.zzsv {
    private zzsw() {
        throw null;
    }

    /* synthetic */ zzsw(com.google.android.gms.internal.ads.zzsz zzszVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final int zza() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final android.media.MediaCodecInfo zzb(int i) {
        return android.media.MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final boolean zzc(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final boolean zzd(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final boolean zze() {
        return false;
    }
}

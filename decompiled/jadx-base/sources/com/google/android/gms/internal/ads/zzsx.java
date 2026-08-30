package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzsx implements com.google.android.gms.internal.ads.zzsv {
    private final int zza;
    private android.media.MediaCodecInfo[] zzb;

    public zzsx(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.zza = i;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaCodecInfos"})
    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new android.media.MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final android.media.MediaCodecInfo zzb(int i) {
        zzf();
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final boolean zzc(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final boolean zzd(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final boolean zze() {
        return true;
    }
}

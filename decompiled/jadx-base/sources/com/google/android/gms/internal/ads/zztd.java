package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zztd implements com.google.android.gms.internal.ads.zzse {
    private final android.media.MediaCodec zza;

    public zztd(android.media.MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zze(int i, int i2, com.google.android.gms.internal.ads.zzhe zzheVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzheVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzf(android.os.Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzh() {
    }
}

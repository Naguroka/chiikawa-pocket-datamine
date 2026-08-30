package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzqq implements com.google.android.gms.internal.ads.zzpj {
    final /* synthetic */ com.google.android.gms.internal.ads.zzqs zza;

    /* synthetic */ zzqq(com.google.android.gms.internal.ads.zzqs zzqsVar, com.google.android.gms.internal.ads.zzqr zzqrVar) {
        this.zza = zzqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zza(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzdo.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }
}

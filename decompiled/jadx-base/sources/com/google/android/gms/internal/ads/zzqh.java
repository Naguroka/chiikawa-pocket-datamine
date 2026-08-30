package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzqh implements com.google.android.gms.internal.ads.zzpp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzqm zza;

    /* synthetic */ zzqh(com.google.android.gms.internal.ads.zzqm zzqmVar, com.google.android.gms.internal.ads.zzql zzqlVar) {
        this.zza = zzqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zza(long j) {
        com.google.android.gms.internal.ads.zzdo.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zzb(long j) {
        com.google.android.gms.internal.ads.zzqm zzqmVar = this.zza;
        if (zzqmVar.zzp != null) {
            ((com.google.android.gms.internal.ads.zzqq) zzqmVar.zzp).zza.zzc.zzv(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zzc(long j, long j2, long j3, long j4) {
        com.google.android.gms.internal.ads.zzqm zzqmVar = this.zza;
        com.google.android.gms.internal.ads.zzdo.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + zzqmVar.zzL() + ", " + zzqmVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zzd(long j, long j2, long j3, long j4) {
        com.google.android.gms.internal.ads.zzqm zzqmVar = this.zza;
        com.google.android.gms.internal.ads.zzdo.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + zzqmVar.zzL() + ", " + zzqmVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zze(int i, long j) {
        com.google.android.gms.internal.ads.zzqm zzqmVar = this.zza;
        if (zzqmVar.zzp != null) {
            ((com.google.android.gms.internal.ads.zzqq) this.zza.zzp).zza.zzc.zzx(i, j, android.os.SystemClock.elapsedRealtime() - zzqmVar.zzV);
        }
    }
}

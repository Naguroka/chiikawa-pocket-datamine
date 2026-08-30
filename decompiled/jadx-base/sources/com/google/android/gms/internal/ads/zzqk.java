package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzqk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzqm zza;
    private final android.os.Handler zzb = new android.os.Handler(android.os.Looper.myLooper());
    private final android.media.AudioTrack.StreamEventCallback zzc = new com.google.android.gms.internal.ads.zzqj(this);

    public zzqk(com.google.android.gms.internal.ads.zzqm zzqmVar) {
        this.zza = zzqmVar;
    }

    public final void zza(android.media.AudioTrack audioTrack) {
        final android.os.Handler handler = this.zzb;
        java.util.Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzqi
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        }, this.zzc);
    }

    public final void zzb(android.media.AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzapd {
    private final java.util.concurrent.Executor zza;

    public zzapd(android.os.Handler handler) {
        this.zza = new com.google.android.gms.internal.ads.zzapb(this, handler);
    }

    public final void zza(com.google.android.gms.internal.ads.zzapm zzapmVar, com.google.android.gms.internal.ads.zzapv zzapvVar) {
        zzapmVar.zzm("post-error");
        ((com.google.android.gms.internal.ads.zzapb) this.zza).zza.post(new com.google.android.gms.internal.ads.zzapc(zzapmVar, com.google.android.gms.internal.ads.zzaps.zza(zzapvVar), null));
    }

    public final void zzb(com.google.android.gms.internal.ads.zzapm zzapmVar, com.google.android.gms.internal.ads.zzaps zzapsVar, java.lang.Runnable runnable) {
        zzapmVar.zzq();
        zzapmVar.zzm("post-response");
        ((com.google.android.gms.internal.ads.zzapb) this.zza).zza.post(new com.google.android.gms.internal.ads.zzapc(zzapmVar, zzapsVar, runnable));
    }
}

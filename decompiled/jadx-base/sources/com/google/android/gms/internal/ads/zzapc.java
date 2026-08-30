package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzapc implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzapm zza;
    private final com.google.android.gms.internal.ads.zzaps zzb;
    private final java.lang.Runnable zzc;

    public zzapc(com.google.android.gms.internal.ads.zzapm zzapmVar, com.google.android.gms.internal.ads.zzaps zzapsVar, java.lang.Runnable runnable) {
        this.zza = zzapmVar;
        this.zzb = zzapsVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        com.google.android.gms.internal.ads.zzaps zzapsVar = this.zzb;
        if (zzapsVar.zzc()) {
            this.zza.zzo(zzapsVar.zza);
        } else {
            this.zza.zzn(zzapsVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        java.lang.Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfky extends java.util.TimerTask {
    final /* synthetic */ java.util.Timer zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfla zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfo zzc;

    zzfky(com.google.android.gms.internal.ads.zzfla zzflaVar, com.google.android.gms.internal.ads.zzcfo zzcfoVar, java.util.Timer timer) {
        this.zzc = zzcfoVar;
        this.zza = timer;
        this.zzb = zzflaVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzh();
        this.zzc.zza(true);
        this.zza.cancel();
    }
}

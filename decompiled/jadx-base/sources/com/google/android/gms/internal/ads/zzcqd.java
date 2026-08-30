package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzcqd implements java.lang.Runnable {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;

    public /* synthetic */ zzcqd(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcqf.zzj(this.zza);
    }
}

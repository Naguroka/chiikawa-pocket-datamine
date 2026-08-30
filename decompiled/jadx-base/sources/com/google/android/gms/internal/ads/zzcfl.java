package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzcfl implements java.lang.Runnable {
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcex zza;

    public /* synthetic */ zzcfl(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.destroy();
    }
}

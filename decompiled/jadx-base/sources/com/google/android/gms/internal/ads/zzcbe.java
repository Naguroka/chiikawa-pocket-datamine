package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcbe implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbg zza;

    zzcbe(com.google.android.gms.internal.ads.zzcbg zzcbgVar) {
        this.zza = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new java.lang.String[0]);
    }
}

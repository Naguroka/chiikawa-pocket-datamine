package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcbn implements java.lang.Runnable {
    zzcbn(com.google.android.gms.internal.ads.zzcbp zzcbpVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Looper.myLooper().quit();
    }
}

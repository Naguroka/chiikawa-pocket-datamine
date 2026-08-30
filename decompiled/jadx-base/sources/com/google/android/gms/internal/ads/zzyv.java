package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzyv implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzyu zza;

    public zzyv(com.google.android.gms.internal.ads.zzyu zzyuVar) {
        this.zza = zzyuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzL();
    }
}

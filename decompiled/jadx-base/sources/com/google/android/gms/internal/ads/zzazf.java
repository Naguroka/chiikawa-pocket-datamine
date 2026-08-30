package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzazf implements java.lang.Runnable {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzazj zzb;

    zzazf(com.google.android.gms.internal.ads.zzazj zzazjVar, android.view.View view) {
        this.zza = view;
        this.zzb = zzazjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}

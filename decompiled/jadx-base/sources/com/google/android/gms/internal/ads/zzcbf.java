package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcbf implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbg zzb;

    zzcbf(com.google.android.gms.internal.ads.zzcbg zzcbgVar, boolean z) {
        this.zza = z;
        this.zzb = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", com.json.pg.k, java.lang.String.valueOf(this.zza));
    }
}

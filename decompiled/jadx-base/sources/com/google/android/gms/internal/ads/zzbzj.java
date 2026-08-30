package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbzj extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzm zza;

    zzbzj(com.google.android.gms.internal.ads.zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        this.zza.zzo.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        this.zza.zzo.set(false);
    }
}

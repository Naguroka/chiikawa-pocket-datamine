package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzavf extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzavg zza;

    zzavf(com.google.android.gms.internal.ads.zzavg zzavgVar) {
        this.zza = zzavgVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        synchronized (com.google.android.gms.internal.ads.zzavg.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        synchronized (com.google.android.gms.internal.ads.zzavg.class) {
            this.zza.zza = null;
        }
    }
}

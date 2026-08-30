package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfju extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfjv zza;

    zzfju(com.google.android.gms.internal.ads.zzfjv zzfjvVar) {
        this.zza = zzfjvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        this.zza.zzs(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        this.zza.zzs(false);
    }
}

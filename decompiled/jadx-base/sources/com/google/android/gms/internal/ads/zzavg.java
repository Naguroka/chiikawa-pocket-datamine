package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzavg {
    private android.net.NetworkCapabilities zza;

    zzavg(android.net.ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.zzavf(this));
            } catch (java.lang.RuntimeException unused) {
                synchronized (com.google.android.gms.internal.ads.zzavg.class) {
                    this.zza = null;
                }
            }
        }
    }

    public static com.google.android.gms.internal.ads.zzavg zzc(android.content.Context context) {
        if (context != null) {
            return new com.google.android.gms.internal.ads.zzavg((android.net.ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (com.google.android.gms.internal.ads.zzavg.class) {
            android.net.NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final android.net.NetworkCapabilities zzb() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawm {
    private static final java.lang.String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    zzawm(android.content.Context context, java.util.concurrent.Executor executor, java.lang.String[] strArr) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((android.app.AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new com.google.android.gms.internal.ads.zzawl(this));
        } catch (java.lang.IllegalArgumentException | java.lang.NoSuchMethodError unused) {
        }
    }

    public static com.google.android.gms.internal.ads.zzawm zzd(android.content.Context context, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzawm(context, executor, zza);
    }

    public final long zzb() {
        long j = this.zzd;
        this.zzd = -1L;
        return j;
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final void zzh() {
        if (this.zze) {
            this.zzc = java.lang.System.currentTimeMillis();
        }
    }
}

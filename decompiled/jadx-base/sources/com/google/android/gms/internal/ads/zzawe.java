package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawe {
    private long zza = -1;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;

    private static android.util.DisplayMetrics zzl(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (java.lang.NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean zzm(android.view.View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((android.view.ViewGroup) view).getChildAt(0);
            }
            java.lang.Object objInvoke = view.getClass().getMethod("getAdConfiguration", new java.lang.Class[0]).invoke(view, new java.lang.Object[0]);
            java.lang.String str = (java.lang.String) objInvoke.getClass().getMethod("adTypeToString", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(((java.lang.Integer) objInvoke.getClass().getField("adType").get(objInvoke)).intValue()));
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (java.lang.ReflectiveOperationException | java.lang.SecurityException unused) {
            return false;
        }
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zze;
    }

    public final long zzc() {
        return this.zza;
    }

    public final long zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzh;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzb;
    }

    public final long zzh() {
        return this.zzd;
    }

    public final void zzi() {
        this.zzh = this.zzg;
        this.zzg = android.os.SystemClock.uptimeMillis();
    }

    public final void zzj() {
        this.zzb = this.zza;
        this.zza = android.os.SystemClock.uptimeMillis();
    }

    public final void zzk(android.content.Context context, android.view.View view) {
        this.zzd = this.zzc;
        this.zzc = android.os.SystemClock.uptimeMillis();
        long j = this.zze;
        if (j != -1) {
            this.zzf = j;
        }
        android.util.DisplayMetrics displayMetricsZzl = zzl(context);
        int i = displayMetricsZzl.widthPixels * displayMetricsZzl.heightPixels;
        if (view != null) {
            int iMin = java.lang.Math.min(view.getWidth(), displayMetricsZzl.widthPixels) * java.lang.Math.min(view.getHeight(), displayMetricsZzl.heightPixels);
            if (iMin + iMin >= i || (iMin == 0 && zzm(view))) {
                this.zze = this.zzc;
                return;
            }
        }
        this.zze = -1L;
    }
}

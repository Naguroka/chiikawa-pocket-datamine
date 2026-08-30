package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzu extends com.google.android.gms.ads.internal.util.zzt {
    static final boolean zze(int i, int i2, int i3) {
        return java.lang.Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzd(android.app.Activity activity, android.content.res.Configuration configuration) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeR)).booleanValue()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeT)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        int iZzx = com.google.android.gms.ads.internal.util.client.zzf.zzx(activity, configuration.screenHeightDp);
        int iZzx2 = com.google.android.gms.ads.internal.util.client.zzf.zzx(activity, configuration.screenWidthDp);
        android.view.WindowManager windowManager = (android.view.WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzv.zzq();
        android.util.DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu(windowManager);
        int i = displayMetricsZzu.heightPixels;
        int i2 = displayMetricsZzu.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) java.lang.Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeP)).intValue();
        return (zze(i, iZzx + dimensionPixelSize, iRound) && zze(i2, iZzx2, iRound)) ? false : true;
    }
}

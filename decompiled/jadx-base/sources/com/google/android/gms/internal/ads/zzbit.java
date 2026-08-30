package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbit implements com.google.android.gms.internal.ads.zzbjp {
    zzbit() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        android.view.WindowManager windowManager = (android.view.WindowManager) zzcexVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzv.zzq();
        android.util.DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu(windowManager);
        int i = displayMetricsZzu.widthPixels;
        int i2 = displayMetricsZzu.heightPixels;
        int[] iArr = new int[2];
        java.util.HashMap map2 = new java.util.HashMap();
        ((android.view.View) zzcexVar).getLocationInWindow(iArr);
        map2.put("xInPixels", java.lang.Integer.valueOf(iArr[0]));
        map2.put("yInPixels", java.lang.Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", java.lang.Integer.valueOf(i));
        map2.put("windowHeightInPixels", java.lang.Integer.valueOf(i2));
        zzcexVar.zzd("locationReady", map2);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("GET LOCATION COMPILED");
    }
}

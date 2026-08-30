package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC1745x {
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static void a(android.app.Activity activity) {
        int i;
        boolean z;
        if (activity == null || activity.getWindow() == null || !com.unity3d.player.PlatformSupport.PIE_SUPPORT) {
            return;
        }
        if (com.unity3d.player.PlatformSupport.VANILLA_ICE_CREAM_SUPPORT) {
            i = 3;
        } else {
            i = 0;
            i = 0;
            i = 0;
            if (com.unity3d.player.PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
                try {
                    android.content.pm.ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128);
                    z = applicationInfo != null ? applicationInfo.metaData.getBoolean("unity.render-outside-safearea") : false;
                } catch (java.lang.Exception unused) {
                }
                if (z) {
                    i = 3;
                }
            } else {
                try {
                    android.content.pm.ApplicationInfo applicationInfo2 = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128);
                    if (applicationInfo2 != null) {
                        i = applicationInfo2.metaData.getBoolean("unity.render-outside-safearea");
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        activity.getWindow().getAttributes().layoutInDisplayCutoutMode = i;
    }
}

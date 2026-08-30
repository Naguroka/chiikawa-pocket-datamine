package com.iab.omid.library.bytedance2.utils;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.app.UiModeManager f2405a;

    public static com.iab.omid.library.bytedance2.adsession.DeviceCategory a() {
        android.app.UiModeManager uiModeManager = f2405a;
        if (uiModeManager == null) {
            return com.iab.omid.library.bytedance2.adsession.DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? com.iab.omid.library.bytedance2.adsession.DeviceCategory.OTHER : com.iab.omid.library.bytedance2.adsession.DeviceCategory.CTV;
        }
        return com.iab.omid.library.bytedance2.adsession.DeviceCategory.MOBILE;
    }

    public static void a(android.content.Context context) {
        if (context != null) {
            f2405a = (android.app.UiModeManager) context.getSystemService("uimode");
        }
    }
}

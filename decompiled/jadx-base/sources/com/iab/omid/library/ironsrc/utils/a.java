package com.iab.omid.library.ironsrc.utils;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.app.UiModeManager f2438a;

    public static com.iab.omid.library.ironsrc.adsession.DeviceCategory a() {
        int currentModeType = f2438a.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? com.iab.omid.library.ironsrc.adsession.DeviceCategory.OTHER : com.iab.omid.library.ironsrc.adsession.DeviceCategory.CTV;
        }
        return com.iab.omid.library.ironsrc.adsession.DeviceCategory.MOBILE;
    }

    public static void a(android.content.Context context) {
        if (context != null) {
            f2438a = (android.app.UiModeManager) context.getSystemService("uimode");
        }
    }
}

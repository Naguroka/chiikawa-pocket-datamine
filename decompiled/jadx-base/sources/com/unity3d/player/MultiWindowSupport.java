package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class MultiWindowSupport {
    private static boolean s_LastMultiWindowMode = false;

    public static boolean isInMultiWindowMode(android.app.Activity activity) {
        if (activity != null && com.unity3d.player.PlatformSupport.NOUGAT_SUPPORT) {
            return activity.isInMultiWindowMode();
        }
        return false;
    }

    public static boolean isMultiWindowModeChangedToTrue(android.app.Activity activity) {
        return !s_LastMultiWindowMode && isInMultiWindowMode(activity);
    }

    public static void saveMultiWindowMode(android.app.Activity activity) {
        s_LastMultiWindowMode = isInMultiWindowMode(activity);
    }
}

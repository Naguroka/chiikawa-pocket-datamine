package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public class UnityAdSize {
    private static final int FULL_WIDTH = -1;

    private UnityAdSize() {
    }

    public static com.google.android.gms.ads.AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(android.app.Activity activity, int width) {
        if (width == -1) {
            width = getScreenWidth(activity);
        }
        return com.google.android.gms.ads.AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, width);
    }

    public static com.google.android.gms.ads.AdSize getLandscapeAnchoredAdaptiveBannerAdSize(android.app.Activity activity, int width) {
        if (width == -1) {
            width = getScreenWidth(activity);
        }
        return com.google.android.gms.ads.AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(activity, width);
    }

    public static com.google.android.gms.ads.AdSize getPortraitAnchoredAdaptiveBannerAdSize(android.app.Activity activity, int width) {
        if (width == -1) {
            width = getScreenWidth(activity);
        }
        return com.google.android.gms.ads.AdSize.getPortraitAnchoredAdaptiveBannerAdSize(activity, width);
    }

    public static com.google.android.gms.ads.AdSize getSmartBannerAdSize() {
        return com.google.android.gms.ads.AdSize.SMART_BANNER;
    }

    private static int getScreenWidth(android.app.Activity activity) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }
}

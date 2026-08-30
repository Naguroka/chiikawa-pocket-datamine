package com.google.ads.mediation.ironsource;

/* JADX INFO: loaded from: classes4.dex */
public class IronSourceAdapterUtils {
    public static java.lang.String getAdapterVersion() {
        return com.google.ads.mediation.ironsource.BuildConfig.ADAPTER_VERSION;
    }

    public static com.json.mediationsdk.ISBannerSize getISBannerSizeFromGoogleAdSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.android.gms.ads.AdSize.BANNER);
        arrayList.add(com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE);
        arrayList.add(com.google.android.gms.ads.AdSize.LARGE_BANNER);
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = com.google.android.gms.ads.MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize == null) {
            return null;
        }
        if (com.google.android.gms.ads.AdSize.BANNER.equals(adSizeFindClosestSize)) {
            return com.json.mediationsdk.ISBannerSize.BANNER;
        }
        if (com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE.equals(adSizeFindClosestSize)) {
            return com.json.mediationsdk.ISBannerSize.RECTANGLE;
        }
        if (com.google.android.gms.ads.AdSize.LARGE_BANNER.equals(adSizeFindClosestSize)) {
            return com.json.mediationsdk.ISBannerSize.LARGE;
        }
        return new com.json.mediationsdk.ISBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
    }

    public static com.unity3d.ironsourceads.AdSize getAdSizeFromGoogleAdSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize) {
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = com.google.android.gms.ads.MediationUtils.findClosestSize(context, adSize, new java.util.ArrayList(java.util.Arrays.asList(com.google.android.gms.ads.AdSize.BANNER, com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE, com.google.android.gms.ads.AdSize.LARGE_BANNER, com.google.android.gms.ads.AdSize.LEADERBOARD)));
        if (adSizeFindClosestSize == null) {
            return com.unity3d.ironsourceads.AdSize.banner();
        }
        if (com.google.android.gms.ads.AdSize.BANNER.equals(adSizeFindClosestSize)) {
            return com.unity3d.ironsourceads.AdSize.banner();
        }
        if (com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE.equals(adSizeFindClosestSize)) {
            return com.unity3d.ironsourceads.AdSize.mediumRectangle();
        }
        if (com.google.android.gms.ads.AdSize.LARGE_BANNER.equals(adSizeFindClosestSize)) {
            return com.unity3d.ironsourceads.AdSize.large();
        }
        if (com.google.android.gms.ads.AdSize.LEADERBOARD.equals(adSizeFindClosestSize)) {
            return com.unity3d.ironsourceads.AdSize.leaderboard();
        }
        return com.unity3d.ironsourceads.AdSize.banner();
    }

    public static com.google.android.gms.ads.AdError buildAdErrorAdapterDomain(int i, java.lang.String str) {
        return new com.google.android.gms.ads.AdError(i, str, "com.google.ads.mediation.ironsource");
    }

    public static com.google.android.gms.ads.AdError buildAdErrorIronSourceDomain(int i, java.lang.String str) {
        return new com.google.android.gms.ads.AdError(i, str, com.google.ads.mediation.ironsource.IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
    }

    public static com.google.android.gms.ads.AdError validateIronSourceAdLoadParams(android.content.Context context, java.lang.String str) {
        if (!(context instanceof android.app.Activity)) {
            return new com.google.android.gms.ads.AdError(102, "IronSource requires an Activity context to load ads.", "com.google.ads.mediation.ironsource");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return new com.google.android.gms.ads.AdError(101, "Missing or invalid instance ID.", "com.google.ads.mediation.ironsource");
        }
        return null;
    }

    public static <T> boolean canLoadIronSourceAdInstance(java.lang.String str, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<T>> concurrentHashMap) {
        java.lang.ref.WeakReference<T> weakReference = concurrentHashMap.get(str);
        return weakReference == null || weakReference.get() == null;
    }

    public static java.lang.String prepareVersionToiAdsSdk(java.lang.String str) {
        return str.replace(".", "");
    }

    public static java.lang.String getMediationType() {
        return "AdMob" + prepareVersionToiAdsSdk(getAdapterVersion()) + "SDK" + prepareVersionToiAdsSdk(com.google.android.gms.ads.MobileAds.getVersion().toString()) + "iAds510";
    }
}

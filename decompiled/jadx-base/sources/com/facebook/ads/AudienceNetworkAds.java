package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class AudienceNetworkAds {
    public static final java.lang.String TAG = "FBAudienceNetwork";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdFormat {
        public static final int BANNER = 1;
        public static final int INTERSTITIAL = 2;
        public static final int NATIVE = 4;
        public static final int NATIVE_BANNER = 5;
        public static final int REWARDED_VIDEO = 6;
        public static final int UNKNOWN = 0;
    }

    public interface InitListener {
        void onInitialized(com.facebook.ads.AudienceNetworkAds.InitResult initResult);
    }

    public interface InitResult {
        java.lang.String getMessage();

        boolean isSuccess();
    }

    public interface InitSettingsBuilder {
        void initialize();

        com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder withInitListener(com.facebook.ads.AudienceNetworkAds.InitListener initListener);

        com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder withMediationService(java.lang.String str);

        com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder withPlacementIds(java.util.List<java.lang.String> list);
    }

    private AudienceNetworkAds() {
    }

    public static void initialize(android.content.Context context) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "Context can not be null.");
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.initialize(context, null, null, false);
    }

    public static boolean isInitialized(android.content.Context context) {
        if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.getDynamicLoader() == null) {
            return false;
        }
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createAudienceNetworkAdsApi().isInitialized();
    }

    public static com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder buildInitSettings(android.content.Context context) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "Context can not be null.");
        return new com.facebook.ads.internal.api.InitSettingsBuilder(context);
    }

    public static int getAdFormatForPlacement(android.content.Context context, java.lang.String str) {
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createAudienceNetworkAdsApi().getAdFormatForPlacement(str);
    }
}

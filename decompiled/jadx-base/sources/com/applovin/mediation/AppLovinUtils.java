package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinUtils {
    private static final java.lang.String DEFAULT_ZONE = "";
    public static final java.lang.String ERROR_MSG_CHILD_USER = "MobileAds.getRequestConfiguration() indicates the user is a child. AppLovin SDK 13.0.0 or higher does not support child users.";
    public static final java.lang.String ERROR_MSG_REASON_PREFIX = "AppLovin SDK returned a load failure callback with reason: ";

    public static boolean isMultiAdsEnabled() {
        return true;
    }

    public static class ServerParameterKeys {
        public static final java.lang.String SDK_KEY = "sdkKey";
        public static final java.lang.String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    public static java.lang.String retrieveZoneId(android.os.Bundle bundle) {
        return bundle.containsKey(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID) ? bundle.getString(com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID) : "";
    }

    public static boolean shouldMuteAudio(android.os.Bundle bundle) {
        return bundle != null && bundle.getBoolean(com.applovin.mediation.AppLovinExtras.Keys.MUTE_AUDIO);
    }

    public static com.google.android.gms.ads.AdError getAdError(int i) {
        java.lang.String str = "AppLovin error code " + i;
        if (i == -8) {
            str = "INVALID_AD_TOKEN";
        } else if (i == -7) {
            str = "INVALID_ZONE";
        } else if (i != -6) {
            switch (i) {
                case -1009:
                    str = "NO_NETWORK";
                    break;
                case -1001:
                    str = "FETCH_AD_TIMEOUT";
                    break;
                case com.applovin.sdk.AppLovinErrorCodes.INVALID_URL /* -900 */:
                    str = "INVALID_URL";
                    break;
                case com.applovin.sdk.AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                    str = "INVALID_RESPONSE";
                    break;
                case com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                    str = "INCENTIVIZED_USER_CLOSED_VIDEO";
                    break;
                case com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                    str = "INCENTIVIZED_SERVER_TIMEOUT";
                    break;
                case com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                    str = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                    break;
                case com.applovin.sdk.AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                    str = "INCENTIVIZED_NO_AD_PRELOADED";
                    break;
                case com.applovin.sdk.AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                    str = "SDK_DISABLED";
                    break;
                case -1:
                    str = "UNSPECIFIED_ERROR";
                    break;
                case 204:
                    str = "NO_FILL";
                    break;
                default:
                    switch (i) {
                        case com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                            str = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                            break;
                        case com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                            str = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                            break;
                        case com.applovin.sdk.AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                            str = "UNABLE_TO_PRECACHE_RESOURCES";
                            break;
                    }
                    break;
            }
        } else {
            str = "UNABLE_TO_RENDER_AD";
        }
        return new com.google.android.gms.ads.AdError(i, ERROR_MSG_REASON_PREFIX + str, com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
    }

    public static com.applovin.sdk.AppLovinAdSize appLovinAdSizeFromAdMobAdSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.android.gms.ads.AdSize.BANNER);
        arrayList.add(com.google.android.gms.ads.AdSize.LEADERBOARD);
        arrayList.add(com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE);
        com.google.android.gms.ads.AdSize adSizeFindClosestSize = com.google.android.gms.ads.MediationUtils.findClosestSize(context, adSize, arrayList);
        if (com.google.android.gms.ads.AdSize.BANNER.equals(adSizeFindClosestSize)) {
            return com.applovin.sdk.AppLovinAdSize.BANNER;
        }
        if (com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE.equals(adSizeFindClosestSize)) {
            return com.applovin.sdk.AppLovinAdSize.MREC;
        }
        if (com.google.android.gms.ads.AdSize.LEADERBOARD.equals(adSizeFindClosestSize)) {
            return com.applovin.sdk.AppLovinAdSize.LEADER;
        }
        return null;
    }

    public static boolean isChildUser() {
        com.google.android.gms.ads.RequestConfiguration requestConfiguration = com.google.android.gms.ads.MobileAds.getRequestConfiguration();
        return requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1;
    }

    public static com.google.android.gms.ads.AdError getChildUserError() {
        return new com.google.android.gms.ads.AdError(112, ERROR_MSG_CHILD_USER, com.google.ads.mediation.applovin.AppLovinMediationAdapter.ERROR_DOMAIN);
    }
}

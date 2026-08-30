package com.json.mediationsdk.utils;

/* JADX INFO: loaded from: classes5.dex */
public class ErrorBuilder {
    private static com.json.mediationsdk.logger.IronSourceError a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static com.json.mediationsdk.logger.IronSourceError adContainerIsNull(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, str + " banner container is null");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildCappedPerPlacementError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static com.json.mediationsdk.logger.IronSourceError buildCappedPerSessionError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_CAPPED_PER_SESSION, str + " Show Fail - Networks have reached their cap per session");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildGenericError(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new com.json.mediationsdk.logger.IronSourceError(510, str);
    }

    public static com.json.mediationsdk.logger.IronSourceError buildInitFailedError(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Init failed - ");
        if (android.text.TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        return new com.json.mediationsdk.logger.IronSourceError(508, sb.append(str).toString());
    }

    public static com.json.mediationsdk.logger.IronSourceError buildInitFailedError(java.lang.String str, java.lang.String str2) {
        return new com.json.mediationsdk.logger.IronSourceError(508, (android.text.TextUtils.isEmpty(str) ? new java.lang.StringBuilder().append(str2).append(" init failed due to an unknown error") : new java.lang.StringBuilder().append(str2).append(" - ").append(str)).toString());
    }

    public static com.json.mediationsdk.logger.IronSourceError buildInvalidConfigurationError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(501, "" + str + " Init Fail - Configurations from the server are not valid");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildInvalidCredentialsError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.json.mediationsdk.logger.IronSourceError(506, "Init Fail - " + str + " value " + str2 + " is not valid" + (!android.text.TextUtils.isEmpty(str3) ? " - " + str3 : ""));
    }

    public static com.json.mediationsdk.logger.IronSourceError buildInvalidKeyValueError(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return a();
        }
        return new com.json.mediationsdk.logger.IronSourceError(506, "Mediation - " + str + " value is not valid " + (!android.text.TextUtils.isEmpty(str2) ? " - " + str2 : ""));
    }

    public static com.json.mediationsdk.logger.IronSourceError buildKeyNotSetError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) ? a() : new com.json.mediationsdk.logger.IronSourceError(505, str3 + " Mediation - " + str + " is not set for " + str2);
    }

    public static com.json.mediationsdk.logger.IronSourceError buildLoadFailedError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(510, android.text.TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : "Load failed - " + str);
    }

    public static com.json.mediationsdk.logger.IronSourceError buildLoadFailedError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "" + str + " Load Fail" + (android.text.TextUtils.isEmpty(str2) ? "" : " " + str2) + " - ";
        if (android.text.TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new com.json.mediationsdk.logger.IronSourceError(510, str4 + str3);
    }

    public static com.json.mediationsdk.logger.IronSourceError buildNoAdsToShowError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(509, str + " Show Fail - No ads to show");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildNoConfigurationAvailableError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(501, "" + str + " Init Fail - Unable to retrieve configurations from the server");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildNoInternetConnectionInitFailError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Init Fail - No Internet connection");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildNoInternetConnectionLoadFailError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Load Fail - No Internet connection");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildNoInternetConnectionShowFailError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Show Fail - No Internet connection");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildNonExistentInstanceError(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE, str + " The requested instance does not exist");
    }

    public static com.json.mediationsdk.logger.IronSourceError buildShowFailedError(java.lang.String str, java.lang.String str2) {
        return new com.json.mediationsdk.logger.IronSourceError(509, str + " Show Fail - " + str2);
    }

    public static com.json.mediationsdk.logger.IronSourceError buildUsingCachedConfigurationError(java.lang.String str, java.lang.String str2) {
        return new com.json.mediationsdk.logger.IronSourceError(502, "Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:" + str + " and userId:" + str2);
    }

    public static com.json.mediationsdk.logger.IronSourceError unsupportedBannerSize(java.lang.String str) {
        return new com.json.mediationsdk.logger.IronSourceError(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, str + " unsupported banner size");
    }
}

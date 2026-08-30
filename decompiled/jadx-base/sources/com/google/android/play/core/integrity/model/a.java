package com.google.android.play.core.integrity.model;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f2319a;
    private static final java.util.Map b;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f2319a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        b = map2;
        map.put(-1, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n");
        map.put(-2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
        map.put(-3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
        map.put(-4, "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n");
        map.put(-5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        map.put(-6, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
        map.put(-7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
        map.put(-8, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
        map.put(-9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
        map.put(-10, "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n");
        map.put(-11, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n");
        map.put(-12, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        map.put(-13, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n");
        map.put(-14, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
        map.put(-15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
        map.put(-16, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
        map.put(-100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
        map.put(-17, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
        map2.put(-1, "API_NOT_AVAILABLE");
        map2.put(-3, "NETWORK_ERROR");
        map2.put(-2, "PLAY_STORE_NOT_FOUND");
        map2.put(-4, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        map2.put(-14, "PLAY_STORE_VERSION_OUTDATED");
        map2.put(-5, "APP_NOT_INSTALLED");
        map2.put(-6, "PLAY_SERVICES_NOT_FOUND");
        map2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        map2.put(-7, "APP_UID_MISMATCH");
        map2.put(-8, "TOO_MANY_REQUESTS");
        map2.put(-9, "CANNOT_BIND_TO_SERVICE");
        map2.put(-10, "NONCE_TOO_SHORT");
        map2.put(-11, "NONCE_TOO_LONG");
        map2.put(-13, "NONCE_IS_NOT_BASE64");
        map2.put(-16, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        map2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        map2.put(-100, "INTERNAL_ERROR");
        map2.put(-17, "CLIENT_TRANSIENT_ERROR");
    }

    public static java.lang.String a(int i) {
        java.util.Map map = f2319a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        java.util.Map map2 = b;
        if (!map2.containsKey(numValueOf)) {
            return "";
        }
        return ((java.lang.String) map.get(numValueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#" + ((java.lang.String) map2.get(numValueOf)) + ")";
    }
}

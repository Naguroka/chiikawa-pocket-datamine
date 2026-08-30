package com.google.android.play.core.assetpacks.model;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f2262a;
    private static final java.util.Map b;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f2262a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        b = map2;
        map.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        map.put(-2, "The requested pack is not available.");
        map.put(-3, "The request is invalid.");
        map.put(-4, "The requested download is not found.");
        map.put(-5, "The Asset Delivery API is not available.");
        map.put(-6, "Network error. Unable to obtain the asset pack details.");
        map.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        map.put(-10, "Asset pack download failed due to insufficient storage.");
        map.put(-11, "The Play Store app is either not installed or not the official version.");
        map.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        map.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        map.put(-100, "Unknown error downloading an asset pack.");
        map2.put(-1, "APP_UNAVAILABLE");
        map2.put(-2, "PACK_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(-4, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(-6, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(-10, "INSUFFICIENT_STORAGE");
        map2.put(-11, "PLAY_STORE_NOT_FOUND");
        map2.put(-12, "NETWORK_UNRESTRICTED");
        map2.put(-13, "APP_NOT_OWNED");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static java.lang.String a(int i) {
        java.util.Map map = f2262a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((java.lang.String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#" + ((java.lang.String) b.get(numValueOf)) + ")";
    }
}

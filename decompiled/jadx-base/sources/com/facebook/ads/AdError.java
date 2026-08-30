package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class AdError {
    public static final int AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE = 6003;
    public static final int AD_PRESENTATION_ERROR_CODE = 9001;
    public static final int API_NOT_SUPPORTED = 7006;
    public static final int BROKEN_MEDIA_ERROR_CODE = 2100;
    public static final int CACHE_ERROR_CODE = 2002;
    public static final int CLEAR_TEXT_SUPPORT_NOT_ALLOWED = 7003;
    public static final int ICONVIEW_MISSING_ERROR_CODE = 6002;
    public static final int INCORRECT_STATE_ERROR = 7004;
    public static final int INTERNAL_ERROR_2003 = 2003;
    public static final int INTERNAL_ERROR_2004 = 2004;
    public static final int INTERNAL_ERROR_2006 = 2006;
    public static final int INTERNAL_ERROR_CODE = 2001;
    public static final int INTERSTITIAL_AD_TIMEOUT = 2009;
    public static final int LOAD_CALLED_WHILE_SHOWING_AD = 7002;
    public static final int LOAD_TOO_FREQUENTLY_ERROR_CODE = 1002;
    public static final int MEDIATION_ERROR_CODE = 3001;
    public static final int MEDIAVIEW_MISSING_ERROR_CODE = 6001;
    public static final int MISSING_DEPENDENCIES_ERROR = 7005;
    public static final int NATIVE_AD_IS_NOT_LOADED = 7007;
    public static final int NETWORK_ERROR_CODE = 1000;
    public static final int NO_FILL_ERROR_CODE = 1001;
    public static final int REMOTE_ADS_SERVICE_ERROR = 2008;
    public static final int SERVER_ERROR_CODE = 2000;
    public static final int SHOW_CALLED_BEFORE_LOAD_ERROR_CODE = 7001;
    private final int errorCode;
    private final java.lang.String errorMessage;
    public static final com.facebook.ads.AdError NETWORK_ERROR = new com.facebook.ads.AdError(1000, "Network Error");
    public static final com.facebook.ads.AdError NO_FILL = new com.facebook.ads.AdError(1001, "No Fill");
    public static final com.facebook.ads.AdError LOAD_TOO_FREQUENTLY = new com.facebook.ads.AdError(1002, "Ad was re-loaded too frequently");
    public static final com.facebook.ads.AdError SERVER_ERROR = new com.facebook.ads.AdError(2000, "Server Error");
    public static final com.facebook.ads.AdError INTERNAL_ERROR = new com.facebook.ads.AdError(2001, "Internal Error");
    public static final com.facebook.ads.AdError CACHE_ERROR = new com.facebook.ads.AdError(2002, "Cache Error");
    public static final com.facebook.ads.AdError AD_PRESENTATION_ERROR = new com.facebook.ads.AdError(9001, "Ad could not be presented");
    public static final com.facebook.ads.AdError MEDIATION_ERROR = new com.facebook.ads.AdError(3001, "Mediation Error");
    public static final com.facebook.ads.AdError BROKEN_MEDIA_ERROR = new com.facebook.ads.AdError(2100, "Native ad failed to load its media");
    public static final com.facebook.ads.AdError AD_ASSETS_UNSUPPORTED_TYPE_ERROR = new com.facebook.ads.AdError(6003, "unsupported type of ad assets");
    public static final com.facebook.ads.AdError SHOW_CALLED_BEFORE_LOAD_ERROR = new com.facebook.ads.AdError(7001, "Ad not loaded. First call loadAd() and wait for onAdLoaded() to be invoked before executing show()");

    public AdError(int i, java.lang.String str) {
        str = android.text.TextUtils.isEmpty(str) ? "unknown error" : str;
        this.errorCode = i;
        this.errorMessage = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public static com.facebook.ads.AdError internalError(int i) {
        return new com.facebook.ads.AdError(i, java.lang.String.format(java.util.Locale.US, "Internal error %d", java.lang.Integer.valueOf(i)));
    }
}

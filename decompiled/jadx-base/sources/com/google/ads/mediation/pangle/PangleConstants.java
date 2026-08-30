package com.google.ads.mediation.pangle;

/* JADX INFO: loaded from: classes4.dex */
public class PangleConstants {
    public static final java.lang.String APP_ID = "appid";
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final java.lang.String ERROR_DOMAIN = "com.google.ads.mediation.pangle";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final java.lang.String PANGLE_SDK_ERROR_DOMAIN = "com.pangle.ads";
    public static final java.lang.String PLACEMENT_ID = "placementid";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public static com.google.android.gms.ads.AdError createAdapterError(int i, java.lang.String str) {
        return new com.google.android.gms.ads.AdError(i, str, "com.google.ads.mediation.pangle");
    }

    public static com.google.android.gms.ads.AdError createSdkError(int i, java.lang.String str) {
        return new com.google.android.gms.ads.AdError(i, str, PANGLE_SDK_ERROR_DOMAIN);
    }

    private PangleConstants() {
    }
}

package com.google.ads.mediation.pangle;

/* JADX INFO: loaded from: classes4.dex */
public class PangleRequestHelper {
    public static final java.lang.String ADMOB_WATERMARK_KEY = "admob_watermark";

    public static void setWatermarkString(com.bytedance.sdk.openadsdk.api.PAGRequest pAGRequest, java.lang.String str, com.google.android.gms.ads.mediation.MediationAdConfiguration mediationAdConfiguration) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String watermark = mediationAdConfiguration.getWatermark();
        if (android.text.TextUtils.isEmpty(watermark)) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new java.util.HashMap<>();
        }
        extraInfo.put(ADMOB_WATERMARK_KEY, watermark);
        pAGRequest.setExtraInfo(extraInfo);
    }

    private PangleRequestHelper() {
    }
}

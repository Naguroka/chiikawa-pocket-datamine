package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class ResponseData {
    public com.adjust.sdk.ActivityKind activityKind;
    public com.adjust.sdk.ActivityPackage activityPackage;
    public java.lang.String adid;
    public java.lang.Long askIn;
    public com.adjust.sdk.AdjustAttribution attribution;
    public java.lang.Long continueIn;
    public org.json.JSONObject controlParams;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String resolvedDeeplink;
    public java.lang.Long retryIn;
    public java.util.Map<java.lang.String, java.lang.String> sendingParameters;
    public java.util.Map<java.lang.String, java.lang.String> signedParameters;
    public java.lang.String timestamp;
    public com.adjust.sdk.TrackingState trackingState;
    public boolean success = false;
    public boolean willRetry = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95a;

        static {
            int[] iArr = new int[com.adjust.sdk.ActivityKind.values().length];
            f95a = iArr;
            try {
                iArr[com.adjust.sdk.ActivityKind.SESSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f95a[com.adjust.sdk.ActivityKind.CLICK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f95a[com.adjust.sdk.ActivityKind.ATTRIBUTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f95a[com.adjust.sdk.ActivityKind.EVENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f95a[com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static com.adjust.sdk.ResponseData buildResponseData(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        com.adjust.sdk.ResponseData sessionResponseData;
        com.adjust.sdk.ActivityKind activityKind = activityPackage.getActivityKind();
        int i = com.adjust.sdk.ResponseData.a.f95a[activityKind.ordinal()];
        if (i == 1) {
            sessionResponseData = new com.adjust.sdk.SessionResponseData(activityPackage);
        } else if (i == 2) {
            sessionResponseData = new com.adjust.sdk.SdkClickResponseData();
        } else if (i == 3) {
            sessionResponseData = new com.adjust.sdk.AttributionResponseData();
        } else if (i != 4) {
            sessionResponseData = i != 5 ? new com.adjust.sdk.ResponseData() : new com.adjust.sdk.PurchaseVerificationResponseData();
        } else {
            sessionResponseData = new com.adjust.sdk.EventResponseData(activityPackage);
        }
        sessionResponseData.activityKind = activityKind;
        sessionResponseData.activityPackage = activityPackage;
        sessionResponseData.sendingParameters = map;
        sessionResponseData.signedParameters = map2;
        return sessionResponseData;
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}

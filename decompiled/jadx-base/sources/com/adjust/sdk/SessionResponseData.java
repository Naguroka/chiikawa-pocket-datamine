package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class SessionResponseData extends com.adjust.sdk.ResponseData {
    private java.lang.String sdkPlatform;

    public SessionResponseData(com.adjust.sdk.ActivityPackage activityPackage) {
        this.sdkPlatform = com.adjust.sdk.Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public com.adjust.sdk.AdjustSessionFailure getFailureResponseData() {
        org.json.JSONObject jSONObject;
        if (this.success) {
            return null;
        }
        com.adjust.sdk.AdjustSessionFailure adjustSessionFailure = new com.adjust.sdk.AdjustSessionFailure();
        if ("unity".equals(this.sdkPlatform)) {
            java.lang.String str = this.message;
            if (str == null) {
                str = "";
            }
            adjustSessionFailure.message = str;
            java.lang.String str2 = this.timestamp;
            if (str2 == null) {
                str2 = "";
            }
            adjustSessionFailure.timestamp = str2;
            java.lang.String str3 = this.adid;
            adjustSessionFailure.adid = str3 != null ? str3 : "";
            adjustSessionFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
        } else {
            adjustSessionFailure.message = this.message;
            adjustSessionFailure.timestamp = this.timestamp;
            adjustSessionFailure.adid = this.adid;
            adjustSessionFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
        }
        adjustSessionFailure.jsonResponse = jSONObject;
        return adjustSessionFailure;
    }

    public com.adjust.sdk.AdjustSessionSuccess getSuccessResponseData() {
        org.json.JSONObject jSONObject;
        if (!this.success) {
            return null;
        }
        com.adjust.sdk.AdjustSessionSuccess adjustSessionSuccess = new com.adjust.sdk.AdjustSessionSuccess();
        if ("unity".equals(this.sdkPlatform)) {
            java.lang.String str = this.message;
            if (str == null) {
                str = "";
            }
            adjustSessionSuccess.message = str;
            java.lang.String str2 = this.timestamp;
            if (str2 == null) {
                str2 = "";
            }
            adjustSessionSuccess.timestamp = str2;
            java.lang.String str3 = this.adid;
            adjustSessionSuccess.adid = str3 != null ? str3 : "";
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
        } else {
            adjustSessionSuccess.message = this.message;
            adjustSessionSuccess.timestamp = this.timestamp;
            adjustSessionSuccess.adid = this.adid;
            jSONObject = this.jsonResponse;
        }
        adjustSessionSuccess.jsonResponse = jSONObject;
        return adjustSessionSuccess;
    }
}

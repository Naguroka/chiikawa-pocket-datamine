package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class EventResponseData extends com.adjust.sdk.ResponseData {
    private java.lang.String callbackId;
    private java.lang.String eventToken;
    private java.lang.String sdkPlatform;

    public EventResponseData(com.adjust.sdk.ActivityPackage activityPackage) {
        this.eventToken = activityPackage.getParameters().get("event_token");
        this.callbackId = activityPackage.getParameters().get("event_callback_id");
        this.sdkPlatform = com.adjust.sdk.Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public com.adjust.sdk.AdjustEventFailure getFailureResponseData() {
        org.json.JSONObject jSONObject;
        if (this.success) {
            return null;
        }
        com.adjust.sdk.AdjustEventFailure adjustEventFailure = new com.adjust.sdk.AdjustEventFailure();
        if ("unity".equals(this.sdkPlatform)) {
            java.lang.String str = this.eventToken;
            if (str == null) {
                str = "";
            }
            adjustEventFailure.eventToken = str;
            java.lang.String str2 = this.message;
            if (str2 == null) {
                str2 = "";
            }
            adjustEventFailure.message = str2;
            java.lang.String str3 = this.timestamp;
            if (str3 == null) {
                str3 = "";
            }
            adjustEventFailure.timestamp = str3;
            java.lang.String str4 = this.adid;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventFailure.adid = str4;
            java.lang.String str5 = this.callbackId;
            adjustEventFailure.callbackId = str5 != null ? str5 : "";
            adjustEventFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
        } else {
            adjustEventFailure.eventToken = this.eventToken;
            adjustEventFailure.message = this.message;
            adjustEventFailure.timestamp = this.timestamp;
            adjustEventFailure.adid = this.adid;
            adjustEventFailure.callbackId = this.callbackId;
            adjustEventFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
        }
        adjustEventFailure.jsonResponse = jSONObject;
        return adjustEventFailure;
    }

    public com.adjust.sdk.AdjustEventSuccess getSuccessResponseData() {
        org.json.JSONObject jSONObject;
        if (!this.success) {
            return null;
        }
        com.adjust.sdk.AdjustEventSuccess adjustEventSuccess = new com.adjust.sdk.AdjustEventSuccess();
        if ("unity".equals(this.sdkPlatform)) {
            java.lang.String str = this.eventToken;
            if (str == null) {
                str = "";
            }
            adjustEventSuccess.eventToken = str;
            java.lang.String str2 = this.message;
            if (str2 == null) {
                str2 = "";
            }
            adjustEventSuccess.message = str2;
            java.lang.String str3 = this.timestamp;
            if (str3 == null) {
                str3 = "";
            }
            adjustEventSuccess.timestamp = str3;
            java.lang.String str4 = this.adid;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventSuccess.adid = str4;
            java.lang.String str5 = this.callbackId;
            adjustEventSuccess.callbackId = str5 != null ? str5 : "";
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
        } else {
            adjustEventSuccess.eventToken = this.eventToken;
            adjustEventSuccess.message = this.message;
            adjustEventSuccess.timestamp = this.timestamp;
            adjustEventSuccess.adid = this.adid;
            adjustEventSuccess.callbackId = this.callbackId;
            jSONObject = this.jsonResponse;
        }
        adjustEventSuccess.jsonResponse = jSONObject;
        return adjustEventSuccess;
    }
}

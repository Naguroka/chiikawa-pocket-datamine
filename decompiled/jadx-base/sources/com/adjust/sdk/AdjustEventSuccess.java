package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustEventSuccess {
    public java.lang.String adid;
    public java.lang.String callbackId;
    public java.lang.String eventToken;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String timestamp;

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("Event Success msg:%s time:%s adid:%s event:%s cid:%s json:%s", this.message, this.timestamp, this.adid, this.eventToken, this.callbackId, this.jsonResponse);
    }
}

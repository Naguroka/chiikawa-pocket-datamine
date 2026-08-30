package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustEventFailure {
    public java.lang.String adid;
    public java.lang.String callbackId;
    public java.lang.String eventToken;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String timestamp;
    public boolean willRetry;

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("Event Failure msg:%s time:%s adid:%s event:%s cid:%s retry:%b json:%s", this.message, this.timestamp, this.adid, this.eventToken, this.callbackId, java.lang.Boolean.valueOf(this.willRetry), this.jsonResponse);
    }
}

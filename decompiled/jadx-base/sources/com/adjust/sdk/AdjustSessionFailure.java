package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustSessionFailure {
    public java.lang.String adid;
    public org.json.JSONObject jsonResponse;
    public java.lang.String message;
    public java.lang.String timestamp;
    public boolean willRetry;

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString("Session Failure msg:%s time:%s adid:%s retry:%b json:%s", this.message, this.timestamp, this.adid, java.lang.Boolean.valueOf(this.willRetry), this.jsonResponse);
    }
}

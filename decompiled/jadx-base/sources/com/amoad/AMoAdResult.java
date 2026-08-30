package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AMoAdResult {
    public final android.view.View convertView;
    public final com.amoad.AMoAdError error;
    public final com.amoad.AMoAdResult.Result result;
    public final java.lang.String tag;

    public enum Result {
        Success,
        Failure,
        Empty
    }

    AMoAdResult(com.amoad.AMoAdResult.Result result, java.lang.String str, android.view.View view, com.amoad.AMoAdError aMoAdError) {
        this.result = result;
        this.tag = str;
        this.convertView = view;
        this.error = aMoAdError;
    }

    public final java.lang.String toString() {
        return "result:" + this.result + ", tag:" + this.tag + ", convertView:" + this.convertView;
    }
}

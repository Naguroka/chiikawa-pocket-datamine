package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes4.dex */
public class PAGErrorModel {
    private final java.lang.String IL;
    private final int bg;

    public PAGErrorModel(int i, java.lang.String str) {
        this.bg = i;
        this.IL = str;
    }

    public int getErrorCode() {
        return this.bg;
    }

    public java.lang.String getErrorMessage() {
        return this.IL;
    }
}

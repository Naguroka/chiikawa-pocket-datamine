package com.bytedance.sdk.openadsdk.api;

/* JADX INFO: loaded from: classes4.dex */
public class PAGRequest {
    private java.util.Map<java.lang.String, java.lang.Object> IL;
    private android.os.Bundle bX = null;
    private java.lang.String bg;

    public java.lang.String getAdString() {
        return this.bg;
    }

    public void setAdString(java.lang.String str) {
        this.bg = str;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getExtraInfo() {
        return this.IL;
    }

    public void setExtraInfo(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.IL = map;
    }

    public final void addNetworkExtrasBundle(java.lang.Class<?> cls, android.os.Bundle bundle) {
        if (this.bX == null) {
            this.bX = new android.os.Bundle();
        }
        this.bX.putBundle(cls.getName(), bundle);
    }

    public android.os.Bundle getNetworkExtrasBundle() {
        return this.bX;
    }
}

package com.bytedance.adsdk.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.adsdk.IL.eqN.ldr {
    @Override // com.bytedance.adsdk.IL.eqN.ldr
    public com.bytedance.adsdk.IL.eqN.eqN bg(java.lang.String str) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new com.bytedance.adsdk.IL.eqN.bg(httpURLConnection);
    }
}

package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.sdk.component.IL.bg.Lq {
    public static int bg = -1;
    java.net.HttpURLConnection IL;
    com.bytedance.sdk.component.IL.bg.Ta bX;
    int eqN;
    java.lang.String zx;

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public long IL() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public long bg() {
        return 0L;
    }

    public java.lang.String toString() {
        return "";
    }

    public iR(java.net.HttpURLConnection httpURLConnection, com.bytedance.sdk.component.IL.bg.Ta ta) {
        this.eqN = bg;
        this.IL = httpURLConnection;
        this.bX = ta;
    }

    public iR(int i, java.lang.String str, com.bytedance.sdk.component.IL.bg.Ta ta) {
        this.zx = str;
        this.bX = ta;
        this.eqN = i;
    }

    public com.bytedance.sdk.component.IL.bg.Ta eo() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public int bX() {
        try {
            return this.IL.getResponseCode();
        } catch (java.lang.Exception unused) {
            return this.eqN;
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public boolean eqN() {
        return bX() >= 200 && bX() < 300;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public java.lang.String zx() throws java.io.IOException {
        if (!android.text.TextUtils.isEmpty(this.zx)) {
            return this.zx;
        }
        return this.IL.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public com.bytedance.sdk.component.IL.bg.xxp ldr() {
        com.bytedance.sdk.component.IL.bg.bg.bg.Kg kg;
        com.bytedance.sdk.component.IL.bg.Ta ta = this.bX;
        if (ta != null && ta.IL != null) {
            this.bX.IL.VB();
        }
        try {
            try {
                kg = new com.bytedance.sdk.component.IL.bg.bg.bg.Kg(this.IL);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
                kg = null;
            }
        } catch (java.lang.Exception unused) {
            java.net.HttpURLConnection httpURLConnection = this.IL;
            kg = new com.bytedance.sdk.component.IL.bg.bg.bg.Kg(httpURLConnection, httpURLConnection.getErrorStream());
        }
        com.bytedance.sdk.component.IL.bg.Ta ta2 = this.bX;
        if (ta2 != null && ta2.IL != null) {
            this.bX.IL.Ta();
        }
        return kg;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public com.bytedance.sdk.component.IL.bg.ldr iR() {
        if (this.IL == null) {
            return new com.bytedance.sdk.component.IL.bg.ldr(new java.lang.String[0]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : this.IL.getHeaderFields().entrySet()) {
            for (java.lang.String str : entry.getValue()) {
                if (!com.google.common.net.HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(entry.getKey()) || bX() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.IL.bg.ldr((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    public java.lang.String bg(java.lang.String str) {
        java.net.HttpURLConnection httpURLConnection = this.IL;
        return httpURLConnection == null ? "" : httpURLConnection.getHeaderField(str);
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        return !android.text.TextUtils.isEmpty(bg(str)) ? bg(str) : str2;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ldr().close();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public com.bytedance.sdk.component.IL.bg.PX Kg() {
        return com.bytedance.sdk.component.IL.bg.PX.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Lq
    public com.bytedance.sdk.component.IL.bg.eo WR() {
        if (eo() == null || eo().IL == null) {
            return null;
        }
        return new com.bytedance.sdk.component.IL.bg.eo(eo().IL);
    }
}

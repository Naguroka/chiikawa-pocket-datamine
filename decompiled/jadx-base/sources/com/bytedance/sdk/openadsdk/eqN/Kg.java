package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    private long WR;
    private final com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private final android.webkit.WebView iR;
    private int ldr;
    private int zx;
    private java.lang.String Kg = "landingpage";
    private final java.util.Map<java.lang.Integer, java.lang.Long> IL = new java.util.HashMap();
    private final java.util.List<java.lang.Integer> bX = new java.util.ArrayList();
    private final java.util.Map<java.lang.Integer, java.lang.String> eqN = new java.util.HashMap();

    public Kg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.webkit.WebView webView) {
        this.bg = tuv;
        this.iR = webView;
    }

    public void bg(java.lang.String str, int i) {
        if (bg(true)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg, this.Kg, this.zx, str, i);
            this.eqN.put(java.lang.Integer.valueOf(this.zx), str);
            this.WR = android.os.SystemClock.elapsedRealtime();
        }
    }

    public void bg(java.lang.String str) {
        if (bg(false)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg, this.Kg, this.zx, str, android.os.SystemClock.elapsedRealtime() - this.WR);
        }
    }

    public void bg(android.webkit.WebView webView, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null || !com.bytedance.sdk.component.WR.IL.bg(tuv.eo().bX(), str)) {
            return;
        }
        java.lang.String str2 = this.eqN.get(java.lang.Integer.valueOf(this.zx));
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg, this.Kg, this.zx, str2, str, 2);
    }

    public void IL(java.lang.String str) {
        java.lang.String str2 = this.eqN.get(java.lang.Integer.valueOf(this.zx));
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        int i = this.zx;
        if (i > 0) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg, this.Kg, i, str3, str, 1);
        }
    }

    private boolean bg(boolean z) {
        int i = z ? this.zx : this.ldr;
        IL(z);
        int i2 = z ? this.zx : this.ldr;
        return i2 > 0 && i2 != i;
    }

    private void IL(boolean z) {
        try {
            android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList = this.iR.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z) {
                    this.zx = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
                } else {
                    this.ldr = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
                }
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("ArbitrageLandingLog", th.toString());
        }
    }

    public void bX(java.lang.String str) {
        this.Kg = str;
    }
}

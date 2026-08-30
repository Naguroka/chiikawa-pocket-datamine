package com.bytedance.sdk.openadsdk.core.widget.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements com.bytedance.sdk.openadsdk.core.widget.bg.bg {
    private com.bytedance.sdk.component.WR.eqN IL;
    com.bytedance.sdk.openadsdk.core.aGH bg;
    private java.util.concurrent.atomic.AtomicInteger bX = null;
    private boolean eqN = false;

    public void bg(boolean z) {
        this.eqN = z;
        if (z) {
            this.bX = new java.util.concurrent.atomic.AtomicInteger(com.bytedance.sdk.openadsdk.core.VzQ.eqN().bCU());
        } else {
            this.bX = new java.util.concurrent.atomic.AtomicInteger(com.bytedance.sdk.openadsdk.core.VzQ.eqN().GZ());
        }
    }

    public void IL() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.bX;
        if (atomicInteger == null || atomicInteger.get() > 0) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[4];
                java.lang.Integer.valueOf(this.bX.get());
                java.lang.Boolean.valueOf(this.eqN);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String strEqN = com.bytedance.sdk.component.adexpress.bg.IL.IL.eqN(null);
            if (this.eqN) {
                java.lang.String strEqN2 = com.bytedance.sdk.component.adexpress.bg.IL.IL.eqN("v3");
                if (strEqN != null && strEqN.equals(strEqN2)) {
                    return;
                } else {
                    strEqN = strEqN2;
                }
            }
            if (android.text.TextUtils.isEmpty(strEqN)) {
                return;
            }
            try {
                com.bytedance.sdk.component.WR.eqN eqn = new com.bytedance.sdk.component.WR.eqN(new android.content.MutableContextWrapper(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
                this.IL = eqn;
                if (eqn.getWebView() == null) {
                    return;
                }
                this.IL.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.bg.IL.1
                    @Override // android.webkit.WebViewClient
                    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
                        return true;
                    }
                });
                bg(this.IL);
                android.net.Uri uriBuild = android.net.Uri.parse(strEqN).buildUpon().appendQueryParameter("isPreLoad", "1").build();
                com.bytedance.sdk.openadsdk.core.aGH agh = new com.bytedance.sdk.openadsdk.core.aGH(this.IL.getContext());
                this.bg = agh;
                agh.IL(this.IL).bg(this).bg(this.IL);
                com.bytedance.sdk.component.adexpress.zx.zx.bg().bg(this.IL, this.bg);
                this.IL.a_(uriBuild.toString());
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    private void bg(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null || eqn.getWebView() == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(false).bg(eqn.getWebView());
            eqn.setVerticalScrollBarEnabled(false);
            eqn.setHorizontalScrollBarEnabled(false);
            eqn.bg(true);
            eqn.eo();
            eqn.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn.getWebView(), com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE));
            eqn.setMixedContentMode(0);
            eqn.setJavaScriptEnabled(true);
            eqn.setJavaScriptCanOpenWindowsAutomatically(true);
            eqn.setDomStorageEnabled(true);
            eqn.setDatabaseEnabled(true);
            eqn.setAppCacheEnabled(true);
            eqn.setAllowFileAccess(false);
            eqn.setSupportZoom(true);
            eqn.setBuiltInZoomControls(true);
            eqn.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            eqn.setUseWideViewPort(true);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("WebViewPool", e.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.bg.bg
    public void bg() {
        if (this.eqN) {
            com.bytedance.sdk.component.adexpress.zx.zx.bg().IL(this.IL);
        } else {
            com.bytedance.sdk.component.adexpress.zx.zx.bg().bX(this.IL);
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.bX;
        if (atomicInteger != null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.Integer.valueOf(atomicInteger.get());
            java.lang.Boolean.valueOf(this.eqN);
            this.bX.decrementAndGet();
            if (this.bX.get() > 0) {
                IL();
            }
        }
    }
}

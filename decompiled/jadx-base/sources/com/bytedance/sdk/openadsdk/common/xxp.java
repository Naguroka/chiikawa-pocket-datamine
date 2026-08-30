package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class xxp {
    private final com.bytedance.sdk.component.WR.eqN IL;
    private com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg Kg;
    private final com.bytedance.sdk.openadsdk.core.model.tuV bX;
    private final android.widget.LinearLayout bg;
    private final java.lang.String eqN;
    private android.widget.ImageView iR;
    private android.widget.ImageView ldr;
    private final android.content.Context zx;

    public xxp(android.content.Context context, android.widget.LinearLayout linearLayout, com.bytedance.sdk.component.WR.eqN eqn, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        this.zx = context;
        this.bg = linearLayout;
        this.IL = eqn;
        this.bX = tuv;
        this.eqN = str;
        bX();
    }

    private void bX() {
        this.ldr = (android.widget.ImageView) this.bg.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.kU);
        this.iR = (android.widget.ImageView) this.bg.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.qp);
        android.widget.ImageView imageView = (android.widget.ImageView) this.bg.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.eDa);
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.bg.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.RFq);
        this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.xxp.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.common.xxp.this.IL == null || !com.bytedance.sdk.openadsdk.common.xxp.this.IL.zx()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.common.xxp.this.Kg != null) {
                    com.bytedance.sdk.openadsdk.common.xxp.this.Kg.bg();
                }
                com.bytedance.sdk.openadsdk.common.xxp.this.bg("backward");
                com.bytedance.sdk.openadsdk.common.xxp.this.IL.ldr();
            }
        });
        this.iR.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.xxp.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.common.xxp.this.IL == null || !com.bytedance.sdk.openadsdk.common.xxp.this.IL.iR()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.common.xxp.this.bg("forward");
                com.bytedance.sdk.openadsdk.common.xxp.this.IL.Kg();
            }
        });
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.xxp.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.common.xxp.this.IL != null) {
                    com.bytedance.sdk.openadsdk.common.xxp.this.IL("refresh");
                    com.bytedance.sdk.openadsdk.common.xxp.this.IL.eqN();
                }
            }
        });
        imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.xxp.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.common.xxp.this.IL != null) {
                    com.bytedance.sdk.openadsdk.common.xxp.this.IL("external_btn_click");
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    java.lang.String url = com.bytedance.sdk.openadsdk.common.xxp.this.IL.getUrl();
                    if (android.text.TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(android.net.Uri.parse(url));
                    com.bytedance.sdk.component.utils.IL.bg(com.bytedance.sdk.openadsdk.common.xxp.this.zx, intent, null);
                }
            }
        });
        this.bg.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.xxp.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
            }
        });
        this.ldr.setClickable(false);
        this.iR.setClickable(false);
        this.ldr.setColorFilter(android.graphics.Color.parseColor("#A8FFFFFF"), android.graphics.PorterDuff.Mode.ADD);
        this.iR.setColorFilter(android.graphics.Color.parseColor("#A8FFFFFF"), android.graphics.PorterDuff.Mode.ADD);
    }

    public void bg(android.webkit.WebView webView, com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg bgVar) {
        this.Kg = bgVar;
        try {
            if (this.ldr != null) {
                if (webView.canGoBack()) {
                    this.ldr.setClickable(true);
                    this.ldr.clearColorFilter();
                } else {
                    this.ldr.setClickable(false);
                    this.ldr.setColorFilter(android.graphics.Color.parseColor("#A8FFFFFF"), android.graphics.PorterDuff.Mode.ADD);
                }
            }
            if (this.iR != null) {
                if (webView.canGoForward()) {
                    this.iR.setClickable(true);
                    this.iR.clearColorFilter();
                } else {
                    this.iR.setClickable(false);
                    this.iR.setColorFilter(android.graphics.Color.parseColor("#A8FFFFFF"), android.graphics.PorterDuff.Mode.ADD);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg() {
        if (this.bg.getAlpha() == 0.0f) {
            android.animation.ObjectAnimator.ofFloat(this.bg, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    public void IL() {
        if (this.bg.getAlpha() == 1.0f) {
            android.animation.ObjectAnimator.ofFloat(this.bg, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str) {
        android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this.IL.getWebView() != null && (webBackForwardListCopyBackForwardList = this.IL.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                java.lang.String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (android.text.TextUtils.isEmpty(url)) {
                    url = this.IL.getUrl();
                }
                java.lang.String url2 = str.equals("backward") ? webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl() : "";
                int i = 1;
                if (str.equals("forward")) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i = 0;
                }
                jSONObject2.putOpt("first_page", java.lang.Integer.valueOf(i));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (java.lang.Exception unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), this.bX, this.eqN, str, jSONObject, (com.bytedance.sdk.openadsdk.eqN.iR) null, (com.bytedance.sdk.openadsdk.eqN.IL.bg) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(java.lang.String str) {
        android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this.IL.getWebView() != null && (webBackForwardListCopyBackForwardList = this.IL.getWebView().copyBackForwardList()) != null) {
                java.lang.String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (android.text.TextUtils.isEmpty(url)) {
                    url = this.IL.getUrl();
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", java.lang.Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (java.lang.Exception unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), this.bX, this.eqN, str, jSONObject, (com.bytedance.sdk.openadsdk.eqN.iR) null, (com.bytedance.sdk.openadsdk.eqN.IL.bg) null);
    }
}

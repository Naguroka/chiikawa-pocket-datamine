package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTWebsiteActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity {
    private com.bytedance.sdk.openadsdk.common.VzQ IL;
    private android.webkit.WebView bX;
    private java.lang.String bg = null;

    public static void bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), tuv, str, "open_policy");
        if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.VzQ.eqN().ayS())) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.class);
        if (tuv != null) {
            intent.putExtra("_extra_meta", tuv.gCm().toString());
            intent.putExtra("_extra_glo_d", tuv.Hn());
        }
        com.bytedance.sdk.component.utils.IL.bg(context, intent, null);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.VzQ.IL(getApplicationContext());
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            finish();
            return;
        }
        final java.lang.String stringExtra = getIntent().getStringExtra("_extra_meta");
        java.lang.String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(this);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            zxVar.setFitsSystemWindows(true);
        }
        zxVar.setBackgroundColor(-1);
        zxVar.setId(520093726);
        zxVar.setOrientation(1);
        zxVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(zxVar);
            int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 5.0f);
            int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 8.0f);
            int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 10.0f);
            int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 12.0f);
            int iBX5 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 14.0f);
            int iBX6 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 20.0f);
            int iBX7 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 24.0f);
            int iBX8 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 40.0f);
            int iBX9 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f);
            int iBX10 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(this);
            iRVar.setGravity(15);
            iRVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, iBX9));
            com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(this);
            eqn.setId(520093720);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iBX8, iBX9);
            layoutParams.setMarginStart(iBX2);
            eqn.setLayoutParams(layoutParams);
            eqn.setClickable(true);
            eqn.setFocusable(true);
            eqn.setPadding(iBX5, iBX4, iBX5, iBX4);
            eqn.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this, "tt_ad_arrow_backward"));
            final com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = new com.bytedance.sdk.openadsdk.core.zx.eqN(this);
            eqn2.setId(520093716);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(iBX8, iBX9);
            layoutParams2.addRule(17, 520093720);
            eqn2.setLayoutParams(layoutParams2);
            eqn2.setClickable(true);
            eqn2.setFocusable(true);
            eqn2.setPadding(iBX4, iBX5, iBX4, iBX5);
            eqn2.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this, "tt_ad_xmark"));
            com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(this);
            kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.xFs);
            android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(iBX10, iBX7);
            layoutParams3.setMarginStart(iBX);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            kg.setLayoutParams(layoutParams3);
            kg.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            kg.setGravity(17);
            kg.setSingleLine(true);
            kg.setTextColor(android.graphics.Color.parseColor("#222222"));
            kg.setTextSize(17.0f);
            com.bytedance.sdk.openadsdk.core.zx.eqN eqn3 = new com.bytedance.sdk.openadsdk.core.zx.eqN(this);
            eqn3.setId(520093741);
            android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(iBX8, iBX9);
            layoutParams4.addRule(16, 520093742);
            eqn3.setLayoutParams(layoutParams4);
            eqn3.setPadding(iBX3, iBX4, iBX3, iBX4);
            eqn3.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this, "tt_ad_link"));
            com.bytedance.sdk.openadsdk.core.zx.eqN eqn4 = new com.bytedance.sdk.openadsdk.core.zx.eqN(this);
            eqn4.setId(520093742);
            android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(iBX8, iBX9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iBX2);
            eqn4.setLayoutParams(layoutParams5);
            eqn4.setPadding(iBX4, iBX6, iBX4, iBX6);
            eqn4.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this, "tt_ad_threedots"));
            final com.bytedance.sdk.openadsdk.core.zx.ldr ldrVar = new com.bytedance.sdk.openadsdk.core.zx.ldr(this, null, android.R.style.Widget.ProgressBar.Horizontal);
            ldrVar.setId(520093743);
            android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 2.0f));
            layoutParams6.addRule(12);
            ldrVar.setLayoutParams(layoutParams6);
            ldrVar.setProgress(1);
            ldrVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_privacy_progress_style"));
            android.view.View view = new android.view.View(this);
            android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            iRVar.addView(eqn);
            iRVar.addView(eqn2);
            iRVar.addView(kg);
            iRVar.addView(eqn3);
            iRVar.addView(eqn4);
            iRVar.addView(ldrVar);
            iRVar.addView(view);
            zxVar.addView(iRVar);
            try {
                android.webkit.WebView webView = new android.webkit.WebView(getApplicationContext());
                this.bX = webView;
                webView.setBackgroundColor(-1);
                zxVar.addView(this.bX, new android.view.ViewGroup.LayoutParams(-1, -1));
                eqn.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view2) {
                        if (com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.bX.canGoBack()) {
                            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.bX.goBack();
                        } else {
                            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.finish();
                        }
                    }
                });
                eqn2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view2) {
                        com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.finish();
                    }
                });
                eqn2.setVisibility(4);
                eqn2.setClickable(false);
                kg.setText(com.bytedance.sdk.component.utils.Fy.bg(this, "tt_privacy_title"));
                eqn3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view2) {
                        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                        java.lang.String url = com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.bX.getUrl();
                        if (android.text.TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(android.net.Uri.parse(url));
                        com.bytedance.sdk.component.utils.IL.bg(com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this, intent, null);
                    }
                });
                eqn4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view2) {
                        if (com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.IL == null) {
                            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.IL = new com.bytedance.sdk.openadsdk.common.VzQ(com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this);
                            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.IL.bg(stringExtra);
                            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.IL.setCanceledOnTouchOutside(false);
                        }
                        com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.IL.show();
                    }
                });
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN() != null) {
                    this.bg = com.bytedance.sdk.openadsdk.core.VzQ.eqN().ayS();
                    if (!android.text.TextUtils.isEmpty(stringExtra2)) {
                        java.lang.String strEncode = java.net.URLEncoder.encode(stringExtra2);
                        if (this.bg.contains("?")) {
                            this.bg += "&gdid_encrypted=" + strEncode;
                        } else {
                            this.bg += "?gdid_encrypted=" + strEncode;
                        }
                    }
                }
                if (this.bg != null) {
                    android.webkit.WebSettings settings = this.bX.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (java.lang.Throwable unused) {
                    }
                    java.util.HashMap map = new java.util.HashMap();
                    map.put(com.google.common.net.HttpHeaders.REFERER, com.bytedance.sdk.openadsdk.TTAdConstant.REQUEST_HEAD_REFERER);
                    try {
                        this.bX.loadUrl(this.bg, map);
                    } catch (java.lang.Throwable unused2) {
                        this.bX.loadUrl(this.bg);
                    }
                    this.bX.setWebChromeClient(new android.webkit.WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(android.webkit.WebView webView2, int i) {
                            super.onProgressChanged(webView2, i);
                            if (ldrVar == null || com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.this.isFinishing()) {
                                return;
                            }
                            if (i == 100) {
                                ldrVar.setVisibility(8);
                                if (webView2.canGoBack()) {
                                    eqn2.setVisibility(0);
                                    eqn2.setClickable(true);
                                    return;
                                } else {
                                    eqn2.setVisibility(4);
                                    eqn2.setClickable(false);
                                    return;
                                }
                            }
                            ldrVar.setVisibility(0);
                            ldrVar.setProgress(i);
                        }
                    });
                    this.bX.setWebViewClient(new com.bytedance.sdk.component.WR.eqN.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView2, android.webkit.WebResourceRequest webResourceRequest) {
                            if (webView2 == null || webResourceRequest == null) {
                                return false;
                            }
                            webView2.loadUrl(webResourceRequest.getUrl().toString());
                            return true;
                        }

                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(android.webkit.WebView webView2, java.lang.String str) {
                            super.onPageFinished(webView2, str);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(android.webkit.WebView webView2, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            com.bytedance.sdk.component.utils.PX.bg("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(java.lang.String.valueOf(webResourceResponse)));
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(android.webkit.WebView webView2, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            com.bytedance.sdk.component.utils.PX.bg("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(android.webkit.WebView webView2, int i, java.lang.String str, java.lang.String str2) {
                            super.onReceivedError(webView2, i, str, str2);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.bg.bX.IL(this.bX);
                    return;
                }
                finish();
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (java.lang.Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.bytedance.sdk.openadsdk.core.daV.bg(this.bX);
        super.onDestroy();
    }
}

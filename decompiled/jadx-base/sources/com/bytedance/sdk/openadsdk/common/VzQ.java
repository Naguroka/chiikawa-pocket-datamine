package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class VzQ extends android.app.Dialog {
    private static final java.lang.String[] IL = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private java.lang.String bX;
    private final android.os.Handler bg;
    private android.widget.TextView eqN;
    private android.widget.ImageView ldr;
    private android.widget.Button zx;

    public VzQ(android.content.Context context) {
        super(context, com.bytedance.sdk.component.utils.Fy.ldr(context, "tt_privacy_dialog_theme_ad_report"));
        this.bg = new android.os.Handler(android.os.Looper.getMainLooper());
        this.bX = "";
    }

    public void bg(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            this.bX = com.bytedance.sdk.component.utils.bg.bg(new org.json.JSONObject(str)).toString();
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTPrivacyAdReportDialog", e.getMessage());
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(bg(getContext()), new android.view.ViewGroup.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext()), (int) (((double) com.bytedance.sdk.openadsdk.utils.ZQc.eqN(getContext())) * 0.9d)));
        IL();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    private void IL() {
        final java.lang.String strZx = com.bytedance.sdk.openadsdk.utils.ayS.zx();
        final java.lang.String strIR = com.bytedance.sdk.openadsdk.utils.ayS.iR();
        final java.lang.String str = "Android " + android.os.Build.VERSION.RELEASE;
        final java.lang.String str2 = android.os.Build.BRAND + " " + android.os.Build.MODEL;
        this.zx.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.VzQ.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) com.bytedance.sdk.openadsdk.common.VzQ.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.String[] strArr = {com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME, strZx, strIR, str, str2, com.bytedance.sdk.openadsdk.common.VzQ.this.bX};
                    for (int i = 0; i < com.bytedance.sdk.openadsdk.common.VzQ.IL.length; i++) {
                        sb.append(com.bytedance.sdk.openadsdk.common.VzQ.IL[i]).append(": ").append(strArr[i]).append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        });
        this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.VzQ.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.common.VzQ.this.eqN.setText("loading ...");
                com.bytedance.sdk.openadsdk.common.VzQ.this.cancel();
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.bg.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.VzQ.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.common.VzQ.this.eqN.setText(com.bytedance.sdk.openadsdk.common.VzQ.this.bX);
                }
            }, 1000L);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    private android.view.View bg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        zxVar.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_ad_report_info_bg"));
        zxVar.setOrientation(1);
        zxVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, bg(44.0f)));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(bg(191.0f), bg(24.0f));
        layoutParams2.addRule(13);
        kg.setGravity(17);
        kg.setText("Ad Report");
        kg.setTextColor(android.graphics.Color.parseColor("#161823"));
        kg.setTextSize(1, 17.0f);
        kg.setLayoutParams(layoutParams2);
        this.ldr = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(bg(40.0f), bg(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = bg(8.0f);
        this.ldr.setPadding(bg(12.0f), bg(14.0f), bg(12.0f), bg(14.0f));
        this.ldr.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_xmark"));
        this.ldr.setLayoutParams(layoutParams3);
        android.view.View view = new android.view.View(context);
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.view.ViewGroup.LayoutParams(-1, bg(0.5f));
        view.setBackgroundColor(android.graphics.Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        android.widget.ScrollView scrollView = new android.widget.ScrollView(context);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = bg(16.0f);
        layoutParams5.rightMargin = bg(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(bg(16.0f));
        layoutParams5.setMarginEnd(bg(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.view.ViewGroup.LayoutParams(-1, -1);
        zxVar2.setOrientation(1);
        zxVar2.setLayoutParams(layoutParams6);
        java.lang.String strZx = com.bytedance.sdk.openadsdk.utils.ayS.zx();
        java.lang.String strIR = com.bytedance.sdk.openadsdk.utils.ayS.iR();
        java.lang.String str = "Android " + android.os.Build.VERSION.RELEASE;
        java.lang.String str2 = android.os.Build.BRAND + " " + android.os.Build.MODEL;
        com.bytedance.sdk.openadsdk.core.zx.zx zxVarBg = bg(context, "SDK version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVarBg2 = bg(context, "App", strZx);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVarBg3 = bg(context, "App version", strIR);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVarBg4 = bg(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVarBg5 = bg(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVarBg6 = bg(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar3 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(-1, bg(76.0f));
        zxVar3.setBackgroundColor(-1);
        zxVar3.setLayoutParams(layoutParams7);
        this.zx = new android.widget.Button(context);
        android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        int iBg = bg(16.0f);
        layoutParams8.setMargins(iBg, iBg, iBg, iBg);
        this.zx.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_ad_report_info_button_bg"));
        this.zx.setText("copy all");
        this.zx.setTextColor(android.graphics.Color.parseColor("#333333"));
        this.zx.setTextSize(14.0f);
        this.zx.setLayoutParams(layoutParams8);
        zxVar.addView(iRVar);
        iRVar.addView(kg);
        iRVar.addView(this.ldr);
        zxVar.addView(view);
        zxVar.addView(scrollView);
        scrollView.addView(zxVar2);
        zxVar2.addView(zxVarBg);
        zxVar2.addView(zxVarBg2);
        zxVar2.addView(zxVarBg3);
        zxVar2.addView(zxVarBg4);
        zxVar2.addView(zxVarBg5);
        zxVar2.addView(zxVarBg6);
        zxVar.addView(zxVar3);
        zxVar3.addView(this.zx);
        return zxVar;
    }

    private com.bytedance.sdk.openadsdk.core.zx.zx bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : bg(74.0f));
        zxVar.setOrientation(1);
        zxVar.setPadding(0, bg(16.0f), 0, bg(16.0f));
        zxVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = bg(7.0f);
        kg.setIncludeFontPadding(false);
        kg.setText(str);
        kg.setTextColor(android.graphics.Color.parseColor("#333333"));
        kg.setTextSize(16.0f);
        kg.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        kg.setLayoutParams(layoutParams2);
        zxVar.addView(kg);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        if (str.equals("Creative info")) {
            this.eqN = kg2;
        }
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        kg2.setIncludeFontPadding(false);
        kg2.setTextColor(android.graphics.Color.parseColor("#666666"));
        kg2.setText(str2);
        kg2.setTextSize(14.0f);
        kg2.setLayoutParams(layoutParams3);
        zxVar.addView(kg2);
        return zxVar;
    }

    private int bg(float f) {
        return com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), f);
    }
}

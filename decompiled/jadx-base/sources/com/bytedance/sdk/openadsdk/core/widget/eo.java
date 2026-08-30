package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class eo extends android.widget.FrameLayout {
    private com.bytedance.sdk.openadsdk.core.widget.VzQ IL;
    private com.bytedance.sdk.openadsdk.core.model.tuV Kg;
    private java.lang.String WR;
    private android.widget.TextView bX;
    private boolean bg;
    private com.bytedance.sdk.openadsdk.core.IL.bg eo;
    private com.bytedance.sdk.openadsdk.core.widget.xxp eqN;
    private com.bytedance.sdk.openadsdk.core.zx.Kg iR;
    private com.bytedance.sdk.openadsdk.core.widget.PAGLogoView ldr;
    private android.widget.TextView zx;

    public eo(android.content.Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.Ta.jf);
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.core.IL.bg bgVar) {
        this.Kg = tuv;
        this.WR = str;
        this.eo = bgVar;
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.IL.bg bgVar) {
        this.eo = bgVar;
        android.widget.TextView textView = this.zx;
        if (textView != null) {
            textView.setOnClickListener(bgVar);
            this.zx.setOnTouchListener(this.eo);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            bg();
        }
    }

    private void bg() {
        if (this.bg) {
            return;
        }
        this.bg = true;
        IL();
        this.zx.setOnClickListener(this.eo);
        this.zx.setOnTouchListener(this.eo);
        java.lang.String strZCS = this.Kg.zCS();
        if (!android.text.TextUtils.isEmpty(strZCS)) {
            this.zx.setText(strZCS);
        }
        if (this.IL != null && this.Kg.sVc() != null && !android.text.TextUtils.isEmpty(this.Kg.sVc().bg())) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.Kg.sVc(), this.IL, this.Kg);
        }
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = this.eqN;
        if (xxpVar != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.widget.TextView) null, xxpVar, this.Kg);
            if (this.Kg.RiO() != null) {
                this.eqN.setVisibility(0);
            }
        }
        if (this.bX != null) {
            if (this.Kg.RiO() != null && !android.text.TextUtils.isEmpty(this.Kg.RiO().IL())) {
                this.bX.setText(this.Kg.RiO().IL());
            } else if (!android.text.TextUtils.isEmpty(this.Kg.bN())) {
                this.bX.setText(this.Kg.bN());
            } else {
                this.bX.setVisibility(8);
            }
        }
        if (this.iR != null) {
            java.lang.String strWS = this.Kg.wS();
            if (!android.text.TextUtils.isEmpty(strWS)) {
                this.iR.setText(strWS);
            } else {
                this.iR.setVisibility(8);
            }
        }
        this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.eo.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.widget.eo.this.getContext(), com.bytedance.sdk.openadsdk.core.widget.eo.this.Kg, com.bytedance.sdk.openadsdk.core.widget.eo.this.WR);
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }

    private void IL() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.content.Context context = getContext();
        boolean z = this.Kg.xFs() == 1;
        setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setGravity(1);
        zxVar.setOrientation(1);
        if (z) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        layoutParams.rightMargin = iBX;
        layoutParams.leftMargin = iBX;
        addView(zxVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.IL = vzQ;
        vzQ.setBackgroundColor(0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 80.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 80.0f));
        layoutParams2.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        zxVar.addView(this.IL, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.bX = kg;
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.bX.setGravity(17);
        this.bX.setMaxLines(2);
        this.bX.setMaxWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 180.0f));
        this.bX.setTextColor(-1);
        this.bX.setTextSize(2, 24.0f);
        zxVar.addView(this.bX, new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.iR = kg2;
        kg2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.iR.setGravity(17);
        this.iR.setMaxLines(2);
        this.iR.setTextColor(android.graphics.Color.parseColor("#BFFFFFFF"));
        this.iR.setTextSize(2, 16.0f);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        zxVar.addView(this.iR, layoutParams3);
        this.eqN = new com.bytedance.sdk.openadsdk.core.widget.xxp(context, true);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f));
        layoutParams4.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        this.eqN.setVisibility(8);
        zxVar.addView(this.eqN, layoutParams4);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.zx = kg3;
        kg3.setId(520093707);
        this.zx.setGravity(17);
        this.zx.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        this.zx.setTextColor(-1);
        this.zx.setTextSize(2, 16.0f);
        this.zx.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_reward_full_video_backup_btn_bg"));
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f));
        layoutParams5.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 54.0f);
        zxVar.addView(this.zx, layoutParams5);
        this.ldr = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(context);
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        }
        addView(this.ldr, layoutParams6);
    }
}

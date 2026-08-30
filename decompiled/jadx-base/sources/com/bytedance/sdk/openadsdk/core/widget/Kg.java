package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends com.bytedance.sdk.openadsdk.core.zx.iR {
    private com.bytedance.sdk.openadsdk.core.zx.Kg IL;
    private com.bytedance.sdk.openadsdk.core.widget.WR bX;
    private com.bytedance.sdk.openadsdk.core.widget.VzQ bg;
    private com.bytedance.sdk.openadsdk.core.zx.Kg eqN;
    private boolean iR;
    private boolean ldr;
    private com.bytedance.sdk.openadsdk.core.zx.eqN zx;

    protected boolean bg() {
        return true;
    }

    public Kg(android.content.Context context) {
        super(context);
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        if (bg()) {
            IL();
        }
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        if (!this.ldr || tuv == null || this.iR) {
            return;
        }
        this.iR = true;
        boolean zRJ = tuv.RJ();
        if (!zRJ && tuv.sVc() != null && !android.text.TextUtils.isEmpty(tuv.sVc().bg())) {
            try {
                com.bytedance.sdk.openadsdk.WR.eqN.bg(tuv.sVc()).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, tuv.sVc().bg(), new com.bytedance.sdk.openadsdk.utils.Ja(this.bg)));
            } catch (java.lang.Throwable unused) {
                this.bg.setVisibility(8);
            }
        } else {
            this.bg.setVisibility(8);
        }
        if (zRJ) {
            this.IL.setText("Loading");
        } else if (!android.text.TextUtils.isEmpty(tuv.wS())) {
            this.IL.setText(tuv.wS());
        } else {
            this.IL.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = this.eqN;
        if (kg != null) {
            kg.setText(tuv.zCS());
        }
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = this.zx;
        if (eqn != null) {
            eqn.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Kg.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    android.content.Context context = com.bytedance.sdk.openadsdk.core.widget.Kg.this.getContext();
                    com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(context, tuv2, com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv2));
                }
            });
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.zx.getLayoutParams();
            if (i == 1) {
                marginLayoutParams.width = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 64.0f);
                marginLayoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 24.0f);
                marginLayoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 60.0f);
            } else {
                marginLayoutParams.width = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 41.0f);
                marginLayoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 15.0f);
                marginLayoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 24.0f);
            }
            this.zx.setLayoutParams(marginLayoutParams);
        }
    }

    public void IL() {
        if (this.ldr) {
            return;
        }
        this.ldr = true;
        android.content.Context context = getContext();
        setBackgroundColor(android.graphics.Color.parseColor("#2E2E2E"));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.bg = vzQ;
        vzQ.setId(520093745);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 64.0f);
        this.bg.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(iBX, iBX));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.IL = kg;
        kg.setId(520093746);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 219.0f), -2);
        layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        this.IL.setLayoutParams(layoutParams2);
        this.IL.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.IL.setGravity(17);
        this.IL.setMaxWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 150.0f));
        this.IL.setMaxLines(2);
        this.IL.setTextColor(-1);
        this.IL.setTextSize(1, 16.0f);
        com.bytedance.sdk.openadsdk.core.widget.WR wr = new com.bytedance.sdk.openadsdk.core.widget.WR(context);
        this.bX = wr;
        wr.setId(520093748);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 219.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f));
        layoutParams3.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        this.bX.setLayoutParams(layoutParams3);
        this.eqN = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 138.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 42.0f));
        layoutParams4.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f);
        this.eqN.setLayoutParams(layoutParams4);
        this.eqN.setTextColor(-1);
        this.eqN.setTextSize(16.0f);
        this.eqN.setGravity(17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.eqN.setBackground(gradientDrawable);
        linearLayout.addView(this.bg);
        linearLayout.addView(this.IL);
        linearLayout.addView(this.bX);
        linearLayout.addView(this.eqN);
        bg(context);
        addView(linearLayout);
        addView(this.zx);
    }

    public void bg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        this.zx = eqn;
        eqn.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_ad_logo_big"));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 64.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f));
        layoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 60.0f);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.zx.setLayoutParams(layoutParams);
    }

    public com.bytedance.sdk.openadsdk.core.widget.WR getLoadingProgressBar() {
        return this.bX;
    }

    public com.bytedance.sdk.openadsdk.core.zx.Kg getDownloadButton() {
        return this.eqN;
    }

    public void setProgress(int i) {
        com.bytedance.sdk.openadsdk.core.widget.WR wr = this.bX;
        if (wr != null) {
            wr.setProgress(i);
        }
    }
}

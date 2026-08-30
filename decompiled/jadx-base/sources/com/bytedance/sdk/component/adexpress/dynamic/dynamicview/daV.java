package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class daV extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr implements com.bytedance.sdk.component.adexpress.dynamic.zx {
    boolean Fy;
    android.widget.FrameLayout IL;
    android.widget.TextView bg;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public boolean zx() {
        return true;
    }

    public daV(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Fy = false;
        this.Lq = new android.view.View(context);
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        this.bg = new android.widget.TextView(context);
        this.IL = new android.widget.FrameLayout(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.bg.setLayoutParams(layoutParams);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(android.graphics.Color.parseColor("#57000000"));
        this.bg.setBackground(gradientDrawable);
        this.bg.setTextSize(10.0f);
        this.bg.setGravity(17);
        this.bg.setTextColor(-1);
        this.bg.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            addView(this.IL, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.bg);
        addView(this.Lq, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.eqN.IL()) {
            addView(this.IL, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.IL;
        dynamicRootView.setVideoListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        double dZx = 0.0d;
        double dEqN = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kgPX = this.Ta; kgPX != null; kgPX = kgPX.PX()) {
            double dLdr = dEqN + ((double) kgPX.ldr());
            double dIR = dZx + ((double) kgPX.iR());
            dEqN = dLdr - ((double) kgPX.eqN());
            dZx = dIR - ((double) kgPX.zx());
        }
        try {
            float f = (float) dEqN;
            int iBg = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), f);
            int iBg2 = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), f + this.zx);
            if (com.bytedance.sdk.component.adexpress.eqN.IL.bg(getContext())) {
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tuV tuv = (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tuV) this.yDt.getChildAt(0);
                int dynamicWidth = tuv.getDynamicWidth();
                int i = dynamicWidth - iBg2;
                iBg2 = dynamicWidth - iBg;
                iBg = i;
            }
            if (!"open_ad".equals(this.yDt.getRenderRequest().eqN())) {
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tuV tuv2 = (com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tuV) this.yDt.getChildAt(0);
                float f2 = (float) dZx;
                tuv2.bg.bg(iBg, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), f2), iBg2, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), f2 + this.ldr));
            } else {
                this.yDt.videoView = this.IL;
            }
        } catch (java.lang.Exception unused) {
        }
        this.yDt.updateRenderInfoForVideo(dEqN, dZx, this.zx, this.ldr, this.PX.Lq());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zx
    public void setTimeUpdate(int i) {
        java.lang.String str;
        if (this.Ta.eo().zx().KRc() && i > 0 && !this.Fy) {
            java.lang.String str2 = (i >= 60 ? "0" + (i / 60) : "00") + ":";
            int i2 = i % 60;
            if (i2 > 9) {
                str = str2 + i2;
            } else {
                str = str2 + "0" + i2;
            }
            this.bg.setText(str);
            this.bg.setVisibility(0);
            return;
        }
        this.Fy = true;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            bX(getChildAt(i3));
        }
        this.bg.setVisibility(8);
    }

    private void bX(android.view.View view) {
        if (view == this.bg || view == this.tuV) {
            return;
        }
        try {
            if (((java.lang.Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.bg.ldr)).intValue() == 1) {
                return;
            }
        } catch (java.lang.Throwable unused) {
        }
        int i = 0;
        view.setVisibility(0);
        if (!(view instanceof android.view.ViewGroup)) {
            return;
        }
        while (true) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            bX(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zx
    public void bg() {
        this.bg.setVisibility(8);
    }
}

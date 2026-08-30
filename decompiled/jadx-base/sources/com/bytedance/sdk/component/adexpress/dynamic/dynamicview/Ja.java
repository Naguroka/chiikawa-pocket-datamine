package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class Ja extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    public Ja(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Kg += 6;
        if (this.PX.CQc()) {
            this.Lq = new com.bytedance.sdk.component.adexpress.ldr.bg(context, this.PX.iR(), this.PX.zx(), 1, this.PX.Kg());
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).setMaxLines(1);
        } else {
            this.Lq = new android.widget.TextView(context);
            ((android.widget.TextView) this.Lq).setIncludeFontPadding(false);
        }
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        addView(this.Lq, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        int i;
        double d;
        super.WR();
        if (android.text.TextUtils.isEmpty(getText())) {
            this.Lq.setVisibility(4);
            return true;
        }
        if (this.PX.CQc()) {
            VB();
            return true;
        }
        ((android.widget.TextView) this.Lq).setText(this.PX.ldr());
        ((android.widget.TextView) this.Lq).setTextDirection(5);
        this.Lq.setTextAlignment(this.PX.Kg());
        ((android.widget.TextView) this.Lq).setTextColor(this.PX.iR());
        ((android.widget.TextView) this.Lq).setTextSize(this.PX.zx());
        if (!this.PX.tC()) {
            ((android.widget.TextView) this.Lq).setMaxLines(1);
            ((android.widget.TextView) this.Lq).setGravity(17);
            ((android.widget.TextView) this.Lq).setEllipsize(android.text.TextUtils.TruncateAt.END);
        } else {
            int iRri = this.PX.rri();
            if (iRri > 0) {
                ((android.widget.TextView) this.Lq).setLines(iRri);
                ((android.widget.TextView) this.Lq).setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
        }
        if (this.Ta != null && this.Ta.eo() != null) {
            if (com.bytedance.sdk.component.adexpress.eqN.IL() && bg() && (android.text.TextUtils.equals(this.Ta.eo().IL(), "text_star") || android.text.TextUtils.equals(this.Ta.eo().IL(), "score-count") || android.text.TextUtils.equals(this.Ta.eo().IL(), "score-count-type-1") || android.text.TextUtils.equals(this.Ta.eo().IL(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (android.text.TextUtils.equals(this.Ta.eo().IL(), "score-count") || android.text.TextUtils.equals(this.Ta.eo().IL(), "score-count-type-2")) {
                try {
                    try {
                        i = java.lang.Integer.parseInt(getText());
                    } catch (java.lang.NumberFormatException unused) {
                        i = -1;
                    }
                    if (i < 0) {
                        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                            setVisibility(8);
                            return true;
                        }
                        this.Lq.setVisibility(0);
                    }
                    if (android.text.TextUtils.equals(this.Ta.eo().IL(), "score-count-type-2")) {
                        ((android.widget.TextView) this.Lq).setText(java.lang.String.format(new java.text.DecimalFormat("(###,###,###)").format(i), java.lang.Integer.valueOf(i)));
                        ((android.widget.TextView) this.Lq).setGravity(17);
                        return true;
                    }
                    bg((android.widget.TextView) this.Lq, i, getContext(), "tt_comment_num");
                } catch (java.lang.Exception unused2) {
                }
            } else if (android.text.TextUtils.equals(this.Ta.eo().IL(), "text_star")) {
                try {
                    d = java.lang.Double.parseDouble(getText());
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("DynamicStarView applyNativeStyle", e.toString());
                    d = -1.0d;
                }
                if (d < 0.0d || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                        setVisibility(8);
                        return true;
                    }
                    this.Lq.setVisibility(0);
                }
                ((android.widget.TextView) this.Lq).setIncludeFontPadding(false);
                ((android.widget.TextView) this.Lq).setText(java.lang.String.format("%.1f", java.lang.Double.valueOf(d)));
            } else if (android.text.TextUtils.equals("privacy-detail", this.Ta.eo().IL())) {
                ((android.widget.TextView) this.Lq).setText("Permission list | Privacy policy");
            } else if (android.text.TextUtils.equals(this.Ta.eo().IL(), "development-name")) {
                ((android.widget.TextView) this.Lq).setText(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_text_privacy_development") + getText());
            } else if (android.text.TextUtils.equals(this.Ta.eo().IL(), "app-version")) {
                ((android.widget.TextView) this.Lq).setText(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_text_privacy_app_version") + getText());
            } else {
                ((android.widget.TextView) this.Lq).setText(getText());
            }
            this.Lq.setTextAlignment(this.PX.Kg());
            ((android.widget.TextView) this.Lq).setGravity(this.PX.WR());
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                eo();
            }
        }
        return true;
    }

    private boolean bg() {
        return (this.yDt == null || this.yDt.getRenderRequest() == null || this.yDt.getRenderRequest().eo() == 4) ? false : true;
    }

    private void eo() {
        int iBg;
        if (android.text.TextUtils.equals(this.Ta.eo().IL(), "source") || android.text.TextUtils.equals(this.Ta.eo().IL(), com.ironsource.y8.h.D0) || android.text.TextUtils.equals(this.Ta.eo().IL(), "text_star")) {
            int[] iArrIL = com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL(this.PX.ldr(), this.PX.zx(), true);
            int iBg2 = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), this.PX.IL());
            int iBg3 = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), this.PX.bX());
            int iBg4 = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), this.PX.eqN());
            int iBg5 = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), this.PX.bg());
            int iMin = java.lang.Math.min(iBg2, iBg5);
            if (android.text.TextUtils.equals(this.Ta.eo().IL(), "source") && (iBg = ((this.Kg - ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), this.PX.zx()))) - iBg2) - iBg5) > 1 && iBg <= iMin * 2) {
                int i = iBg / 2;
                this.Lq.setPadding(iBg3, iBg2 - i, iBg4, iBg5 - (iBg - i));
                return;
            }
            int i2 = (((iArrIL[1] + iBg2) + iBg5) - this.Kg) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= iMin * 2) {
                int i3 = i2 / 2;
                this.Lq.setPadding(iBg3, iBg2 - i3, iBg4, iBg5 - (i2 - i3));
            } else if (i2 > iBg2 + iBg5) {
                final int i4 = (i2 - iBg2) - iBg5;
                this.Lq.setPadding(iBg3, 0, iBg4, 0);
                if (i4 <= ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), 1.0f)) + 1) {
                    ((android.widget.TextView) this.Lq).setTextSize(this.PX.zx() - 1.0f);
                } else if (i4 <= (((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(getContext(), 1.0f)) + 1) * 2) {
                    ((android.widget.TextView) this.Lq).setTextSize(this.PX.zx() - 2.0f);
                } else {
                    post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                android.view.ViewGroup.LayoutParams layoutParams = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja.this.Lq.getLayoutParams();
                                layoutParams.height = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja.this.Kg + i4;
                                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja.this.Lq.setLayoutParams(layoutParams);
                                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja.this.Lq.setTranslationY(-i4);
                                android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja.this.Lq.getParent();
                                viewGroup.setClipChildren(false);
                                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja.this.Lq.getParent().getParent();
                                viewGroup2.setClipChildren(false);
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iBg2 > iBg5) {
                this.Lq.setPadding(iBg3, iBg2 - (i2 - iMin), iBg4, iBg5 - iMin);
            } else {
                this.Lq.setPadding(iBg3, iBg2 - iMin, iBg4, iBg5 - (i2 - iMin));
            }
        }
        if (android.text.TextUtils.equals(this.Ta.eo().IL(), "fillButton")) {
            this.Lq.setTextAlignment(2);
            ((android.widget.TextView) this.Lq).setGravity(17);
        }
    }

    public java.lang.String getText() {
        java.lang.String strLdr = this.PX.ldr();
        if (android.text.TextUtils.isEmpty(strLdr)) {
            if (!com.bytedance.sdk.component.adexpress.eqN.IL() && android.text.TextUtils.equals(this.Ta.eo().IL(), "text_star")) {
                strLdr = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.eqN.IL() && android.text.TextUtils.equals(this.Ta.eo().IL(), "score-count")) {
                strLdr = "6870";
            }
        }
        return (android.text.TextUtils.equals(this.Ta.eo().IL(), com.ironsource.y8.h.D0) || android.text.TextUtils.equals(this.Ta.eo().IL(), "subtitle")) ? strLdr.replace("\n", "") : strLdr;
    }

    public void bg(android.widget.TextView textView, int i, android.content.Context context, java.lang.String str) {
        textView.setText("(" + java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(context, str), java.lang.Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    private void VB() {
        if (this.Lq instanceof com.bytedance.sdk.component.adexpress.ldr.bg) {
            java.lang.String text = getText();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (org.json.JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).setTextColor(this.PX.iR());
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).setTextSize(this.PX.zx());
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).setAnimationType(this.PX.qC());
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).setAnimationDuration(this.PX.uu() * 1000);
            ((com.bytedance.sdk.component.adexpress.ldr.bg) this.Lq).bg();
        }
    }
}

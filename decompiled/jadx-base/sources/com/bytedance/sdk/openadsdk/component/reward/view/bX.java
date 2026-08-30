package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.core.zx.zx {
    private android.widget.TextView IL;
    private com.bytedance.sdk.openadsdk.core.widget.VzQ bX;
    private com.bytedance.sdk.openadsdk.core.widget.xxp bg;
    private android.widget.TextView eqN;
    private com.bytedance.sdk.openadsdk.component.reward.bg.bg ldr;
    private boolean zx;

    public bX(android.content.Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.zx) {
            return;
        }
        bX();
    }

    private void bX() {
        this.zx = true;
        if (this.ldr.GvG == 1) {
            zx();
        } else {
            eqN();
        }
        if (this.IL == null) {
            this.IL = (android.widget.TextView) this.ldr.CQc.findViewById(520093705);
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.ldr.IL;
        android.widget.TextView textView = this.IL;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.bX.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((android.view.ViewGroup) com.bytedance.sdk.openadsdk.component.reward.view.bX.this.IL.getParent()).getWidth();
                    if (width > 0) {
                        com.bytedance.sdk.openadsdk.component.reward.view.bX.this.IL.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (tuv.HXG()) {
                if (tuv.hi() != null && android.text.TextUtils.isEmpty(tuv.hi().ldr())) {
                    com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.IL, 8);
                }
            } else {
                this.IL.setText(tuv.Uq() == 3 ? getButtonTextForNewStyleBar() : tuv.zCS());
            }
        }
        if (this.bX != null && tuv.sVc() != null && !android.text.TextUtils.isEmpty(tuv.sVc().bg())) {
            java.lang.String strBg = tuv.sVc().bg();
            if (tuv.HXG()) {
                com.bytedance.sdk.openadsdk.WR.eqN.bg(tuv.sVc()).bX(2).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, tuv.sVc().bg(), new com.bytedance.sdk.openadsdk.component.reward.view.bX.bg(this.bX, tuv, strBg, this.ldr.zx)));
                if (tuv.hi() != null && tuv.hi().IL() != null) {
                    tuv.hi().IL().IL(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(tuv.sVc(), this.bX, tuv);
            }
        }
        android.widget.TextView textView2 = this.eqN;
        if (textView2 != null) {
            textView2.setText(tuv.wS());
        }
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = this.bg;
        if (xxpVar != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.widget.TextView) null, xxpVar, tuv);
        }
        if (this.ldr.GvG == 2 && tuv.Uq() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.IL.getLayoutParams();
            layoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.ldr.Dxa, 55.0f);
            layoutParams.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.ldr.Dxa, 20.0f);
            this.IL.setLayoutParams(layoutParams);
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.ldr.Dxa, 12.0f);
            setLayoutParams(layoutParams2);
        }
        IL();
    }

    private void eqN() {
        setOrientation(0);
        setGravity(16);
        android.content.Context context = getContext();
        setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f));
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.bX = vzQ;
        vzQ.setBackgroundColor(0);
        this.bX.setId(com.bytedance.sdk.openadsdk.utils.Ta.IL);
        addView(this.bX, new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(zxVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.eqN = kg;
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.eqN.setGravity(16);
        this.eqN.setSingleLine(true);
        this.eqN.setTextSize(2, 17.0f);
        this.eqN.setId(com.bytedance.sdk.openadsdk.utils.Ta.bX);
        this.eqN.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        zxVar.addView(this.eqN, new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(context);
        this.bg = xxpVar;
        xxpVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.zx);
        zxVar.addView(this.bg, new android.widget.LinearLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.IL = kg2;
        kg2.setGravity(17);
        this.IL.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.IL.setSingleLine(true);
        this.IL.setTextColor(-1);
        this.IL.setTextSize(2, 16.0f);
        this.IL.setId(520093705);
        this.IL.setBackground(bg(context));
        this.IL.setText(this.ldr.IL.zCS());
        addView(this.IL, new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 164.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f)));
    }

    public void bg() {
        android.animation.Keyframe keyframeOfFloat = android.animation.Keyframe.ofFloat(0.0f, 0.0f);
        android.animation.Keyframe keyframeOfFloat2 = android.animation.Keyframe.ofFloat(0.65f, 1.0f);
        android.animation.Keyframe keyframeOfFloat3 = android.animation.Keyframe.ofFloat(0.765f, 0.9f);
        android.animation.Keyframe keyframeOfFloat4 = android.animation.Keyframe.ofFloat(0.88f, 1.0f);
        android.animation.Keyframe keyframeOfFloat5 = android.animation.Keyframe.ofFloat(0.95f, 0.95f);
        android.animation.Keyframe keyframeOfFloat6 = android.animation.Keyframe.ofFloat(1.0f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(this, android.animation.PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), android.animation.PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void bg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.ldr = bgVar;
        if (bgVar.IL.Uq() == 1) {
            bX();
        }
    }

    protected java.lang.String getButtonTextForNewStyleBar() {
        boolean zEquals;
        java.lang.String strZCS;
        java.lang.String strIR = com.bytedance.sdk.openadsdk.utils.ayS.iR(this.ldr.Dxa);
        if (strIR == null) {
            strIR = "";
        }
        try {
            zEquals = strIR.equals(java.util.Locale.ENGLISH.getLanguage());
        } catch (java.lang.Throwable unused) {
            zEquals = false;
        }
        if (android.text.TextUtils.isEmpty(this.ldr.IL.zCS())) {
            strZCS = this.ldr.IL.jz() != 4 ? "View" : "Install";
        } else {
            strZCS = this.ldr.IL.zCS();
            if (strZCS == null || !com.bytedance.sdk.openadsdk.utils.ayS.ldr(strZCS) || strZCS.length() <= 2) {
                if (strZCS != null && !com.bytedance.sdk.openadsdk.utils.ayS.ldr(strZCS) && strZCS.length() > 7 && zEquals) {
                    strZCS = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strZCS = getCnOrEnBtnText();
            }
        }
        if (zEquals && !com.bytedance.sdk.openadsdk.utils.ayS.ldr(strZCS)) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.IL.getLayoutParams();
            layoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.ldr.Dxa, 4.0f);
            this.IL.setLayoutParams(layoutParams);
        }
        return strZCS;
    }

    private java.lang.String getCnOrEnBtnText() {
        return this.ldr.IL.jz() != 4 ? "View" : "Install";
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.core.IL.zx zxVarZx = this.ldr.DDQ.zx();
        final com.bytedance.sdk.openadsdk.core.IL.IL ilEqN = this.ldr.DDQ.eqN();
        final com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.ldr.IL;
        if (tuv.aGH() == null) {
            return;
        }
        if (tuv.Uq() != 5 && this.IL != null) {
            if (tuv.aGH().zx) {
                this.IL.setOnClickListener(zxVarZx);
                this.IL.setOnTouchListener(zxVarZx);
            } else {
                this.IL.setOnClickListener(ilEqN);
            }
        }
        if (tuv.Uq() == 5) {
            java.lang.String str = "VAST_ICON";
            if (tuv.aGH().zx) {
                com.bytedance.sdk.openadsdk.core.IL.iR iRVar = new com.bytedance.sdk.openadsdk.core.IL.iR("VAST_ACTION_BUTTON", tuv.hi(), zxVarZx) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.bX.2
                };
                com.bytedance.sdk.openadsdk.core.IL.iR iRVar2 = new com.bytedance.sdk.openadsdk.core.IL.iR(str, tuv.hi(), zxVarZx) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.bX.3
                };
                android.widget.TextView textView = this.IL;
                if (textView != null) {
                    textView.setOnClickListener(iRVar);
                    this.IL.setOnTouchListener(iRVar);
                }
                com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = this.bX;
                if (vzQ != null) {
                    vzQ.setOnClickListener(iRVar2);
                    this.bX.setOnTouchListener(iRVar2);
                }
                android.widget.TextView textView2 = this.eqN;
                if (textView2 == null || android.text.TextUtils.isEmpty(textView2.getText())) {
                    return;
                }
                this.eqN.setOnClickListener(iRVar);
                this.eqN.setOnTouchListener(iRVar);
                return;
            }
            android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.bX.4
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    android.view.View.OnClickListener onClickListener2 = ilEqN;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view != null && "VAST_ICON".equals(view.getTag(570425345))) {
                        if (tuv.hi() == null || tuv.hi().IL() == null) {
                            return;
                        }
                        tuv.hi().IL().bg(com.bytedance.sdk.openadsdk.component.reward.view.bX.this.ldr.rri.iR());
                        return;
                    }
                    if (tuv.hi() != null) {
                        tuv.hi().bg().iR(com.bytedance.sdk.openadsdk.component.reward.view.bX.this.ldr.rri.iR());
                    }
                }
            };
            android.widget.TextView textView3 = this.IL;
            if (textView3 != null) {
                textView3.setOnClickListener(onClickListener);
            }
            android.widget.TextView textView4 = this.eqN;
            if (textView4 != null && !android.text.TextUtils.isEmpty(textView4.getText())) {
                this.eqN.setOnClickListener(onClickListener);
            }
            com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ2 = this.bX;
            if (vzQ2 != null) {
                vzQ2.setTag(570425345, "VAST_ICON");
                this.bX.setOnClickListener(ilEqN);
                return;
            }
            return;
        }
        this.IL.setOnClickListener(zxVarZx);
        this.eqN.setOnClickListener(zxVarZx);
        this.bg.setOnClickListener(zxVarZx);
        this.bX.setOnClickListener(zxVarZx);
    }

    private void zx() {
        android.content.Context context = getContext();
        setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setOrientation(0);
        zxVar.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        addView(zxVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.bX = vzQ;
        vzQ.setBackgroundColor(0);
        this.bX.setId(com.bytedance.sdk.openadsdk.utils.Ta.IL);
        zxVar.addView(this.bX, new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar2.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        zxVar.addView(zxVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.eqN = kg;
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.eqN.setGravity(16);
        this.eqN.setSingleLine(true);
        this.eqN.setTextSize(2, 17.0f);
        this.eqN.setId(com.bytedance.sdk.openadsdk.utils.Ta.bX);
        this.eqN.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        zxVar2.addView(this.eqN, new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(context);
        this.bg = xxpVar;
        xxpVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.zx);
        zxVar2.addView(this.bg, new android.widget.LinearLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.IL = kg2;
        kg2.setGravity(17);
        this.IL.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.IL.setSingleLine(true);
        this.IL.setTextColor(-1);
        this.IL.setTextSize(2, 16.0f);
        this.IL.setId(520093705);
        this.IL.setBackground(bg(context));
        this.IL.setText(this.ldr.IL.zCS());
        addView(this.IL, new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f)));
    }

    private static android.graphics.drawable.Drawable bg(android.content.Context context) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(android.graphics.Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f));
        return gradientDrawable;
    }

    private static class bg implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
        private final java.lang.String IL;
        private final java.lang.String bX;
        private final com.bytedance.sdk.openadsdk.core.model.tuV bg;
        private final java.lang.ref.WeakReference<android.widget.ImageView> eqN;

        public bg(android.widget.ImageView imageView, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, java.lang.String str2) {
            this.eqN = new java.lang.ref.WeakReference<>(imageView);
            this.bg = tuv;
            this.IL = str;
            this.bX = str2;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
            if (vb == null || vb.IL() == null) {
                return;
            }
            android.widget.ImageView imageView = this.eqN.get();
            if (imageView != null) {
                imageView.setImageBitmap(vb.IL());
            }
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.bg, this.bX, "load_vast_icon_success", (org.json.JSONObject) null);
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
            bg(i, str, this.IL);
        }

        private void bg(final int i, final java.lang.String str, final java.lang.String str2) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.bX.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("error_code", i);
                        jSONObject.put("description", i + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (java.lang.Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.component.reward.view.bX.bg.this.bg, com.bytedance.sdk.openadsdk.component.reward.view.bX.bg.this.bX, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }
}

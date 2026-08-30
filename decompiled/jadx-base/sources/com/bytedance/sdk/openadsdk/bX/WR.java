package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends com.bytedance.sdk.openadsdk.core.zx.bX implements com.bytedance.sdk.openadsdk.bX.eo.IL, com.bytedance.sdk.openadsdk.bX.eo.bX, com.bytedance.sdk.openadsdk.bX.eo.bg, com.bytedance.sdk.openadsdk.bX.eo.eqN {
    private int IL;
    private android.view.View Kg;
    private int PX;
    private int Ta;
    private com.bytedance.sdk.openadsdk.core.zx.Kg VB;
    private android.view.View WR;
    private int bX;
    com.bytedance.sdk.openadsdk.bX.ldr bg;
    private com.bytedance.sdk.openadsdk.core.zx.eqN eo;
    private final com.bytedance.sdk.openadsdk.bX.eo eqN;
    private com.bytedance.sdk.openadsdk.bX.VB iR;
    private android.widget.TextView ldr;
    private com.bytedance.sdk.openadsdk.FilterWord yDt;
    private com.bytedance.sdk.openadsdk.core.zx.Kg zx;

    public WR(android.content.Context context, com.bytedance.sdk.openadsdk.bX.eo eoVar) {
        this(context, eoVar, null);
    }

    public WR(android.content.Context context, com.bytedance.sdk.openadsdk.bX.eo eoVar, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        super(context);
        this.eqN = eoVar;
        eoVar.bg((com.bytedance.sdk.openadsdk.bX.eo.bX) this);
        eoVar.bg((com.bytedance.sdk.openadsdk.bX.eo.IL) this);
        eoVar.bg((com.bytedance.sdk.openadsdk.bX.eo.eqN) this);
        eoVar.bg((com.bytedance.sdk.openadsdk.bX.eo.bg) this);
        bX();
        bg(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        IL(list);
    }

    private void bX() {
        if (this.PX > 0) {
            return;
        }
        this.PX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext());
        int iEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(getContext());
        this.Ta = iEqN;
        this.eqN.bg(this.PX, iEqN);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zx.bX, android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.PX == 0) {
                bX();
            }
            layoutParams.width = java.lang.Math.min(this.PX, this.Ta) - (com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 16.0f) * 2);
        }
    }

    private void bg(android.content.Context context) {
        this.bX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        this.IL = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 56.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 30.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        if (eqN()) {
            iBX3 = this.IL;
        }
        if (!eqN()) {
            iBX = iBX2;
        }
        android.view.View view = new android.view.View(getContext());
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 98.0f));
        view.setBackground(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(-1, -2);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(this.bX);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(iBX4, iBX4);
        layoutParams3.setMargins(0, iBX3, iBX3, 0);
        layoutParams3.gravity = 8388661;
        eqn.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_titlebar_close_seletor"));
        addView(eqn, layoutParams3);
        eqn.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.WR.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.bytedance.sdk.openadsdk.bX.WR.this.eqN.zx();
            }
        });
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        this.eo = eqn2;
        eqn2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.WR.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.bytedance.sdk.openadsdk.bX.WR.this.IL();
            }
        });
        this.eo.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(iBX4, iBX4);
        layoutParams4.setMargins(iBX3, iBX3, 0, 0);
        layoutParams4.gravity = 8388659;
        android.graphics.drawable.Drawable drawableBg = com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_leftbackicon_selector");
        drawableBg.setAutoMirrored(true);
        this.eo.setImageDrawable(drawableBg);
        addView(this.eo, layoutParams4);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iBX3, iBX, iBX3, iBX3);
        zxVar.setOrientation(1);
        addView(zxVar, layoutParams5);
        android.view.View viewBX = bX(context);
        this.Kg = viewBX;
        zxVar.addView(viewBX);
        android.view.View viewEqN = eqN(context);
        this.WR = viewEqN;
        zxVar.addView(viewEqN);
        com.bytedance.sdk.openadsdk.core.zx.Kg kgIL = IL(context);
        this.zx = kgIL;
        zxVar.addView(kgIL);
    }

    private com.bytedance.sdk.openadsdk.core.zx.Kg IL(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = eqN() ? this.IL : com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        layoutParams.gravity = 80;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(this.bX);
        int iRgb = android.graphics.Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setCornerRadius(this.bX);
        gradientDrawable2.setColor(iRgb);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.bX;
        kg.setPadding(0, i, 0, i);
        kg.setGravity(17);
        kg.setBackground(stateListDrawable);
        kg.setTextColor(-1);
        kg.setTextSize(16.0f);
        kg.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_suggestion_commit"));
        kg.setEnabled(false);
        kg.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.WR.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.bX.WR.this.eqN.eqN();
            }
        });
        kg.setLayoutParams(layoutParams);
        return kg;
    }

    private android.view.View bX(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        zxVar.setOrientation(1);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_like_this_ad"));
        textView.setTextSize(eqN() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(android.graphics.Color.parseColor("#161823"));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        zxVar.addView(textView, layoutParams);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_feel_hint"));
        textView2.setTextSize(eqN() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(android.graphics.Color.parseColor("#161823"));
        textView2.setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (eqN()) {
            layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f);
        }
        zxVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar2.setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        if (eqN()) {
            layoutParams3.topMargin = iBX;
            layoutParams3.bottomMargin = iBX;
        } else {
            layoutParams3.topMargin = iBX2;
            layoutParams3.bottomMargin = iBX3;
        }
        zxVar.addView(zxVar2, layoutParams3);
        zxVar2.addView(new com.bytedance.sdk.openadsdk.bX.zx(context, 1, this.eqN));
        com.bytedance.sdk.openadsdk.bX.zx zxVar3 = new com.bytedance.sdk.openadsdk.bX.zx(context, 2, this.eqN);
        android.view.ViewGroup.LayoutParams layoutParams4 = zxVar3.getLayoutParams();
        boolean z = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams;
        android.view.ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        android.widget.LinearLayout.LayoutParams layoutParams7 = (android.widget.LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iBX;
        layoutParams7.rightMargin = iBX;
        zxVar2.addView(zxVar3, layoutParams5);
        zxVar2.addView(new com.bytedance.sdk.openadsdk.bX.zx(context, 3, this.eqN));
        com.bytedance.sdk.openadsdk.bX.VB vb = new com.bytedance.sdk.openadsdk.bX.VB(context);
        this.iR = vb;
        zxVar.addView(vb);
        this.ldr = new android.widget.TextView(context);
        android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        if (!eqN()) {
            iBX = iBX3;
        }
        layoutParams8.topMargin = iBX;
        this.ldr.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.ldr.setPadding(iBX2, iBX3, iBX2, iBX3);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(iBX3);
        gradientDrawable.setColor(android.graphics.Color.parseColor("#F8F8F8"));
        this.ldr.setBackground(gradientDrawable);
        this.ldr.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_report_this_ad"));
        this.ldr.setTextSize(eqN() ? 14 : 12);
        android.graphics.drawable.Drawable drawableBX = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_report_ad_arrow");
        drawableBX.setBounds(0, 0, iBX2, iBX2);
        this.ldr.setCompoundDrawables(null, null, drawableBX, null);
        this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.WR.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.bX.WR.this.bg();
            }
        });
        zxVar.addView(this.ldr, layoutParams8);
        return zxVar;
    }

    private boolean eqN() {
        if (this.PX == 0) {
            bX();
        }
        return this.PX < this.Ta;
    }

    private android.view.View eqN(android.content.Context context) {
        int iBX;
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setOrientation(1);
        if (!eqN()) {
            iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 200.0f);
        } else {
            iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 358.0f);
        }
        zxVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, iBX));
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_select_reason"));
        textView.setTextSize(eqN() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(android.graphics.Color.parseColor("#161823"));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, eqN() ? 24.0f : 4.0f);
        zxVar.addView(textView, layoutParams);
        com.bytedance.sdk.openadsdk.bX.ldr ldrVar = new com.bytedance.sdk.openadsdk.bX.ldr(context, this.eqN);
        this.bg = ldrVar;
        zxVar.addView(ldrVar);
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().RJ()) {
            com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
            this.VB = kg;
            kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.yN);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = eqN() ? this.IL : com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f);
            layoutParams2.gravity = 17;
            this.VB.setLayoutParams(layoutParams2);
            this.VB.setFocusable(false);
            this.VB.setHint(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_add_bad_reason"));
            this.VB.setHintTextColor(android.graphics.Color.parseColor("#57000000"));
            this.VB.setTextColor(android.graphics.Color.rgb(22, 24, 35));
            this.VB.setTextSize(15.0f);
            this.VB.setGravity(androidx.core.view.GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
            this.VB.setVisibility(0);
            this.VB.setPadding(0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f), 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
            this.VB.setEllipsize(android.text.TextUtils.TruncateAt.END);
            this.VB.setSingleLine();
            this.VB.setMaxLines(1);
            this.VB.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.WR.5
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.bX.WR.this.eqN.ldr();
                }
            });
            zxVar.addView(this.VB, layoutParams2);
            zxVar.addView(new com.bytedance.sdk.openadsdk.bX.VB(context, android.graphics.Color.argb(128, 0, 0, 0)));
        }
        zxVar.setVisibility(8);
        return zxVar;
    }

    private void IL(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        this.bg.bg(list);
    }

    public void bg() {
        android.view.View view = this.WR;
        if (view != null) {
            view.setVisibility(0);
        }
        android.view.View view2 = this.Kg;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = this.eo;
        if (eqn != null) {
            eqn.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.bX.eo eoVar = this.eqN;
        if (eoVar == null || !eoVar.bX()) {
            return;
        }
        this.yDt = this.eqN.IL();
    }

    public void IL() {
        android.view.View view = this.WR;
        if (view != null) {
            view.setVisibility(8);
        }
        android.view.View view2 = this.Kg;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = this.eo;
        if (eqn != null) {
            eqn.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.bX.eo eoVar = this.eqN;
        if (eoVar != null) {
            com.bytedance.sdk.openadsdk.FilterWord filterWord = this.yDt;
            if (filterWord != null) {
                eoVar.bg(filterWord);
            } else {
                eoVar.bg(com.bytedance.sdk.openadsdk.bX.eo.bg);
            }
            this.eqN.bX(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.bX
    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.zx != null && android.text.TextUtils.isEmpty(this.eqN.iR())) {
            this.zx.setEnabled(!com.bytedance.sdk.openadsdk.bX.eo.bg.equals(filterWord));
        }
        if (com.bytedance.sdk.openadsdk.bX.zx.bg.equals(filterWord) || com.bytedance.sdk.openadsdk.bX.zx.IL.equals(filterWord)) {
            this.ldr.setVisibility(8);
            this.iR.setVisibility(8);
        }
        if (com.bytedance.sdk.openadsdk.bX.zx.bX.equals(filterWord) || com.bytedance.sdk.openadsdk.bX.eo.bg.equals(filterWord)) {
            this.ldr.setVisibility(0);
            this.iR.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.IL
    public void bg(int i) {
        if (com.bytedance.sdk.openadsdk.bX.eo.bX == i) {
            this.yDt = null;
            IL();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.eqN
    public void bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kg;
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = this.VB;
        if (kg2 != null) {
            kg2.setText(str);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.bX.eo eoVar = this.eqN;
            if (eoVar == null || (kg = this.zx) == null) {
                return;
            }
            kg.setEnabled(eoVar.bX());
            return;
        }
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = this.zx;
        if (kg3 != null) {
            kg3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.bg
    public void bg(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        IL(list);
    }
}

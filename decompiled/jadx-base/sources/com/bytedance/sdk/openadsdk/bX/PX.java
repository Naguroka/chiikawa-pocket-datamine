package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class PX extends android.app.Dialog {
    private com.bytedance.sdk.openadsdk.bX.PX.bg IL;
    private java.lang.String Kg;
    private java.lang.String WR;
    private com.bytedance.sdk.openadsdk.core.zx.IL bX;
    private com.bytedance.sdk.openadsdk.core.zx.zx bg;
    private final com.bytedance.sdk.openadsdk.bX.eo eo;
    private com.bytedance.sdk.openadsdk.core.zx.Kg eqN;
    private java.lang.String iR;
    private com.bytedance.sdk.openadsdk.core.zx.eqN ldr;
    private com.bytedance.sdk.openadsdk.core.zx.Kg zx;

    public interface bg {
        void IL();

        void bX();

        void bg();

        void bg(int i, com.bytedance.sdk.openadsdk.FilterWord filterWord, java.lang.String str);
    }

    public PX(android.content.Context context, com.bytedance.sdk.openadsdk.bX.eo eoVar) {
        super(context, com.bytedance.sdk.component.utils.Fy.ldr(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.eo = eoVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVarBg = bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        this.bg = zxVarBg;
        setContentView(zxVarBg);
        bg(this.bg);
        bX();
        bg();
        eqN();
    }

    private void bg(android.view.View view) {
        bg((android.widget.EditText) this.bX);
        com.bytedance.sdk.openadsdk.bX.eo eoVar = this.eo;
        if (eoVar != null) {
            java.lang.String strIR = eoVar.iR();
            if (!android.text.TextUtils.isEmpty(strIR)) {
                this.bX.setText(strIR);
                this.eqN.setText(java.lang.String.format(java.util.Locale.getDefault(), "%d%s", java.lang.Integer.valueOf(strIR.length()), "/200"));
            }
            this.zx.setEnabled(!android.text.TextUtils.isEmpty(strIR));
        }
        this.zx.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.PX.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                java.lang.String string = com.bytedance.sdk.openadsdk.bX.PX.this.bX.getText().toString();
                if (com.bytedance.sdk.openadsdk.bX.PX.this.IL != null) {
                    com.bytedance.sdk.openadsdk.bX.PX.this.IL.bg(4, com.bytedance.sdk.openadsdk.bX.eo.bg, string);
                }
                com.bytedance.sdk.openadsdk.bX.PX.this.dismiss();
            }
        });
        this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.PX.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (com.bytedance.sdk.openadsdk.bX.PX.this.IL != null) {
                    com.bytedance.sdk.openadsdk.bX.PX.this.IL.IL();
                }
                com.bytedance.sdk.openadsdk.bX.PX.this.dismiss();
            }
        });
        this.bX.addTextChangedListener(new android.text.TextWatcher() { // from class: com.bytedance.sdk.openadsdk.bX.PX.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
                com.bytedance.sdk.openadsdk.core.zx.Kg kg;
                int iRound = java.lang.Math.round(charSequence.length());
                com.bytedance.sdk.openadsdk.bX.PX.this.eqN.setText(iRound + "/200");
                boolean z = true;
                if (iRound > 0) {
                    if (com.bytedance.sdk.openadsdk.bX.PX.this.zx.isEnabled()) {
                        return;
                    } else {
                        kg = com.bytedance.sdk.openadsdk.bX.PX.this.zx;
                    }
                } else {
                    kg = com.bytedance.sdk.openadsdk.bX.PX.this.zx;
                    if (com.bytedance.sdk.openadsdk.bX.PX.this.eo == null || android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.bX.PX.this.eo.iR())) {
                        z = false;
                    }
                }
                kg.setEnabled(z);
            }
        });
    }

    public static void bg(android.widget.EditText editText) {
        editText.setFilters(new android.text.InputFilter[]{new android.text.InputFilter() { // from class: com.bytedance.sdk.openadsdk.bX.PX.4
            @Override // android.text.InputFilter
            public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    int type = java.lang.Character.getType(charSequence.charAt(i));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i++;
                }
                return null;
            }
        }, new android.text.InputFilter.LengthFilter(200)});
    }

    private void bX() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        android.view.Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        com.bytedance.sdk.openadsdk.bX.PX.bg bgVar = this.IL;
        if (bgVar != null) {
            bgVar.bg();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IL();
        super.dismiss();
    }

    public void bg(com.bytedance.sdk.openadsdk.bX.PX.bg bgVar) {
        this.IL = bgVar;
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.core.zx.IL il = this.bX;
        if (il == null) {
            return;
        }
        il.requestFocus();
        android.view.Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void IL() {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.zx.IL il = this.bX;
        if (il == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) il.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.bg.getWindowToken(), 0);
    }

    private void eqN() {
        setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.bX.PX.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                if (com.bytedance.sdk.openadsdk.bX.PX.this.IL != null) {
                    com.bytedance.sdk.openadsdk.bX.PX.this.IL.bX();
                }
            }
        });
    }

    public void bg(java.lang.String str, java.lang.String str2) {
        this.iR = str;
        this.Kg = str2;
        com.bytedance.sdk.openadsdk.bX.eo eoVar = this.eo;
        if (eoVar != null) {
            eoVar.eqN(str2);
        }
    }

    public void bg(java.lang.String str) {
        this.WR = str;
    }

    private com.bytedance.sdk.openadsdk.core.zx.zx bg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        zxVar.setOrientation(1);
        zxVar.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f)));
        this.ldr = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iBX, iBX);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        layoutParams.topMargin = iBX2;
        layoutParams.rightMargin = iBX2;
        this.ldr.setLayoutParams(layoutParams);
        this.ldr.setClickable(true);
        this.ldr.setFocusable(true);
        this.ldr.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        kg.setLayoutParams(layoutParams2);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        kg.setGravity(17);
        kg.setSingleLine(true);
        kg.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_other_reason"));
        kg.setTextColor(android.graphics.Color.parseColor("#161823"));
        kg.setTextSize(15.0f);
        kg.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 0.5f)));
        view.setBackgroundColor(android.graphics.Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        zxVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.zx.IL il = new com.bytedance.sdk.openadsdk.core.zx.IL(context);
        this.bX = il;
        il.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(200), new android.text.InputFilter.AllCaps()});
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        layoutParams3.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        layoutParams3.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 11.5f);
        this.bX.setLayoutParams(layoutParams3);
        this.bX.setLines(4);
        this.bX.setGravity(48);
        this.bX.setHint(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_suggestion_description"));
        this.bX.setTextSize(15.0f);
        this.bX.setTextColor(android.graphics.Color.rgb(22, 24, 35));
        this.bX.setHintTextColor(android.graphics.Color.parseColor("#57161823"));
        this.bX.setBackground(null);
        this.bX.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar3 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 17.0f);
        zxVar3.setPadding(iBX3, iBX4, iBX3, iBX4);
        zxVar3.setLayoutParams(layoutParams4);
        zxVar3.setOrientation(0);
        this.eqN = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = androidx.core.view.GravityCompat.START;
        this.eqN.setLayoutParams(layoutParams5);
        this.eqN.setText(java.lang.String.format("0%s", "/200"));
        this.eqN.setGravity(androidx.core.view.GravityCompat.START);
        this.eqN.setTextColor(android.graphics.Color.parseColor("#57161823"));
        this.eqN.setTextSize(15.0f);
        this.zx = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = androidx.core.view.GravityCompat.END;
        this.zx.setLayoutParams(layoutParams6);
        this.zx.setTextSize(14.0f);
        this.zx.setTextColor(-1);
        this.zx.setVisibility(0);
        this.zx.setSingleLine(true);
        int iBX5 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 27.0f);
        int iBX6 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 5.0f);
        this.zx.setPadding(iBX5, iBX6, iBX5, iBX6);
        int iBX7 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        float f = iBX7;
        gradientDrawable.setCornerRadius(f);
        int iRgb = android.graphics.Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(iRgb);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.zx.setBackground(stateListDrawable);
        this.zx.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_done"));
        this.zx.setEnabled(false);
        zxVar.addView(iRVar);
        zxVar.addView(view);
        zxVar.addView(zxVar2);
        iRVar.addView(this.ldr);
        iRVar.addView(kg);
        zxVar2.addView(this.bX);
        zxVar2.addView(zxVar3);
        zxVar3.addView(this.eqN);
        zxVar3.addView(this.zx);
        return zxVar;
    }
}

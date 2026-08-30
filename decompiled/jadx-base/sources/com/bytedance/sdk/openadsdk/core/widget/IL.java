package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends android.app.Dialog {
    private com.bytedance.sdk.openadsdk.core.zx.eqN IL;
    private final android.content.Context Kg;
    private java.lang.String PX;
    private int Ta;
    private java.lang.String VB;
    private java.lang.String WR;
    private com.bytedance.sdk.openadsdk.core.zx.Kg bX;
    public com.bytedance.sdk.openadsdk.core.widget.IL.bg bg;
    private java.lang.String eo;
    private com.bytedance.sdk.openadsdk.core.zx.Kg eqN;
    private android.view.View iR;
    private com.bytedance.sdk.openadsdk.core.zx.bg ldr;
    private boolean yDt;
    private com.bytedance.sdk.openadsdk.core.zx.bg zx;

    public interface bg {
        void IL();

        void bg();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    public IL(android.content.Context context) {
        super(context, com.bytedance.sdk.component.utils.Fy.ldr(context, "tt_custom_dialog"));
        this.Ta = -1;
        this.yDt = false;
        this.Kg = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(bg(this.Kg));
        setCanceledOnTouchOutside(false);
        IL();
        bg();
    }

    private void bg() {
        this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.IL.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.widget.IL.this.bg != null) {
                    com.bytedance.sdk.openadsdk.core.widget.IL.this.bg.bg();
                }
            }
        });
        this.zx.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.IL.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.core.widget.IL.this.bg != null) {
                    com.bytedance.sdk.openadsdk.core.widget.IL.this.bg.IL();
                }
            }
        });
    }

    private void IL() {
        if (!android.text.TextUtils.isEmpty(this.eo)) {
            this.bX.setText(this.eo);
            this.bX.setVisibility(0);
        } else {
            this.bX.setVisibility(8);
        }
        if (!android.text.TextUtils.isEmpty(this.WR)) {
            this.eqN.setText(this.WR);
        }
        if (!android.text.TextUtils.isEmpty(this.VB)) {
            this.ldr.setText(this.VB);
        } else {
            this.ldr.setText(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_postive_txt"));
        }
        if (!android.text.TextUtils.isEmpty(this.PX)) {
            this.zx.setText(this.PX);
        } else {
            this.zx.setText(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_negtive_txt"));
        }
        int i = this.Ta;
        if (i != -1) {
            this.IL.setImageResource(i);
            this.IL.setVisibility(0);
        } else {
            this.IL.setVisibility(8);
        }
        if (this.yDt) {
            this.iR.setVisibility(8);
            this.zx.setVisibility(8);
        } else {
            this.zx.setVisibility(0);
            this.iR.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        IL();
    }

    private android.view.View bg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        zxVar.setMinimumWidth(bg(260.0f));
        zxVar.setPadding(0, bg(32.0f), 0, 0);
        zxVar.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_custom_dialog_bg"));
        zxVar.setOrientation(1);
        zxVar.setLayoutParams(layoutParams);
        this.bX = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = bg(16.0f);
        layoutParams2.rightMargin = bg(16.0f);
        layoutParams2.bottomMargin = bg(16.0f);
        this.bX.setGravity(17);
        this.bX.setVisibility(0);
        this.bX.setTextColor(android.graphics.Color.parseColor("#333333"));
        this.bX.setTextSize(18.0f);
        this.bX.setLayoutParams(layoutParams2);
        this.IL = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = bg(16.0f);
        layoutParams3.rightMargin = bg(16.0f);
        layoutParams3.bottomMargin = bg(10.0f);
        this.IL.setMaxHeight(bg(150.0f));
        this.IL.setMaxWidth(bg(150.0f));
        this.IL.setVisibility(0);
        this.IL.setLayoutParams(layoutParams3);
        this.eqN = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = bg(20.0f);
        layoutParams4.rightMargin = bg(20.0f);
        this.eqN.setGravity(17);
        this.eqN.setLineSpacing(bg(3.0f), 1.2f);
        this.eqN.setTextSize(18.0f);
        this.eqN.setTextColor(android.graphics.Color.parseColor("#000000"));
        this.eqN.setLayoutParams(layoutParams4);
        android.view.View view = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = bg(32.0f);
        view.setBackgroundColor(android.graphics.Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        zxVar2.setOrientation(0);
        zxVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.zx.bg bgVar = new com.bytedance.sdk.openadsdk.core.zx.bg(context);
        this.zx = bgVar;
        bgVar.setId(520093718);
        android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = bg(10.0f);
        layoutParams7.weight = 1.0f;
        this.zx.setPadding(0, bg(16.0f), 0, bg(16.0f));
        this.zx.setBackground(null);
        this.zx.setGravity(17);
        this.zx.setSingleLine(true);
        this.zx.setTextColor(android.graphics.Color.parseColor("#999999"));
        this.zx.setTextSize(16.0f);
        this.zx.setLayoutParams(layoutParams7);
        this.iR = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(1, -1);
        this.iR.setBackgroundColor(android.graphics.Color.parseColor("#E4E4E4"));
        this.iR.setLayoutParams(layoutParams8);
        this.ldr = new com.bytedance.sdk.openadsdk.core.zx.bg(context);
        this.zx.setId(520093719);
        android.widget.LinearLayout.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = bg(10.0f);
        layoutParams9.weight = 1.0f;
        this.ldr.setPadding(0, bg(16.0f), 0, bg(16.0f));
        this.ldr.setBackground(null);
        this.ldr.setGravity(17);
        this.ldr.setSingleLine(true);
        this.ldr.setTextColor(android.graphics.Color.parseColor("#38ADFF"));
        this.ldr.setTextSize(16.0f);
        this.ldr.setLayoutParams(layoutParams9);
        iRVar.addView(zxVar);
        zxVar.addView(this.bX);
        zxVar.addView(this.IL);
        zxVar.addView(this.eqN);
        zxVar.addView(view);
        zxVar.addView(zxVar2);
        zxVar2.addView(this.zx);
        zxVar2.addView(this.iR);
        zxVar2.addView(this.ldr);
        return iRVar;
    }

    private int bg(float f) {
        return com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), f);
    }

    public com.bytedance.sdk.openadsdk.core.widget.IL bg(com.bytedance.sdk.openadsdk.core.widget.IL.bg bgVar) {
        this.bg = bgVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.widget.IL bg(java.lang.String str) {
        this.WR = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.widget.IL IL(java.lang.String str) {
        this.VB = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.widget.IL bX(java.lang.String str) {
        this.PX = str;
        return this;
    }
}

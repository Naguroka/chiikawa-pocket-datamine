package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class Uw extends android.widget.LinearLayout {
    private com.bytedance.sdk.component.utils.LZ IL;
    private android.widget.TextView bX;
    private android.widget.TextView bg;
    private com.bytedance.sdk.component.adexpress.ldr.Uw.bg eqN;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.eo iR;
    private com.bytedance.adsdk.IL.ldr ldr;
    private android.widget.LinearLayout zx;

    public interface bg {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public Uw(android.content.Context context, android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.eo eoVar) {
        super(context);
        this.iR = eoVar;
        bg(context, view);
    }

    private void bg(android.content.Context context, android.view.View view) {
        setClipChildren(false);
        addView(view);
        this.zx = (android.widget.LinearLayout) findViewById(2097610722);
        this.bg = (android.widget.TextView) findViewById(2097610719);
        this.bX = (android.widget.TextView) findViewById(2097610718);
        com.bytedance.adsdk.IL.ldr ldrVar = (com.bytedance.adsdk.IL.ldr) findViewById(2097610706);
        this.ldr = ldrVar;
        ldrVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.ldr.setImageAssetsFolder("images/");
        this.ldr.bg(true);
    }

    public void setShakeText(java.lang.String str) {
        this.bX.setText(str);
    }

    public android.widget.LinearLayout getWriggleLayout() {
        return this.zx;
    }

    public android.view.View getWriggleProgressIv() {
        return this.ldr;
    }

    public android.widget.TextView getTopTextView() {
        return this.bg;
    }

    public void setOnShakeViewListener(com.bytedance.sdk.component.adexpress.ldr.Uw.bg bgVar) {
        this.eqN = bgVar;
    }

    public void bg() {
        postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.Uw.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.component.adexpress.ldr.Uw.this.ldr.bg();
                } catch (java.lang.Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.IL == null) {
                this.IL = new com.bytedance.sdk.component.utils.LZ(getContext().getApplicationContext(), 2);
            }
            new java.lang.Object() { // from class: com.bytedance.sdk.component.adexpress.ldr.Uw.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.eqN.eo eoVar = this.iR;
            if (eoVar != null) {
                eoVar.bX();
                this.iR.zx();
                this.iR.ldr();
                this.iR.Kg();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.IL.ldr ldrVar = this.ldr;
            if (ldrVar != null) {
                ldrVar.zx();
            }
        } catch (java.lang.Exception unused) {
        }
    }
}

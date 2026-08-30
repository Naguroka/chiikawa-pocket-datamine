package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class VzQ extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    private android.widget.TextView Fy;
    private android.widget.TextView IL;
    private android.widget.TextView LZ;
    private android.widget.TextView bg;
    private android.widget.LinearLayout rri;
    private android.widget.TextView tC;

    public VzQ(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.bg = new android.widget.TextView(this.VB);
        this.IL = new android.widget.TextView(this.VB);
        this.Fy = new android.widget.TextView(this.VB);
        this.rri = new android.widget.LinearLayout(this.VB);
        this.LZ = new android.widget.TextView(this.VB);
        this.tC = new android.widget.TextView(this.VB);
        this.bg.setTag(9);
        this.IL.setTag(10);
        this.Fy.setTag(12);
        this.rri.addView(this.Fy);
        this.rri.addView(this.tC);
        this.rri.addView(this.IL);
        this.rri.addView(this.LZ);
        this.rri.addView(this.bg);
        addView(this.rri, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    protected boolean eqN() {
        this.bg.setOnTouchListener((android.view.View.OnTouchListener) getDynamicClickListener());
        this.bg.setOnClickListener((android.view.View.OnClickListener) getDynamicClickListener());
        this.IL.setOnTouchListener((android.view.View.OnTouchListener) getDynamicClickListener());
        this.IL.setOnClickListener((android.view.View.OnClickListener) getDynamicClickListener());
        this.Fy.setOnTouchListener((android.view.View.OnTouchListener) getDynamicClickListener());
        this.Fy.setOnClickListener((android.view.View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr
    protected android.widget.FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        this.Fy.setText("Function");
        this.IL.setText("Permission list");
        this.LZ.setText(" | ");
        this.tC.setText(" | ");
        this.bg.setText("Privacy policy");
        if (this.PX != null) {
            this.Fy.setTextColor(this.PX.iR());
            this.Fy.setTextSize(this.PX.zx());
            this.IL.setTextColor(this.PX.iR());
            this.IL.setTextSize(this.PX.zx());
            this.LZ.setTextColor(this.PX.iR());
            this.tC.setTextColor(this.PX.iR());
            this.bg.setTextColor(this.PX.iR());
            this.bg.setTextSize(this.PX.zx());
            return false;
        }
        this.Fy.setTextColor(-1);
        this.Fy.setTextSize(12.0f);
        this.IL.setTextColor(-1);
        this.IL.setTextSize(12.0f);
        this.LZ.setTextColor(-1);
        this.tC.setTextColor(-1);
        this.bg.setTextColor(-1);
        this.bg.setTextSize(12.0f);
        return false;
    }
}

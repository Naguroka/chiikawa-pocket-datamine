package com.bytedance.adsdk.ugeno.ldr.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.widget.LinearLayout {
    private int IL;
    private boolean Kg;
    private int WR;
    private int bX;
    private java.util.List<android.view.View> bg;
    private android.content.Context eqN;
    private int iR;
    private int ldr;
    private int zx;

    public bg(android.content.Context context) {
        super(context);
        this.IL = -65536;
        this.bX = -16776961;
        this.zx = 5;
        this.ldr = 20;
        this.iR = 20;
        this.eqN = context;
        this.bg = new java.util.ArrayList();
        bg();
    }

    public void bg(int i, int i2) {
        java.util.Iterator<android.view.View> it = this.bg.iterator();
        while (it.hasNext()) {
            it.next().setBackground(IL(this.bX));
        }
        if (i < 0 || i >= this.bg.size()) {
            i = 0;
        }
        if (this.bg.size() > 0) {
            this.bg.get(i).setBackground(IL(this.IL));
            this.WR = i2;
        }
    }

    public int getSize() {
        return this.bg.size();
    }

    public void bg() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setGravity(17);
        setOrientation(0);
        layoutParams.bottomMargin = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(this.eqN, 10.0f);
        setLayoutParams(layoutParams);
    }

    public void setSelectedColor(int i) {
        this.IL = i;
    }

    public void setLoop(boolean z) {
        this.Kg = z;
    }

    public void setUnSelectedColor(int i) {
        this.bX = i;
    }

    public void bg(int i) {
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.ldr, this.iR);
        layoutParams.leftMargin = this.zx;
        layoutParams.rightMargin = this.zx;
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(this.ldr, this.iR);
        layoutParams2.leftMargin = this.zx;
        layoutParams2.rightMargin = this.zx;
        int iBg = com.bytedance.adsdk.ugeno.ldr.eqN.bg(this.Kg, this.WR, this.bg.size());
        int iBg2 = com.bytedance.adsdk.ugeno.ldr.eqN.bg(this.Kg, i, this.bg.size());
        if (this.bg.size() == 0) {
            iBg2 = 0;
        }
        if (!this.bg.isEmpty() && com.bytedance.adsdk.ugeno.ldr.eqN.bg(iBg, this.bg) && com.bytedance.adsdk.ugeno.ldr.eqN.bg(iBg2, this.bg)) {
            this.bg.get(iBg).setBackground(IL(this.bX));
            this.bg.get(iBg).setLayoutParams(layoutParams2);
            this.bg.get(iBg2).setBackground(IL(this.IL));
            this.bg.get(iBg2).setLayoutParams(layoutParams);
            this.WR = i;
        }
    }

    public void IL() {
        android.view.View view = new android.view.View(getContext());
        view.setClickable(false);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.ldr, this.iR);
        layoutParams.leftMargin = this.zx;
        layoutParams.rightMargin = this.zx;
        addView(view, layoutParams);
        view.setBackground(IL(this.bX));
        this.bg.add(view);
    }

    private android.graphics.drawable.GradientDrawable IL(int i) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}

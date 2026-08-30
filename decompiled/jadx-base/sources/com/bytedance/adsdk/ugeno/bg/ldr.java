package com.bytedance.adsdk.ugeno.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements com.bytedance.adsdk.ugeno.bg.zx {
    private float IL;
    private float bX;
    private android.view.View bg;
    private float eqN;
    private float ldr;
    private float zx;

    public ldr(android.view.View view) {
        this.bg = view;
    }

    public void bg(float f) {
        android.view.View view = this.bg;
        if (view == null) {
            return;
        }
        this.IL = f;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) background).setCornerRadius(f);
        }
    }

    public float bg() {
        return this.IL;
    }

    public void IL(float f) {
        android.view.View view = this.bg;
        if (view == null) {
            return;
        }
        this.bX = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.bX;
    }

    public void bX(float f) {
        android.view.View view = this.bg;
        if (view == null) {
            return;
        }
        this.eqN = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getShine() {
        return this.eqN;
    }

    public void eqN(float f) {
        this.zx = f;
        this.bg.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getStretch() {
        return this.zx;
    }

    public void zx(float f) {
        this.ldr = f;
        this.bg.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.bg.zx
    public float getRubIn() {
        return this.ldr;
    }

    public void bg(int i) {
        android.view.View view = this.bg;
        if (view == null) {
            return;
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) background).setColor(i);
        } else if (background instanceof android.graphics.drawable.ColorDrawable) {
            ((android.graphics.drawable.ColorDrawable) background.mutate()).setColor(i);
        }
    }
}

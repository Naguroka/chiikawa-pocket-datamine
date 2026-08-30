package com.bytedance.adsdk.ugeno.ldr.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.adsdk.ugeno.Kg.bX.zx {
    final float bg = 0.8f;
    final float IL = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.Kg.bX.zx
    public void bg(android.view.View view, float f) {
        float f2 = ((f < 0.0f ? 0.19999999f : -0.19999999f) * f) + 1.0f;
        float f3 = (f * (f < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(java.lang.Math.abs(f3));
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Lq extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public Lq(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        float f;
        float fBg = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.IL.ldr());
        float fBg2 = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.IL.iR());
        float f2 = 0.0f;
        if ("reverse".equals(this.IL.vb())) {
            f = fBg2;
            fBg2 = 0.0f;
            f2 = fBg;
            fBg = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.eqN.IL.bg(this.bX.getContext())) {
            fBg = -fBg;
            f2 = -f2;
        }
        this.bX.setTranslationX(fBg);
        this.bX.setTranslationY(fBg2);
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "translationX", fBg, f2).setDuration((int) (this.IL.eo() * 1000.0d));
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(this.bX, "translationY", fBg2, f).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        arrayList.add(bg(duration2));
        return arrayList;
    }
}

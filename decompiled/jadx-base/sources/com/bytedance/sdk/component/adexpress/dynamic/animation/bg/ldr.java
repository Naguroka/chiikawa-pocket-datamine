package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public ldr(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        float f = this.bX.getLayoutParams().width;
        this.bX.setTranslationX(f);
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "translationX", f, 0.0f).setDuration((int) (this.IL.eo() * 1000.0d));
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(this.bX, "alpha", 0.0f, 1.0f).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        arrayList.add(bg(duration2));
        return arrayList;
    }
}

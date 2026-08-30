package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public bg(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        float fVzQ = this.IL.VzQ() / 100.0f;
        float fTuV = this.IL.tuV() / 100.0f;
        if ("reverse".equals(this.IL.vb()) && this.IL.yDt() <= 0.0d) {
            fTuV = fVzQ;
            fVzQ = fTuV;
        }
        this.bX.setAlpha(fVzQ);
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "alpha", fVzQ, fTuV).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        return arrayList;
    }
}

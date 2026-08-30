package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public iR(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        this.bX.setTag(2097610709, java.lang.Integer.valueOf(this.IL.bX()));
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        return arrayList;
    }
}

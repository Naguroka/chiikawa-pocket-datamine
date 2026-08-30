package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public WR(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, androidx.constraintlayout.motion.widget.Key.ROTATION, 0.0f, 360.0f).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        return arrayList;
    }
}

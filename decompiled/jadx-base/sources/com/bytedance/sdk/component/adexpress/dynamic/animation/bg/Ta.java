package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Ta extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public Ta(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        if ((this.bX instanceof android.widget.ImageView) && (this.bX.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB)) {
            this.bX = (android.view.View) this.bX.getParent();
            ((android.view.ViewGroup) this.bX).setClipChildren(true);
            ((android.view.ViewGroup) this.bX.getParent()).setClipChildren(true);
        }
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        return arrayList;
    }
}

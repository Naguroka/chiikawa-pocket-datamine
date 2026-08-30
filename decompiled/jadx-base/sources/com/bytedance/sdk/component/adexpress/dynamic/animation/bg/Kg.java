package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public Kg(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.IL.eo() * 1000.0d));
        ((android.view.ViewGroup) this.bX.getParent()).setClipChildren(false);
        ((android.view.ViewGroup) this.bX.getParent().getParent()).setClipChildren(false);
        ((android.view.ViewGroup) this.bX.getParent().getParent().getParent()).setClipChildren(false);
        this.bX.setTag(2097610712, this.IL.Kg());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        return arrayList;
    }
}

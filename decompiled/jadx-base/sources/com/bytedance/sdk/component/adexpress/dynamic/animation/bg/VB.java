package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class VB extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public VB(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        float f;
        float fVB = (float) this.IL.VB();
        float fPX = (float) this.IL.PX();
        java.lang.String strVb = this.IL.vb();
        float f2 = 1.0f;
        if ("reverse".equals(strVb) || "alternate-reverse".equals(strVb)) {
            f = 1.0f;
        } else {
            f = fPX;
            fPX = 1.0f;
            f2 = fVB;
            fVB = 1.0f;
        }
        this.bX.setTag(2097610710, this.IL.IL());
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "scaleX", fVB, f2).setDuration((int) (this.IL.eo() * 1000.0d));
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(this.bX, "scaleY", fPX, f).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        arrayList.add(bg(duration2));
        return arrayList;
    }
}

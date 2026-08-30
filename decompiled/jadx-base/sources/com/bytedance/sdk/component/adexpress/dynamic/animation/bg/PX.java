package com.bytedance.sdk.component.adexpress.dynamic.animation.bg;

/* JADX INFO: loaded from: classes3.dex */
public class PX extends com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN {
    public PX(android.view.View view, com.bytedance.sdk.component.adexpress.dynamic.eqN.bg bgVar) {
        super(view, bgVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN
    java.util.List<android.animation.ObjectAnimator> bg() {
        int i;
        int i2;
        this.bX.setTag(2097610711, java.lang.Integer.valueOf(this.IL.eqN()));
        if (this.bX == null || !com.bytedance.sdk.component.adexpress.eqN.IL.bg(this.bX.getContext())) {
            i = 0;
            i2 = 1;
        } else {
            i2 = 0;
            i = 1;
        }
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.bX, "shineValue", i, i2).setDuration((int) (this.IL.eo() * 1000.0d));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bg(duration));
        return arrayList;
    }
}

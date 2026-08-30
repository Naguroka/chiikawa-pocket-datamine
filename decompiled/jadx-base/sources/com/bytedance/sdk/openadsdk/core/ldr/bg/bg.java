package com.bytedance.sdk.openadsdk.core.ldr.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.IL.bX implements com.bytedance.sdk.component.adexpress.dynamic.ldr.bg {
    protected java.lang.ref.WeakReference<android.view.View> IL;
    private com.bytedance.sdk.component.adexpress.IL.VB bX;
    protected java.lang.ref.WeakReference<android.view.View> bg;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ldr.bg
    public void bg(com.bytedance.sdk.component.adexpress.IL.VB vb) {
        this.bX = vb;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ldr.bg
    public void bg(android.view.View view) {
        this.bg = new java.lang.ref.WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ldr.bg
    public void IL(android.view.View view) {
        this.IL = new java.lang.ref.WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bX
    public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
        bg(view, ((java.lang.Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    private void bg(android.view.View view, int i, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray) {
        if (this.bX != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            java.lang.ref.WeakReference<android.view.View> weakReference = this.IL;
            if (weakReference != null) {
                int[] iArrBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg(weakReference.get());
                if (iArrBg != null) {
                    iArr = iArrBg;
                }
                int[] iArrBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL.get());
                if (iArrBX != null) {
                    iArr2 = iArrBX;
                }
            }
            java.lang.String strValueOf = "";
            try {
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.bg.LZ) != null) {
                    strValueOf = java.lang.String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.bg.LZ));
                }
            } catch (java.lang.Exception unused) {
            }
            this.bX.bg(view, i, new com.bytedance.sdk.openadsdk.core.model.yDt.bg().eqN(f).bX(f2).IL(f3).bg(f4).IL(this.JAA).bg(this.Ja).bX(iArr[0]).eqN(iArr[1]).zx(iArr2[0]).ldr(iArr2[1]).bg(sparseArray).bg(this.VW).bg(strValueOf).bg());
        }
    }
}

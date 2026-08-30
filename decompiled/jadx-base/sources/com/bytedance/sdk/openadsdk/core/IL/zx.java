package com.bytedance.sdk.openadsdk.core.IL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zx extends com.bytedance.sdk.openadsdk.core.IL.bg {
    protected abstract void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, int i, int i2, int i3, boolean z);

    public zx(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i) {
        super(context, tuv, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bg, com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
    public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
        if (bg(view, z)) {
            bg(view, f, f2, f3, f4, sparseArray, this.Uq, this.Uw, this.DDQ, z);
        }
        super.bg(view, f, f2, f3, f4, sparseArray, z);
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class tuV extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    public com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL bg;

    public tuV(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        return super.WR();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL bg(android.graphics.Bitmap bitmap) {
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bg bgVar = new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bg(bitmap, this.bg);
        this.bg = bgVar;
        return bgVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    protected android.graphics.drawable.GradientDrawable getDrawable() {
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL il = new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL();
        this.bg = il;
        return il;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    protected android.graphics.drawable.GradientDrawable bg(android.graphics.drawable.GradientDrawable.Orientation orientation, int[] iArr) {
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL il = new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IL(orientation, iArr);
        this.bg = il;
        return il;
    }
}

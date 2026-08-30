package com.bytedance.sdk.openadsdk.component.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.IL.bg {
    private final com.bytedance.sdk.openadsdk.component.Kg.bg bg;

    public bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, int i, com.bytedance.sdk.openadsdk.component.Kg.bg bgVar) {
        super(context, tuv, str, i);
        this.bg = bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bg, com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
    public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            bg("click_bar");
        } else {
            bg("click_material");
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(this.bg.IL()));
        bg(map);
        super.bg(view, f, f2, f3, f4, sparseArray, z);
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.ldr, 9);
    }
}

package com.bytedance.sdk.openadsdk.bg.IL.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.Kg.bg {
    private com.bytedance.sdk.openadsdk.bg.IL.bg Ta;
    private com.bytedance.sdk.openadsdk.core.Kg.Fy bg;

    public bg(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bg
    protected void bg(android.view.View view, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.bg;
        if (fy != null) {
            fy.bg(view, i, ydt);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Kg.Fy fy) {
        this.bg = fy;
        fy.addView(this, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.bg.IL.bg bgVar) {
        this.Ta = bgVar;
    }
}

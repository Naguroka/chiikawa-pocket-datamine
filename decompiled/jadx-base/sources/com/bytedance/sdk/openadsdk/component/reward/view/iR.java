package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.openadsdk.core.zx.bX {
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;

    public iR(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar.Dxa);
        this.bg = bgVar;
        if (bgVar.kU != null || android.os.Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void bg(com.bytedance.sdk.openadsdk.component.reward.IL.IL il) {
        com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout rFEndCardBackUpLayoutKg;
        il.bg(this);
        if (this.bg.bg != 1 && (rFEndCardBackUpLayoutKg = il.Kg()) != null) {
            addView(rFEndCardBackUpLayoutKg, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        bg(il.WR(), this);
        bg(il.eo(), this);
    }

    private void bg(android.view.View view, android.view.ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
    }
}

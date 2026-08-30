package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.core.zx.eqN {
    public bX(android.content.Context context) {
        super(context);
        bg();
    }

    private void bg() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.Ta.Fb);
    }

    public void bg(int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv.HXG() || (tuv.eK() && tuv.Kg())) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this, 0);
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg((int) com.bytedance.sdk.openadsdk.utils.ZQc.bg(getContext(), i, true), this, tuv);
        }
    }
}

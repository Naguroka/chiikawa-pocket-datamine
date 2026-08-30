package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.openadsdk.core.zx.eqN {
    private int IL;
    private float bg;

    public iR(android.content.Context context) {
        super(context);
        this.bg = 2.25f;
        this.IL = 12;
        bg();
    }

    public iR(android.content.Context context, int i, float f) {
        super(context);
        this.bg = f;
        this.IL = i;
        bg();
    }

    private void bg() {
        setBackground(com.bytedance.sdk.openadsdk.core.widget.eqN.bg());
        setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_close_btn"));
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), this.bg);
        setPadding(iBX, iBX, iBX, iBX);
        setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zx.eqN, android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), this.IL);
            layoutParams.width = iBX;
            layoutParams.height = iBX;
        }
        super.setLayoutParams(layoutParams);
    }

    public static com.bytedance.sdk.openadsdk.core.zx.eqN bg(android.content.Context context) {
        return new com.bytedance.sdk.openadsdk.core.widget.iR(context);
    }

    public static com.bytedance.sdk.openadsdk.core.zx.eqN IL(android.content.Context context) {
        return new com.bytedance.sdk.openadsdk.core.widget.iR(context, 28, 5.0f);
    }
}

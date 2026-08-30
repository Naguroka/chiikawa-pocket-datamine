package com.bytedance.sdk.openadsdk.core.VB.IL.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.adsdk.ugeno.WR.IL.bg {
    private final com.bytedance.adsdk.ugeno.WR.IL.bg IL;
    private final com.bytedance.adsdk.ugeno.WR.IL.bg bg;

    public bg(android.content.Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.WR.IL.bg bgVar = new com.bytedance.adsdk.ugeno.WR.IL.bg(context);
        this.bg = bgVar;
        addView(bgVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.WR.IL.bg bgVar2 = new com.bytedance.adsdk.ugeno.WR.IL.bg(context);
        this.IL = bgVar2;
        bgVar2.setBackgroundColor(0);
        addView(bgVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.IL.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.IL.setOnTouchListener(onTouchListener);
    }

    public com.bytedance.adsdk.ugeno.WR.IL.bg getVideoView() {
        return this.bg;
    }
}

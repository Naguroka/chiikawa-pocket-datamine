package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class rri extends android.view.GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.IL.ldr IL;
    private final com.bytedance.sdk.openadsdk.core.Kg.rri.bg bg;

    public rri(android.content.Context context) {
        this(context, new com.bytedance.sdk.openadsdk.core.Kg.rri.bg());
    }

    public rri(android.content.Context context, com.bytedance.sdk.openadsdk.core.Kg.rri.bg bgVar) {
        super(context, bgVar);
        this.bg = bgVar;
        this.IL = new com.bytedance.sdk.openadsdk.core.IL.ldr();
        setIsLongpressEnabled(false);
    }

    void bg() {
        this.bg.bg();
    }

    public boolean IL() {
        return this.bg.IL();
    }

    public com.bytedance.sdk.openadsdk.core.model.eo bg(android.content.Context context, android.view.View view, android.view.View view2) {
        if (this.IL == null) {
            return new com.bytedance.sdk.openadsdk.core.model.eo.bg().bg();
        }
        return new com.bytedance.sdk.openadsdk.core.model.eo.bg().ldr(this.IL.bg).zx(this.IL.IL).eqN(this.IL.bX).bX(this.IL.eqN).IL(this.IL.zx).bg(this.IL.ldr).IL(com.bytedance.sdk.openadsdk.utils.ZQc.bg(view)).bg(com.bytedance.sdk.openadsdk.utils.ZQc.bg(view2)).bX(com.bytedance.sdk.openadsdk.utils.ZQc.bX(view)).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(view2)).eqN(this.IL.iR).zx(this.IL.Kg).ldr(this.IL.WR).bg(this.IL.PX).IL(com.bytedance.sdk.openadsdk.core.WR.IL().bg() ? 1 : 2).bg("vessel").bg(com.bytedance.sdk.openadsdk.utils.ZQc.zx(context)).bX(com.bytedance.sdk.openadsdk.utils.ZQc.iR(context)).IL(com.bytedance.sdk.openadsdk.utils.ZQc.ldr(context)).bg();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.IL.bg(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    static class bg extends android.view.GestureDetector.SimpleOnGestureListener {
        boolean bg = false;

        bg() {
        }

        void bg() {
            this.bg = false;
        }

        boolean IL() {
            return this.bg;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            this.bg = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}

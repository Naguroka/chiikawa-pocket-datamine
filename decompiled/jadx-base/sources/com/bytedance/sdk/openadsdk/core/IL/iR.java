package com.bytedance.sdk.openadsdk.core.IL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iR extends com.bytedance.sdk.openadsdk.core.IL.bX {
    private final com.bytedance.sdk.openadsdk.core.PX.bg IL;
    private com.bytedance.sdk.openadsdk.core.IL.bX bX;
    private final java.lang.String bg;

    public iR(java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.bg bgVar) {
        this(str, bgVar, null);
    }

    public iR(java.lang.String str, com.bytedance.sdk.openadsdk.core.PX.bg bgVar, com.bytedance.sdk.openadsdk.core.IL.bX bXVar) {
        this.bg = str;
        this.IL = bgVar;
        this.bX = bXVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.bX bXVar) {
        this.bX = bXVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bX
    protected void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.PX.bg bgVar = this.IL;
        if (bgVar != null) {
            bgVar.zx(this.bg);
        }
        if (view != null) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.bX) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.iR) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.bg);
            }
        }
        com.bytedance.sdk.openadsdk.core.IL.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.JAA = this.JAA;
            this.bX.Ja = this.Ja;
            this.bX.Uw = this.Uw;
            this.bX.DDQ = this.Uw;
            this.bX.Uq = this.Uw;
            this.bX.bg(view, f, f2, f3, f4, sparseArray, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bX, android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}

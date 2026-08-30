package com.bytedance.sdk.openadsdk.tuV.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.tuV.bg.bg {
    private volatile boolean IL;
    private com.bytedance.sdk.openadsdk.PX.zx bX;
    private final android.widget.FrameLayout eqN;
    private java.lang.String ldr;
    private android.widget.FrameLayout zx;

    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, boolean z, android.widget.FrameLayout frameLayout, java.lang.String str) {
        super(context, tuv, i, z, frameLayout);
        this.eqN = frameLayout;
        this.ldr = str;
        IL(false);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context);
        int iEqN = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(context);
        if (i == 1) {
            if (iBX <= iEqN) {
                this.bg.layout(0, 0, iBX, iEqN);
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            if (iBX > iEqN) {
                this.bg.layout(0, 0, iBX, iEqN);
                return;
            }
        }
        this.bg.layout(0, 0, iEqN, iBX);
    }

    public void iR() {
        super.bg(true, new com.bytedance.sdk.openadsdk.PX.zx() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.IL.1
            @Override // com.bytedance.sdk.openadsdk.PX.zx
            public void bg() {
                if (com.bytedance.sdk.openadsdk.tuV.bg.IL.this.bX != null) {
                    com.bytedance.sdk.openadsdk.tuV.bg.IL.this.bX.bg();
                } else {
                    com.bytedance.sdk.openadsdk.tuV.bg.IL.this.IL = true;
                }
            }
        });
    }

    public void bg(android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.PX.zx zxVar) {
        this.zx = frameLayout;
        frameLayout.addView(this.eqN);
        this.bX = zxVar;
        if (this.IL) {
            this.bX.bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tuV.bg.bg
    public void bg() {
        this.zx.setVisibility(0);
        super.bg();
    }

    public java.lang.String Kg() {
        return this.ldr;
    }
}

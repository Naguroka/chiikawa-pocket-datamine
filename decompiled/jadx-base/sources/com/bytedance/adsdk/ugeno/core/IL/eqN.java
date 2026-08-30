package com.bytedance.adsdk.ugeno.core.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private boolean Kg;
    private com.bytedance.adsdk.ugeno.core.eo eqN;
    private android.content.Context iR;
    private java.lang.String ldr;
    private com.bytedance.adsdk.ugeno.core.eo zx;
    private float bg = Float.MIN_VALUE;
    private float IL = Float.MIN_VALUE;
    private int bX = 0;

    public eqN(android.content.Context context, com.bytedance.adsdk.ugeno.core.eo eoVar, boolean z) {
        this.iR = context;
        this.eqN = eoVar;
        this.Kg = z;
        IL();
    }

    public eqN(android.content.Context context, com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.core.eo eoVar2, boolean z) {
        this.iR = context;
        this.eqN = eoVar;
        this.zx = eoVar2;
        this.Kg = z;
        IL();
    }

    private void IL() {
        com.bytedance.adsdk.ugeno.core.eo eoVar = this.eqN;
        if (eoVar == null) {
            return;
        }
        this.bX = eoVar.bX().optInt("slideThreshold");
        this.ldr = this.eqN.bX().optString("slideDirection");
    }

    public void bg() {
        this.bg = Float.MIN_VALUE;
        this.IL = Float.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    public boolean bg(com.bytedance.adsdk.ugeno.core.PX px, com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.MotionEvent motionEvent) {
        float x;
        float y;
        int iIL;
        int iIL2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bg = motionEvent.getX();
            this.IL = motionEvent.getY();
        } else if (action == 1) {
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.Kg && java.lang.Math.abs(x - this.bg) <= 10.0f && java.lang.Math.abs(y - this.IL) <= 10.0f && px != null) {
                bg();
                px.bg(this.zx, bXVar, bXVar);
                return true;
            }
            if (this.bX != 0 && px != null) {
                bg();
                px.bg(this.eqN, bXVar, bXVar);
                return true;
            }
            iIL = com.bytedance.adsdk.ugeno.iR.Kg.IL(this.iR, x - this.bg);
            iIL2 = com.bytedance.adsdk.ugeno.iR.Kg.IL(this.iR, y - this.IL);
            if (android.text.TextUtils.equals(this.ldr, "up")) {
                iIL = -iIL2;
            } else if (!android.text.TextUtils.equals(this.ldr, "down")) {
                iIL = iIL2;
            } else if (android.text.TextUtils.equals(this.ldr, androidx.media3.extractor.text.ttml.TtmlNode.LEFT)) {
                iIL = -iIL;
            } else if (!android.text.TextUtils.equals(this.ldr, androidx.media3.extractor.text.ttml.TtmlNode.RIGHT)) {
                iIL = (int) java.lang.Math.abs(java.lang.Math.sqrt(java.lang.Math.pow(iIL, 2.0d) + java.lang.Math.pow(iIL2, 2.0d)));
            }
            if (iIL >= this.bX) {
                bg();
                return false;
            }
            if (px != null) {
                bg();
                px.bg(this.eqN, bXVar, bXVar);
                return true;
            }
            bg();
        } else if (action == 3) {
            if (this.bg == Float.MIN_VALUE || this.IL == Float.MIN_VALUE) {
                return false;
            }
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.Kg) {
            }
            if (this.bX != 0) {
            }
            iIL = com.bytedance.adsdk.ugeno.iR.Kg.IL(this.iR, x - this.bg);
            iIL2 = com.bytedance.adsdk.ugeno.iR.Kg.IL(this.iR, y - this.IL);
            if (android.text.TextUtils.equals(this.ldr, "up")) {
                iIL = -iIL2;
            } else if (!android.text.TextUtils.equals(this.ldr, "down")) {
                iIL = iIL2;
            } else if (android.text.TextUtils.equals(this.ldr, androidx.media3.extractor.text.ttml.TtmlNode.LEFT)) {
                iIL = -iIL;
            } else if (!android.text.TextUtils.equals(this.ldr, androidx.media3.extractor.text.ttml.TtmlNode.RIGHT)) {
                iIL = (int) java.lang.Math.abs(java.lang.Math.sqrt(java.lang.Math.pow(iIL, 2.0d) + java.lang.Math.pow(iIL2, 2.0d)));
            }
            if (iIL >= this.bX) {
                bg();
                return false;
            }
            if (px != null) {
                bg();
                px.bg(this.eqN, bXVar, bXVar);
                return true;
            }
            bg();
        }
        return true;
    }
}

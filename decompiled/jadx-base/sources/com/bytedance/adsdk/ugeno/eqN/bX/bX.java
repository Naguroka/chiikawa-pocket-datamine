package com.bytedance.adsdk.ugeno.eqN.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.ugeno.eqN.bX.bg {
    private java.lang.String PX;
    private int VB;
    private float WR;
    private float eo;

    public bX(android.content.Context context) {
        super(context);
        this.VB = 0;
        this.PX = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.bX.bg
    public boolean bg(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        if (this.zx != null) {
            this.PX = android.text.TextUtils.isEmpty(this.zx.get("direction")) ? androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL : this.zx.get("direction");
            this.VB = com.bytedance.adsdk.ugeno.iR.bX.bg(this.zx.get("distance"), 0);
        }
        return bg(this.IL, (android.view.MotionEvent) objArr[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    private boolean bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.MotionEvent motionEvent) {
        byte b;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.WR = motionEvent.getX();
            this.eo = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.VB == 0 && this.bg != null) {
                this.bg.bg(bXVar, this.ldr, this.bX.IL());
                return true;
            }
            int iIL = com.bytedance.adsdk.ugeno.iR.Kg.IL(this.Kg, x - this.WR);
            int iIL2 = com.bytedance.adsdk.ugeno.iR.Kg.IL(this.Kg, y - this.eo);
            switch (this.PX) {
                case "up":
                    b = 0;
                    break;
                case "all":
                    b = 4;
                    break;
                case "down":
                    b = 1;
                    break;
                case "left":
                    b = 2;
                    break;
                case "right":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                iIL = -iIL2;
            } else if (b == 1) {
                iIL = iIL2;
            } else if (b == 2) {
                iIL = -iIL;
            } else if (b != 3) {
                iIL = (int) java.lang.Math.abs(java.lang.Math.sqrt(java.lang.Math.pow(iIL, 2.0d) + java.lang.Math.pow(iIL2, 2.0d)));
            }
            if (iIL < this.VB) {
                return false;
            }
            if (this.bg != null) {
                this.WR = 0.0f;
                this.eo = 0.0f;
                this.bg.bg(bXVar, this.ldr, this.bX.IL());
                return true;
            }
        }
        return true;
    }
}

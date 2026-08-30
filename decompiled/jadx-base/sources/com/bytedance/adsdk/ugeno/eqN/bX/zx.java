package com.bytedance.adsdk.ugeno.eqN.bX;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.adsdk.ugeno.eqN.bX.bg implements com.bytedance.adsdk.ugeno.iR.WR.bg {
    private int PX;
    private android.os.Handler VB;
    private int WR;
    private int eo;

    public zx(android.content.Context context) {
        super(context);
        this.eo = 0;
        this.VB = new com.bytedance.adsdk.ugeno.iR.WR(android.os.Looper.getMainLooper(), this);
        this.PX = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.bX.bg
    public boolean bg(java.lang.Object... objArr) {
        if (this.zx != null) {
            int iBg = com.bytedance.adsdk.ugeno.iR.bX.bg(this.zx.get("loop"), 0);
            this.WR = iBg;
            if (iBg <= 0) {
                this.PX = -1;
            } else {
                this.PX = iBg;
            }
            this.eo = com.bytedance.adsdk.ugeno.iR.bX.bg(this.zx.get("duration"), 0);
        }
        this.VB.sendEmptyMessageDelayed(1001, this.eo);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.iR.WR.bg
    public void bg(android.os.Message message) {
        int i;
        int i2;
        if (message.what != 1001) {
            return;
        }
        android.util.Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.PX);
        this.bg.bg(this.IL, this.ldr, this.bX.IL());
        int i3 = this.PX - 1;
        this.PX = i3;
        if (i3 < 0 && (i2 = this.eo) != 0) {
            this.VB.sendEmptyMessageDelayed(1001, i2);
        } else if (i3 > 0 && (i = this.eo) != 0) {
            this.VB.sendEmptyMessageDelayed(1001, i);
        } else {
            this.VB.removeMessages(1001);
        }
    }
}

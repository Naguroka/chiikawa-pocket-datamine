package com.bytedance.sdk.openadsdk.component.ldr;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements android.os.Handler.Callback {
    private final com.bytedance.sdk.openadsdk.component.Kg.bg IL;
    private com.bytedance.sdk.openadsdk.component.ldr.bg bX;
    private boolean iR;
    private android.os.Handler bg = new android.os.Handler(android.os.Looper.myLooper(), this);
    private int eqN = 0;
    private int zx = 5;
    private int ldr = 0;

    public IL(com.bytedance.sdk.openadsdk.component.Kg.bg bgVar) {
        this.IL = bgVar;
    }

    public void bg(int i) {
        this.eqN = i;
        int i2 = this.zx - i;
        this.IL.bg(i2);
        if (i <= 0) {
            com.bytedance.sdk.openadsdk.component.ldr.bg bgVar = this.bX;
            if (bgVar != null && !this.iR) {
                bgVar.IL();
                this.iR = true;
            }
            i = 0;
        }
        boolean z = i2 >= this.ldr;
        com.bytedance.sdk.openadsdk.component.ldr.bg bgVar2 = this.bX;
        if (bgVar2 != null) {
            bgVar2.bg(i, i2, z);
        }
    }

    public void bg(float f) {
        int i = (int) f;
        this.zx = i;
        if (i <= 0) {
            this.zx = 5;
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.component.ldr.bg bgVar) {
        this.bX = bgVar;
    }

    public int bg() {
        return this.ldr;
    }

    public void IL(int i) {
        this.ldr = i;
    }

    public void IL() {
        android.os.Handler handler = this.bg;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.zx, 0));
        }
    }

    public void bX() {
        if (this.bg != null) {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.eqN;
            this.bg.sendMessage(messageObtain);
        }
    }

    public void eqN() {
        android.os.Handler handler = this.bg;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void zx() {
        this.bg.removeCallbacksAndMessages(null);
        this.bg = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 100 && this.bg != null) {
            int i = message.arg1;
            bg(i);
            if (i > 0) {
                android.os.Message messageObtain = android.os.Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i - 1;
                this.bg.sendMessageDelayed(messageObtain, 1000L);
            }
        }
        return true;
    }
}

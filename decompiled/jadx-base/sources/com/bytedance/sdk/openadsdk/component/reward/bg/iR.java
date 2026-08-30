package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.openadsdk.component.reward.bg.eo implements android.os.Handler.Callback {
    long IL;
    int bX;
    boolean bg;
    int eqN;
    boolean ldr;
    private final android.os.Handler tuV;
    int zx;

    public iR(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
        this.tuV = new android.os.Handler(this);
        this.bg = false;
        this.IL = 0L;
        this.bX = 0;
        this.eqN = 0;
        this.zx = 0;
        this.ldr = false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void bg() {
        if (this.Ta && !this.PX) {
            super.bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    protected void bg(boolean z) {
        if (this.vb != null) {
            try {
                this.xxp = com.bytedance.sdk.openadsdk.tuV.bg.eqN.bg().bg(this.WR, this.vb, IL());
            } catch (java.lang.Throwable unused) {
                com.bytedance.sdk.component.utils.PX.bg("RVIVPlayableNewManager", "PreRender injection exception");
            }
            if (this.xxp == null) {
                super.bg(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    protected com.bytedance.sdk.openadsdk.PX.zx IL() {
        return new com.bytedance.sdk.openadsdk.PX.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.iR.1
            @Override // com.bytedance.sdk.openadsdk.PX.zx
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.iR.this.PX();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void bX() {
        if (this.Ta) {
            this.iR = true;
            this.xxp.bg();
            if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.WR)) {
                this.VB.VJ.ldr();
            }
            this.eqN = this.WR.gtr();
            this.zx = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(this.VB.ldr), this.WR.fE());
            this.IL = java.lang.System.currentTimeMillis();
            android.os.Handler handler = this.tuV;
            handler.sendMessage(handler.obtainMessage(900, this.eqN, 0));
            this.VB.qC.VB();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void eqN() {
        if (this.Ta) {
            super.eqN();
            if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR() == 0) {
                this.VB.RJ = true;
            }
            if (this.VB.RJ) {
                this.VB.ayS.IL(true);
                bX(true);
            }
            if ((this.VB.dS == null || this.VB.dS.Ta == null || !this.VB.dS.Ta.isShowing()) && iR() > 0) {
                bg(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void zx() {
        if (this.Ta) {
            super.zx();
            if (com.bytedance.sdk.openadsdk.core.model.rri.bX(this.VB.IL)) {
                this.VB.bN.removeMessages(600);
            }
            this.tuV.removeMessages(900);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void ldr() {
        if (this.Ta && !this.Lq) {
            super.ldr();
            this.tuV.removeCallbacksAndMessages(null);
        }
    }

    public int iR() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void IL(int i) {
        this.bX = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void Kg() {
        if (this.Ta) {
            this.tuV.removeMessages(900);
            this.tuV.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public void bg(long j) {
        if (this.Ta && this.iR) {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = iR();
            this.tuV.sendMessageDelayed(messageObtain, j);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 900 && this.iR && com.bytedance.sdk.openadsdk.core.model.rri.bX(this.VB.IL) && !this.VzQ.get()) {
            int i = message.arg1;
            if (i > 0) {
                this.VB.ayS.eqN(true);
                int i2 = this.zx - (this.eqN - i);
                if (i2 == i) {
                    this.VB.ayS.bg(java.lang.String.valueOf(i), null);
                } else if (i2 > 0) {
                    this.VB.ayS.bg(java.lang.String.valueOf(i), java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(this.VB.uu.getApplicationContext(), "tt_skip_ad_time_text"), java.lang.Integer.valueOf(i2)));
                } else {
                    this.ldr = true;
                    if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.VB.IL)) {
                        this.VB.ayS.bX();
                        this.VB.ayS.zx(true);
                    } else {
                        this.VB.tuV.set(true);
                        this.VB.dS.Lq();
                    }
                }
                android.os.Message messageObtain = android.os.Message.obtain();
                messageObtain.what = 900;
                int i3 = i - 1;
                messageObtain.arg1 = i3;
                this.tuV.sendMessageDelayed(messageObtain, 1000L);
                this.bX = i3;
            } else {
                this.ldr = true;
                if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.WR) && (!com.bytedance.sdk.openadsdk.core.model.rri.rri(this.WR) || !this.xxp.zx())) {
                    this.VB.ayS.bX();
                    this.VB.ayS.zx(true);
                } else {
                    this.VB.ayS.eqN(false);
                    this.VB.tuV.set(true);
                    this.VB.dS.Lq();
                }
                if (this.xxp == null || this.xxp.zx()) {
                    this.yDt = true;
                }
            }
            PX();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eo
    public boolean WR() {
        return this.ldr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void PX() {
        boolean z = false;
        boolean z2 = (1.0f - (((float) this.bX) / ((float) this.eqN))) * 100.0f >= ((float) com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.VB.ldr)).ldr);
        int iBg = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bg(java.lang.String.valueOf(this.VB.ldr));
        if (iBg == 0) {
            boolean zLdr = this.xxp != null ? this.xxp.ldr() : false;
            if (this.yDt) {
                zLdr = true;
            }
            if (z2 && zLdr) {
                z = true;
            }
        } else if (iBg == 1) {
            z = z2;
        }
        if (z) {
            this.VB.qC.bg(true);
        }
    }
}

package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bykv.vk.openvk.bg.bg.bg.eqN.bX {
    private com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg Kg;
    private final com.bytedance.sdk.openadsdk.component.reward.bX.bg bg;
    private final com.bykv.vk.openvk.bg.bg.bg.IL.bg iR;
    private final com.bytedance.sdk.openadsdk.core.model.tuV ldr;
    private boolean zx;
    private boolean IL = true;
    private long bX = 0;
    private boolean eqN = false;

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public com.bykv.vk.openvk.bg.bg.bg.eqN.IL Ta() {
        return null;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean VB() {
        return false;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bX(long j) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL il) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN eqn) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void eqN(boolean z) {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public int iR() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public long ldr() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean vb() {
        return false;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean xxp() {
        return false;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void zx(boolean z) {
    }

    public bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar = new com.bykv.vk.openvk.bg.bg.bg.IL.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bX.1
        };
        this.iR = bgVar;
        this.ldr = tuv;
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
        long j = 10;
        long jLdr = ilDxa != null ? (long) ilDxa.ldr() : 10L;
        if (jLdr <= 0) {
            ilDxa.bg(10.0d);
        } else {
            j = jLdr;
        }
        this.bg = new com.bytedance.sdk.openadsdk.component.reward.bX.bg(j * 1000, bgVar, iRVar);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg() {
        this.bg.eo();
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar.bg(zx());
        bgVar.bX(Kg());
        bgVar.IL(ldr());
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(this.iR, bgVar);
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg interfaceC0142bg = this.Kg;
        if (interfaceC0142bg != null) {
            interfaceC0142bg.bg(2);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void IL() {
        this.bg.WR();
        com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
        bgVar.bg(zx());
        bgVar.bX(Kg());
        bgVar.IL(ldr());
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.IL(this.iR, bgVar);
        com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg interfaceC0142bg = this.Kg;
        if (interfaceC0142bg != null) {
            interfaceC0142bg.bg(1);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bX() {
        this.bg.VB();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(boolean z, int i) {
        bX();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void eqN() {
        bX();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar) {
        this.eqN = bXVar.Kg();
        if (bXVar.iR() > 0) {
            this.bg.bg(bXVar.iR());
        }
        com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.bg(this.ldr, this.iR, bXVar);
        this.bg.WR();
        return true;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public long zx() {
        return this.bg.Lq();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(long j) {
        this.bg.bg(j);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(boolean z) {
        this.IL = z;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public long Kg() {
        return this.bg.yDt();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public long WR() {
        return zx();
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public int eo() {
        return com.bykv.vk.openvk.bg.bg.IL.zx.bg.bg(this.bg.ldr, this.bg.bg);
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void IL(long j) {
        this.bX = j;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public com.bykv.vk.openvk.bg.bg.bg.bg PX() {
        return this.bg;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean yDt() {
        return this.eqN;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void IL(boolean z) {
        this.eqN = z;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public boolean Lq() {
        return this.zx;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bX(boolean z) {
        this.zx = z;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX
    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar) {
        this.bg.bg(bgVar);
    }

    public com.bykv.vk.openvk.bg.bg.bg.IL.bg VzQ() {
        return this.iR;
    }

    private static class bg implements com.bykv.vk.openvk.bg.bg.bg.bg {
        private long IL;
        private final com.bytedance.sdk.openadsdk.eqN.iR Kg;
        private int bX = 0;
        private final long bg;
        private android.os.CountDownTimer eqN;
        private final com.bykv.vk.openvk.bg.bg.bg.IL.bg iR;
        private long ldr;
        private com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg zx;

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public boolean IL() {
            return false;
        }

        public long PX() {
            return 0L;
        }

        public int Ta() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public boolean bX() {
            return false;
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public boolean bg() {
            return false;
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public int eqN() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public int zx() {
            return 0;
        }

        public bg(long j, com.bykv.vk.openvk.bg.bg.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
            this.bg = j;
            this.iR = bgVar;
            this.Kg = iRVar;
        }

        public void WR() {
            if (this.bX == 1) {
                return;
            }
            this.bX = 1;
            final long jYDt = yDt();
            final long j = jYDt - this.IL;
            android.os.CountDownTimer countDownTimer = new android.os.CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.bX.bg.1
                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.IL;
                    com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.ldr = j3;
                    if (com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.zx != null) {
                        com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.zx.bg(j3, jYDt);
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.bX = 4;
                    com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.ldr = jYDt;
                    if (com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.zx != null) {
                        com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.zx.bg(com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.Lq(), 100);
                    }
                    com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
                    bgVar.bg(jYDt);
                    bgVar.bX(jYDt);
                    bgVar.IL(com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.PX());
                    bgVar.eqN(com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.Ta());
                    com.bytedance.sdk.openadsdk.eqN.zx.bg.bg.IL(com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.iR, bgVar, com.bytedance.sdk.openadsdk.component.reward.bX.bg.this.Kg);
                }
            };
            this.eqN = countDownTimer;
            countDownTimer.start();
        }

        public void eo() {
            this.bX = 2;
            this.IL = this.ldr;
            android.os.CountDownTimer countDownTimer = this.eqN;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.eqN = null;
            }
        }

        public void VB() {
            this.bX = 0;
            android.os.CountDownTimer countDownTimer = this.eqN;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.eqN = null;
            }
            if (this.zx != null) {
                this.zx = null;
            }
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public boolean ldr() {
            return this.bX == 1;
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public boolean iR() {
            return this.bX == 2;
        }

        @Override // com.bykv.vk.openvk.bg.bg.bg.bg
        public boolean Kg() {
            return this.bX == 0;
        }

        public long yDt() {
            return this.bg;
        }

        public long Lq() {
            return this.ldr;
        }

        public void bg(long j) {
            this.IL = j;
        }

        public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar) {
            this.zx = bgVar;
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.bg.InterfaceC0142bg interfaceC0142bg) {
        this.Kg = interfaceC0142bg;
    }
}

package com.bytedance.sdk.openadsdk.eqN.zx.IL;

/* JADX INFO: loaded from: classes4.dex */
public class Lq {
    private java.lang.String IL;
    private int bX;
    private long bg;
    private com.bykv.vk.openvk.bg.bg.bg.bX.bX eqN;
    private com.bytedance.sdk.openadsdk.core.model.tuV zx;

    public Lq(long j, java.lang.String str, int i, com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.bg = j;
        this.IL = str;
        this.bX = i;
        this.eqN = bXVar;
        this.zx = tuv;
    }

    public long bg() {
        return this.bg;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public int bX() {
        return this.bX;
    }

    public com.bykv.vk.openvk.bg.bg.bg.bX.bX eqN() {
        return this.eqN;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV zx() {
        return this.zx;
    }

    public static class bg {
        private int Kg;
        private com.bykv.vk.openvk.bg.bg.bg.bX.bg VB;
        private int WR;
        private int iR;
        private int ldr;
        private int zx;
        private long bg = 0;
        private long IL = 0;
        private long bX = 0;
        private boolean eqN = false;
        private boolean eo = false;

        public long bg() {
            return this.bg;
        }

        public void bg(long j) {
            this.bg = j;
            Ta();
        }

        private void Ta() {
            long j = this.bX;
            if (j > 0) {
                long j2 = this.bg;
                if (j2 > j) {
                    this.bg = j2 % j;
                }
            }
        }

        public long IL() {
            return this.IL;
        }

        public void IL(long j) {
            this.IL = j;
        }

        public long bX() {
            return this.bX;
        }

        public void bX(long j) {
            this.bX = j;
            Ta();
        }

        public int eqN() {
            return this.zx;
        }

        public void bg(int i) {
            this.zx = i;
        }

        public int zx() {
            return this.ldr;
        }

        public void IL(int i) {
            this.ldr = i;
        }

        public int ldr() {
            long j = this.bX;
            if (j <= 0) {
                return 0;
            }
            return java.lang.Math.min((int) ((this.bg * 100) / j), 100);
        }

        public int iR() {
            return this.iR;
        }

        public void bX(int i) {
            this.iR = i;
        }

        public int Kg() {
            return this.Kg;
        }

        public int WR() {
            return this.WR;
        }

        public void eqN(int i) {
            this.WR = i;
        }

        public boolean eo() {
            return this.eo;
        }

        public boolean VB() {
            return this.eqN;
        }

        public void bg(boolean z) {
            this.eqN = z;
        }

        public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bg bgVar) {
            this.VB = bgVar;
        }

        public com.bykv.vk.openvk.bg.bg.bg.bX.bg PX() {
            return this.VB;
        }
    }
}

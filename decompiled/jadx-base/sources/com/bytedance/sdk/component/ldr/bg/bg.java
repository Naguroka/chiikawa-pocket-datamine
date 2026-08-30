package com.bytedance.sdk.component.ldr.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private com.bytedance.sdk.component.ldr.bg.IL.bX IL;
    private boolean Kg;
    private int PX;
    private long Ta;
    private int VB;
    private com.bytedance.sdk.component.ldr.bg.zx WR;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bX;
    private com.bytedance.sdk.component.ldr.bg.bg.zx bg;
    private boolean eo;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eqN;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg iR;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg ldr;
    private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg zx;

    private bg() {
        this.VB = 200;
        this.PX = 10;
    }

    public com.bytedance.sdk.component.ldr.bg.bg.zx bg() {
        return this.bg;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg IL() {
        return this.ldr;
    }

    public boolean bX() {
        return this.eo;
    }

    public com.bytedance.sdk.component.ldr.bg.zx eqN() {
        return this.WR;
    }

    public long zx() {
        return this.Ta;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg ldr() {
        return this.iR;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg iR() {
        return this.bX;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg Kg() {
        return this.eqN;
    }

    public com.bytedance.sdk.component.ldr.bg.eqN.IL.bg WR() {
        return this.zx;
    }

    public com.bytedance.sdk.component.ldr.bg.IL.bX eo() {
        return this.IL;
    }

    public boolean VB() {
        return this.Kg;
    }

    public int PX() {
        return this.VB;
    }

    public int Ta() {
        return this.PX;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ldr.bg.bg$bg, reason: collision with other inner class name */
    public static class C0114bg {
        private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg IL;
        private com.bytedance.sdk.component.ldr.bg.bg.zx Kg;
        private long PX;
        private boolean WR;
        private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bX;
        private com.bytedance.sdk.component.ldr.bg.IL.bX bg;
        private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg eqN;
        private com.bytedance.sdk.component.ldr.bg.zx iR;
        private boolean ldr;
        private com.bytedance.sdk.component.ldr.bg.eqN.IL.bg zx;
        private int eo = 5000;
        private int VB = 10;

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bg(long j) {
            this.PX = j;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bg(com.bytedance.sdk.component.ldr.bg.bg.zx zxVar) {
            this.Kg = zxVar;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bg(com.bytedance.sdk.component.ldr.bg.zx zxVar) {
            this.iR = zxVar;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bg(boolean z) {
            this.ldr = z;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bg(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
            this.IL = bgVar;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg IL(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
            this.bX = bgVar;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bX(com.bytedance.sdk.component.ldr.bg.eqN.IL.bg bgVar) {
            this.eqN = bgVar;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bg(com.bytedance.sdk.component.ldr.bg.IL.bX bXVar) {
            this.bg = bXVar;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg bg(int i) {
            this.eo = i;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg.C0114bg IL(int i) {
            this.VB = i;
            return this;
        }

        public com.bytedance.sdk.component.ldr.bg.bg bg() {
            com.bytedance.sdk.component.ldr.bg.bg bgVar = new com.bytedance.sdk.component.ldr.bg.bg();
            bgVar.IL = this.bg;
            bgVar.bX = this.IL;
            bgVar.eqN = this.bX;
            bgVar.zx = this.eqN;
            bgVar.ldr = this.zx;
            bgVar.Kg = this.ldr;
            bgVar.WR = this.iR;
            bgVar.bg = this.Kg;
            bgVar.eo = this.WR;
            bgVar.PX = this.VB;
            bgVar.VB = this.eo;
            bgVar.Ta = this.PX;
            return bgVar;
        }
    }
}

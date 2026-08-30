package com.bytedance.adsdk.IL.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.IL.ldr.bg implements android.view.Choreographer.FrameCallback {
    private com.bytedance.adsdk.IL.iR eo;
    private float IL = 1.0f;
    private boolean bX = false;
    private long eqN = 0;
    private float zx = 0.0f;
    private float ldr = 0.0f;
    private int iR = 0;
    private float Kg = -2.1474836E9f;
    private float WR = 2.1474836E9f;
    protected boolean bg = false;
    private boolean VB = false;

    @Override // android.animation.ValueAnimator
    public java.lang.Object getAnimatedValue() {
        return java.lang.Float.valueOf(ldr());
    }

    public float ldr() {
        com.bytedance.adsdk.IL.iR iRVar = this.eo;
        if (iRVar == null) {
            return 0.0f;
        }
        return (this.ldr - iRVar.ldr()) / (this.eo.iR() - this.eo.ldr());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fLq;
        float fVb;
        float fLq2;
        if (this.eo == null) {
            return 0.0f;
        }
        if (Fy()) {
            fLq = vb() - this.ldr;
            fVb = vb();
            fLq2 = Lq();
        } else {
            fLq = this.ldr - Lq();
            fVb = vb();
            fLq2 = Lq();
        }
        return fLq / (fVb - fLq2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.bytedance.adsdk.IL.iR iRVar = this.eo;
        if (iRVar == null) {
            return 0L;
        }
        return (long) iRVar.zx();
    }

    public float iR() {
        return this.ldr;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.bg;
    }

    public void bX(boolean z) {
        this.VB = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        xxp();
        if (this.eo == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.IL.zx.bg("LottieValueAnimator#doFrame");
        long j2 = this.eqN;
        float fTuV = (j2 != 0 ? j - j2 : 0L) / tuV();
        float f = this.zx;
        if (Fy()) {
            fTuV = -fTuV;
        }
        float f2 = f + fTuV;
        boolean z = !com.bytedance.adsdk.IL.ldr.zx.bX(f2, Lq(), vb());
        float f3 = this.zx;
        float fIL = com.bytedance.adsdk.IL.ldr.zx.IL(f2, Lq(), vb());
        this.zx = fIL;
        if (this.VB) {
            fIL = (float) java.lang.Math.floor(fIL);
        }
        this.ldr = fIL;
        this.eqN = j;
        if (!this.VB || this.zx != f3) {
            bX();
        }
        if (z) {
            if (getRepeatCount() != -1 && this.iR >= getRepeatCount()) {
                float fLq = this.IL < 0.0f ? Lq() : vb();
                this.zx = fLq;
                this.ldr = fLq;
                VzQ();
                IL(Fy());
            } else {
                bg();
                this.iR++;
                if (getRepeatMode() == 2) {
                    this.bX = !this.bX;
                    WR();
                } else {
                    float fVb = Fy() ? vb() : Lq();
                    this.zx = fVb;
                    this.ldr = fVb;
                }
                this.eqN = j;
            }
        }
        LZ();
        com.bytedance.adsdk.IL.zx.IL("LottieValueAnimator#doFrame");
    }

    private float tuV() {
        com.bytedance.adsdk.IL.iR iRVar = this.eo;
        if (iRVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iRVar.PX()) / java.lang.Math.abs(this.IL);
    }

    public void Kg() {
        this.eo = null;
        this.Kg = -2.1474836E9f;
        this.WR = 2.1474836E9f;
    }

    public void bg(com.bytedance.adsdk.IL.iR iRVar) {
        boolean z = this.eo == null;
        this.eo = iRVar;
        if (z) {
            bg(java.lang.Math.max(this.Kg, iRVar.ldr()), java.lang.Math.min(this.WR, iRVar.iR()));
        } else {
            bg((int) iRVar.ldr(), (int) iRVar.iR());
        }
        float f = this.ldr;
        this.ldr = 0.0f;
        this.zx = 0.0f;
        bg((int) f);
        bX();
    }

    public void bg(float f) {
        if (this.zx == f) {
            return;
        }
        float fIL = com.bytedance.adsdk.IL.ldr.zx.IL(f, Lq(), vb());
        this.zx = fIL;
        if (this.VB) {
            fIL = (float) java.lang.Math.floor(fIL);
        }
        this.ldr = fIL;
        this.eqN = 0L;
        bX();
    }

    public void bg(int i) {
        bg(i, (int) this.WR);
    }

    public void IL(float f) {
        bg(this.Kg, f);
    }

    public void bg(float f, float f2) {
        if (f > f2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("minFrame (%s) must be <= maxFrame (%s)", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)));
        }
        com.bytedance.adsdk.IL.iR iRVar = this.eo;
        float fLdr = iRVar == null ? -3.4028235E38f : iRVar.ldr();
        com.bytedance.adsdk.IL.iR iRVar2 = this.eo;
        float fIR = iRVar2 == null ? Float.MAX_VALUE : iRVar2.iR();
        float fIL = com.bytedance.adsdk.IL.ldr.zx.IL(f, fLdr, fIR);
        float fIL2 = com.bytedance.adsdk.IL.ldr.zx.IL(f2, fLdr, fIR);
        if (fIL == this.Kg && fIL2 == this.WR) {
            return;
        }
        this.Kg = fIL;
        this.WR = fIL2;
        bg((int) com.bytedance.adsdk.IL.ldr.zx.IL(this.ldr, fIL, fIL2));
    }

    public void WR() {
        bX(-eo());
    }

    public void bX(float f) {
        this.IL = f;
    }

    public float eo() {
        return this.IL;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.bX) {
            return;
        }
        this.bX = false;
        WR();
    }

    public void VB() {
        this.bg = true;
        bg(Fy());
        bg((int) (Fy() ? vb() : Lq()));
        this.eqN = 0L;
        this.iR = 0;
        xxp();
    }

    public void PX() {
        VzQ();
        IL(Fy());
    }

    public void Ta() {
        VzQ();
        eqN();
    }

    public void yDt() {
        this.bg = true;
        xxp();
        this.eqN = 0L;
        if (Fy() && iR() == Lq()) {
            bg(vb());
        } else if (!Fy() && iR() == vb()) {
            bg(Lq());
        }
        zx();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        IL();
        VzQ();
    }

    private boolean Fy() {
        return eo() < 0.0f;
    }

    public float Lq() {
        com.bytedance.adsdk.IL.iR iRVar = this.eo;
        if (iRVar == null) {
            return 0.0f;
        }
        float f = this.Kg;
        return f == -2.1474836E9f ? iRVar.ldr() : f;
    }

    public float vb() {
        com.bytedance.adsdk.IL.iR iRVar = this.eo;
        if (iRVar == null) {
            return 0.0f;
        }
        float f = this.WR;
        return f == 2.1474836E9f ? iRVar.iR() : f;
    }

    @Override // com.bytedance.adsdk.IL.ldr.bg
    void IL() {
        super.IL();
        IL(Fy());
    }

    protected void xxp() {
        if (isRunning()) {
            eqN(false);
            android.view.Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void VzQ() {
        eqN(true);
    }

    protected void eqN(boolean z) {
        android.view.Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.bg = false;
        }
    }

    private void LZ() {
        if (this.eo == null) {
            return;
        }
        float f = this.ldr;
        if (f < this.Kg || f > this.WR) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Frame must be [%f,%f]. It is %f", java.lang.Float.valueOf(this.Kg), java.lang.Float.valueOf(this.WR), java.lang.Float.valueOf(this.ldr)));
        }
    }
}

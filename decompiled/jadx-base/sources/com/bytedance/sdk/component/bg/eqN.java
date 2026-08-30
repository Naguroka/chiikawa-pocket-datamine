package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eqN<P, R> extends com.bytedance.sdk.component.bg.IL<P, R> {
    private com.bytedance.sdk.component.bg.eqN.bg IL;
    private com.bytedance.sdk.component.bg.ldr bX;
    private boolean bg = true;

    public interface IL {
        com.bytedance.sdk.component.bg.eqN bg();
    }

    interface bg {
        void bg(java.lang.Object obj);

        void bg(java.lang.Throwable th);
    }

    protected abstract void bg(P p, com.bytedance.sdk.component.bg.ldr ldrVar) throws java.lang.Exception;

    @Override // com.bytedance.sdk.component.bg.IL
    public /* bridge */ /* synthetic */ java.lang.String bg() {
        return super.bg();
    }

    protected final void bg(R r) {
        if (ldr()) {
            this.IL.bg(r);
            eqN();
        }
    }

    protected final void bg(java.lang.Throwable th) {
        if (ldr()) {
            this.IL.bg(th);
            eqN();
        }
    }

    protected final void bX() {
        bg((java.lang.Throwable) null);
    }

    protected void eqN() {
        this.bg = false;
        this.bX = null;
    }

    void bg(P p, com.bytedance.sdk.component.bg.ldr ldrVar, com.bytedance.sdk.component.bg.eqN.bg bgVar) throws java.lang.Exception {
        this.bX = ldrVar;
        this.IL = bgVar;
        bg(p, ldrVar);
    }

    void zx() {
        eqN();
    }

    private boolean ldr() {
        if (this.bg) {
            return true;
        }
        com.bytedance.sdk.component.bg.WR.bg(new java.lang.IllegalStateException("Jsb async call already finished: " + bg() + ", hashcode: " + hashCode()));
        return false;
    }
}

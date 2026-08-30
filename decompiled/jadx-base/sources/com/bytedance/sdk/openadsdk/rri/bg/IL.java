package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IL {
    protected com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private final java.lang.Integer Kg;
    private volatile boolean WR = false;
    protected final java.util.concurrent.atomic.AtomicBoolean bX;
    protected java.lang.ref.WeakReference<android.view.View> bg;
    private final java.util.concurrent.atomic.AtomicLong eqN;
    private final int iR;
    private final com.bytedance.sdk.openadsdk.rri.bg.zx.bg ldr;
    private final java.util.concurrent.atomic.AtomicBoolean zx;

    protected abstract void IL(int i);

    protected abstract boolean bX();

    public abstract int ldr();

    public static com.bytedance.sdk.openadsdk.rri.bg.IL bg(boolean z, java.lang.Integer num, android.view.View view, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar) {
        return z ? new com.bytedance.sdk.openadsdk.rri.bg.Kg(num, view, tuv, bgVar) : new com.bytedance.sdk.openadsdk.rri.bg.bX(num, view, tuv, bgVar);
    }

    public IL(java.lang.Integer num, android.view.View view, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar) {
        this.Kg = num;
        this.iR = i;
        this.IL = tuv;
        this.ldr = bgVar;
        bg(view);
        this.bX = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.eqN = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public void bg() {
        if (this.bX.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.rri.bg.iR.bg(this);
        }
    }

    public int IL() {
        if (WR()) {
            return 1;
        }
        java.lang.ref.WeakReference<android.view.View> weakReference = this.bg;
        android.view.View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.WR) {
            return 3;
        }
        if (VB().equals(view.getTag(androidx.core.view.InputDeviceCompat.SOURCE_HDMI))) {
            return VB().equals(view.getTag(androidx.core.view.InputDeviceCompat.SOURCE_HDMI)) && bX() ? 1 : 2;
        }
        eo();
        com.bytedance.sdk.openadsdk.rri.bg.zx.IL(VB());
        return 3;
    }

    protected void eqN() {
        if (this.zx.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.rri.bg.eqN.bg(this.IL, zx(), this.ldr);
        }
    }

    protected com.bytedance.sdk.openadsdk.rri.bg.bg zx() {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.bg;
        if (weakReference == null) {
            return new com.bytedance.sdk.openadsdk.rri.bg.bg(-1, -1, -1.0f);
        }
        android.view.View view = weakReference.get();
        if (view == null) {
            return new com.bytedance.sdk.openadsdk.rri.bg.bg(0, 0, 0.0f);
        }
        return new com.bytedance.sdk.openadsdk.rri.bg.bg(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void iR() {
        if (WR()) {
            return;
        }
        if (!this.bX.get()) {
            Kg();
        } else if (!this.eqN.compareAndSet(-1L, java.lang.System.currentTimeMillis()) && java.lang.System.currentTimeMillis() - this.eqN.get() >= this.iR) {
            eqN();
        }
    }

    public void Kg() {
        this.eqN.set(-1L);
    }

    public boolean WR() {
        return this.zx.get();
    }

    public void eo() {
        this.WR = true;
        com.bytedance.sdk.openadsdk.rri.bg.iR.IL(this);
    }

    public void bg(int i) {
        if (i == 4) {
            bg();
            return;
        }
        if (i == 8) {
            Ta();
        } else if (i == 9) {
            eqN();
        } else {
            IL(i);
        }
    }

    public java.lang.Integer VB() {
        return this.Kg;
    }

    public boolean PX() {
        return this.bX.get();
    }

    public void Ta() {
        this.bX.set(false);
        Kg();
    }

    public void bg(android.view.View view) {
        if (view != null) {
            view.setTag(androidx.core.view.InputDeviceCompat.SOURCE_HDMI, VB());
        }
        this.bg = new java.lang.ref.WeakReference<>(view);
    }
}

package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class ldr implements com.bytedance.sdk.openadsdk.utils.VB, java.lang.Runnable {
    private final android.app.Activity IL;
    private boolean Kg;
    private final java.util.concurrent.atomic.AtomicBoolean WR = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final android.os.Handler bX = new android.os.Handler(android.os.Looper.getMainLooper());
    private android.view.View bg = eqN();
    private long eqN;
    private final com.bytedance.sdk.openadsdk.utils.ldr.bg iR;
    private boolean ldr;
    private long zx;

    public interface bg {
        void IL();

        android.view.View bg();
    }

    public static com.bytedance.sdk.openadsdk.utils.VB bg(android.app.Activity activity, com.bytedance.sdk.openadsdk.utils.ldr.bg bgVar) {
        int iHi = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().hi();
        if (iHi < 0) {
            return new com.bytedance.sdk.openadsdk.utils.VB() { // from class: com.bytedance.sdk.openadsdk.utils.ldr.1
                @Override // com.bytedance.sdk.openadsdk.utils.VB
                public void IL() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.VB
                public void bX() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.VB
                public void bg() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.VB
                public void bg(long j) {
                }
            };
        }
        return new com.bytedance.sdk.openadsdk.utils.ldr(activity, java.lang.Math.min(iHi, 50) * 1000, bgVar);
    }

    private ldr(android.app.Activity activity, int i, com.bytedance.sdk.openadsdk.utils.ldr.bg bgVar) {
        this.iR = bgVar;
        this.IL = activity;
        this.eqN = i;
    }

    private android.view.View eqN() {
        com.bytedance.sdk.openadsdk.utils.ldr.bg bgVar = this.iR;
        if (bgVar != null) {
            return bgVar.bg();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.VB
    public void bg(long j) {
        if (this.WR.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.eqN += j;
            zx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.VB
    public void bg() {
        if (this.zx == 0 || !this.Kg) {
            return;
        }
        zx();
    }

    private void zx() {
        this.Kg = false;
        this.zx = android.os.SystemClock.elapsedRealtime();
        android.os.Handler handler = this.bX;
        if (handler != null) {
            handler.postDelayed(this, this.eqN);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.VB
    public void IL() {
        if (this.zx <= 0 || this.ldr) {
            return;
        }
        if (!this.Kg) {
            this.eqN -= android.os.SystemClock.elapsedRealtime() - this.zx;
        }
        this.Kg = true;
        if (this.eqN <= 0) {
            ldr();
            return;
        }
        android.os.Handler handler = this.bX;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ldr();
    }

    private void ldr() {
        android.app.Activity activity;
        android.view.View childAt;
        if (this.ldr || (activity = this.IL) == null || activity.isFinishing() || this.IL.isDestroyed()) {
            return;
        }
        if (this.bg == null) {
            this.bg = eqN();
        }
        android.view.View view = this.bg;
        if (view != null) {
            if (IL(view)) {
                bg(this.bg);
                android.view.View view2 = this.bg;
                if ((view2 instanceof android.view.ViewGroup) && ((android.view.ViewGroup) view2).getChildCount() > 0 && (childAt = ((android.view.ViewGroup) this.bg).getChildAt(0)) != null && IL(childAt)) {
                    bg(childAt);
                }
                com.bytedance.sdk.openadsdk.utils.ldr.bg bgVar = this.iR;
                if (bgVar != null) {
                    bgVar.IL();
                }
            }
            iR();
        }
        this.ldr = true;
    }

    private void iR() {
        android.view.ViewParent parent = this.bg.getParent();
        if (parent instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup.indexOfChild(this.bg) != viewGroup.getChildCount() - 1) {
                this.bg.bringToFront();
            }
        }
    }

    private void bg(android.view.View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean IL(android.view.View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.VB
    public void bX() {
        if (this.ldr) {
            return;
        }
        this.ldr = true;
        android.os.Handler handler = this.bX;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
            }
        }
    }
}

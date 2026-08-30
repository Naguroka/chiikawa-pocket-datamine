package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ldr {
    protected final com.bytedance.sdk.openadsdk.core.model.tuV Kg;
    protected com.bytedance.sdk.openadsdk.PX.zx PX = new com.bytedance.sdk.openadsdk.PX.zx() { // from class: com.bytedance.sdk.openadsdk.activity.ldr.1
        @Override // com.bytedance.sdk.openadsdk.PX.zx
        public void bg() {
            com.bytedance.sdk.openadsdk.activity.ldr.this.yDt();
        }
    };
    protected com.bytedance.sdk.openadsdk.IListenerManager VB;
    public int WR;
    private final com.bytedance.sdk.openadsdk.activity.IL bg;
    public boolean eo;

    protected abstract java.lang.String Fy();

    public void IL(android.app.Activity activity) {
    }

    public abstract void IL(boolean z);

    public void Lq() {
    }

    protected abstract boolean a_();

    public void bX(android.app.Activity activity) {
    }

    public abstract java.lang.String b_();

    public abstract android.view.View bg();

    public void bg(android.app.Activity activity) {
    }

    public void bg(android.app.Activity activity, android.os.Bundle bundle) {
    }

    public void bg(android.app.Activity activity, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
    }

    public void bg(com.bytedance.sdk.openadsdk.activity.ldr ldrVar, com.bytedance.sdk.openadsdk.activity.ldr ldrVar2, com.bytedance.sdk.openadsdk.activity.IL.zx zxVar) {
    }

    public void eqN(android.app.Activity activity) {
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.bg.bg tC();

    public abstract boolean tuV();

    public void xxp() {
    }

    public void yDt() {
    }

    public void zx(android.app.Activity activity) {
    }

    public ldr(com.bytedance.sdk.openadsdk.activity.IL il, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        this.bg = il;
        this.Kg = tuv;
        this.WR = i;
    }

    protected void bg(boolean z, boolean z2, boolean z3, int i) {
        this.bg.bg(this, z, z2, z3, i);
    }

    public com.bytedance.sdk.openadsdk.activity.IL kMt() {
        return this.bg;
    }

    public android.app.Activity JAA() {
        return this.bg.bX();
    }

    protected void Ja() {
        if (this.Kg != null) {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("videoForceBreak", this.Kg);
        }
        this.bg.bg(this);
    }

    protected void bg(java.lang.String str) {
        if (a_()) {
            bg(str, false, 0, "", 0, "");
        } else {
            IL(str);
        }
    }

    private void bg(final java.lang.String str, final boolean z, final int i, final java.lang.String str2, final int i2, final java.lang.String str3) {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.ldr.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.activity.ldr.this.bX(0).executeRewardVideoCallback(com.bytedance.sdk.openadsdk.activity.ldr.this.Fy(), str, z, i, str2, i2, str3);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    private void IL(final java.lang.String str) {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.ldr.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.activity.ldr.this.bX(1).executeFullVideoCallback(com.bytedance.sdk.openadsdk.activity.ldr.this.Fy(), str);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected final com.bytedance.sdk.openadsdk.IListenerManager bX(int i) {
        if (this.VB == null) {
            this.VB = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bg(i));
        }
        return this.VB;
    }

    public void Uw() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdClose");
        } else {
            this.bg.VB();
        }
    }

    protected void DDQ() {
        if (this.bg.Lq()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdShow");
        } else {
            this.bg.PX();
        }
        this.bg.vb();
    }

    protected final void Uq() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdVideoBarClick");
        } else {
            this.bg.eo();
        }
    }

    protected final void bg(boolean z, int i, java.lang.String str, int i2, java.lang.String str2) {
        if (this.bg.Ta()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onRewardVerify", z, i, str, i2, str2);
            this.bg.yDt();
        } else {
            this.bg.bg(this, z, i, str, i2, str2);
        }
    }
}

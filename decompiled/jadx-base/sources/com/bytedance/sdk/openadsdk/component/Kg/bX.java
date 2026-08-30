package com.bytedance.sdk.openadsdk.component.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg {
    private android.widget.FrameLayout IL;
    private com.bytedance.sdk.openadsdk.core.model.tuV bX;
    private android.content.Context bg;
    private com.bytedance.sdk.openadsdk.component.Kg.IL eqN;
    private boolean zx = false;

    public bX(android.content.Context context) {
        this.bg = context.getApplicationContext();
    }

    public void bg(android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.IL = frameLayout;
        this.bX = tuv;
        this.eqN = new com.bytedance.sdk.openadsdk.component.Kg.IL(this.bg, this.IL, this.bX);
    }

    public boolean bg() {
        com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(0).IL(), this.bX);
        ilBg.IL(this.bX.Ys());
        ilBg.bg(this.IL.getWidth());
        ilBg.IL(this.IL.getHeight());
        ilBg.bX(this.bX.Ny());
        ilBg.bg(0L);
        ilBg.bg(true);
        return this.eqN.bg(ilBg);
    }

    public void bg(boolean z) {
        this.zx = z;
    }

    public boolean IL() {
        return this.zx;
    }

    public boolean bX() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        return (il == null || il.PX() == null || !this.eqN.PX().IL()) ? false : true;
    }

    public boolean eqN() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        return (il == null || il.PX() == null || !this.eqN.PX().ldr()) ? false : true;
    }

    public boolean zx() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        return (il == null || il.PX() == null || !this.eqN.PX().iR()) ? false : true;
    }

    public boolean ldr() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        return il != null && il.vb();
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar) {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        if (il != null) {
            il.bg(bgVar);
        }
    }

    public boolean bg(android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.bg bgVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        bg(frameLayout, tuv);
        bg(bgVar);
        try {
            return bg();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    public void iR() {
        try {
            if (eqN()) {
                this.eqN.bg();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void Kg() {
        try {
            if (zx()) {
                eo();
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void WR() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        if (il == null) {
            return;
        }
        il.bX();
        this.eqN = null;
    }

    public void eo() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        if (il != null) {
            il.IL();
        }
    }

    public void VB() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        if (il == null) {
            return;
        }
        this.bg = null;
        il.bX();
        this.eqN = null;
    }

    public long PX() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        if (il != null) {
            return il.zx();
        }
        return 0L;
    }

    public long Ta() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        if (il != null) {
            return il.ldr();
        }
        return 0L;
    }

    public long yDt() {
        com.bytedance.sdk.openadsdk.component.Kg.IL il = this.eqN;
        if (il != null) {
            return il.Kg() + this.eqN.ldr();
        }
        return 0L;
    }

    public void bg(int i) {
        if (this.eqN != null) {
            com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg bgVar = new com.bytedance.sdk.openadsdk.eqN.zx.IL.Lq.bg();
            bgVar.bg(PX());
            bgVar.bX(yDt());
            bgVar.IL(Ta());
            bgVar.bX(i);
            bgVar.eqN(this.eqN.iR());
            this.eqN.bg(bgVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg
    public long getVideoProgress() {
        return PX();
    }
}

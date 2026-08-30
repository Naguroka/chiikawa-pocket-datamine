package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    android.os.Handler IL;
    private final java.lang.String Kg;
    private boolean VB;
    private com.bytedance.sdk.openadsdk.component.reward.view.IL WR;
    com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bg;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg eo;
    private final com.bytedance.sdk.openadsdk.core.model.tuV iR;
    private final android.app.Activity ldr;
    boolean bX = false;
    boolean eqN = false;
    boolean zx = false;

    public Kg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.eo = bgVar;
        this.ldr = bgVar.uu;
        this.iR = bgVar.IL;
        this.Kg = bgVar.zx;
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (this.zx) {
            return;
        }
        this.zx = true;
        this.WR = new com.bytedance.sdk.openadsdk.component.reward.view.IL(this.eo, adSlot, this.Kg);
    }

    public com.bytedance.sdk.openadsdk.component.reward.view.IL bg() {
        return this.WR;
    }

    public android.widget.FrameLayout IL() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il == null) {
            return null;
        }
        android.widget.FrameLayout videoFrameLayout = il.getVideoFrameLayout();
        if (this.WR.Ta()) {
            PX();
        }
        return videoFrameLayout;
    }

    public boolean bX() {
        return this.bX;
    }

    public void bg(boolean z) {
        this.bX = z;
    }

    public boolean eqN() {
        return this.eqN;
    }

    public void IL(boolean z) {
        this.eqN = z;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Kg.WR wr, com.bytedance.sdk.openadsdk.core.Kg.Kg kg) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (this.WR == null || (tuv = this.iR) == null) {
            return;
        }
        this.bg = bg(tuv);
        wr.bg(this.WR);
        wr.bg(this.bg);
        this.WR.setClickListener(wr);
        kg.bg((android.view.View) this.WR);
        kg.bg(this.bg);
        this.WR.setClickCreativeListener(kg);
    }

    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv.jz() == 4) {
            return com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.ldr, tuv, this.Kg);
        }
        return null;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Kg.yDt ydt) {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il == null) {
            return;
        }
        il.setExpressVideoListenerProxy(ydt);
    }

    public void bg(com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il == null) {
            return;
        }
        il.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public android.os.Handler zx() {
        if (this.IL == null) {
            this.IL = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return this.IL;
    }

    public void ldr() {
        if (this.VB) {
            return;
        }
        this.VB = true;
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il != null) {
            il.VB();
        }
        android.os.Handler handler = this.IL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void iR() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il != null) {
            il.eo();
        }
    }

    public boolean Kg() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il == null) {
            return false;
        }
        return il.Ta();
    }

    public int WR() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il != null) {
            return il.getDynamicShowType();
        }
        return 0;
    }

    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il != null) {
            return il.bg(jSONObject, this.eo.IL);
        }
        return null;
    }

    public void eo() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il == null) {
            return;
        }
        il.Kg();
    }

    public void VB() {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il == null) {
            return;
        }
        il.WR();
        this.WR.eo();
    }

    public void PX() {
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.iR) && this.iR.DDQ() == 3 && this.iR.Uq() == 0) {
            try {
                if (this.iR.xFs() == 1) {
                    int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 90.0f);
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.WR.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iBX;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bg(int i, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il != null) {
            il.bg(i, z, false);
        }
    }

    public void bg(int i, java.lang.String str) {
        com.bytedance.sdk.openadsdk.component.reward.view.IL il = this.WR;
        if (il != null) {
            il.IL(i, str);
        }
    }
}

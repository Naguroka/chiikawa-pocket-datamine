package com.bytedance.sdk.openadsdk.eqN.bg;

/* JADX INFO: loaded from: classes4.dex */
public class VB implements com.bytedance.sdk.component.ldr.bg.zx {
    private final java.lang.String bg = "[6406]";

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public boolean IL() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public boolean Kg() {
        return true;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public com.bytedance.sdk.component.ldr.bg.iR PX() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public boolean bX() {
        return true;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public com.bytedance.sdk.component.ldr.bg.eqN.bg bg(org.json.JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public boolean bg() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public boolean iR() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public int ldr() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public boolean bg(android.content.Context context) {
        return com.bytedance.sdk.component.utils.Lq.bg(context);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public java.lang.String bg(java.lang.String str) {
        return com.bytedance.sdk.component.eqN.bg.IL(str, com.bytedance.sdk.openadsdk.core.bg.bg());
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public java.lang.String IL(java.lang.String str) {
        return com.bytedance.sdk.component.eqN.bg.bg(str, com.bytedance.sdk.openadsdk.core.bg.bg());
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public java.lang.String WR() {
        return com.bytedance.sdk.openadsdk.utils.ayS.bX();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public com.bytedance.sdk.component.ldr.bg.zx.bX eo() {
        return new com.bytedance.sdk.openadsdk.eqN.bg.iR();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public java.util.concurrent.Executor eqN() {
        return com.bytedance.sdk.openadsdk.utils.VJ.bX();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public java.util.concurrent.Executor zx() {
        return com.bytedance.sdk.openadsdk.utils.VJ.iR();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public com.bytedance.sdk.component.ldr.bg.ldr VB() {
        com.bytedance.sdk.component.ldr.bg.ldr ldrVarBg;
        synchronized (this) {
            ldrVarBg = com.bytedance.sdk.openadsdk.multipro.bg.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        }
        return ldrVarBg;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public void bg(boolean z, int i, long j, com.bytedance.sdk.component.ldr.bg.ldr.eqN eqn) {
        java.lang.Runnable runnableBg;
        if (eqn == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.bX, z, i, j);
        if (z) {
            com.bytedance.sdk.openadsdk.yDt.bX.bg("track_link_result", false, (com.bytedance.sdk.openadsdk.yDt.IL) new com.bytedance.sdk.openadsdk.eqN.bg.Ta(true, eqn));
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.bg.yDt ydtZyO = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().ZyO();
        if (ydtZyO != null && eqn.eqN() < ydtZyO.bg(eqn.ldr())) {
            if (!ydtZyO.bg() || (runnableBg = eqn.bg(com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()), null)) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.utils.VJ.bg().schedule(runnableBg, ydtZyO.IL(eqn.ldr()), java.util.concurrent.TimeUnit.SECONDS);
            return;
        }
        com.bytedance.sdk.openadsdk.yDt.bX.bg("track_link_result", false, (com.bytedance.sdk.openadsdk.yDt.IL) new com.bytedance.sdk.openadsdk.eqN.bg.Ta(false, eqn));
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.ldr, z);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public boolean yDt() {
        return com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.bg;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public int bX(java.lang.String str) {
        return com.bytedance.sdk.openadsdk.core.settings.xxp.zU().ZyO().bg(str);
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public long Lq() {
        long jBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("log_queue_timeout", androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND);
        if (jBg < 30000 || jBg > com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jBg;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.zx
    public void Ta() {
        com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.ldr);
    }
}

package com.bytedance.adsdk.ugeno.core.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.adsdk.ugeno.core.PX {
    private java.lang.String IL;
    private com.bytedance.adsdk.ugeno.core.PX bg;
    private org.json.JSONObject eqN;
    private volatile com.bytedance.adsdk.ugeno.core.bg.bg.C0089bg zx;
    private boolean bX = true;
    private boolean ldr = false;

    public bg(com.bytedance.adsdk.ugeno.core.PX px) {
        this.bg = px;
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.eqN = jSONObject;
    }

    public void bg(java.lang.String str) {
        this.IL = str;
    }

    public void bg(boolean z) {
        this.bX = z;
    }

    public boolean bg() {
        java.lang.String str;
        return this.bX && (str = this.IL) != null && androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D.compareTo(str) <= 0 && this.eqN != null;
    }

    public void IL(boolean z) {
        this.ldr = z;
    }

    @Override // com.bytedance.adsdk.ugeno.core.PX
    public void bg(com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.core.PX.IL il, com.bytedance.adsdk.ugeno.core.PX.bg bgVar) {
        if (bg()) {
            bX(eoVar, il, bgVar);
        } else {
            IL(eoVar, il, bgVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.PX
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
        com.bytedance.adsdk.ugeno.core.PX px = this.bg;
        if (px == null) {
            return;
        }
        px.bg(bXVar, str, bgVar);
        android.util.Log.d("UGenEvent", "onUGenEvent: ");
    }

    private void IL(com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.core.PX.IL il, com.bytedance.adsdk.ugeno.core.PX.bg bgVar) {
        com.bytedance.adsdk.ugeno.core.PX px = this.bg;
        if (px == null) {
            return;
        }
        px.bg(eoVar, il, bgVar);
    }

    private void bX(com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.core.PX.IL il, com.bytedance.adsdk.ugeno.core.PX.bg bgVar) {
        if (this.zx == null) {
            this.zx = IL();
        }
        this.zx.bg(eoVar);
        this.zx.bg(il);
        this.zx.bg(bgVar);
        org.json.JSONObject jSONObjectBX = eoVar.bX();
        if (jSONObjectBX == null) {
            return;
        }
        new com.bytedance.sdk.component.uchain.action.EventChainAction.Builder(jSONObjectBX.optString("type")).setChainData(this.eqN).setEventChainLifeCycleListener(new com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.bg.bg.1
        }).build().run();
    }

    private com.bytedance.adsdk.ugeno.core.bg.bg.C0089bg IL() {
        if (this.zx != null) {
            return this.zx;
        }
        synchronized (com.bytedance.adsdk.ugeno.core.bg.bg.C0089bg.class) {
            if (this.zx != null) {
                return this.zx;
            }
            this.zx = new com.bytedance.adsdk.ugeno.core.bg.bg.C0089bg();
            return this.zx;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.bg.bg$bg, reason: collision with other inner class name */
    class C0089bg implements com.bytedance.sdk.component.uchain.listener.ICustomRouter {
        private com.bytedance.adsdk.ugeno.core.eo bX;
        com.bytedance.adsdk.ugeno.core.PX.bg bg;
        private com.bytedance.adsdk.ugeno.core.PX.IL eqN;

        C0089bg() {
        }

        public void bg(com.bytedance.adsdk.ugeno.core.eo eoVar) {
            this.bX = eoVar;
        }

        public void bg(com.bytedance.adsdk.ugeno.core.PX.IL il) {
            this.eqN = il;
        }

        public void bg(com.bytedance.adsdk.ugeno.core.PX.bg bgVar) {
            this.bg = bgVar;
        }
    }
}

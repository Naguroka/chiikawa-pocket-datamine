package com.bytedance.adsdk.ugeno;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private static volatile com.bytedance.adsdk.ugeno.eqN bg;
    private java.util.List<com.bytedance.adsdk.ugeno.core.IL> IL;
    private com.bytedance.adsdk.ugeno.core.bX bX;
    private com.bytedance.adsdk.ugeno.bg eqN;
    private com.bytedance.adsdk.ugeno.core.IL.bX ldr;
    private com.bytedance.adsdk.ugeno.bX.bg zx;

    public static com.bytedance.adsdk.ugeno.eqN bg() {
        if (bg == null) {
            synchronized (com.bytedance.adsdk.ugeno.eqN.class) {
                if (bg == null) {
                    bg = new com.bytedance.adsdk.ugeno.eqN();
                }
            }
        }
        return bg;
    }

    private eqN() {
    }

    public void bg(android.content.Context context, com.bytedance.adsdk.ugeno.core.bX bXVar, com.bytedance.adsdk.ugeno.bg bgVar) {
        this.bX = bXVar;
        this.eqN = bgVar;
        zx();
    }

    public com.bytedance.adsdk.ugeno.bg IL() {
        return this.eqN;
    }

    private void zx() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.IL = arrayList;
        com.bytedance.adsdk.ugeno.core.bX bXVar = this.bX;
        if (bXVar != null) {
            arrayList.addAll(bXVar.bg());
        }
        com.bytedance.adsdk.ugeno.core.eqN.bg(this.IL);
    }

    public void bg(com.bytedance.adsdk.ugeno.bX.bg bgVar) {
        this.zx = bgVar;
    }

    public com.bytedance.adsdk.ugeno.bX.bg bX() {
        return this.zx;
    }

    public void bg(com.bytedance.adsdk.ugeno.eqN.eqN eqn) {
        java.util.ArrayList arrayList = new java.util.ArrayList(new com.bytedance.adsdk.ugeno.eqN.bg().bg());
        if (eqn != null) {
            arrayList.addAll(eqn.bg());
        }
        com.bytedance.adsdk.ugeno.eqN.ldr.bg(arrayList);
    }

    public com.bytedance.adsdk.ugeno.core.IL.bX eqN() {
        return this.ldr;
    }
}

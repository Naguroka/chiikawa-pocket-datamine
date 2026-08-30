package com.bytedance.adsdk.ugeno.eqN.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private volatile java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.eqN.bg.bX> bg = new java.util.HashMap();

    public com.bytedance.adsdk.ugeno.eqN.bg.bX bg(java.lang.String str) {
        if (this.bg.containsKey(str) && this.bg.get(str) != null) {
            return this.bg.get(str);
        }
        com.bytedance.adsdk.ugeno.eqN.bg.IL il = new com.bytedance.adsdk.ugeno.eqN.bg.IL();
        this.bg.put(str, il);
        return il;
    }

    public void bg(java.lang.String str, com.bytedance.adsdk.ugeno.eqN.bg.bX bXVar) {
        if (!this.bg.containsKey(str) || this.bg.get(str) == null) {
            this.bg.put(str, bXVar);
        }
    }
}

package com.bytedance.adsdk.ugeno.eqN.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.adsdk.ugeno.eqN.bg.bX {
    private java.util.List<com.bytedance.adsdk.ugeno.eqN.bg.eqN> bg = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.eqN.bg.bX
    public void bg(com.bytedance.adsdk.ugeno.eqN.bg.eqN eqn) {
        this.bg.add(eqn);
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.bg.bX
    public void bg(java.lang.String str) {
        if (this.bg.isEmpty()) {
            return;
        }
        java.util.Iterator<com.bytedance.adsdk.ugeno.eqN.bg.eqN> it = this.bg.iterator();
        while (it.hasNext()) {
            it.next().bg(str);
        }
    }
}

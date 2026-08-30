package com.bytedance.adsdk.IL.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private final java.util.List<com.bytedance.adsdk.IL.bg.bg.tC> bg = new java.util.ArrayList();

    void bg(com.bytedance.adsdk.IL.bg.bg.tC tCVar) {
        this.bg.add(tCVar);
    }

    public void bg(android.graphics.Path path) {
        for (int size = this.bg.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.IL.ldr.ldr.bg(path, this.bg.get(size));
        }
    }
}

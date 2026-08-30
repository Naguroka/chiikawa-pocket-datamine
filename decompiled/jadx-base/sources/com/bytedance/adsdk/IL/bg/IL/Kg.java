package com.bytedance.adsdk.IL.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private final java.util.List<com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer>> IL;
    private final java.util.List<com.bytedance.adsdk.IL.bX.IL.Kg> bX;
    private final java.util.List<com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path>> bg;

    public Kg(java.util.List<com.bytedance.adsdk.IL.bX.IL.Kg> list) {
        this.bX = list;
        this.bg = new java.util.ArrayList(list.size());
        this.IL = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.bg.add(list.get(i).IL().bg());
            this.IL.add(list.get(i).bX().bg());
        }
    }

    public java.util.List<com.bytedance.adsdk.IL.bX.IL.Kg> bg() {
        return this.bX;
    }

    public java.util.List<com.bytedance.adsdk.IL.bg.IL.bg<com.bytedance.adsdk.IL.bX.IL.yDt, android.graphics.Path>> IL() {
        return this.bg;
    }

    public java.util.List<com.bytedance.adsdk.IL.bg.IL.bg<java.lang.Integer, java.lang.Integer>> bX() {
        return this.IL;
    }
}

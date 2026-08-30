package com.bytedance.adsdk.IL.bX.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private final com.bytedance.adsdk.IL.bX.bg.Kg IL;
    private final com.bytedance.adsdk.IL.bX.bg.eqN bX;
    private final com.bytedance.adsdk.IL.bX.IL.Kg.bg bg;
    private final boolean eqN;

    public enum bg {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Kg(com.bytedance.adsdk.IL.bX.IL.Kg.bg bgVar, com.bytedance.adsdk.IL.bX.bg.Kg kg, com.bytedance.adsdk.IL.bX.bg.eqN eqn, boolean z) {
        this.bg = bgVar;
        this.IL = kg;
        this.bX = eqn;
        this.eqN = z;
    }

    public com.bytedance.adsdk.IL.bX.IL.Kg.bg bg() {
        return this.bg;
    }

    public com.bytedance.adsdk.IL.bX.bg.Kg IL() {
        return this.IL;
    }

    public com.bytedance.adsdk.IL.bX.bg.eqN bX() {
        return this.bX;
    }

    public boolean eqN() {
        return this.eqN;
    }
}

package com.bytedance.adsdk.ugeno.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.ugeno.bg.IL.bg {
    public bX(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, java.util.TreeMap<java.lang.Float, java.lang.String> treeMap) {
        super(context, bXVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public void IL() {
        if (this.eqN == com.bytedance.adsdk.ugeno.bg.eqN.BACKGROUND_COLOR) {
            this.zx.add(android.animation.Keyframe.ofInt(0.0f, this.iR.ZQc()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public void bg(float f, java.lang.String str) {
        android.animation.Keyframe keyframeOfInt;
        if (this.eqN == com.bytedance.adsdk.ugeno.bg.eqN.BACKGROUND_COLOR) {
            keyframeOfInt = android.animation.Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.iR.bg.bg(str));
        } else {
            keyframeOfInt = android.animation.Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.iR.bX.bg(str, 0));
        }
        this.zx.add(keyframeOfInt);
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public android.animation.TypeEvaluator ldr() {
        if (this.eqN == com.bytedance.adsdk.ugeno.bg.eqN.BACKGROUND_COLOR) {
            return new android.animation.ArgbEvaluator();
        }
        return new android.animation.IntEvaluator();
    }
}

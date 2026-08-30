package com.bytedance.adsdk.ugeno.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private com.bytedance.adsdk.ugeno.bg.IL IL;
    private android.animation.ValueAnimator bX;
    private com.bytedance.adsdk.ugeno.IL.bX bg;
    private android.content.Context eqN;
    private com.bytedance.adsdk.ugeno.bg.bg.bg ldr;
    private int zx;

    public bg(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bX bXVar, com.bytedance.adsdk.ugeno.bg.IL il) {
        this.bg = bXVar;
        this.IL = il;
        this.eqN = context;
    }

    public void bg() {
        android.animation.ValueAnimator valueAnimator = this.bX;
        if (valueAnimator == null || this.zx == -2) {
            return;
        }
        valueAnimator.start();
    }

    public void IL() {
        android.animation.ValueAnimator valueAnimator = this.bX;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public android.animation.ValueAnimator bX() {
        com.bytedance.adsdk.ugeno.bg.IL.bg bXVar;
        com.bytedance.adsdk.ugeno.bg.IL il = this.IL;
        if (il == null || this.bg == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.util.TreeMap<java.lang.Float, java.lang.String>> mapIL = il.IL();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (mapIL != null && !mapIL.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.util.TreeMap<java.lang.Float, java.lang.String>> entry : mapIL.entrySet()) {
                if (entry != null) {
                    java.lang.String key = entry.getKey();
                    java.lang.String strBX = com.bytedance.adsdk.ugeno.bg.eqN.bg(key).bX();
                    strBX.hashCode();
                    switch (strBX) {
                        case "int":
                            bXVar = new com.bytedance.adsdk.ugeno.bg.IL.bX(this.eqN, this.bg, key, entry.getValue());
                            break;
                        case "float":
                            bXVar = new com.bytedance.adsdk.ugeno.bg.IL.IL(this.eqN, this.bg, key, entry.getValue());
                            break;
                        case "point":
                            bXVar = new com.bytedance.adsdk.ugeno.bg.IL.eqN(this.eqN, this.bg, key, entry.getValue());
                            break;
                        default:
                            bXVar = null;
                            break;
                    }
                    if (bXVar != null) {
                        arrayList.addAll(bXVar.zx());
                    }
                }
            }
        }
        org.json.JSONObject jSONObjectBg = this.IL.bg();
        if (jSONObjectBg != null) {
            com.bytedance.adsdk.ugeno.bg.bg.bg bgVarBg = com.bytedance.adsdk.ugeno.bg.bg.bg.C0087bg.bg(this.bg, jSONObjectBg);
            this.ldr = bgVarBg;
            if (bgVarBg != null) {
                arrayList.addAll(bgVarBg.bX());
            }
        }
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(this.bg.WR(), (android.animation.PropertyValuesHolder[]) arrayList.toArray(new android.animation.PropertyValuesHolder[0]));
        this.zx = com.bytedance.adsdk.ugeno.bg.bX.bg(this.IL.eqN());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.IL.bX());
        int i = this.zx;
        if (i != -2) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i);
        }
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.IL.ldr());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(com.bytedance.adsdk.ugeno.bg.bX.bg(this.IL.zx()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(com.bytedance.adsdk.ugeno.bg.bX.IL(this.IL.iR()));
        this.bX = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void bg(android.graphics.Canvas canvas) {
        com.bytedance.adsdk.ugeno.bg.bg.bg bgVar = this.ldr;
        if (bgVar != null) {
            bgVar.bg(canvas);
        }
    }

    public void bg(int i, int i2) {
        com.bytedance.adsdk.ugeno.bg.bg.bg bgVar = this.ldr;
        if (bgVar != null) {
            bgVar.bg(i, i2);
        }
    }
}

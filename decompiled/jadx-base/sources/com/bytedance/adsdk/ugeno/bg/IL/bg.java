package com.bytedance.adsdk.ugeno.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg {
    protected java.lang.String IL;
    protected java.util.Map<java.lang.Float, java.lang.String> bX;
    protected android.content.Context bg;
    protected com.bytedance.adsdk.ugeno.bg.eqN eqN;
    protected com.bytedance.adsdk.ugeno.IL.bX iR;
    protected java.util.List<android.animation.PropertyValuesHolder> ldr = new java.util.ArrayList();
    protected java.util.List<android.animation.Keyframe> zx = new java.util.ArrayList();

    public abstract void IL();

    public abstract void bg(float f, java.lang.String str);

    public abstract android.animation.TypeEvaluator ldr();

    public bg(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, java.util.Map<java.lang.Float, java.lang.String> map) {
        this.bg = context;
        this.IL = str;
        this.bX = map;
        this.eqN = com.bytedance.adsdk.ugeno.bg.eqN.bg(this.IL);
        this.iR = bXVar;
    }

    public boolean bg() {
        java.util.Map<java.lang.Float, java.lang.String> map = this.bX;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.bX.containsKey(java.lang.Float.valueOf(0.0f));
    }

    public void bX() {
        java.util.Map<java.lang.Float, java.lang.String> map = this.bX;
        if (map == null || map.size() <= 0) {
            return;
        }
        java.util.Map<java.lang.Float, java.lang.String> map2 = this.bX;
        if (map2 instanceof java.util.TreeMap) {
            float fFloatValue = ((java.lang.Float) ((java.util.TreeMap) map2).lastKey()).floatValue();
            if (fFloatValue != 100.0f) {
                bg(100.0f, this.bX.get(java.lang.Float.valueOf(fFloatValue)));
            }
        }
    }

    public void eqN() {
        java.util.Map<java.lang.Float, java.lang.String> map = this.bX;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!bg()) {
            IL();
        }
        for (java.util.Map.Entry<java.lang.Float, java.lang.String> entry : this.bX.entrySet()) {
            if (entry != null) {
                bg(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        bX();
    }

    public java.util.List<android.animation.PropertyValuesHolder> zx() {
        java.lang.String strIL = this.eqN.IL();
        eqN();
        android.animation.PropertyValuesHolder propertyValuesHolderOfKeyframe = android.animation.PropertyValuesHolder.ofKeyframe(strIL, (android.animation.Keyframe[]) this.zx.toArray(new android.animation.Keyframe[0]));
        android.animation.TypeEvaluator typeEvaluatorLdr = ldr();
        if (typeEvaluatorLdr != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorLdr);
        }
        this.ldr.add(propertyValuesHolderOfKeyframe);
        return this.ldr;
    }
}

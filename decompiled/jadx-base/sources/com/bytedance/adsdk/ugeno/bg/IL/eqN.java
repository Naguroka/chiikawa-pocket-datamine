package com.bytedance.adsdk.ugeno.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.adsdk.ugeno.bg.IL.bg {
    private java.util.List<android.animation.Keyframe> Kg;

    public eqN(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, java.util.Map<java.lang.Float, java.lang.String> map) {
        super(context, bXVar, str, map);
        this.Kg = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.bg.IL.eqN$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.bg.eqN.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.bg.eqN.TRANSLATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.ugeno.bg.eqN.SCALE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public void IL() {
        android.animation.Keyframe keyframeOfFloat;
        android.animation.Keyframe keyframeOfFloat2;
        int i = com.bytedance.adsdk.ugeno.bg.IL.eqN.AnonymousClass1.bg[this.eqN.ordinal()];
        if (i == 1) {
            keyframeOfFloat = android.animation.Keyframe.ofFloat(0.0f, this.iR.PX());
            keyframeOfFloat2 = android.animation.Keyframe.ofFloat(0.0f, this.iR.Ta());
        } else if (i != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = android.animation.Keyframe.ofFloat(0.0f, this.iR.yDt());
            keyframeOfFloat2 = android.animation.Keyframe.ofFloat(0.0f, this.iR.Lq());
        }
        if (keyframeOfFloat != null) {
            this.zx.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.Kg.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public void bg(float f, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.eqN == com.bytedance.adsdk.ugeno.bg.eqN.TRANSLATE) {
                fOptDouble = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bg, fOptDouble);
                fOptDouble2 = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bg, fOptDouble2);
            }
            this.zx.add(android.animation.Keyframe.ofFloat(f, fOptDouble));
            this.Kg.add(android.animation.Keyframe.ofFloat(f, fOptDouble2));
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public java.util.List<android.animation.PropertyValuesHolder> zx() {
        java.lang.String strIL = this.eqN.IL();
        eqN();
        android.animation.PropertyValuesHolder propertyValuesHolderOfKeyframe = android.animation.PropertyValuesHolder.ofKeyframe(strIL + "X", (android.animation.Keyframe[]) this.zx.toArray(new android.animation.Keyframe[0]));
        this.ldr.add(propertyValuesHolderOfKeyframe);
        android.animation.PropertyValuesHolder propertyValuesHolderOfKeyframe2 = android.animation.PropertyValuesHolder.ofKeyframe(strIL + "Y", (android.animation.Keyframe[]) this.Kg.toArray(new android.animation.Keyframe[0]));
        this.ldr.add(propertyValuesHolderOfKeyframe2);
        android.animation.TypeEvaluator typeEvaluatorLdr = ldr();
        if (typeEvaluatorLdr != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorLdr);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorLdr);
        }
        return this.ldr;
    }

    @Override // com.bytedance.adsdk.ugeno.bg.IL.bg
    public android.animation.TypeEvaluator ldr() {
        return new android.animation.FloatEvaluator();
    }
}

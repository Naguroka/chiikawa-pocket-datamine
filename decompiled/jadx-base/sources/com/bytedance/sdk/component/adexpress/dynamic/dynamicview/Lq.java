package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class Lq extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg IL;
    java.lang.String bg;

    public Lq(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg, java.lang.String str) {
        super(context, dynamicRootView, kg);
        this.bg = str;
        this.IL = kg;
        com.bytedance.sdk.component.adexpress.ldr.eo lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.ldr.eo getLottieView() {
        if (this.Ta == null || this.Ta.eo() == null || this.VB == null || android.text.TextUtils.isEmpty(this.bg)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = this.Ta.eo().zx();
        java.lang.String strDS = ldrVarZx != null ? ldrVarZx.dS() : "";
        if (android.text.TextUtils.isEmpty(strDS)) {
            return null;
        }
        java.lang.String str = this.bg + "static/lotties/" + strDS + ".json";
        com.bytedance.sdk.component.adexpress.ldr.eo eoVar = new com.bytedance.sdk.component.adexpress.ldr.eo(this.VB);
        eoVar.setImageLottieTosPath(str);
        eoVar.Kg();
        return eoVar;
    }
}

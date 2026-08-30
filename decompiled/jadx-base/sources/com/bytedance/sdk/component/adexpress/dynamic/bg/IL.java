package com.bytedance.sdk.component.adexpress.dynamic.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx bg(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        com.bytedance.sdk.component.adexpress.IL.Ta renderRequest;
        if (context == null || dynamicRootView == null || kg == null || kg.eo() == null) {
            return null;
        }
        switch (kg.eo().bg()) {
            case -1:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VW(context, dynamicRootView, kg);
            case 0:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ja(context, dynamicRootView, kg);
            case 1:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB(context, dynamicRootView, kg);
            case 2:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iR(context, dynamicRootView, kg);
            case 3:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.WR(context, dynamicRootView, kg);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ta(context, dynamicRootView, kg);
            case 5:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yDt(context, dynamicRootView, kg);
            case 6:
            case 9:
            case 17:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr(context, dynamicRootView, kg);
            case 7:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.daV(context, dynamicRootView, kg);
            case 8:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tuV(context, dynamicRootView, kg);
            case 10:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xxp(context, dynamicRootView, kg);
            case 11:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JAA(context, dynamicRootView, kg);
            case 12:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eo(context, dynamicRootView, kg);
            case 13:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Uw(context, dynamicRootView, kg);
            case 14:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DDQ(context, dynamicRootView, kg);
            case 15:
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Uq(context, dynamicRootView, kg);
                }
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aGH(context, dynamicRootView, kg);
            case 16:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB(context, dynamicRootView, kg);
            case 18:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kMt(context, dynamicRootView, kg);
            case 19:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rri(context, dynamicRootView, kg);
            case 20:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.LZ(context, dynamicRootView, kg);
            case 21:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tC(context, dynamicRootView, kg);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Kg(context, dynamicRootView, kg);
            case 23:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VzQ(context, dynamicRootView, kg);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eqN(context, dynamicRootView, kg);
            case 25:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.PX(context, dynamicRootView, kg);
            case 26:
                if ("vertical".equals(kg.eo().zx().xFs())) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VJ(context, dynamicRootView, kg);
                }
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bX(context, dynamicRootView, kg);
            case 27:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aGH(context, dynamicRootView, kg);
            case 28:
                if (!com.bytedance.sdk.component.adexpress.eqN.IL() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Lq(context, dynamicRootView, kg, renderRequest.kMt());
            default:
                return null;
        }
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eo {
    public static com.bytedance.sdk.component.adexpress.dynamic.bX.iR bg(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.eo eoVar, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        if (context == null || zxVar == null || iRVar == null) {
            return null;
        }
        java.lang.String strDxa = iRVar.Dxa();
        java.lang.String strKMt = ta.kMt();
        strDxa.hashCode();
        switch (strDxa) {
            case "0":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.zx(context, zxVar, iRVar);
            case "1":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.bX(context, zxVar, iRVar);
            case "2":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.IL(context, zxVar, iRVar);
            case "5":
                if (iRVar.jz() == 1) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ(context, zxVar, iRVar, iRVar.wS());
                }
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.xxp(context, zxVar, iRVar);
            case "6":
            case "11":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.yDt(context, zxVar, iRVar);
            case "7":
            case "14":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.PX(context, zxVar, iRVar);
            case "8":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.Ta(context, zxVar, iRVar);
            case "9":
            case "16":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.Lq(context, zxVar, iRVar, strDxa, eoVar.bg(), eoVar.IL(), eoVar.eqN(), eoVar.iR());
            case "10":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.eqN(context, zxVar, iRVar);
            case "12":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.xxp(context, zxVar, iRVar);
            case "13":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.VzQ(context, zxVar, iRVar);
            case "17":
            case "18":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.Fy(context, zxVar, iRVar, strDxa, eoVar);
            case "20":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.bX.VB(context, zxVar, iRVar, strKMt + "static/lotties/glass-swipe/glass-swipe.json", "20");
                }
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.VB(context, zxVar, iRVar, android.text.TextUtils.isEmpty(strKMt) ? null : strKMt + "brush_mask.json", "20");
            case "22":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.bX.VB(context, zxVar, iRVar, strKMt + "static/lotties/202327swiper-up-star/index.json", "22");
                }
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.tuV(context, zxVar, iRVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.bX.VB(context, zxVar, iRVar, strKMt + "static/lotties/202327swiper-up-star/click.json", "23");
                }
                return null;
            case "24":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.bX.bg(context, zxVar, iRVar);
                }
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.VB(context, zxVar, iRVar, android.text.TextUtils.isEmpty(strKMt) ? null : strKMt + "swiper_up_star.json", "24");
            case "25":
                if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                    return new com.bytedance.sdk.component.adexpress.dynamic.bX.VB(context, zxVar, iRVar, strKMt + "static/lotties/gesture-slide.json", "25");
                }
                return null;
            case "29":
                return new com.bytedance.sdk.component.adexpress.dynamic.bX.ldr(context, zxVar, iRVar, eoVar.bg(), eoVar.IL(), eoVar.eqN(), eoVar.iR());
            default:
                return null;
        }
    }
}

package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class tuV extends com.bytedance.adsdk.bg.IL.IL.bg.VzQ {
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> eqN = new java.lang.ThreadLocal<java.lang.StringBuilder>() { // from class: com.bytedance.adsdk.bg.IL.IL.bg.tuV.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public java.lang.StringBuilder initialValue() {
            return new java.lang.StringBuilder();
        }
    };

    public tuV() {
        super(com.bytedance.adsdk.bg.IL.eqN.bX.PLUS);
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        java.lang.Object objBg;
        java.lang.Object objBg2 = this.bg.bg(map);
        if (objBg2 == null || (objBg = this.IL.bg(map)) == null) {
            return null;
        }
        if ((objBg2 instanceof java.lang.String) || (objBg instanceof java.lang.String)) {
            java.lang.StringBuilder sb = eqN.get();
            sb.append(objBg2).append(objBg);
            java.lang.String string = sb.toString();
            sb.setLength(0);
            return string;
        }
        return com.bytedance.adsdk.bg.IL.zx.bg.Kg.bg((java.lang.Number) objBg2, (java.lang.Number) objBg);
    }
}

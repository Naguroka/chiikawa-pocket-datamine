package com.bytedance.adsdk.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.adsdk.ugeno.bX.bg {
    @Override // com.bytedance.adsdk.ugeno.bX.bg
    public com.bytedance.adsdk.ugeno.bX.bg.InterfaceC0085bg bg(java.lang.String str) {
        return com.bytedance.adsdk.bg.bg.C0080bg.bg(str);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.bg.bg$bg, reason: collision with other inner class name */
    static class C0080bg implements com.bytedance.adsdk.ugeno.bX.bg.InterfaceC0085bg {
        private java.lang.String IL;
        private com.bytedance.adsdk.bg.IL.bg bg;

        private C0080bg(java.lang.String str) {
            this.IL = str;
            this.bg = com.bytedance.adsdk.bg.IL.bg.bg(str);
        }

        public static com.bytedance.adsdk.bg.bg.C0080bg bg(java.lang.String str) {
            return new com.bytedance.adsdk.bg.bg.C0080bg(str);
        }

        @Override // com.bytedance.adsdk.ugeno.bX.bg.InterfaceC0085bg
        public java.lang.Object bg(org.json.JSONObject jSONObject) {
            com.bytedance.adsdk.bg.IL.bg bgVar = this.bg;
            if (bgVar == null) {
                return this.IL;
            }
            java.lang.Object objBg = bgVar.bg(jSONObject);
            if (objBg instanceof java.lang.String) {
                return objBg;
            }
            if (objBg instanceof com.bytedance.adsdk.bg.IL.bg.bg) {
                return java.lang.String.valueOf(com.bytedance.adsdk.bg.iR.bg((com.bytedance.adsdk.bg.IL.bg.bg) objBg));
            }
            return java.lang.String.valueOf(objBg);
        }
    }
}

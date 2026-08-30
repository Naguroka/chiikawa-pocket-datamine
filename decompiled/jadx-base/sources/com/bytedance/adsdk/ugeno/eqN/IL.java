package com.bytedance.adsdk.ugeno.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private java.util.List<com.bytedance.adsdk.ugeno.eqN.IL.bg> IL;
    private com.bytedance.adsdk.ugeno.eqN.IL.bg bg;

    public com.bytedance.adsdk.ugeno.eqN.IL.bg bg() {
        return this.bg;
    }

    public java.util.List<com.bytedance.adsdk.ugeno.eqN.IL.bg> IL() {
        return this.IL;
    }

    public static class bg {
        private java.lang.String IL;
        private java.util.Map<java.lang.String, java.lang.String> bX;
        private java.lang.String bg = "global";

        public java.lang.String bg() {
            return this.bg;
        }

        public void bg(java.lang.String str) {
            this.bg = str;
        }

        public java.lang.String IL() {
            return this.IL;
        }

        public void IL(java.lang.String str) {
            this.IL = str;
        }

        public java.util.Map<java.lang.String, java.lang.String> bX() {
            return this.bX;
        }

        public void bg(java.util.Map<java.lang.String, java.lang.String> map) {
            this.bX = map;
        }

        public java.lang.String toString() {
            return "Action{scheme='" + this.bg + "', name='" + this.IL + "', params=" + this.bX + '}';
        }
    }

    public static com.bytedance.adsdk.ugeno.eqN.IL bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.adsdk.ugeno.eqN.IL il = new com.bytedance.adsdk.ugeno.eqN.IL();
        java.lang.String strOptString = jSONObject.optString(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON);
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        il.bg = com.bytedance.adsdk.ugeno.eqN.Kg.bg(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.bytedance.adsdk.ugeno.eqN.IL.bg bgVarBg = com.bytedance.adsdk.ugeno.eqN.Kg.bg(jSONArrayOptJSONArray.optString(i), jSONObject2);
            if (bgVarBg != null) {
                arrayList.add(bgVarBg);
            }
        }
        il.IL = arrayList;
        return il;
    }
}

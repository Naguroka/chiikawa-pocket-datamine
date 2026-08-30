package com.bytedance.sdk.openadsdk.tuV.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> IL;
    private java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> bX;
    private java.lang.String bg;

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public void bg(java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> list) {
        this.IL = list;
    }

    public void IL(java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> list) {
        this.bX = list;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> IL() {
        return this.IL;
    }

    public java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> bX() {
        return this.bX;
    }

    public static com.bytedance.sdk.openadsdk.tuV.IL.bg IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.bytedance.sdk.openadsdk.tuV.IL.bg bgVar = new com.bytedance.sdk.openadsdk.tuV.IL.bg();
            bgVar.bg(jSONObject.optString("version"));
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg c0165bgBg = com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg.bg(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c0165bgBg != null) {
                        if (c0165bgBg.bX == 1) {
                            arrayList.add(c0165bgBg);
                        } else if (c0165bgBg.bX == 2 && arrayList2.size() < 10) {
                            arrayList2.add(c0165bgBg);
                        }
                    }
                }
            }
            bgVar.bg(arrayList);
            bgVar.IL(arrayList2);
            return bgVar;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tuV.IL.bg$bg, reason: collision with other inner class name */
    public static class C0165bg {
        private java.lang.String IL;
        private int bX;
        private java.lang.String bg;

        public static com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg bg(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg c0165bg = new com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg();
            c0165bg.bg = jSONObject.optString("url");
            c0165bg.IL = jSONObject.optString("md5");
            c0165bg.bX = jSONObject.optInt("type");
            return c0165bg;
        }

        public java.lang.String bg() {
            return this.bg;
        }

        public boolean equals(java.lang.Object obj) {
            java.lang.String str;
            if (obj instanceof com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg) {
                java.lang.String str2 = this.bg;
                if (str2 != null) {
                    com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg c0165bg = (com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg) obj;
                    if (str2.equals(c0165bg.bg) && (str = this.IL) != null && str.equals(c0165bg.IL)) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }
    }
}

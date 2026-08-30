package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private int IL;
    private java.lang.String Kg;
    private int PX;
    private java.lang.String Ta;
    private long WR;
    private java.lang.String bX;
    private java.lang.String bg;
    private boolean eo;
    private com.bytedance.sdk.openadsdk.core.model.bg.C0154bg eqN;
    private boolean zx;
    private java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> ldr = new java.util.ArrayList();
    private java.util.List<com.bytedance.sdk.openadsdk.core.model.Kg> iR = new java.util.ArrayList();
    private volatile boolean VB = false;

    public java.lang.String bg() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = zx();
        return tuvZx != null ? tuvZx.waE() : "";
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public int IL() {
        return this.IL;
    }

    public void bg(int i) {
        this.IL = i;
    }

    public void IL(java.lang.String str) {
        this.bX = str;
    }

    public java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> bX() {
        return this.ldr;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.ldr.add(tuv);
    }

    public void bg(java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list) {
        this.ldr = list;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.Kg kg) {
        this.iR.add(kg);
    }

    public void bX(java.lang.String str) {
        this.Kg = str;
    }

    public void bg(long j) {
        this.WR = j;
    }

    public static java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.model.tuV> bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        if (bgVar == null) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (com.bytedance.sdk.openadsdk.core.model.tuV tuv : bgVar.bX()) {
            if (!android.text.TextUtils.isEmpty(tuv.qp())) {
                map.put(tuv.qp(), tuv);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public boolean eqN() {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list = this.ldr;
        return list != null && list.size() > 0;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV zx() {
        if (this.ldr.size() > 0) {
            return this.ldr.get(0);
        }
        return null;
    }

    public boolean ldr() {
        if (Kg() != null && bX() != null && bX().size() > 1) {
            this.zx = true;
        } else {
            this.zx = false;
            bg((com.bytedance.sdk.openadsdk.core.model.bg.C0154bg) null);
        }
        return this.zx;
    }

    public boolean iR() {
        return this.eo;
    }

    public void bg(boolean z) {
        this.eo = z;
    }

    public com.bytedance.sdk.openadsdk.core.model.bg.C0154bg Kg() {
        return this.eqN;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.bg.C0154bg c0154bg) {
        this.eqN = c0154bg;
        if (c0154bg == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.bg.IL.IL.bg(com.bytedance.sdk.openadsdk.core.model.tuV.bg.bg(c0154bg, ""));
    }

    public boolean WR() {
        return this.VB;
    }

    public void eo() {
        this.VB = false;
    }

    public void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bg(com.bytedance.sdk.openadsdk.core.model.bg.C0154bg.bg(jSONObject.optJSONObject("tpl_info")));
    }

    public void IL(int i) {
        this.PX = i;
    }

    public boolean VB() {
        return this.PX == 1;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.bg$bg, reason: collision with other inner class name */
    public static class C0154bg extends com.bytedance.sdk.openadsdk.core.model.tuV.bg {
        private int bg;

        public void bg(int i) {
            this.bg = i;
        }

        public int bg() {
            return this.bg;
        }

        public org.json.JSONObject IL() {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("id", ldr());
                jSONObject.put("md5", iR());
                jSONObject.put("url", Kg());
                jSONObject.put("data", WR());
                jSONObject.put("diff_data", eo());
                jSONObject.put("version", zx());
                jSONObject.put("dynamic_creative", VB());
                jSONObject.put("count_down_time", bg());
                return jSONObject;
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        public static com.bytedance.sdk.openadsdk.core.model.bg.C0154bg bg(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            com.bytedance.sdk.openadsdk.core.model.bg.C0154bg c0154bg = new com.bytedance.sdk.openadsdk.core.model.bg.C0154bg();
            c0154bg.bX(jSONObject.optString("id"));
            c0154bg.eqN(jSONObject.optString("md5"));
            c0154bg.zx(jSONObject.optString("url"));
            c0154bg.ldr(jSONObject.optString("data"));
            c0154bg.iR(jSONObject.optString("diff_data"));
            c0154bg.IL(jSONObject.optString("version"));
            c0154bg.Kg(jSONObject.optString("dynamic_creative"));
            c0154bg.bg(jSONObject.optInt("count_down_time"));
            if (bg(c0154bg)) {
                return c0154bg;
            }
            return null;
        }

        private static boolean bg(com.bytedance.sdk.openadsdk.core.model.bg.C0154bg c0154bg) {
            return (c0154bg == null || android.text.TextUtils.isEmpty(c0154bg.ldr()) || android.text.TextUtils.isEmpty(c0154bg.Kg())) ? false : true;
        }
    }

    public org.json.JSONObject PX() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.bytedance.sdk.openadsdk.core.model.bg.C0154bg c0154bgKg = Kg();
            if (c0154bgKg != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObjectIL = c0154bgKg.IL();
                if (jSONObjectIL != null) {
                    jSONObject2.put("tpl_info", jSONObjectIL);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list = this.ldr;
            if (list != null && list.size() > 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i = 0; i < this.ldr.size(); i++) {
                    jSONArray.put(this.ldr.get(i).ZTq());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.eo);
            jSONObject.put("multi_ad_style", this.PX);
            jSONObject.put("request_id", this.bg);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.bg IL(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.bg bgVar = new com.bytedance.sdk.openadsdk.core.model.bg();
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (jSONObjectOptJSONObject != null) {
                bgVar.bg(jSONObjectOptJSONObject);
            }
            bgVar.IL(jSONObject.optInt("multi_ad_style", 0));
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.core.IL.bg(jSONArrayOptJSONArray.optJSONObject(i));
                    if (tuvBg != null) {
                        tuvBg.WR(bgVar.VB());
                        arrayList.add(tuvBg);
                    }
                }
                bgVar.bg(arrayList);
            }
            bgVar.bg(jSONObject.optBoolean("is_choose_ad_original", false));
            bgVar.bg(jSONObject.optString("request_id", ""));
            return bgVar;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void eqN(java.lang.String str) {
        this.Ta = str;
    }

    public java.lang.String Ta() {
        return this.Ta;
    }
}

package com.bytedance.adsdk.ugeno.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class zx implements com.bytedance.adsdk.ugeno.eqN.iR {
    private com.bytedance.adsdk.ugeno.IL.bX IL;
    private boolean bX;
    private java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.eqN.bX.bg> bg;

    public zx(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.eqN.bX.bg> map) {
        this.IL = bXVar;
        this.bg = map;
    }

    public void bg() {
        com.bytedance.adsdk.ugeno.eqN.bX.bg bgVarBg = bg("shake");
        if (bgVarBg != null) {
            bgVarBg.bg(this);
            bgVarBg.bg(new java.lang.Object[0]);
        }
    }

    public void IL() {
        com.bytedance.adsdk.ugeno.eqN.bX.bg bgVarBg = bg("twist");
        if (bgVarBg != null) {
            bgVarBg.bg(this);
            bgVarBg.bg(new java.lang.Object[0]);
        }
    }

    public void bX() {
        for (java.util.Map.Entry<java.lang.String, com.bytedance.adsdk.ugeno.eqN.bX.bg> entry : this.bg.entrySet()) {
            if (entry != null) {
                com.bytedance.adsdk.ugeno.eqN.bX.bg value = entry.getValue();
                if (value instanceof com.bytedance.adsdk.ugeno.eqN.bX.IL) {
                    value.bg(this);
                    value.bg(new java.lang.Object[0]);
                }
            }
        }
    }

    public void eqN() {
        com.bytedance.adsdk.ugeno.eqN.bX.bg bgVarBg = bg("timer");
        if (bgVarBg != null) {
            bgVarBg.bg(this);
            bgVarBg.bg(new java.lang.Object[0]);
        }
    }

    public boolean bg(android.view.MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.eqN.bX.bg bgVarBg = bg("tap");
        if (bgVarBg instanceof com.bytedance.adsdk.ugeno.eqN.bX.eqN) {
            bgVarBg.bg(this);
            this.bX = bgVarBg.bg(motionEvent);
        }
        if (this.bX) {
            return true;
        }
        com.bytedance.adsdk.ugeno.eqN.bX.bg bgVarBg2 = bg("slide");
        if (bgVarBg2 instanceof com.bytedance.adsdk.ugeno.eqN.bX.bX) {
            bgVarBg2.bg(this);
            return bgVarBg2.bg(motionEvent);
        }
        return this.bX;
    }

    private void bg(java.lang.String str, java.util.List<com.bytedance.adsdk.ugeno.eqN.IL.bg> list) {
        com.bytedance.adsdk.ugeno.eqN.IL.bg bgVarBg;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar : list) {
            if (bgVar != null && (bgVarBg = com.bytedance.adsdk.ugeno.eqN.IL.bg.C0090bg.bg(this.IL, str, bgVar)) != null) {
                bgVarBg.bg();
            }
        }
    }

    private com.bytedance.adsdk.ugeno.eqN.bX.bg bg(java.lang.String str) {
        java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.eqN.bX.bg> map = this.bg;
        if (map == null || map.isEmpty() || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return this.bg.get(str);
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.iR
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, java.util.List<com.bytedance.adsdk.ugeno.eqN.IL.bg> list) {
        bg(str, list);
    }

    public static com.bytedance.adsdk.ugeno.eqN.zx bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str) {
        com.bytedance.adsdk.ugeno.eqN.bX.bg bgVarBg;
        if (bXVar != null && !android.text.TextUtils.isEmpty(str)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                java.util.HashMap map = new java.util.HashMap();
                for (int i = 0; i < jSONArray.length(); i++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (bgVarBg = com.bytedance.adsdk.ugeno.eqN.bX.bg.C0091bg.bg(bXVar.WR().getContext(), bXVar, jSONObjectOptJSONObject, bXVar.eo())) != null) {
                        map.put(bgVarBg.IL(), bgVarBg);
                    }
                }
                return new com.bytedance.adsdk.ugeno.eqN.zx(bXVar, map);
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }
}

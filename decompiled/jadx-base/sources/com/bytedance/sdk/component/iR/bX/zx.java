package com.bytedance.sdk.component.iR.bX;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private static final java.lang.Object eqN = new java.lang.Object();
    private com.bytedance.sdk.component.iR.bX.eqN IL = new com.bytedance.sdk.component.iR.bX.eqN();
    private boolean bX;
    private android.content.Context bg;
    private int zx;

    public zx(android.content.Context context, boolean z, int i) {
        this.bg = context;
        this.bX = z;
        this.zx = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[EXC_TOP_SPLITTER, FINALLY_INSNS, SYNTHETIC] */
    public void bg(org.json.JSONObject jSONObject) {
        java.lang.Object obj;
        org.json.JSONObject jSONObject2;
        if (this.bX) {
            com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.zx).zx();
            try {
                try {
                    boolean z = jSONObject.optInt("ttnet_url_dispatcher_enabled", 0) > 0;
                    org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ttnet_dispatch_actions");
                    if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.zx).bX() && z && jSONArrayOptJSONArray != null) {
                        java.util.ArrayList<org.json.JSONObject> arrayList = new java.util.ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            org.json.JSONObject jSONObject3 = ((org.json.JSONObject) jSONArrayOptJSONArray.get(i)).getJSONObject("param");
                            if (jSONObject3.optString("service_name", "").equals("idc_selection")) {
                                arrayList.add(jSONObject3.getJSONObject("strategy_info"));
                            }
                        }
                        if (arrayList.isEmpty()) {
                            jSONObject2 = null;
                        } else {
                            jSONObject2 = new org.json.JSONObject();
                            for (org.json.JSONObject jSONObject4 : arrayList) {
                                java.util.Iterator<java.lang.String> itKeys = jSONObject4.keys();
                                while (itKeys.hasNext()) {
                                    java.lang.String next = itKeys.next();
                                    jSONObject2.put(next, jSONObject4.getString(next));
                                }
                            }
                        }
                    } else {
                        jSONObject2 = null;
                    }
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tnc_config");
                    if (jSONObjectOptJSONObject != null || jSONObject2 != null) {
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new org.json.JSONObject();
                            jSONObjectOptJSONObject.put("host_replace_map", jSONObject2);
                        } else if (jSONObject2 != null) {
                            jSONObjectOptJSONObject.put("host_replace_map", jSONObject2);
                        }
                    }
                    com.bytedance.sdk.component.iR.bX.eqN eqnIL = IL(jSONObjectOptJSONObject);
                    if (eqnIL != null) {
                        eqnIL.toString();
                    }
                    if (eqnIL == null) {
                        synchronized (eqN) {
                            this.bg.getSharedPreferences(com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.zx).bg(), 0).edit().putString("tnc_config_str", "").apply();
                            com.bytedance.sdk.component.iR.eqN.eqN.bg(this.bg, 1, "", this.zx);
                        }
                        return;
                    } else {
                        this.IL = eqnIL;
                        java.lang.String string = jSONObjectOptJSONObject.toString();
                        synchronized (eqN) {
                            this.bg.getSharedPreferences(com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.zx).bg(), 0).edit().putString("tnc_config_str", string).apply();
                            com.bytedance.sdk.component.iR.eqN.eqN.bg(this.bg, 1, string, this.zx);
                        }
                        return;
                    }
                } catch (java.lang.Throwable unused) {
                    this.IL = new com.bytedance.sdk.component.iR.bX.eqN();
                    synchronized (obj) {
                        return;
                    }
                }
            } finally {
                synchronized (eqN) {
                    this.bg.getSharedPreferences(com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.zx).bg(), 0).edit().putString("tnc_config_str", "").apply();
                    com.bytedance.sdk.component.iR.eqN.eqN.bg(this.bg, 1, "", this.zx);
                }
            }
            synchronized (eqN) {
                this.bg.getSharedPreferences(com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.zx).bg(), 0).edit().putString("tnc_config_str", "").apply();
                com.bytedance.sdk.component.iR.eqN.eqN.bg(this.bg, 1, "", this.zx);
            }
        }
    }

    public void bg() {
        if (this.bX) {
            java.lang.String string = this.bg.getSharedPreferences(com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.zx).bg(), 0).getString("tnc_config_str", null);
            if (android.text.TextUtils.isEmpty(string)) {
                return;
            }
            try {
                com.bytedance.sdk.component.iR.bX.eqN eqnIL = IL(new org.json.JSONObject(string));
                if (eqnIL != null) {
                    this.IL = eqnIL;
                }
                if (eqnIL == null) {
                    return;
                }
                eqnIL.toString();
            } catch (java.lang.Throwable th) {
                th.getMessage();
            }
        }
    }

    public void IL() {
        try {
            java.lang.String strBg = com.bytedance.sdk.component.iR.eqN.eqN.bg(this.bg, 1, this.zx);
            if (android.text.TextUtils.isEmpty(strBg)) {
                return;
            }
            com.bytedance.sdk.component.iR.bX.eqN eqnIL = IL(new org.json.JSONObject(strBg));
            if (eqnIL != null) {
                eqnIL.toString();
            }
            if (eqnIL != null) {
                this.IL = eqnIL;
            }
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    public com.bytedance.sdk.component.iR.bX.eqN bX() {
        return this.IL;
    }

    private com.bytedance.sdk.component.iR.bX.eqN IL(org.json.JSONObject jSONObject) {
        try {
            com.bytedance.sdk.component.iR.bX.eqN eqn = new com.bytedance.sdk.component.iR.bX.eqN();
            if (jSONObject.has("local_enable")) {
                eqn.bg = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                eqn.IL = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                java.util.HashMap map = new java.util.HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        java.lang.String string = jSONArray.getString(i);
                        if (!android.text.TextUtils.isEmpty(string)) {
                            map.put(string, 0);
                        }
                    }
                }
                eqn.bX = map;
            } else {
                eqn.bX = null;
            }
            if (jSONObject.has("host_replace_map")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                java.util.HashMap map2 = new java.util.HashMap();
                if (jSONObject2.length() > 0) {
                    java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        java.lang.String string2 = jSONObject2.getString(next);
                        if (!android.text.TextUtils.isEmpty(next) && !android.text.TextUtils.isEmpty(string2)) {
                            map2.put(next, string2);
                        }
                    }
                }
                eqn.eqN = map2;
            } else {
                eqn.eqN = null;
            }
            eqn.zx = jSONObject.optInt("req_to_cnt", eqn.zx);
            eqn.ldr = jSONObject.optInt("req_to_api_cnt", eqn.ldr);
            eqn.iR = jSONObject.optInt("req_to_ip_cnt", eqn.iR);
            eqn.Kg = jSONObject.optInt("req_err_cnt", eqn.Kg);
            eqn.WR = jSONObject.optInt("req_err_api_cnt", eqn.WR);
            eqn.eo = jSONObject.optInt("req_err_ip_cnt", eqn.eo);
            eqn.VB = jSONObject.optInt("update_interval", eqn.VB);
            eqn.PX = jSONObject.optInt("update_random_range", eqn.PX);
            eqn.Ta = jSONObject.optString("http_code_black", eqn.Ta);
            return eqn;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}

package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.component.ldr.bg.eqN.bg.IL {
    private com.bytedance.sdk.openadsdk.eqN.IL.bg Fy;
    protected final org.json.JSONObject IL;
    private int Kg;
    private java.lang.String LZ;
    private java.lang.String Lq;
    private final java.util.concurrent.atomic.AtomicBoolean PX;
    private org.json.JSONObject Ta;
    private java.lang.String VzQ;
    private int WR;
    private boolean bX;
    public final java.lang.String bg;
    private long eqN;
    private int iR;
    private java.lang.String kMt;
    private final java.lang.String ldr;
    private int rri;
    private java.lang.String tC;
    private java.lang.String tuV;
    private java.lang.String vb;
    private java.lang.String xxp;
    private java.lang.String yDt;
    private long zx;
    private static final java.util.Set<java.lang.String> eo = new java.util.HashSet(java.util.Arrays.asList("insight_log"));
    private static final java.util.Map<java.lang.String, java.lang.String> VB = new java.util.HashMap<java.lang.String, java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.eqN.bg.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    public bg(java.lang.String str, org.json.JSONObject jSONObject) {
        this.ldr = "adiff";
        this.PX = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Ta = new org.json.JSONObject();
        this.bg = str;
        this.IL = jSONObject;
    }

    private void ldr() {
        org.json.JSONObject jSONObject = this.Ta;
        if (jSONObject == null) {
            if (!bg(this.xxp, this.vb, this.tC)) {
                return;
            }
        } else {
            java.lang.String strOptString = jSONObject.optString("value");
            java.lang.String strOptString2 = this.Ta.optString("category");
            java.lang.String strOptString3 = this.Ta.optString("log_extra");
            if (bg(this.xxp, this.vb, this.tC)) {
                if (!android.text.TextUtils.isEmpty(strOptString) && android.text.TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!android.text.TextUtils.isEmpty(strOptString2) && !IL(strOptString2)) {
                    return;
                }
            } else {
                if ((android.text.TextUtils.isEmpty(strOptString) || android.text.TextUtils.equals(strOptString, "0")) && (android.text.TextUtils.isEmpty(this.xxp) || android.text.TextUtils.equals(this.xxp, "0"))) {
                    return;
                }
                if ((android.text.TextUtils.isEmpty(this.vb) || !IL(this.vb)) && (android.text.TextUtils.isEmpty(strOptString2) || !IL(strOptString2))) {
                    return;
                }
                if (android.text.TextUtils.isEmpty(this.tC) && android.text.TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        }
        this.eqN = com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg.incrementAndGet();
    }

    private boolean IL(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, "0") || android.text.TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.bg);
            }
            if (this.bX) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.iR);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.Kg);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.WR);
                }
            }
            if (com.bytedance.sdk.openadsdk.Fy.bg.bg("replace_log_extra_key", false)) {
                IL(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.bg + "-" + java.lang.System.currentTimeMillis());
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    private void IL(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (java.lang.String str : VB.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    java.lang.Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(VB.get(str), objOpt);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public org.json.JSONObject bX() {
        if (this.PX.get()) {
            return this.IL;
        }
        try {
            iR();
            if (this.IL.has("ad_extra_data")) {
                java.lang.Object objOpt = this.IL.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof org.json.JSONObject) {
                            com.bytedance.sdk.component.utils.PX.bg("AdEvent", "ad_extra_data is JSONObject");
                            this.IL.put("ad_extra_data", bg((org.json.JSONObject) objOpt).toString());
                        } else if (objOpt instanceof java.lang.String) {
                            this.IL.put("ad_extra_data", bg(new org.json.JSONObject((java.lang.String) objOpt)).toString());
                        }
                    } catch (org.json.JSONException e) {
                        com.bytedance.sdk.component.utils.PX.bg("AdEvent", "json error", e.getMessage());
                    }
                }
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("adiff", this.bg);
                    if (this.bX) {
                        jSONObject.put("interaction_method", this.iR);
                        jSONObject.put("real_interaction_method", this.Kg);
                        jSONObject.put("image_mode", this.WR);
                    }
                    this.IL.put("ad_extra_data", jSONObject.toString());
                } catch (org.json.JSONException e2) {
                    com.bytedance.sdk.component.utils.PX.bg("AdEvent", "json error", e2.getMessage());
                }
            }
            this.PX.set(true);
        } catch (java.lang.Throwable unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
        }
        return this.IL;
    }

    public org.json.JSONObject bg(boolean z) {
        org.json.JSONObject jSONObjectBX = bX();
        try {
            if (z) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(jSONObjectBX.toString());
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObjectBX.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("AdEvent", e.getMessage());
            return jSONObjectBX;
        }
    }

    private void iR() throws org.json.JSONException {
        this.IL.putOpt("app_log_url", this.kMt);
        this.IL.putOpt("tag", this.yDt);
        this.IL.putOpt("label", this.Lq);
        this.IL.putOpt("category", this.vb);
        if (!android.text.TextUtils.isEmpty(this.xxp)) {
            try {
                this.IL.putOpt("value", java.lang.Long.valueOf(java.lang.Long.parseLong(this.xxp)));
            } catch (java.lang.NumberFormatException unused) {
                this.IL.putOpt("value", 0L);
            }
        }
        if (!android.text.TextUtils.isEmpty(this.tuV)) {
            try {
                this.IL.putOpt("ext_value", java.lang.Long.valueOf(java.lang.Long.parseLong(this.tuV)));
            } catch (java.lang.Exception unused2) {
            }
        }
        if (!android.text.TextUtils.isEmpty(this.tC)) {
            this.IL.putOpt("log_extra", this.tC);
        }
        if (!android.text.TextUtils.isEmpty(this.LZ)) {
            try {
                this.IL.putOpt("ua_policy", java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.LZ)));
            } catch (java.lang.NumberFormatException unused3) {
            }
        }
        bg(this.IL, this.Lq);
        try {
            this.IL.putOpt("nt", java.lang.Integer.valueOf(this.rri));
        } catch (java.lang.Exception unused4) {
        }
        java.util.Iterator<java.lang.String> itKeys = this.Ta.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            this.IL.putOpt(next, this.Ta.opt(next));
        }
    }

    public java.lang.String eqN() {
        return this.bg;
    }

    bg(com.bytedance.sdk.openadsdk.eqN.bg.C0159bg c0159bg) {
        this.ldr = "adiff";
        this.PX = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Ta = new org.json.JSONObject();
        if (android.text.TextUtils.isEmpty(c0159bg.IL)) {
            this.bg = com.bytedance.sdk.openadsdk.utils.rri.bg();
        } else {
            this.bg = c0159bg.IL;
        }
        this.Fy = c0159bg.Lq;
        this.tC = c0159bg.ldr;
        this.yDt = c0159bg.bX;
        this.Lq = c0159bg.eqN;
        if (android.text.TextUtils.isEmpty(c0159bg.zx)) {
            this.vb = "app_union";
        } else {
            this.vb = c0159bg.zx;
        }
        this.LZ = c0159bg.VB;
        this.xxp = c0159bg.Kg;
        this.tuV = c0159bg.WR;
        this.VzQ = c0159bg.iR;
        this.rri = c0159bg.PX;
        this.kMt = c0159bg.Ta;
        this.Ta = c0159bg.eo = c0159bg.eo != null ? c0159bg.eo : new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.IL = jSONObject;
        if (!android.text.TextUtils.isEmpty(c0159bg.Ta)) {
            try {
                jSONObject.put("app_log_url", c0159bg.Ta);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("AdEvent", e.getMessage());
            }
        }
        this.iR = c0159bg.xxp;
        this.Kg = c0159bg.VzQ;
        this.WR = c0159bg.bg;
        this.bX = c0159bg.tuV;
        this.zx = java.lang.System.currentTimeMillis();
        ldr();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg.IL
    public org.json.JSONObject bg(java.lang.String str) {
        return bX();
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg.IL
    public long bg() {
        return this.zx;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg.IL
    public long IL() {
        return this.eqN;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.eqN.bg$bg, reason: collision with other inner class name */
    public static final class C0159bg {
        private java.lang.String Fy;
        private java.lang.String IL;
        private java.lang.String Kg;
        private com.bytedance.sdk.openadsdk.eqN.IL.bg Lq;
        private final int PX;
        private java.lang.String Ta;
        private java.lang.String VB;
        private int VzQ;
        private java.lang.String WR;
        private java.lang.String bX;
        public int bg;
        private org.json.JSONObject eo;
        private java.lang.String eqN;
        private java.lang.String iR;
        private java.lang.String ldr;
        private boolean tuV;
        private final long vb;
        private int xxp;
        private com.bytedance.sdk.openadsdk.eqN.IL.IL yDt;
        private java.lang.String zx;

        public C0159bg(long j, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
            this.xxp = -1;
            this.VzQ = -1;
            this.bg = -1;
            if (tuv != null) {
                this.tuV = com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv);
                this.xxp = tuv.xxp();
                this.VzQ = tuv.vb();
                this.bg = tuv.bOf();
            }
            this.vb = j;
            this.PX = com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg bg(java.lang.String str) {
            this.Ta = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg IL(java.lang.String str) {
            this.bX = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg bX(java.lang.String str) {
            this.eqN = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg eqN(java.lang.String str) {
            this.zx = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg zx(java.lang.String str) {
            this.Kg = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg ldr(java.lang.String str) {
            this.WR = str;
            return this;
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg bg(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.eo = jSONObject;
            return this;
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg iR(java.lang.String str) {
            this.iR = str;
            return this;
        }

        public void bg(com.bytedance.sdk.openadsdk.eqN.IL.bg bgVar) {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg(this.eqN, this.Fy, this.iR, this.bX);
            this.Lq = bgVar;
            final com.bytedance.sdk.openadsdk.eqN.bg bgVar2 = new com.bytedance.sdk.openadsdk.eqN.bg(this);
            try {
                com.bytedance.sdk.openadsdk.eqN.IL.IL il = this.yDt;
                if (il != null) {
                    il.bg(bgVar2.IL, this.vb);
                } else {
                    new com.bytedance.sdk.openadsdk.eqN.IL.bX().bg(bgVar2.IL, this.vb);
                }
            } catch (java.lang.Throwable unused) {
                java.lang.Object[] objArr = new java.lang.Object[1];
            }
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.eqN.bg.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(bgVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(bgVar2);
            }
        }

        public com.bytedance.sdk.openadsdk.eqN.bg.C0159bg Kg(java.lang.String str) {
            this.Fy = str;
            return this;
        }
    }

    public boolean zx() {
        java.util.Set<java.lang.String> setTa;
        if (this.IL == null || (setTa = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ta()) == null) {
            return false;
        }
        java.lang.String strOptString = this.IL.optString("label");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            if (android.text.TextUtils.isEmpty(this.Lq)) {
                return false;
            }
            return setTa.contains(this.Lq);
        }
        return setTa.contains(strOptString);
    }

    private static void bg(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            java.util.Set<java.lang.String> set = eo;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("AdEvent", th);
        }
    }
}

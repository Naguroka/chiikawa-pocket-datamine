package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg {
    protected com.bytedance.sdk.component.bg.Ta IL;
    protected com.bytedance.sdk.component.bg.Kg bX;
    protected android.content.Context bg;
    com.bytedance.sdk.component.bg.iR iR;
    protected java.lang.String zx;
    protected android.os.Handler eqN = new android.os.Handler(android.os.Looper.getMainLooper());
    protected volatile boolean ldr = false;
    private final java.util.Map<java.lang.String, com.bytedance.sdk.component.bg.iR> Kg = new java.util.HashMap();

    protected abstract void IL(com.bytedance.sdk.component.bg.eo eoVar);

    protected abstract android.content.Context bg(com.bytedance.sdk.component.bg.eo eoVar);

    protected abstract java.lang.String bg();

    protected abstract void bg(java.lang.String str);

    protected bg() {
    }

    protected void invokeMethod(final java.lang.String str) {
        if (this.ldr) {
            return;
        }
        this.eqN.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.bg.bg.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.bg.xxp xxpVarBg;
                if (com.bytedance.sdk.component.bg.bg.this.ldr) {
                    return;
                }
                try {
                    xxpVarBg = com.bytedance.sdk.component.bg.bg.this.bg(new org.json.JSONObject(str));
                } catch (java.lang.Exception unused) {
                    xxpVarBg = null;
                }
                if (com.bytedance.sdk.component.bg.xxp.bg(xxpVarBg)) {
                    new java.lang.StringBuilder("By pass invalid call: ").append(xxpVarBg);
                    if (xxpVarBg != null) {
                        com.bytedance.sdk.component.bg.bg.this.IL(com.bytedance.sdk.component.bg.JAA.bg(new com.bytedance.sdk.component.bg.tuV(xxpVarBg.bg, "Failed to parse invocation.")), xxpVarBg);
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.component.bg.bg.this.bg(xxpVarBg);
            }
        });
    }

    protected void bg(java.lang.String str, com.bytedance.sdk.component.bg.xxp xxpVar) {
        bg(str);
    }

    protected void IL() {
        this.iR.bg();
        java.util.Iterator<com.bytedance.sdk.component.bg.iR> it = this.Kg.values().iterator();
        while (it.hasNext()) {
            it.next().bg();
        }
        this.eqN.removeCallbacksAndMessages(null);
        this.ldr = true;
    }

    protected final void bg(com.bytedance.sdk.component.bg.xxp xxpVar) {
        java.lang.String strBg;
        if (this.ldr || (strBg = bg()) == null) {
            return;
        }
        com.bytedance.sdk.component.bg.iR iRVarIL = IL(xxpVar.iR);
        if (iRVarIL == null) {
            new java.lang.StringBuilder("Received call with unknown namespace, ").append(xxpVar);
            if (this.IL != null) {
                bg();
            }
            IL(com.bytedance.sdk.component.bg.JAA.bg(new com.bytedance.sdk.component.bg.tuV(-4, "Namespace " + xxpVar.iR + " unknown.")), xxpVar);
            return;
        }
        com.bytedance.sdk.component.bg.ldr ldrVar = new com.bytedance.sdk.component.bg.ldr();
        ldrVar.IL = strBg;
        ldrVar.bg = this.bg;
        ldrVar.bX = iRVarIL;
        try {
            com.bytedance.sdk.component.bg.iR.bg bgVarBg = iRVarIL.bg(xxpVar, ldrVar);
            if (bgVarBg == null) {
                new java.lang.StringBuilder("Received call but not registered, ").append(xxpVar);
                if (this.IL != null) {
                    bg();
                }
                IL(com.bytedance.sdk.component.bg.JAA.bg(new com.bytedance.sdk.component.bg.tuV(-2, "Function " + xxpVar.eqN + " is not registered.")), xxpVar);
                return;
            }
            if (bgVarBg.bg) {
                IL(bgVarBg.IL, xxpVar);
            }
            if (this.IL != null) {
                bg();
            }
        } catch (java.lang.Exception e) {
            new java.lang.StringBuilder("call finished with error, ").append(xxpVar);
            IL(com.bytedance.sdk.component.bg.JAA.bg(e), xxpVar);
        }
    }

    final void bg(com.bytedance.sdk.component.bg.eo eoVar, com.bytedance.sdk.component.bg.tC tCVar) {
        this.bg = bg(eoVar);
        this.bX = eoVar.eqN;
        this.IL = eoVar.WR;
        this.iR = new com.bytedance.sdk.component.bg.iR(eoVar, this, tCVar);
        this.zx = eoVar.VB;
        IL(eoVar);
    }

    final void IL(java.lang.String str, com.bytedance.sdk.component.bg.xxp xxpVar) {
        org.json.JSONObject jSONObject;
        if (this.ldr || android.text.TextUtils.isEmpty(xxpVar.ldr)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            com.bytedance.sdk.component.bg.WR.bg(new java.lang.IllegalArgumentException("Illegal callback data: ".concat(java.lang.String.valueOf(str))));
        }
        java.lang.String str2 = xxpVar.ldr;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception unused) {
            jSONObject = new org.json.JSONObject();
        }
        bg(com.bytedance.sdk.component.bg.Lq.bg().bg("__msg_type", "callback").bg("__callback_id", xxpVar.ldr).bg("__params", jSONObject).IL(), xxpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.component.bg.xxp bg(org.json.JSONObject jSONObject) {
        java.lang.String strOptString;
        if (this.ldr) {
            return null;
        }
        java.lang.String strOptString2 = jSONObject.optString("__callback_id");
        java.lang.String strOptString3 = jSONObject.optString("func");
        if (bg() == null) {
            return null;
        }
        try {
            java.lang.String string = jSONObject.getString("__msg_type");
            java.lang.String strValueOf = "";
            try {
                java.lang.Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof org.json.JSONObject) {
                    strOptString = java.lang.String.valueOf((org.json.JSONObject) objOpt);
                } else {
                    if (objOpt instanceof java.lang.String) {
                        strValueOf = (java.lang.String) objOpt;
                    } else {
                        strValueOf = java.lang.String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (java.lang.Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            java.lang.String string2 = jSONObject.getString("JSSDK");
            java.lang.String strOptString4 = jSONObject.optString("namespace");
            return com.bytedance.sdk.component.bg.xxp.bg().bg(string2).IL(string).bX(strOptString3).eqN(strOptString).zx(strOptString2).ldr(strOptString4).iR(jSONObject.optString("__iframe_url")).bg();
        } catch (org.json.JSONException unused2) {
            return com.bytedance.sdk.component.bg.xxp.bg(strOptString2, -1);
        }
    }

    private com.bytedance.sdk.component.bg.iR IL(java.lang.String str) {
        if (android.text.TextUtils.equals(str, this.zx) || android.text.TextUtils.isEmpty(str)) {
            return this.iR;
        }
        return this.Kg.get(str);
    }
}

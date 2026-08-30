package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class VzQ implements com.bytedance.sdk.openadsdk.eqN.eqN.zx {
    private com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private org.json.JSONArray Kg;
    private java.lang.Boolean bX;
    private java.lang.String bg;
    private java.lang.Boolean eqN;
    private org.json.JSONArray iR;
    private org.json.JSONObject ldr;
    private java.lang.Boolean zx;

    public VzQ(int i, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.bg = "embeded_ad";
        this.bX = java.lang.Boolean.FALSE;
        this.eqN = java.lang.Boolean.FALSE;
        this.zx = java.lang.Boolean.FALSE;
        this.bg = str;
        this.IL = tuv;
        this.ldr = new org.json.JSONObject();
        this.iR = new org.json.JSONArray();
        this.Kg = new org.json.JSONArray();
        bg(this.ldr, "webview_source", java.lang.Integer.valueOf(i));
    }

    protected VzQ() {
        this.bg = "embeded_ad";
        this.bX = java.lang.Boolean.FALSE;
        this.eqN = java.lang.Boolean.FALSE;
        this.zx = java.lang.Boolean.FALSE;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.eqN
    public void bg() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.1
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(jSONObject, "render_sequence", java.lang.Integer.valueOf(vzQ.IL.JAA()));
                if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.IL != null) {
                    if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.IL.LKE() != null) {
                        if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.IL.LKE().yDt()) {
                            com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "webview_count", java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.zx.zx.bg().eqN()));
                            com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "available_cache_count", java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.zx.zx.bg().eqN()));
                        } else {
                            com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "webview_count", java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.zx.zx.bg().bX()));
                            com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "available_cache_count", java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.zx.zx.bg().bX()));
                        }
                    } else if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.IL.uu() != null) {
                        com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "webview_count", java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.zx.zx.bg().eqN()));
                        com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "available_cache_count", java.lang.Integer.valueOf(com.bytedance.sdk.component.adexpress.zx.zx.bg().eqN()));
                    }
                }
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ2 = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ2.bg(vzQ2.ldr, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.eqN
    public void IL() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.12
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.eqN
    public void bg(final int i, final java.lang.String str) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.23
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "code", java.lang.Integer.valueOf(i));
                java.lang.String str2 = str;
                if (str2 != null) {
                    com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "reason", str2);
                }
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.IL
    public void bX() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.25
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bX
    public void eqN() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.26
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void zx() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.27
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "webview_load_start", (java.lang.Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void ldr() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.28
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void bg(final org.json.JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.29
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new org.json.JSONObject();
                }
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject2, "ts", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bX
    public void iR() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.30
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bX
    public void Kg() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.2
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bX
    public void WR() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.3
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "type", "native_enterBackground");
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.iR, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bX
    public void eo() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.4
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "type", "native_enterForeground");
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.iR, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void bg(final java.lang.String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.5
            @Override // java.lang.Runnable
            public void run() {
                if (android.text.TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "start_ts", java.lang.Long.valueOf(j));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "end_ts", java.lang.Long.valueOf(j2));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "intercept_type", java.lang.Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "type", "intercept_html");
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "url", str);
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "duration", java.lang.Long.valueOf(j2 - j));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.Kg, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void IL(final java.lang.String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.6
            @Override // java.lang.Runnable
            public void run() {
                if (android.text.TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "start_ts", java.lang.Long.valueOf(j));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "end_ts", java.lang.Long.valueOf(j2));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "intercept_type", java.lang.Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "type", "intercept_js");
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "url", str);
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "duration", java.lang.Long.valueOf(j2 - j));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.Kg, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void bg(final java.lang.String str) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.7
            @Override // java.lang.Runnable
            public void run() {
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "jsb", str);
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void IL(final java.lang.String str) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.8
            @Override // java.lang.Runnable
            public void run() {
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "jsb", str);
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void IL(final org.json.JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.9
            @Override // java.lang.Runnable
            public void run() {
                org.json.JSONObject jSONObject2;
                if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.ldr == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                    vzQ.bg(vzQ.ldr, next, jSONObject.opt(next));
                }
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.eqN = java.lang.Boolean.TRUE;
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.PX();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.zx
    public void VB() {
        this.bX = java.lang.Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.zx
    public void bg(boolean z) {
        this.zx = java.lang.Boolean.valueOf(z);
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.zx
    public void PX() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.10
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.xxp()) {
                    if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.iR != null && com.bytedance.sdk.openadsdk.eqN.VzQ.this.iR.length() != 0) {
                        try {
                            com.bytedance.sdk.openadsdk.eqN.VzQ.this.ldr.put("native_switchBackgroundAndForeground", com.bytedance.sdk.openadsdk.eqN.VzQ.this.iR);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.Kg != null && com.bytedance.sdk.openadsdk.eqN.VzQ.this.Kg.length() != 0) {
                        try {
                            com.bytedance.sdk.openadsdk.eqN.VzQ.this.ldr.put("intercept_source", com.bytedance.sdk.openadsdk.eqN.VzQ.this.Kg);
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("webview_time_track", com.bytedance.sdk.openadsdk.eqN.VzQ.this.ldr);
                    } catch (org.json.JSONException e) {
                        com.bytedance.sdk.component.utils.PX.bg("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (com.bytedance.sdk.openadsdk.core.WR.IL().xxp() && com.bytedance.sdk.openadsdk.eqN.VzQ.this.ldr != null) {
                        org.json.JSONObject unused3 = com.bytedance.sdk.openadsdk.eqN.VzQ.this.ldr;
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.eqN.VzQ.this.IL, com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg, "webview_time_track", jSONObject);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean xxp() {
        if (this.zx.booleanValue()) {
            return true;
        }
        return this.eqN.booleanValue() && this.bX.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj, boolean z) {
        if (jSONObject == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        bg(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(org.json.JSONArray jSONArray, java.lang.Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bg
    public void bX(final java.lang.String str) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.11
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bg
    public void IL(final int i, final java.lang.String str) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.13
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "code", java.lang.Integer.valueOf(i));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.IL
    public void Ta() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.14
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject2, "ts", java.lang.Long.valueOf(jCurrentTimeMillis2));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ2 = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ2.bg(vzQ2.ldr, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.IL
    public void yDt() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.15
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.eqN
    public void Lq() {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.16
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.eqN
    public void vb() {
        try {
            com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.17
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                    com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                    vzQ.bg(vzQ.ldr, "render_did_finish", jSONObject);
                }
            });
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bg
    public void eqN(final java.lang.String str) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.18
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bg
    public void zx(final java.lang.String str) {
        try {
            com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.19
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                    com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                    vzQ.bg(vzQ.ldr, str, jSONObject);
                }
            });
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bg
    public void ldr(final java.lang.String str) {
        try {
            com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.20
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                    com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                    vzQ.bg(vzQ.ldr, str, jSONObject);
                }
            });
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bg
    public void bX(final int i, final java.lang.String str) {
        try {
            com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.21
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                    com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "code", java.lang.Integer.valueOf(i));
                    com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                    vzQ.bg(vzQ.ldr, str, jSONObject);
                }
            });
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.bg
    public void iR(final java.lang.String str) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.22
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.eqN.eqN.ldr
    public void bg(final int i) {
        com.bytedance.sdk.component.utils.iR.bg().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VzQ.24
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "ts", java.lang.Long.valueOf(jCurrentTimeMillis));
                com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "isWebViewCache", java.lang.Integer.valueOf(i));
                if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.IL != null) {
                    if (com.bytedance.sdk.openadsdk.eqN.VzQ.this.IL.CQc()) {
                        com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "engine_version", "v3");
                    } else {
                        com.bytedance.sdk.openadsdk.eqN.VzQ.this.bg(jSONObject, "engine_version", "v1");
                    }
                }
                com.bytedance.sdk.openadsdk.eqN.VzQ vzQ = com.bytedance.sdk.openadsdk.eqN.VzQ.this;
                vzQ.bg(vzQ.ldr, "before_webview_request", jSONObject);
            }
        });
    }
}

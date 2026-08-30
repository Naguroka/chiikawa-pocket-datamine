package com.bytedance.sdk.openadsdk.core.VB.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    private final com.bytedance.sdk.openadsdk.core.model.tuV Kg;
    private boolean Lq;
    private final org.json.JSONObject PX;
    private boolean Ta;
    private org.json.JSONObject VB;
    private final java.lang.String WR;
    private com.bytedance.adsdk.ugeno.IL.bX bX;
    private com.bytedance.sdk.openadsdk.core.widget.ldr eo;
    private com.bytedance.adsdk.ugeno.IL.bX eqN;
    private final android.content.Context iR;
    private org.json.JSONArray vb;
    private boolean yDt;
    private com.bytedance.adsdk.ugeno.IL.bX zx;
    private int bg = -1;
    private int IL = -1;
    private final java.lang.String ldr = "UGenSwiperEvent";

    public eqN(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, org.json.JSONObject jSONObject) {
        this.iR = context;
        this.Kg = tuv;
        this.WR = str;
        this.PX = jSONObject;
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar) {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX = bXVar.bX("swiperLayout");
        this.zx = bXVarBX;
        if (bXVarBX instanceof com.bytedance.adsdk.ugeno.IL) {
            this.vb = this.PX.optJSONArray("dpa_data");
            this.bX = bXVar.bX("swiperLeftArrow");
            this.eqN = bXVar.bX("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.IL) this.zx).bg(new com.bytedance.adsdk.ugeno.ldr.bX() { // from class: com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.1
                @Override // com.bytedance.adsdk.ugeno.ldr.bX
                public void bg(boolean z, int i, int i2, boolean z2, boolean z3) {
                    com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.this.IL = i;
                    com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.this.bg = i2;
                    com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.this.Ta = z;
                    com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.this.yDt = z2;
                    com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.this.Lq = z3;
                    com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.this.bg(z, z2, z3);
                    com.bytedance.sdk.openadsdk.core.VB.eqN.eqN.this.bg(i);
                }
            });
        }
    }

    public void bg() {
        bg(this.Ta, this.yDt, this.Lq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(boolean z, boolean z2, boolean z3) {
        com.bytedance.adsdk.ugeno.IL.bX bXVar = this.bX;
        if (bXVar == null || this.eqN == null) {
            return;
        }
        android.view.View viewWR = bXVar.WR();
        android.view.View viewWR2 = this.eqN.WR();
        org.json.JSONArray jSONArray = this.vb;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewWR.setVisibility(8);
            viewWR2.setVisibility(8);
            return;
        }
        if (z) {
            return;
        }
        if (z2) {
            if (viewWR instanceof android.widget.TextView) {
                bg((android.widget.TextView) viewWR, 90);
            }
            if (viewWR2 instanceof android.widget.TextView) {
                bg((android.widget.TextView) viewWR2, 255);
                return;
            }
            return;
        }
        if (z3) {
            if (viewWR instanceof android.widget.TextView) {
                bg((android.widget.TextView) viewWR, 255);
            }
            if (viewWR2 instanceof android.widget.TextView) {
                bg((android.widget.TextView) viewWR2, 90);
                return;
            }
            return;
        }
        if (viewWR instanceof android.widget.TextView) {
            bg((android.widget.TextView) viewWR, 255);
        }
        if (viewWR2 instanceof android.widget.TextView) {
            bg((android.widget.TextView) viewWR2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(int i) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, i);
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.Kg, this.WR, "carousel_show", jSONObject);
    }

    private void bg(android.widget.TextView textView, int i) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(android.graphics.Color.argb(i, android.graphics.Color.red(currentTextColor), android.graphics.Color.green(currentTextColor), android.graphics.Color.blue(currentTextColor)));
    }

    public void IL() {
        int i;
        com.bytedance.adsdk.ugeno.IL.bX bXVar = this.zx;
        if (!(bXVar instanceof com.bytedance.adsdk.ugeno.IL) || (i = this.bg) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.IL) bXVar).bg(i - 1);
    }

    public void bX() {
        int i;
        com.bytedance.adsdk.ugeno.IL.bX bXVar = this.zx;
        if (!(bXVar instanceof com.bytedance.adsdk.ugeno.IL) || (i = this.bg) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.IL) bXVar).bg(i + 1);
    }

    public void bg(com.bytedance.sdk.openadsdk.core.widget.ldr ldrVar) {
        this.eo = ldrVar;
    }

    public boolean bg(com.bytedance.adsdk.ugeno.core.eo eoVar) {
        org.json.JSONObject jSONObjectOptJSONObject;
        this.VB = null;
        int i = this.IL;
        if (i != -1 && i != 0) {
            try {
                org.json.JSONObject jSONObjectBX = eoVar.bX();
                if (jSONObjectBX != null && (jSONObjectOptJSONObject = jSONObjectBX.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.vb != null) {
                            java.lang.String strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObjectOptJSONObject.optString("url"), this.vb.optJSONObject(this.IL));
                            java.lang.String strBg2 = com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObjectOptJSONObject.optString("fallback_url"), this.vb.optJSONObject(this.IL));
                            jSONObjectOptJSONObject.put("url", strBg);
                            jSONObjectOptJSONObject.put("fallback_url", strBg2);
                            bg(jSONObjectOptJSONObject, this.vb.optJSONObject(this.IL));
                        }
                        bg(jSONObjectOptJSONObject, eoVar.bg().WR());
                        return true;
                    }
                    return false;
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.VB = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                try {
                    this.VB.putOpt(next, com.bytedance.adsdk.ugeno.bX.IL.bg((java.lang.String) this.VB.opt(next), jSONObject2));
                } catch (java.lang.Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.VB);
            } catch (java.lang.Throwable unused2) {
            }
        }
    }

    public org.json.JSONObject eqN() {
        return this.VB;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    private boolean bg(int i, java.lang.String str, java.lang.String str2) {
        if (i == 1) {
            if (!com.bytedance.sdk.component.utils.Lq.bg(str)) {
                return false;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (!com.bytedance.sdk.component.utils.Lq.bg(str)) {
                    return false;
                }
            }
        } else if ((android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) || !com.bytedance.sdk.component.utils.Lq.bg(str2)) {
            return false;
        }
        return true;
    }

    private void bg(org.json.JSONObject jSONObject, android.view.View view) {
        if (bg(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            com.bytedance.sdk.openadsdk.core.tuV.bg(bg(view), this.iR instanceof android.app.Activity, jSONObject, this.Kg, this.WR, com.bytedance.sdk.openadsdk.utils.ayS.bg(this.WR), null, this.eo);
        }
    }

    private android.content.Context bg(android.view.View view) {
        android.app.Activity activityBg = view != null ? com.bytedance.sdk.component.utils.IL.bg(view) : null;
        return activityBg == null ? this.iR : activityBg;
    }
}

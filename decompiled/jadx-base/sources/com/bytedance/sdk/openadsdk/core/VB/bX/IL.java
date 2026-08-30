package com.bytedance.sdk.openadsdk.core.VB.bX;

/* JADX INFO: loaded from: classes4.dex */
public class IL implements com.bytedance.adsdk.ugeno.core.Ta, com.bytedance.sdk.openadsdk.core.VB.bX.bg.InterfaceC0145bg {
    protected static int bg = 8;
    private boolean Fy = true;
    private com.bytedance.sdk.openadsdk.core.VB.bX.bg IL;
    private java.lang.String Kg;
    private float Lq;
    private java.lang.String PX;
    private android.view.View Ta;
    private com.bytedance.sdk.openadsdk.core.VB.zx.bg VB;
    private long VzQ;
    private org.json.JSONObject WR;
    private final android.app.Activity bX;
    private final com.bytedance.sdk.openadsdk.core.VB.zx.IL eo;
    private final com.bytedance.sdk.openadsdk.core.model.tuV eqN;
    private java.lang.String iR;
    private java.lang.String ldr;
    private long tuV;
    private float vb;
    private float xxp;
    private float yDt;
    private final com.bytedance.sdk.openadsdk.core.VB.ldr.bg zx;

    public IL(android.app.Activity activity, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVar, java.lang.String str, com.bytedance.sdk.openadsdk.core.VB.zx.IL il) {
        this.bX = activity;
        this.PX = str;
        this.eqN = tuv;
        this.eo = il;
        this.zx = bgVar;
    }

    public void bg() {
        if (this.eqN == null) {
            this.eo.bg(1, "material is null", "net");
            return;
        }
        if (this.zx == null) {
            this.eo.bg(1, "material ugen template is null", "net");
            return;
        }
        this.IL = new com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.bX);
        this.Kg = this.zx.bX();
        this.ldr = this.zx.bg();
        this.iR = this.zx.IL();
        this.WR = this.eqN.ZTq();
        this.eo.bg("endcard");
        com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg("endcard", this.Kg, this.ldr, this.iR, "", new com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.VB.bX.IL.1
            @Override // com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg
            public void bg(org.json.JSONObject jSONObject, java.lang.String str) {
                com.bytedance.sdk.openadsdk.core.VB.bX.IL il = com.bytedance.sdk.openadsdk.core.VB.bX.IL.this;
                il.bg(jSONObject, il.WR);
                com.bytedance.sdk.openadsdk.core.VB.bX.IL.this.eo.IL(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg
            public void bg(int i, java.lang.String str, java.lang.String str2) {
                com.bytedance.sdk.openadsdk.core.VB.bX.IL.this.eo.bg(i, str, str2);
            }
        });
    }

    public void bg(android.view.View view) {
        this.Ta = view;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.VB.zx.bg bgVar) {
        this.VB = bgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        this.IL.bg((com.bytedance.sdk.openadsdk.core.VB.bX.bg.InterfaceC0145bg) this);
        this.IL.bg((com.bytedance.adsdk.ugeno.core.Ta) this);
        this.eo.bg();
        this.IL.bg(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.VB.zx.eqN() { // from class: com.bytedance.sdk.openadsdk.core.VB.bX.IL.2
            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.eqN
            public void bg(int i, java.lang.String str) {
                if (com.bytedance.sdk.openadsdk.core.VB.bX.IL.this.eo != null) {
                    com.bytedance.sdk.openadsdk.core.VB.bX.IL.this.eo.bg(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.VB.zx.eqN
            public void bg(com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar) {
                if (com.bytedance.sdk.openadsdk.core.VB.bX.IL.this.eo != null) {
                    com.bytedance.sdk.openadsdk.core.VB.bX.IL.this.eo.bg(bXVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.VB.bX.bg.InterfaceC0145bg
    public void bg(com.bytedance.adsdk.ugeno.core.eo eoVar) {
        java.lang.String strOptString = eoVar.bX().optString("type");
        strOptString.hashCode();
        switch (strOptString) {
            case "privacy":
                if (this.bX != null && !android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.VzQ.eqN().ayS())) {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(this.bX, this.eqN, this.PX);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.VB.zx.bg bgVar = this.VB;
                if (bgVar != null) {
                    bgVar.IL();
                    break;
                }
                break;
            case "creative":
                if (this.bX != null && this.eqN != null) {
                    IL();
                    android.content.ComponentCallbacks2 componentCallbacks2 = this.bX;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.IL) {
                        ((com.bytedance.sdk.openadsdk.core.Ta.eqN.IL) componentCallbacks2).eqN();
                    }
                    bg(eoVar, this.eqN);
                    break;
                }
                break;
        }
    }

    private void IL() {
        int iJz = this.eqN.jz();
        if (iJz != 2 && iJz != 3) {
            if (iJz == 4) {
                com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.bX, this.eqN, this.PX).eqN();
                return;
            } else {
                if (iJz != 5) {
                    return;
                }
                com.bytedance.sdk.openadsdk.utils.ayS.bX(this.bX, this.eqN.gXn());
                return;
            }
        }
        if (iJz == 3) {
            java.lang.String strGvG = this.eqN.GvG();
            if (!android.text.TextUtils.isEmpty(strGvG) && strGvG.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN.bg(this.bX, strGvG, strGvG.substring(strGvG.indexOf("?id=") + 4), this.PX, this.eqN)) {
                    return;
                }
            }
        }
        android.app.Activity activity = this.bX;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.eqN;
        int iBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(this.PX);
        java.lang.String str = this.PX;
        com.bytedance.sdk.openadsdk.core.VJ.bg((android.content.Context) activity, tuv, iBg, (com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd) null, (com.bytedance.sdk.openadsdk.api.PangleAd) null, str, com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.bX, this.eqN, str), true, 0);
    }

    private void bg(com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("down_x", this.yDt);
            jSONObject.put("down_y", this.Lq);
            jSONObject.put("down_time", this.VzQ);
            jSONObject.put("up_x", this.vb);
            jSONObject.put("up_y", this.xxp);
            jSONObject.put("up_time", this.tuV);
            android.view.View viewWR = eoVar.bg().WR();
            int i = 1;
            if (viewWR != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                int[] iArr = new int[2];
                float width = viewWR.getWidth();
                float height = viewWR.getHeight();
                viewWR.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, f);
                jSONObject2.put("top", f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            android.view.View view = this.Ta;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.Ta.getWidth());
                jSONObject.put("button_height", this.Ta.getHeight());
            }
            android.view.View viewFindViewById = this.bX.findViewById(android.R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", eoVar.bg().VW());
            jSONObject.put("brick_id", eoVar.bg().aGH());
            jSONObject.put("endcard_id", this.ldr);
            jSONObject.put("click_scence", 2);
            if (!this.Fy) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            com.bytedance.sdk.openadsdk.core.VB.zx.bg bgVar = this.VB;
            if (bgVar != null) {
                jSONObject.put("endcard_type", bgVar.bg());
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, this.PX, com.json.z8.CLICK, jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.Ta
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.VzQ = java.lang.System.currentTimeMillis();
            this.yDt = motionEvent.getRawX();
            this.Lq = motionEvent.getRawY();
            this.Fy = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (java.lang.Math.abs(motionEvent.getRawX() - this.yDt) >= bg || java.lang.Math.abs(motionEvent.getRawY() - this.Lq) >= bg) {
                this.Fy = false;
                return;
            }
            return;
        }
        this.vb = motionEvent.getRawX();
        this.xxp = motionEvent.getRawY();
        if (java.lang.Math.abs(this.vb - this.yDt) >= bg || java.lang.Math.abs(this.xxp - this.Lq) >= bg) {
            this.Fy = false;
        }
        this.tuV = java.lang.System.currentTimeMillis();
    }
}

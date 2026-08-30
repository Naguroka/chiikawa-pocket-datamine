package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public class WR {
    private org.json.JSONObject IL;
    private com.bytedance.adsdk.ugeno.core.zx Kg;
    private boolean PX = true;
    private boolean Ta = false;
    private org.json.JSONObject VB;
    private java.lang.String WR;
    private com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bX;
    private android.content.Context bg;
    private com.bytedance.adsdk.ugeno.core.Kg eo;
    private com.bytedance.adsdk.ugeno.core.ldr eqN;
    private com.bytedance.adsdk.ugeno.core.Ta iR;
    private com.bytedance.adsdk.ugeno.core.Lq ldr;
    private com.bytedance.adsdk.ugeno.eqN.bg.bg yDt;
    private com.bytedance.adsdk.ugeno.core.PX zx;

    public WR(android.content.Context context) {
        this.bg = context;
    }

    public void bg(java.lang.String str, com.bytedance.adsdk.ugeno.core.Kg kg) {
        this.eo = kg;
        this.WR = str;
        if (kg != null) {
            this.IL = kg.bg();
        }
    }

    public com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        this.IL = jSONObject2;
        com.bytedance.adsdk.ugeno.core.Lq lq = this.ldr;
        if (lq != null) {
            lq.bg();
        }
        this.Kg = new com.bytedance.adsdk.ugeno.core.zx(jSONObject, jSONObject2, jSONObject3);
        this.yDt = new com.bytedance.adsdk.ugeno.eqN.bg.bg();
        com.bytedance.adsdk.ugeno.core.PX px = this.zx;
        if (px instanceof com.bytedance.adsdk.ugeno.core.bg.bg) {
            ((com.bytedance.adsdk.ugeno.core.bg.bg) px).bg(this.Kg.IL());
        }
        this.bX = bg(this.Kg.bg(), (com.bytedance.adsdk.ugeno.IL.bX<android.view.View>) null);
        com.bytedance.adsdk.ugeno.core.Lq lq2 = this.ldr;
        if (lq2 != null) {
            lq2.IL();
            this.bX.bg(this.ldr);
        }
        bg(this.bX);
        return this.bX;
    }

    public com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bg(com.bytedance.adsdk.ugeno.core.zx.bg bgVar, com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar) {
        java.util.List<com.bytedance.adsdk.ugeno.core.zx.bg> listBX;
        com.bytedance.adsdk.ugeno.IL.bg.C0081bg c0081bgBX = null;
        if (!com.bytedance.adsdk.ugeno.core.zx.bg(bgVar)) {
            return null;
        }
        java.lang.String strBX = bgVar.bX();
        com.bytedance.adsdk.ugeno.core.IL ilBg = com.bytedance.adsdk.ugeno.core.eqN.bg(strBX);
        if (ilBg == null) {
            android.util.Log.d("UGTemplateEngine", "not found component ".concat(java.lang.String.valueOf(strBX)));
            return null;
        }
        com.bytedance.adsdk.ugeno.IL.bX bXVarBg = ilBg.bg(this.bg);
        if (bXVarBg == null) {
            return null;
        }
        org.json.JSONObject jSONObjectEqN = bgVar.eqN();
        bXVarBg.zx(com.bytedance.adsdk.ugeno.bX.IL.bg(bgVar.bg(), this.IL));
        bXVarBg.ldr(strBX);
        bXVarBg.IL(jSONObjectEqN);
        bXVarBg.bg(bgVar);
        bXVarBg.bg(this.Kg.eqN());
        bXVarBg.bg(this.eo);
        bXVarBg.bg(this.yDt);
        java.util.Iterator<java.lang.String> itKeys = jSONObjectEqN.keys();
        if (bXVar instanceof com.bytedance.adsdk.ugeno.IL.bg) {
            com.bytedance.adsdk.ugeno.IL.bg bgVar2 = (com.bytedance.adsdk.ugeno.IL.bg) bXVar;
            c0081bgBX = bgVar2.bX();
            bXVarBg.bg(bgVar2);
        }
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.String strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObjectEqN.optString(next), this.IL);
            bXVarBg.bg(next, strBg);
            if (c0081bgBX != null) {
                c0081bgBX.bg(this.bg, next, strBg);
            }
        }
        if (c0081bgBX != null) {
            bXVarBg.bg(c0081bgBX.bg());
        }
        if (bXVarBg instanceof com.bytedance.adsdk.ugeno.IL.bg) {
            java.util.List<com.bytedance.adsdk.ugeno.core.zx.bg> listZx = bgVar.zx();
            if (listZx == null || listZx.size() <= 0) {
                if (android.text.TextUtils.equals(bXVarBg.VW(), "RecyclerLayout") && (listBX = this.Kg.bX()) != null && listBX.size() > 0) {
                    java.util.Iterator<com.bytedance.adsdk.ugeno.core.zx.bg> it = listBX.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVarBg2 = bg(it.next(), (com.bytedance.adsdk.ugeno.IL.bX<android.view.View>) bXVarBg);
                        if (bXVarBg2 != null && bXVarBg2.ayS()) {
                            ((com.bytedance.adsdk.ugeno.IL.bg) bXVarBg).bg(bXVarBg2);
                        }
                    }
                }
                return bXVarBg;
            }
            if (android.text.TextUtils.equals(bXVarBg.VW(), "Swiper") && listZx.size() != 1) {
                android.util.Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            java.util.Iterator<com.bytedance.adsdk.ugeno.core.zx.bg> it2 = listZx.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVarBg3 = bg(it2.next(), (com.bytedance.adsdk.ugeno.IL.bX<android.view.View>) bXVarBg);
                if (bXVarBg3 != null && bXVarBg3.ayS()) {
                    ((com.bytedance.adsdk.ugeno.IL.bg) bXVarBg).bg(bXVarBg3, bXVarBg3.JAA());
                }
            }
        }
        this.bX = bXVarBg;
        return bXVarBg;
    }

    public com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bg(org.json.JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.core.Lq lq = this.ldr;
        if (lq != null) {
            lq.bg();
        }
        com.bytedance.adsdk.ugeno.core.zx zxVar = new com.bytedance.adsdk.ugeno.core.zx(jSONObject, this.IL);
        this.Kg = zxVar;
        com.bytedance.adsdk.ugeno.core.PX px = this.zx;
        if (px instanceof com.bytedance.adsdk.ugeno.core.bg.bg) {
            ((com.bytedance.adsdk.ugeno.core.bg.bg) px).bg(zxVar.IL());
        }
        this.bX = IL(this.Kg.bg(), null);
        com.bytedance.adsdk.ugeno.core.Lq lq2 = this.ldr;
        if (lq2 != null) {
            lq2.IL();
            this.bX.bg(this.ldr);
        }
        return this.bX;
    }

    public com.bytedance.adsdk.ugeno.IL.bX<android.view.View> IL(com.bytedance.adsdk.ugeno.core.zx.bg bgVar, com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar) {
        java.util.List<com.bytedance.adsdk.ugeno.core.zx.bg> listBX;
        com.bytedance.adsdk.ugeno.IL.bg.C0081bg c0081bgBX = null;
        if (!com.bytedance.adsdk.ugeno.core.zx.bg(bgVar)) {
            return null;
        }
        java.lang.String strBX = bgVar.bX();
        com.bytedance.adsdk.ugeno.core.IL ilBg = com.bytedance.adsdk.ugeno.core.eqN.bg(strBX);
        if (ilBg == null) {
            android.util.Log.d("UGTemplateEngine", "not found component ".concat(java.lang.String.valueOf(strBX)));
            return null;
        }
        com.bytedance.adsdk.ugeno.IL.bX bXVarBg = ilBg.bg(this.bg);
        if (bXVarBg == null) {
            return null;
        }
        bXVarBg.zx(com.bytedance.adsdk.ugeno.bX.IL.bg(bgVar.bg(), this.IL));
        bXVarBg.ldr(strBX);
        bXVarBg.IL(bgVar.eqN());
        bXVarBg.bg(bgVar);
        bXVarBg.bg(this.eo);
        if (bXVar instanceof com.bytedance.adsdk.ugeno.IL.bg) {
            com.bytedance.adsdk.ugeno.IL.bg bgVar2 = (com.bytedance.adsdk.ugeno.IL.bg) bXVar;
            bXVarBg.bg(bgVar2);
            c0081bgBX = bgVar2.bX();
        }
        java.util.Iterator<java.lang.String> itKeys = bgVar.eqN().keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.String strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(bgVar.eqN().optString(next), this.IL);
            bXVarBg.bg(next, strBg);
            if (c0081bgBX != null) {
                c0081bgBX.bg(this.bg, next, strBg);
            }
        }
        if (bXVarBg instanceof com.bytedance.adsdk.ugeno.IL.bg) {
            java.util.List<com.bytedance.adsdk.ugeno.core.zx.bg> listZx = bgVar.zx();
            if (listZx == null || listZx.size() <= 0) {
                if (android.text.TextUtils.equals(bXVarBg.VW(), "RecyclerLayout") && (listBX = this.Kg.bX()) != null && listBX.size() > 0) {
                    java.util.Iterator<com.bytedance.adsdk.ugeno.core.zx.bg> it = listBX.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVarIL = IL(it.next(), bXVarBg);
                        if (bXVarIL != null && bXVarIL.ayS()) {
                            ((com.bytedance.adsdk.ugeno.IL.bg) bXVarBg).bg(bXVarIL);
                        }
                    }
                }
                return bXVarBg;
            }
            if (android.text.TextUtils.equals(bXVarBg.VW(), "Swiper") && listZx.size() != 1) {
                android.util.Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            java.util.Iterator<com.bytedance.adsdk.ugeno.core.zx.bg> it2 = listZx.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVarIL2 = IL(it2.next(), bXVarBg);
                if (bXVarIL2 != null && bXVarIL2.ayS()) {
                    ((com.bytedance.adsdk.ugeno.IL.bg) bXVarBg).bg(bXVarIL2);
                }
            }
        }
        if (c0081bgBX != null) {
            bXVarBg.bg(c0081bgBX.bg());
        }
        this.bX = bXVarBg;
        return bXVarBg;
    }

    public void IL(org.json.JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.core.Lq lq = this.ldr;
        if (lq != null) {
            lq.bX();
        }
        this.IL = jSONObject;
        bg(this.bX, jSONObject);
        bg(this.bX);
        if (this.ldr != null) {
            com.bytedance.adsdk.ugeno.core.yDt ydt = new com.bytedance.adsdk.ugeno.core.yDt();
            ydt.bg(0);
            ydt.bg(this.bX);
            this.ldr.bg(ydt);
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject) {
        if (bXVar == null) {
            return;
        }
        if (bXVar instanceof com.bytedance.adsdk.ugeno.IL.bg) {
            bXVar.bg(jSONObject);
            java.util.List<com.bytedance.adsdk.ugeno.IL.bX<android.view.View>> listBg = ((com.bytedance.adsdk.ugeno.IL.bg) bXVar).bg();
            if (listBg == null || listBg.size() <= 0) {
                return;
            }
            java.util.Iterator<com.bytedance.adsdk.ugeno.IL.bX<android.view.View>> it = listBg.iterator();
            while (it.hasNext()) {
                bg(it.next(), jSONObject);
            }
            return;
        }
        bXVar.bg(jSONObject);
    }

    private void bg(com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar) {
        java.util.List<com.bytedance.adsdk.ugeno.IL.bX<android.view.View>> listBg;
        if (bXVar == null) {
            return;
        }
        org.json.JSONObject jSONObjectTC = bXVar.tC();
        java.util.Iterator<java.lang.String> itKeys = jSONObjectTC.keys();
        com.bytedance.adsdk.ugeno.IL.bg bgVarUq = bXVar.Uq();
        com.bytedance.adsdk.ugeno.IL.bg.C0081bg c0081bgBX = bgVarUq != null ? bgVarUq.bX() : null;
        IL(bXVar);
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.String strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObjectTC.optString(next), this.IL);
            bXVar.bg(next, strBg);
            if (c0081bgBX != null) {
                c0081bgBX.bg(this.bg, next, strBg);
            }
        }
        bXVar.bg(this.eqN);
        bXVar.bg(this.zx);
        bXVar.bg(this.iR);
        if ((bXVar instanceof com.bytedance.adsdk.ugeno.IL.bg) && (listBg = ((com.bytedance.adsdk.ugeno.IL.bg) bXVar).bg()) != null && listBg.size() > 0) {
            java.util.Iterator<com.bytedance.adsdk.ugeno.IL.bX<android.view.View>> it = listBg.iterator();
            while (it.hasNext()) {
                bg(it.next());
            }
        }
        if (c0081bgBX != null) {
            bXVar.bg(c0081bgBX.bg());
        }
        bXVar.IL();
    }

    private void IL(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        try {
            if (!bXVar.DDQ() || bXVar.Uw() == null || bXVar.Uw().ldr() == null) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("i18n", bXVar.Uw().ldr());
            this.IL.put("xNode", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.core.PX px) {
        com.bytedance.adsdk.ugeno.core.bg.bg bgVar = new com.bytedance.adsdk.ugeno.core.bg.bg(px);
        bgVar.bg(this.VB);
        bgVar.bg(this.PX);
        bgVar.IL(this.Ta);
        com.bytedance.adsdk.ugeno.core.zx zxVar = this.Kg;
        if (zxVar != null) {
            bgVar.bg(zxVar.IL());
        }
        this.zx = bgVar;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.Ta ta) {
        this.iR = ta;
    }
}

package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class VB {
    private final com.bytedance.sdk.openadsdk.core.IL.IL IL;
    private final com.bytedance.sdk.openadsdk.core.IL.zx bX;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;

    @com.pgl.ssdk.ces.out.DungeonFlag
    public VB(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bg = bgVar;
        this.bX = bg(bgVar, bgVar.IL);
        this.IL = new com.bytedance.sdk.openadsdk.core.IL.IL(bgVar.uu, bgVar.IL, bgVar.zx, bgVar.eqN ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.VB.1
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
            public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                try {
                    com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg(view, f, f2, f3, f4, sparseArray, this.Uq, this.Uw, this.DDQ);
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.IL, 9);
                com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.rri.VJ();
            }
        };
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public void bg() {
        if (this.bg.Ta.get()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg.IL;
        bg(jSONObject);
        if (this.bg.Ta.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, this.bg.zx, jSONObject);
            this.bg.qC.ldr();
            com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar = new com.bytedance.sdk.openadsdk.rri.bg.zx.bg(-1);
            if (this.bg.Ny && this.bg.kU != null) {
                bgVar.IL = this.bg.kU.WR;
            }
            com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.bg.uu.findViewById(android.R.id.content), tuv, bgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg.IL;
        if ((tuv instanceof com.bytedance.sdk.openadsdk.core.model.Fy) && ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).oT()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.RFReportManager", "reportShow json error", e);
            }
        }
        if (!this.bg.Ny || this.bg.kU == null) {
            return;
        }
        try {
            jSONObject.put("ad_show_order", this.bg.kU.WR + 1);
        } catch (org.json.JSONException unused) {
        }
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public void IL() {
        boolean z;
        if (this.bg.Ta.get()) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!this.bg.IL.bg() || this.bg.Ja == null) {
                z = false;
            } else {
                jSONObject.put("dynamic_show_type", this.bg.Ja.WR());
                this.bg.Ja.bg(jSONObject);
                z = true;
            }
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg.IL;
            bg(jSONObject);
            android.view.View viewFindViewById = this.bg.uu.findViewById(android.R.id.content);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
            } catch (java.lang.Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.bg.Ta.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, this.bg.zx, jSONObject);
                this.bg.qC.ldr();
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar = new com.bytedance.sdk.openadsdk.rri.bg.zx.bg(z ? this.bg.Ja.WR() : -1);
                if (this.bg.Ny && this.bg.kU != null) {
                    bgVar.IL = this.bg.kU.WR;
                }
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.bg.uu.findViewById(android.R.id.content), tuv, bgVar);
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e);
        }
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public void bg(final java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.bg.Ta.get()) {
            return;
        }
        this.bg.Ta.set(true);
        final android.view.View viewFindViewById = this.bg.uu.findViewById(android.R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = this.bg.uu.getWindow().getDecorView();
        }
        viewFindViewById.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.VB.2
            @Override // java.lang.Runnable
            public void run() {
                java.util.Map map2;
                org.json.JSONObject jSONObject;
                boolean z = false;
                if (com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.yDt.compareAndSet(false, true)) {
                    com.bytedance.sdk.openadsdk.core.model.tuV tuv = com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.IL;
                    org.json.JSONObject jSONObject2 = null;
                    try {
                        if (map != null) {
                            jSONObject = new org.json.JSONObject(map);
                        } else {
                            jSONObject = new org.json.JSONObject();
                        }
                        jSONObject2 = jSONObject;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("width", viewFindViewById.getWidth());
                        jSONObject3.put("height", viewFindViewById.getHeight());
                        jSONObject3.put("alpha", viewFindViewById.getAlpha());
                        jSONObject2.put("root_view", jSONObject3.toString());
                        com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg(jSONObject2);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.RFReportManager", "run: ", th);
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.zx, jSONObject2);
                    com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.qC.ldr();
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.Ja != null && (map2 = map) != null && map2.containsKey("dynamic_show_type")) {
                        z = true;
                    }
                    com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar = new com.bytedance.sdk.openadsdk.rri.bg.zx.bg(z ? com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.Ja.WR() : -1);
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.Ny && com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.kU != null) {
                        bgVar.IL = com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.kU.WR;
                    }
                    com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.uu.findViewById(android.R.id.content), tuv, bgVar);
                }
            }
        });
    }

    public void bg(boolean z) {
        if (this.bg.IL == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yDt.bg.eqN eqnZx = com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(z ? 7 : 8).bX(java.lang.String.valueOf(this.bg.IL.IGR())).zx(this.bg.IL.waE());
        eqnZx.IL(this.bg.VJ.rri()).ldr(this.bg.VJ.kMt());
        eqnZx.iR(this.bg.IL.Ny()).eqN(this.bg.IL.Ys());
        com.bytedance.sdk.openadsdk.yDt.bX.bg().IL(eqnZx);
    }

    public com.bytedance.sdk.openadsdk.core.IL.zx bX() {
        this.bX.bg(this.bg.uu.findViewById(android.R.id.content));
        this.bX.IL(this.bg.CQc.findViewById(520093713));
        if (this.bg.kMt.bX() != null) {
            this.bX.bg(this.bg.kMt.bX());
        }
        this.bg.JAA.bg(this.bX);
        this.bX.bg(new com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.VB.3
            @Override // com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg
            public long getVideoProgress() {
                return com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg.rri.iR();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.eo eoVar = this.bg.LKE;
        com.bytedance.sdk.openadsdk.core.IL.zx zxVar = this.bX;
        eoVar.bg(zxVar, zxVar, this.IL);
        this.bg.ZQc.bg(this.bX);
        return this.bX;
    }

    public com.bytedance.sdk.openadsdk.core.IL.IL eqN() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.core.IL.zx zx() {
        return this.bX;
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public void IL(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bg;
        if (bgVar == null) {
            return;
        }
        if (!z && bgVar.Ta.get() && this.bg.cZH > 0) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime() - this.bg.cZH), this.bg.IL, this.bg.zx, this.bg.rri.bg());
            this.bg.cZH = 0L;
        } else {
            this.bg.cZH = android.os.SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.bg.IL, z ? 4 : 8);
    }

    public void ldr() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.bg.IL)) {
            this.bg.JAA.bg(jSONObject);
        }
        int i = 1;
        try {
            if (this.bg.eo.get()) {
                if (!this.bg.VJ.bX()) {
                    if (this.bg.daV.eqN()) {
                        i = 3;
                    } else {
                        i = this.bg.VJ.eqN() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (org.json.JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.bg.IL, this.bg.zx, "click_close", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.pgl.ssdk.ces.out.DungeonFlag
    public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.zx) {
            bg("click_play_star_level", (org.json.JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.eqN || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.iR) {
            bg("click_play_star_nums", (org.json.JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.bX) {
            bg("click_play_source", (org.json.JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.IL) {
            bg("click_play_logo", (org.json.JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.PX || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.huT || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.xxp) {
            bg("click_start_play_bar", WR());
        } else if (view.getId() == 520093705) {
            bg("click_start_play", WR());
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.VB) {
            bg("click_video", WR());
        } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.Kg) {
            bg("fallback_endcard_click", WR());
        }
        IL(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    private void IL(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, int i, int i2, int i3) {
        if (!Kg() || this.bg.IL == null || view == null) {
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.Ta.zx || id == com.bytedance.sdk.openadsdk.utils.Ta.eqN || id == com.bytedance.sdk.openadsdk.utils.Ta.bX || id == com.bytedance.sdk.openadsdk.utils.Ta.IL || id == com.bytedance.sdk.openadsdk.utils.Ta.PX || id == com.bytedance.sdk.openadsdk.utils.Ta.huT || id == com.bytedance.sdk.openadsdk.utils.Ta.xxp || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.Ta.VB || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.Ta.iR) {
            int iIR = com.bytedance.sdk.openadsdk.utils.ZQc.iR(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            com.bytedance.sdk.openadsdk.core.model.eo eoVarBg = new com.bytedance.sdk.openadsdk.core.model.eo.bg().ldr(f).zx(f2).eqN(f3).bX(f4).IL(java.lang.System.currentTimeMillis()).bg(0L).IL(com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.bg.LKE.VB())).bg(com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) null)).bX(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg.LKE.VB())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX((android.view.View) null)).eqN(i2).zx(i3).ldr(i).bg(sparseArray).IL(com.bytedance.sdk.openadsdk.core.WR.IL().bg() ? 1 : 2).bX(iIR).bg(com.bytedance.sdk.openadsdk.utils.ZQc.zx(com.bytedance.sdk.openadsdk.core.VzQ.bg())).IL(com.bytedance.sdk.openadsdk.utils.ZQc.ldr(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bg();
            java.util.HashMap map = new java.util.HashMap();
            map.put("duration", java.lang.Long.valueOf(this.bg.rri.iR()));
            com.bytedance.sdk.openadsdk.eqN.bX.bg("click_other", this.bg.IL, eoVarBg, this.bg.zx, true, (java.util.Map<java.lang.String, java.lang.Object>) map, -1);
        }
    }

    private boolean Kg() {
        return this.bg.IL != null && this.bg.IL.qC() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str, org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg.IL;
        java.lang.String str2 = this.bg.zx;
        if (!this.bg.eqN) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str2, str, jSONObject);
    }

    private org.json.JSONObject WR() {
        try {
            long jVb = this.bg.rri.vb();
            int iXxp = this.bg.rri.xxp();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("duration", jVb);
                jSONObject.put("percent", iXxp);
                return jSONObject;
            } catch (java.lang.Throwable unused) {
                return jSONObject;
            }
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public void bX(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bg;
        if (bgVar != null && z && bgVar.IL.vTg() && !this.bg.IL.NU()) {
            this.bg.IL.iR(true);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bg.IL, this.bg.zx, this.bg.IL.dRo());
        }
    }

    public void iR() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        bg(jSONObject);
        com.bytedance.sdk.openadsdk.eqN.bX.zx(this.bg.IL, this.bg.zx, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.IL.zx bg(final com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar, final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return new com.bytedance.sdk.openadsdk.core.IL.zx(bgVar.uu, tuv, bgVar.zx, bgVar.eqN ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.VB.4
            @Override // com.bytedance.sdk.openadsdk.core.IL.zx
            public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, int i, int i2, int i3, boolean z) {
                if (tuv.HXG() && view != null) {
                    java.lang.Object tag = view.getTag(570425345);
                    if (tag instanceof java.lang.String) {
                        bg((java.lang.String) tag);
                    }
                }
                java.util.HashMap map = new java.util.HashMap();
                map.put("duration", java.lang.Long.valueOf(bgVar.rri.iR()));
                if (bgVar.eo.get()) {
                    map.put("click_scence", 2);
                } else if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(tuv)) {
                    map.put("click_scence", 3);
                } else {
                    map.put("click_scence", 1);
                }
                bg(map);
                bgVar.qC.c_();
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.Ta.PC && com.bytedance.sdk.openadsdk.core.model.rri.VzQ(tuv)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    if (tuv.Dxa() != null) {
                        try {
                            jSONObject.put("playable_url", tuv.Dxa().PX());
                        } catch (org.json.JSONException e) {
                            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFReportManager", "onRewardBarClick json error", e);
                        }
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, bgVar.zx, "click_playable_download_button_loading", jSONObject);
                }
                bgVar.kMt.bg(view, f, f2, f3, f4, sparseArray, i, i2, i3, new com.bytedance.sdk.openadsdk.component.reward.bg.eqN.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.VB.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eqN.bg
                    public void bg(java.lang.String str, org.json.JSONObject jSONObject2) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg(str, jSONObject2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.bg.eqN.bg
                    public void bg(android.view.View view2, float f5, float f6, float f7, float f8, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray2, int i4, int i5, int i6) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.VB.this.bg(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }
                });
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(tuv, 9);
                bgVar.rri.VJ();
            }
        };
    }
}

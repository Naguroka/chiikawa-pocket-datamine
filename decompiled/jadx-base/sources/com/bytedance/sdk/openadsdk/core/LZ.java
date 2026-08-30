package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class LZ implements com.bytedance.sdk.openadsdk.core.Fy<com.bytedance.sdk.openadsdk.eqN.bg> {
    private final android.content.Context bg;

    LZ(android.content.Context context) {
        this.bg = context;
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    private org.json.JSONObject bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.LZ lz, int i) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.String strEqN = (lz == null || android.text.TextUtils.isEmpty(lz.bg)) ? com.bytedance.sdk.openadsdk.utils.ayS.eqN() : lz.bg;
            if (i == 7) {
                if (lz != null && lz.IL > 0) {
                    jSONObject2.put("req_type", lz.IL);
                }
            } else if (i == 8) {
                if (lz != null && lz.bX > 0) {
                    jSONObject2.put("req_type", lz.bX);
                }
            } else if (i == 3 && lz != null && lz.eqN > 0) {
                jSONObject2.put("req_type", lz.eqN);
            }
            try {
                java.lang.String strEo = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo();
                java.lang.String strFy = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Fy();
                if (strEo != null && strFy != null) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("version", strEo);
                    jSONObject3.put("param", strFy);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (java.lang.Throwable unused) {
            }
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                jSONObject2.put("bidding_param", adSlot.getBiddingTokens());
                com.bytedance.sdk.openadsdk.core.settings.IL ilUw = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().Uw(adSlot.getCodeId());
                jSONObject2.put("waterfall_id", ilUw.qC);
                jSONObject2.put("waterfall_version", ilUw.Dxa);
                jSONObject2.put("link_id", adSlot.getLinkId());
            }
            jSONObject2.put("request_id", strEqN);
            com.bytedance.sdk.openadsdk.utils.ayS.bg(jSONObject2);
            jSONObject2.put("ad_sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            jSONObject2.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IEI() ? 1 : 0);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.Kg.PX.IL());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.Kg.PX.bX());
            jSONObject2.put("source_type", "app");
            jSONObject2.put("app", bX());
            java.lang.Object[] objArr = new java.lang.Object[2];
            jSONObject2.put(com.ironsource.y8.h.G, com.bytedance.sdk.openadsdk.utils.DeviceUtils.bg(this.bg, true));
            jSONObject2.put("user", bg(adSlot));
            jSONObject2.put(com.json.ce.U, com.bytedance.sdk.openadsdk.utils.ayS.bX());
            jSONObject2.put("channel", com.ironsource.y8.h.Z);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(bg(adSlot, i, lz));
            jSONObject2.put("adslots", jSONArray);
            bg(jSONObject2, lz);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            java.lang.String strConcat = "";
            if (adSlot.getCodeId() != null && strEqN != null) {
                strConcat = java.lang.String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strEqN);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.zx.bg(strConcat));
            if (com.bytedance.sdk.openadsdk.core.WR.bX.zx() != 0) {
                jSONObject2.put("pglx", java.lang.String.valueOf(com.bytedance.sdk.openadsdk.core.WR.bX.zx()));
            }
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg(jSONObject2);
            jSONObject = bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.utils.LZ.IL("body data exception", th);
        }
        return jSONObject;
    }

    private void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.LZ lz) {
        if (lz == null || lz.zx == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", lz.zx);
        } catch (java.lang.Exception unused) {
        }
    }

    private boolean eqN(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.core.iR.IL.bg()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.iR.IL.bg(str)) {
            return false;
        }
        java.lang.String strIL = com.bytedance.sdk.openadsdk.core.iR.IL.IL();
        if (!android.text.TextUtils.isEmpty(strIL)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(strIL, java.lang.System.currentTimeMillis());
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public void bg(final com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.LZ lz, final int i, com.bytedance.sdk.openadsdk.core.Fy.bg bgVar) {
        final com.bytedance.sdk.openadsdk.core.bg.bg bgVar2 = new com.bytedance.sdk.openadsdk.core.bg.bg(bgVar, adSlot);
        if (lz != null && (lz.IL == 2 || lz.bX == 2 || lz.eqN == 2)) {
            adSlot.setPreload(true);
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().post(new com.bytedance.sdk.component.Kg.Kg("getAd") { // from class: com.bytedance.sdk.openadsdk.core.LZ.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.LZ.this.IL(adSlot, lz, i, bgVar2);
                }
            });
        } else {
            IL(adSlot, lz, i, bgVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(final com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.LZ lz, final int i, final com.bytedance.sdk.openadsdk.core.Fy.bg bgVar) {
        com.bytedance.sdk.openadsdk.core.yDt.ldr();
        final com.bytedance.sdk.openadsdk.core.model.IL il = new com.bytedance.sdk.openadsdk.core.model.IL();
        il.bg(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            if (bgVar != null) {
                bgVar.bg(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                il.bg(1000);
                com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                return;
            }
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().Dxa()) {
            if (bgVar != null) {
                bgVar.bg(-16, com.bytedance.sdk.openadsdk.core.Kg.bg(-16));
                il.bg(1001);
                com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                return;
            }
            return;
        }
        if (bgVar == null) {
            return;
        }
        if (eqN(adSlot.getCodeId())) {
            bgVar.bg(-8, com.bytedance.sdk.openadsdk.core.Kg.bg(-8));
            return;
        }
        if (!android.text.TextUtils.isEmpty(adSlot.getBidAdm()) && !lz.ldr) {
            il.IL(2);
            il.bg(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.PX.eqN()) {
                com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(adSlot.getBidAdm());
            }
            if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
                com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", adSlot.getBidAdm(), this.bg);
            }
            try {
                org.json.JSONObject jSONObjectBg = bg(new org.json.JSONObject(adSlot.getBidAdm()));
                if (jSONObjectBg == null) {
                    bg(bgVar, il);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.LZ.bg bgVarBg = com.bytedance.sdk.openadsdk.core.LZ.bg.bg(jSONObjectBg, adSlot, lz, il);
                il.bg(bgVarBg.eo);
                com.bytedance.sdk.openadsdk.core.PX.bg(this.bg, bgVarBg.WR);
                if (bgVarBg.eqN != 20000) {
                    bgVar.bg(bgVarBg.eqN, bgVarBg.zx);
                    il.bg(bgVarBg.eqN);
                    com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                    return;
                } else {
                    if (bgVarBg.Kg == null) {
                        bg(bgVar, il);
                        return;
                    }
                    if (bgVarBg.Kg.bX() != null && bgVarBg.Kg.bX().size() > 0) {
                        com.bytedance.sdk.openadsdk.yDt.bX.bg(bgVarBg.Kg.bX().get(0));
                    }
                    bgVarBg.Kg.bX(jSONObjectBg.toString());
                    bgVar.bg(bgVarBg.Kg, il);
                    java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.model.tuV> mapBg = com.bytedance.sdk.openadsdk.core.model.bg.bg(bgVarBg.Kg);
                    if (mapBg != null) {
                        com.bytedance.sdk.openadsdk.iR.IL.bg().bg(mapBg);
                    }
                    bg(bgVarBg.Kg);
                    com.bytedance.sdk.openadsdk.core.eqN.bg.bg().bg(bgVarBg.Kg);
                    return;
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "get ad error: ", th);
                bg(bgVar, il);
                return;
            }
        }
        org.json.JSONObject jSONObjectBg2 = bg(adSlot, lz, i);
        if (jSONObjectBg2 == null) {
            bgVar.bg(-9, com.bytedance.sdk.openadsdk.core.Kg.bg(-9));
            il.bg(-9);
            com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
            com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", jSONObjectBg2.toString(), this.bg);
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(adSlot.getBiddingTokens() != null ? "/api/ad/union/mediation/get_ads/" : "/api/ad/union/sdk/get_ads/", true);
        com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
        final com.bytedance.sdk.openadsdk.yDt.bg.zx zxVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx(2);
        try {
            java.lang.String strBg2 = com.bytedance.sdk.openadsdk.Kg.eqN.bg(eqnIL, strBg);
            eqnIL.IL(strBg2);
            zxVar.bg(strBg2);
        } catch (java.lang.Exception unused) {
        }
        eqnIL.bg(jSONObjectBg2.toString(), com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp());
        zxVar.bg(eqnIL.eqN()).bg();
        java.util.Map<java.lang.String, java.lang.String> mapBg2 = com.bytedance.sdk.openadsdk.core.WR.bX.bg(strBg, jSONObjectBg2.toString());
        if (mapBg2 != null && mapBg2.size() > 0) {
            for (java.lang.String str : mapBg2.keySet()) {
                try {
                    eqnIL.IL(str, mapBg2.get(str));
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e.getMessage());
                }
            }
        }
        try {
            eqnIL.IL(com.google.common.net.HttpHeaders.USER_AGENT, com.bytedance.sdk.openadsdk.utils.ayS.bX());
            bg(eqnIL, jSONObjectBg2);
        } catch (java.lang.Exception unused2) {
        }
        final com.bytedance.sdk.openadsdk.utils.daV davBg = com.bytedance.sdk.openadsdk.utils.daV.bg();
        final java.util.Map<java.lang.String, java.lang.Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z = com.bytedance.sdk.openadsdk.core.WR.IL().xxp() && requestExtraMap != null;
        if (z) {
            requestExtraMap.put("pgad_start", davBg);
        }
        if (adSlot.getBiddingTokens() != null) {
            bg(adSlot, lz, eqnIL, requestExtraMap, z, davBg, bgVar);
            return;
        }
        eqnIL.bg(10);
        eqnIL.bg("get_ad");
        com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.LZ.3
            @Override // com.bytedance.sdk.openadsdk.p002vb.zx
            public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                bgVar2.IL("get_ad");
                bgVar2.bX(adSlot.getCodeId());
                bgVar2.eqN(com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType()));
                return bgVar2;
            }
        });
        final boolean z2 = z;
        eqnIL.bg(new com.bytedance.sdk.component.iR.bg.IL() { // from class: com.bytedance.sdk.openadsdk.core.LZ.4
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il2) {
                java.lang.System.currentTimeMillis();
                zxVar.IL();
                if (z2) {
                    requestExtraMap.put("pgad_end", davBg);
                }
                if (il2 != null) {
                    if (il2.ldr()) {
                        com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.LZ.4.1
                            @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                            public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                bgVar2.IL("get_ad");
                                bgVar2.bX(adSlot.getCodeId());
                                bgVar2.eqN(com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType()));
                                bgVar2.bg(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                                return bgVar2;
                            }
                        });
                        com.bytedance.sdk.openadsdk.eqN.bg.ldr.IL.incrementAndGet();
                        com.bytedance.sdk.openadsdk.eqN.bg.ldr.bg.incrementAndGet();
                        try {
                            com.bytedance.sdk.openadsdk.utils.daV davBg2 = com.bytedance.sdk.openadsdk.utils.daV.bg();
                            java.lang.String strEqN = il2.eqN();
                            org.json.JSONObject jSONObject = new org.json.JSONObject(strEqN);
                            if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
                                com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", jSONObject.toString(), com.bytedance.sdk.openadsdk.core.LZ.this.bg);
                            }
                            il.bg(strEqN);
                            org.json.JSONObject jSONObjectBg3 = com.bytedance.sdk.openadsdk.core.LZ.this.bg(jSONObject);
                            if (jSONObjectBg3 == null) {
                                com.bytedance.sdk.openadsdk.core.LZ.this.bg(bgVar, il);
                                com.bytedance.sdk.openadsdk.eqN.bg.ldr.ldr.incrementAndGet();
                                com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX();
                                zxVar.bg(true).bg(il2.bg()).bX(strEqN).bX();
                                return;
                            }
                            com.bytedance.sdk.openadsdk.core.LZ.bg bgVarBg2 = com.bytedance.sdk.openadsdk.core.LZ.bg.bg(jSONObjectBg3, adSlot, lz, il);
                            il.bg(bgVarBg2.eo);
                            com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.LZ.this.bg, bgVarBg2.WR);
                            if (bgVarBg2.eqN != 20000) {
                                il.bg(bgVarBg2.eqN);
                                if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().aGH() && bgVarBg2.eqN == 40029) {
                                    bgVar.bg(-100, com.bytedance.sdk.openadsdk.core.Kg.bg(-100));
                                } else {
                                    bgVar.bg(bgVarBg2.eqN, bgVarBg2.zx);
                                }
                                com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                                com.bytedance.sdk.openadsdk.eqN.bg.ldr.ldr.incrementAndGet();
                                com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX();
                                zxVar.bg(true).bg(il2.bg()).bX(strEqN).bX();
                                return;
                            }
                            if (bgVarBg2.Kg == null) {
                                com.bytedance.sdk.openadsdk.core.LZ.this.bg(bgVar, il);
                                com.bytedance.sdk.openadsdk.eqN.bg.ldr.zx.incrementAndGet();
                                com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX();
                                zxVar.bg(true).bg(il2.bg()).bX(strEqN).bX();
                                return;
                            }
                            bgVarBg2.Kg.bX(jSONObjectBg3.toString());
                            bgVarBg2.Kg.eqN(strEqN);
                            com.bytedance.sdk.openadsdk.utils.daV davBg3 = com.bytedance.sdk.openadsdk.utils.daV.bg();
                            com.bytedance.sdk.openadsdk.core.model.LZ lz2 = lz;
                            if (lz2 != null && lz2.eo != null) {
                                lz.eo.bg(davBg, davBg2, bgVarBg2.bg, davBg3);
                            }
                            bgVar.bg(bgVarBg2.Kg, il);
                            com.bytedance.sdk.openadsdk.core.LZ.this.bg(bgVarBg2.Kg);
                            com.bytedance.sdk.openadsdk.core.eqN.bg.bg().bg(bgVarBg2.Kg);
                            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.model.tuV> mapBg3 = com.bytedance.sdk.openadsdk.core.model.bg.bg(bgVarBg2.Kg);
                            if (mapBg3 != null) {
                                com.bytedance.sdk.openadsdk.iR.IL.bg().bg(mapBg3);
                            }
                            if (bgVarBg2.Kg.bX() != null && !bgVarBg2.Kg.bX().isEmpty()) {
                                com.bytedance.sdk.openadsdk.core.LZ.this.bg(il2.iR(), lz, davBg, davBg2, bgVarBg2.bg, davBg3, bgVarBg2.Kg.bX().get(0), com.bytedance.sdk.openadsdk.utils.ayS.bX(i), bgVarBg2.Kg.iR());
                                com.bytedance.sdk.openadsdk.eqN.bg.ldr.eqN.incrementAndGet();
                            }
                            com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX();
                            zxVar.bg(true).bg(il2.bg()).bX(strEqN).bX();
                            return;
                        } catch (java.lang.Throwable th2) {
                            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "get ad error: ", th2);
                            com.bytedance.sdk.openadsdk.core.LZ.this.bg(bgVar, il);
                            com.bytedance.sdk.openadsdk.eqN.bg.ldr.zx.incrementAndGet();
                            com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX();
                            zxVar.bg(il2.ldr()).bg(il2.bg()).bX(il2.eqN()).eqN(th2.getMessage()).bX();
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.LZ.4.2
                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                            bgVar2.IL("get_ad");
                            bgVar2.bX(adSlot.getCodeId());
                            bgVar2.eqN(com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType()));
                            bgVar2.bg(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                            return bgVar2;
                        }
                    });
                    int iBg = il2.bg();
                    java.lang.String strIL = il2.IL();
                    bgVar.bg(iBg, strIL);
                    il.bg(iBg);
                    com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                    com.bytedance.sdk.openadsdk.eqN.bg.ldr.Kg.incrementAndGet();
                    com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX.incrementAndGet();
                    com.bytedance.sdk.openadsdk.eqN.bg.ldr.bg.incrementAndGet();
                    com.bytedance.sdk.openadsdk.eqN.bg.ldr.zx();
                    com.bytedance.sdk.openadsdk.eqN.bg.ldr.bg(iBg, strIL);
                    com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX();
                    zxVar.bg(false).bg(iBg).eqN(strIL).bX(il2.eqN()).bX();
                }
            }

            @Override // com.bytedance.sdk.component.iR.bg.IL
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException, com.bytedance.sdk.component.iR.IL il2) {
                java.lang.String message;
                int iBg;
                com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.LZ.4.3
                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                        bgVar2.IL("get_ad");
                        bgVar2.bX(adSlot.getCodeId());
                        bgVar2.eqN(com.bytedance.sdk.openadsdk.utils.ayS.bX(adSlot.getDurationSlotType()));
                        bgVar2.bg(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                        return bgVar2;
                    }
                });
                zxVar.IL();
                if (il2 != null) {
                    message = il2.IL();
                } else {
                    message = iOException != null ? iOException.getMessage() : "";
                }
                com.bytedance.sdk.openadsdk.utils.daV davBg2 = com.bytedance.sdk.openadsdk.utils.daV.bg();
                if (z2) {
                    requestExtraMap.put("pgad_end", java.lang.Long.valueOf(davBg2.bg));
                }
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
                    com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, com.bytedance.sdk.openadsdk.core.LZ.this.bg);
                }
                if (il2 != null) {
                    iBg = il2.bg();
                } else {
                    iBg = (iOException == null || !(iOException instanceof java.net.SocketTimeoutException)) ? 601 : 602;
                }
                com.bytedance.sdk.openadsdk.core.Fy.bg bgVar2 = bgVar;
                if (bgVar2 != null) {
                    bgVar2.bg(iBg, message);
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.Integer.valueOf(iBg);
                il.bg(iBg);
                com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX.incrementAndGet();
                com.bytedance.sdk.openadsdk.eqN.bg.ldr.bg.incrementAndGet();
                com.bytedance.sdk.openadsdk.eqN.bg.ldr.iR.incrementAndGet();
                com.bytedance.sdk.openadsdk.eqN.bg.ldr.zx();
                com.bytedance.sdk.openadsdk.eqN.bg.ldr.bg(iBg, message);
                com.bytedance.sdk.openadsdk.eqN.bg.ldr.bX();
                zxVar.eqN(message).bg(false).bX();
            }
        });
    }

    private void bg(final com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.LZ lz, com.bytedance.sdk.component.iR.IL.eqN eqn, final java.util.Map<java.lang.String, java.lang.Object> map, final boolean z, final com.bytedance.sdk.openadsdk.utils.daV dav, final com.bytedance.sdk.openadsdk.core.Fy.bg bgVar) {
        eqn.bg(new com.bytedance.sdk.component.iR.bg.IL() { // from class: com.bytedance.sdk.openadsdk.core.LZ.5
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                if (z) {
                    map.put("pgad_end", dav);
                }
                if (il == null || !il.ldr()) {
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(il.eqN());
                    if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
                        com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", jSONObject.toString(), com.bytedance.sdk.openadsdk.core.LZ.this.bg);
                    }
                    org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.core.LZ.this.bg(jSONObject);
                    if (jSONObjectBg == null) {
                        bgVar.bg(-1, com.bytedance.sdk.openadsdk.core.Kg.bg(-1));
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.LZ.bg bgVarBg = com.bytedance.sdk.openadsdk.core.LZ.bg.bg(jSONObjectBg, adSlot, lz);
                    if (bgVarBg.eqN != 20000) {
                        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().aGH() && bgVarBg.eqN == 40029) {
                            bgVar.bg(-100, com.bytedance.sdk.openadsdk.core.Kg.bg(-100));
                            return;
                        } else {
                            bgVar.bg(bgVarBg.eqN, bgVarBg.zx);
                            return;
                        }
                    }
                    if (bgVarBg.Kg == null) {
                        bgVar.bg(-1, com.bytedance.sdk.openadsdk.core.Kg.bg(-1));
                        return;
                    }
                    bgVarBg.Kg.bX(jSONObjectBg.toString());
                    bgVar.bg(bgVarBg.Kg, new com.bytedance.sdk.openadsdk.core.model.IL());
                    com.bytedance.sdk.openadsdk.core.LZ.this.bg(bgVarBg.Kg);
                    com.bytedance.sdk.openadsdk.core.eqN.bg.bg().bg(bgVarBg.Kg);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "get ad error: ", th);
                    bgVar.bg(-1, com.bytedance.sdk.openadsdk.core.Kg.bg(-1));
                }
            }

            @Override // com.bytedance.sdk.component.iR.bg.IL
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException, com.bytedance.sdk.component.iR.IL il) {
                com.bytedance.sdk.openadsdk.utils.daV davBg = com.bytedance.sdk.openadsdk.utils.daV.bg();
                if (z) {
                    map.put("pgad_end", java.lang.Long.valueOf(davBg.bg));
                }
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().txA() && com.bytedance.sdk.openadsdk.core.DDQ.bg().iR() == 1) {
                    com.bytedance.sdk.openadsdk.utils.ayS.bg("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, com.bytedance.sdk.openadsdk.core.LZ.this.bg);
                }
                if (il != null) {
                    bgVar.bg(il.bg(), il.IL());
                } else {
                    bgVar.bg(601, iOException != null ? iOException.getMessage() : "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = bgVar.bX();
        if (listBX == null || listBX.size() == 0) {
            return;
        }
        for (int i = 0; i < listBX.size(); i++) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = listBX.get(i);
            if (tuv != null && tuv.VB() == null) {
                bg("", 0, 0, tuv.sVc(), tuv);
                bg("", 0, 0, tuv.ApA(), tuv);
                java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = tuv.lM();
                if (listLM != null && listLM.size() > 0) {
                    for (int i2 = 0; i2 < listLM.size(); i2++) {
                        bg(tuv, listLM.get(i2));
                    }
                }
                if (tuv.Dxa() != null) {
                    bg(tuv.Dxa().eo(), tuv.Dxa().bX(), tuv.Dxa().IL(), (com.bytedance.sdk.openadsdk.core.model.Lq) null, tuv);
                }
            }
        }
    }

    private void bg(java.lang.String str, int i, int i2, com.bytedance.sdk.openadsdk.core.model.Lq lq, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.WR.eqN.bg(str).bg(i).IL(i2).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bX(2).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, str, null), 4);
        } else {
            if (lq == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.WR.eqN.bg(lq).bX(2).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, lq.bg(), null), 4);
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.model.Lq lq) {
        if (lq == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.WR.eqN.bg(lq).bX(2).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, lq.bg(), new com.bytedance.sdk.component.zx.xxp() { // from class: com.bytedance.sdk.openadsdk.core.LZ.6
            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(int i, java.lang.String str, java.lang.Throwable th) {
            }

            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(com.bytedance.sdk.component.zx.VB vb) {
            }
        }), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public void bg(com.bytedance.sdk.component.IL.bg.eo eoVar, com.bytedance.sdk.openadsdk.core.model.LZ lz, com.bytedance.sdk.openadsdk.utils.daV dav, com.bytedance.sdk.openadsdk.utils.daV dav2, int i, com.bytedance.sdk.openadsdk.utils.daV dav3, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, boolean z) {
        long jBg;
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().ApA()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (lz != null) {
                try {
                    if (lz.WR.bg > 0) {
                        jSONObject.put("client_start_time", dav.bg(lz.WR));
                        jBg = dav3.bg(lz.WR);
                    } else {
                        jBg = 0;
                    }
                } catch (java.lang.Exception unused) {
                    return;
                }
            } else {
                jBg = 0;
            }
            jSONObject.put("network_time", dav2.bg(dav));
            jSONObject.put("sever_time", i);
            jSONObject.put("client_end_time", dav3.bg(dav2));
            int i2 = 1;
            if (z) {
                jSONObject.put("is_choose_ad", true);
            }
            if (str.equals("open_ad")) {
                if (!tuv.NC()) {
                    i2 = 0;
                }
                jSONObject.put("is_icon_only", i2);
            }
            if (eoVar.IL > 0) {
                jSONObject.put("enqueue_2_run_ts", eoVar.bX - eoVar.IL);
                jSONObject.put("run_2_connect_end_ts", eoVar.zx - eoVar.IL);
                jSONObject.put("connect_end_2_response_end_ts", eoVar.ldr - eoVar.zx);
                jSONObject.put("response_end_2_callback_end_ts", android.os.SystemClock.elapsedRealtime() - eoVar.ldr);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str, "load_ad_time", jBg, jSONObject);
        }
    }

    private boolean bX(org.json.JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    @com.pgl.ssdk.ces.out.DungeonFlag
    public com.bytedance.sdk.openadsdk.eqN.zx bg(org.json.JSONObject jSONObject, java.lang.String str, boolean z) {
        byte[] bArrEncryptV3;
        boolean z2;
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String strIL = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
                return null;
            }
            com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
            eqnIL.IL(str);
            if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().kU()) {
                eqnIL.IL("_disable_retry", "1");
            }
            boolean z3 = true;
            if (z) {
                boolean zBg = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.APP_LOG);
                byte[] bArrZx = zx(jSONObject.toString());
                if (zBg) {
                    android.util.Pair<java.lang.Integer, byte[]> pairEncryptType4WithoutBase64 = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.encryptType4WithoutBase64(bArrZx);
                    if (pairEncryptType4WithoutBase64 != null && pairEncryptType4WithoutBase64.second != null && ((byte[]) pairEncryptType4WithoutBase64.second).length > 0) {
                        bArrEncryptV3 = (byte[]) pairEncryptType4WithoutBase64.second;
                        com.bytedance.sdk.openadsdk.core.rri.IL(true);
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((java.lang.Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        com.bytedance.sdk.openadsdk.core.rri.IL(false);
                        com.bytedance.sdk.openadsdk.core.rri.bg(1, com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                        bArrEncryptV3 = null;
                    }
                } else {
                    bArrEncryptV3 = null;
                }
                if (bArrEncryptV3 != null) {
                    eqnIL.IL(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                    eqnIL.IL("x-pgli18n", "4");
                    eqnIL.bg("application/octet-stream;tt-data=a", bArrEncryptV3);
                } else {
                    bArrEncryptV3 = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.encryptV3(bArrZx);
                    if (bArrEncryptV3 != null) {
                        bg(IL(), eqnIL);
                        eqnIL.bg("application/octet-stream;tt-data=a", bArrEncryptV3);
                    } else {
                        com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "V3 encrypt failed");
                    }
                }
            } else {
                bArrEncryptV3 = null;
            }
            if (bArrEncryptV3 == null) {
                try {
                    org.json.JSONObject jSONObjectBg = com.bytedance.sdk.component.utils.bg.bg(jSONObject);
                    if (!bX(jSONObjectBg)) {
                        jSONObjectBg = jSONObject;
                    }
                    bg(eqN(jSONObjectBg), eqnIL);
                    eqnIL.bg(jSONObjectBg.toString(), com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp());
                } catch (java.lang.OutOfMemoryError e) {
                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e.toString());
                    return new com.bytedance.sdk.openadsdk.eqN.zx(false, -2, "encrypt_error", false);
                }
            }
            com.bytedance.sdk.openadsdk.yDt.bg.zx zxVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx(3);
            zxVar.bg(str).bg(eqnIL.eqN()).bg();
            com.bytedance.sdk.component.iR.IL ilBg = eqnIL.bg();
            boolean zZx = (ilBg == null || !ilBg.ldr() || android.text.TextUtils.isEmpty(ilBg.eqN())) ? false : zx(new org.json.JSONObject(ilBg.eqN()));
            java.lang.String strIL2 = "error unknown";
            int iBg = ilBg != null ? ilBg.bg() : 0;
            if (zZx || iBg != 200) {
                if (ilBg != null && ilBg.IL() != null) {
                    strIL2 = ilBg.IL();
                }
                z2 = false;
            } else {
                strIL2 = "server say not success";
                z2 = true;
            }
            boolean z4 = ilBg == null;
            if (z4 || !ilBg.ldr()) {
                z3 = false;
            }
            com.bytedance.sdk.openadsdk.yDt.bg.zx zxVarBg = zxVar.bg(z3).bX(z4 ? null : ilBg.eqN()).bg(z4 ? com.bytedance.sdk.openadsdk.yDt.bg.zx.bg : iBg);
            if (!z4) {
                strIL = ilBg.IL();
            }
            zxVarBg.eqN(strIL).bX();
            bg(jSONObject, z);
            com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.bg, zZx, iBg, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.eqN.zx(zZx, iBg, strIL2, z2);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.eqN.zx(false, 509, "service_busy", false);
        }
    }

    private void bg(java.util.Map<java.lang.String, java.lang.String> map, com.bytedance.sdk.component.iR.IL.eqN eqn) {
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                try {
                    eqn.IL(entry.getKey(), entry.getValue());
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            eqn.IL(com.google.common.net.HttpHeaders.USER_AGENT, com.bytedance.sdk.openadsdk.utils.ayS.bX());
        } catch (java.lang.Exception e2) {
            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    private void bg(org.json.JSONObject jSONObject, boolean z) throws java.lang.Throwable {
        if (com.bytedance.sdk.openadsdk.core.WR.IL().xxp()) {
            try {
                jSONObject.getJSONObject("header").put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, "4562");
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
            eqnIL.IL(com.bytedance.sdk.openadsdk.utils.ayS.Ta());
            byte[] bArrEncryptV3 = null;
            if (z) {
                boolean zBg = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.APP_LOG);
                byte[] bArrZx = zx(jSONObject.toString());
                if (zBg) {
                    android.util.Pair<java.lang.Integer, byte[]> pairEncryptType4WithoutBase64 = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.encryptType4WithoutBase64(bArrZx);
                    if (pairEncryptType4WithoutBase64 != null && pairEncryptType4WithoutBase64.second != null && ((byte[]) pairEncryptType4WithoutBase64.second).length > 0) {
                        byte[] bArr = (byte[]) pairEncryptType4WithoutBase64.second;
                        com.bytedance.sdk.openadsdk.core.rri.IL(true);
                        bArrEncryptV3 = bArr;
                    } else {
                        int iIntValue = pairEncryptType4WithoutBase64 != null ? ((java.lang.Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                        com.bytedance.sdk.openadsdk.core.rri.IL(false);
                        com.bytedance.sdk.openadsdk.core.rri.bg(1, com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                    }
                }
                if (bArrEncryptV3 != null) {
                    eqnIL.IL(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                    eqnIL.IL("x-pgli18n", "4");
                    eqnIL.bg("application/octet-stream;tt-data=a", bArrEncryptV3);
                } else {
                    bArrEncryptV3 = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.encryptV3(bArrZx);
                    if (bArrEncryptV3 != null) {
                        bg(IL(), eqnIL);
                        eqnIL.bg("application/octet-stream;tt-data=a", bArrEncryptV3);
                    } else {
                        com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "V3 encrypt failed");
                    }
                }
            }
            if (bArrEncryptV3 == null) {
                org.json.JSONObject jSONObjectBg = com.bytedance.sdk.component.utils.bg.bg(jSONObject);
                if (bX(jSONObjectBg)) {
                    jSONObject = jSONObjectBg;
                }
                bg(eqN(jSONObject), eqnIL);
                eqnIL.bg(jSONObject.toString(), com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp());
            }
            eqnIL.bg(7);
            eqnIL.bg("et_applog");
            eqnIL.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.LZ.7
                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                    if (il == null || !il.ldr()) {
                        return;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    il.eqN();
                }

                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public void bg(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        org.json.JSONObject jSONObjectIL;
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg() && (jSONObjectIL = IL(str, list, str2, str3, str4)) != null) {
            com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
            java.lang.String strEqN = com.bytedance.sdk.openadsdk.utils.ayS.eqN("/api/ad/union/dislike_event/");
            org.json.JSONObject jSONObjectBg = bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectIL);
            java.lang.String string = jSONObjectBg != null ? jSONObjectBg.toString() : null;
            bg(eqnIL, jSONObjectBg);
            eqnIL.IL(strEqN);
            eqnIL.eqN(string);
            final com.bytedance.sdk.openadsdk.yDt.bg.zx zxVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx(6);
            zxVar.bg(strEqN).IL(string).bg();
            eqnIL.bg(7);
            eqnIL.bg("dislike");
            eqnIL.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.LZ.8
                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                    if (il != null) {
                        zxVar.bg(il.ldr()).bg(il.bg()).eqN(il.IL()).bX(il.eqN()).bX();
                    } else {
                        zxVar.bg(false).bg(com.bytedance.sdk.openadsdk.yDt.bg.zx.bg).bX();
                    }
                }

                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                    zxVar.bg(false).eqN(iOException != null ? iOException.getMessage() : null).bX();
                }
            });
            try {
                java.lang.String strOptString = new org.json.JSONObject(str).optString(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, "");
                if (android.text.TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("dislike", strOptString, (java.lang.String) null, (java.lang.String) null);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
            }
        }
    }

    private static org.json.JSONObject bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene cryptDataScene, org.json.JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(cryptDataScene)) {
            org.json.JSONObject jSONObjectEncryptType4 = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.encryptType4(jSONObject, new com.bytedance.sdk.openadsdk.core.tC(cryptDataScene));
            com.bytedance.sdk.openadsdk.core.rri.bg(jSONObjectEncryptType4);
            return jSONObjectEncryptType4;
        }
        return com.bytedance.sdk.component.utils.bg.bg(jSONObject);
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    private org.json.JSONObject IL(java.lang.String str, java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.ironsource.aa.a.d, java.lang.System.currentTimeMillis());
            jSONObject2.put("ad_sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            jSONObject2.put("extra", str);
            jSONObject2.put("filter_words", bg(list));
            jSONObject2.put("dislike_source", str4);
            if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().RJ() && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                jSONObject2.put("creative_info", com.bytedance.sdk.component.utils.bg.bg(new org.json.JSONObject(str2)).toString());
                jSONObject2.put("feedback_type", 1);
                jSONObject2.put("user_description", str3);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("actions", jSONArray);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    private org.json.JSONArray bg(java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.bytedance.sdk.openadsdk.FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private java.util.Map<java.lang.String, java.lang.String> eqN(org.json.JSONObject jSONObject) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (bX(jSONObject)) {
            map.put(com.google.common.net.HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
        }
        return map;
    }

    private java.util.Map<java.lang.String, java.lang.String> IL() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("Content-Type", "application/octet-stream;tt-data=a");
        return map;
    }

    private boolean zx(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.core.Fy.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
        bgVar.bg(-1, com.bytedance.sdk.openadsdk.core.Kg.bg(-1));
        il.bg(-1);
        com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.core.Fy.IL il) {
        il.bg(-1, com.bytedance.sdk.openadsdk.core.Kg.bg(-1));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0089  */
    /* JADX WARN: Code duplicated, block: B:12:0x008b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0091 A[Catch: JSONException -> 0x00c1, TryCatch #0 {JSONException -> 0x00c1, blocks: (B:3:0x0005, B:9:0x0048, B:13:0x008c, B:15:0x0091, B:27:0x00b3, B:8:0x0030, B:5:0x002a), top: B:30:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    private org.json.JSONObject bX() {
        int i;
        int i2;
        int rotation;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.google.ads.mediation.pangle.PangleConstants.APP_ID, com.bytedance.sdk.openadsdk.core.WR.IL().eqN());
            jSONObject.put("name", com.bytedance.sdk.openadsdk.core.WR.IL().ldr());
            ldr(jSONObject);
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            java.lang.String packageResourcePath = "";
            if (contextBg != null) {
                try {
                    packageResourcePath = contextBg.getPackageResourcePath();
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
                jSONObject.put("package_install_path", packageResourcePath);
                jSONObject.put("is_paid_app", com.bytedance.sdk.openadsdk.core.WR.IL().VB());
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.IL.iR());
                jSONObject.put("app_running_time", (java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.core.yDt.bg()) / 1000);
                jSONObject.put("fmwname", com.bytedance.sdk.openadsdk.utils.DeviceUtils.WR(this.bg));
                i = 0;
                if (com.bytedance.sdk.openadsdk.core.yDt.zx()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is_init", i2);
                if (contextBg != null) {
                    rotation = ((android.view.WindowManager) contextBg.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i = 1;
                    } else if (rotation != 1) {
                        i = 3;
                    } else if (rotation != 2) {
                        i = 2;
                    } else if (rotation != 3) {
                        i = 4;
                    }
                    jSONObject.put("orientation_support", new org.json.JSONArray().put(i));
                }
            } else {
                jSONObject.put("package_install_path", packageResourcePath);
                jSONObject.put("is_paid_app", com.bytedance.sdk.openadsdk.core.WR.IL().VB());
                jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.IL.iR());
                jSONObject.put("app_running_time", (java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.core.yDt.bg()) / 1000);
                jSONObject.put("fmwname", com.bytedance.sdk.openadsdk.utils.DeviceUtils.WR(this.bg));
                i = 0;
                if (com.bytedance.sdk.openadsdk.core.yDt.zx()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is_init", i2);
                if (contextBg != null) {
                    rotation = ((android.view.WindowManager) contextBg.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i = 1;
                    } else if (rotation != 1) {
                        i = 3;
                    } else if (rotation != 2) {
                        i = 2;
                    } else if (rotation != 3) {
                        i = 4;
                    }
                    jSONObject.put("orientation_support", new org.json.JSONArray().put(i));
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.kMt kmt;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("personalized_ad", com.bytedance.sdk.openadsdk.core.VzQ.eqN().bN());
            jSONObject.put("lmt", com.bytedance.sdk.openadsdk.utils.DeviceUtils.bX());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.WR.IL().eo());
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.WR.IL().WR());
            jSONObject.put("is_gdpr_user", com.bytedance.sdk.openadsdk.core.VzQ.eqN().uu());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.WR.IL().Fy());
            if (adSlot != null && com.bytedance.sdk.openadsdk.core.kMt.bg.containsKey(java.lang.Integer.valueOf(adSlot.getCodeId())) && (kmt = com.bytedance.sdk.openadsdk.core.kMt.bg.get(java.lang.Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", kmt.IL());
                jSONObject.put("lastbundle", kmt.bX());
                jSONObject.put("lastclick", kmt.eqN());
                jSONObject.put("lastskip", kmt.zx());
            }
            bg(jSONObject, "keywords", com.bytedance.sdk.openadsdk.core.WR.IL().PX());
            bg(jSONObject, "data", IL(adSlot));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    private static java.lang.String IL(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        java.lang.String strTa = com.bytedance.sdk.openadsdk.core.WR.IL().Ta();
        if (adSlot == null) {
            return android.text.TextUtils.isEmpty(strTa) ? "" : strTa;
        }
        java.lang.String userData = adSlot.getUserData();
        if (android.text.TextUtils.isEmpty(strTa)) {
            return userData;
        }
        if (android.text.TextUtils.isEmpty(userData)) {
            return strTa;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(userData);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString("name", null));
                }
            }
            try {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray(strTa);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (java.lang.Throwable unused) {
                return userData;
            }
        } catch (java.lang.Throwable unused2) {
            return strTa;
        }
    }

    private static void bg(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    private void ldr(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put(com.ironsource.y8.h.V, com.bytedance.sdk.openadsdk.utils.ayS.zx());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.ayS.ldr());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.ayS.iR());
        } catch (java.lang.Exception unused) {
        }
    }

    private org.json.JSONObject bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.LZ lz) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!android.text.TextUtils.isEmpty(adSlot.getAdId()) || !android.text.TextUtils.isEmpty(adSlot.getCreativeId()) || !android.text.TextUtils.isEmpty(adSlot.getExt())) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (!android.text.TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!android.text.TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (lz != null) {
                jSONObject.put("render_method", lz.Kg);
                if (lz.Kg == 1) {
                    bg(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (lz.Kg == 2) {
                    bg(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                bg(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", IL(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", bX(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", bX(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", com.bytedance.sdk.openadsdk.AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (adSlot.getNativeAdType() > 0 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (lz != null && lz.iR != null) {
                jSONObject.put("session_params", lz.iR);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i == 7 || i == 8) {
                adCount = 1;
            }
            if (lz != null && lz.zx != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    private void bg(org.json.JSONObject jSONObject, java.lang.String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (java.lang.Exception unused) {
        }
    }

    private void bg(org.json.JSONObject jSONObject, java.lang.String str, float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONObject2.put("width", (int) f);
            jSONObject2.put("height", (int) f2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (java.lang.Exception unused) {
        }
    }

    public static class bg {
        final long IL;
        public final com.bytedance.sdk.openadsdk.core.model.bg Kg;
        final java.lang.String WR;
        final long bX;
        final int bg;
        final java.util.ArrayList<java.lang.Integer> eo;
        final int eqN;
        final java.lang.String iR;
        final int ldr;
        final java.lang.String zx;

        private bg(java.lang.String str, int i, int i2, java.lang.String str2, int i3, java.lang.String str3, com.bytedance.sdk.openadsdk.core.model.bg bgVar, long j, long j2, java.util.ArrayList<java.lang.Integer> arrayList) {
            this.bg = i;
            this.eqN = i2;
            this.zx = str2;
            this.iR = str3;
            this.Kg = bgVar;
            this.WR = str;
            this.ldr = i3;
            this.IL = j;
            this.bX = j2;
            this.eo = arrayList;
        }

        public static com.bytedance.sdk.openadsdk.core.LZ.bg bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.LZ lz, com.bytedance.sdk.openadsdk.core.model.IL il) {
            java.lang.String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            java.lang.String strOptString2 = jSONObject.optString("desc");
            java.lang.String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            android.util.Pair<com.bytedance.sdk.openadsdk.core.model.bg, java.util.ArrayList<java.lang.Integer>> pairBg = com.bytedance.sdk.openadsdk.core.IL.bg(jSONObject, adSlot, lz, il);
            if (pairBg != null && pairBg.first != null) {
                ((com.bytedance.sdk.openadsdk.core.model.bg) pairBg.first).bg(jSONObject.optLong("request_after"));
            }
            if (pairBg == null) {
                return new com.bytedance.sdk.openadsdk.core.LZ.bg(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null);
            }
            return new com.bytedance.sdk.openadsdk.core.LZ.bg(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.bg) pairBg.first, jOptLong, jOptLong2, (java.util.ArrayList) pairBg.second);
        }

        public static com.bytedance.sdk.openadsdk.core.LZ.bg bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.LZ lz) {
            java.lang.String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            java.lang.String strOptString2 = jSONObject.optString("desc");
            java.lang.String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adn_bid_result");
                com.bytedance.sdk.openadsdk.core.model.bg bgVar = new com.bytedance.sdk.openadsdk.core.model.bg();
                if (jSONArrayOptJSONArray != null) {
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            java.lang.String strOptString4 = jSONObjectOptJSONObject.optString("name");
                            java.lang.String strOptString5 = jSONObjectOptJSONObject.optString("render_data");
                            java.lang.String strOptString6 = jSONObjectOptJSONObject.optString("price");
                            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("win_notice");
                            org.json.JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("loss_notice");
                            java.lang.String strOptString7 = jSONObjectOptJSONObject.optString(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID);
                            java.lang.String strOptString8 = jSONObjectOptJSONObject.optString("crid");
                            org.json.JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray("adomain");
                            java.lang.String strOptString9 = jSONObjectOptJSONObject.optString("adn_response_id");
                            com.bytedance.sdk.openadsdk.core.model.Kg kg = new com.bytedance.sdk.openadsdk.core.model.Kg();
                            kg.bg(strOptString4);
                            kg.IL(strOptString5);
                            kg.bX(strOptString6);
                            kg.eqN(strOptString7);
                            kg.zx(strOptString8);
                            kg.ldr(strOptString9);
                            if (jSONArrayOptJSONArray4 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray4.length(); i2++) {
                                    arrayList.add(jSONArrayOptJSONArray4.optString(i2));
                                }
                                kg.bX(arrayList);
                            }
                            if (jSONArrayOptJSONArray2 != null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                    arrayList2.add(jSONArrayOptJSONArray2.optString(i3));
                                }
                                kg.bg(arrayList2);
                            }
                            if (jSONArrayOptJSONArray3 != null) {
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                                    arrayList3.add(jSONArrayOptJSONArray3.optString(i4));
                                }
                                kg.IL(arrayList3);
                            }
                            bgVar.bg(kg);
                        }
                        i++;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        strOptString3 = strOptString3;
                        jOptLong2 = jOptLong2;
                        jOptLong = jOptLong;
                        iOptInt3 = iOptInt3;
                    }
                }
                return new com.bytedance.sdk.openadsdk.core.LZ.bg(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, bgVar, jOptLong, jOptLong2, null);
            }
            return new com.bytedance.sdk.openadsdk.core.LZ.bg(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public void bg(org.json.JSONObject jSONObject, final com.bytedance.sdk.openadsdk.core.Fy.IL il) {
        if (!com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            if (il != null) {
                il.bg(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                return;
            }
            return;
        }
        if (jSONObject == null || il == null) {
            return;
        }
        org.json.JSONObject jSONObjectBg = bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        final com.bytedance.sdk.openadsdk.yDt.bg.zx zxVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx(5);
        com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
        try {
            java.lang.String strBg = com.bytedance.sdk.openadsdk.Kg.eqN.bg(eqnIL, com.bytedance.sdk.openadsdk.utils.ayS.eqN("/api/ad/union/sdk/reward_video/reward/"));
            eqnIL.IL(strBg);
            zxVar.bg(strBg);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e.getMessage());
        }
        bg(eqnIL, jSONObjectBg);
        eqnIL.eqN(jSONObjectBg != null ? jSONObjectBg.toString() : "");
        zxVar.bg(eqnIL.eqN()).bg();
        eqnIL.bg(10);
        eqnIL.bg(com.json.s.j);
        eqnIL.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.LZ.9
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il2) {
                if (il2 != null) {
                    if (il2.ldr() && !android.text.TextUtils.isEmpty(il2.eqN())) {
                        zxVar.bg(true).bg(il2.bg()).bX(il2.eqN()).bX();
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(il2.eqN());
                            java.lang.String strIL = com.bytedance.sdk.openadsdk.core.LZ.IL(jSONObject2.optInt("cypher", -1), jSONObject2.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
                            if (!android.text.TextUtils.isEmpty(strIL)) {
                                try {
                                    jSONObject2 = new org.json.JSONObject(strIL);
                                } catch (java.lang.Throwable unused) {
                                }
                            }
                            com.bytedance.sdk.openadsdk.core.LZ.IL ilBg = com.bytedance.sdk.openadsdk.core.LZ.IL.bg(jSONObject2);
                            if (ilBg.bg != 20000) {
                                il.bg(ilBg.bg, com.bytedance.sdk.openadsdk.core.Kg.bg(ilBg.bg));
                                return;
                            } else if (ilBg.bX == null) {
                                com.bytedance.sdk.openadsdk.core.LZ.this.bg(il);
                                return;
                            } else {
                                il.bg(ilBg);
                                return;
                            }
                        } catch (org.json.JSONException e2) {
                            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e2.getMessage());
                            com.bytedance.sdk.openadsdk.core.LZ.this.bg(il);
                            return;
                        }
                    }
                    zxVar.bg(il2.ldr()).bX(il2.eqN()).bg(il2.bg()).eqN(il2.IL()).bX();
                    java.lang.String strBg2 = com.bytedance.sdk.openadsdk.core.Kg.bg(-2);
                    int iBg = il2.bg();
                    if (!il2.ldr() && !android.text.TextUtils.isEmpty(il2.IL())) {
                        strBg2 = il2.IL();
                    }
                    il.bg(iBg, strBg2);
                    return;
                }
                zxVar.bg(false).bg(com.bytedance.sdk.openadsdk.yDt.bg.zx.bg).bX();
                com.bytedance.sdk.openadsdk.core.LZ.this.bg(il);
            }

            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                java.lang.String message = iOException != null ? iOException.getMessage() : "";
                zxVar.bg(false).eqN(message).bX();
                il.bg(-2, message);
            }
        });
    }

    public static class IL {
        public final boolean IL;
        public final com.bytedance.sdk.openadsdk.core.model.Uw bX;
        public final int bg;

        private IL(int i, boolean z, com.bytedance.sdk.openadsdk.core.model.Uw uw) {
            this.bg = i;
            this.IL = z;
            this.bX = uw;
        }

        public static com.bytedance.sdk.openadsdk.core.LZ.IL bg(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.Uw uw = new com.bytedance.sdk.openadsdk.core.model.Uw();
            if (jSONObjectOptJSONObject != null) {
                try {
                    uw.bg(jSONObjectOptJSONObject.optInt("reason"));
                    uw.IL(jSONObjectOptJSONObject.optInt("corp_type"));
                    uw.bX(jSONObjectOptJSONObject.optInt("reward_amount"));
                    uw.bg(jSONObjectOptJSONObject.optString("reward_name"));
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", th.getMessage());
                }
            }
            return new com.bytedance.sdk.openadsdk.core.LZ.IL(iOptInt, zOptBoolean, uw);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            java.lang.String strOptString = jSONObject.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            java.lang.String strOptString2 = jSONObject.optString("auction_price", "");
            java.lang.String strIL = IL(iOptInt, strOptString);
            if (android.text.TextUtils.isEmpty(strIL)) {
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(strIL);
            try {
                jSONObject2.put("auction_price", strOptString2);
            } catch (java.lang.Throwable unused) {
            }
            return jSONObject2;
        } catch (java.lang.Throwable unused2) {
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String IL(int i, java.lang.String str) {
        if (i == 3) {
            return com.bytedance.sdk.component.utils.bg.bX(str);
        }
        if (i == 4) {
            android.util.Pair<java.lang.Integer, java.lang.String> pairDecryptType4 = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && pairDecryptType4.second != null) {
                java.lang.String str2 = (java.lang.String) pairDecryptType4.second;
                com.bytedance.sdk.openadsdk.core.rri.bg(true);
                return str2;
            }
            com.bytedance.sdk.openadsdk.core.rri.bg(false);
            com.bytedance.sdk.openadsdk.core.rri.bg(2, com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((java.lang.Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public com.bytedance.sdk.openadsdk.eqN.zx IL(org.json.JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int iBg;
        java.lang.String strIL = "error unknown";
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.PX.bg() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.openadsdk.yDt.bg.zx zxVar = new com.bytedance.sdk.openadsdk.yDt.bg.zx(4);
        org.json.JSONObject jSONObjectBg = bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
        com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
        boolean z3 = false;
        try {
            eqnIL.bg(jSONObjectBg.toString(), com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp());
            java.lang.String strEqN = com.bytedance.sdk.openadsdk.utils.ayS.eqN("/api/ad/union/sdk/stats/batch/");
            zxVar.bg(strEqN).bg(eqnIL.eqN()).bg();
            eqnIL.IL(strEqN);
            bg(eqnIL, jSONObjectBg);
            eqnIL.IL(com.google.common.net.HttpHeaders.USER_AGENT, com.bytedance.sdk.openadsdk.utils.ayS.bX());
            if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().qp()) {
                eqnIL.IL("_disable_retry", "1");
            }
            com.bytedance.sdk.component.iR.IL ilBg = eqnIL.bg();
            try {
                if (ilBg == null) {
                    return new com.bytedance.sdk.openadsdk.eqN.zx(false, 0, "error unknown", false);
                }
                if (!ilBg.ldr() || android.text.TextUtils.isEmpty(ilBg.eqN())) {
                    z = false;
                    z2 = false;
                } else {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(ilBg.eqN());
                    int iOptInt = jSONObject2.optInt("code", -1);
                    strIL = jSONObject2.optString("data", "");
                    z = iOptInt == 20000;
                    z2 = iOptInt == 60005;
                }
                try {
                    iBg = ilBg.bg();
                    try {
                        if (!ilBg.ldr()) {
                            strIL = ilBg.IL();
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                } catch (java.lang.Throwable unused2) {
                    iBg = 0;
                }
                boolean z4 = ilBg == null;
                if (!z4 && ilBg.ldr()) {
                    z3 = true;
                }
                zxVar.bg(z3).bX(z4 ? null : ilBg.eqN()).bg(z4 ? com.bytedance.sdk.openadsdk.yDt.bg.zx.bg : iBg).eqN(z4 ? null : ilBg.IL()).bX();
                com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.IL, z, iBg, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                return new com.bytedance.sdk.openadsdk.eqN.zx(z, iBg, strIL, z2);
            } catch (java.lang.Throwable unused3) {
                z = false;
                z2 = false;
                iBg = 0;
            }
        } catch (java.lang.Throwable unused4) {
            com.bytedance.sdk.openadsdk.eqN.bg.bg.bg(com.bytedance.sdk.openadsdk.eqN.bg.bg.IL, false, 0, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.eqN.zx(false, 0, "error unknown", false);
        }
    }

    private void bg(com.bytedance.sdk.component.iR.IL.eqN eqn, org.json.JSONObject jSONObject) {
        try {
            if (bX(jSONObject) && jSONObject.optInt("cypher") == 4) {
                eqn.IL("x-pgli18n", "4");
                eqn.IL("Content-Type", "application/json; charset=utf-8");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public com.bytedance.sdk.component.adexpress.bg.bX.bg bg() {
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarEqN = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            return null;
        }
        long jCurrentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tpl_fetch_model", "date", 0L);
        java.lang.String strLKE = com.bytedance.sdk.openadsdk.core.VzQ.eqN().LKE();
        java.lang.String strIL = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= com.bytedance.sdk.openadsdk.core.VzQ.eqN().DDQ() && jCurrentTimeMillis >= 0 && android.text.TextUtils.equals(strLKE, strIL)) {
            java.lang.String strIL2 = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tpl_fetch_model", com.json.ce.v, "");
            try {
                if (!android.text.TextUtils.isEmpty(strIL2)) {
                    return com.bytedance.sdk.component.adexpress.bg.bX.bg.eqN(strIL2);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
        try {
            ilBX.IL(com.bytedance.sdk.openadsdk.Kg.eqN.bg(ilBX, strLKE));
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e.getMessage());
        }
        com.bytedance.sdk.component.iR.IL ilBg = ilBX.bg();
        if (ilBg == null) {
            return null;
        }
        try {
            if (!ilBg.ldr()) {
                return null;
            }
            java.lang.String strEqN = ilBg.eqN();
            bgVarEqN = com.bytedance.sdk.component.adexpress.bg.bX.bg.eqN(strEqN);
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tpl_fetch_model", "date", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tpl_fetch_model", com.json.ce.v, strEqN);
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tpl_fetch_model", "last_url", strLKE);
            return bgVarEqN;
        } catch (java.lang.Exception unused2) {
            return bgVarEqN;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public void bg(java.lang.String str) {
        com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
        ilBX.IL(str);
        ilBX.bg("upload_bidding");
        ilBX.bg(7);
        ilBX.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.LZ.10
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                il.eqN();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy
    public void bg(org.json.JSONObject jSONObject, java.lang.String str) {
        com.bytedance.sdk.component.iR.IL.eqN eqnIL = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().IL();
        eqnIL.IL(str);
        eqnIL.bg(jSONObject);
        eqnIL.bg(5);
        eqnIL.bg("apm_pv");
        eqnIL.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.LZ.2
            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.iR.bg.bg
            public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                il.eqN();
            }
        });
    }

    public static org.json.JSONArray IL(java.lang.String str) {
        try {
            java.util.Set<java.lang.String> setIL = com.bytedance.sdk.component.adexpress.bg.IL.IL.IL(str);
            if (setIL != null && setIL.size() != 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator<java.lang.String> it = setIL.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.bg.bX.IL ilBg = com.bytedance.sdk.component.adexpress.bg.IL.IL.bg(it.next());
                    if (ilBg != null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("id", ilBg.IL());
                        jSONObject.put("md5", ilBg.bX());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    public static org.json.JSONArray bX(java.lang.String str) {
        try {
            java.util.Set<com.bytedance.sdk.openadsdk.core.VB.bg.bg> setBg = com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg(str);
            if (setBg != null && setBg.size() != 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar : setBg) {
                    if (bgVar != null && !android.text.TextUtils.isEmpty(bgVar.zx())) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        java.lang.String[] strArrSplit = bgVar.bg().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", bgVar.IL());
                            jSONArray.put(jSONObject);
                        } else {
                            continue;
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    private byte[] zx(java.lang.String str) throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.util.zip.GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    try {
                        java.util.zip.GZIPOutputStream gZIPOutputStream2 = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes(com.json.zb.N));
                            try {
                                gZIPOutputStream2.close();
                            } catch (java.io.IOException e) {
                                com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (java.io.IOException e2) {
                            e = e2;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (java.io.IOException e3) {
                                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e3.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (java.io.IOException e4) {
                                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e4.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (java.io.IOException e5) {
                                    com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e5.toString());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (java.io.IOException e6) {
                        e = e6;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException e7) {
                com.bytedance.sdk.component.utils.PX.bg("NetApiImpl", e7.toString());
            }
        } catch (java.io.IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }
}

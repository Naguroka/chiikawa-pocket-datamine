package com.bytedance.sdk.openadsdk.component;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    private static volatile com.bytedance.sdk.openadsdk.component.ldr bg;
    private final com.bytedance.sdk.openadsdk.IL.IL IL;
    private final com.bytedance.sdk.openadsdk.core.Fy<com.bytedance.sdk.openadsdk.eqN.bg> bX;
    private final android.content.Context eqN;
    private final java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicInteger> zx = new java.util.concurrent.ConcurrentHashMap();

    public interface IL {
        void bg();

        void bg(com.bytedance.sdk.openadsdk.xxp.bg.IL il);
    }

    interface bX {
        void bg();

        void bg(int i, java.lang.String str);
    }

    public interface eqN {
        void bg(android.graphics.Bitmap bitmap);
    }

    private ldr(android.content.Context context) {
        if (context != null) {
            this.eqN = context.getApplicationContext();
        } else {
            this.eqN = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        this.IL = new com.bytedance.sdk.openadsdk.IL.IL(10, 8, true);
        this.bX = com.bytedance.sdk.openadsdk.core.VzQ.bX();
        com.bytedance.sdk.openadsdk.common.bg.bg("tt_openad_materialMeta", new com.bytedance.sdk.openadsdk.common.bg.IL("tt_openad_materialMeta") { // from class: com.bytedance.sdk.openadsdk.component.ldr.1
            @Override // com.bytedance.sdk.openadsdk.common.bg.IL
            protected java.lang.String bg(java.lang.String str) {
                return "tt_openad_materialMeta";
            }

            @Override // com.bytedance.sdk.openadsdk.common.bg.IL
            public java.lang.String IL(java.lang.String str) {
                return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tt_openad_materialMeta", "material".concat(java.lang.String.valueOf(str)), null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.bg.IL
            public java.lang.String eqN(java.lang.String str) {
                return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tt_openad_materialMeta", "ad_slot".concat(java.lang.String.valueOf(str)), null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.bg.IL
            public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, java.lang.String str, java.lang.String str2) {
                java.lang.String codeId = adSlot.getCodeId();
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad_materialMeta", "material".concat(java.lang.String.valueOf(codeId)), str);
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad_materialMeta", "ad_slot".concat(java.lang.String.valueOf(codeId)), adSlot.toJsonObj().toString());
            }
        });
    }

    public static com.bytedance.sdk.openadsdk.component.ldr bg(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.component.ldr.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.component.ldr(context);
                }
            }
        }
        return bg;
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.component.ldr.eqN eqn) {
        bg(tuv, eqn, 0);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.component.ldr.eqN eqn, final int i) {
        java.lang.String strEo = tuv.Dxa().eo();
        if (android.text.TextUtils.isEmpty(strEo)) {
            return;
        }
        com.bytedance.sdk.openadsdk.WR.eqN.bg(strEo).bg(tuv.Dxa().bX()).IL(tuv.Dxa().IL()).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bX(2).bg(new com.bytedance.sdk.component.zx.Kg() { // from class: com.bytedance.sdk.openadsdk.component.ldr.3
            @Override // com.bytedance.sdk.component.zx.Kg
            public android.graphics.Bitmap bg(android.graphics.Bitmap bitmap) {
                return i <= 0 ? bitmap : com.bytedance.sdk.component.adexpress.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), bitmap, i);
            }
        }).bg(new com.bytedance.sdk.openadsdk.WR.IL(tuv, strEo, new com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.ldr.2
            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(int i2, java.lang.String str, java.lang.Throwable th) {
            }

            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
                com.bytedance.sdk.openadsdk.component.ldr.eqN eqn2;
                if (vb == null || vb.IL() == null || vb.bX() == null || (eqn2 = eqn) == null) {
                    return;
                }
                eqn2.bg(vb.IL());
            }
        }));
    }

    public void bg(final com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (adSlot == null || !android.text.TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zx.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        int iBX = atomicInteger.get() + bX(adSlot);
        if (iBX > 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            java.lang.Integer.valueOf(iBX);
            java.lang.Integer.valueOf(1);
            return;
        }
        atomicInteger.incrementAndGet();
        this.zx.put(adSlot.getCodeId(), atomicInteger);
        final com.bytedance.sdk.openadsdk.core.model.JAA jaa = new com.bytedance.sdk.openadsdk.core.model.JAA();
        jaa.bg(com.bytedance.sdk.openadsdk.utils.daV.bg());
        com.bytedance.sdk.openadsdk.core.model.LZ lz = new com.bytedance.sdk.openadsdk.core.model.LZ();
        lz.eo = jaa;
        lz.eqN = 2;
        lz.Kg = 2;
        this.bX.bg(adSlot, lz, 3, new com.bytedance.sdk.openadsdk.core.Fy.bg() { // from class: com.bytedance.sdk.openadsdk.component.ldr.4
            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.ldr.this.IL(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
                if (bgVar == null || bgVar.bX() == null || bgVar.bX().size() == 0) {
                    il.bg(-3);
                    com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = bgVar.bX().get(0);
                if (tuv != null && tuv.NC()) {
                    com.bytedance.sdk.openadsdk.component.zx.bg bgVar2 = new com.bytedance.sdk.openadsdk.component.zx.bg(tuv.IGR(), tuv, bgVar);
                    com.bytedance.sdk.openadsdk.component.ldr.this.bg(bgVar2);
                    com.bytedance.sdk.openadsdk.component.eqN.bg.bg(bgVar2.IL(), 1, jaa);
                    com.bytedance.sdk.openadsdk.component.ldr.this.IL(adSlot);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
                    com.bytedance.sdk.openadsdk.component.ldr.this.bg(tuv, adSlot, jaa, bgVar);
                } else {
                    com.bytedance.sdk.openadsdk.component.ldr.this.IL(tuv, adSlot, jaa, bgVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zx.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.zx.put(adSlot.getCodeId(), atomicInteger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.JAA jaa, final com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        final int iIGR = tuv.IGR();
        bg(tuv, adSlot, jaa, new com.bytedance.sdk.openadsdk.component.ldr.bX() { // from class: com.bytedance.sdk.openadsdk.component.ldr.5
            @Override // com.bytedance.sdk.openadsdk.component.ldr.bX
            public void bg() {
                com.bytedance.sdk.openadsdk.component.zx.bg bgVar2 = new com.bytedance.sdk.openadsdk.component.zx.bg(iIGR, tuv, bgVar);
                com.bytedance.sdk.openadsdk.component.ldr.this.bg(bgVar2);
                com.bytedance.sdk.openadsdk.component.eqN.bg.bg(bgVar2.IL(), 1, jaa);
                com.bytedance.sdk.openadsdk.component.ldr.this.IL(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ldr.bX
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.ldr.this.IL(adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.JAA jaa, final com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        final int iIGR = tuv.IGR();
        bg(tuv, jaa, new com.bytedance.sdk.openadsdk.component.ldr.IL() { // from class: com.bytedance.sdk.openadsdk.component.ldr.6
            @Override // com.bytedance.sdk.openadsdk.component.ldr.IL
            public void bg(com.bytedance.sdk.openadsdk.xxp.bg.IL il) {
                com.bytedance.sdk.openadsdk.component.zx.bg bgVar2 = new com.bytedance.sdk.openadsdk.component.zx.bg(iIGR, tuv, bgVar);
                com.bytedance.sdk.openadsdk.component.ldr.this.bg(bgVar2);
                com.bytedance.sdk.openadsdk.component.eqN.bg.bg(bgVar2.IL(), 1, jaa);
                com.bytedance.sdk.openadsdk.component.ldr.this.IL(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ldr.IL
            public void bg() {
                com.bytedance.sdk.openadsdk.component.ldr.this.IL(adSlot);
            }
        });
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.JAA jaa, final com.bytedance.sdk.openadsdk.component.ldr.bX bXVar) {
        final com.bytedance.sdk.openadsdk.utils.daV davBg = com.bytedance.sdk.openadsdk.utils.daV.bg();
        final int iIGR = tuv.IGR();
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
        java.lang.String strVB = ilDxa.VB();
        java.lang.String strYDt = ilDxa.yDt();
        if (android.text.TextUtils.isEmpty(strYDt)) {
            strYDt = com.bytedance.sdk.component.utils.zx.bg(strVB);
        }
        final java.io.File fileBg = com.bytedance.sdk.openadsdk.component.iR.bg.bg(strYDt);
        if (fileBg.exists()) {
            com.bytedance.sdk.openadsdk.component.iR.bg.bg(fileBg);
            bg(iIGR);
            long jBX = davBg.bX();
            if (jaa != null) {
                jaa.bg(jBX);
                jaa.bg(1);
            }
            bXVar.bg();
            bg(tuv, (com.bytedance.sdk.openadsdk.component.ldr.eqN) null);
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ja(java.lang.String.valueOf(iIGR)) && !com.bytedance.sdk.component.utils.Lq.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())) {
            bXVar.bg(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(fileBg.getParent(), tuv);
        ilBg.bg("material_meta", tuv);
        ilBg.bg("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg() { // from class: com.bytedance.sdk.openadsdk.component.ldr.7
            @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
            public void IL(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i) {
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i) {
                com.bytedance.sdk.openadsdk.component.ldr.this.bg(iIGR);
                long jBX2 = davBg.bX();
                com.bytedance.sdk.openadsdk.component.eqN.bg.IL(tuv, jBX2, true);
                com.bytedance.sdk.openadsdk.core.model.JAA jaa2 = jaa;
                if (jaa2 != null) {
                    jaa2.bg(jBX2);
                    jaa.bg(2);
                }
                bXVar.bg();
                com.bytedance.sdk.openadsdk.component.ldr.bg(tuv, (com.bytedance.sdk.openadsdk.component.ldr.eqN) null);
            }

            @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
            public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i, java.lang.String str) {
                long jBX2 = davBg.bX();
                com.bytedance.sdk.openadsdk.component.eqN.bg.IL(tuv, jBX2, false);
                com.bytedance.sdk.openadsdk.core.model.JAA jaa2 = jaa;
                if (jaa2 != null) {
                    jaa2.bg(jBX2);
                }
                bXVar.bg(i, str);
                try {
                    if (fileBg.exists() && fileBg.isFile()) {
                        com.bytedance.sdk.component.utils.ldr.bX(fileBg);
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.core.model.JAA jaa, final com.bytedance.sdk.openadsdk.component.ldr.IL il) {
        final com.bytedance.sdk.openadsdk.utils.daV davBg = com.bytedance.sdk.openadsdk.utils.daV.bg();
        final int iIGR = tuv.IGR();
        com.bytedance.sdk.openadsdk.core.model.Lq lq = tuv.lM().get(0);
        java.lang.String strIR = lq.iR();
        java.lang.String strBg = lq.bg();
        int iIL = lq.IL();
        int iBX = lq.bX();
        java.lang.String strBg2 = android.text.TextUtils.isEmpty(strIR) ? com.bytedance.sdk.component.utils.zx.bg(strBg) : strIR;
        if (android.text.TextUtils.isEmpty(strBg2)) {
            if (il != null) {
                il.bg();
                return;
            }
            return;
        }
        java.io.File fileIL = com.bytedance.sdk.openadsdk.component.iR.bg.IL(strBg2);
        if (bg(strBg, strIR)) {
            bX(iIGR);
            long jBX = davBg.bX();
            if (jaa != null) {
                jaa.bg(jBX);
                jaa.bg(1);
            }
            il.bg(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.yDt.bg(new com.bytedance.sdk.openadsdk.xxp.bg(strBg, lq.iR()), iIL, iBX, new com.bytedance.sdk.openadsdk.utils.yDt.bg() { // from class: com.bytedance.sdk.openadsdk.component.ldr.8
            @Override // com.bytedance.sdk.openadsdk.utils.yDt.bg
            public void bg(com.bytedance.sdk.openadsdk.xxp.bg.IL il2) {
                if (il2.eqN()) {
                    com.bytedance.sdk.openadsdk.component.ldr.this.bX(iIGR);
                    long jBX2 = davBg.bX();
                    com.bytedance.sdk.openadsdk.component.eqN.bg.bg(tuv, jBX2, true);
                    com.bytedance.sdk.openadsdk.core.model.JAA jaa2 = jaa;
                    if (jaa2 != null) {
                        jaa2.bg(jBX2);
                        jaa.bg(2);
                    }
                    il.bg(il2);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.eqN.bg.bg(tuv, davBg.bX(), false);
                il.bg();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.yDt.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.component.eqN.bg.bg(tuv, davBg.bX(), false);
                il.bg();
            }
        }, fileIL.getParent());
    }

    public void bg(int i) {
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "video_has_cached".concat(java.lang.String.valueOf(i)), java.lang.Boolean.TRUE);
    }

    public boolean IL(int i) {
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "video_has_cached".concat(java.lang.String.valueOf(i)), false);
    }

    public void bX(int i) {
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "image_has_cached".concat(java.lang.String.valueOf(i)), java.lang.Boolean.TRUE);
    }

    public boolean eqN(int i) {
        return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "image_has_cached".concat(java.lang.String.valueOf(i)), false);
    }

    public void bg(com.bytedance.sdk.openadsdk.component.zx.bg bgVar) {
        if (bgVar.IL() == null || com.bytedance.sdk.openadsdk.core.model.tuV.ldr(bgVar.IL())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "material_expiration_time" + bgVar.bg(), java.lang.Long.valueOf(bgVar.IL().eDa()));
        IL(bgVar);
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV zx(int i) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuvLdr;
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            com.bytedance.sdk.openadsdk.core.model.bg bgVarBg = com.bytedance.sdk.openadsdk.common.bg.bg("tt_openad_materialMeta").bg(java.lang.String.valueOf(i), false);
            tuvLdr = bgVarBg != null ? bgVarBg.zx() : null;
        } else {
            tuvLdr = ldr(i);
        }
        long jBg = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "material_expiration_time".concat(java.lang.String.valueOf(i)), -1L);
        if (java.lang.System.currentTimeMillis() / 1000 < jBg && tuvLdr != null) {
            return tuvLdr;
        }
        if (tuvLdr != null || jBg != -1) {
            iR(i);
            if (tuvLdr != null) {
                com.bytedance.sdk.openadsdk.component.eqN.bg.bg(tuvLdr);
            }
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV ldr(int i) {
        java.lang.String strIL = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("tt_openad_materialMeta", "material".concat(java.lang.String.valueOf(i)), null);
        if (!android.text.TextUtils.isEmpty(strIL)) {
            try {
                org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(new org.json.JSONObject(strIL));
                if (jSONObjectBg.has("creatives")) {
                    return com.bytedance.sdk.openadsdk.core.model.bg.IL(jSONObjectBg).zx();
                }
                return com.bytedance.sdk.openadsdk.core.IL.bg(jSONObjectBg);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdCacheManager", e.getMessage());
            }
        }
        return null;
    }

    private void IL(com.bytedance.sdk.openadsdk.component.zx.bg bgVar) {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.openadsdk.component.ldr.bg(bgVar), 5);
    }

    public java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv != null && tuv.Dxa() != null && !android.text.TextUtils.isEmpty(tuv.Dxa().VB())) {
            java.lang.String strVB = tuv.Dxa().VB();
            java.lang.String strYDt = tuv.Dxa().yDt();
            if (android.text.TextUtils.isEmpty(strYDt)) {
                strYDt = com.bytedance.sdk.component.utils.zx.bg(strVB);
            }
            java.io.File fileBg = com.bytedance.sdk.openadsdk.component.iR.bg.bg(strYDt);
            if (fileBg.exists() && fileBg.isFile()) {
                return fileBg.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || tuv.lM() == null || tuv.lM().size() == 0 || android.text.TextUtils.isEmpty(tuv.lM().get(0).bg())) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.Lq lq = tuv.lM().get(0);
        return bg(lq.bg(), lq.iR());
    }

    public boolean bg(java.lang.String str, java.lang.String str2) {
        boolean z;
        try {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.zx.bg(str);
            }
            java.io.File fileIL = com.bytedance.sdk.openadsdk.component.iR.bg.IL(str2);
            java.io.InputStream inputStreamBg = com.bytedance.sdk.openadsdk.WR.eqN.bg(str, str2);
            if (inputStreamBg != null) {
                try {
                    inputStreamBg.close();
                } catch (java.io.IOException e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdCacheManager", e.getMessage());
                }
                z = true;
            } else {
                z = false;
            }
            if (z || !(com.bytedance.sdk.openadsdk.WR.eqN.bg(str, str2, fileIL.getParent()) || new java.io.File(fileIL.getPath() + ".0").exists())) {
                return z;
            }
            return true;
        } catch (java.lang.Exception e2) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    public void bg(java.io.File file) {
        try {
            this.IL.bg(file);
        } catch (java.io.IOException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdCacheManager", "trimFileCache fail", e);
        }
    }

    public void iR(int i) {
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad_materialMeta", "material".concat(java.lang.String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "material_expiration_time".concat(java.lang.String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "video_has_cached".concat(java.lang.String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "image_has_cached".concat(java.lang.String.valueOf(i)));
    }

    public void bg() {
        java.io.File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad");
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.io.File cacheDir = this.eqN.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new java.io.FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.ldr.9
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file) {
                    if (file == null) {
                        return false;
                    }
                    java.lang.String name = file.getName();
                    return name.contains("openad_image_cache") || name.contains("openad_video_cache");
                }
            })) == null) {
                return;
            }
            for (java.io.File file : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.ldr.bX(file);
                } catch (java.lang.Throwable unused2) {
                }
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    public java.lang.String IL() {
        java.lang.String name = new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            return name + "/openad_image_cache/";
        }
        return name + "//openad_image_cache/";
    }

    private int bX(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        long jBg = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad", "material_expiration_time" + adSlot.getCodeId(), -1L);
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Integer.valueOf(jBg == -1 ? 0 : 1);
        return jBg == -1 ? 0 : 1;
    }

    private class bg extends com.bytedance.sdk.component.Kg.Kg {
        private final com.bytedance.sdk.openadsdk.component.zx.bg IL;

        public bg(com.bytedance.sdk.openadsdk.component.zx.bg bgVar) {
            super("App Open Ad Write Cache");
            this.IL = bgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
                    com.bytedance.sdk.openadsdk.common.bg.bg("tt_openad_materialMeta").bg(this.IL.IL().VW(), this.IL.bX());
                } else {
                    com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("tt_openad_materialMeta", "material" + this.IL.bg(), com.bytedance.sdk.component.utils.bg.bg(this.IL.IL().ZTq()).toString());
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}

package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
class eqN {
    private static volatile com.bytedance.sdk.openadsdk.component.reward.eqN bg;
    private final android.content.Context IL;
    private final com.bytedance.sdk.openadsdk.common.bg.IL bX;
    private final java.util.Map<com.bytedance.sdk.openadsdk.core.model.tuV, java.lang.Long> eqN = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video").bg(str, tuv);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String strBX = this.bX.bX(str);
        java.lang.String strWaE = tuv != null ? tuv.waE() : "";
        if (android.text.TextUtils.isEmpty(strBX) || android.text.TextUtils.isEmpty(strWaE) || strBX.equals(strWaE)) {
            this.bX.WR(str);
        }
    }

    public void bg() {
        java.io.File[] fileArrListFiles;
        java.io.File[] fileArrListFiles2;
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video").IL();
            return;
        }
        try {
            boolean z = com.bytedance.sdk.openadsdk.core.WR.iR("sp_full_screen_video");
            java.io.File file = new java.io.File(this.IL.getDataDir(), z ? "files" : "shared_prefs");
            if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new java.io.FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.eqN.1
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_full_screen_video");
                    }
                    return false;
                }
            })) != null) {
                for (java.io.File file2 : fileArrListFiles2) {
                    if (z) {
                        try {
                            com.bytedance.sdk.component.utils.ldr.bX(file2);
                        } catch (java.lang.Throwable unused) {
                        }
                    } else {
                        this.IL.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            java.io.File cacheDir = this.IL.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new java.io.FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.eqN.2
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (java.io.File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.ldr.bX(file3);
                } catch (java.lang.Throwable unused3) {
                }
            }
        } catch (java.lang.Throwable unused4) {
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video").bg(adSlot, bgVar);
            return;
        }
        if (bgVar == null || adSlot == null || !android.text.TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        try {
            this.bX.bg(adSlot, bgVar.PX().toString(), bgVar.bg());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static com.bytedance.sdk.openadsdk.component.reward.eqN bg(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.component.reward.eqN.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.component.reward.eqN(context);
                }
            }
        }
        return bg;
    }

    private eqN(android.content.Context context) {
        this.IL = context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context.getApplicationContext();
        this.bX = new com.bytedance.sdk.openadsdk.common.bg.IL("sp_full_screen_video");
    }

    public java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            return com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video").bg(tuv);
        }
        if (tuv == null || tuv.Dxa() == null || android.text.TextUtils.isEmpty(tuv.Dxa().VB())) {
            return null;
        }
        return bg(tuv.Dxa().VB(), tuv.Dxa().yDt(), tuv.uV());
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2, int i) {
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            return com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video").bg(str, str2, i);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.component.utils.zx.bg(str);
        }
        java.io.File fileBg = bg(str2, i);
        if (fileBg == null || !fileBg.exists() || !fileBg.isFile() || fileBg.length() <= 0) {
            return null;
        }
        return fileBg.getAbsolutePath();
    }

    public com.bytedance.sdk.openadsdk.core.model.bg bg(java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.model.bg bgVarIL;
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            com.bytedance.sdk.openadsdk.common.bg bgVarBg = com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video");
            com.bytedance.sdk.openadsdk.core.model.bg bgVarBg2 = bgVarBg.bg(str, 10500000L);
            if (z && bgVarBg2 != null && com.bytedance.sdk.openadsdk.component.reward.zx.IL() == 2 && bgVarBg.bX(str)) {
                return null;
            }
            return bgVarBg2;
        }
        long jZx = this.bX.zx(str);
        boolean zLdr = this.bX.ldr(str);
        boolean zKg = this.bX.Kg(str);
        int iIL = com.bytedance.sdk.openadsdk.component.reward.zx.IL();
        if ((java.lang.System.currentTimeMillis() - jZx < 10500000) && !zLdr && (!z || iIL != 2 || !zKg)) {
            try {
                java.lang.String strIL = this.bX.IL(str);
                if (!android.text.TextUtils.isEmpty(strIL)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(strIL);
                    if (jSONObject.has("cypher")) {
                        jSONObject = com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(jSONObject);
                    }
                    if (jSONObject.has("creatives")) {
                        bgVarIL = com.bytedance.sdk.openadsdk.core.model.bg.IL(jSONObject);
                    } else {
                        com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.core.IL.bg(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.bg bgVar = new com.bytedance.sdk.openadsdk.core.model.bg();
                        bgVar.bg(tuvBg);
                        bgVarIL = bgVar;
                    }
                    if (bgVarIL != null && bgVarIL.eqN()) {
                        java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = bgVarIL.bX().iterator();
                        while (it.hasNext()) {
                            if (!IL(it.next())) {
                                it.remove();
                            }
                        }
                        if (bgVarIL.eqN()) {
                            return bgVarIL;
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    private boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv != null) {
            return com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) || tuv.Dxa() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final boolean z, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final long j, java.lang.String str) {
        java.lang.Long lRemove = this.eqN.remove(tuv);
        final long jElapsedRealtime = lRemove == null ? 0L : android.os.SystemClock.elapsedRealtime() - lRemove.longValue();
        final java.lang.String str2 = z ? "load_video_success" : "load_video_error";
        final java.lang.String str3 = (z || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.yDt.bX.bg(str2, false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.eqN.3
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(str2).IL(com.bytedance.sdk.openadsdk.utils.ayS.bg(z, tuv, jElapsedRealtime, j, str3).toString());
            }
        });
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg<java.lang.Object> interfaceC0128bg) {
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video").bg(tuv, interfaceC0128bg);
            return;
        }
        this.eqN.put(tuv, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        if (tuv.Dxa() == null || android.text.TextUtils.isEmpty(tuv.Dxa().VB())) {
            if (interfaceC0128bg != null) {
                interfaceC0128bg.bg(false, null);
            }
            bg(false, tuv, -1L, null);
        } else {
            java.lang.String strVB = tuv.Dxa().VB();
            java.io.File fileBg = bg(tuv.Dxa().yDt(), tuv.uV());
            com.bytedance.sdk.component.iR.IL.bg bgVarEqN = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().eqN();
            bgVarEqN.IL(strVB);
            bgVarEqN.bg(fileBg.getParent(), fileBg.getName());
            bgVarEqN.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.eqN.4
                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                    if (il.ldr() && il.zx() != null && il.zx().exists()) {
                        com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg interfaceC0128bg2 = interfaceC0128bg;
                        if (interfaceC0128bg2 != null) {
                            interfaceC0128bg2.bg(true, null);
                        }
                        com.bytedance.sdk.openadsdk.component.reward.eqN.this.bg(true, tuv, il.bg(), il.IL());
                        return;
                    }
                    com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg interfaceC0128bg3 = interfaceC0128bg;
                    if (interfaceC0128bg3 != null) {
                        interfaceC0128bg3.bg(false, null);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.eqN.this.bg(false, tuv, il.bg(), il.IL());
                }

                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                    com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg interfaceC0128bg2 = interfaceC0128bg;
                    if (interfaceC0128bg2 != null) {
                        interfaceC0128bg2.bg(false, null);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.eqN.this.bg(false, tuv, -2L, iOException.getMessage());
                }
            });
        }
    }

    private java.io.File bg(java.lang.String str, int i) {
        return new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(i).bg(), str);
    }

    public void bg(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.common.bg.bg()) {
            com.bytedance.sdk.openadsdk.common.bg.bg("sp_full_screen_video").IL(str);
        } else {
            this.bX.iR(str);
        }
    }
}

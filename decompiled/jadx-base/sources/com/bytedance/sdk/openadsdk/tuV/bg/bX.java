package com.bytedance.sdk.openadsdk.tuV.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static volatile com.bytedance.sdk.openadsdk.tuV.bg.bX bg;
    private java.lang.String IL;
    private java.lang.String bX;
    private java.lang.String eqN;
    private final java.util.Set<java.lang.String> zx = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public static com.bytedance.sdk.openadsdk.tuV.bg.bX bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.tuV.bg.bX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.tuV.bg.bX();
                }
            }
        }
        return bg;
    }

    public void bg(java.util.Map<java.lang.String, java.lang.String> map) {
        java.io.File[] fileArrListFiles;
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg() && com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_res_enable", 0) == 1) {
            java.lang.String strLdr = ldr();
            if (!android.text.TextUtils.isEmpty(strLdr)) {
                java.io.File file = new java.io.File(strLdr);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (java.io.File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                java.io.File fileBg = com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg(file2);
                                if (fileBg != null && fileBg.exists()) {
                                    map.put(file2.getName(), fileBg.getAbsolutePath());
                                }
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_res_delay_fetch_time", 0);
            if (iBg <= 0) {
                bX();
            } else {
                com.bytedance.sdk.openadsdk.core.yDt.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bX.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.tuV.bg.bX.this.bX();
                    }
                }, iBg);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX() {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bX.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.tuV.IL.bg bgVarIL = com.bytedance.sdk.openadsdk.tuV.IL.bg.IL(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("pag_plb_config", com.json.ce.v, ""));
                if (bgVarIL != null) {
                    com.bytedance.sdk.openadsdk.tuV.bg.bX.this.bg(bgVarIL, null, 0);
                }
            }
        });
    }

    public void IL() {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg() && com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_res_enable", 0) == 1) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("pag_plb_config", "last_update_time", 0L);
            final java.lang.String strBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_res", "");
            long jBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_res_fetch_interval", com.adjust.sdk.Constants.ONE_HOUR);
            if (jBg <= 0 || jBg > 259200000) {
                jBg = 3600000;
            }
            if (jCurrentTimeMillis < jBg || android.text.TextUtils.isEmpty(strBg)) {
                return;
            }
            int iBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_res_delay_fetch_time", 0);
            if (iBg <= 0) {
                IL(strBg);
            } else {
                com.bytedance.sdk.openadsdk.core.yDt.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bX.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.tuV.bg.bX.this.IL(strBg);
                    }
                }, iBg);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(final java.lang.String str) {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bX.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
                try {
                    ilBX.IL(com.bytedance.sdk.openadsdk.Kg.eqN.bg(ilBX, str));
                    com.bytedance.sdk.component.iR.IL ilBg = ilBX.bg();
                    if (ilBg == null || !ilBg.ldr()) {
                        return;
                    }
                    java.lang.String strEqN = ilBg.eqN();
                    com.bytedance.sdk.openadsdk.tuV.IL.bg bgVarIL = com.bytedance.sdk.openadsdk.tuV.IL.bg.IL(strEqN);
                    com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("pag_plb_config", "last_update_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    if (bgVarIL != null) {
                        com.bytedance.sdk.openadsdk.tuV.IL.bg bgVarIL2 = com.bytedance.sdk.openadsdk.tuV.IL.bg.IL(com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL("pag_plb_config", com.json.ce.v, ""));
                        if (bgVarIL2 == null || !bgVarIL.bg().equals(bgVarIL2.bg())) {
                            com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg("pag_plb_config", com.json.ce.v, strEqN);
                            com.bytedance.sdk.openadsdk.tuV.bg.bX.this.bg(bgVarIL, bgVarIL2, 1);
                        }
                    }
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("PlayableResManager", e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bg(com.bytedance.sdk.openadsdk.tuV.IL.bg bgVar, com.bytedance.sdk.openadsdk.tuV.IL.bg bgVar2, int i) {
        java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> listBX = null;
        bg(bgVar.IL(), bgVar2 == null ? null : bgVar2.IL(), 1, i);
        java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> listBX2 = bgVar.bX();
        if (bgVar2 != null) {
            listBX = bgVar2.bX();
        }
        bg(listBX2, listBX, 2, i);
    }

    private void bg(java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> list, java.util.List<com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg> list2, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.lang.String strZx = i == 1 ? zx() : ldr();
        for (com.bytedance.sdk.openadsdk.tuV.IL.bg.C0165bg c0165bg : list) {
            java.lang.String strBg = c0165bg.bg();
            java.lang.String strBg2 = com.bytedance.sdk.component.zx.bX.bX.bX.bg(strBg);
            if (!android.text.TextUtils.isEmpty(strBg2)) {
                if (i == 1) {
                    strBg2 = strBg2 + bX(strBg);
                }
                java.lang.String str = strBg2;
                java.io.File file = new java.io.File(strZx, str);
                boolean zExists = file.exists();
                if (i2 == 1) {
                    if (zExists && list2 != null && list2.contains(c0165bg)) {
                        java.lang.Object[] objArr = new java.lang.Object[4];
                        java.lang.Integer.valueOf(i);
                        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bX(file);
                    } else {
                        bg(strBg, strZx, str, i, file, zExists);
                    }
                } else if (zExists) {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    java.lang.Integer.valueOf(i);
                } else {
                    bg(strBg, strZx, str, i, file, zExists);
                }
            }
        }
    }

    private void bg(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i, final java.io.File file, final boolean z) {
        java.lang.String strConcat;
        if (this.zx.contains(str)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            return;
        }
        if (i == 2) {
            strConcat = str3 + ".zip";
        } else {
            strConcat = z ? "tmp".concat(java.lang.String.valueOf(str3)) : str3;
        }
        this.zx.add(str);
        com.bytedance.sdk.component.iR.IL.bg bgVarEqN = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().eqN();
        bgVarEqN.IL(str);
        bgVarEqN.bg(str2, strConcat);
        final com.bytedance.sdk.component.iR.IL ilBg = bgVarEqN.bg();
        this.zx.remove(str);
        if (ilBg == null || !ilBg.ldr() || ilBg.zx() == null || !ilBg.zx().exists()) {
            java.io.File file2 = new java.io.File(str2 + java.io.File.separator + str3 + ".tmp");
            if (file2.exists()) {
                try {
                    file2.delete();
                    return;
                } catch (java.lang.Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (i == 2) {
            com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("downloadZip") { // from class: com.bytedance.sdk.openadsdk.tuV.bg.bX.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (z) {
                            file.delete();
                        }
                        java.lang.String str4 = str2 + java.io.File.separator + str3;
                        com.bytedance.sdk.component.utils.Uw.bg(ilBg.zx().getAbsolutePath(), str4);
                        java.io.File file3 = new java.io.File(str4);
                        java.io.File fileBg = com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg(file3);
                        if (fileBg != null && fileBg.exists()) {
                            com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bX().put(file3.getName(), fileBg.getAbsolutePath());
                        }
                        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.IL(file3);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("PlayableResManager", "unzip error: ", th, "tp=", java.lang.Integer.valueOf(i), ", url=", str);
                    }
                    try {
                        ilBg.zx().delete();
                    } catch (java.lang.Throwable unused2) {
                    }
                }
            });
        } else if (z) {
            file.delete();
            ilBg.zx().renameTo(file);
        }
    }

    private static java.lang.String bX(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf == -1 ? "" : "." + str.substring(iLastIndexOf + 1);
    }

    private java.lang.String eqN() {
        if (android.text.TextUtils.isEmpty(this.IL)) {
            try {
                java.io.File file = new java.io.File(com.bytedance.sdk.openadsdk.core.VzQ.bg().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.IL = file.getAbsolutePath();
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("PlayableResManager", "init root path error: ".concat(java.lang.String.valueOf(th)));
            }
        }
        return this.IL;
    }

    private java.lang.String zx() {
        if (android.text.TextUtils.isEmpty(this.bX)) {
            java.lang.String str = eqN() + java.io.File.separator + "common";
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.bX = str;
        }
        return this.bX;
    }

    private java.lang.String ldr() {
        if (android.text.TextUtils.isEmpty(this.eqN)) {
            java.lang.String str = eqN() + java.io.File.separator + "pregames";
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.eqN = str;
        }
        return this.eqN;
    }

    public android.webkit.WebResourceResponse bg(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg() && com.bytedance.sdk.openadsdk.Fy.bg.bg("plb_res_enable", 0) == 1) {
            java.lang.String strBg = com.bytedance.sdk.component.zx.bX.bX.bX.bg(str);
            if (android.text.TextUtils.isEmpty(strBg)) {
                return null;
            }
            java.io.File file = new java.io.File(zx(), strBg + bX(str));
            if (file.exists()) {
                try {
                    return new android.webkit.WebResourceResponse(com.bytedance.sdk.component.utils.yDt.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str), com.adjust.sdk.Constants.ENCODING, new java.io.FileInputStream(file));
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return null;
    }
}

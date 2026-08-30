package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private final android.content.Context bX;
    private final com.bytedance.sdk.openadsdk.common.bg.IL eqN;
    private final java.util.Map<com.bytedance.sdk.openadsdk.core.model.tuV, java.lang.Long> ldr = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.lang.String zx;
    private static final java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.common.bg> bg = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.common.bg.IL> IL = new java.util.HashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0128bg<T> {
        void bg(boolean z, T t);
    }

    private bg(android.content.Context context, java.lang.String str) {
        this.bX = context;
        com.bytedance.sdk.openadsdk.common.bg.IL il = IL.get(str);
        this.eqN = il == null ? new com.bytedance.sdk.openadsdk.common.bg.IL(str) : il;
        this.zx = str;
    }

    public static boolean bg() {
        return com.bytedance.sdk.openadsdk.Fy.bg.bg("material_cache_disk_format", 0) == 1;
    }

    public static com.bytedance.sdk.openadsdk.common.bg bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.common.bg bgVar;
        java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.common.bg> map = bg;
        com.bytedance.sdk.openadsdk.common.bg bgVar2 = map.get(str);
        if (bgVar2 != null) {
            return bgVar2;
        }
        synchronized (com.bytedance.sdk.openadsdk.common.bg.class) {
            bgVar = map.get(str);
            if (bgVar == null) {
                bgVar = new com.bytedance.sdk.openadsdk.common.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str);
                map.put(str, bgVar);
            }
        }
        return bgVar;
    }

    public static void bg(java.lang.String str, com.bytedance.sdk.openadsdk.common.bg.IL il) {
        IL.put(str, il);
    }

    public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String strBX = this.eqN.bX(str);
        java.lang.String strWaE = tuv != null ? tuv.waE() : "";
        if (android.text.TextUtils.isEmpty(strBX) || android.text.TextUtils.isEmpty(strWaE) || strBX.equals(strWaE)) {
            this.eqN.WR(str);
        }
    }

    public void IL() {
        java.io.File[] fileArrListFiles;
        try {
            boolean z = com.bytedance.sdk.openadsdk.core.WR.iR(this.zx);
            java.io.File file = new java.io.File(this.bX.getDataDir(), z ? "files" : "shared_prefs");
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new java.io.FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.bg.1
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(com.bytedance.sdk.openadsdk.common.bg.this.zx);
                    }
                    return false;
                }
            })) != null) {
                for (java.io.File file2 : fileArrListFiles) {
                    if (z) {
                        try {
                            com.bytedance.sdk.component.utils.ldr.bX(file2);
                        } catch (java.lang.Throwable unused) {
                        }
                    } else {
                        this.bX.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            java.io.File file3 = new java.io.File(bX());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.ldr.bX(file3);
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        if (bgVar == null || adSlot == null || !android.text.TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        try {
            this.eqN.bg(adSlot, bgVar.Ta(), bgVar.bg());
        } catch (java.lang.Throwable unused) {
        }
    }

    public java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || tuv.Dxa() == null || android.text.TextUtils.isEmpty(tuv.Dxa().VB())) {
            return null;
        }
        return bg(tuv.Dxa().VB(), tuv.Dxa().yDt(), tuv.uV());
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2, int i) {
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
        com.bytedance.sdk.openadsdk.AdSlot adSlotIL;
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx;
        try {
            java.lang.String strIL = this.eqN.IL(str);
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
                    if (z) {
                        java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = bgVarIL.bX().iterator();
                        while (it.hasNext()) {
                            if (!IL(it.next())) {
                                it.remove();
                            }
                        }
                    }
                    if (bgVarIL.eqN()) {
                        java.lang.String strEqN = this.eqN.eqN(str);
                        if (!android.text.TextUtils.isEmpty(strEqN) && (adSlotIL = com.bytedance.sdk.openadsdk.core.IL.IL(new org.json.JSONObject(strEqN))) != null && (tuvZx = bgVarIL.zx()) != null) {
                            tuvZx.bg(adSlotIL);
                        }
                        return bgVarIL;
                    }
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.model.bg bg(java.lang.String str, long j) {
        long jZx = this.eqN.zx(str);
        boolean zLdr = this.eqN.ldr(str);
        if (!(java.lang.System.currentTimeMillis() - jZx < j) || zLdr) {
            return null;
        }
        return bg(str, true);
    }

    private boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv != null) {
            return com.bytedance.sdk.openadsdk.core.model.rri.VzQ(tuv) || tuv.Dxa() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final boolean z, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final long j, java.lang.String str) {
        java.lang.Long lRemove = this.ldr.remove(tuv);
        final long jElapsedRealtime = lRemove == null ? 0L : android.os.SystemClock.elapsedRealtime() - lRemove.longValue();
        final java.lang.String str2 = z ? "load_video_success" : "load_video_error";
        final java.lang.String str3 = (z || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.yDt.bX.bg(str2, false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.common.bg.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(str2).IL(com.bytedance.sdk.openadsdk.utils.ayS.bg(z, tuv, jElapsedRealtime, j, str3).toString());
            }
        });
    }

    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg<java.lang.Object> interfaceC0128bg) {
        this.ldr.put(tuv, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
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
            bgVarEqN.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.common.bg.3
                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                    if (il.ldr() && il.zx() != null && il.zx().exists()) {
                        com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg interfaceC0128bg2 = interfaceC0128bg;
                        if (interfaceC0128bg2 != null) {
                            interfaceC0128bg2.bg(true, null);
                        }
                        com.bytedance.sdk.openadsdk.common.bg.this.bg(true, tuv, il.bg(), il.IL());
                        return;
                    }
                    com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg interfaceC0128bg3 = interfaceC0128bg;
                    if (interfaceC0128bg3 != null) {
                        interfaceC0128bg3.bg(false, null);
                    }
                    com.bytedance.sdk.openadsdk.common.bg.this.bg(false, tuv, il.bg(), il.IL());
                }

                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                    com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg interfaceC0128bg2 = interfaceC0128bg;
                    if (interfaceC0128bg2 != null) {
                        interfaceC0128bg2.bg(false, null);
                    }
                    com.bytedance.sdk.openadsdk.common.bg.this.bg(false, tuv, -2L, iOException.getMessage());
                }
            });
        }
    }

    private java.io.File bg(java.lang.String str, int i) {
        return new java.io.File(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(i).bg(), str);
    }

    private java.lang.String bX() {
        return com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(0).bg();
    }

    public void IL(java.lang.String str) {
        this.eqN.iR(str);
    }

    public boolean bX(java.lang.String str) {
        return this.eqN.Kg(str);
    }

    public static class IL {
        protected final java.lang.String bg;
        private final java.util.HashSet<java.lang.String> Kg = new java.util.HashSet<>();
        java.lang.String IL = "material_data";
        java.lang.String bX = "has_played";
        java.lang.String eqN = "create_time";
        java.lang.String zx = "in_use_process";
        java.lang.String ldr = "req_id";
        java.lang.String iR = "ad_slot";

        public IL(java.lang.String str) {
            this.bg = android.text.TextUtils.isEmpty(str) ? "" : str;
        }

        protected java.lang.String bg(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.bg + "_cache_" + str;
        }

        public java.lang.String IL(java.lang.String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL(bg(str), this.IL, null);
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        public java.lang.String bX(java.lang.String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL(bg(str), this.ldr, null);
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        public java.lang.String eqN(java.lang.String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL(bg(str), this.iR, null);
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        public long zx(java.lang.String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(bg(str), this.eqN, 0L);
            } catch (java.lang.Throwable unused) {
                return 0L;
            }
        }

        public boolean ldr(java.lang.String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(bg(str), this.bX, true);
            } catch (java.lang.Throwable unused) {
                return true;
            }
        }

        public void iR(java.lang.String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(bg(str), this.zx, com.bytedance.sdk.component.utils.VzQ.IL(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
                this.Kg.add(str);
            } catch (java.lang.Throwable unused) {
            }
        }

        public boolean Kg(java.lang.String str) {
            try {
                java.lang.String strBg = bg(str);
                java.lang.String strIL = com.bytedance.sdk.openadsdk.multipro.eqN.eqN.IL(strBg, this.zx, "");
                if (android.text.TextUtils.isEmpty(strIL)) {
                    return false;
                }
                if (strIL.equals(com.bytedance.sdk.component.utils.VzQ.IL(com.bytedance.sdk.openadsdk.core.VzQ.bg())) && !this.Kg.contains(str)) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(strBg, this.zx, "");
                    return false;
                }
            } catch (java.lang.Throwable unused) {
            }
            return true;
        }

        public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, java.lang.String str, java.lang.String str2) {
            try {
                java.lang.String codeId = adSlot.getCodeId();
                java.lang.String strBg = bg(codeId);
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(strBg, this.bX, java.lang.Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(strBg, this.eqN, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(strBg, this.IL, str);
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(strBg, this.zx, "");
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(strBg, this.ldr, str2);
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(strBg, this.iR, adSlot.toJsonObj().toString());
                this.Kg.remove(codeId);
            } catch (java.lang.Throwable unused) {
            }
        }

        public void WR(java.lang.String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.eqN.eqN.bg(bg(str));
                this.Kg.remove(str);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}

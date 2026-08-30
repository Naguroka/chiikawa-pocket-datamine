package com.bytedance.sdk.component.adexpress.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    static java.lang.Object bg = new java.lang.Object();

    public static void bg() {
        com.bytedance.sdk.component.adexpress.bg.IL.zx.IL();
    }

    public static void IL() {
        try {
            com.bytedance.sdk.component.adexpress.bg.IL.Kg.eqN();
            java.io.File fileKg = com.bytedance.sdk.component.adexpress.bg.IL.zx.Kg();
            if (fileKg == null || !fileKg.exists()) {
                return;
            }
            if (fileKg.getParentFile() != null) {
                com.bytedance.sdk.component.utils.ldr.bX(fileKg.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.ldr.bX(fileKg);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static java.lang.String bX() {
        return com.bytedance.sdk.component.adexpress.bg.IL.ldr.bX();
    }

    public static com.bytedance.sdk.component.adexpress.bg.bX.IL bg(java.lang.String str) {
        return com.bytedance.sdk.component.adexpress.bg.IL.iR.bg().bg(str);
    }

    public static void bg(com.bytedance.sdk.component.adexpress.bg.bX.eqN eqn) {
        com.bytedance.sdk.component.adexpress.bg.IL.iR.bg().bg(eqn, eqn.ldr);
    }

    public static java.util.Set<java.lang.String> IL(java.lang.String str) {
        return com.bytedance.sdk.component.adexpress.bg.IL.iR.bg().IL(str);
    }

    public static com.bytedance.sdk.component.adexpress.bg.bX.IL bX(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.bg.bX.IL ilBg = com.bytedance.sdk.component.adexpress.bg.IL.iR.bg().bg(str);
        if (ilBg != null) {
            ilBg.bg(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            bg(ilBg);
        }
        return ilBg;
    }

    private static void bg(final com.bytedance.sdk.component.adexpress.bg.bX.IL il) {
        com.bytedance.sdk.component.adexpress.eqN.eqN.bg(new com.bytedance.sdk.component.Kg.Kg("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.bg.IL.IL.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (com.bytedance.sdk.component.adexpress.bg.IL.IL.bg) {
                    com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg().bg(il, true);
                }
            }
        }, 10);
    }

    public static com.bytedance.sdk.component.adexpress.bg.bX.bg eqN() {
        return com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().ldr();
    }

    @java.lang.Deprecated
    private static java.lang.String ldr() {
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarEqN = eqN();
        if (bgVarEqN == null) {
            return null;
        }
        return bgVarEqN.eqN();
    }

    public static java.lang.String eqN(java.lang.String str) {
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar;
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarEqN = eqN();
        if (bgVarEqN == null) {
            return null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg = bgVarEqN.bg();
            if (mapBg == null || mapBg.size() <= 0 || (bgVar = mapBg.get(str)) == null) {
                return null;
            }
            return bgVar.eqN();
        }
        return ldr();
    }

    public static boolean zx() {
        return com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().zx();
    }

    public static com.bytedance.sdk.component.adexpress.bg.IL.bg bg(java.lang.String str, com.bytedance.sdk.component.adexpress.eqN.eo.bg bgVar, java.lang.String str2, java.lang.String str3) {
        java.io.File fileLdr;
        com.bytedance.sdk.component.adexpress.bg.IL.bg bgVar2 = new com.bytedance.sdk.component.adexpress.bg.IL.bg();
        if (android.text.TextUtils.isEmpty(str3)) {
            fileLdr = null;
        } else {
            fileLdr = IL(str3, str);
            if (fileLdr != null) {
                bgVar2.bg(1);
            }
        }
        if (fileLdr == null && (fileLdr = iR(str)) != null) {
            bgVar2.bg(3);
        }
        if (fileLdr == null && (fileLdr = ldr(str)) != null) {
            bgVar2.bg(2);
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            if (!bg(str, str3)) {
                bgVar2.bg(4);
            }
        } else if (!zx(str)) {
            bgVar2.bg(6);
        }
        bgVar2.IL();
        if (fileLdr != null) {
            try {
                bgVar2.bg(new android.webkit.WebResourceResponse(bgVar.bg(), com.json.zb.N, new java.io.FileInputStream(fileLdr)));
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTDynamic", "get html WebResourceResponse error", th);
            }
        }
        return bgVar2;
    }

    private static boolean bg(java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarEqN;
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar;
        if (!zx() || (bgVarEqN = eqN()) == null) {
            return false;
        }
        java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg = bgVarEqN.bg();
        if (mapBg.size() == 0 || (bgVar = mapBg.get(str2)) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : bgVar.ldr()) {
            if (c0104bg != null && android.text.TextUtils.equals(str, c0104bg.bg())) {
                return true;
            }
        }
        return false;
    }

    private static boolean zx(java.lang.String str) {
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarEqN;
        java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg> listLdr;
        if (!zx() || (bgVarEqN = eqN()) == null || (listLdr = bgVarEqN.ldr()) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : listLdr) {
            if (c0104bg != null && android.text.TextUtils.equals(str, c0104bg.bg())) {
                return true;
            }
        }
        return false;
    }

    private static java.io.File ldr(java.lang.String str) {
        if (!zx()) {
            return null;
        }
        for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : eqN().ldr()) {
            if (c0104bg.bg() != null && c0104bg.bg().equals(str)) {
                java.io.File file = new java.io.File(com.bytedance.sdk.component.adexpress.bg.IL.zx.Kg(), com.bytedance.sdk.component.utils.zx.bg(c0104bg.bg()));
                java.lang.String strBg = com.bytedance.sdk.component.utils.zx.bg(file);
                if (c0104bg.IL() == null || !c0104bg.IL().equals(strBg)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    private static java.io.File iR(java.lang.String str) {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> listIL;
        com.bytedance.sdk.component.adexpress.bg.bX.bg.IL ilZx = eqN().zx();
        if (ilZx == null || (listIL = ilZx.IL()) == null || listIL.size() <= 0) {
            return null;
        }
        for (android.util.Pair<java.lang.String, java.lang.String> pair : listIL) {
            if (pair.second != null && ((java.lang.String) pair.second).equals(str)) {
                return new java.io.File(com.bytedance.sdk.component.adexpress.bg.IL.zx.Kg(), (java.lang.String) pair.first);
            }
        }
        return null;
    }

    private static java.io.File IL(java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVar;
        com.bytedance.sdk.component.adexpress.bg.bX.bg bgVarEqN = eqN();
        if (bgVarEqN == null || !zx()) {
            return null;
        }
        java.util.Map<java.lang.String, com.bytedance.sdk.component.adexpress.bg.bX.bg> mapBg = bgVarEqN.bg();
        if (mapBg.size() == 0 || (bgVar = mapBg.get(str)) == null) {
            return null;
        }
        for (com.bytedance.sdk.component.adexpress.bg.bX.bg.C0104bg c0104bg : bgVar.ldr()) {
            if (c0104bg.bg() != null && c0104bg.bg().equals(str2)) {
                java.io.File file = new java.io.File(com.bytedance.sdk.component.adexpress.bg.IL.zx.Kg(), com.bytedance.sdk.component.utils.zx.bg(c0104bg.bg()));
                java.lang.String strBg = com.bytedance.sdk.component.utils.zx.bg(file);
                if (c0104bg.IL() == null || !c0104bg.IL().equals(strBg)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean bg(org.json.JSONObject jSONObject) {
        java.lang.Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || android.text.TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    public static boolean IL(org.json.JSONObject jSONObject) {
        java.lang.Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || android.text.TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    public static boolean bX(org.json.JSONObject jSONObject) {
        java.lang.Object objOpt;
        if (jSONObject == null) {
            return false;
        }
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null || (objOpt = jSONObjectOptJSONObject.opt("template_Plugin")) == null || android.text.TextUtils.isEmpty(objOpt.toString())) {
                        return false;
                    }
                }
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }
}

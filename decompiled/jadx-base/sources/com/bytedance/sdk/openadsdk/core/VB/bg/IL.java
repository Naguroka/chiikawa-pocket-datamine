package com.bytedance.sdk.openadsdk.core.VB.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static volatile com.bytedance.sdk.openadsdk.core.VB.bg.IL bg;

    public interface bg {
        void bg(int i, java.lang.String str, java.lang.String str2);

        void bg(org.json.JSONObject jSONObject, java.lang.String str);
    }

    public static com.bytedance.sdk.openadsdk.core.VB.bg.IL bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.VB.bg.IL.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.core.VB.bg.IL();
                }
            }
        }
        return bg;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.VB.ldr.bg bgVar, java.lang.String str) {
        if (bgVar == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(bgVar.bg())) {
            com.bytedance.sdk.component.utils.PX.bg("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        final java.lang.String str2 = str + "_" + bgVar.bg();
        final java.lang.String strBX = bgVar.bX();
        final java.lang.String strIL = bgVar.IL();
        final java.lang.String strEqN = bgVar.eqN();
        java.lang.String strZx = bgVar.zx();
        if (android.text.TextUtils.isEmpty(strZx)) {
            if (str.equals("ad")) {
                strZx = com.bytedance.sdk.openadsdk.core.WR.IL().eqN();
            } else if (str.equals("adv3")) {
                strZx = com.bytedance.sdk.openadsdk.core.WR.IL().eqN() + "_v3";
            }
        }
        final java.lang.String str3 = strZx;
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.IL.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.VB.bg.IL.this.bg(str2, strBX, strIL, strEqN, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (bg(str, str3) != null) {
            if (android.text.TextUtils.isEmpty(str4) || android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            IL(str2, str3, str5, str4, str);
            return;
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            bg(str2, str, str3, str5, (com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg) null);
        } else {
            IL(str2, str3, str5, str4, str);
        }
    }

    public void bg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg bgVar) {
        if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
            if (bgVar != null) {
                bgVar.bg(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        java.lang.String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVarBg = bg(str6, str4);
        if (bgVarBg == null || android.text.TextUtils.isEmpty(bgVarBg.zx())) {
            bg(str2, str6, str4, str5, new com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.IL.2
                @Override // com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg
                public void bg(org.json.JSONObject jSONObject, java.lang.String str7) {
                    com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg bgVar2 = bgVar;
                    if (bgVar2 != null) {
                        bgVar2.bg(jSONObject, str7);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg
                public void bg(int i, java.lang.String str7, java.lang.String str8) {
                    com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg bgVar2 = bgVar;
                    if (bgVar2 != null) {
                        bgVar2.bg(i, str7, str8);
                    }
                }
            });
            return;
        }
        bg(bgVarBg);
        if (bgVar != null) {
            try {
                bgVar.bg(new org.json.JSONObject(bgVarBg.zx()), "local");
            } catch (org.json.JSONException unused) {
                bgVar.bg(2, "parse json exception data is " + bgVarBg.zx(), "local");
            }
        }
    }

    private void bg(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg bgVar) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            if (bgVar != null) {
                bgVar.bg(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
            ilBX.IL(str);
            ilBX.bg(7);
            ilBX.bg("load_ug_t");
            ilBX.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.IL.3
                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                    if (il == null) {
                        return;
                    }
                    if (il.ldr()) {
                        java.lang.String strEqN = il.eqN();
                        if (android.text.TextUtils.isEmpty(strEqN)) {
                            com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg bgVar2 = bgVar;
                            if (bgVar2 != null) {
                                bgVar2.bg(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.VB.bg.bX.bg().bg(new com.bytedance.sdk.openadsdk.core.VB.bg.bg().bg(str2).IL(str3).bX(str).zx(str4).eqN(strEqN).bg(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
                        com.bytedance.sdk.openadsdk.core.VB.bg.IL.this.IL();
                        if (bgVar != null) {
                            try {
                                bgVar.bg(new org.json.JSONObject(strEqN), "net");
                                return;
                            } catch (org.json.JSONException unused) {
                                bgVar.bg(2, "parse json exception data is".concat(java.lang.String.valueOf(strEqN)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg bgVar3 = bgVar;
                    if (bgVar3 != null) {
                        bgVar3.bg(3, "net code error code is " + il.bg() + " message is " + il.IL(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                    com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg bgVar2 = bgVar;
                    if (bgVar2 != null) {
                        bgVar2.bg(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public java.util.Set<com.bytedance.sdk.openadsdk.core.VB.bg.bg> bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return com.bytedance.sdk.openadsdk.core.VB.bg.bX.bg().bg(str);
    }

    public java.lang.String bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVarBg = bg(str + "_" + str2, str3);
        if (bgVarBg == null) {
            return null;
        }
        bg(bgVarBg);
        return bgVarBg.zx();
    }

    private com.bytedance.sdk.openadsdk.core.VB.bg.bg bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        return com.bytedance.sdk.openadsdk.core.VB.bg.bX.bg().bg(str, str2);
    }

    private void IL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar = new com.bytedance.sdk.openadsdk.core.VB.bg.bg();
        bgVar.bX(str).zx(str3).eqN(str4).IL(str2).bg(str5).bg(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.core.VB.bg.bX.bg().bg(bgVar);
        IL();
    }

    private void bg(final com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar) {
        bgVar.bg(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.IL.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.VB.bg.bX.bg().bg(bgVar);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL() {
        int iEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eqN();
        if (iEqN <= 0) {
            iEqN = 100;
        }
        java.util.List<com.bytedance.sdk.openadsdk.core.VB.bg.bg> listIL = com.bytedance.sdk.openadsdk.core.VB.bg.bX.bg().IL();
        if (listIL == null || listIL.isEmpty() || iEqN >= listIL.size()) {
            if (listIL == null) {
                return;
            }
            listIL.size();
            return;
        }
        int size = (int) (listIL.size() - (iEqN * 0.75f));
        if (size <= 0) {
            return;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar : listIL) {
            treeMap.put(bgVar.eqN(), bgVar);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.VB.bg.bg bgVar2 = (com.bytedance.sdk.openadsdk.core.VB.bg.bg) entry.getValue();
                if (bgVar2 != null) {
                    hashSet.add(bgVar2.bg());
                }
            }
        }
        bg(hashSet);
    }

    public void bg(java.util.Set<java.lang.String> set) {
        try {
            com.bytedance.sdk.openadsdk.core.VB.bg.bX.bg().bg(set);
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }
}

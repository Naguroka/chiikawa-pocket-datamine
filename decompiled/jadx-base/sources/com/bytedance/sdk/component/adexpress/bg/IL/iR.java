package com.bytedance.sdk.component.adexpress.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    private static volatile com.bytedance.sdk.component.adexpress.bg.IL.iR bg;
    private java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static com.bytedance.sdk.component.adexpress.bg.IL.iR bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.component.adexpress.bg.IL.iR.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.component.adexpress.bg.IL.iR();
                }
            }
        }
        return bg;
    }

    private iR() {
    }

    public com.bytedance.sdk.component.adexpress.bg.bX.IL bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg().bg(str);
    }

    public java.util.Set<java.lang.String> IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg().IL(str);
    }

    private void IL() {
        if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() == null) {
            return;
        }
        int iBg = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().bg();
        if (iBg <= 0) {
            iBg = 100;
        }
        java.util.List<com.bytedance.sdk.component.adexpress.bg.bX.IL> listIL = com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg().IL();
        if (listIL == null || listIL.isEmpty() || iBg >= listIL.size()) {
            if (listIL == null) {
                return;
            }
            listIL.size();
            return;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (com.bytedance.sdk.component.adexpress.bg.bX.IL il : listIL) {
            treeMap.put(il.iR(), il);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int size = (int) (listIL.size() - (iBg * 0.75f));
        int i = 0;
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((java.lang.Long) entry.getKey()).longValue();
                com.bytedance.sdk.component.adexpress.bg.bX.IL il2 = (com.bytedance.sdk.component.adexpress.bg.bX.IL) entry.getValue();
                if (il2 != null) {
                    hashSet.add(il2.IL());
                }
            }
        }
        bg(hashSet);
        this.IL.set(false);
    }

    private org.json.JSONObject bX(java.lang.String str) {
        com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
        if (bXVarBX == null) {
            return null;
        }
        com.bytedance.sdk.component.iR.IL.IL ilIR = bXVarBX.iR();
        ilIR.IL(str);
        com.bytedance.sdk.component.iR.IL ilBg = ilIR.bg();
        if (ilBg != null) {
            try {
                if (ilBg.ldr() && ilBg.eqN() != null) {
                    return new org.json.JSONObject(ilBg.eqN());
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public void bg(com.bytedance.sdk.component.adexpress.bg.bX.eqN eqn, java.lang.String str) {
        if (eqn == null) {
            com.bytedance.sdk.component.utils.PX.bg("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final java.lang.String str2 = eqn.bg;
        final java.lang.String str3 = eqn.bX;
        final java.lang.String str4 = eqn.IL;
        final java.lang.String str5 = eqn.eqN;
        final java.lang.String str6 = eqn.zx;
        final java.lang.String strKg = android.text.TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() != null ? com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().Kg() : "" : str;
        if (android.text.TextUtils.isEmpty(str2)) {
            com.bytedance.sdk.component.utils.PX.bg("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.adexpress.eqN.eqN.bg(new com.bytedance.sdk.component.Kg.Kg("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.bg.IL.iR.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.adexpress.bg.IL.iR.this.bg(str2, str3, str4, str5, str6, strKg);
                }
            }, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (bg(str) != null) {
            if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str3)) {
                IL(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (android.text.TextUtils.isEmpty(str4) || android.text.TextUtils.isEmpty(str3)) {
            bg(str2, str6, str);
        } else {
            IL(str6, str, str3, str2, str4, str5);
        }
        boolean zBg = com.bytedance.sdk.component.adexpress.bg.IL.Kg.bg(str5);
        if (!com.bytedance.sdk.component.adexpress.bg.IL.IL.zx() || zBg) {
            com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().bg(true);
        }
    }

    private void bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObjectBX;
        if (android.text.TextUtils.isEmpty(str) || (jSONObjectBX = bX(str)) == null) {
            return;
        }
        java.lang.String strOptString = jSONObjectBX.optString("md5");
        java.lang.String strOptString2 = jSONObjectBX.optString("version");
        java.lang.String strOptString3 = jSONObjectBX.optString("data");
        if (android.text.TextUtils.isEmpty(strOptString) || android.text.TextUtils.isEmpty(strOptString2) || android.text.TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.bg.bX.IL ilBg = new com.bytedance.sdk.component.adexpress.bg.bX.IL().bg(str2).IL(str3).bX(strOptString).eqN(str).zx(strOptString3).ldr(strOptString2).bg(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg().bg(ilBg, false);
        IL();
        if (com.bytedance.sdk.component.adexpress.bg.IL.Kg.bg(strOptString2)) {
            ilBg.ldr(strOptString2);
            com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().bg(true);
        }
    }

    private void IL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg().bg(new com.bytedance.sdk.component.adexpress.bg.bX.IL().bg(str).IL(str2).bX(str3).eqN(str4).zx(str5).ldr(str6).bg(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), false);
        IL();
    }

    public void bg(java.util.Set<java.lang.String> set) {
        try {
            com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg().bg(set);
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }
}

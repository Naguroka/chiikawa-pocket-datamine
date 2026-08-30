package com.bytedance.sdk.openadsdk.VzQ.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx implements com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr {
    public static java.lang.Boolean bg;
    private static java.lang.Boolean ldr;
    protected com.bytedance.sdk.openadsdk.core.model.bX IL;
    protected com.bytedance.sdk.openadsdk.core.model.tuV bX;
    protected java.lang.String eqN;
    private final java.lang.ref.WeakReference<android.content.Context> iR;
    protected int zx;

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public void bg(boolean z) {
    }

    public zx(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        this.iR = new java.lang.ref.WeakReference<>(context);
        this.bX = tuv;
        this.IL = tuv.RiO();
        this.eqN = str;
        java.lang.Object[] objArr = new java.lang.Object[2];
        "====tag===".concat(java.lang.String.valueOf(str));
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            com.bytedance.sdk.openadsdk.core.VzQ.IL(context);
        }
    }

    public static boolean bg(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (!android.text.TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, str3, "store_open", (org.json.JSONObject) null);
                return true;
            } catch (java.lang.Throwable unused) {
            }
        }
        if (context != null && str2 != null && !android.text.TextUtils.isEmpty(str2)) {
            try {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                android.net.Uri uri = android.net.Uri.parse("market://details?id=".concat(java.lang.String.valueOf(str2)));
                intent2.setData(uri);
                java.util.Iterator<android.content.pm.ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof android.app.Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.eqN.bX.IL(tuv, str3, "store_open", (org.json.JSONObject) null);
                        return true;
                    }
                }
                return false;
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    private static boolean iR() {
        if (ldr == null) {
            ldr = java.lang.Boolean.valueOf(com.bytedance.sdk.openadsdk.utils.ayS.Kg(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
        }
        return ldr.booleanValue();
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, android.content.Context context, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map) {
        android.content.Intent intentBg;
        if (tuv != null && tuv.FFy() == 0) {
            return false;
        }
        try {
            if (android.text.TextUtils.isEmpty(str) || (intentBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(context, str)) == null) {
                return false;
            }
            intentBg.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof android.app.Activity)) {
                intentBg.addFlags(268435456);
            }
            context.startActivity(intentBg);
            if (map == null) {
                map = new java.util.HashMap<>();
            }
            if (tuv != null && tuv.OLh() == 0) {
                map.put("auto_click", java.lang.Boolean.valueOf(!tuv.eqN()));
            }
            map.put("can_query_install", java.lang.Integer.valueOf(iR() ? 1 : 0));
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str2, "click_open", map);
            return true;
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public void bg(int i) {
        this.zx = i;
    }

    public boolean bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return bg(context, str, str2, this.eqN, this.bX);
    }

    protected android.content.Context IL() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.iR;
        return (weakReference == null || weakReference.get() == null) ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : this.iR.get();
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public void eqN() {
        if (IL() == null) {
            return;
        }
        if (bX()) {
            this.bX.bX(true);
            return;
        }
        if (bg()) {
            this.bX.bX(true);
            return;
        }
        if (ldr()) {
            return;
        }
        if (zx()) {
            this.bX.bX(true);
        } else {
            if (this.bX.RiO() != null || this.bX.GvG() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.VJ.bg(IL(), this.bX.GvG(), this.bX, com.bytedance.sdk.openadsdk.utils.ayS.bg(this.eqN), this.eqN, true);
            this.bX.bX(true);
        }
    }

    public boolean bX() {
        com.bytedance.sdk.openadsdk.core.eqN.bg(this.bX, this.eqN, 1, null);
        com.bytedance.sdk.openadsdk.core.model.VB vbDt = this.bX.Dt();
        if (vbDt == null) {
            com.bytedance.sdk.openadsdk.core.eqN.bg(this.bX, this.eqN, -1, null);
            return false;
        }
        java.util.HashMap map = new java.util.HashMap();
        bg(map);
        java.lang.String strBg = vbDt.bg();
        android.content.Context contextIL = IL();
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg(contextIL, strBg, tuv, com.bytedance.sdk.openadsdk.utils.ayS.IL(tuv), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.bX, this.eqN, "open_fallback_url", map);
        return false;
    }

    private void bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (tuv != null && tuv.OLh() == 0) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.bX;
            map.put("auto_click", java.lang.Boolean.valueOf((tuv2 == null || tuv2.eqN()) ? false : true));
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv3 = this.bX;
        if (tuv3 != null && tuv3.OLh() == 0) {
            map.put("dpl_probability_jump", java.lang.Boolean.valueOf(this.zx >= 11));
        }
        map.put("can_query_install", java.lang.Integer.valueOf(iR() ? 1 : 0));
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public boolean zx() {
        return this.IL != null && bg(IL(), this.IL.bg(), this.IL.bX());
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public boolean bg() {
        if (this.IL == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (tuv != null && tuv.FFy() == 0) {
            return false;
        }
        java.lang.String strBX = this.IL.bX();
        if (android.text.TextUtils.isEmpty(strBX)) {
            return false;
        }
        android.content.Context contextIL = IL();
        if (iR() && !com.bytedance.sdk.openadsdk.utils.ayS.IL(contextIL, strBX)) {
            return false;
        }
        return bg(this.bX, strBX, contextIL, this.eqN, new java.util.HashMap());
    }

    public boolean ldr() {
        com.bytedance.sdk.openadsdk.core.model.tC tCVarFW;
        com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver iPMiBroadcastReceiverBg;
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
            if (tuv == null || (tCVarFW = tuv.fW()) == null || android.text.TextUtils.isEmpty(tCVarFW.IL())) {
                return false;
            }
            if (tCVarFW.bg() && this.bX.RiO() != null && !android.text.TextUtils.isEmpty(this.bX.RiO().bX()) && (iPMiBroadcastReceiverBg = com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(IL())) != null) {
                iPMiBroadcastReceiverBg.bg(this.bX.RiO().bX(), this.bX);
            }
            android.content.Context contextIL = IL();
            java.lang.String strIL = tCVarFW.IL();
            com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.bX;
            final boolean zBg = com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg(contextIL, strIL, tuv2, com.bytedance.sdk.openadsdk.utils.ayS.IL(tuv2), null, true);
            com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.VzQ.bg.bg.zx.1
                @Override // java.lang.Runnable
                public void run() {
                    if (zBg) {
                        com.bytedance.sdk.openadsdk.core.WR.bg("oem_store", "1");
                    } else {
                        com.bytedance.sdk.openadsdk.core.WR.bg("oem_store", "-2");
                    }
                }
            });
            return zBg;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GPDownLoader", th.getMessage());
            return false;
        }
    }
}

package com.bytedance.sdk.openadsdk.VzQ.bg.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN implements com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr {
    protected com.bytedance.sdk.openadsdk.core.model.tuV IL;
    protected java.lang.String bX;
    protected com.bytedance.sdk.openadsdk.core.model.bX bg;
    private final java.lang.ref.WeakReference<android.content.Context> iR;
    protected int ldr;
    protected boolean eqN = false;
    protected final java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private boolean Kg = false;

    public eqN(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        this.iR = new java.lang.ref.WeakReference<>(context);
        this.IL = tuv;
        this.bg = tuv.RiO();
        this.bX = str;
        java.lang.Object[] objArr = new java.lang.Object[2];
        "====tag===".concat(java.lang.String.valueOf(str));
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            com.bytedance.sdk.openadsdk.core.VzQ.IL(context);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public void bg(boolean z) {
        this.Kg = z;
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public void bg(int i) {
        this.ldr = i;
    }

    public boolean bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return bg(context, str, str2, this.bX, this.IL);
    }

    public static boolean bg(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg()) {
            return com.bytedance.sdk.openadsdk.VzQ.bg.bg.zx.bg(context, str, str2, str3, tuv);
        }
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

    protected android.content.Context bX() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.iR;
        return (weakReference == null || weakReference.get() == null) ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : this.iR.get();
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public void eqN() {
        if (bX() == null) {
            return;
        }
        if (IL()) {
            this.zx.set(true);
            this.IL.bX(true);
            return;
        }
        if (bg()) {
            this.IL.bX(true);
            return;
        }
        if (ldr()) {
            return;
        }
        if (zx()) {
            this.IL.bX(true);
        } else {
            if (this.IL.RiO() != null || this.IL.GvG() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.VJ.bg(bX(), this.IL.GvG(), this.IL, com.bytedance.sdk.openadsdk.utils.ayS.bg(this.bX), this.bX, true);
            this.IL.bX(true);
        }
    }

    public boolean IL() {
        com.bytedance.sdk.openadsdk.core.eqN.bg(this.IL, this.bX, 1, null);
        if (this.IL.Dt() != null) {
            java.lang.String strBg = this.IL.Dt().bg();
            if (!android.text.TextUtils.isEmpty(strBg)) {
                android.net.Uri uri = android.net.Uri.parse(strBg);
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.setData(uri);
                com.bytedance.sdk.openadsdk.utils.ayS.IL IL = com.bytedance.sdk.openadsdk.utils.ayS.IL(bX(), intent);
                if (IL.IL > 0) {
                    if (!(bX() instanceof android.app.Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
                        bg(map);
                        map.put("matched_count", java.lang.Integer.valueOf(IL.IL));
                        map.put("url", strBg);
                        if (IL.bg != null) {
                            intent.setComponent(IL.bg);
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.IL, this.bX, "open_url_app", map);
                        bX().startActivity(intent);
                        com.bytedance.sdk.openadsdk.eqN.PX.bg().bg(map).bg(this.IL, this.bX);
                        com.bytedance.sdk.openadsdk.eqN.bX.bg("dp_start_act_success", this.IL, this.bX, map);
                        return true;
                    } catch (java.lang.Throwable th) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("exception", th.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (java.lang.Exception unused) {
                        }
                        com.bytedance.sdk.openadsdk.core.eqN.bg(this.IL, this.bX, -4, jSONObject);
                    }
                } else {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("intent", intent.toString());
                        jSONObject2.put("can_query_install", 1);
                    } catch (java.lang.Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.eqN.bg(this.IL, this.bX, -3, jSONObject2);
                }
            } else {
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
                com.bytedance.sdk.openadsdk.core.eqN.bg(tuv, this.bX, -2, tuv.Dt().eqN());
            }
            if (this.eqN && !this.zx.get()) {
                return false;
            }
            this.eqN = true;
            java.util.Map<java.lang.String, java.lang.Object> map2 = new java.util.HashMap<>();
            bg(map2);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.IL, this.bX, "open_fallback_url", map2);
            return false;
        }
        com.bytedance.sdk.openadsdk.core.eqN.bg(this.IL, this.bX, -1, null);
        return false;
    }

    private void bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv != null && tuv.OLh() == 0) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.IL;
            map.put("auto_click", java.lang.Boolean.valueOf((tuv2 == null || tuv2.eqN()) ? false : true));
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv3 = this.IL;
        if (tuv3 != null && tuv3.OLh() == 0) {
            map.put("dpl_probability_jump", java.lang.Boolean.valueOf(this.ldr >= 11));
        }
        map.put("can_query_install", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public boolean zx() {
        this.zx.set(true);
        return this.bg != null && bg(bX(), this.bg.bg(), this.bg.bX());
    }

    @Override // com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr
    public boolean bg() {
        android.content.Intent intentBg;
        if (this.bg == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
        if (tuv != null && tuv.FFy() == 0) {
            return false;
        }
        java.lang.String strBX = this.bg.bX();
        if (android.text.TextUtils.isEmpty(strBX) || !com.bytedance.sdk.openadsdk.utils.ayS.IL(bX(), strBX) || (intentBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(bX(), strBX)) == null) {
            return false;
        }
        intentBg.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            bX().startActivity(intentBg);
            java.util.HashMap map = new java.util.HashMap();
            bg(map);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.IL, this.bX, "click_open", map);
            return true;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GPDownLoader", th.getMessage());
            return false;
        }
    }

    public boolean ldr() {
        com.bytedance.sdk.openadsdk.core.model.tC tCVarFW;
        com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver iPMiBroadcastReceiverBg;
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
            if (tuv == null || (tCVarFW = tuv.fW()) == null || android.text.TextUtils.isEmpty(tCVarFW.IL())) {
                return false;
            }
            if (tCVarFW.bg() && this.IL.RiO() != null && !android.text.TextUtils.isEmpty(this.IL.RiO().bX()) && (iPMiBroadcastReceiverBg = com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(bX())) != null) {
                iPMiBroadcastReceiverBg.bg(this.IL.RiO().bX(), this.IL);
            }
            final boolean zBg = com.bytedance.sdk.openadsdk.VzQ.bg.bg.IL.bg(bX(), tCVarFW.IL(), this.IL);
            com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN.1
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

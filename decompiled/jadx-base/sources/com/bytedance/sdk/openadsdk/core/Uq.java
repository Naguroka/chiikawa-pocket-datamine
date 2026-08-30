package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class Uq implements com.bytedance.sdk.openadsdk.core.Uw {
    private static final java.util.Map<java.lang.Integer, java.lang.String> zx = new java.util.HashMap<java.lang.Integer, java.lang.String>(12) { // from class: com.bytedance.sdk.openadsdk.core.Uq.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, com.json.ce.K0);
            put(4, "apk-sign");
            put(5, "app_set_id_scope");
            put(6, "app_set_id");
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, "vendor");
            put(10, com.json.ce.v);
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, "url");
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, "screen_height");
            put(22, "screen_width");
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, "os_version");
            put(26, "conn_type");
            put(27, "boot");
            put(28, "feature_data");
        }
    };
    boolean bg = false;
    boolean IL = false;
    java.lang.String bX = "com.union_test.internationad";
    java.lang.String eqN = "8025677";
    private int ldr = 0;

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public java.lang.String eqN() {
        return com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    /* JADX INFO: renamed from: eqN, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.core.Uq bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.WR.IL().bg(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    /* JADX INFO: renamed from: zx, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.core.Uq IL(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.WR.IL().bX(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public com.bytedance.sdk.openadsdk.core.Uw bg(int i) {
        com.bytedance.sdk.openadsdk.core.WR.IL().zx(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public com.bytedance.sdk.openadsdk.core.Uw bg() {
        com.bytedance.sdk.component.utils.PX.bg("PangleSDK-6406");
        com.bykv.vk.openvk.bg.bg.bg.iR.bX.bg("PangleSDK-6406");
        com.bytedance.sdk.component.utils.PX.IL();
        com.bytedance.sdk.component.iR.bg.bg();
        com.bykv.vk.openvk.bg.bg.bg.iR.bX.bg();
        com.bytedance.sdk.openadsdk.utils.LZ.bg();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public com.bytedance.sdk.openadsdk.core.Uw IL(int i) {
        com.bytedance.sdk.openadsdk.core.WR.IL().IL(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public int IL() {
        return com.bytedance.sdk.openadsdk.core.WR.IL().Kg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public com.bytedance.sdk.openadsdk.core.Uw bX(int i) {
        com.bytedance.sdk.openadsdk.core.WR.IL().bX(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public int bX() {
        return com.bytedance.sdk.openadsdk.core.WR.IL().WR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public java.lang.String zx() {
        return bX((java.lang.String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public java.lang.String bX(java.lang.String str) {
        int size;
        com.bytedance.sdk.openadsdk.utils.ayS.eo("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.WR.bX.bg();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z = true;
            jSONObject.put("is_init", com.bytedance.sdk.openadsdk.core.yDt.zx() ? 1 : 0);
            java.lang.String strEo = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo();
            java.lang.String strFy = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Fy();
            if (strEo != null && strFy != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("version", strEo);
                jSONObject2.put("param", strFy);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("ad_sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            jSONObject.put(com.ironsource.y8.h.V, com.bytedance.sdk.openadsdk.utils.ayS.zx());
            jSONObject.put("user_data", com.bytedance.sdk.openadsdk.core.LZ.bg(android.text.TextUtils.isEmpty(str) ? null : new com.bytedance.sdk.openadsdk.AdSlot.Builder().setCodeId(str).build()));
            jSONObject.put("ts", java.lang.System.currentTimeMillis() / 1000);
            if (jSONObject.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.ldr ldrVarEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
                if (ldrVarEqN.DDQ(com.json.ce.K0)) {
                    jSONObject.put(com.json.ce.K0, com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL());
                }
                android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
                jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.IL.iR());
                jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.eqN.IL());
                jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.eqN.bX());
                jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.eqN.eqN());
                jSONObject.put("app_running_time", (java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.core.yDt.bg()) / 1000);
                jSONObject.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IEI() ? 1 : 0);
                jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.Kg.PX.IL());
                jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.Kg.PX.bX());
                jSONObject.put("vendor", android.os.Build.MANUFACTURER);
                jSONObject.put(com.json.ce.v, android.os.Build.MODEL);
                jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.ayS.IL());
                jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.ayS.bX());
                jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.PX.IL(contextBg));
                jSONObject.put("screen_height", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(contextBg));
                jSONObject.put("screen_width", com.bytedance.sdk.openadsdk.utils.ZQc.bX(contextBg));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.JAA.bg());
                jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.Uw.bg());
                jSONObject.put("os_version", android.os.Build.VERSION.RELEASE);
                jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.ayS.PX(contextBg));
                if (ldrVarEqN.DDQ("boot")) {
                    jSONObject.put("boot", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime()));
                }
                com.bytedance.sdk.openadsdk.utils.ayS.bg(jSONObject);
                com.bytedance.sdk.openadsdk.core.WR.bX.bg(jSONObject);
                size = zx.size();
            } else {
                size = 2;
            }
            while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(zx.get(java.lang.Integer.valueOf(size)));
                size--;
            }
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg(jSONObject);
            if (!com.bytedance.sdk.openadsdk.core.settings.xxp.JxS() || !com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN)) {
                z = false;
            }
            org.json.JSONObject jSONObjectBg = bg(jSONObject, z);
            while (size > 0 && jSONObjectBg.toString().getBytes().length > 4096) {
                jSONObject.remove(zx.get(java.lang.Integer.valueOf(size)));
                jSONObjectBg = bg(jSONObject, z);
                size--;
            }
            if (com.bytedance.sdk.component.utils.PX.eqN()) {
                new java.lang.StringBuilder("bidding token: ").append(jSONObjectBg).append("\nbidding token length: ");
                int length = jSONObjectBg.toString().getBytes().length;
            }
            new java.lang.StringBuilder("bidding token: ").append(jSONObjectBg);
            return jSONObjectBg.toString();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    private org.json.JSONObject bg(org.json.JSONObject jSONObject, boolean z) {
        org.json.JSONObject jSONObjectBg;
        if (z) {
            jSONObjectBg = com.bytedance.sdk.component.embedapplog.PangleEncryptManager.encryptType4(jSONObject, new com.bytedance.sdk.openadsdk.core.tC(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            com.bytedance.sdk.openadsdk.core.rri.bg(jSONObjectBg);
        } else {
            jSONObjectBg = com.bytedance.sdk.component.utils.bg.bg(jSONObject);
        }
        return jSONObjectBg != null ? jSONObjectBg : new org.json.JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public boolean bg(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (!this.bX.equals(com.bytedance.sdk.openadsdk.core.VzQ.bg().getPackageName()) || !this.eqN.equals(com.bytedance.sdk.openadsdk.core.WR.IL().eqN()) || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            java.lang.reflect.Method methodBg = com.bytedance.sdk.component.utils.kMt.bg("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", java.lang.String.class, java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class, java.lang.String.class);
            if (methodBg != null) {
                methodBg.invoke(null, str, java.lang.Integer.valueOf(i), str2, str3, str4);
            }
        } catch (java.lang.Throwable unused) {
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public com.bytedance.sdk.openadsdk.core.Uw eqN(int i) {
        com.bytedance.sdk.openadsdk.core.WR.IL().ldr(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public int ldr() {
        return com.bytedance.sdk.openadsdk.core.WR.IL().Fy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public com.bytedance.sdk.openadsdk.core.Uw zx(int i) {
        this.ldr = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public int iR() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Uw
    public com.bytedance.sdk.openadsdk.core.Uw ldr(int i) {
        com.bytedance.sdk.openadsdk.core.WR.IL().bg(i);
        return this;
    }
}

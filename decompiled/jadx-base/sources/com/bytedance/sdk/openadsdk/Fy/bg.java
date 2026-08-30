package com.bytedance.sdk.openadsdk.Fy;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static volatile com.bytedance.sdk.openadsdk.LZ.bX IL;
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> bg = new java.util.concurrent.ConcurrentHashMap<>();

    public static com.bytedance.sdk.openadsdk.LZ.bX bg(final android.content.Context context, final java.lang.String str) {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.Fy.bg.class) {
                if (IL == null) {
                    try {
                        com.bytedance.sdk.openadsdk.LZ.bX bXVar = new com.bytedance.sdk.openadsdk.LZ.bX(new com.bytedance.sdk.openadsdk.LZ.eqN() { // from class: com.bytedance.sdk.openadsdk.Fy.bg.1
                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public java.lang.String bX() {
                                return "pag_adn_strategy_center";
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public java.util.concurrent.ExecutorService bg() {
                                return com.bytedance.sdk.openadsdk.utils.VJ.eqN();
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public android.content.Context IL() {
                                android.content.Context context2 = context;
                                return context2 != null ? context2 : com.bytedance.sdk.openadsdk.core.VzQ.bg();
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public android.os.Handler eqN() {
                                return com.bytedance.sdk.openadsdk.core.yDt.IL();
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public java.lang.String zx() {
                                return com.bytedance.sdk.openadsdk.utils.ayS.eqN("/api/ad/union/sdk/strategies/adn");
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public org.json.JSONObject ldr() {
                                try {
                                    org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.core.settings.yDt.bg(com.bytedance.sdk.component.utils.rri.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 0L));
                                    if (!jSONObjectBg.has("app_id")) {
                                        if (!android.text.TextUtils.isEmpty(str)) {
                                            jSONObjectBg.put("app_id", str);
                                        } else {
                                            if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.WR.IL().eqN())) {
                                                return null;
                                            }
                                            jSONObjectBg.put("app_id", com.bytedance.sdk.openadsdk.core.WR.IL().eqN());
                                        }
                                    }
                                    return com.bytedance.sdk.component.utils.bg.bg(jSONObjectBg);
                                } catch (java.lang.Throwable th) {
                                    com.bytedance.sdk.component.utils.PX.bg("StrategyUtils", th.getMessage());
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public java.util.Map<java.lang.String, java.lang.String> iR() {
                                java.util.HashMap map = new java.util.HashMap();
                                map.put(com.google.common.net.HttpHeaders.USER_AGENT, com.bytedance.sdk.openadsdk.utils.ayS.bX());
                                return map;
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.eqN
                            public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
                                int iOptInt = jSONObject.optInt("cypher", -1);
                                if (iOptInt == -1 || iOptInt != 3) {
                                    return jSONObject;
                                }
                                java.lang.String strBX = com.bytedance.sdk.component.utils.bg.bX(jSONObject.optString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
                                if (android.text.TextUtils.isEmpty(strBX)) {
                                    return jSONObject;
                                }
                                try {
                                    return new org.json.JSONObject(strBX);
                                } catch (java.lang.Throwable unused) {
                                    return jSONObject;
                                }
                            }
                        });
                        IL = bXVar;
                        bXVar.bg(new com.bytedance.sdk.openadsdk.LZ.bg() { // from class: com.bytedance.sdk.openadsdk.Fy.bg.2
                            @Override // com.bytedance.sdk.openadsdk.LZ.bg
                            public void bg() {
                                com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.Fy.bg.2.1
                                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                        bgVar.IL("strategy_fetch");
                                        return bgVar;
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.bg
                            public void IL() {
                                com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.Fy.bg.2.2
                                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                        bgVar.IL("strategy_fetch");
                                        return bgVar;
                                    }
                                });
                                com.bytedance.sdk.openadsdk.ldr.bg.bg().IL();
                                com.bytedance.sdk.openadsdk.tuV.bg.bX.bg().IL();
                            }

                            @Override // com.bytedance.sdk.openadsdk.LZ.bg
                            public void bg(int i, java.lang.String str2) {
                                com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.Fy.bg.2.3
                                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                        bgVar.IL("strategy_fetch");
                                        return bgVar;
                                    }
                                });
                            }
                        });
                    } catch (java.lang.Throwable th) {
                        th.getMessage();
                    }
                }
            }
        }
        return IL;
    }

    private static com.bytedance.sdk.openadsdk.LZ.bX IL() {
        return bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.core.WR.IL().eqN());
    }

    public static int bg(java.lang.String str, int i) {
        com.bytedance.sdk.openadsdk.LZ.bX bXVarIL = IL();
        return bXVarIL != null ? bXVarIL.bg(str, i) : i;
    }

    public static boolean bg(java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.LZ.bX bXVarIL = IL();
        return bXVarIL != null ? bXVarIL.bg(str, z) : z;
    }

    public static java.lang.String bg(java.lang.String str, java.lang.String str2) {
        com.bytedance.sdk.openadsdk.LZ.bX bXVarIL = IL();
        return bXVarIL != null ? bXVarIL.bg(str, str2) : str2;
    }

    public static int bg(java.lang.String str, java.lang.String str2, int i) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            java.lang.String str3 = str + "_" + str2;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> concurrentHashMap = bg;
            java.lang.Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof java.lang.Integer)) {
                return ((java.lang.Integer) obj).intValue();
            }
            try {
                java.lang.String strBg = IL().bg(str, "");
                if (android.text.TextUtils.isEmpty(strBg)) {
                    return i;
                }
                int iOptInt = new org.json.JSONObject(strBg).optInt(str2, i);
                concurrentHashMap.put(str3, java.lang.Integer.valueOf(iOptInt));
                return iOptInt;
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("StrategyUtils", th.getMessage());
            }
        }
        return i;
    }

    public static void bg() {
        com.bytedance.sdk.openadsdk.LZ.bX bXVarIL = IL();
        if (bXVarIL != null) {
            bXVarIL.bg();
        }
    }
}

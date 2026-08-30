package com.bytedance.sdk.openadsdk.iR;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static final java.lang.String[] bg = {"gecko-pangle-sg.byteoversea.com"};

    private static class bg {
        private static final com.bytedance.sdk.openadsdk.iR.IL bg = new com.bytedance.sdk.openadsdk.iR.IL();
    }

    public static com.bytedance.sdk.openadsdk.iR.IL bg() {
        return com.bytedance.sdk.openadsdk.iR.IL.bg.bg;
    }

    public com.bykv.vk.openvk.preload.falconx.loader.ILoader IL() {
        try {
            return com.bykv.vk.openvk.preload.geckox.GeckoHubImp.inst(com.bytedance.sdk.openadsdk.core.VzQ.bg()).getGeckoResLoader();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private IL() {
        try {
            com.bykv.vk.openvk.preload.geckox.GeckoHubImp.inst(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    private static java.lang.String eqN() {
        java.lang.String[] strArrLd = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ld();
        if (strArrLd != null) {
            int length = strArrLd.length;
        }
        if (strArrLd == null) {
            strArrLd = bg;
        }
        java.lang.String str = strArrLd[new java.security.SecureRandom().nextInt(strArrLd.length)];
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        java.lang.String[] strArr = bg;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public void bg(final java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.model.tuV> map) {
        try {
            java.lang.String strBg = com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            if (android.text.TextUtils.isEmpty(strBg)) {
                return;
            }
            java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = map.values().iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.yDt.bX.IL(it.next());
            }
            com.bykv.vk.openvk.preload.geckox.GeckoHubImp.setRandomHost(eqN());
            com.bykv.vk.openvk.preload.geckox.GeckoHubImp.inst(com.bytedance.sdk.openadsdk.core.VzQ.bg()).preload(strBg, new com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.iR.IL.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(java.lang.String str, org.json.JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        com.bytedance.sdk.openadsdk.core.model.tuV tuv = (com.bytedance.sdk.openadsdk.core.model.tuV) map.get(jSONObject.optString("channel"));
                        if (tuv != null) {
                            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(str, jSONObject, tuv);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        com.bytedance.sdk.openadsdk.iR.IL.IL(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.iR.bg());
        } catch (java.lang.Throwable th) {
            IL(map, null, th.toString());
            com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.model.tuV> map, org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = map.values().iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.yDt.bX.bg(it.next(), jSONObject);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void bg(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader) {
        if (iLoader != null) {
            try {
                com.bykv.vk.openvk.preload.geckox.GeckoHubImp.inst(com.bytedance.sdk.openadsdk.core.VzQ.bg()).releaseGeckoResLoader(iLoader);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel bg(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, java.lang.String str, java.lang.String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return com.bykv.vk.openvk.preload.geckox.GeckoHubImp.inst(com.bytedance.sdk.openadsdk.core.VzQ.bg()).findResAndMsg(iLoader, str, str2);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int bg(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, java.lang.String str) {
        try {
            return com.bykv.vk.openvk.preload.geckox.GeckoHubImp.inst(com.bytedance.sdk.openadsdk.core.VzQ.bg()).getResCount(iLoader, str);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "getResCount error", th);
            return 0;
        }
    }

    public static void bX() {
        try {
            com.bykv.vk.openvk.preload.geckox.GeckoHubImp.setThreadPoolExecutorCallback(new com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.iR.IL.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public java.util.concurrent.ExecutorService getThreadPool() {
                    return com.bytedance.sdk.openadsdk.utils.VJ.eqN();
                }
            });
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }
}

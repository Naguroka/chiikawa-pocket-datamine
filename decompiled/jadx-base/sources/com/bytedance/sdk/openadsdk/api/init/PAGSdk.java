package com.bytedance.sdk.openadsdk.api.init;

/* JADX INFO: loaded from: classes4.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long bg;

    public interface PAGInitCallback {
        void fail(int i, java.lang.String str);

        void success();
    }

    static {
        try {
            com.bytedance.sdk.component.IL.bg(new com.bytedance.sdk.component.IL.bg() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
                @Override // com.bytedance.sdk.component.IL.bg
                public java.util.concurrent.ExecutorService getExecutorService() {
                    return com.bytedance.sdk.openadsdk.utils.VJ.eqN();
                }
            });
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.initAPM();
                    com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.initMemoryData();
                }
            });
            com.bytedance.sdk.openadsdk.core.yDt.bg(java.lang.System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.core.yDt.IL();
            com.bytedance.sdk.component.WR.eqN.setWebViewProvider(new com.bytedance.sdk.component.WR.eqN.bX() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // com.bytedance.sdk.component.WR.eqN.bX
                public android.webkit.WebView createWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
                    if (!(context instanceof android.content.MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new com.bytedance.sdk.component.WR.bX(context, attributeSet) : new com.bytedance.sdk.component.WR.bX(context, attributeSet, i);
                    } catch (java.lang.Exception unused) {
                        return i == 0 ? new com.bytedance.sdk.component.WR.bX(context, attributeSet) : new com.bytedance.sdk.component.WR.bX(context, attributeSet, i);
                    }
                }
            });
        } catch (java.lang.Throwable th) {
            android.util.Log.i("TTAD.PAGSdk", th.getMessage());
        }
        bg = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(final android.content.Context context, final com.bytedance.sdk.openadsdk.InitConfig initConfig, com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback pAGInitCallback) {
        android.content.Context applicationContext;
        bg = android.os.SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.VzQ.IL(context);
        if (pAGInitCallback != null) {
            synchronized (com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST) {
                if (!com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST.contains(pAGInitCallback)) {
                    com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
                    if (com.bytedance.sdk.openadsdk.core.yDt.eqN() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            IL(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            eqN();
            return;
        }
        com.bytedance.sdk.openadsdk.core.yDt.bg(3);
        if (context == null) {
            IL(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof android.app.Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (initConfig == null) {
            IL(4000, "PAGConfig is null, please check.");
            return;
        }
        eqN(context, initConfig);
        com.bytedance.sdk.openadsdk.ApmHelper.initApm(context, initConfig);
        try {
            com.bytedance.sdk.openadsdk.core.WR.bg(new com.bytedance.sdk.openadsdk.core.Ta() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                public void success() {
                    com.bytedance.sdk.openadsdk.api.init.PAGSdk.eqN();
                }

                @Override // com.bytedance.sdk.openadsdk.core.Ta
                public void fail(int i, java.lang.String str) {
                    com.bytedance.sdk.openadsdk.api.init.PAGSdk.IL(i, str);
                }
            });
            try {
                com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_ad_logo_txt");
                if (com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_logo") == 0) {
                    bg(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        eqN();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.zx.bg bgVar = new com.bytedance.sdk.openadsdk.zx.bg();
                com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig.setSdkTypeFactory(new com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory createADTypeLoaderFactory(java.lang.String str) {
                        return bgVar;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    IL(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bg(new com.bytedance.sdk.openadsdk.multipro.aidl.IL() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.IL
                        public void onServiceConnected() {
                            com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.bytedance.sdk.openadsdk.api.init.PAGSdk.IL(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bX();
                }
            } catch (java.lang.Throwable unused) {
                bg(initConfig, pAGInitCallback);
            }
        } catch (java.lang.Throwable unused2) {
            IL(4000, "Internal Error, setting exception. ");
        }
    }

    private static void bg(com.bytedance.sdk.openadsdk.InitConfig initConfig, com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback pAGInitCallback) {
        com.bytedance.sdk.openadsdk.core.yDt.bg(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof com.bytedance.sdk.openadsdk.api.init.PAGConfig) {
                IL(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                IL(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(android.content.Context context, com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        long jElapsedRealtime;
        try {
            if (isInitSuccess()) {
                eqN();
                return;
            }
            zx(context, initConfig);
            com.bytedance.sdk.openadsdk.core.settings.xxp.zU().LZ();
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - bg;
            eqN();
            ldr(context, initConfig);
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - bg;
            bg(context, isInitSuccess(), initConfig, jElapsedRealtime2, jElapsedRealtime);
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.Long.valueOf(jElapsedRealtime);
            java.lang.Long.valueOf(jElapsedRealtime2);
        } catch (java.lang.Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PAGSdk", th.getMessage());
            long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - bg;
            IL(4000, th.getMessage());
            jElapsedRealtime = jElapsedRealtime3;
        }
    }

    private static void bX(android.content.Context context, com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        com.bytedance.sdk.openadsdk.core.yDt.bg = true;
        com.bytedance.sdk.openadsdk.core.DDQ.bg().bg(initConfig.getAppId()).IL(initConfig.getCoppa()).bX(initConfig.getGdpr()).eqN(initConfig.getCcpa()).ldr(initConfig.getAppIconId()).bg(initConfig.getTitleBarTheme());
        com.bytedance.sdk.openadsdk.core.WR.rri();
        if (initConfig instanceof com.bytedance.sdk.openadsdk.api.init.PAGConfig) {
            com.bytedance.sdk.openadsdk.core.DDQ.bg().zx(((com.bytedance.sdk.openadsdk.api.init.PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (IL(initConfig)) {
                com.bytedance.sdk.openadsdk.core.DDQ.bg().bg();
                com.bytedance.sdk.openadsdk.utils.Lq.bg();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.component.utils.iR.bg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IL(com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        return ((com.bytedance.sdk.openadsdk.api.init.PAGConfig) initConfig).getDebugLog();
    }

    private static void eqN(android.content.Context context, com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        if (!android.text.TextUtils.isEmpty(initConfig.getPackageName())) {
            com.bytedance.sdk.component.utils.Fy.bg(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.iR.eqN.bg(initConfig.getPackageName());
        } else {
            com.bytedance.sdk.component.utils.Fy.bg((java.lang.String) null);
            com.bytedance.adsdk.ugeno.iR.eqN.bg((java.lang.String) null);
        }
        com.bytedance.sdk.openadsdk.core.VzQ.IL(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.IL.bg();
        } else {
            com.bytedance.sdk.openadsdk.multipro.IL.IL();
        }
        com.bytedance.sdk.openadsdk.core.Kg.PX.bg();
        com.bytedance.sdk.openadsdk.core.VB.IL.bg(context);
    }

    private static void zx(android.content.Context context, com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            com.bytedance.sdk.component.Kg.ldr.bX(-1);
            com.bytedance.sdk.component.Kg.ldr.bg(new com.bytedance.sdk.component.Kg.eo() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
                @Override // com.bytedance.sdk.component.Kg.eo
                public com.bytedance.sdk.component.Kg.WR createThreadFactory(int i, java.lang.String str) {
                    return new com.bytedance.sdk.component.Kg.WR(i, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                        @Override // com.bytedance.sdk.component.Kg.WR, java.util.concurrent.ThreadFactory
                        public java.lang.Thread newThread(java.lang.Runnable runnable) {
                            int iDt = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().Dt();
                            if (iDt >= -524288 && iDt < 0) {
                                java.lang.Thread thread = new java.lang.Thread(this.bg, runnable, this.IL, iDt);
                                if (thread.isDaemon()) {
                                    thread.setDaemon(false);
                                }
                                if (this.bX > 10 || this.bX <= 0) {
                                    this.bX = 5;
                                }
                                thread.setPriority(this.bX);
                                return thread;
                            }
                            return super.newThread(runnable);
                        }
                    };
                }
            });
            com.bytedance.sdk.openadsdk.multipro.bX.bg(context);
            com.bytedance.sdk.component.iR.bX.bg.bg(new com.bytedance.sdk.component.iR.bX.bX() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
                @Override // com.bytedance.sdk.component.iR.bX.bX
                public java.util.concurrent.ExecutorService getThreadPool() {
                    return com.bytedance.sdk.openadsdk.utils.VJ.eqN();
                }
            });
            com.bytedance.sdk.openadsdk.iR.IL.bX();
            com.bytedance.sdk.openadsdk.core.yDt.IL.set(true);
            try {
                com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bg(new com.bytedance.sdk.openadsdk.WR.bg());
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.PAGSdk", e.getMessage());
            }
            bX(initConfig);
            bX(context, initConfig);
            com.bykv.vk.openvk.bg.bg.bg.bX.bg(context, null);
            com.bykv.vk.openvk.bg.bg.bg.bX.bg(2);
            com.bykv.vk.openvk.bg.bg.bg.bX.bg(initConfig.isSupportMultiProcess());
            com.bykv.vk.openvk.bg.bg.bg.bX.bg(com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().zx());
        }
    }

    private static void ldr(final android.content.Context context, final com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        android.os.SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new com.bytedance.sdk.component.Kg.Kg("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.yDt.bg(initConfig.getData());
                com.bytedance.sdk.openadsdk.Fy.bg.bg(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.Fy.bg.bg();
                com.bytedance.sdk.openadsdk.p002vb.eqN.bg();
                com.bytedance.sdk.openadsdk.p002vb.eqN.IL();
                new com.bytedance.sdk.openadsdk.utils.Ta();
                com.bytedance.sdk.component.adexpress.bg.IL.ldr.bg(com.bytedance.sdk.openadsdk.utils.VzQ.bg() * 10);
                com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg(context, initConfig.isSupportMultiProcess());
                com.bytedance.sdk.openadsdk.core.Lq.bg().IL();
                com.bytedance.sdk.openadsdk.core.WR.bX.bg();
                com.bytedance.sdk.openadsdk.tC.bg.bg(new com.bytedance.sdk.openadsdk.tC.bg.InterfaceC0164bg() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.1
                    public void onGdprChanged(int i) {
                        com.bytedance.sdk.openadsdk.api.init.PAGConfig.setGDPRConsent(i);
                    }
                });
                com.bytedance.sdk.openadsdk.core.settings.xxp.eqN = com.bytedance.sdk.openadsdk.core.settings.xxp.bX(context);
                com.bytedance.sdk.openadsdk.rri.bg.iR.IL();
                com.bykv.vk.openvk.bg.bg.IL.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.eqN().cZH());
                com.bykv.vk.openvk.bg.bg.IL.bg.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(0));
                com.bytedance.sdk.openadsdk.core.settings.ldr ldrVarEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
                if (!ldrVarEqN.sVc()) {
                    synchronized (ldrVarEqN) {
                        if (!ldrVarEqN.sVc()) {
                            ldrVarEqN.IL();
                            ldrVarEqN.Uq();
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.eo();
                com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.maybeAsyncInitTask(context);
                com.bytedance.sdk.openadsdk.api.init.PAGSdk.getBiddingToken();
                com.bytedance.sdk.component.Kg.ldr.bg(true);
                com.bytedance.sdk.component.Kg.ldr.bg(new com.bytedance.sdk.openadsdk.yDt.IL.bg());
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.bg(context);
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.eo(context);
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.VB(context);
                com.bytedance.sdk.openadsdk.yDt.bg.bg();
                com.bytedance.sdk.openadsdk.core.settings.eqN.bg();
                com.bytedance.sdk.openadsdk.yDt.bX.eqN();
                com.bytedance.sdk.openadsdk.utils.ayS.Ta(context);
                com.bytedance.sdk.openadsdk.eqN.bX.bg();
                com.bytedance.sdk.openadsdk.api.init.PAGSdk.bX();
                com.bytedance.sdk.openadsdk.core.WR.bX.IL();
                com.bytedance.sdk.openadsdk.core.eqN.bg.bg().IL();
                com.bytedance.sdk.component.Kg.bX.bX.bg(com.bytedance.sdk.openadsdk.core.yDt.IL());
                com.bytedance.sdk.component.utils.IL.bg(new com.bytedance.sdk.component.utils.IL.bg() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.2
                    @Override // com.bytedance.sdk.component.utils.IL.bg
                    public boolean isEnableAsyncStartActivity() {
                        return com.bytedance.sdk.openadsdk.Fy.bg.bg("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.IL.bg
                    public java.util.concurrent.ExecutorService getAsyncStartActivityThreadPool() {
                        return com.bytedance.sdk.openadsdk.utils.VJ.Kg();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bX() {
        android.content.pm.ShortcutManager shortcutManager;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
                if (contextBg == null || (shortcutManager = (android.content.pm.ShortcutManager) contextBg.getSystemService(android.content.pm.ShortcutManager.class)) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.WR.IL().bg(shortcutManager.isRequestPinShortcutSupported());
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private static void bX(com.bytedance.sdk.openadsdk.InitConfig initConfig) {
        if (!android.text.TextUtils.isEmpty(initConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.WR.IL().bX(initConfig.getData());
        }
        com.bytedance.sdk.openadsdk.core.WR.IL().bX(IL(initConfig));
    }

    private static void bg(final android.content.Context context, final boolean z, final com.bytedance.sdk.openadsdk.InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg();
        com.bytedance.sdk.openadsdk.yDt.bX.bg("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    boolean zBX = com.bytedance.sdk.openadsdk.core.WR.IL().bX();
                    jSONObject.put("duration", j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", com.bytedance.sdk.openadsdk.api.init.PAGSdk.IL(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zBX);
                    jSONObject.put("minSdkVersion", com.bytedance.sdk.openadsdk.utils.ayS.VB(context));
                    jSONObject.put("targetSdkVersion", com.bytedance.sdk.openadsdk.utils.ayS.eo(context));
                    jSONObject.put("apm_is_init", com.bytedance.sdk.openadsdk.ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    com.bytedance.sdk.openadsdk.core.WR.IL().IL(false);
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.PAGSdk", "run: ", e);
                }
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("pangle_sdk_init").IL(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void eqN() {
        com.bytedance.sdk.openadsdk.core.yDt.bg(1);
        try {
            synchronized (com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST) {
                java.util.Iterator<com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback> it = com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.success();
                    }
                }
            }
            com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
                @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                    com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                    bgVar.IL(com.ironsource.y8.a.f);
                    return bgVar;
                }
            });
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(int i, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.yDt.bg(2);
        try {
            synchronized (com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST) {
                java.util.Iterator<com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback> it = com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.fail(i, str);
                    }
                }
                com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                        bgVar.IL(com.ironsource.y8.a.f);
                        return bgVar;
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
    }

    public static void init(final android.content.Context context, final com.bytedance.sdk.openadsdk.api.init.PAGConfig pAGConfig, final com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback pAGInitCallback) {
        com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.api.init.PAGSdk.IL(context, pAGConfig, pAGInitCallback);
            }
        });
        com.bytedance.sdk.openadsdk.core.yDt.iR();
    }

    public static boolean isInitSuccess() {
        return com.bytedance.sdk.openadsdk.core.yDt.eqN() == 1;
    }

    public static java.lang.String getSDKVersion() {
        return com.bytedance.sdk.openadsdk.core.DDQ.bg() != null ? com.bytedance.sdk.openadsdk.core.DDQ.bg().eqN() : "";
    }

    public static java.lang.String getBiddingToken(android.content.Context context, java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.VzQ.IL(context);
        return getBiddingToken(str);
    }

    public static void getBiddingToken(final com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            com.bytedance.sdk.openadsdk.utils.VJ.zx(new com.bytedance.sdk.component.Kg.Kg("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.14
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(com.bytedance.sdk.openadsdk.api.init.PAGSdk.getBiddingToken());
                }
            });
        }
    }

    public static void getBiddingToken(final java.lang.String str, final com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            com.bytedance.sdk.openadsdk.utils.VJ.zx(new com.bytedance.sdk.component.Kg.Kg("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.15
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(com.bytedance.sdk.openadsdk.api.init.PAGSdk.getBiddingToken(str));
                }
            });
        }
    }

    public static java.lang.String getBiddingToken(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null || com.bytedance.sdk.openadsdk.core.DDQ.bg() == null) ? "" : com.bytedance.sdk.openadsdk.core.DDQ.bg().bX(str);
    }

    public static java.lang.String getBiddingToken(android.content.Context context) {
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.VzQ.IL(context);
        return getBiddingToken();
    }

    public static java.lang.String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.zx.bg()) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null || com.bytedance.sdk.openadsdk.core.DDQ.bg() == null) ? "" : com.bytedance.sdk.openadsdk.core.DDQ.bg().zx();
    }

    public static boolean onlyVerityPlayable(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (com.bytedance.sdk.openadsdk.core.DDQ.bg() != null) {
            return com.bytedance.sdk.openadsdk.core.DDQ.bg().bg(str, i, str2, str3, str4);
        }
        return false;
    }

    public static java.lang.String getApplicationName(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (java.lang.String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.multipro.bX.bg();
    }

    public static void addPAGInitCallback(com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && com.bytedance.sdk.openadsdk.core.yDt.eqN() == 0) {
            com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
        }
    }

    public static void setAabPackageName(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.component.utils.Fy.bg(str);
        com.bytedance.adsdk.ugeno.iR.eqN.bg(str);
    }

    public static void setAdRevenue(org.json.JSONObject jSONObject) {
        if (jSONObject != null && com.bytedance.sdk.openadsdk.core.VzQ.eqN().VzQ() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z) {
        com.bytedance.sdk.openadsdk.common.zx.bg(z);
    }
}

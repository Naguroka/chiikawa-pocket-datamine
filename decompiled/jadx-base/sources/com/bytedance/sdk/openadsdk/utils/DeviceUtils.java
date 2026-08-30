package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceUtils {
    private static int Kg = 0;
    private static int PX = 0;
    private static int Ta = 0;
    private static int VB = 0;
    private static int WR = 0;
    public static java.lang.String bg = "";
    private static int eo;
    private static volatile long IL = java.lang.System.currentTimeMillis();
    private static volatile boolean bX = false;
    private static volatile boolean eqN = false;
    private static volatile boolean zx = false;
    private static volatile boolean ldr = true;
    private static long iR = 0;
    private static java.util.concurrent.atomic.AtomicBoolean yDt = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void bg(android.content.Context context) {
        if (bX) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL il = new com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(il, intentFilter);
            bX = true;
        } catch (java.lang.Throwable unused) {
        }
    }

    public static long bg() {
        return IL;
    }

    @com.bytedance.JProtect
    public static boolean IL() {
        if (android.os.SystemClock.elapsedRealtime() - iR >= 20000) {
            iR = android.os.SystemClock.elapsedRealtime();
            try {
                android.os.PowerManager powerManager = (android.os.PowerManager) com.bytedance.sdk.openadsdk.core.VzQ.bg().getSystemService("power");
                if (powerManager != null) {
                    ldr = powerManager.isInteractive();
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return ldr;
    }

    public static boolean IL(android.content.Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean bX(android.content.Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static int eqN(android.content.Context context) {
        if (bX(context)) {
            return 3;
        }
        return IL(context) ? 2 : 1;
    }

    private static void bg(org.json.JSONObject jSONObject) throws org.json.JSONException {
        IL(jSONObject);
    }

    private static void IL(org.json.JSONObject jSONObject) throws org.json.JSONException {
        jSONObject.put(com.json.ce.v, android.os.Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().DDQ(com.json.ce.K0)) {
            jSONObject.put(com.json.ce.K0, com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL());
        }
    }

    @com.bytedance.JProtect
    public static org.json.JSONObject bg(android.content.Context context, boolean z) {
        java.lang.String strIL;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("sys_adb_status", ldr(context));
            bg(jSONObject);
            jSONObject.put("type", eqN(context));
            jSONObject.put(com.json.ce.y, 1);
            jSONObject.put("os_version", android.os.Build.VERSION.RELEASE);
            jSONObject.put("vendor", android.os.Build.MANUFACTURER);
            jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.ayS.PX(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.eqN.bX());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.eqN.IL());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.eqN.eqN());
            jSONObject.put("screen_width", com.bytedance.sdk.openadsdk.utils.ZQc.bX(context));
            jSONObject.put("screen_height", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.WR.bX.ldr());
            com.bytedance.sdk.openadsdk.core.settings.ldr ldrVarEqN = com.bytedance.sdk.openadsdk.core.VzQ.eqN();
            if (ldrVarEqN.DDQ("boot")) {
                jSONObject.put("boot", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.PX.bX(context));
            jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.JAA.bg());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.PX.IL(context));
            jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.ayS.VzQ());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.PX.bg());
            jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.Uw.bg());
            if (z) {
                strIL = com.bytedance.sdk.openadsdk.utils.ayS.bg(context);
            } else {
                strIL = com.bytedance.sdk.openadsdk.utils.ayS.IL(context);
            }
            jSONObject.put("total_mem", java.lang.String.valueOf(java.lang.Long.parseLong(strIL) * 1024));
            jSONObject.put("locale_language", eqN());
            jSONObject.put("screen_bright", java.lang.Math.ceil(zx() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", IL() ? 0 : 1);
            jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.iR.bg(context));
            jSONObject.put("cpu_max_freq", com.bytedance.sdk.openadsdk.utils.iR.IL(context));
            jSONObject.put("cpu_min_freq", com.bytedance.sdk.openadsdk.utils.iR.bX(context));
            com.bytedance.sdk.openadsdk.utils.zx.bg bgVarBg = com.bytedance.sdk.openadsdk.utils.zx.bg();
            jSONObject.put("battery_remaining_pct", (int) bgVarBg.IL);
            jSONObject.put("is_charging", bgVarBg.bg);
            jSONObject.put("total_space", java.lang.String.valueOf(com.bytedance.sdk.openadsdk.utils.ayS.bX(context)));
            jSONObject.put("free_space_in", java.lang.String.valueOf(com.bytedance.sdk.openadsdk.utils.ayS.eqN(context)));
            jSONObject.put("sdcard_size", java.lang.String.valueOf(com.bytedance.sdk.openadsdk.utils.ayS.zx(context)));
            jSONObject.put("rooted", com.bytedance.sdk.openadsdk.utils.ayS.ldr(context));
            jSONObject.put("enable_assisted_clicking", ldr());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.Fy.bg(context, "tt_choose_language"));
            jSONObject.put("airplane", iR(context));
            jSONObject.put("darkmode", yDt(context));
            jSONObject.put("headset", Lq(context));
            jSONObject.put("ringmute", Kg(context));
            jSONObject.put("screenscale", vb(context));
            jSONObject.put("volume", Kg());
            jSONObject.put("low_power_mode", xxp(context));
            if (ldrVarEqN.DDQ("mnc")) {
                jSONObject.put("mnc", com.bytedance.sdk.openadsdk.utils.Uw.bX());
            }
            if (ldrVarEqN.DDQ("mcc")) {
                jSONObject.put("mcc", com.bytedance.sdk.openadsdk.utils.Uw.IL());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.bg.IL(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.bg.bg());
            java.lang.String strBX = com.bytedance.sdk.openadsdk.core.WR.bX.bX();
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Long.valueOf(com.bytedance.sdk.openadsdk.core.WR.bX.eqN());
            if (!android.text.TextUtils.isEmpty(strBX)) {
                jSONObject.put("sof_chara", strBX);
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public static org.json.JSONObject zx(android.content.Context context) {
        return bg(context, false);
    }

    public static int bX() {
        return com.bytedance.sdk.openadsdk.core.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).IL("limit_ad_track", -1);
    }

    public static java.lang.String eqN() {
        java.lang.String languageTag = java.util.Locale.getDefault().toLanguageTag();
        return !android.text.TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static float zx() {
        int i = -1;
        try {
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            if (contextBg != null) {
                i = android.provider.Settings.System.getInt(contextBg.getContentResolver(), "screen_brightness", -1);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return java.lang.Math.round((i / 255.0f) * 10.0f) / 10.0f;
    }

    public static int ldr() {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.bytedance.sdk.openadsdk.core.VzQ.bg().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static int ldr(android.content.Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return android.provider.Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static int iR(android.content.Context context) {
        try {
            return android.provider.Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    private static int yDt(android.content.Context context) {
        try {
            int i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                return 1;
            }
            return i == 16 ? 0 : -1;
        } catch (java.lang.Throwable unused) {
        }
    }

    private static int Lq(android.content.Context context) {
        return PX;
    }

    public static int Kg(android.content.Context context) {
        return Kg;
    }

    private static float vb(android.content.Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int iR() {
        return eo;
    }

    public static int Kg() {
        return VB;
    }

    public static int WR() {
        return WR;
    }

    private static int xxp(android.content.Context context) {
        return Ta;
    }

    public static java.lang.String WR(android.content.Context context) {
        if (android.text.TextUtils.isEmpty(bg)) {
            bg = com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("framework_name", "");
        }
        return bg;
    }

    @com.bytedance.JProtect
    public static void eo() {
        new com.bytedance.sdk.openadsdk.utils.DeviceUtils.bX().run();
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        if (contextBg != null) {
            com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("cpu_count", com.bytedance.sdk.openadsdk.utils.iR.bg());
            com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("cpu_max_frequency", com.bytedance.sdk.openadsdk.utils.iR.bg(com.bytedance.sdk.openadsdk.utils.iR.bg()));
            com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("cpu_min_frequency", com.bytedance.sdk.openadsdk.utils.iR.IL(com.bytedance.sdk.openadsdk.utils.iR.bg()));
            java.lang.String strWR = com.bytedance.sdk.openadsdk.utils.ayS.WR();
            if (strWR != null) {
                com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("total_memory", strWR);
            }
            com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("total_internal_storage", com.bytedance.sdk.openadsdk.utils.ayS.eo());
            com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("free_internal_storage", com.bytedance.sdk.component.utils.Ta.bg());
            com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("total_sdcard_storage", com.bytedance.sdk.openadsdk.utils.ayS.VB());
            com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("is_root", com.bytedance.sdk.openadsdk.utils.ayS.PX() ? 1 : 0);
            if (android.text.TextUtils.isEmpty(WR(contextBg))) {
                try {
                    java.lang.Class.forName(com.unity3d.services.core.properties.MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    bg = "unity";
                } catch (java.lang.ClassNotFoundException unused) {
                    bg = com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE;
                }
                com.bytedance.sdk.openadsdk.core.bX.bg(contextBg).bg("framework_name", bg);
            }
            VB();
            VzQ(contextBg);
            Ta = Fy(contextBg);
        }
    }

    public static void VB() {
        try {
            int ringerMode = ((android.media.AudioManager) com.bytedance.sdk.openadsdk.core.VzQ.bg().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                Kg = 1;
            } else if (ringerMode == 1) {
                Kg = 2;
            } else {
                Kg = 0;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void VzQ(android.content.Context context) {
        try {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            WR = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            eo = streamVolume;
            VB = (int) ((((double) streamVolume) / ((double) WR)) * 100.0d);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tuV(android.content.Context context) {
        if (context == null) {
            return;
        }
        final android.content.Context applicationContext = context.getApplicationContext();
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = com.bytedance.sdk.openadsdk.utils.DeviceUtils.Ta = com.bytedance.sdk.openadsdk.utils.DeviceUtils.Fy(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Fy(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!android.os.Build.MANUFACTURER.equalsIgnoreCase("XIAOMI") && !android.os.Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                return ((android.os.PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return LZ(context);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private static int LZ(android.content.Context context) {
        try {
            int i = 1;
            if (android.os.Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                if (android.provider.Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") != 1) {
                    i = 0;
                }
            } else {
                if (!android.os.Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                    return 0;
                }
                if (android.provider.Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") != 4) {
                    i = 0;
                }
            }
            return i;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public static void eo(android.content.Context context) {
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.IL(context);
    }

    public static void VB(android.content.Context context) {
        android.content.Context applicationContext;
        if (zx || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (android.os.Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                tC(applicationContext);
            } else {
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.bg.IL(applicationContext);
            }
            zx = true;
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void tC(android.content.Context context) {
        final android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(android.net.Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new android.database.ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.tuV(applicationContext);
            }
        });
    }

    static class IL extends android.content.BroadcastReceiver {
        IL() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = com.bytedance.sdk.openadsdk.utils.DeviceUtils.ldr = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = com.bytedance.sdk.openadsdk.utils.DeviceUtils.ldr = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL = java.lang.System.currentTimeMillis();
            }
        }
    }

    public static class bX implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.VzQ.bg());
                if (advertisingIdInfo != null) {
                    i = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL(advertisingIdInfo);
                    com.bytedance.sdk.openadsdk.core.settings.xxp.bg(new com.bytedance.sdk.openadsdk.core.settings.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.bX.1
                        @Override // com.bytedance.sdk.openadsdk.core.settings.Lq.bg
                        public void bg() {
                            com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL(advertisingIdInfo);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.settings.Lq.bg
                        public void IL() {
                            com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL(advertisingIdInfo);
                        }
                    });
                } else {
                    i = -1;
                }
                if (i != -1) {
                    com.bytedance.sdk.openadsdk.core.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg("limit_ad_track", i);
                }
            } catch (java.io.IOException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info) {
        if (!com.bytedance.sdk.openadsdk.core.VzQ.eqN().DDQ(com.json.ce.K0) || yDt.getAndSet(true)) {
            return;
        }
        java.lang.String id = info.getId();
        if (android.text.TextUtils.isEmpty(id)) {
            return;
        }
        com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL(id);
        com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg(id);
        com.bytedance.sdk.openadsdk.core.WR.bX.bg(id);
    }

    public static class AudioInfoReceiver extends android.content.BroadcastReceiver {
        static final java.util.concurrent.CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.PX.iR> bg = new java.util.concurrent.CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void IL(android.content.Context context) {
            if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.eqN || context == null) {
                return;
            }
            try {
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver(), intentFilter);
                boolean unused = com.bytedance.sdk.openadsdk.utils.DeviceUtils.eqN = true;
            } catch (java.lang.Throwable unused2) {
            }
        }

        public static void bg(com.bytedance.sdk.openadsdk.PX.iR iRVar) {
            if (iRVar != null) {
                java.util.concurrent.CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.PX.iR> copyOnWriteArrayList = bg;
                if (copyOnWriteArrayList.contains(iRVar)) {
                    return;
                }
                copyOnWriteArrayList.add(iRVar);
            }
        }

        public static void IL(com.bytedance.sdk.openadsdk.PX.iR iRVar) {
            if (iRVar == null) {
                return;
            }
            bg.remove(iRVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = com.bytedance.sdk.openadsdk.utils.DeviceUtils.eo = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        java.util.Iterator<com.bytedance.sdk.openadsdk.PX.iR> it = bg.iterator();
                        while (it.hasNext()) {
                            it.next().bg(com.bytedance.sdk.openadsdk.utils.DeviceUtils.eo);
                        }
                        if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.WR != 0) {
                            int unused2 = com.bytedance.sdk.openadsdk.utils.DeviceUtils.VB = (int) ((((double) com.bytedance.sdk.openadsdk.utils.DeviceUtils.eo) / ((double) com.bytedance.sdk.openadsdk.utils.DeviceUtils.WR)) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = com.bytedance.sdk.openadsdk.utils.DeviceUtils.PX = intent.getIntExtra("state", 0);
                }
            } catch (java.lang.Exception unused4) {
            }
        }
    }

    private static class bg extends android.content.BroadcastReceiver {
        private bg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void IL(android.content.Context context) {
            if (context != null) {
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(new com.bytedance.sdk.openadsdk.utils.DeviceUtils.bg(), intentFilter, 2);
                } else {
                    context.registerReceiver(new com.bytedance.sdk.openadsdk.utils.DeviceUtils.bg(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                com.bytedance.sdk.openadsdk.utils.DeviceUtils.tuV(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = com.bytedance.sdk.openadsdk.utils.DeviceUtils.Ta = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }
}

package com.bytedance.sdk.openadsdk.core.settings;

/* JADX INFO: loaded from: classes4.dex */
public class xxp implements com.bytedance.sdk.openadsdk.core.settings.ldr, com.bytedance.sdk.openadsdk.core.settings.yDt.bg {
    private final java.util.Set<java.lang.String> DDQ;
    private int Fy;
    private final android.content.BroadcastReceiver JAA;
    private final java.lang.Runnable Ja;
    com.bytedance.sdk.openadsdk.core.settings.zx.IL<com.bytedance.sdk.openadsdk.eqN.bg.yDt> Kg;
    private boolean LZ;
    private final com.bytedance.sdk.openadsdk.core.settings.Ta Lq;
    private final com.bytedance.sdk.openadsdk.core.settings.eo Ta;
    private final com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.Set<java.lang.String>> Uq;
    private final com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.Map<java.lang.String, java.lang.Integer>> Uw;
    private boolean VzQ;
    private com.bytedance.sdk.openadsdk.core.settings.zx.IL<org.json.JSONObject> aGH;
    private java.util.Set<java.lang.String> eo;
    final com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer>> iR;
    private com.bytedance.sdk.openadsdk.core.settings.WR rri;
    private int tuV;
    private final java.util.concurrent.atomic.AtomicBoolean vb;
    private volatile boolean xxp;
    private final com.bytedance.sdk.openadsdk.core.settings.bg yDt;
    public static final java.lang.String bg = kotlin.UByte$$ExternalSyntheticBackport0.m("_", new java.lang.CharSequence[]{"bus_con_collect", com.bytedance.sdk.openadsdk.utils.ayS.LZ()});
    public static final java.lang.String IL = kotlin.UByte$$ExternalSyntheticBackport0.m("_", new java.lang.CharSequence[]{"bus_con", com.bytedance.sdk.openadsdk.utils.ayS.LZ(), com.bytedance.sdk.openadsdk.utils.ayS.Fy(), "timeout"});
    public static final java.lang.String bX = kotlin.UByte$$ExternalSyntheticBackport0.m("_", new java.lang.CharSequence[]{"bus_con", com.bytedance.sdk.openadsdk.utils.ayS.LZ(), com.bytedance.sdk.openadsdk.utils.ayS.Fy(), "alpha"});
    private static final java.lang.String WR = com.bytedance.sdk.openadsdk.utils.ayS.yDt();
    private static final com.bytedance.sdk.component.Kg.Kg VB = new com.bytedance.sdk.component.Kg.Kg("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().WR();
            com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().IL(false);
            com.bytedance.sdk.component.adexpress.bg.IL.IL.IL();
            com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().bX();
        }
    };
    public static java.lang.String eqN = "";
    public static java.lang.String zx = com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY;
    private static boolean PX = false;
    private static final java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.sdk.openadsdk.core.settings.Lq.bg> tC = new java.util.concurrent.ConcurrentLinkedQueue<>();
    private static final com.bytedance.sdk.openadsdk.core.settings.VB kMt = new com.bytedance.sdk.openadsdk.core.settings.VB();
    static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> ldr = new java.util.concurrent.ConcurrentHashMap<>();

    private static final class bg {
        static final com.bytedance.sdk.openadsdk.core.settings.xxp bg = new com.bytedance.sdk.openadsdk.core.settings.xxp();
    }

    private static int bX(boolean z) {
        return z ? 20 : 5;
    }

    private xxp() {
        this.eo = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.Ta = new com.bytedance.sdk.openadsdk.core.settings.eo();
        this.yDt = new com.bytedance.sdk.openadsdk.core.settings.bg();
        this.Lq = new com.bytedance.sdk.openadsdk.core.settings.Ta(new com.bytedance.sdk.openadsdk.core.settings.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.Lq.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.core.settings.Lq.bg[] bgVarArr;
                boolean unused = com.bytedance.sdk.openadsdk.core.settings.xxp.PX = true;
                if (com.bytedance.sdk.openadsdk.core.settings.xxp.tC == null || com.bytedance.sdk.openadsdk.core.settings.xxp.tC.size() == 0 || (bgVarArr = (com.bytedance.sdk.openadsdk.core.settings.Lq.bg[]) com.bytedance.sdk.openadsdk.core.settings.xxp.tC.toArray()) == null) {
                    return;
                }
                for (com.bytedance.sdk.openadsdk.core.settings.Lq.bg bgVar : bgVarArr) {
                    bgVar.bg();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.Lq.bg
            public void IL() {
                if (com.bytedance.sdk.openadsdk.core.settings.xxp.tC == null || com.bytedance.sdk.openadsdk.core.settings.xxp.tC.isEmpty()) {
                    return;
                }
                java.util.Iterator it = com.bytedance.sdk.openadsdk.core.settings.xxp.tC.iterator();
                while (it.hasNext()) {
                    ((com.bytedance.sdk.openadsdk.core.settings.Lq.bg) it.next()).IL();
                }
            }
        });
        this.vb = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.xxp = false;
        this.VzQ = false;
        this.tuV = 5000;
        this.Fy = 10;
        com.bytedance.sdk.openadsdk.core.settings.xxp.AnonymousClass11 anonymousClass11 = new com.bytedance.sdk.openadsdk.core.settings.xxp.AnonymousClass11();
        this.JAA = anonymousClass11;
        this.Ja = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.12
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.settings.xxp.this.eqN(2);
                com.bytedance.sdk.openadsdk.core.settings.xxp.this.uny();
            }
        };
        this.iR = new com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> IL(java.lang.String str) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return com.bytedance.sdk.openadsdk.core.settings.xxp.ldr;
                }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        int iOptInt = jSONObject.optInt(next, 100);
                        if (!android.text.TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, java.lang.Integer.valueOf(iOptInt));
                        }
                    }
                } catch (org.json.JSONException e) {
                    android.util.Log.i("TTAD.SdkSettings", e.getMessage());
                }
                return concurrentHashMap;
            }
        };
        this.Uw = new com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.Map<java.lang.String, java.lang.Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public java.util.Map<java.lang.String, java.lang.Integer> IL(java.lang.String str) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    java.util.HashMap map = new java.util.HashMap(jSONObject.length());
                    java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        if (!android.text.TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt >= 0 && iOptInt <= 100) {
                                map.put(next, java.lang.Integer.valueOf(iOptInt));
                            } else {
                                map.put(next, 100);
                            }
                        }
                    }
                    return map;
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.component.utils.PX.IL("get applog rate from sp failed:" + e.getMessage());
                    return null;
                }
            }
        };
        this.DDQ = new java.util.HashSet();
        this.Uq = new com.bytedance.sdk.openadsdk.core.settings.zx.IL<java.util.Set<java.lang.String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public java.util.Set<java.lang.String> IL(java.lang.String str) {
                java.util.HashSet hashSet = new java.util.HashSet();
                if (!android.text.TextUtils.isEmpty(str)) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            com.bytedance.sdk.openadsdk.core.settings.xxp.this.Fy = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            com.bytedance.sdk.openadsdk.core.settings.xxp.this.tuV = iOptInt2;
                        }
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                java.lang.String string = jSONArray.getString(i);
                                if (!android.text.TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (org.json.JSONException e) {
                        android.util.Log.i("TTAD.SdkSettings", e.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new java.util.HashSet(java.util.Arrays.asList(com.json.z8.CLICK, com.json.j5.v, "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.aGH = new com.bytedance.sdk.openadsdk.core.settings.zx.IL<org.json.JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public org.json.JSONObject IL(java.lang.String str) {
                org.json.JSONObject jSONObject;
                try {
                    jSONObject = new org.json.JSONObject(str);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new org.json.JSONObject() : jSONObject;
            }
        };
        this.Kg = new com.bytedance.sdk.openadsdk.core.settings.zx.IL<com.bytedance.sdk.openadsdk.eqN.bg.yDt>() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.eqN.bg.yDt IL(java.lang.String str) {
                com.bytedance.sdk.openadsdk.eqN.bg.yDt ydt = new com.bytedance.sdk.openadsdk.eqN.bg.yDt();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    ydt.bg(jSONObject.optInt("enable_strategy", 0) == 1);
                    ydt.bg(bg(jSONObject.optJSONObject("default")));
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            java.lang.String next = itKeys.next();
                            ydt.bg(next, bg(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                return ydt;
            }

            private com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg bg(org.json.JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                contextBg.registerReceiver(anonymousClass11, intentFilter, 4);
            } else {
                contextBg.registerReceiver(anonymousClass11, intentFilter);
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.SdkSettings", "", e);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void bg() {
        try {
            com.bytedance.sdk.openadsdk.core.settings.bX.bg();
            this.Lq.bX();
            this.Ta.bX();
            this.yDt.bX();
            android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            java.io.File file = new java.io.File(new java.io.File(contextBg.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                contextBg.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void IL(int i, boolean z) {
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        if (contextBg != null) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setPackage(contextBg.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z);
                intent.putExtra("_source", i);
                contextBg.sendBroadcast(intent);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void ews() {
        android.content.Context contextBg;
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX() && (contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg()) != null) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setPackage(contextBg.getPackageName());
                intent.setAction("_dataChanged");
                contextBg.sendBroadcast(intent);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.SdkSettings", "", th);
            }
        }
    }

    public static int IL(android.content.Context context) {
        android.content.SharedPreferences sharedPreferencesEqN;
        if (context == null || (sharedPreferencesEqN = eqN(context)) == null) {
            return -2;
        }
        if ((sharedPreferencesEqN.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE) == Integer.MIN_VALUE && sharedPreferencesEqN.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE) == Integer.MIN_VALUE) ? false : true) {
            return sharedPreferencesEqN.getInt("IABTCF_gdprApplies", -1);
        }
        return -2;
    }

    public static java.lang.String bX(android.content.Context context) {
        android.content.SharedPreferences sharedPreferencesEqN;
        return (context == null || (sharedPreferencesEqN = eqN(context)) == null) ? "" : sharedPreferencesEqN.getString(zx, "");
    }

    private static android.content.SharedPreferences eqN(android.content.Context context) {
        try {
            return android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.settings.ldr zU() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("context is null");
            android.util.Log.e("Pangle", "context is null", illegalStateException);
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("context is null", "context is null", illegalStateException);
            return kMt;
        }
        return com.bytedance.sdk.openadsdk.core.settings.xxp.bg.bg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public synchronized void IL() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z = !this.xxp;
        this.Ta.bg(this.xxp);
        this.yDt.bg(this.xxp);
        this.Lq.bg(this.xxp);
        com.bytedance.sdk.openadsdk.core.settings.bX.bg(z);
        com.bytedance.sdk.openadsdk.core.WR.IL().eqN(mZk());
        this.xxp = true;
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (z) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.7
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.core.settings.yDt.bg()) {
                        com.bytedance.sdk.openadsdk.core.settings.xxp.this.eqN(1);
                        com.bytedance.sdk.openadsdk.core.settings.xxp.this.uny();
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().IL();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String bX() {
        return this.Lq.bg("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int eqN() {
        return this.Lq.bg("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public org.json.JSONObject zx() {
        return (org.json.JSONObject) this.Lq.bg("digest", null, com.bytedance.sdk.openadsdk.core.settings.zx.bg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public long ldr() {
        return this.Lq.bg("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void iR() {
        this.Lq.bg().bg("tt_sdk_settings").bg("ab_test_param").bg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.settings.zx.bg bgVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.Ta ta = this.Lq;
        java.lang.String str = WR;
        java.lang.String strBg = ta.bg("dyn_draw_engine_url", str);
        final java.lang.String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!android.text.TextUtils.isEmpty(strBg) && !android.text.TextUtils.isEmpty(strOptString) && !strOptString.equals(strBg)) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.8
                @Override // java.lang.Runnable
                public void run() {
                    if (android.text.TextUtils.equals(com.bytedance.sdk.openadsdk.core.settings.xxp.this.Lq.bg("dyn_draw_engine_url", com.bytedance.sdk.openadsdk.core.settings.xxp.WR), strOptString)) {
                        com.bytedance.sdk.component.adexpress.bg.IL.zx.IL().bX();
                    }
                }
            }, 5000L);
        }
        bgVar.bg("dyn_draw_engine_url", strOptString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int bg(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        return com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(str).tuV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void IL(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.settings.zx.bg bgVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            bgVar.bg("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Kg() {
        return this.Lq.bg("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean WR() {
        return !(this.Lq.bg("support_tnc", 1) == 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String eo() {
        return this.Lq.bg("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int VB() {
        return this.Lq.bg("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int PX() {
        return this.Lq.bg("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int IL(java.lang.String str) {
        java.lang.Integer num;
        java.util.Map map = (java.util.Map) this.Lq.bg("perf_con_stats_rate", ldr, this.iR);
        if (map == null || (num = (java.lang.Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int Uq(java.lang.String str) {
        java.lang.Integer num;
        java.util.Map map = (java.util.Map) this.Lq.bg("perf_con_applog_rate", null, this.Uw);
        if (map == null || (num = (java.lang.Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int ZTq() {
        return this.Lq.bg("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.util.Set<java.lang.String> Ta() {
        return qSG();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int yDt() {
        qSG();
        return this.Fy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int Lq() {
        qSG();
        return this.tuV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean vb() {
        return this.Lq.bg("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean xxp() {
        return this.Lq.bg("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean VzQ() {
        return this.Lq.bg("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Ny() {
        return this.Lq.bg("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public long eDa() {
        long jBg = this.Lq.bg("bus_con_tnc_interval", com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME);
        if (jBg < 10000) {
            return 10000L;
        }
        return jBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int RFq() {
        int iBg = this.Lq.bg("bus_con_token_thread_count", 4);
        if (iBg <= 0 || iBg > 30) {
            return 4;
        }
        return iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String jA() {
        return this.Lq.bg("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int hff() {
        return this.Lq.bg("bus_con_behavior_count", com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String bu() {
        return this.Lq.bg("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean HXG() {
        return this.Lq.bg("bus_con_url_check", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean FFy() {
        return this.Lq.bg(bg, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int rr() {
        return this.Lq.bg(IL, 10000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public float gtr() {
        return this.Lq.bg(bX, 1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int tuV() {
        return this.Lq.bg("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String Fy() {
        return this.Lq.bg("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public com.bytedance.sdk.openadsdk.core.settings.WR LZ() {
        com.bytedance.sdk.openadsdk.core.settings.WR wr = this.rri;
        if (wr != null) {
            return wr;
        }
        com.bytedance.sdk.openadsdk.core.settings.WR wr2 = (com.bytedance.sdk.openadsdk.core.settings.WR) this.Ta.bg("mediation_init_conf", com.bytedance.sdk.openadsdk.core.settings.WR.bg, new com.bytedance.sdk.openadsdk.core.settings.zx.IL<com.bytedance.sdk.openadsdk.core.settings.WR>() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.core.settings.WR IL(java.lang.String str) {
                return new com.bytedance.sdk.openadsdk.core.settings.WR(str);
            }
        });
        this.rri = wr2;
        return wr2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean tC() {
        return this.Lq.bg("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public long rri() {
        return this.Lq.bg("duration", 10000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int kMt() {
        return this.Lq.bg(com.applovin.sdk.AppLovinMediationProvider.MAX, 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public com.bytedance.sdk.openadsdk.core.settings.iR JAA() {
        return (com.bytedance.sdk.openadsdk.core.settings.iR) this.Lq.bg("insert_js_config", com.bytedance.sdk.openadsdk.core.settings.iR.bg, new com.bytedance.sdk.openadsdk.core.settings.zx.IL<com.bytedance.sdk.openadsdk.core.settings.iR>() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.zx.IL
            /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.core.settings.iR IL(java.lang.String str) {
                return new com.bytedance.sdk.openadsdk.core.settings.iR(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String Ja() {
        return this.Lq.bg("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int Uw() {
        int iBg = this.Lq.bg("fetch_tpl_timeout_ctrl", 3000);
        if (iBg <= 0) {
            return 3000;
        }
        return iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int DDQ() {
        int iBg = this.Lq.bg("fetch_tpl_second", 0);
        if (iBg <= 0) {
            return 0;
        }
        return iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void Uq() {
        java.lang.String strJlG = JlG();
        if (android.text.TextUtils.isEmpty(strJlG)) {
            return;
        }
        if (strJlG.equals("zh-Hant")) {
            com.bytedance.sdk.component.utils.WR.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "zh", "tw");
        } else {
            com.bytedance.sdk.component.utils.WR.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), strJlG, null);
        }
        try {
            com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.onResourceUpdated();
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.SdkSettings", th.getMessage());
        }
    }

    private java.lang.String JlG() {
        return this.Lq.bg("force_language", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean bX(java.lang.String str) {
        return Uw(str).bX == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean eqN(java.lang.String str) {
        return Uw(str).Uq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean zx(java.lang.String str) {
        int i = Uw(str).zx;
        if (i != 1) {
            return i == 2 && com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg()) != 0;
        }
        return com.bytedance.sdk.component.utils.Lq.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean ldr(java.lang.String str) {
        return Uw(str).iR == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int iR(java.lang.String str) {
        return Uw(str).VzQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Kg(java.lang.String str) {
        return str == null || Uw(str).yDt == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int WR(java.lang.String str) {
        if (str == null) {
            return 1500;
        }
        return Uw(str).vb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int eo(java.lang.String str) {
        return Uw(str).VB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int VB(java.lang.String str) {
        return Uw(str).PX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean PX(java.lang.String str) {
        try {
            return Uw(str).rri != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean aGH() {
        return this.Lq.IL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int Ta(java.lang.String str) {
        return Uw(java.lang.String.valueOf(str)).Kg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean yDt(java.lang.String str) {
        return Ta(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int Lq(java.lang.String str) {
        return Uw(str).eo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int bg(java.lang.String str, boolean z) {
        if (str == null) {
            return bX(z);
        }
        com.bytedance.sdk.openadsdk.core.settings.IL ilUw = Uw(str);
        return ilUw.JAA != -1 ? ilUw.JAA : bX(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean vb(java.lang.String str) {
        return Uw(str).tC == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean xxp(java.lang.String str) {
        return str == null || com.bytedance.sdk.openadsdk.utils.DeviceUtils.Kg(com.bytedance.sdk.openadsdk.core.VzQ.bg()) == 0 || Uw(str).Ta == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String VW() {
        return this.Lq.bg("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String VJ() {
        return this.Lq.bg("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String daV() {
        return this.yDt.bg("apm_url", "pangolin16.sgsnssdk.com");
    }

    private int mZk() {
        return this.Lq.bg("coppa", -99);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String ayS() {
        return this.Lq.bg("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int ZQc() {
        return this.Lq.bg("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String LKE() {
        return this.Lq.bg("dyn_draw_engine_url", WR);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String CQc() {
        return this.Lq.bg("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int uu() {
        return this.Lq.bg("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int bg(int i) {
        return Uw(java.lang.String.valueOf(i)).daV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int IL(int i) {
        return Uw(java.lang.String.valueOf(i)).IL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int bX(int i) {
        return Uw(java.lang.String.valueOf(i)).WR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int qC() {
        return this.Lq.bg("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public org.json.JSONObject VzQ(java.lang.String str) {
        org.json.JSONObject jSONObject = null;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(this.Lq.bg("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", Uw(str).RJ);
                return jSONObject2;
            } catch (org.json.JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                com.bytedance.sdk.component.utils.PX.bg("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (org.json.JSONException e2) {
            e = e2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int tuV(java.lang.String str) {
        return Uw(str).Fy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Fy(java.lang.String str) {
        return Uw(str).LZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int LZ(java.lang.String str) {
        return Uw(str).Ja;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int tC(java.lang.String str) {
        return Uw(str).Uw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int rri(java.lang.String str) {
        return Uw(str).DDQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean kMt(java.lang.String str) {
        return Uw(str).VW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int JAA(java.lang.String str) {
        return Uw(str).VJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Ja(java.lang.String str) {
        return com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(str).Lq == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public com.bytedance.sdk.openadsdk.core.settings.IL Uw(java.lang.String str) {
        return com.bytedance.sdk.openadsdk.core.settings.bX.bg(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Dxa() {
        int iBg = this.Lq.bg("privacy_ad_enable", Integer.MAX_VALUE);
        if (iBg == 1) {
            return true;
        }
        if (iBg == 0) {
            return false;
        }
        int iVb = com.bytedance.sdk.openadsdk.utils.ayS.vb();
        return iVb == 1 || iVb == 2 || iVb == 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int bN() {
        int iBg = this.Lq.bg("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iBg != Integer.MAX_VALUE) {
            return iBg;
        }
        int iVb = com.bytedance.sdk.openadsdk.utils.ayS.vb();
        if (iVb == 1 || iVb == 2) {
            return 2;
        }
        return iVb != 3 ? 0 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean RiO() {
        return this.Lq.bg("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Pae() {
        boolean z = this.Lq.bg("bus_con_sec_type", Integer.MAX_VALUE) != 0;
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Boolean.valueOf(z);
        return z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean RJ() {
        return this.Lq.bg("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean txA() {
        return this.Lq.bg("privacy_debug_unlock", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean DDQ(java.lang.String str) {
        java.util.Set set = (java.util.Set) this.Lq.bg("privacy_fields_allowed", java.util.Collections.emptySet(), com.bytedance.sdk.openadsdk.core.settings.zx.IL);
        if (set.isEmpty()) {
            int iVb = com.bytedance.sdk.openadsdk.utils.ayS.vb();
            if (iVb != 1) {
                if (iVb != 2 && iVb != 3) {
                    return false;
                }
                if (!"mcc".equals(str) && !"mnc".equals(str)) {
                    return false;
                }
            }
            return true;
        }
        return set.contains(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean sVc() {
        return this.xxp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean ApA() {
        return this.Lq.bg("global_rate", 1.0f) == 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean GvG() {
        return this.Lq.bg("read_video_from_cache", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int lM() {
        int iBg = this.Lq.bg("perf_con_webview_cache_count", 0);
        if (iBg < 0) {
            return 0;
        }
        return iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int gXn() {
        int iBg = this.Lq.bg("perf_con_webview_cache_count_v3", 0);
        if (iBg < 0) {
            return 0;
        }
        return iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int GZ() {
        int iBg = this.Lq.bg("perf_con_webview_preload_cache", 0);
        if (iBg < 0) {
            return 0;
        }
        if (iBg > 5) {
            return 5;
        }
        int iLM = lM();
        return iBg > iLM ? iLM : iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int bCU() {
        int iBg = this.Lq.bg("perf_con_webview_preload_cache_v3", 0);
        if (iBg < 0) {
            return 0;
        }
        if (iBg > 5) {
            return 5;
        }
        int iGXn = gXn();
        return iBg > iGXn ? iGXn : iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String[] Ld() {
        try {
            java.util.Set<java.lang.String> set = this.eo;
            if (set == null || set.size() == 0) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.Lq.bg("gecko_hosts", (java.lang.String) null));
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.eo.add(jSONArray.getString(i));
                    }
                }
                java.util.Set<java.lang.String> setBg = com.bytedance.sdk.openadsdk.core.settings.Ta.bg(this.eo);
                this.eo = setBg;
                if (setBg != null) {
                    if (setBg.size() == 0) {
                    }
                }
                return null;
            }
            return (java.lang.String[]) this.eo.toArray(new java.lang.String[0]);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int wS() {
        return this.Lq.bg("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public org.json.JSONObject cZH() {
        return (org.json.JSONObject) this.Lq.bg("video_cache_config", null, com.bytedance.sdk.openadsdk.core.settings.zx.bg);
    }

    private long mLT() {
        long jBg = this.Lq.bg("req_inter_min", com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME);
        return (jBg < 0 || jBg > 86400000) ? com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME : jBg;
    }

    private long uV() {
        return this.Lq.bg("last_req_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void bg(long j) {
        this.Lq.bg().bg("last_req_time", j).bg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void zCS() {
        this.VzQ = true;
    }

    void uny() {
        if (com.bytedance.sdk.openadsdk.core.settings.yDt.bg()) {
            com.bytedance.sdk.openadsdk.core.yDt.IL().removeCallbacks(this.Ja);
            com.bytedance.sdk.openadsdk.core.yDt.IL().postDelayed(this.Ja, mLT());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void eqN(int i) {
        bg(i, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void bg(int i, boolean z) {
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx() && i != 1 && i != 2) {
            if (z) {
                this.LZ = true;
                return;
            }
            return;
        }
        try {
            if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.WR.IL().eqN())) {
                return;
            }
            if (this.LZ) {
                this.LZ = false;
                if (!z) {
                    z = true;
                }
            }
            long jUV = uV();
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long jMLT = mLT();
            long j = jCurrentTimeMillis - jUV;
            if (!z && j < jMLT) {
                com.bytedance.sdk.openadsdk.core.eo.bg.bg();
                return;
            }
            if (!com.bytedance.sdk.openadsdk.core.settings.yDt.bg()) {
                IL(i, z);
            } else if (this.vb.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.utils.VJ.IL((com.bytedance.sdk.component.Kg.Kg) new com.bytedance.sdk.openadsdk.core.settings.yDt(this, this.Lq, this.Ta, this.yDt));
                com.bytedance.sdk.openadsdk.core.yDt.IL().removeCallbacks(this.Ja);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.yDt.bg
    public void bg(boolean z) {
        this.vb.set(false);
        uny();
        if (z) {
            ews();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public void bg(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.JAA, intentFilter, 4);
            } else {
                context.registerReceiver(this.JAA, intentFilter);
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.SdkSettings", "", e);
        }
        if (sVc()) {
            eqN(1);
            uny();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.xxp$11, reason: invalid class name */
    class AnonymousClass11 extends android.content.BroadcastReceiver {
        private final java.lang.Runnable IL = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.11.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.core.settings.xxp.this.IL();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                });
            }
        };

        AnonymousClass11() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, final android.content.Intent intent) {
            if (intent == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.xxp.11.2
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        com.bytedance.sdk.openadsdk.core.settings.xxp.this.bg(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.iR.bg().removeCallbacks(com.bytedance.sdk.openadsdk.core.settings.xxp.AnonymousClass11.this.IL);
                        com.bytedance.sdk.component.utils.iR.bg().postDelayed(com.bytedance.sdk.openadsdk.core.settings.xxp.AnonymousClass11.this.IL, 10000L);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean Ys() {
        if (com.bytedance.sdk.component.adexpress.eqN.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg())) {
            return this.Lq.bg("support_rtl", false);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int dS() {
        return this.Lq.bg("bus_con_send_log_type", 1);
    }

    private java.util.Set<java.lang.String> qSG() {
        return (java.util.Set) this.Lq.bg("perf_con_applog_send", this.DDQ, this.Uq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int Dt() {
        return this.Lq.bg("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean jz() {
        int iBg = this.yDt.bg("perf_con_apm", 100);
        if (iBg == 0) {
            return false;
        }
        return iBg < 0 || iBg >= 100 || iBg > ((int) (java.lang.Math.random() * 100.0d));
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public long bOf() {
        return this.Lq.bg("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean xFs() {
        return this.Lq.bg("perf_con_use_new_thread_pool", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean eK() {
        return this.Lq.bg("perf_con_is_new_net_thread", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean bg(com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene == com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.GET_ADS || cryptDataScene == com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            return this.Lq.bg("perf_con_crypt_V4_get_ad", false);
        }
        if (cryptDataScene == com.bytedance.sdk.component.embedapplog.PangleEncryptConstant.CryptDataScene.APP_LOG) {
            return this.Lq.bg("perf_con_crypt_V4_applog", false);
        }
        return this.Lq.bg("perf_con_crypt_V4", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public org.json.JSONObject gCm() {
        return (org.json.JSONObject) this.Lq.bg("perf_con_thread_pool_config", new org.json.JSONObject(), this.aGH);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean kU() {
        return this.Lq.bg("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean qp() {
        return this.Lq.bg("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.lang.String jf() {
        return this.Lq.bg("dual_event_url", (java.lang.String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int huT() {
        int iBg = this.Lq.bg("bus_con_auto_click_delay", 3000);
        if (iBg <= 0) {
            return 3000;
        }
        return iBg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public com.bytedance.sdk.openadsdk.eqN.bg.yDt ZyO() {
        return (com.bytedance.sdk.openadsdk.eqN.bg.yDt) this.Lq.bg("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.eqN.bg.yDt.bg, this.Kg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public int hi() {
        return this.Lq.bg("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public java.util.Set<java.lang.String> ovC() {
        return (java.util.Set) this.Lq.bg("perf_con_drop2rt_skip_label_list", java.util.Collections.emptySet(), com.bytedance.sdk.openadsdk.core.settings.zx.IL);
    }

    public static boolean JxS() {
        return PX;
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.settings.Lq.bg bgVar) {
        java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.sdk.openadsdk.core.settings.Lq.bg> concurrentLinkedQueue = tC;
        if (concurrentLinkedQueue.contains(bgVar)) {
            return;
        }
        concurrentLinkedQueue.add(bgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean IEI() {
        return this.Lq.bg("bus_con_rewardedfull_link", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ldr
    public boolean rgo() {
        return this.Lq.bg("bus_con_video_keep_screen_on", 1) == 1;
    }
}

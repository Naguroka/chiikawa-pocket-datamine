package com.bytedance.sdk.component.iR.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.sdk.component.utils.JAA.bg {
    private static boolean Kg;
    private static com.bytedance.sdk.component.iR.bX.bX WR;
    private static java.util.concurrent.ThreadPoolExecutor eo;
    private final boolean IL;
    private int Lq;
    private final android.content.Context PX;
    private com.bytedance.sdk.component.iR.bg yDt;
    private volatile boolean bX = false;
    private boolean eqN = true;
    private boolean zx = false;
    private long ldr = 0;
    private long iR = 0;
    private java.util.concurrent.atomic.AtomicBoolean VB = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile boolean Ta = false;
    final com.bytedance.sdk.component.utils.JAA bg = com.bytedance.sdk.component.Kg.bg.bg.bg().bg(this, "tt-net");

    public bg(android.content.Context context, int i) {
        this.PX = context;
        this.IL = com.bytedance.sdk.component.utils.VzQ.bg(context);
        this.Lq = i;
    }

    public void bg() {
        bg(false);
    }

    public synchronized void bg(boolean z) {
        if (this.IL) {
            eqN(z);
            return;
        }
        if (this.ldr <= 0) {
            try {
                iR().execute(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.iR.bX.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.iR.bX.bg.this.IL();
                    }
                });
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void IL(boolean z) {
        Kg = z;
    }

    synchronized void IL() {
        if (java.lang.System.currentTimeMillis() - this.ldr > 3600000) {
            this.ldr = java.lang.System.currentTimeMillis();
            try {
                if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).Kg() != null) {
                    com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).Kg().IL();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private void eqN(boolean z) {
        if (this.zx) {
            return;
        }
        if (this.eqN) {
            this.eqN = false;
            this.ldr = 0L;
            this.iR = 0L;
        }
        long j = z ? 360000L : 43200000L;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - this.ldr > j) {
            if (jCurrentTimeMillis - this.iR > com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS || !this.Ta) {
                bX();
            }
        }
    }

    public boolean bX() {
        this.VB.get();
        iR().execute(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.iR.bX.bg.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zBg = com.bytedance.sdk.component.iR.eqN.zx.bg(com.bytedance.sdk.component.iR.bX.bg.this.PX);
                if (zBg) {
                    com.bytedance.sdk.component.iR.bX.bg.this.iR = java.lang.System.currentTimeMillis();
                    if (com.bytedance.sdk.component.iR.bX.bg.this.VB.compareAndSet(false, true)) {
                        com.bytedance.sdk.component.iR.bX.bg.this.bX(zBg);
                    }
                }
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        int i = message.what;
        if (i == 101) {
            this.zx = false;
            this.ldr = java.lang.System.currentTimeMillis();
            if (this.eqN) {
                bg();
            }
            this.VB.set(false);
            return;
        }
        if (i != 102) {
            return;
        }
        this.zx = false;
        if (this.eqN) {
            bg();
        }
        this.VB.set(false);
    }

    public synchronized void eqN() {
        if (this.Ta) {
            return;
        }
        this.Ta = true;
        long j = this.PX.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (j > jCurrentTimeMillis) {
            j = jCurrentTimeMillis;
        }
        this.ldr = j;
        try {
            if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).Kg() != null) {
                com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).Kg().bg();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void zx() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.IL) {
                eqN();
            } else {
                IL();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    void bX(boolean z) {
        eqN();
        this.zx = true;
        if (!z) {
            this.bg.sendEmptyMessage(102);
            return;
        }
        try {
            Kg();
        } catch (java.lang.Exception unused) {
            this.VB.set(false);
        }
    }

    public java.lang.String[] ldr() {
        java.lang.String[] strArrLdr = com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN() != null ? com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN().ldr() : null;
        return (strArrLdr == null || strArrLdr.length <= 0) ? new java.lang.String[0] : strArrLdr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(java.lang.Object obj) throws java.lang.Exception {
        org.json.JSONObject jSONObject;
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new org.json.JSONObject(str);
            if (!"success".equals(jSONObject.getString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            android.content.SharedPreferences.Editor editorEdit = this.PX.getSharedPreferences("ss_app_config", 0).edit();
            editorEdit.putLong("last_refresh_time", java.lang.System.currentTimeMillis());
            editorEdit.apply();
        }
        if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).Kg() == null) {
            return true;
        }
        com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).Kg().bg(jSONObject2);
        return true;
    }

    private boolean Kg() {
        java.lang.String[] strArrLdr = ldr();
        if (strArrLdr != null && strArrLdr.length != 0) {
            bg(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final int i) {
        java.lang.String[] strArrLdr = ldr();
        if (strArrLdr == null || strArrLdr.length <= i) {
            IL(102);
            return;
        }
        java.lang.String str = strArrLdr[i];
        if (android.text.TextUtils.isEmpty(str)) {
            IL(102);
            return;
        }
        try {
            java.lang.String strBg = bg(str);
            if (android.text.TextUtils.isEmpty(strBg)) {
                IL(102);
                return;
            }
            com.bytedance.sdk.component.iR.IL.IL ilBX = WR().bX();
            ilBX.IL(strBg);
            bg(ilBX);
            ilBX.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.component.iR.bX.bg.3
                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                    org.json.JSONObject jSONObject;
                    if (il == null || !il.ldr()) {
                        com.bytedance.sdk.component.iR.bX.bg.this.bg(i + 1);
                        return;
                    }
                    java.lang.String string = null;
                    try {
                        jSONObject = new org.json.JSONObject(il.eqN());
                    } catch (java.lang.Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        com.bytedance.sdk.component.iR.bX.bg.this.bg(i + 1);
                        return;
                    }
                    try {
                        string = jSONObject.getString(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                    } catch (java.lang.Exception unused2) {
                    }
                    if (!"success".equals(string)) {
                        com.bytedance.sdk.component.iR.bX.bg.this.bg(i + 1);
                        return;
                    }
                    try {
                        if (com.bytedance.sdk.component.iR.bX.bg.this.bg(jSONObject)) {
                            com.bytedance.sdk.component.iR.bX.bg.this.IL(101);
                        } else {
                            com.bytedance.sdk.component.iR.bX.bg.this.bg(i + 1);
                        }
                    } catch (java.lang.Exception unused3) {
                    }
                }

                @Override // com.bytedance.sdk.component.iR.bg.bg
                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                    com.bytedance.sdk.component.iR.bX.bg.this.bg(i + 1);
                }
            });
        } catch (java.lang.Throwable th) {
            new java.lang.StringBuilder("try app config exception: ").append(th);
        }
    }

    private com.bytedance.sdk.component.iR.bg WR() {
        if (this.yDt == null) {
            this.yDt = new com.bytedance.sdk.component.iR.bg.C0112bg().bg(10L, java.util.concurrent.TimeUnit.SECONDS).IL(10L, java.util.concurrent.TimeUnit.SECONDS).bX(10L, java.util.concurrent.TimeUnit.SECONDS).bg();
        }
        return this.yDt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(int i) {
        com.bytedance.sdk.component.utils.JAA jaa = this.bg;
        if (jaa != null) {
            jaa.sendEmptyMessage(i);
        }
    }

    private java.lang.String bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://");
        sb.append(str).append("/get_domains/v4/");
        return sb.toString();
    }

    private void bg(com.bytedance.sdk.component.iR.IL.IL il) {
        if (il == null) {
            return;
        }
        android.location.Address addressBg = com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN() != null ? com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN().bg(this.PX) : null;
        if (addressBg != null && addressBg.hasLatitude() && addressBg.hasLongitude()) {
            il.bg("latitude", new java.lang.StringBuilder().append(addressBg.getLatitude()).toString());
            il.bg("longitude", new java.lang.StringBuilder().append(addressBg.getLongitude()).toString());
            java.lang.String locality = addressBg.getLocality();
            if (!android.text.TextUtils.isEmpty(locality)) {
                il.bg("city", android.net.Uri.encode(locality));
            }
        }
        if (this.bX) {
            il.bg("force", "1");
        }
        try {
            il.bg("abi", android.os.Build.SUPPORTED_ABIS[0]);
        } catch (java.lang.Throwable unused) {
        }
        if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN() != null) {
            il.bg(com.json.tk.SESSION_HISTORY_KEY_AD_ID, new java.lang.StringBuilder().append(com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN().bg()).toString());
            il.bg("device_platform", com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN().bX());
            il.bg("channel", com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN().IL());
            il.bg("version_code", new java.lang.StringBuilder().append(com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN().eqN()).toString());
            il.bg("custom_info_1", com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.Lq).eqN().zx());
        }
    }

    public static java.util.concurrent.ExecutorService iR() {
        com.bytedance.sdk.component.iR.bX.bX bXVar = WR;
        java.util.concurrent.ExecutorService threadPool = bXVar != null ? bXVar.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (eo == null) {
            synchronized (com.bytedance.sdk.component.iR.bX.bg.class) {
                if (eo == null) {
                    java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(2, 2, 20L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
                    eo = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return eo;
    }

    public static void bg(com.bytedance.sdk.component.iR.bX.bX bXVar) {
        WR = bXVar;
    }
}

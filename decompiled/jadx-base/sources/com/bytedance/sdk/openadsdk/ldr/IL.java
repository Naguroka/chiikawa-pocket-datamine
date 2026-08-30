package com.bytedance.sdk.openadsdk.ldr;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static volatile com.bytedance.sdk.openadsdk.ldr.IL bg;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.Lq.bg> IL = new java.util.concurrent.ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.Lq.bg bX = null;
    private volatile boolean eqN = false;
    private volatile android.os.HandlerThread zx = null;
    private volatile android.os.Handler ldr = null;
    private java.lang.String iR = "";
    private int Kg = 0;
    private volatile long WR = 0;
    private final java.lang.Runnable eo = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.IL.6
        @Override // java.lang.Runnable
        public void run() {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    if (com.bytedance.sdk.openadsdk.ldr.bg.bg().zx()) {
                        java.util.Set<java.lang.String> setKeySet = com.bytedance.sdk.openadsdk.ldr.IL.this.IL.keySet();
                        if (setKeySet.size() > com.bytedance.sdk.openadsdk.ldr.IL.this.Kg) {
                            com.bytedance.sdk.openadsdk.ldr.IL.this.Kg = setKeySet.size();
                        }
                        java.util.HashSet hashSet = new java.util.HashSet(5);
                        java.util.ArrayList arrayList = new java.util.ArrayList(setKeySet.size());
                        arrayList.addAll(com.bytedance.sdk.openadsdk.ldr.IL.this.IL.values());
                        java.util.Collections.sort(arrayList);
                        for (int i = 0; i < arrayList.size() && i < 5; i++) {
                            hashSet.add(((com.bytedance.sdk.openadsdk.Lq.bg) arrayList.get(i)).IL());
                        }
                        try {
                            for (java.lang.String str : setKeySet) {
                                com.bytedance.sdk.openadsdk.Lq.bg bgVar = (com.bytedance.sdk.openadsdk.Lq.bg) com.bytedance.sdk.openadsdk.ldr.IL.this.IL.get(str);
                                if (bgVar != null) {
                                    org.json.JSONObject jSONObjectBg = bgVar.bg(jSONObject2);
                                    if (hashSet.contains(str)) {
                                        jSONObject.put(str, jSONObjectBg);
                                    }
                                }
                            }
                            jSONObject.put("common", jSONObject2);
                        } catch (org.json.JSONException e) {
                            com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
                        }
                    } else {
                        try {
                            if (com.bytedance.sdk.openadsdk.ldr.IL.this.bX != null) {
                                jSONObject.put("common", com.bytedance.sdk.openadsdk.ldr.IL.this.bX.bg(jSONObject2));
                            }
                        } catch (org.json.JSONException e2) {
                            com.bytedance.sdk.component.utils.PX.IL(e2.getMessage());
                        }
                    }
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
                }
                com.bytedance.sdk.openadsdk.ldr.IL.this.iR = jSONObject.toString();
                com.bytedance.sdk.openadsdk.ldr.IL il = com.bytedance.sdk.openadsdk.ldr.IL.this;
                il.bg(il.eo, com.bytedance.sdk.openadsdk.ldr.bg.bg().eqN());
            } catch (java.lang.OutOfMemoryError e3) {
                com.bytedance.sdk.component.utils.PX.IL(e3.getMessage());
            }
        }
    };

    private android.os.Handler bX() {
        if (this.zx == null || !this.zx.isAlive()) {
            synchronized (com.bytedance.sdk.openadsdk.core.yDt.class) {
                if (this.zx == null || !this.zx.isAlive()) {
                    this.zx = new android.os.HandlerThread("csj_feature", -1);
                    this.zx.start();
                    this.ldr = new android.os.Handler(this.zx.getLooper());
                }
            }
        } else if (this.ldr == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.yDt.class) {
                if (this.ldr == null) {
                    this.ldr = new android.os.Handler(this.zx.getLooper());
                }
            }
        }
        return this.ldr;
    }

    private void bg(java.lang.Runnable runnable) {
        if (com.bytedance.sdk.openadsdk.utils.Uq.bg || runnable == null) {
            return;
        }
        try {
            bX().post(runnable);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.Runnable runnable, long j) {
        if (com.bytedance.sdk.openadsdk.utils.Uq.bg || runnable == null) {
            return;
        }
        try {
            bX().postDelayed(runnable, j);
        } catch (java.lang.Throwable unused) {
        }
    }

    private IL() {
    }

    public static com.bytedance.sdk.openadsdk.ldr.IL bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.bX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.ldr.IL();
                }
            }
        }
        return bg;
    }

    public void bg(org.json.JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.ldr.bg.bg().bX()) {
            try {
                jSONObject.put("feature_data", this.iR);
                eqN();
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
            }
        }
    }

    private void eqN() {
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.WR > 10000) {
            com.bytedance.sdk.openadsdk.yDt.bX.bg("track_feature_result", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.ldr.IL.1
                @Override // com.bytedance.sdk.openadsdk.yDt.IL
                public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                    com.bytedance.sdk.openadsdk.ldr.IL.this.WR = jElapsedRealtime;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, java.lang.String.valueOf(com.bytedance.sdk.openadsdk.ldr.IL.this.Kg));
                    return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("track_feature_result").IL(jSONObject.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && com.bytedance.sdk.openadsdk.ldr.bg.bg().bX()) {
                zx();
                if (com.bytedance.sdk.openadsdk.ldr.bg.bg().zx()) {
                    com.bytedance.sdk.openadsdk.Lq.bg bgVar = this.IL.get(str2);
                    if (bgVar == null) {
                        bgVar = new com.bytedance.sdk.openadsdk.Lq.bg(str2);
                    }
                    bgVar.bg(str, str3);
                    this.IL.put(str2, bgVar);
                    return;
                }
                if (this.bX == null) {
                    this.bX = new com.bytedance.sdk.openadsdk.Lq.bg(str2);
                }
                this.bX.bg(str, str3);
            }
        } catch (java.lang.OutOfMemoryError e) {
            com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
        }
    }

    public void bg(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || !com.bytedance.sdk.openadsdk.ldr.bg.bg().bX()) {
            return;
        }
        if (com.json.j5.v.equals(str) || com.json.z8.CLICK.equals(str) || "dislike".equals(str)) {
            bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.IL.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.ldr.IL.this.bg(str, str2, str3);
                }
            });
            return;
        }
        if (com.bytedance.sdk.openadsdk.ldr.bg.bg().VzQ()) {
            if (android.text.TextUtils.isEmpty(str4)) {
                return;
            }
            if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                return;
            }
        }
        if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
            bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.IL.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.ldr.IL.this.bg(str, str2, str3);
                }
            });
        }
    }

    public void bg(final java.lang.String str, final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (!android.text.TextUtils.isEmpty(str) && com.bytedance.sdk.openadsdk.ldr.bg.bg().bX() && com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
            if (!com.bytedance.sdk.openadsdk.ldr.bg.bg().VzQ() || tuv.JMw() == 8 || tuv.JMw() == 7 || tuv.JMw() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.IL.4
                        @Override // java.lang.Runnable
                        public void run() {
                            java.lang.String strMM = tuv.MM();
                            java.lang.String strWaE = tuv.waE();
                            if (android.text.TextUtils.isEmpty(strMM)) {
                                return;
                            }
                            com.bytedance.sdk.openadsdk.ldr.IL.this.bg(str, strMM, strWaE);
                        }
                    });
                }
            }
        }
    }

    public void bg(final java.lang.String str, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.ldr.bg.bg().bX()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.IL.5
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = tuv;
                    if (tuv2 == null || android.text.TextUtils.isEmpty(tuv2.MM())) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ldr.IL.this.bg(str, tuv.MM(), tuv.waE() + str2);
                }
            });
        }
    }

    private void zx() {
        if (this.eqN) {
            return;
        }
        this.eqN = true;
        bg(this.eo, com.bytedance.sdk.openadsdk.ldr.bg.bg().eqN());
    }

    public void IL() {
        try {
            if (com.bytedance.sdk.openadsdk.ldr.bg.bg().bX()) {
                bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.IL.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.openadsdk.ldr.bg.bg().zx()) {
                            java.util.Iterator it = com.bytedance.sdk.openadsdk.ldr.IL.this.IL.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.Lq.bg bgVar = (com.bytedance.sdk.openadsdk.Lq.bg) com.bytedance.sdk.openadsdk.ldr.IL.this.IL.get((java.lang.String) it.next());
                                if (bgVar != null) {
                                    bgVar.bg();
                                }
                            }
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.ldr.IL.this.bX != null) {
                            com.bytedance.sdk.openadsdk.ldr.IL.this.bX.bg();
                        }
                    }
                });
            }
        } catch (java.lang.OutOfMemoryError e) {
            com.bytedance.sdk.component.utils.PX.IL(e.getMessage());
        }
    }
}

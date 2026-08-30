package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1144a;
    private final android.content.Context b = com.applovin.impl.sdk.j.m();
    private java.lang.String c;

    public java.lang.String c() {
        return com.iab.omid.library.applovin.Omid.getVersion();
    }

    public boolean d() {
        return com.iab.omid.library.applovin.Omid.isActive();
    }

    public pg(com.applovin.impl.sdk.j jVar) {
        this.f1144a = jVar;
    }

    public void i() {
        if (((java.lang.Boolean) this.f1144a.a(com.applovin.impl.sj.f0)).booleanValue()) {
            this.f1144a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1144a.I().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.pg$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.g();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.iab.omid.library.applovin.Omid.activate(this.b);
        this.f1144a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1144a.I().a("OpenMeasurementService", "Init " + (d() ? "succeeded" : com.ironsource.y8.h.t) + " and took " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        }
        h();
    }

    public com.iab.omid.library.applovin.adsession.Partner b() {
        return com.iab.omid.library.applovin.adsession.Partner.createPartner((java.lang.String) this.f1144a.a(com.applovin.impl.sj.g0), com.applovin.sdk.AppLovinSdk.VERSION);
    }

    public java.lang.String a() {
        return this.c;
    }

    private void h() {
        this.f1144a.i0().a((com.applovin.impl.yl) new com.applovin.impl.jn(this.f1144a, "OpenMeasurementService", new java.lang.Runnable() { // from class: com.applovin.impl.pg$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        }), com.applovin.impl.tm.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.c != null) {
            return;
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(this.b.getResources().openRawResource(com.applovin.sdk.R.raw.omsdk_v1_4_12)));
            try {
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    while (true) {
                        java.lang.String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            this.c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        android.util.Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e) {
                            android.util.Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                        }
                        throw th2;
                    }
                }
            } catch (java.io.IOException e2) {
                android.util.Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
            }
        } catch (java.lang.Throwable th3) {
            this.f1144a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1144a.I().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_4_12.js", th3);
            }
        }
    }

    public boolean e() {
        java.lang.String str = this.f1144a.f0().getExtraParameters().get("enable_omsdk_testing");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return java.lang.Boolean.parseBoolean(str);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public java.lang.String a(java.lang.String str) {
        java.lang.String strInjectScriptContentIntoHtml;
        try {
            if (e()) {
                java.lang.String strA = com.applovin.impl.qg.a(this.f1144a);
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                    strInjectScriptContentIntoHtml = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(strA, str);
                } else {
                    strInjectScriptContentIntoHtml = str;
                }
            } else {
                strInjectScriptContentIntoHtml = str;
            }
            return com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(this.c, strInjectScriptContentIntoHtml);
        } catch (java.lang.Throwable th) {
            this.f1144a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1144a.I().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}

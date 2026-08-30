package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.rg f3435a;
    private android.webkit.WebView c;
    private java.lang.String d;
    private java.lang.String e = "tg";
    private java.lang.String[] f = {"handleGetViewVisibility"};
    private final java.lang.String[] g = {com.json.pg.h, com.json.pg.i, com.json.pg.g, "handleGetViewVisibility", com.json.pg.j};
    private com.json.lv b = new com.json.lv();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3436a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ org.json.JSONObject d;

        a(java.lang.String str, java.lang.String str2, java.lang.String str3, org.json.JSONObject jSONObject) {
            this.f3436a = str;
            this.b = str2;
            this.c = str3;
            this.d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!com.json.tg.this.b(this.f3436a)) {
                    java.lang.String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f3436a;
                    android.util.Log.e(com.json.tg.this.e, str);
                    com.json.tg.this.a(this.b, str);
                } else if (this.f3436a.equalsIgnoreCase("handleGetViewVisibility")) {
                    com.json.tg.this.e(this.c);
                } else if (this.f3436a.equalsIgnoreCase(com.json.pg.j) || this.f3436a.equalsIgnoreCase(com.json.pg.i)) {
                    com.json.tg.this.a(this.d.getString("params"), this.c, this.b);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                java.lang.String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f3436a;
                android.util.Log.e(com.json.tg.this.e, str2);
                com.json.tg.this.a(this.b, str2);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3437a;
        final /* synthetic */ java.lang.String b;

        b(java.lang.String str, java.lang.String str2) {
            this.f3437a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.json.tg.this.c.evaluateJavascript(this.f3437a, null);
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                android.util.Log.e(com.json.tg.this.e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.b + "Android API level: " + android.os.Build.VERSION.SDK_INT);
            }
        }
    }

    private java.lang.String a(java.lang.String str) {
        return java.lang.String.format(com.json.pg.u, str);
    }

    private org.json.JSONObject a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            android.util.Log.e(this.e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(java.lang.String str) {
        for (java.lang.String str2 : this.g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        if (this.f3435a == null || this.b == null) {
            return;
        }
        a(com.json.pg.f3159a, a());
    }

    private void d(java.lang.String str) {
        com.json.cg.f2559a.d(new com.ironsource.tg.b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    private boolean h(java.lang.String str) {
        for (java.lang.String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(java.lang.String str) {
        return str.equalsIgnoreCase(com.json.pg.k);
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.json.pg.s, this.b.a());
            jSONObject.put(com.json.pg.p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return new org.json.JSONObject();
        }
    }

    public void a(android.webkit.WebView webView) {
        this.c = webView;
    }

    public void a(com.json.rg rgVar) {
        this.f3435a = rgVar;
    }

    public void a(java.lang.String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.json.rg rgVar = this.f3435a;
        if (rgVar != null) {
            rgVar.a(str, str2, this.d);
        }
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.json.JSONException {
        if (this.c == null) {
            java.lang.String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            android.util.Log.e(this.e, str4);
            this.f3435a.a(str3, str4, this.d);
            return;
        }
        try {
            new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            str = "\"" + str + "\"";
        }
        d(a(str));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.json.rg rgVar = this.f3435a;
        if (rgVar != null) {
            rgVar.a(str, jSONObject);
        }
    }

    void a(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2, java.lang.String str3) {
        if (this.f3435a == null) {
            com.json.gh.a(com.json.ar.t, new com.json.bh().a(com.json.zb.y, "mDelegate is null").a());
        } else {
            com.json.cg.f2559a.d(new com.ironsource.tg.a(str, str3, str2, jSONObject));
        }
    }

    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void b() {
        this.f3435a = null;
        this.b = null;
    }

    public java.lang.String c() {
        return this.d;
    }

    public void c(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String strOptString = jSONObject.optString("method");
            if (android.text.TextUtils.isEmpty(strOptString) || !h(strOptString)) {
                a(jSONObject.optString(com.json.pg.v, com.json.pg.c), jSONObject);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (java.lang.String) null, (java.lang.String) null);
            }
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            android.util.Log.e(this.e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void e() {
        if (this.f3435a == null || this.b == null) {
            return;
        }
        a(com.json.pg.b, a());
    }

    public void e(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObjectA = this.b.a();
        jSONObjectA.put("adViewId", this.d);
        a(str, jSONObjectA);
    }

    public void f(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public void g(java.lang.String str) {
        this.d = str;
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class la {
    private static final int g = (int) java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f984a;
    private final java.util.concurrent.ExecutorService b;
    private final java.util.Map c = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.Set d = java.util.Collections.synchronizedSet(new java.util.HashSet());
    protected final com.applovin.impl.sdk.j e;
    protected final com.applovin.impl.sdk.n f;

    public la(com.applovin.impl.sdk.j jVar) {
        this.e = jVar;
        this.f = jVar.I();
        this.b = java.util.concurrent.Executors.newFixedThreadPool(1, new com.applovin.impl.la.a(jVar));
    }

    class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f985a;

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((java.lang.Integer) this.f985a.a(com.applovin.impl.sj.U)).intValue());
            thread.setUncaughtExceptionHandler(new com.applovin.impl.la.a.C0038a());
            return thread;
        }

        a(com.applovin.impl.sdk.j jVar) {
            this.f985a = jVar;
        }

        /* JADX INFO: renamed from: com.applovin.impl.la$a$a, reason: collision with other inner class name */
        class C0038a implements java.lang.Thread.UncaughtExceptionHandler {
            C0038a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                com.applovin.impl.la.a.this.f985a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.la.a.this.f985a.I().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }
    }

    private void c(com.applovin.impl.ka kaVar, java.lang.Object obj, java.util.List list) {
        java.net.HttpURLConnection httpURLConnection;
        java.lang.Throwable th;
        if (kaVar.a() == com.applovin.impl.ka.b.AD || kaVar.a() == com.applovin.impl.ka.b.USER_SESSION || !com.applovin.impl.yp.a(((java.lang.Integer) this.e.a(com.applovin.impl.sj.D)).intValue())) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) it.next();
            try {
                httpURLConnection = (java.net.HttpURLConnection) a(kaVar, obj, map).openConnection();
                try {
                    int i = g;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", kaVar.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f.a("HealthEventsReporter", kaVar.b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.c.put(kaVar, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    com.applovin.impl.yp.a(httpURLConnection, this.e);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f.d("HealthEventsReporter", "Failed to report " + kaVar.b() + " with extra parameters " + map, th);
                        }
                        com.applovin.impl.yp.a(httpURLConnection, this.e);
                    } catch (java.lang.Throwable th3) {
                        com.applovin.impl.yp.a(httpURLConnection, this.e);
                        throw th3;
                    }
                }
            } catch (java.lang.Throwable th4) {
                httpURLConnection = null;
                th = th4;
            }
        }
    }

    private void d(final com.applovin.impl.ka kaVar, final java.lang.Object obj, java.util.List list) {
        final java.lang.String str = (java.lang.String) this.e.a(com.applovin.impl.sj.E);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        double dA = kaVar.a(this.e);
        if (com.applovin.impl.yp.a(dA)) {
            if (((java.lang.Boolean) this.e.a(com.applovin.impl.sj.K)).booleanValue()) {
                a(str, kaVar, obj, a(kaVar, dA, obj, list));
                return;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final org.json.JSONObject jSONObjectA = a(kaVar, dA, obj, java.util.Collections.singletonList((java.util.Map) it.next()));
                this.b.execute(new java.lang.Runnable() { // from class: com.applovin.impl.la$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(str, kaVar, obj, jSONObjectA);
                    }
                });
            }
        }
    }

    private java.net.URL a(com.applovin.impl.ka kaVar, java.lang.Object obj, java.util.Map map) throws java.io.UnsupportedEncodingException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        java.util.Iterator it = b(kaVar, obj, map).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String strEncode = java.net.URLEncoder.encode((java.lang.String) entry.getKey(), com.adjust.sdk.Constants.ENCODING);
            sb.append(strEncode).append(com.ironsource.y8.i.b).append(java.net.URLEncoder.encode((java.lang.String) entry.getValue(), com.adjust.sdk.Constants.ENCODING));
            if (it.hasNext()) {
                sb.append(com.ironsource.y8.i.c);
            }
        }
        return new java.net.URL(sb.toString());
    }

    private java.util.Map b(com.applovin.impl.ka kaVar, java.lang.Object obj, java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("type", kaVar.b());
        if (kaVar == com.applovin.impl.ka.P || kaVar == com.applovin.impl.ka.d0 || kaVar == com.applovin.impl.ka.b0) {
            if (((java.lang.Boolean) this.e.a(com.applovin.impl.sj.p4)).booleanValue()) {
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("wvvc", java.lang.String.valueOf(com.applovin.impl.sr.d()), map2);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("wvv", com.applovin.impl.sr.c(), map2);
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("wvpn", com.applovin.impl.sr.b(), map2);
            }
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("oglv", this.e.x().E(), map2);
        }
        java.util.Map mapH = this.e.x().H();
        map2.put(com.json.ce.A, java.lang.String.valueOf(mapH.get(com.json.ce.A)));
        map2.put("country_code", java.lang.String.valueOf(mapH.get("country_code")));
        map2.put("cc", this.e.s().getCountryCode());
        map2.put("applovin_random_token", this.e.Z());
        map2.put("compass_random_token", this.e.r());
        map2.put(com.json.ce.v, android.os.Build.MODEL);
        map2.put("brand", android.os.Build.MANUFACTURER);
        map2.put("brand_name", android.os.Build.BRAND);
        map2.put("hardware", android.os.Build.HARDWARE);
        map2.put("revision", android.os.Build.DEVICE);
        map2.put(com.json.ce.y, android.os.Build.VERSION.RELEASE);
        map2.put("api_level", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        map2.put("sdk_version", java.lang.String.valueOf(com.applovin.sdk.AppLovinSdk.VERSION));
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), map2);
        map2.put(com.json.ce.s, (java.lang.String) this.e.a(com.applovin.impl.sj.v));
        a(map2);
        a(obj, map2);
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    public static java.util.Map a(com.applovin.impl.sdk.ad.b bVar) {
        return a(bVar, false, (com.applovin.impl.sdk.j) null);
    }

    public static java.util.Map a(com.applovin.impl.sdk.ad.b bVar, boolean z, com.applovin.impl.sdk.j jVar) {
        java.util.HashMap map = new java.util.HashMap();
        if (bVar != null) {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_domain", bVar.getAdDomain(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_id", java.lang.String.valueOf(bVar.getAdIdNumber()), map);
            com.applovin.mediation.MaxAdFormat maxAdFormatD = bVar.getAdZone().d();
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, maxAdFormatD != null ? maxAdFormatD.getLabel() : null, map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_zone_id", bVar.getAdZone().e(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("clcode", bVar.getClCode(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("dsp_id", bVar.getDspId(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_size", bVar.getSize().getLabel(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putBooleanIfValid("is_persisted_ad", java.lang.Boolean.valueOf(bVar.G0()), map);
            if (z) {
                if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.N)).booleanValue()) {
                    java.util.List listI = bVar.i();
                    java.util.HashMap map2 = new java.util.HashMap();
                    java.util.Iterator it = listI.iterator();
                    while (it.hasNext()) {
                        java.lang.String path = ((android.net.Uri) it.next()).getPath();
                        map2.put(path, android.text.format.Formatter.formatFileSize(com.applovin.impl.sdk.j.m(), new java.io.File(path).length()));
                    }
                    map.put("path", map2.toString());
                }
                if ((bVar instanceof com.applovin.impl.sdk.ad.a) && ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.O)).booleanValue()) {
                    map.put("details", ((com.applovin.impl.sdk.ad.a) bVar).l1());
                }
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(java.lang.String str, com.applovin.impl.ka kaVar, java.lang.Object obj, org.json.JSONObject jSONObject) {
        java.net.HttpURLConnection httpURLConnection = null;
        try {
            java.net.URL url = new java.net.URL(str);
            byte[] bytes = jSONObject.toString().getBytes(com.adjust.sdk.Constants.ENCODING);
            java.net.HttpURLConnection httpURLConnection2 = (java.net.HttpURLConnection) url.openConnection();
            try {
                int i = g;
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", kaVar.b());
                java.io.OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.a("HealthEventsReporter", kaVar.b() + " reported with code " + responseCode);
                }
                this.c.put(kaVar, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                com.applovin.impl.yp.a(httpURLConnection2, this.e);
            } catch (java.lang.Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f.d("HealthEventsReporter", "Failed to report " + kaVar.b(), th);
                    }
                } finally {
                    com.applovin.impl.yp.a(httpURLConnection, this.e);
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private com.applovin.sdk.AppLovinAdSize a(com.applovin.impl.h0 h0Var, com.applovin.impl.sdk.ad.b bVar) {
        com.applovin.sdk.AppLovinAdSize appLovinAdSizeF = h0Var != null ? h0Var.f() : null;
        if (appLovinAdSizeF != null) {
            return appLovinAdSizeF;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }

    private org.json.JSONObject a(com.applovin.impl.ka kaVar, double d, java.lang.Object obj, java.util.List list) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "ts_ms", java.lang.System.currentTimeMillis());
        if (kaVar == com.applovin.impl.ka.P || kaVar == com.applovin.impl.ka.d0 || kaVar == com.applovin.impl.ka.b0) {
            if (((java.lang.Boolean) this.e.a(com.applovin.impl.sj.p4)).booleanValue()) {
                com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "wvvc", java.lang.String.valueOf(com.applovin.impl.sr.d()));
                com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "wvv", com.applovin.impl.sr.c());
                com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "wvpn", com.applovin.impl.sr.b());
            }
            com.applovin.impl.sdk.utils.JsonUtils.putStringIfValid(jSONObject, "oglv", this.e.x().E());
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Map mapH = this.e.x().H();
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, com.json.ce.A, mapH.get(com.json.ce.A));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, com.json.ce.y, mapH.get(com.json.ce.y));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "brand", mapH.get("brand"));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, com.json.ce.v, mapH.get(com.json.ce.v));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "revision", mapH.get("revision"));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "country_code", mapH.get("country_code"));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "cc", this.e.s().getCountryCode());
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "applovin_random_token", this.e.Z());
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(com.applovin.impl.v.b()));
        java.util.Map mapB = this.e.x().B();
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "sdk_version", mapB.get("sdk_version"));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "plugin_version", this.e.a(com.applovin.impl.sj.K3));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "app_version", mapB.get("app_version"));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, com.ironsource.y8.h.V, mapB.get(com.ironsource.y8.h.V));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "first_install", java.lang.Boolean.toString(java.lang.Boolean.TRUE.equals((java.lang.Boolean) mapB.get("first_install_v2"))));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, com.json.ce.s, this.e.a(com.applovin.impl.sj.v));
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject2, "mediation_provider", this.e.N());
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) it.next();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            com.applovin.impl.sdk.utils.JsonUtils.putDouble(jSONObject3, "ts_ms", java.lang.System.currentTimeMillis());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, "type", kaVar.b());
            com.applovin.impl.sdk.utils.JsonUtils.putDouble(jSONObject3, "weight", d);
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject3, "level", "DEBUG");
            a(obj, map);
            com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObject3, (java.util.Map<java.lang.String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        com.applovin.impl.sdk.utils.JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    public static java.util.Map a(com.applovin.impl.fe feVar) {
        java.util.Map mapA = a((com.applovin.impl.oe) feVar);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("bcode", feVar.B(), mapA);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("creative_id", feVar.getCreativeId(), mapA);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", feVar.getAdUnitId(), mapA);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, feVar.getFormat().getLabel(), mapA);
        return mapA;
    }

    private java.util.List a(java.lang.String str) {
        java.util.List<java.lang.Integer> integerList = com.applovin.impl.sdk.utils.JsonUtils.getIntegerList(this.f984a, com.applovin.impl.sdk.utils.StringUtils.getHost(str), null);
        return integerList == null ? com.applovin.impl.sdk.utils.JsonUtils.getIntegerList(this.f984a, "default", null) : integerList;
    }

    private boolean a(com.applovin.impl.ka kaVar, long j) {
        java.lang.Long l = (java.lang.Long) this.c.get(kaVar);
        return java.lang.System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j;
    }

    public void a() {
        this.f984a = com.applovin.impl.sdk.utils.JsonUtils.deserialize((java.lang.String) this.e.a(com.applovin.impl.sj.M));
    }

    public void a(java.lang.String str, java.lang.String str2, int i) {
        a(str, str2, i, new java.util.HashMap());
    }

    public void a(java.lang.String str, java.lang.String str2, int i, java.util.HashMap map) {
        java.util.List listA = a(str2);
        boolean z = listA != null;
        if (z && listA.contains(java.lang.Integer.valueOf(i))) {
            return;
        }
        if (z || i >= 400) {
            map.put("source", str);
            map.put("url", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(str2));
            map.put("code", java.lang.String.valueOf(i));
            a(com.applovin.impl.ka.Y, (java.util.Map) map);
        }
    }

    private void a(java.lang.Object obj, java.util.Map map) {
        if (map == null) {
            return;
        }
        if (obj == null) {
            obj = this.e.B().a();
        }
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", java.lang.Long.toString(((com.applovin.impl.sdk.ad.b) obj).getAdIdNumber()));
        } else if (obj instanceof com.applovin.impl.fe) {
            com.applovin.impl.fe feVar = (com.applovin.impl.fe) obj;
            map.put("fs_ad_network", feVar.getNetworkName());
            map.put("fs_ad_creative_id", feVar.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    private void a(java.util.Map map) {
        java.lang.String packageName;
        android.content.pm.PackageInfo packageInfo;
        try {
            android.content.pm.PackageManager packageManager = com.applovin.impl.sdk.j.m().getPackageManager();
            packageName = com.applovin.impl.sdk.j.m().getPackageName();
            try {
                packageInfo = packageManager.getPackageInfo(packageName, 0);
            } catch (java.lang.Throwable unused) {
                packageInfo = null;
            }
        } catch (java.lang.Throwable unused2) {
            packageName = "";
        }
        map.put(com.ironsource.y8.h.V, packageName);
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", java.lang.String.valueOf(packageInfo != null ? packageInfo.versionCode : 0));
    }

    public void a(final com.applovin.impl.ka kaVar, final java.lang.Object obj, final java.util.List list, long j) {
        if (a(kaVar, j)) {
            return;
        }
        try {
            if (com.applovin.impl.yp.h()) {
                this.b.execute(new java.lang.Runnable() { // from class: com.applovin.impl.la$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(kaVar, obj, list);
                    }
                });
            } else {
                b(kaVar, obj, list);
            }
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f.d("HealthEventsReporter", "Failed to report " + kaVar.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    public void a(com.applovin.impl.ka kaVar, com.applovin.impl.h0 h0Var, com.applovin.impl.sdk.AppLovinError appLovinError) {
        a(kaVar, h0Var, (com.applovin.impl.sdk.ad.b) null, appLovinError);
    }

    private void a(com.applovin.impl.ka kaVar, com.applovin.impl.h0 h0Var, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.AppLovinError appLovinError) {
        if (((java.lang.Boolean) this.e.a(com.applovin.impl.sj.L)).booleanValue() && this.e.y0()) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (bVar != null) {
            map.putAll(a(bVar));
        }
        if (h0Var != null) {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_zone_id", h0Var.e(), map);
            com.applovin.mediation.MaxAdFormat maxAdFormatD = h0Var.d();
            if (maxAdFormatD != null) {
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, maxAdFormatD.getLabel(), map);
            }
        }
        com.applovin.sdk.AppLovinAdSize appLovinAdSizeA = a(h0Var, bVar);
        if (appLovinAdSizeA != null) {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_size", appLovinAdSizeA.getLabel(), map);
        }
        if (appLovinError != null) {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_code", java.lang.String.valueOf(appLovinError.getCode()), map);
        }
        a(kaVar, (java.util.Map) map);
    }

    public void a(com.applovin.impl.ka kaVar, com.applovin.impl.fe feVar) {
        a(kaVar, feVar.getFormat(), feVar.getAdUnitId(), feVar, null);
    }

    public void a(com.applovin.impl.ka kaVar, com.applovin.impl.fe feVar, com.applovin.mediation.MaxError maxError) {
        a(kaVar, feVar.getFormat(), feVar.getAdUnitId(), feVar, maxError);
    }

    public void a(com.applovin.impl.ka kaVar, com.applovin.impl.sdk.ad.b bVar) {
        a(kaVar, bVar != null ? bVar.getAdZone() : null, bVar, (com.applovin.impl.sdk.AppLovinError) null);
    }

    private void a(com.applovin.impl.ka kaVar, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str, com.applovin.impl.fe feVar, com.applovin.mediation.MaxError maxError) {
        java.util.HashMap map = new java.util.HashMap();
        if (feVar != null) {
            map.putAll(a(feVar));
        } else {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_code", java.lang.String.valueOf(maxError.getCode()), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("mediated_network_error_code", java.lang.String.valueOf(maxError.getMediatedNetworkErrorCode()), map);
        }
        a(kaVar, (java.util.Map) map);
    }

    public void a(com.applovin.impl.ka kaVar, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str, com.applovin.mediation.MaxError maxError) {
        a(kaVar, maxAdFormat, str, null, maxError);
    }

    public void a(com.applovin.impl.ka kaVar, java.lang.Object obj, java.util.Map map, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(map);
        a(kaVar, obj, arrayList, j);
    }

    public void a(com.applovin.impl.ka kaVar, java.lang.String str) {
        a(kaVar, str, (java.util.Map) new java.util.HashMap());
    }

    public void a(com.applovin.impl.ka kaVar, java.lang.String str, java.util.Map map) {
        map.put("source", str);
        a(kaVar, map);
    }

    public void a(com.applovin.impl.ka kaVar, java.lang.String str, java.util.Map map, java.lang.String str2) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str2) || this.d.add(str2)) {
            map.put("source", str);
            a(kaVar, str, map);
        }
    }

    public void a(com.applovin.impl.ka kaVar, java.util.Map map) {
        a(kaVar, (java.lang.Object) null, map, 0L);
    }

    public void a(com.applovin.impl.ka kaVar, java.util.Map map, long j) {
        a(kaVar, (java.lang.Object) null, map, j);
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        a(str, str2, th, new java.util.HashMap());
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th, java.util.Map map) {
        a(str + ":" + str2, th, map);
    }

    public void a(java.lang.String str, java.lang.Throwable th) {
        a(str, th, new java.util.HashMap());
    }

    public void a(java.lang.String str, java.lang.Throwable th, java.util.Map map) {
        map.put("source", str);
        map.put("top_main_method", th.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(map);
        for (java.lang.Throwable th2 : th.getSuppressed()) {
            java.util.HashMap map2 = new java.util.HashMap();
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("source", str, map2);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        a(com.applovin.impl.ka.R, (java.lang.Object) null, arrayList, 0L);
    }

    public void a(java.lang.String str, java.lang.String str2, com.applovin.impl.sdk.ad.b bVar) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(a(bVar, true, this.e));
            boolean zK0 = bVar.K0();
            map.put("is_video_stream", java.lang.String.valueOf(zK0));
            if (zK0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).o1(), map);
            } else {
                com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("video_url", bVar.Q(), map);
            }
        }
        a(com.applovin.impl.ka.W, (java.util.Map) map);
    }

    public static java.util.Map a(com.applovin.impl.oe oeVar) {
        java.util.HashMap map = new java.util.HashMap(3);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("network_name", oeVar.c(), map);
        java.lang.String strB = oeVar.b();
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_class", oeVar.b(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_version", com.applovin.impl.ze.a(strB).getAdapterVersion(), map);
        return map;
    }

    public static java.util.Map a(com.applovin.mediation.MaxError maxError) {
        java.util.HashMap map = new java.util.HashMap(4);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_code", java.lang.String.valueOf(maxError.getCode()), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("mediated_network_error_code", java.lang.String.valueOf(maxError.getMediatedNetworkErrorCode()), map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(com.applovin.impl.ka kaVar, java.lang.Object obj, java.util.List list) {
        if (com.applovin.sdk.AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f.a("HealthEventsReporter", "Reporting " + kaVar.b() + " with extra parameters collection " + list);
        }
        c(kaVar, obj, list);
        d(kaVar, obj, list);
    }
}

package com.bykv.vk.openvk.preload.geckox;

/* JADX INFO: compiled from: GeckoHubUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.io.File f1725a;
    private static android.content.Context b;
    private static java.lang.String c;
    private static final java.util.Set<java.lang.String> g = new java.util.HashSet(java.util.Arrays.asList("js", "css", "html", "ico", "jpeg", "jpg", "png", "gif", "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"));
    private java.util.Map.Entry<java.lang.String, org.json.JSONObject> d;
    private java.util.Map.Entry<java.lang.String, org.json.JSONObject> e;
    private com.bykv.vk.openvk.preload.geckox.net.INetWork f;

    /* synthetic */ c(byte b2) {
        this();
    }

    /* JADX INFO: compiled from: GeckoHubUtil.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static com.bykv.vk.openvk.preload.geckox.c f1726a = new com.bykv.vk.openvk.preload.geckox.c(0);
    }

    public static com.bykv.vk.openvk.preload.geckox.c a(android.content.Context context) {
        b = context;
        if (f1725a == null) {
            f1725a = new java.io.File(b.getCacheDir() + java.io.File.separator + "gecko");
        }
        return com.bykv.vk.openvk.preload.geckox.c.a.f1726a;
    }

    public static com.bykv.vk.openvk.preload.geckox.c a() {
        return com.bykv.vk.openvk.preload.geckox.c.a.f1726a;
    }

    private c() {
    }

    public static void a(java.lang.String str) {
        c = str;
    }

    public final void a(java.lang.String str, com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor iStatisticMonitor, java.util.Set<java.lang.String> set, com.bykv.vk.openvk.preload.geckox.net.INetWork iNetWork) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.b bVar = new com.bykv.vk.openvk.preload.geckox.b(new com.bykv.vk.openvk.preload.geckox.b.a(b).b("cca47107bfcbdb211d88f3385aeede40").a("cca47107bfcbdb211d88f3385aeede40").b().b(str).a("9999999.0.0").a(new com.bykv.vk.openvk.preload.geckox.a.a.a.C0074a().a().a(com.bykv.vk.openvk.preload.geckox.a.a.b.b).b()).a(f1725a).a().c(c).a(iStatisticMonitor).a(iNetWork), (byte) 0);
        this.f = iNetWork;
        com.bykv.vk.openvk.preload.geckox.a aVarA = com.bykv.vk.openvk.preload.geckox.a.a(bVar);
        java.util.HashMap map = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator<java.lang.String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(new com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel(it.next()));
        }
        map.put("cca47107bfcbdb211d88f3385aeede40", linkedList);
        aVarA.a(map);
    }

    private static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    private org.json.JSONObject a(java.lang.String str, java.lang.String str2) {
        if (str != null && str2 != null) {
            try {
                java.util.Map.Entry<java.lang.String, org.json.JSONObject> entry = this.d;
                if (entry == null || !str.equals(entry.getKey())) {
                    java.lang.String strA = com.bykv.vk.openvk.preload.geckox.utils.b.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1725a).getInputStream(str + "/manifest.json"));
                    if (android.text.TextUtils.isEmpty(strA)) {
                        return null;
                    }
                    this.d = new java.util.AbstractMap.SimpleEntry(str, new org.json.JSONObject(strA));
                }
                java.util.Map.Entry<java.lang.String, org.json.JSONObject> entry2 = this.e;
                if (entry2 == null || !str.equals(entry2.getKey())) {
                    java.lang.String strA2 = com.bykv.vk.openvk.preload.geckox.utils.b.a(new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1725a).getInputStream(str + "/md5_url_map.json"));
                    if (android.text.TextUtils.isEmpty(strA2)) {
                        return null;
                    }
                    this.e = new java.util.AbstractMap.SimpleEntry(str, new org.json.JSONObject(strA2));
                }
                org.json.JSONObject value = this.d.getValue();
                org.json.JSONObject value2 = this.e.getValue();
                java.lang.String strA3 = a(str2, value2);
                if (value.has(strA3)) {
                    org.json.JSONObject jSONObject = value.getJSONObject(strA3);
                    a(value, strA3, str2);
                    return jSONObject;
                }
                java.lang.String strB = b(str2);
                if (strB == null) {
                    return null;
                }
                java.lang.String strA4 = a(strB, value2);
                if (value.has(strA4)) {
                    org.json.JSONObject jSONObject2 = value.getJSONObject(strA4);
                    a(value, strA4, str2);
                    return jSONObject2;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    private static java.lang.String a(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str).getString("md5");
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    private void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        try {
            if ("once".equals(jSONObject.getJSONObject(str).optJSONObject("cacheStrategy").optString("hitStrategy"))) {
                jSONObject.remove(str);
                c(str2);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private void c(java.lang.String str) {
        try {
            if (this.f == null || android.text.TextUtils.isEmpty(str)) {
                return;
            }
            this.f.syncDoGet(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static com.bykv.vk.openvk.preload.falconx.loader.a b() {
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1725a);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void a(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader) {
        if (iLoader != null) {
            try {
                iLoader.release();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public final com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel a(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, java.lang.String str, java.lang.String str2) {
        try {
            if (iLoader == null) {
                return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(-1, null);
            }
            boolean z = false;
            if (!android.text.TextUtils.isEmpty(str2) && !str2.matches("^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js") && !str2.matches("^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)") && !str2.matches("^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel") && !str2.matches("https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js") && !str2.matches("https?:\\/\\/mc\\.yandex\\.ru\\/") && !str2.contains("jsonp") && !str2.contains("Callback") && !str2.contains("analytics.tiktok.com/i18n/pixel") && !str2.contains("google-analytics.com/analytics") && !str2.contains("connect.facebook.net")) {
                z = true;
            }
            if (!z) {
                return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(1, null);
            }
            org.json.JSONObject jSONObjectA = a(str, str2);
            java.util.Set<java.lang.String> set = g;
            java.lang.String strB = b(str2);
            int iLastIndexOf = strB.lastIndexOf(".");
            int i = set.contains(iLastIndexOf == -1 ? "" : strB.substring(iLastIndexOf + 1)) ? 2 : -1;
            if (jSONObjectA == null) {
                return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(i, null);
            }
            java.lang.String strOptString = jSONObjectA.optString(com.ironsource.rc.c.b, null);
            if (strOptString == null) {
                return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(i, null);
            }
            org.json.JSONObject jSONObject = jSONObjectA.has("respHeader") ? jSONObjectA.getJSONObject("respHeader") : null;
            if (jSONObject == null) {
                return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(i, null);
            }
            java.lang.String str3 = str + java.io.File.separator + strOptString;
            java.io.InputStream inputStream = !iLoader.exist(str3) ? null : iLoader.getInputStream(str3);
            if (inputStream == null) {
                return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(i, null);
            }
            java.util.HashMap map = new java.util.HashMap();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(i, com.bykv.vk.openvk.preload.falconx.a.a.a(inputStream, map));
        } catch (java.lang.Throwable unused) {
            return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(-1, null);
        }
    }

    public static int a(com.bykv.vk.openvk.preload.falconx.loader.ILoader iLoader, java.lang.String str) {
        if (iLoader == null || str == null) {
            return 0;
        }
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(b, "cca47107bfcbdb211d88f3385aeede40", f1725a).a(str + java.io.File.separator);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }
}

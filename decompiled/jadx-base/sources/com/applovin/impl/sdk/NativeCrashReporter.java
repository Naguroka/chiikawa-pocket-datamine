package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class NativeCrashReporter implements com.applovin.impl.sdk.g.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1270a;
    private static boolean b;
    private static final com.applovin.impl.sdk.NativeCrashReporter c = new com.applovin.impl.sdk.NativeCrashReporter();

    private NativeCrashReporter() {
    }

    public static void a(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            return;
        }
        if (!((java.lang.Boolean) jVar.a(com.applovin.impl.sj.s4)).booleanValue() && !com.applovin.impl.yp.i(com.applovin.impl.sdk.j.m())) {
            if (b) {
                try {
                    com.applovin.impl.sdk.g gVarK = jVar.k();
                    com.applovin.impl.sdk.NativeCrashReporter nativeCrashReporter = c;
                    gVarK.a(nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (java.lang.Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    jVar.D().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            java.util.List listC = jVar.c(com.applovin.impl.sj.t4);
            int[] iArr = new int[listC.size()];
            for (int i = 0; i < listC.size(); i++) {
                try {
                    iArr[i] = java.lang.Integer.parseInt((java.lang.String) listC.get(i));
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            java.io.File file = new java.io.File(com.applovin.impl.sdk.j.m().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, jVar);
            } else if (!file.mkdir()) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                com.applovin.impl.sdk.NativeCrashReporter nativeCrashReporter2 = c;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.u4)).booleanValue());
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(com.applovin.impl.sdk.g.c.SHOW);
                hashSet.add(com.applovin.impl.sdk.g.c.CLICK);
                hashSet.add(com.applovin.impl.sdk.g.c.SHOW_ERROR);
                hashSet.add(com.applovin.impl.sdk.g.c.DESTROY);
                jVar.k().a(nativeCrashReporter2, hashSet);
            } catch (java.lang.Throwable th2) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                jVar.D().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.g.b bVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "ad_unit_id", bVar.a());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, bVar.g());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "network_name", bVar.c());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "adapter_class", bVar.b());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "adapter_version", bVar.d());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "bcode", bVar.e());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "creative_id", bVar.f());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "operation", bVar.i().toString());
        updateAdInfo(bVar.h(), jSONObject.toString());
    }

    private native void disable();

    private native void enable(java.lang.String str, int[] iArr, boolean z);

    private native void removeAdInfo(int i);

    private native void updateAdInfo(int i, java.lang.String str);

    private static boolean a() {
        if (!f1270a) {
            f1270a = true;
            try {
                java.lang.System.loadLibrary("applovin-native-crash-reporter");
                b = true;
            } catch (java.lang.Throwable th) {
                com.applovin.impl.sdk.n.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    private static void a(java.io.File file, com.applovin.impl.sdk.j jVar) throws java.lang.Throwable {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (java.io.File file2 : fileArrListFiles) {
            java.lang.String strE = jVar.A().e(file2);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strE)) {
                java.lang.String[] strArrSplit = strE.split("@@@@@");
                if (strArrSplit.length == 3) {
                    try {
                        java.lang.String str = strArrSplit[0];
                        java.lang.String str2 = strArrSplit[1];
                        org.json.JSONArray jSONArray = new org.json.JSONArray(strArrSplit[2]);
                        if (jSONArray.length() == 0) {
                            jVar.D().a(com.applovin.impl.ka.X, str2, (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("error_message", str));
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
                            for (int i = 0; i < jSONArray.length(); i++) {
                                org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
                                if (jSONObject != null) {
                                    java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("error_message", str);
                                    mapHashMap.putAll(com.applovin.impl.sdk.utils.JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(mapHashMap);
                                }
                            }
                            jVar.D().a(com.applovin.impl.ka.X, str2, arrayList, 0L);
                        }
                    } catch (java.lang.Throwable th) {
                        jVar.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            jVar.I().a("NativeCrashReporter", "Failed to symbolicate native crash report", th);
                        }
                    }
                } else {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                    }
                }
            } else {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                }
            }
            try {
                if (!file2.delete()) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                    }
                }
            } catch (java.lang.Throwable th2) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath(), th2);
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.g.d
    public void a(final com.applovin.impl.sdk.g.b bVar) {
        if (bVar.i() == com.applovin.impl.sdk.g.c.DESTROY) {
            removeAdInfo(bVar.h());
        } else {
            com.applovin.impl.yp.a(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.NativeCrashReporter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(bVar);
                }
            });
        }
    }
}

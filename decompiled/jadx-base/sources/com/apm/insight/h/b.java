package com.apm.insight.h;

/* JADX INFO: compiled from: NpthSoData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.lang.String> f408a;
    private java.util.Map<java.lang.String, java.lang.String> b;

    public static java.lang.String a(java.lang.String str) {
        return com.apm.insight.e.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static java.lang.String a() {
        return com.apm.insight.e.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static void b(final java.lang.String str) {
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.h.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f409a = false;

            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String strA;
                com.apm.insight.h.b.b();
                if (com.apm.insight.h.b.c(str)) {
                    return;
                }
                com.apm.insight.runtime.p.a("updateSo", str);
                java.io.File file = new java.io.File(com.apm.insight.h.b.a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                java.lang.String str2 = "doUnpackLibrary: " + str;
                if (com.apm.insight.e.i().isDebugMode()) {
                    android.util.Log.w("npth", str2);
                }
                try {
                    strA = com.apm.insight.h.c.a(com.apm.insight.e.g(), str, file);
                } catch (java.lang.Throwable th) {
                    com.apm.insight.runtime.p.a("updateSoError", str);
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                    strA = null;
                }
                if (strA == null) {
                    com.apm.insight.h.b.f408a.put(file.getName(), "1.3.8.nourl-rc.1");
                    try {
                        com.apm.insight.l.f.a(new java.io.File(com.apm.insight.e.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver"), "1.3.8.nourl-rc.1", false);
                    } catch (java.lang.Throwable unused) {
                    }
                    com.apm.insight.runtime.p.a("updateSoSuccess", str);
                    return;
                }
                if (!this.f409a) {
                    this.f409a = true;
                    com.apm.insight.runtime.p.a("updateSoPostRetry", str);
                    com.apm.insight.runtime.n.a().a(this, androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    return;
                }
                com.apm.insight.runtime.p.a("updateSoFailed", str);
            }
        });
    }

    static /* synthetic */ void b() {
        if (f408a == null) {
            f408a = new java.util.HashMap<>();
            java.io.File file = new java.io.File(com.apm.insight.e.g().getFilesDir(), "/apminsight/selflib/");
            java.lang.String[] list = file.list();
            if (list != null) {
                for (java.lang.String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f408a.put(str.substring(0, str.length() - 4), com.apm.insight.l.f.a(file.getAbsolutePath() + "/" + str, "\n"));
                        } catch (java.lang.Throwable th) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                        }
                    } else if (!str.endsWith(".so")) {
                        com.apm.insight.l.f.a(new java.io.File(file, str));
                    }
                }
            }
        }
    }

    static /* synthetic */ boolean c(java.lang.String str) {
        return "1.3.8.nourl-rc.1".equals(f408a.get(str)) && new java.io.File(a(str)).exists();
    }

    public b(java.io.File file) {
        java.lang.String strA;
        java.io.File fileC = com.apm.insight.l.j.c(file);
        if (!fileC.exists() || fileC.length() == 0 || (strA = com.apm.insight.nativecrash.NativeImpl.a(fileC.getAbsolutePath())) == null) {
            return;
        }
        java.lang.String[] strArrSplit = strA.split("\n");
        this.b = new java.util.HashMap();
        for (java.lang.String str : strArrSplit) {
            java.lang.String[] strArrSplit2 = str.split(com.ironsource.y8.i.b);
            if (strArrSplit2.length == 2) {
                this.b.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    public final boolean d() {
        java.util.Map<java.lang.String, java.lang.String> map = this.b;
        return (map == null || map.isEmpty() || android.text.TextUtils.isEmpty(this.b.get("process_name")) || android.text.TextUtils.isEmpty(this.b.get("crash_thread_name")) || android.text.TextUtils.isEmpty(this.b.get("pid")) || android.text.TextUtils.isEmpty(this.b.get(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY)) || android.text.TextUtils.isEmpty(this.b.get("start_time")) || android.text.TextUtils.isEmpty(this.b.get("crash_time")) || android.text.TextUtils.isEmpty(this.b.get("signal_line"))) ? false : true;
    }

    public final java.lang.String e() {
        return this.b.get("signal_line");
    }

    public final java.util.Map<java.lang.String, java.lang.String> f() {
        return this.b;
    }
}

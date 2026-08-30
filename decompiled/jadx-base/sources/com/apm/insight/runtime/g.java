package com.apm.insight.runtime;

/* JADX INFO: compiled from: CrashTimes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f480a;
    private java.util.HashMap<java.lang.String, java.lang.Long> b;
    private int c;
    private int d;

    public g(android.content.Context context) {
        this.b = null;
        this.c = 50;
        this.d = 100;
        this.f480a = context;
        this.b = b();
        this.c = com.apm.insight.runtime.a.a(this.c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.d = com.apm.insight.runtime.a.a(this.d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private java.util.HashMap<java.lang.String, java.lang.Long> b() {
        java.io.File fileH = com.apm.insight.l.j.h(this.f480a);
        java.util.HashMap<java.lang.String, java.lang.Long> map = new java.util.HashMap<>();
        map.put("time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        try {
            org.json.JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (com.apm.insight.a.a(jSONArrayA)) {
                return map;
            }
            java.lang.Long lDecode = java.lang.Long.decode(jSONArrayA.optString(0, null));
            if (java.lang.System.currentTimeMillis() - lDecode.longValue() <= 86400000) {
                map.put("time", lDecode);
                for (int i = 1; i < jSONArrayA.length(); i++) {
                    java.lang.String[] strArrSplit = jSONArrayA.optString(i, "").split(" ");
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], java.lang.Long.decode(strArrSplit[1]));
                    }
                }
                return map;
            }
            java.io.File fileG = com.apm.insight.l.j.g(this.f480a);
            fileH.renameTo(new java.io.File(fileG, java.lang.String.valueOf(java.lang.System.currentTimeMillis())));
            java.lang.String[] list = fileG.list();
            if (list != null && list.length > 5) {
                java.util.Arrays.sort(list);
                new java.io.File(fileG, list[0]).delete();
            }
            return map;
        } catch (java.io.IOException unused) {
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
    }

    public final void a() throws java.lang.Throwable {
        java.util.HashMap<java.lang.String, java.lang.Long> map = this.b;
        java.lang.Long lRemove = map.remove("time");
        if (lRemove == null) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(new java.lang.RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(lRemove).append('\n');
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : map.entrySet()) {
            sbAppend.append(entry.getKey()).append(' ').append(entry.getValue()).append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f480a), sbAppend.toString(), false);
        } catch (java.io.IOException unused) {
        }
    }

    public final boolean a(java.lang.String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.insight.l.c.AnonymousClass1.a(this.b, str, 1L).longValue() < ((long) this.c) && com.apm.insight.l.c.AnonymousClass1.a(this.b, androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, 1L).longValue() < ((long) this.d);
    }
}

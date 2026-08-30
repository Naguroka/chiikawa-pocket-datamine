package com.apm.insight.runtime;

/* JADX INFO: compiled from: ProcessTrack.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.io.File f493a;

    public static java.io.File a(long j) {
        return new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    public static java.util.HashMap<java.lang.String, com.apm.insight.runtime.p.a> a(long j, java.lang.String str) throws java.lang.Throwable {
        java.io.File file = new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        java.lang.String[] list = file.list();
        java.util.HashMap<java.lang.String, com.apm.insight.runtime.p.a> map = new java.util.HashMap<>();
        if (list != null) {
            for (java.lang.String str2 : list) {
                java.io.File file2 = new java.io.File(file, str2);
                long length = file2.length();
                try {
                    org.json.JSONArray jSONArrayA = com.apm.insight.l.f.a(file2, length > 1048576 ? length - 524288 : 0L);
                    for (int length2 = jSONArrayA.length() - 1; length2 >= 0; length2--) {
                        java.lang.String strOptString = jSONArrayA.optString(length2);
                        if (!android.text.TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', ':').replace(".txt", ""), new com.apm.insight.runtime.p.a(strOptString));
                            break;
                        }
                    }
                } catch (java.io.IOException unused) {
                }
            }
        }
        return map;
    }

    /* JADX INFO: compiled from: ProcessTrack.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f494a;
        private java.lang.String b;
        private long c;

        a(java.lang.String str) {
            java.lang.String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length == 3) {
                this.b = strArrSplit[0];
                this.f494a = strArrSplit[1];
                try {
                    this.c = java.lang.Long.parseLong(strArrSplit[2]);
                    return;
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(new java.lang.RuntimeException("err ProcessTrack line:".concat(java.lang.String.valueOf(str)), th), "NPTH_CATCH");
                    return;
                }
            }
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(new java.lang.RuntimeException("err ProcessTrack line:".concat(java.lang.String.valueOf(str))), "NPTH_CATCH");
        }
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        java.io.File file;
        try {
            if (f493a == null) {
                java.lang.String strD = com.apm.insight.l.a.d(com.apm.insight.e.g());
                if (strD == null) {
                    file = null;
                } else {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    f493a = new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + '/' + strD.replace(':', '_') + ".txt");
                    file = f493a;
                }
            } else {
                file = f493a;
            }
            if (file != null) {
                com.apm.insight.l.f.a(file, str + ' ' + str2 + ' ' + java.lang.System.currentTimeMillis() + '\n', true);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}

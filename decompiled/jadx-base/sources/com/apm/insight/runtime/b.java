package com.apm.insight.runtime;

/* JADX INFO: compiled from: AppAliveTrack.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f474a = -30000;
    private static java.io.File b;

    public static void a(long j) throws java.lang.Throwable {
        if (j - f474a < 30000) {
            return;
        }
        f474a = j;
        try {
            if (b == null) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                b = new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + "/" + com.apm.insight.e.f());
            }
            com.apm.insight.l.f.a(b, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), false);
        } catch (java.io.IOException unused) {
        }
    }

    public static java.lang.String a(long j, java.lang.String str) {
        try {
            return com.apm.insight.l.f.a(new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str), "\n");
        } catch (java.lang.Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        java.io.File file = new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/");
        java.lang.String[] list = file.list();
        if (list != null && list.length > 5) {
            java.util.Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                com.apm.insight.l.f.a(new java.io.File(file, list[i]));
            }
        }
    }
}

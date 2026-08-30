package com.apm.insight.k;

/* JADX INFO: compiled from: CrashUploadHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.k.c> f424a = new java.util.concurrent.ConcurrentLinkedQueue<>();

    static void a(com.apm.insight.CrashType crashType, org.json.JSONObject jSONObject) {
        java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.k.c> concurrentLinkedQueue = f424a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new com.apm.insight.k.c.a(jSONObject, crashType);
        while (!f424a.isEmpty()) {
            f424a.poll();
        }
        f424a = null;
    }

    /* JADX INFO: compiled from: CrashUploadHandler.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.json.JSONObject f426a;
        private org.json.JSONObject b;
        private com.apm.insight.CrashType c;

        a(org.json.JSONObject jSONObject, com.apm.insight.CrashType crashType) {
            this.c = crashType;
            if (crashType == com.apm.insight.CrashType.LAUNCH) {
                this.f426a = ((org.json.JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f426a = jSONObject;
            }
            this.b = jSONObject.optJSONObject("header");
        }

        public final java.lang.String a() {
            return this.f426a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f426a.optInt("app_start_time", -1);
        }

        public final java.lang.String c() {
            int i = com.apm.insight.k.c.AnonymousClass1.f425a[this.c.ordinal()];
            if (i == 1) {
                return this.f426a.optString("data", null);
            }
            if (i == 2) {
                return this.f426a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f426a.optString("data", null);
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CrashUploadHandler.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f425a;

        static {
            int[] iArr = new int[com.apm.insight.CrashType.values().length];
            f425a = iArr;
            try {
                iArr[com.apm.insight.CrashType.JAVA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f425a[com.apm.insight.CrashType.LAUNCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f425a[com.apm.insight.CrashType.NATIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}

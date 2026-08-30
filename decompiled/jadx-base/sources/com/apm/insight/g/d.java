package com.apm.insight.g;

/* JADX INFO: compiled from: JavaCrash.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.apm.insight.g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f404a;

    @Override // com.apm.insight.g.c
    public final void a(final long j, final java.lang.Thread thread, final java.lang.Throwable th, final java.lang.String str, final java.lang.String str2, final boolean z) {
        final java.io.File file = new java.io.File(com.apm.insight.l.j.a(this.f404a), str);
        com.apm.insight.g.a.a().a(file.getName());
        file.mkdirs();
        com.apm.insight.l.f.d(file);
        final boolean zC = com.apm.insight.l.m.c(th);
        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.JAVA, new com.apm.insight.runtime.a.c.a() { // from class: com.apm.insight.g.d.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f405a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
                this.f405a = android.os.SystemClock.uptimeMillis();
                if (i == 0) {
                    aVar.a("data", (java.lang.Object) com.apm.insight.l.m.a(th));
                    aVar.a("isOOM", java.lang.Boolean.valueOf(zC));
                    aVar.a("isJava", (java.lang.Object) 1);
                    aVar.a("crash_time", java.lang.Long.valueOf(j));
                    aVar.a("launch_mode", java.lang.Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", java.lang.Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    java.lang.String str3 = str2;
                    if (str3 != null) {
                        aVar.a("crash_md5", (java.lang.Object) str3);
                        aVar.a("crash_md5", str2);
                        boolean z2 = z;
                        if (z2) {
                            aVar.a("has_ignore", java.lang.String.valueOf(z2));
                        }
                    }
                } else if (i == 1) {
                    java.lang.Thread thread2 = thread;
                    aVar.a("crash_thread_name", (java.lang.Object) (thread2 != null ? thread2.getName() : ""));
                    aVar.a(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY, java.lang.Integer.valueOf(android.os.Process.myTid()));
                    boolean zHasCrashWhenJavaCrash = com.apm.insight.Npth.hasCrashWhenJavaCrash();
                    java.lang.String str4 = com.json.mediationsdk.metadata.a.g;
                    aVar.a("crash_after_crash", zHasCrashWhenJavaCrash ? com.json.mediationsdk.metadata.a.g : "false");
                    if (!com.apm.insight.nativecrash.NativeImpl.e()) {
                        str4 = "false";
                    }
                    aVar.a("crash_after_native", str4);
                    com.apm.insight.g.a.a().a(thread, th, false, aVar);
                } else if (i == 2) {
                    if (zC) {
                        com.apm.insight.l.a.a(com.apm.insight.g.d.this.f404a, aVar.c());
                    }
                    org.json.JSONArray jSONArrayB = com.apm.insight.b.f.b().b();
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    org.json.JSONObject jSONObjectA = com.apm.insight.b.f.b().a(jUptimeMillis).a();
                    org.json.JSONArray jSONArrayA = com.apm.insight.b.j.a(jUptimeMillis);
                    aVar.a("history_message", (java.lang.Object) jSONArrayB);
                    aVar.a("current_message", jSONObjectA);
                    aVar.a("pending_messages", (java.lang.Object) jSONArrayA);
                    aVar.a("disable_looper_monitor", java.lang.String.valueOf(com.apm.insight.runtime.a.c()));
                    aVar.a("npth_force_apm_crash", java.lang.String.valueOf(com.apm.insight.c.a.a()));
                } else if (i == 3) {
                    org.json.JSONObject jSONObjectB = com.apm.insight.l.m.b(java.lang.Thread.currentThread().getName());
                    if (jSONObjectB != null) {
                        aVar.a("all_thread_stacks", jSONObjectB);
                    }
                    aVar.a("logcat", (java.lang.Object) com.apm.insight.runtime.i.a(com.apm.insight.e.f()));
                } else if (i != 4) {
                    if (i == 5) {
                        aVar.a("crash_uuid", (java.lang.Object) str);
                    }
                } else if (!zC) {
                    com.apm.insight.l.a.a(com.apm.insight.g.d.this.f404a, aVar.c());
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a b(int i, com.apm.insight.entity.a aVar) {
                try {
                    com.apm.insight.l.f.a(new java.io.File(file, file.getName() + "." + i), aVar.c());
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
                return aVar;
            }
        });
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j;
        try {
            aVarA.a("crash_type", com.adjust.sdk.Constants.NORMAL);
            aVarA.b("crash_cost", java.lang.String.valueOf(jCurrentTimeMillis));
            aVarA.a("crash_cost", java.lang.String.valueOf(jCurrentTimeMillis / 1000));
        } catch (java.lang.Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th2, "NPTH_CATCH");
        }
    }

    public d(android.content.Context context) {
        this.f404a = context;
    }
}

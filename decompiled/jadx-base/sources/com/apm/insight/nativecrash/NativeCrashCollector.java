package com.apm.insight.nativecrash;

/* JADX INFO: loaded from: classes3.dex */
public class NativeCrashCollector {
    public static int a() {
        return 6;
    }

    public static void onNativeCrash(final java.lang.String str) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.apm.insight.a.a((java.lang.Object) "[onNativeCrash] enter");
        try {
            com.apm.insight.k.b.a().b();
            final java.io.File fileE = com.apm.insight.l.j.e(new java.io.File(com.apm.insight.l.j.a(), com.apm.insight.e.f()));
            com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.NATIVE, new com.apm.insight.runtime.a.c.a() { // from class: com.apm.insight.nativecrash.NativeCrashCollector.1
                @Override // com.apm.insight.runtime.a.c.a
                public final com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
                    java.lang.String str2 = com.json.mediationsdk.metadata.a.g;
                    if (i == 1) {
                        java.lang.String str3 = str;
                        if (str3 != null && str3.length() != 0) {
                            aVar.a("java_data", (java.lang.Object) com.apm.insight.nativecrash.NativeCrashCollector.b(str));
                        }
                        if (!com.apm.insight.Npth.hasCrashWhenNativeCrash()) {
                            str2 = "false";
                        }
                        aVar.a("crash_after_crash", str2);
                    } else if (i == 2) {
                        org.json.JSONArray jSONArrayB = com.apm.insight.b.f.b().b();
                        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                        org.json.JSONObject jSONObjectA = com.apm.insight.b.f.b().a(jUptimeMillis).a();
                        org.json.JSONArray jSONArrayA = com.apm.insight.b.j.a(jUptimeMillis);
                        aVar.a("history_message", (java.lang.Object) jSONArrayB);
                        aVar.a("current_message", jSONObjectA);
                        aVar.a("pending_messages", (java.lang.Object) jSONArrayA);
                        aVar.a("disable_looper_monitor", java.lang.String.valueOf(com.apm.insight.runtime.a.c()));
                        aVar.a("npth_force_apm_crash", java.lang.String.valueOf(com.apm.insight.c.a.a()));
                    } else if (i != 3) {
                        if (i == 4) {
                            com.apm.insight.l.a.a(com.apm.insight.e.g(), aVar.c());
                        }
                    } else if (com.apm.insight.runtime.a.d()) {
                        aVar.a("all_thread_stacks", com.apm.insight.l.m.b(str));
                        aVar.a("has_all_thread_stack", com.json.mediationsdk.metadata.a.g);
                    }
                    return aVar;
                }

                @Override // com.apm.insight.runtime.a.c.a
                public final com.apm.insight.entity.a b(int i, com.apm.insight.entity.a aVar) {
                    try {
                        org.json.JSONObject jSONObjectC = aVar.c();
                        if (jSONObjectC.length() > 0) {
                            com.apm.insight.l.f.a(new java.io.File(fileE.getAbsolutePath() + '.' + i), jSONObjectC);
                        }
                    } catch (java.io.IOException e) {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(e, "NPTH_CATCH");
                    }
                    if (i == 0) {
                        com.apm.insight.a.a.a();
                        com.apm.insight.a.a.a();
                        com.apm.insight.CrashType crashType = com.apm.insight.CrashType.NATIVE;
                        com.apm.insight.e.f();
                    }
                    return aVar;
                }
            });
            org.json.JSONObject jSONObjectC = aVarA.c();
            if (jSONObjectC != null && jSONObjectC.length() != 0) {
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                try {
                    jSONObjectC.put("java_end", jCurrentTimeMillis2);
                    aVarA.b("crash_cost", java.lang.String.valueOf(j));
                    aVarA.a("crash_cost", java.lang.String.valueOf(j / 1000));
                } catch (java.lang.Throwable unused) {
                }
                java.io.File file = new java.io.File(fileE.getAbsolutePath() + ".tmp");
                com.apm.insight.l.f.a(file, jSONObjectC);
                file.renameTo(fileE);
            }
            try {
                if (com.apm.insight.runtime.m.a().d().isEmpty()) {
                    return;
                }
                java.io.File file2 = new java.io.File(com.apm.insight.l.j.a(), com.apm.insight.e.f());
                com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(file2);
                cVar.b(file2);
                a(cVar.c(), cVar.a(), str);
            } catch (java.lang.Throwable unused2) {
                a("", null, str);
            }
        } catch (java.lang.Throwable th) {
            try {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            } finally {
                try {
                    if (!com.apm.insight.runtime.m.a().d().isEmpty()) {
                        java.io.File file3 = new java.io.File(com.apm.insight.l.j.a(), com.apm.insight.e.f());
                        com.apm.insight.nativecrash.c cVar2 = new com.apm.insight.nativecrash.c(file3);
                        cVar2.b(file3);
                        a(cVar2.c(), cVar2.a(), str);
                    }
                } catch (java.lang.Throwable unused3) {
                    a("", null, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        if (com.ironsource.y8.h.Z.equalsIgnoreCase(str)) {
            return com.apm.insight.l.m.a(android.os.Looper.getMainLooper().getThread().getStackTrace());
        }
        java.lang.ThreadGroup threadGroup = android.os.Looper.getMainLooper().getThread().getThreadGroup();
        int iActiveCount = threadGroup.activeCount();
        java.lang.Thread[] threadArr = new java.lang.Thread[iActiveCount + (iActiveCount / 2)];
        int iEnumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < iEnumerate; i++) {
            java.lang.String name = threadArr[i].getName();
            if (!android.text.TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return com.apm.insight.l.m.a(threadArr[i].getStackTrace());
            }
        }
        try {
            for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : java.lang.Thread.getAllStackTraces().entrySet()) {
                java.lang.String name2 = entry.getKey().getName();
                if (name2.equals(str) || name2.startsWith(str) || name2.endsWith(str)) {
                    return com.apm.insight.l.m.a(entry.getValue());
                }
            }
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
        return "";
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        for (com.apm.insight.ICrashCallback iCrashCallback : com.apm.insight.runtime.m.a().d()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(com.apm.insight.CrashType.NATIVE, str, str3, str2);
                } else {
                    iCrashCallback.onCrash(com.apm.insight.CrashType.NATIVE, str, null);
                }
            } catch (java.lang.Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
        }
    }
}

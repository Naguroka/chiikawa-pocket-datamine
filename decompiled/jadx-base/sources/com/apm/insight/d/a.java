package com.apm.insight.d;

/* JADX INFO: compiled from: DartCrash.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f385a;
    public long b;

    public static void a(java.lang.String str, java.util.Map<? extends java.lang.String, ? extends java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, com.apm.insight.b.h.a aVar) {
        a(str, map, map2, null, aVar);
    }

    public static void a(final java.lang.String str, final java.util.Map<? extends java.lang.String, ? extends java.lang.String> map, final java.util.Map<java.lang.String, java.lang.String> map2, final java.util.Map<java.lang.String, java.lang.String> map3, final com.apm.insight.b.h.a aVar) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        android.content.Context contextG = com.apm.insight.e.g();
                        long j = jCurrentTimeMillis;
                        java.lang.String str2 = str;
                        com.apm.insight.entity.a aVar2 = new com.apm.insight.entity.a();
                        aVar2.a("is_dart", (java.lang.Object) 1);
                        aVar2.a("crash_time", java.lang.Long.valueOf(j));
                        aVar2.a("process_name", (java.lang.Object) com.apm.insight.l.a.d(contextG));
                        aVar2.a("data", (java.lang.Object) str2);
                        com.apm.insight.l.a.a(contextG, aVar2.c());
                        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(com.apm.insight.CrashType.DART, aVar2);
                        if (map != null) {
                            org.json.JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("custom");
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = new org.json.JSONObject();
                            }
                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject, (java.util.Map<? extends java.lang.String, ? extends java.lang.String>) map);
                            aVarA.a("custom", jSONObjectOptJSONObject);
                        }
                        if (map2 != null) {
                            org.json.JSONObject jSONObjectOptJSONObject2 = aVarA.c().optJSONObject("custom_long");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new org.json.JSONObject();
                            }
                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, (java.util.Map<? extends java.lang.String, ? extends java.lang.String>) map2);
                            aVarA.a("custom_long", jSONObjectOptJSONObject2);
                        }
                        if (map3 != null) {
                            org.json.JSONObject jSONObjectOptJSONObject3 = aVarA.c().optJSONObject("filters");
                            if (jSONObjectOptJSONObject3 == null) {
                                jSONObjectOptJSONObject3 = new org.json.JSONObject();
                                aVarA.a("filters", jSONObjectOptJSONObject3);
                            }
                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject3, (java.util.Map<? extends java.lang.String, ? extends java.lang.String>) map3);
                        }
                        com.apm.insight.k.d.a().a(aVarA.c());
                    } catch (java.lang.Throwable unused) {
                    }
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(java.lang.String str) {
        a(str, null, null, null);
    }

    public static com.apm.insight.d.a b(java.lang.String str) {
        com.apm.insight.d.a aVar = new com.apm.insight.d.a();
        aVar.f385a = str;
        aVar.b = java.lang.System.currentTimeMillis();
        return aVar;
    }
}

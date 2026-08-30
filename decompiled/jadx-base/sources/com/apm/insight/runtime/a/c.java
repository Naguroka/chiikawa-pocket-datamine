package com.apm.insight.runtime.a;

/* JADX INFO: compiled from: BaseAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.apm.insight.CrashType f468a;
    protected android.content.Context b;
    private com.apm.insight.ICommonParams c = com.apm.insight.e.a().c();
    private com.apm.insight.runtime.a.b d;
    private com.apm.insight.runtime.a.d e;

    /* JADX INFO: compiled from: BaseAssembly.java */
    public interface a {
        com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a b(int i, com.apm.insight.entity.a aVar);
    }

    public int a() {
        return 6;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    protected boolean b() {
        return true;
    }

    protected boolean c() {
        return true;
    }

    c(com.apm.insight.CrashType crashType, android.content.Context context, com.apm.insight.runtime.a.b bVar, com.apm.insight.runtime.a.d dVar) {
        this.f468a = crashType;
        this.b = context;
        this.d = bVar;
        this.e = dVar;
    }

    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar, com.apm.insight.runtime.a.c.a aVar2, boolean z) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i = 0; i < a(); i++) {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i, aVar3);
                } catch (java.lang.Throwable unused) {
                }
            }
            try {
                aVar3 = a(i, aVar3);
            } catch (java.lang.Throwable unused2) {
            }
            if (aVar2 != null) {
                try {
                    a();
                    aVar3 = aVar2.b(i, aVar3);
                } catch (java.lang.Throwable unused3) {
                }
                if (z) {
                    if (i != 0) {
                        aVar.c(aVar3.c());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_".concat(java.lang.String.valueOf(i)), java.lang.String.valueOf(android.os.SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return a(aVar);
    }

    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i != 0) {
            if (i == 1) {
                c(aVar);
                java.util.List<com.apm.insight.AttachUserData> listA = com.apm.insight.e.b().a(this.f468a);
                java.util.HashMap map = new java.util.HashMap();
                org.json.JSONObject jSONObjectOptJSONObject = aVar.c().optJSONObject("custom");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new org.json.JSONObject();
                    aVar.a("custom", jSONObjectOptJSONObject);
                }
                if (listA != null) {
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        try {
                            com.apm.insight.AttachUserData attachUserData = listA.get(i2);
                            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject, attachUserData.getUserData(this.f468a));
                            map.put("custom_cost_" + attachUserData.getClass().getName() + "_" + map.size(), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - jUptimeMillis));
                        } catch (java.lang.Throwable th) {
                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject, th);
                        }
                    }
                }
                try {
                    jSONObjectOptJSONObject.put("fd_count", com.apm.insight.a.f());
                } catch (java.lang.Throwable unused) {
                }
                java.util.List<com.apm.insight.AttachUserData> listB = com.apm.insight.e.b().b(this.f468a);
                if (listB != null) {
                    org.json.JSONObject jSONObjectOptJSONObject2 = aVar.c().optJSONObject("custom_long");
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONObjectOptJSONObject2 = new org.json.JSONObject();
                        aVar.a("custom_long", jSONObjectOptJSONObject2);
                    }
                    for (int i3 = 0; i3 < listB.size(); i3++) {
                        try {
                            com.apm.insight.AttachUserData attachUserData2 = listB.get(i3);
                            long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f468a));
                            map.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + map.size(), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - jUptimeMillis2));
                        } catch (java.lang.Throwable th2) {
                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, th2);
                        }
                    }
                }
                for (java.util.Map.Entry entry : map.entrySet()) {
                    jSONObjectOptJSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            } else if (i == 2) {
                com.apm.insight.runtime.a.d dVar = this.e;
                aVar.a("battery", java.lang.Integer.valueOf(dVar != null ? dVar.a() : 0));
                aVar.c(com.apm.insight.e.b().a());
            } else if (i == 5 && c()) {
                aVar.b(com.apm.insight.l.n.a());
            }
        } else {
            b(aVar);
        }
        return aVar;
    }

    private com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) {
        aVar.a(com.apm.insight.e.q(), com.apm.insight.e.r());
        if (com.apm.insight.e.n()) {
            aVar.a("is_mp", (java.lang.Object) 1);
        }
        try {
            aVar.a(this.c.getPluginInfo());
        } catch (java.lang.Throwable th) {
            try {
                java.util.HashMap map = new java.util.HashMap();
                map.put("Data fetch failed since source misstake:\n" + com.apm.insight.l.m.a(th), 0);
                aVar.a(map);
            } catch (java.lang.Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.e.p());
        aVar.a("process_name", com.apm.insight.l.a.d(com.apm.insight.e.g()));
        return aVar;
    }

    private com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) {
        com.apm.insight.runtime.a.b bVar;
        if (!com.apm.insight.l.a.c(com.apm.insight.e.g())) {
            aVar.a("remote_process", (java.lang.Object) 1);
        }
        aVar.a("pid", java.lang.Integer.valueOf(android.os.Process.myPid()));
        aVar.a(com.apm.insight.e.j());
        if (b() && (bVar = this.d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.c.getPatchInfo());
        } catch (java.lang.Throwable th) {
            try {
                aVar.a(java.util.Arrays.asList("Data fetch failed since source misstake:\n" + com.apm.insight.l.m.a(th)));
            } catch (java.lang.Throwable unused) {
            }
        }
        java.lang.String strK = com.apm.insight.e.k();
        if (strK != null) {
            aVar.a("business", (java.lang.Object) strK);
        }
        aVar.a("is_background", java.lang.Boolean.valueOf(!com.apm.insight.l.a.a(this.b)));
        return aVar;
    }
}

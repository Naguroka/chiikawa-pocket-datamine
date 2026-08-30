package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f1365a;
    protected final android.content.Context b;
    protected final android.content.SharedPreferences c;
    private final java.util.Map d = new java.util.HashMap();
    private final java.lang.Object e = new java.lang.Object();

    public tj(com.applovin.impl.sdk.j jVar) {
        this.f1365a = jVar;
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        this.b = contextM;
        this.c = contextM.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            java.lang.Class.forName(com.applovin.impl.sj.class.getName());
            java.lang.Class.forName(com.applovin.impl.ue.class.getName());
        } catch (java.lang.Throwable unused) {
        }
        d();
    }

    public java.util.List c(com.applovin.impl.sj sjVar) {
        return com.applovin.impl.sdk.utils.CollectionUtils.explode((java.lang.String) a(sjVar));
    }

    public java.util.List b(com.applovin.impl.sj sjVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(6);
        java.util.Iterator it = c(sjVar).iterator();
        while (it.hasNext()) {
            arrayList.add(com.applovin.mediation.MaxAdFormat.formatFromString((java.lang.String) it.next()));
        }
        return arrayList;
    }

    private java.lang.String b() {
        return "com.applovin.sdk." + com.applovin.impl.yp.e(this.f1365a.a0()) + ".";
    }

    public void e() {
        java.lang.String strB = b();
        synchronized (this.e) {
            android.content.SharedPreferences.Editor editorEdit = this.c.edit();
            for (com.applovin.impl.sj sjVar : com.applovin.impl.sj.c()) {
                java.lang.Object obj = this.d.get(sjVar.b());
                if (obj != null) {
                    this.f1365a.a(strB + sjVar.b(), obj, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }

    public void d() {
        java.lang.String strB = b();
        synchronized (this.e) {
            for (com.applovin.impl.sj sjVar : com.applovin.impl.sj.c()) {
                try {
                    java.lang.Object objA = this.f1365a.a(strB + sjVar.b(), null, sjVar.a().getClass(), this.c);
                    if (objA != null) {
                        this.d.put(sjVar.b(), objA);
                    }
                } catch (java.lang.Throwable th) {
                    com.applovin.impl.sdk.n.c("SettingsManager", "Unable to load \"" + sjVar.b() + "\"", th);
                    this.f1365a.D().a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    public void a() {
        synchronized (this.e) {
            this.d.clear();
        }
        this.f1365a.a(this.c);
    }

    public java.lang.Object a(com.applovin.impl.sj sjVar) {
        if (sjVar != null) {
            synchronized (this.e) {
                java.lang.Object obj = this.d.get(sjVar.b());
                if (obj == null) {
                    return sjVar.a();
                }
                return sjVar.a(obj);
            }
        }
        throw new java.lang.IllegalArgumentException("No setting type specified");
    }

    public boolean c() {
        return this.f1365a.f0().isVerboseLoggingEnabled() || ((java.lang.Boolean) a(com.applovin.impl.sj.l)).booleanValue();
    }

    private static java.lang.Object a(java.lang.String str, org.json.JSONObject jSONObject, java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return java.lang.Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof java.lang.Double) {
            return java.lang.Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof java.lang.Integer) {
            return java.lang.Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof java.lang.Long) {
            return java.lang.Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof java.lang.String) {
            return jSONObject.getString(str);
        }
        throw new java.lang.RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    public void a(org.json.JSONObject jSONObject) {
        synchronized (this.e) {
            boolean zBooleanValue = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, com.applovin.impl.sj.x.b(), java.lang.Boolean.FALSE).booleanValue();
            java.util.HashMap map = zBooleanValue ? new java.util.HashMap() : null;
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                if (next != null && next.length() > 0) {
                    try {
                        com.applovin.impl.sj sjVarA = a(next, (com.applovin.impl.sj) null);
                        if (sjVarA != null) {
                            java.lang.Object objA = zBooleanValue ? a(sjVarA) : null;
                            java.lang.Object objA2 = a(next, jSONObject, sjVarA.a());
                            this.d.put(sjVarA.b(), objA2);
                            if (sjVarA == com.applovin.impl.sj.v5) {
                                this.d.put(com.applovin.impl.sj.w5.b(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            }
                            if (zBooleanValue && !objA2.equals(objA)) {
                                map.put(sjVarA, objA);
                            }
                        }
                    } catch (org.json.JSONException e) {
                        com.applovin.impl.sdk.n.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                        this.f1365a.D().a("SettingsManager", "loadSettingsException", e);
                    } catch (java.lang.Throwable th) {
                        com.applovin.impl.sdk.n.c("SettingsManager", "Unable to convert setting object ", th);
                        this.f1365a.D().a("SettingsManager", "loadSettingsThrowable", th);
                    }
                }
            }
            if (zBooleanValue && map.size() > 0) {
                com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
                pcVar.a("========== UPDATED SETTINGS ==========");
                for (com.applovin.impl.sj sjVar : map.keySet()) {
                    pcVar.a(sjVar.b(), a(sjVar) + " (" + map.get(sjVar) + ")");
                }
                pcVar.a("========== END ==========");
                this.f1365a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1365a.I().a("SettingsManager", pcVar.toString());
                }
            }
        }
    }

    public com.applovin.impl.sj a(java.lang.String str, com.applovin.impl.sj sjVar) {
        synchronized (this.e) {
            for (com.applovin.impl.sj sjVar2 : com.applovin.impl.sj.c()) {
                if (sjVar2.b().equals(str)) {
                    return sjVar2;
                }
            }
            return sjVar;
        }
    }

    public void a(com.applovin.impl.sj sjVar, java.lang.Object obj) {
        if (sjVar == null) {
            throw new java.lang.IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.e) {
                this.d.put(sjVar.b(), obj);
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("No new value specified");
    }
}

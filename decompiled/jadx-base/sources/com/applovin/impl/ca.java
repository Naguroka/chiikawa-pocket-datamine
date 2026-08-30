package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f669a;
    private final java.util.Map b = new java.util.HashMap();

    public ca(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            this.f669a = jVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified");
    }

    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
        f();
    }

    public void b() {
        synchronized (this.b) {
            java.util.Iterator it = com.applovin.impl.ba.a().iterator();
            while (it.hasNext()) {
                this.b.remove(((com.applovin.impl.ba) it.next()).b());
            }
            f();
        }
    }

    public org.json.JSONObject c() {
        org.json.JSONObject jSONObject;
        synchronized (this.b) {
            jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : this.b.entrySet()) {
                com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, (java.lang.String) entry.getKey(), ((java.lang.Long) entry.getValue()).longValue());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) this.f669a.a(com.applovin.impl.uj.z, com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON));
        synchronized (this.b) {
            try {
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        java.lang.String next = itKeys.next();
                        this.b.put(next, java.lang.Long.valueOf(jSONObject.getLong(next)));
                    } catch (org.json.JSONException unused) {
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void f() {
        this.f669a.i0().a(new java.lang.Runnable() { // from class: com.applovin.impl.ca$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        }, com.applovin.impl.tm.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        try {
            this.f669a.b(com.applovin.impl.uj.z, c().toString());
        } catch (java.lang.Throwable th) {
            this.f669a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f669a.I().a("GlobalStatsManager", "Unable to save stats", th);
            }
        }
    }

    public long c(com.applovin.impl.ba baVar) {
        return a(baVar, 1L);
    }

    public long b(com.applovin.impl.ba baVar) {
        long jLongValue;
        synchronized (this.b) {
            java.lang.Long l = (java.lang.Long) this.b.get(baVar.b());
            if (l == null) {
                l = 0L;
            }
            jLongValue = l.longValue();
        }
        return jLongValue;
    }

    public void a(com.applovin.impl.ba baVar) {
        synchronized (this.b) {
            this.b.remove(baVar.b());
        }
        f();
    }

    long a(com.applovin.impl.ba baVar, long j) {
        long jLongValue;
        synchronized (this.b) {
            java.lang.Long l = (java.lang.Long) this.b.get(baVar.b());
            if (l == null) {
                l = 0L;
            }
            jLongValue = l.longValue() + j;
            this.b.put(baVar.b(), java.lang.Long.valueOf(jLongValue));
        }
        f();
        return jLongValue;
    }

    public void b(com.applovin.impl.ba baVar, long j) {
        synchronized (this.b) {
            this.b.put(baVar.b(), java.lang.Long.valueOf(j));
        }
        f();
    }
}

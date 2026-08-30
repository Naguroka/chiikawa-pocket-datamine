package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    private final com.applovin.impl.sdk.j b;
    private final com.applovin.impl.sdk.n c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f1061a = java.util.Collections.synchronizedMap(new java.util.HashMap(16));
    private final java.lang.Object d = new java.lang.Object();
    private final java.util.Map e = new java.util.HashMap();
    private final java.util.Set f = new java.util.HashSet();
    private final java.lang.Object g = new java.lang.Object();
    private final java.util.Set h = new java.util.HashSet();

    public f(com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new java.lang.IllegalArgumentException("No sdk specified");
        }
        this.b = jVar;
        this.c = jVar.I();
    }

    public java.util.Collection b() {
        java.util.Set setUnmodifiableSet;
        synchronized (this.d) {
            setUnmodifiableSet = java.util.Collections.unmodifiableSet(this.f);
        }
        return setUnmodifiableSet;
    }

    public java.util.Collection c() {
        java.util.Set setUnmodifiableSet;
        synchronized (this.d) {
            java.util.HashSet hashSet = new java.util.HashSet(this.e.size());
            java.util.Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((java.lang.Class) it.next()).getName());
            }
            setUnmodifiableSet = java.util.Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }

    public void a(java.lang.String str, java.lang.String str2, com.applovin.impl.fe feVar) {
        synchronized (this.g) {
            this.b.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.b.I().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.h.add(new com.applovin.impl.mediation.f.a(str, str2, feVar, this.b));
        }
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1062a;
        private final java.lang.String b;
        private final com.applovin.mediation.MaxAdFormat c;
        private final org.json.JSONObject d;

        org.json.JSONObject a() {
            return this.d;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.applovin.impl.mediation.f.a aVar = (com.applovin.impl.mediation.f.a) obj;
            if (!this.f1062a.equals(aVar.f1062a) || !this.b.equals(aVar.b)) {
                return false;
            }
            com.applovin.mediation.MaxAdFormat maxAdFormat = this.c;
            com.applovin.mediation.MaxAdFormat maxAdFormat2 = aVar.c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iHashCode = ((this.f1062a.hashCode() * 31) + this.b.hashCode()) * 31;
            com.applovin.mediation.MaxAdFormat maxAdFormat = this.c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "DisabledAdapterInfo{className='" + this.f1062a + "', operationTag='" + this.b + "', format=" + this.c + '}';
        }

        a(java.lang.String str, java.lang.String str2, com.applovin.impl.fe feVar, com.applovin.impl.sdk.j jVar) {
            this.f1062a = str;
            this.b = str2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            this.d = jSONObject;
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "class", str);
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "operation", str2);
            if (feVar != null) {
                this.c = feVar.getFormat();
                com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "format", feVar.getFormat().getLabel());
            } else {
                this.c = null;
            }
        }
    }

    com.applovin.impl.mediation.g a(com.applovin.impl.oe oeVar) {
        return a(oeVar, false);
    }

    com.applovin.impl.mediation.g a(com.applovin.impl.oe oeVar, boolean z) {
        java.lang.Class cls;
        com.applovin.impl.mediation.g gVar;
        if (oeVar != null) {
            java.lang.String strC = oeVar.c();
            java.lang.String strB = oeVar.b();
            if (android.text.TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (android.text.TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z && (gVar = (com.applovin.impl.mediation.g) this.f1061a.get(strB)) != null) {
                return gVar;
            }
            synchronized (this.d) {
                if (!this.f.contains(strB)) {
                    if (this.e.containsKey(strB)) {
                        cls = (java.lang.Class) this.e.get(strB);
                    } else {
                        java.lang.Class clsA = a(strB);
                        if (clsA == null) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                            }
                            this.f.add(strB);
                            return null;
                        }
                        cls = clsA;
                    }
                    com.applovin.impl.mediation.g gVarA = a(oeVar, cls, z);
                    if (gVarA != null) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a("MediationAdapterManager", "Loaded " + strC);
                        }
                        this.e.put(strB, cls);
                        if (z) {
                            this.f1061a.put(oeVar.b(), gVarA);
                        }
                        return gVarA;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.b("MediationAdapterManager", "Failed to load " + strC);
                    }
                    this.f.add(strB);
                    return null;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                }
                return null;
            }
        }
        throw new java.lang.IllegalArgumentException("No adapter spec specified");
    }

    private com.applovin.impl.mediation.g a(com.applovin.impl.oe oeVar, java.lang.Class cls, boolean z) {
        try {
            return new com.applovin.impl.mediation.g(oeVar, (com.applovin.mediation.adapters.MediationAdapterBase) cls.getConstructor(com.applovin.sdk.AppLovinSdk.class).newInstance(this.b.q0()), z, this.b);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterManager", "Failed to load adapter: " + oeVar, th);
            return null;
        }
    }

    public java.util.Collection a() {
        java.util.ArrayList arrayList;
        synchronized (this.g) {
            arrayList = new java.util.ArrayList(this.h.size());
            java.util.Iterator it = this.h.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.applovin.impl.mediation.f.a) it.next()).a());
            }
        }
        return arrayList;
    }

    private java.lang.Class a(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            if (com.applovin.mediation.adapter.MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(com.applovin.mediation.adapter.MaxAdapter.class);
            }
            com.applovin.impl.sdk.n.h("MediationAdapterManager", str + " error: not an instance of '" + com.applovin.mediation.adapter.MaxAdapter.class.getName() + "'.");
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}

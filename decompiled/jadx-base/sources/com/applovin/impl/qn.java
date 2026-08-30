package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class qn implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1198a;
    private final android.content.SharedPreferences b;
    private java.lang.Integer c;
    private java.lang.Integer d;
    private java.lang.Integer e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;
    private final java.util.List k;

    public java.lang.String j() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.c) + a("CMP SDK Version", this.d) + a(com.applovin.impl.uj.r.a(), this.e) + a(com.applovin.impl.uj.s.a(), this.f) + a(com.applovin.impl.uj.t.a(), this.g);
    }

    public java.lang.Integer e() {
        return this.c;
    }

    public java.lang.Integer f() {
        return this.d;
    }

    public java.lang.Integer g() {
        return this.e;
    }

    public java.lang.String k() {
        return this.f;
    }

    public java.lang.String c() {
        return this.g;
    }

    public java.util.List i() {
        return this.k;
    }

    public qn(com.applovin.impl.sdk.j jVar) {
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.j.m());
        this.b = defaultSharedPreferences;
        this.k = new java.util.ArrayList();
        this.f1198a = jVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.c = a(com.applovin.impl.uj.p.a());
        this.d = a(com.applovin.impl.uj.q.a());
        this.e = h();
        this.f = (java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.s, (java.lang.Object) null, defaultSharedPreferences, false);
        this.g = (java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.t, (java.lang.Object) null, defaultSharedPreferences, false);
        this.h = (java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.u, (java.lang.Object) null, defaultSharedPreferences, false);
        this.i = (java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.w, (java.lang.Object) null, defaultSharedPreferences, false);
        this.j = (java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.y, (java.lang.Object) null, defaultSharedPreferences, false);
        c(this.g);
    }

    public java.lang.String d() {
        return com.applovin.impl.on.a(this.c);
    }

    public boolean b() {
        return com.applovin.impl.tn.a(this.g);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if (str == null) {
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(com.applovin.impl.uj.p.a())) {
            this.c = a(str);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.c);
            }
            this.f1198a.L0();
            return;
        }
        if (str.equals(com.applovin.impl.uj.q.a())) {
            this.d = a(str);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.d);
                return;
            }
            return;
        }
        if (str.equals(com.applovin.impl.uj.r.a())) {
            this.e = h();
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.e);
                return;
            }
            return;
        }
        if (str.equals(com.applovin.impl.uj.s.a())) {
            this.f = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f);
            }
            this.f1198a.L0();
            return;
        }
        if (str.equals(com.applovin.impl.uj.t.a())) {
            this.g = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.g);
            }
            c(this.g);
            b(this.g);
            return;
        }
        if (str.equals(com.applovin.impl.uj.u.a())) {
            this.h = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.h);
            }
            d(this.h);
            return;
        }
        if (str.equals(com.applovin.impl.uj.v.a())) {
            java.lang.String str2 = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(com.applovin.impl.uj.w.a())) {
            this.i = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.i);
                return;
            }
            return;
        }
        if (str.equals(com.applovin.impl.uj.x.a())) {
            java.lang.String str3 = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(com.applovin.impl.uj.y.a())) {
            this.j = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            java.lang.String str4 = (java.lang.String) com.applovin.impl.vj.a(str, (java.lang.Object) null, java.lang.String.class, sharedPreferences);
            this.f1198a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1198a.I().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    public java.lang.Boolean c(int i) {
        java.lang.String str = this.j;
        if (str == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(com.applovin.impl.tn.a(str, i - 1));
    }

    public java.lang.Boolean d(int i) {
        java.lang.String str = this.h;
        if (str == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(com.applovin.impl.tn.a(str, i - 1));
    }

    public java.lang.Boolean b(int i) {
        java.lang.String str = this.i;
        if (str == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(com.applovin.impl.tn.a(str, i - 1));
    }

    private java.lang.Integer h() {
        java.lang.String strA = com.applovin.impl.uj.r.a();
        if (this.b.contains(strA)) {
            java.lang.Integer num = (java.lang.Integer) com.applovin.impl.vj.a(strA, null, java.lang.Integer.class, this.b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f1198a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1198a.I().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            java.lang.Long l = (java.lang.Long) com.applovin.impl.vj.a(strA, null, java.lang.Long.class, this.b, false);
            if (l != null) {
                if (l.longValue() != 1 && l.longValue() != 0) {
                    this.f1198a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f1198a.I().b("TcfManager", "Long value (" + l + ") for " + strA + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
                return java.lang.Integer.valueOf(l.intValue());
            }
            java.lang.Boolean bool = (java.lang.Boolean) com.applovin.impl.vj.a(strA, null, java.lang.Boolean.class, this.b, false);
            if (bool != null) {
                return java.lang.Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            java.lang.String str = (java.lang.String) com.applovin.impl.vj.a(strA, null, java.lang.String.class, this.b, false);
            if (str != null) {
                if (!"1".equals(str) && !com.json.mediationsdk.metadata.a.g.equals(str)) {
                    if (!"0".equals(str) && !"false".equals(str)) {
                        this.f1198a.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f1198a.I().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                        }
                        return null;
                    }
                    return 0;
                }
                return 1;
            }
        }
        return null;
    }

    private void a() {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.rn) it.next()).a(null);
        }
    }

    public java.lang.Boolean a(int i) {
        return com.applovin.impl.tn.a(i, this.g);
    }

    private void c(java.lang.String str) {
        this.f1198a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1198a.I().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        java.lang.Boolean boolA = com.applovin.impl.tn.a(1301, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f1198a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1198a.I().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                com.applovin.impl.a4.b(true, com.applovin.impl.sdk.j.m());
            } else {
                this.f1198a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1198a.I().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                com.applovin.impl.a4.b(false, com.applovin.impl.sdk.j.m());
            }
            this.f1198a.L0();
            return;
        }
        this.f1198a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1198a.I().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void d(java.lang.String str) {
        if (str != null) {
            for (com.applovin.impl.rn rnVar : this.k) {
                if (rnVar.f() == com.applovin.impl.rn.a.TCF_VENDOR && rnVar.d() != null) {
                    rnVar.a(java.lang.Boolean.valueOf(com.applovin.impl.tn.a(str, rnVar.d().intValue() - 1)));
                }
            }
            return;
        }
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.rn) it.next()).a(null);
        }
    }

    private void b(java.lang.String str) {
        for (com.applovin.impl.rn rnVar : this.k) {
            if (rnVar.f() == com.applovin.impl.rn.a.ATP_NETWORK && rnVar.d() != null) {
                rnVar.a(com.applovin.impl.tn.a(rnVar.d().intValue(), str));
            }
        }
    }

    private java.lang.String a(java.lang.String str, java.lang.Object obj) {
        return "\n" + str + " - " + (obj != null ? obj.toString() : "No value set");
    }

    private java.lang.Integer a(java.lang.String str) {
        if (this.b.contains(str)) {
            java.lang.Integer num = (java.lang.Integer) com.applovin.impl.vj.a(str, null, java.lang.Integer.class, this.b, false);
            if (num != null) {
                return num;
            }
            java.lang.Long l = (java.lang.Long) com.applovin.impl.vj.a(str, null, java.lang.Long.class, this.b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return java.lang.Integer.valueOf(l.intValue());
            }
            java.lang.String str2 = (java.lang.String) com.applovin.impl.vj.a(str, null, java.lang.String.class, this.b, false);
            if (str2 != null) {
                if (com.applovin.impl.sdk.utils.StringUtils.isNumeric(str2)) {
                    return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2));
                }
                this.f1198a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1198a.I().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public void a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.k.add(((com.applovin.impl.je) it.next()).t());
        }
        d(this.h);
        b(this.g);
    }
}

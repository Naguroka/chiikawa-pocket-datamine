package com.iab.omid.library.applovin.walking;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<android.view.View, java.lang.String> f2377a = new java.util.HashMap<>();
    private final java.util.HashMap<android.view.View, com.iab.omid.library.applovin.walking.a.C0216a> b = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, android.view.View> c = new java.util.HashMap<>();
    private final java.util.HashSet<android.view.View> d = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> e = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> f = new java.util.HashSet<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> g = new java.util.HashMap<>();
    private final java.util.Map<android.view.View, java.lang.Boolean> h = new java.util.WeakHashMap();
    private boolean i;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0216a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.applovin.internal.e f2378a;
        private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>();

        public C0216a(com.iab.omid.library.applovin.internal.e eVar, java.lang.String str) {
            this.f2378a = eVar;
            a(str);
        }

        public com.iab.omid.library.applovin.internal.e a() {
            return this.f2378a;
        }

        public java.util.ArrayList<java.lang.String> b() {
            return this.b;
        }

        public void a(java.lang.String str) {
            this.b.add(str);
        }
    }

    private java.lang.Boolean b(android.view.View view) {
        if (view.hasWindowFocus()) {
            this.h.remove(view);
            return java.lang.Boolean.FALSE;
        }
        if (this.h.containsKey(view)) {
            return this.h.get(view);
        }
        java.util.Map<android.view.View, java.lang.Boolean> map = this.h;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public android.view.View a(java.lang.String str) {
        return this.c.get(str);
    }

    public com.iab.omid.library.applovin.walking.a.C0216a c(android.view.View view) {
        com.iab.omid.library.applovin.walking.a.C0216a c0216a = this.b.get(view);
        if (c0216a != null) {
            this.b.remove(view);
        }
        return c0216a;
    }

    public java.lang.String d(android.view.View view) {
        if (this.f2377a.size() == 0) {
            return null;
        }
        java.lang.String str = this.f2377a.get(view);
        if (str != null) {
            this.f2377a.remove(view);
        }
        return str;
    }

    public com.iab.omid.library.applovin.walking.c e(android.view.View view) {
        if (this.d.contains(view)) {
            return com.iab.omid.library.applovin.walking.c.PARENT_VIEW;
        }
        return this.i ? com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW;
    }

    public boolean f(android.view.View view) {
        if (!this.h.containsKey(view)) {
            return true;
        }
        this.h.put(view, java.lang.Boolean.TRUE);
        return false;
    }

    private java.lang.String a(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        while (view != null) {
            java.lang.String strA = com.iab.omid.library.applovin.utils.h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    public java.lang.String b(java.lang.String str) {
        return this.g.get(str);
    }

    public java.util.HashSet<java.lang.String> c() {
        return this.e;
    }

    public void d() {
        this.i = true;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                android.view.View viewC = aVar.c();
                if (aVar.f()) {
                    java.lang.String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        java.lang.String strA = a(viewC);
                        if (strA == null) {
                            this.e.add(adSessionId);
                            this.f2377a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, viewC);
                            this.g.put(adSessionId, strA);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f2377a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public java.util.HashSet<java.lang.String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        java.util.Iterator<com.iab.omid.library.applovin.internal.e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.applovin.internal.e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        android.view.View view = eVar.c().get();
        if (view == null) {
            return;
        }
        com.iab.omid.library.applovin.walking.a.C0216a c0216a = this.b.get(view);
        if (c0216a != null) {
            c0216a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new com.iab.omid.library.applovin.walking.a.C0216a(eVar, aVar.getAdSessionId()));
        }
    }
}

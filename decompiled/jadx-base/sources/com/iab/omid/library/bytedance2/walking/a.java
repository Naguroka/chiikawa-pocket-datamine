package com.iab.omid.library.bytedance2.walking;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<android.view.View, java.lang.String> f2412a = new java.util.HashMap<>();
    private final java.util.HashMap<android.view.View, com.iab.omid.library.bytedance2.walking.a.C0220a> b = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, android.view.View> c = new java.util.HashMap<>();
    private final java.util.HashSet<android.view.View> d = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> e = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> f = new java.util.HashSet<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> g = new java.util.HashMap<>();
    private final java.util.Map<android.view.View, java.lang.Boolean> h = new java.util.WeakHashMap();
    private boolean i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0220a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.bytedance2.internal.e f2413a;
        private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>();

        public C0220a(com.iab.omid.library.bytedance2.internal.e eVar, java.lang.String str) {
            this.f2413a = eVar;
            a(str);
        }

        public com.iab.omid.library.bytedance2.internal.e a() {
            return this.f2413a;
        }

        public void a(java.lang.String str) {
            this.b.add(str);
        }

        public java.util.ArrayList<java.lang.String> b() {
            return this.b;
        }
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
            java.lang.String strA = com.iab.omid.library.bytedance2.utils.h.a(view);
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

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        java.util.Iterator<com.iab.omid.library.bytedance2.internal.e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.bytedance2.internal.e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        android.view.View view = eVar.c().get();
        if (view == null) {
            return;
        }
        com.iab.omid.library.bytedance2.walking.a.C0220a c0220a = this.b.get(view);
        if (c0220a != null) {
            c0220a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new com.iab.omid.library.bytedance2.walking.a.C0220a(eVar, aVar.getAdSessionId()));
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

    public void a() {
        this.f2412a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public java.lang.String b(java.lang.String str) {
        return this.g.get(str);
    }

    public java.util.HashSet<java.lang.String> b() {
        return this.f;
    }

    public com.iab.omid.library.bytedance2.walking.a.C0220a c(android.view.View view) {
        com.iab.omid.library.bytedance2.walking.a.C0220a c0220a = this.b.get(view);
        if (c0220a != null) {
            this.b.remove(view);
        }
        return c0220a;
    }

    public java.util.HashSet<java.lang.String> c() {
        return this.e;
    }

    public java.lang.String d(android.view.View view) {
        if (this.f2412a.size() == 0) {
            return null;
        }
        java.lang.String str = this.f2412a.get(view);
        if (str != null) {
            this.f2412a.remove(view);
        }
        return str;
    }

    public void d() {
        this.i = true;
    }

    public com.iab.omid.library.bytedance2.walking.c e(android.view.View view) {
        if (this.d.contains(view)) {
            return com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW;
        }
        return this.i ? com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                android.view.View viewC = aVar.c();
                if (aVar.f()) {
                    java.lang.String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        java.lang.String strA = a(viewC);
                        if (strA == null) {
                            this.e.add(adSessionId);
                            this.f2412a.put(viewC, adSessionId);
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

    public boolean f(android.view.View view) {
        if (!this.h.containsKey(view)) {
            return true;
        }
        this.h.put(view, java.lang.Boolean.TRUE);
        return false;
    }
}

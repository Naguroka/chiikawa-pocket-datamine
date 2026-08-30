package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class xe {
    private static final java.util.HashMap b = new java.util.HashMap();
    private static final java.util.HashMap c = new java.util.HashMap();
    private static final java.util.HashMap d = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1505a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Long a(java.lang.Long l, java.lang.Long l2) {
        return l;
    }

    public xe(com.applovin.impl.sdk.j jVar) {
        this.f1505a = jVar;
    }

    private void b(com.applovin.impl.ve veVar, com.applovin.impl.we weVar, com.applovin.impl.ve.a aVar) {
        java.util.HashMap map;
        if (a(veVar, weVar, aVar)) {
            java.lang.String strB = weVar.b();
            java.util.HashMap mapA = a(weVar.a());
            synchronized (mapA) {
                if (mapA.containsKey(strB)) {
                    map = (java.util.HashMap) mapA.get(strB);
                } else {
                    java.util.HashMap map2 = new java.util.HashMap();
                    mapA.put(strB, map2);
                    map = map2;
                }
                map.put(veVar, aVar.a(map.get(veVar)));
            }
        }
    }

    private boolean a(com.applovin.impl.ve veVar, com.applovin.impl.we weVar, com.applovin.impl.ve.a aVar) {
        if (veVar == null) {
            this.f1505a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1505a.I().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (weVar == null) {
            this.f1505a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1505a.I().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (aVar != null) {
            return true;
        }
        this.f1505a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1505a.I().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    public java.util.Map a(com.applovin.impl.ve veVar, com.applovin.impl.we.a aVar) {
        java.util.HashMap mapA = a(aVar);
        java.util.HashMap map = new java.util.HashMap();
        synchronized (mapA) {
            for (java.lang.String str : mapA.keySet()) {
                map.put(str, ((java.util.HashMap) mapA.get(str)).get(veVar));
            }
        }
        return map;
    }

    private java.util.HashMap a(com.applovin.impl.we.a aVar) {
        if (aVar == com.applovin.impl.we.a.AD_UNIT_ID) {
            return b;
        }
        if (aVar == com.applovin.impl.we.a.AD_FORMAT) {
            return c;
        }
        return d;
    }

    public void a(com.applovin.impl.ve veVar, com.applovin.impl.we weVar) {
        b(veVar, weVar, new com.applovin.impl.ve.a() { // from class: com.applovin.impl.xe$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.ve.a
            public final java.lang.Object a(java.lang.Object obj) {
                return com.applovin.impl.xe.a((java.lang.Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Long a(java.lang.Long l) {
        return java.lang.Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    public void a(com.applovin.impl.ve veVar, com.applovin.impl.we weVar, final java.lang.Long l) {
        b(veVar, weVar, new com.applovin.impl.ve.a() { // from class: com.applovin.impl.xe$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.ve.a
            public final java.lang.Object a(java.lang.Object obj) {
                return com.applovin.impl.xe.a(l, (java.lang.Long) obj);
            }
        });
    }
}

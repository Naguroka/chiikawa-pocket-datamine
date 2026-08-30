package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2195a = new com.google.android.play.core.assetpacks.internal.o("ExtractorSessionStoreView");
    private final com.google.android.play.core.assetpacks.bh b;
    private final com.google.android.play.core.assetpacks.co c;
    private final java.util.Map d = new java.util.HashMap();
    private final java.util.concurrent.locks.ReentrantLock e = new java.util.concurrent.locks.ReentrantLock();
    private final com.google.android.play.core.assetpacks.internal.aq f;
    private final com.google.android.play.core.assetpacks.internal.aq g;

    de(com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.internal.aq aqVar2) {
        this.b = bhVar;
        this.f = aqVar;
        this.c = coVar;
        this.g = aqVar2;
    }

    private final com.google.android.play.core.assetpacks.db q(int i) {
        java.util.Map map = this.d;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        com.google.android.play.core.assetpacks.db dbVar = (com.google.android.play.core.assetpacks.db) map.get(numValueOf);
        if (dbVar != null) {
            return dbVar;
        }
        throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Could not find session %d while trying to get it", numValueOf), i);
    }

    private final java.lang.Object r(com.google.android.play.core.assetpacks.dd ddVar) {
        try {
            this.e.lock();
            return ddVar.a();
        } finally {
            this.e.unlock();
        }
    }

    private static java.lang.String s(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new com.google.android.play.core.assetpacks.ck("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static java.util.List t(java.util.List list) {
        return list == null ? java.util.Collections.emptyList() : list;
    }

    private final java.util.Map u(final java.util.List list) {
        return (java.util.Map) r(new com.google.android.play.core.assetpacks.dd() { // from class: com.google.android.play.core.assetpacks.cr
            @Override // com.google.android.play.core.assetpacks.dd
            public final java.lang.Object a() {
                return this.f2182a.i(list);
            }
        });
    }

    final /* synthetic */ java.lang.Boolean a(android.os.Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return true;
        }
        java.util.Map map = this.d;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return true;
        }
        com.google.android.play.core.assetpacks.db dbVar = (com.google.android.play.core.assetpacks.db) this.d.get(numValueOf);
        if (dbVar.c.d == 6) {
            return false;
        }
        return java.lang.Boolean.valueOf(!com.google.android.play.core.assetpacks.bg.c(dbVar.c.d, bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", s(bundle)))));
    }

    final /* synthetic */ java.lang.Boolean b(android.os.Bundle bundle) {
        boolean z;
        boolean z2;
        com.google.android.play.core.assetpacks.dc dcVar;
        int i = bundle.getInt("session_id");
        boolean z3 = false;
        if (i == 0) {
            return false;
        }
        java.util.Map map = this.d;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        boolean z4 = true;
        if (map.containsKey(numValueOf)) {
            com.google.android.play.core.assetpacks.db dbVarQ = q(i);
            int i2 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", dbVarQ.c.f2192a));
            com.google.android.play.core.assetpacks.da daVar = dbVarQ.c;
            int i3 = daVar.d;
            if (com.google.android.play.core.assetpacks.bg.c(i3, i2)) {
                f2195a.a("Found stale update for session %s with status %d.", numValueOf, java.lang.Integer.valueOf(i3));
                com.google.android.play.core.assetpacks.da daVar2 = dbVarQ.c;
                java.lang.String str = daVar2.f2192a;
                int i4 = daVar2.d;
                if (i4 == 4) {
                    ((com.google.android.play.core.assetpacks.y) this.f.a()).h(i, str);
                } else if (i4 == 5) {
                    ((com.google.android.play.core.assetpacks.y) this.f.a()).i(i);
                } else if (i4 == 6) {
                    ((com.google.android.play.core.assetpacks.y) this.f.a()).e(java.util.Arrays.asList(str));
                }
            } else {
                daVar.d = i2;
                if (com.google.android.play.core.assetpacks.bg.d(i2)) {
                    n(i);
                    this.c.c(dbVarQ.c.f2192a);
                } else {
                    for (com.google.android.play.core.assetpacks.dc dcVar2 : daVar.f) {
                        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", dbVarQ.c.f2192a, dcVar2.f2194a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((android.content.Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    ((com.google.android.play.core.assetpacks.cz) dcVar2.d.get(i5)).f2190a = true;
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        } else {
            java.lang.String strS = s(bundle);
            long j = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", strS));
            java.lang.String string = bundle.getString(com.google.android.play.core.assetpacks.model.b.a("pack_version_tag", strS), "");
            int i6 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", strS));
            long j2 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", strS));
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(com.google.android.play.core.assetpacks.model.b.a("slice_ids", strS));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : t(stringArrayList)) {
                java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", strS, str2));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = t(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((android.content.Intent) it.next()) == null) {
                        z4 = z3;
                    }
                    arrayList2.add(new com.google.android.play.core.assetpacks.cz(z4));
                    z3 = false;
                    z4 = true;
                }
                java.lang.String string2 = bundle.getString(com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", strS, str2));
                long j3 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", strS, str2));
                int i7 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.b("patch_format", strS, str2), 0);
                if (i7 != 0) {
                    dcVar = new com.google.android.play.core.assetpacks.dc(str2, string2, j3, arrayList2, 0, i7);
                    z2 = false;
                } else {
                    z2 = false;
                    dcVar = new com.google.android.play.core.assetpacks.dc(str2, string2, j3, arrayList2, bundle.getInt(com.google.android.play.core.assetpacks.model.b.b("compression_format", strS, str2), 0), 0);
                }
                arrayList.add(dcVar);
                z3 = z2;
                z4 = true;
            }
            this.d.put(java.lang.Integer.valueOf(i), new com.google.android.play.core.assetpacks.db(i, bundle.getInt("app_version_code"), new com.google.android.play.core.assetpacks.da(strS, j, i6, j2, arrayList, string)));
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    final /* synthetic */ java.lang.Object c(java.lang.String str, int i, long j) {
        com.google.android.play.core.assetpacks.db dbVar = (com.google.android.play.core.assetpacks.db) u(java.util.Arrays.asList(str)).get(str);
        if (dbVar == null || com.google.android.play.core.assetpacks.bg.d(dbVar.c.d)) {
            f2195a.b(java.lang.String.format("Could not find pack %s while trying to complete it", str), new java.lang.Object[0]);
        }
        this.b.E(str, i, j);
        dbVar.c.d = 4;
        return null;
    }

    final /* synthetic */ java.lang.Object d(int i, int i2) {
        q(i).c.d = 5;
        return null;
    }

    final /* synthetic */ java.lang.Object e(int i) {
        com.google.android.play.core.assetpacks.db dbVarQ = q(i);
        com.google.android.play.core.assetpacks.da daVar = dbVarQ.c;
        if (!com.google.android.play.core.assetpacks.bg.d(daVar.d)) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Could not safely delete session %d because it is not in a terminal state.", java.lang.Integer.valueOf(i)), i);
        }
        this.b.E(daVar.f2192a, dbVarQ.b, daVar.b);
        com.google.android.play.core.assetpacks.da daVar2 = dbVarQ.c;
        int i2 = daVar2.d;
        if (i2 != 5 && i2 != 6) {
            return null;
        }
        this.b.F(daVar2.f2192a, dbVarQ.b, daVar2.b);
        return null;
    }

    final java.util.Map f(final java.util.List list) {
        return (java.util.Map) r(new com.google.android.play.core.assetpacks.dd() { // from class: com.google.android.play.core.assetpacks.cv
            @Override // com.google.android.play.core.assetpacks.dd
            public final java.lang.Object a() {
                return this.f2186a.h(list);
            }
        });
    }

    final java.util.Map g() {
        return this.d;
    }

    final /* synthetic */ java.util.Map h(java.util.List list) {
        java.util.Map mapU = u(list);
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            final com.google.android.play.core.assetpacks.db dbVar = (com.google.android.play.core.assetpacks.db) mapU.get(str);
            if (dbVar == null) {
                map.put(str, 8);
            } else {
                com.google.android.play.core.assetpacks.da daVar = dbVar.c;
                if (com.google.android.play.core.assetpacks.bg.a(daVar.d)) {
                    try {
                        daVar.d = 6;
                        ((java.util.concurrent.Executor) this.g.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.cy
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f2189a.n(dbVar.f2193a);
                            }
                        });
                        this.c.c(str);
                    } catch (com.google.android.play.core.assetpacks.ck unused) {
                        f2195a.d("Session %d with pack %s does not exist, no need to cancel.", java.lang.Integer.valueOf(dbVar.f2193a), str);
                    }
                }
                map.put(str, java.lang.Integer.valueOf(dbVar.c.d));
            }
        }
        return map;
    }

    final /* synthetic */ java.util.Map i(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        for (com.google.android.play.core.assetpacks.db dbVar : this.d.values()) {
            java.lang.String str = dbVar.c.f2192a;
            if (list.contains(str)) {
                com.google.android.play.core.assetpacks.db dbVar2 = (com.google.android.play.core.assetpacks.db) map.get(str);
                if ((dbVar2 == null ? -1 : dbVar2.f2193a) < dbVar.f2193a) {
                    map.put(str, dbVar);
                }
            }
        }
        return map;
    }

    final void j() {
        this.e.lock();
    }

    final void k(final java.lang.String str, final int i, final long j) {
        r(new com.google.android.play.core.assetpacks.dd() { // from class: com.google.android.play.core.assetpacks.cu
            @Override // com.google.android.play.core.assetpacks.dd
            public final java.lang.Object a() {
                this.f2185a.c(str, i, j);
                return null;
            }
        });
    }

    final void l() {
        this.e.unlock();
    }

    final void m(final int i, int i2) {
        final int i3 = 5;
        r(new com.google.android.play.core.assetpacks.dd(i, i3) { // from class: com.google.android.play.core.assetpacks.cx
            public final /* synthetic */ int b;

            @Override // com.google.android.play.core.assetpacks.dd
            public final java.lang.Object a() {
                this.f2188a.d(this.b, 5);
                return null;
            }
        });
    }

    final void n(final int i) {
        r(new com.google.android.play.core.assetpacks.dd() { // from class: com.google.android.play.core.assetpacks.cs
            @Override // com.google.android.play.core.assetpacks.dd
            public final java.lang.Object a() {
                this.f2183a.e(i);
                return null;
            }
        });
    }

    final boolean o(final android.os.Bundle bundle) {
        return ((java.lang.Boolean) r(new com.google.android.play.core.assetpacks.dd() { // from class: com.google.android.play.core.assetpacks.ct
            @Override // com.google.android.play.core.assetpacks.dd
            public final java.lang.Object a() {
                return this.f2184a.a(bundle);
            }
        })).booleanValue();
    }

    final boolean p(final android.os.Bundle bundle) {
        return ((java.lang.Boolean) r(new com.google.android.play.core.assetpacks.dd() { // from class: com.google.android.play.core.assetpacks.cw
            @Override // com.google.android.play.core.assetpacks.dd
            public final java.lang.Object a() {
                return this.f2187a.b(bundle);
            }
        })).booleanValue();
    }
}

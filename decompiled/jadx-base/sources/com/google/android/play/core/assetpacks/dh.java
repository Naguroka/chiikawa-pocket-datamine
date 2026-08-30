package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2197a = new com.google.android.play.core.assetpacks.internal.o("ExtractorTaskFinder");
    private final com.google.android.play.core.assetpacks.de b;
    private final com.google.android.play.core.assetpacks.bh c;
    private final com.google.android.play.core.assetpacks.bu d;

    dh(com.google.android.play.core.assetpacks.de deVar, com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.bu buVar) {
        this.b = deVar;
        this.c = bhVar;
        this.d = buVar;
    }

    private final boolean b(com.google.android.play.core.assetpacks.db dbVar, com.google.android.play.core.assetpacks.dc dcVar) {
        com.google.android.play.core.assetpacks.bh bhVar = this.c;
        com.google.android.play.core.assetpacks.da daVar = dbVar.c;
        return new com.google.android.play.core.assetpacks.eo(bhVar, daVar.f2192a, dbVar.b, daVar.b, dcVar.f2194a).m();
    }

    private static boolean c(com.google.android.play.core.assetpacks.dc dcVar) {
        int i = dcVar.f;
        return i == 1 || i == 2;
    }

    final com.google.android.play.core.assetpacks.dg a() {
        com.google.android.play.core.assetpacks.dg erVar;
        com.google.android.play.core.assetpacks.dg efVar;
        com.google.android.play.core.assetpacks.de deVar;
        int iA;
        try {
            this.b.j();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.play.core.assetpacks.db dbVar : this.b.g().values()) {
                if (com.google.android.play.core.assetpacks.bg.b(dbVar.c.d)) {
                    arrayList.add(dbVar);
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Map mapT = this.c.t();
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        erVar = null;
                        break;
                    }
                    com.google.android.play.core.assetpacks.db dbVar2 = (com.google.android.play.core.assetpacks.db) it.next();
                    java.lang.Long l = (java.lang.Long) mapT.get(dbVar2.c.f2192a);
                    if (l != null && dbVar2.c.b == l.longValue()) {
                        f2197a.a("Found promote pack task for session %s with pack %s.", java.lang.Integer.valueOf(dbVar2.f2193a), dbVar2.c.f2192a);
                        int i = dbVar2.f2193a;
                        java.lang.String str = dbVar2.c.f2192a;
                        erVar = new com.google.android.play.core.assetpacks.ei(i, str, this.c.a(str), dbVar2.b, dbVar2.c.b);
                        break;
                    }
                }
                if (erVar == null) {
                    java.util.Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            erVar = null;
                            break;
                        }
                        com.google.android.play.core.assetpacks.db dbVar3 = (com.google.android.play.core.assetpacks.db) it2.next();
                        try {
                            com.google.android.play.core.assetpacks.bh bhVar = this.c;
                            com.google.android.play.core.assetpacks.da daVar = dbVar3.c;
                            if (bhVar.b(daVar.f2192a, dbVar3.b, daVar.b) == dbVar3.c.f.size()) {
                                f2197a.a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(dbVar3.f2193a), dbVar3.c.f2192a);
                                int i2 = dbVar3.f2193a;
                                com.google.android.play.core.assetpacks.da daVar2 = dbVar3.c;
                                erVar = new com.google.android.play.core.assetpacks.dw(i2, daVar2.f2192a, dbVar3.b, daVar2.b, daVar2.c);
                                break;
                            }
                        } catch (java.io.IOException e) {
                            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Failed to check number of completed merges for session %s, pack %s", java.lang.Integer.valueOf(dbVar3.f2193a), dbVar3.c.f2192a), e, dbVar3.f2193a);
                        }
                    }
                    if (erVar == null) {
                        java.util.Iterator it3 = arrayList.iterator();
                        loop3: while (true) {
                            if (!it3.hasNext()) {
                                erVar = null;
                                break;
                            }
                            com.google.android.play.core.assetpacks.db dbVar4 = (com.google.android.play.core.assetpacks.db) it3.next();
                            com.google.android.play.core.assetpacks.da daVar3 = dbVar4.c;
                            if (com.google.android.play.core.assetpacks.bg.b(daVar3.d)) {
                                for (com.google.android.play.core.assetpacks.dc dcVar : daVar3.f) {
                                    com.google.android.play.core.assetpacks.bh bhVar2 = this.c;
                                    com.google.android.play.core.assetpacks.da daVar4 = dbVar4.c;
                                    if (bhVar2.q(daVar4.f2192a, dbVar4.b, daVar4.b, dcVar.f2194a).exists()) {
                                        f2197a.a("Found merge task for session %s with pack %s and slice %s.", java.lang.Integer.valueOf(dbVar4.f2193a), dbVar4.c.f2192a, dcVar.f2194a);
                                        int i3 = dbVar4.f2193a;
                                        com.google.android.play.core.assetpacks.da daVar5 = dbVar4.c;
                                        erVar = new com.google.android.play.core.assetpacks.dt(i3, daVar5.f2192a, dbVar4.b, daVar5.b, dcVar.f2194a);
                                        break loop3;
                                    }
                                }
                            }
                        }
                        if (erVar == null) {
                            java.util.Iterator it4 = arrayList.iterator();
                            loop5: while (true) {
                                if (!it4.hasNext()) {
                                    erVar = null;
                                    break;
                                }
                                com.google.android.play.core.assetpacks.db dbVar5 = (com.google.android.play.core.assetpacks.db) it4.next();
                                com.google.android.play.core.assetpacks.da daVar6 = dbVar5.c;
                                if (com.google.android.play.core.assetpacks.bg.b(daVar6.d)) {
                                    for (com.google.android.play.core.assetpacks.dc dcVar2 : daVar6.f) {
                                        if (b(dbVar5, dcVar2)) {
                                            com.google.android.play.core.assetpacks.bh bhVar3 = this.c;
                                            com.google.android.play.core.assetpacks.da daVar7 = dbVar5.c;
                                            if (bhVar3.p(daVar7.f2192a, dbVar5.b, daVar7.b, dcVar2.f2194a).exists()) {
                                                f2197a.a("Found verify task for session %s with pack %s and slice %s.", java.lang.Integer.valueOf(dbVar5.f2193a), dbVar5.c.f2192a, dcVar2.f2194a);
                                                int i4 = dbVar5.f2193a;
                                                com.google.android.play.core.assetpacks.da daVar8 = dbVar5.c;
                                                erVar = new com.google.android.play.core.assetpacks.er(i4, daVar8.f2192a, dbVar5.b, daVar8.b, dcVar2.f2194a, dcVar2.b, dcVar2.c);
                                                break loop5;
                                            }
                                        }
                                    }
                                }
                            }
                            if (erVar == null) {
                                java.util.Iterator it5 = arrayList.iterator();
                                loop7: while (true) {
                                    if (!it5.hasNext()) {
                                        efVar = null;
                                        break;
                                    }
                                    com.google.android.play.core.assetpacks.db dbVar6 = (com.google.android.play.core.assetpacks.db) it5.next();
                                    com.google.android.play.core.assetpacks.da daVar9 = dbVar6.c;
                                    if (com.google.android.play.core.assetpacks.bg.b(daVar9.d)) {
                                        for (com.google.android.play.core.assetpacks.dc dcVar3 : daVar9.f) {
                                            if (!c(dcVar3)) {
                                                com.google.android.play.core.assetpacks.bh bhVar4 = this.c;
                                                com.google.android.play.core.assetpacks.da daVar10 = dbVar6.c;
                                                java.util.Iterator it6 = it5;
                                                try {
                                                    iA = new com.google.android.play.core.assetpacks.eo(bhVar4, daVar10.f2192a, dbVar6.b, daVar10.b, dcVar3.f2194a).a();
                                                } catch (java.io.IOException e2) {
                                                    f2197a.b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                                    iA = 0;
                                                }
                                                if (iA != -1 && ((com.google.android.play.core.assetpacks.cz) dcVar3.d.get(iA)).f2190a) {
                                                    f2197a.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", java.lang.Integer.valueOf(dcVar3.e), java.lang.Integer.valueOf(dbVar6.f2193a), dbVar6.c.f2192a, dcVar3.f2194a, java.lang.Integer.valueOf(iA));
                                                    java.io.InputStream inputStreamA = this.d.a(dbVar6.f2193a, dbVar6.c.f2192a, dcVar3.f2194a, iA);
                                                    int i5 = dbVar6.f2193a;
                                                    com.google.android.play.core.assetpacks.da daVar11 = dbVar6.c;
                                                    java.lang.String str2 = daVar11.f2192a;
                                                    int i6 = dbVar6.b;
                                                    long j = daVar11.b;
                                                    java.lang.String str3 = daVar11.c;
                                                    java.lang.String str4 = dcVar3.f2194a;
                                                    int i7 = dcVar3.e;
                                                    int size = dcVar3.d.size();
                                                    com.google.android.play.core.assetpacks.da daVar12 = dbVar6.c;
                                                    efVar = new com.google.android.play.core.assetpacks.ce(i5, str2, i6, j, str3, str4, i7, iA, size, daVar12.e, daVar12.d, inputStreamA);
                                                    break loop7;
                                                }
                                                it5 = it6;
                                            }
                                        }
                                    }
                                }
                                if (efVar == null) {
                                    java.util.Iterator it7 = arrayList.iterator();
                                    loop9: while (true) {
                                        if (!it7.hasNext()) {
                                            efVar = null;
                                            break;
                                        }
                                        com.google.android.play.core.assetpacks.db dbVar7 = (com.google.android.play.core.assetpacks.db) it7.next();
                                        com.google.android.play.core.assetpacks.da daVar13 = dbVar7.c;
                                        if (com.google.android.play.core.assetpacks.bg.b(daVar13.d)) {
                                            for (com.google.android.play.core.assetpacks.dc dcVar4 : daVar13.f) {
                                                if (c(dcVar4) && ((com.google.android.play.core.assetpacks.cz) dcVar4.d.get(0)).f2190a && !b(dbVar7, dcVar4)) {
                                                    f2197a.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", java.lang.Integer.valueOf(dcVar4.f), java.lang.Integer.valueOf(dbVar7.f2193a), dbVar7.c.f2192a, dcVar4.f2194a);
                                                    java.io.InputStream inputStreamA2 = this.d.a(dbVar7.f2193a, dbVar7.c.f2192a, dcVar4.f2194a, 0);
                                                    int i8 = dbVar7.f2193a;
                                                    java.lang.String str5 = dbVar7.c.f2192a;
                                                    efVar = new com.google.android.play.core.assetpacks.ef(i8, str5, this.c.a(str5), this.c.c(dbVar7.c.f2192a), dbVar7.b, dbVar7.c.b, dcVar4.f, dcVar4.f2194a, dcVar4.c, inputStreamA2);
                                                    break loop9;
                                                }
                                            }
                                        }
                                    }
                                    if (efVar != null) {
                                        deVar = this.b;
                                    }
                                } else {
                                    deVar = this.b;
                                }
                                deVar.l();
                                return efVar;
                            }
                        }
                    }
                }
                this.b.l();
                return erVar;
            }
            this.b.l();
            return null;
        } catch (java.lang.Throwable th) {
            this.b.l();
            throw th;
        }
    }
}

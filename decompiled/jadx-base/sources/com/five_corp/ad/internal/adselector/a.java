package com.five_corp.ad.internal.adselector;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.context.g f1841a;
    public final com.five_corp.ad.internal.context.k b;
    public final com.five_corp.ad.internal.G c;
    public final com.five_corp.ad.internal.adselector.b d;
    public final com.five_corp.ad.internal.m e;
    public final com.five_corp.ad.internal.context.s f;
    public final android.os.Handler g = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        com.five_corp.ad.internal.adselector.a.class.toString();
    }

    public a(com.five_corp.ad.internal.context.g gVar, com.five_corp.ad.internal.context.k kVar, com.five_corp.ad.internal.G g, com.five_corp.ad.internal.adselector.b bVar, com.five_corp.ad.internal.m mVar, com.five_corp.ad.internal.context.s sVar) {
        this.f1841a = gVar;
        this.b = kVar;
        this.c = g;
        this.d = bVar;
        this.e = mVar;
        this.f = sVar;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(final com.five_corp.ad.internal.s sVar, final com.five_corp.ad.internal.adselector.c cVar) {
        this.g.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(sVar, cVar);
            }
        });
    }

    public final void b(com.five_corp.ad.internal.s sVar, com.five_corp.ad.internal.adselector.c cVar) {
        com.five_corp.ad.internal.m mVar = this.e;
        mVar.getClass();
        if (sVar.a() == com.five_corp.ad.FiveAdErrorCode.NO_AD) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (mVar.h) {
                com.five_corp.ad.internal.cache.x xVar = mVar.j;
                com.five_corp.ad.internal.media_config.a aVar = xVar.b;
                long j = aVar != null ? aVar.f : 1800000L;
                if (!mVar.i && jCurrentTimeMillis - xVar.c >= j) {
                    mVar.i = true;
                    mVar.e.a(new com.five_corp.ad.internal.C1441i(mVar.f1948a, mVar.b, mVar.c, mVar.d, mVar.f, mVar.g, 4, mVar));
                }
            }
        }
        cVar.onFailureToSelectAd(sVar);
    }

    public final /* synthetic */ void d(final com.five_corp.ad.internal.adselector.c cVar, final com.five_corp.ad.internal.s sVar) {
        this.g.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                cVar.onFailureToSelectAd(sVar);
            }
        });
    }

    public final void a(java.util.List list, com.five_corp.ad.internal.context.m mVar, com.five_corp.ad.internal.adselector.c cVar) {
        com.five_corp.ad.internal.util.f fVar;
        com.five_corp.ad.internal.ad.format_config.a aVarA;
        int iOrdinal;
        com.five_corp.ad.internal.C1433a c1433a;
        java.util.Iterator it = list.iterator();
        com.five_corp.ad.internal.s sVar = null;
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad_check.e eVar = (com.five_corp.ad.internal.ad_check.e) it.next();
            int iA = com.five_corp.ad.e.a(eVar.f1838a);
            if (iA == 0) {
                com.five_corp.ad.internal.ad.a aVar = eVar.b;
                java.lang.String str = mVar.c.f1896a.c;
                fVar = (!com.five_corp.ad.internal.A.a(aVar, mVar.e) || com.five_corp.ad.internal.ad.a.a(aVar, str) == null || (aVarA = com.five_corp.ad.internal.ad.a.a(aVar, str)) == null || ((iOrdinal = mVar.f1891a.ordinal()) == 0 || iOrdinal == 1 ? aVarA.b == null : !((iOrdinal == 2 || iOrdinal == 3) && aVarA.c != null))) ? new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.h0, null, null, null), null) : new com.five_corp.ad.internal.util.f(true, null, eVar.b);
            } else {
                if (iA != 1) {
                    throw new java.lang.RuntimeException("Unknown ShowInformationType!");
                }
                java.lang.String str2 = eVar.c;
                java.util.Iterator it2 = mVar.b.iterator();
                do {
                    if (!it2.hasNext()) {
                        c1433a = null;
                        break;
                    }
                    c1433a = (com.five_corp.ad.internal.C1433a) it2.next();
                } while (!str2.equals(c1433a.f1788a.f1937a.c));
                if (c1433a == null) {
                    fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.g0, null, null, null), null);
                } else {
                    fVar = !c1433a.d ? new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.U, null, null, null), null) : new com.five_corp.ad.internal.util.f(true, null, c1433a.f1788a.f1937a);
                }
            }
            if (fVar.f2085a) {
                com.five_corp.ad.internal.context.j jVarA = this.b.a((com.five_corp.ad.internal.ad.a) fVar.c);
                if (jVarA != null) {
                    a(jVarA, mVar, cVar);
                    return;
                }
                sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.i0, null, null, null);
            } else {
                sVar = fVar.b;
            }
        }
        if (sVar != null) {
            b(sVar, cVar);
        } else {
            b(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.f0, null, null, null), cVar);
        }
    }

    public final /* synthetic */ void b(final com.five_corp.ad.internal.adselector.c cVar, final com.five_corp.ad.internal.context.l lVar) {
        this.g.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                cVar.onAdSuccessfullySelected(lVar);
            }
        });
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final java.util.List list, final com.five_corp.ad.internal.context.m mVar, final com.five_corp.ad.internal.adselector.c cVar) {
        this.g.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list, mVar, cVar);
            }
        });
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final com.five_corp.ad.internal.context.h hVar, final com.five_corp.ad.internal.context.t tVar, final com.five_corp.ad.internal.adselector.c cVar, final com.five_corp.ad.internal.soundstate.a aVar) {
        this.g.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(hVar, tVar, cVar, aVar);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:168:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x013a A[SYNTHETIC] */
    public final void a(com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.context.t tVar, final com.five_corp.ad.internal.adselector.c cVar, com.five_corp.ad.internal.soundstate.a aVar) {
        com.five_corp.ad.internal.s sVar;
        com.five_corp.ad.internal.util.f fVar;
        com.five_corp.ad.internal.ad.format_config.a aVarA;
        java.util.List list;
        java.util.List list2;
        int i;
        int i2;
        com.five_corp.ad.internal.ad.format_config.a aVarA2;
        int iOrdinal;
        if (hVar == com.five_corp.ad.internal.context.h.NATIVE && !tVar.c.c) {
            b(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.G5, null, null, null), cVar);
            return;
        }
        com.five_corp.ad.internal.context.g gVar = this.f1841a;
        gVar.e.getClass();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.five_corp.ad.internal.C1434b c1434b = gVar.b.b().f1881a;
        com.five_corp.ad.internal.context.i iVar = tVar.f1896a;
        com.five_corp.ad.internal.storage.e eVar = gVar.c;
        c1434b.getClass();
        java.util.ArrayList<com.five_corp.ad.internal.C1433a> arrayList = new java.util.ArrayList();
        for (com.five_corp.ad.internal.ad.a aVar2 : c1434b.f1843a) {
            java.lang.Long l = (java.lang.Long) c1434b.b.get(aVar2.e);
            long jLongValue = l != null ? l.longValue() : 0L;
            java.lang.String str = iVar.c;
            com.five_corp.ad.internal.ad.f fVar2 = aVar2.e;
            java.util.Map map = c1434b.c;
            if (map != null && map.get(str) != null) {
                java.util.Iterator it = ((java.util.List) c1434b.c.get(str)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 0;
                        break;
                    }
                    com.five_corp.ad.internal.ad.b bVar = (com.five_corp.ad.internal.ad.b) it.next();
                    if (bVar.f1790a.equals(fVar2)) {
                        i2 = bVar.b;
                        break;
                    }
                }
            } else {
                i2 = 1;
            }
            com.five_corp.ad.internal.C1442j c1442jA = com.five_corp.ad.internal.C1434b.a(aVar2, eVar);
            java.lang.String str2 = iVar.c;
            arrayList.add(new com.five_corp.ad.internal.C1433a(c1442jA, jLongValue, i2, com.five_corp.ad.internal.A.a(aVar2, jCurrentTimeMillis) && com.five_corp.ad.internal.ad.a.a(aVar2, str2) != null && (aVarA2 = com.five_corp.ad.internal.ad.a.a(aVar2, str2)) != null && ((iOrdinal = hVar.ordinal()) == 0 || iOrdinal == 1 ? aVarA2.b != null : (iOrdinal == 2 || iOrdinal == 3) && aVarA2.c != null)));
        }
        final com.five_corp.ad.internal.context.m mVar = new com.five_corp.ad.internal.context.m(hVar, arrayList, tVar, aVar, jCurrentTimeMillis);
        if (tVar.c.b) {
            com.five_corp.ad.internal.G g = this.c;
            com.five_corp.ad.internal.ad_check.c cVar2 = new com.five_corp.ad.internal.ad_check.c() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda0
                @Override // com.five_corp.ad.internal.ad_check.c
                public final void a(java.util.List list3) {
                    this.f$0.a(mVar, cVar, list3);
                }
            };
            com.five_corp.ad.internal.ad_check.b bVar2 = new com.five_corp.ad.internal.ad_check.b() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda2
                @Override // com.five_corp.ad.internal.ad_check.b
                public final void a(com.five_corp.ad.internal.s sVar2) {
                    this.f$0.b(cVar, sVar2);
                }
            };
            g.getClass();
            new java.lang.Thread(new com.five_corp.ad.internal.F(g, mVar, bVar2, cVar2)).start();
            return;
        }
        com.five_corp.ad.internal.adselector.b bVar3 = this.d;
        bVar3.getClass();
        com.five_corp.ad.internal.context.i iVar2 = tVar.f1896a;
        if (bVar3.b.nextDouble() >= tVar.c.d) {
            java.util.ArrayList<com.five_corp.ad.internal.C1433a> arrayList2 = new java.util.ArrayList();
            for (com.five_corp.ad.internal.C1433a c1433a : arrayList) {
                java.lang.String str3 = iVar2.c;
                com.five_corp.ad.internal.context.h hVar2 = mVar.f1891a;
                long j = mVar.e;
                int i3 = com.five_corp.ad.internal.A.f1779a;
                com.five_corp.ad.internal.ad.a aVar3 = c1433a.f1788a.f1937a;
                if (com.five_corp.ad.internal.ad.a.a(aVar3, str3) != null && (aVarA = com.five_corp.ad.internal.ad.a.a(aVar3, str3)) != null) {
                    int iOrdinal2 = hVar2.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                        if (aVarA.b != null) {
                            if (aVar3.f.longValue() >= j && ((list = aVar3.l) == null || !list.contains(str3))) {
                                list2 = aVar3.m;
                                if (list2 != null || list2.contains(str3)) {
                                    if (c1433a.c > 0 && ((i = c1433a.f1788a.b) == 4 || i == 3)) {
                                        if (c1433a.b > j) {
                                            arrayList2.add(c1433a);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                        if (aVarA.c != null) {
                            if (aVar3.f.longValue() >= j) {
                                list2 = aVar3.m;
                                if (list2 != null) {
                                }
                                if (c1433a.c > 0) {
                                    if (c1433a.b > j) {
                                        arrayList2.add(c1433a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (!arrayList2.isEmpty()) {
                    double[] dArr = new double[arrayList2.size()];
                    double d = 0.0d;
                    int i4 = 0;
                    for (com.five_corp.ad.internal.C1433a c1433a2 : arrayList2) {
                        dArr[i4] = d;
                        d += (double) c1433a2.c;
                        i4++;
                    }
                    double dNextDouble = bVar3.b.nextDouble() * d;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 - 1;
                        if (i5 >= i6) {
                            i5 = i6;
                            break;
                        } else if (dArr[i5] <= dNextDouble && dNextDouble < dArr[i5 + 1]) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    com.five_corp.ad.internal.context.j jVarA = bVar3.f1842a.a(((com.five_corp.ad.internal.C1433a) arrayList2.remove(i5)).f1788a.f1937a);
                    if (jVarA != null) {
                        fVar = new com.five_corp.ad.internal.util.f(true, null, jVarA);
                        break;
                    }
                } else {
                    com.five_corp.ad.internal.p pVar = bVar3.c;
                    synchronized (pVar.f2043a) {
                        sVar = pVar.b;
                        pVar.b = null;
                    }
                    if (sVar == null) {
                        sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.t, null, null, null);
                    }
                    fVar = new com.five_corp.ad.internal.util.f(false, sVar, null);
                    break;
                }
            }
        } else {
            fVar = com.five_corp.ad.internal.util.f.a(com.five_corp.ad.internal.t.x);
        }
        if (fVar.f2085a) {
            a((com.five_corp.ad.internal.context.j) fVar.c, mVar, cVar);
        } else {
            b(fVar.b, cVar);
        }
    }

    public final void a(com.five_corp.ad.internal.context.i iVar, final com.five_corp.ad.internal.context.h hVar, final com.five_corp.ad.internal.soundstate.a aVar, final com.five_corp.ad.internal.adselector.c cVar) {
        this.f.a(iVar, new com.five_corp.ad.internal.context.q() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda10
            @Override // com.five_corp.ad.internal.context.q
            public final void a(com.five_corp.ad.internal.context.t tVar) {
                this.f$0.a(hVar, aVar, cVar, tVar);
            }
        }, 10000L, new com.five_corp.ad.internal.context.r() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.context.r
            public final void a(com.five_corp.ad.internal.s sVar) {
                this.f$0.a(cVar, sVar);
            }
        });
    }

    public final void a(com.five_corp.ad.internal.context.j jVar, com.five_corp.ad.internal.context.m mVar, final com.five_corp.ad.internal.adselector.c cVar) {
        this.f1841a.a(jVar, null, mVar.c, mVar.f1891a, new com.five_corp.ad.internal.context.e() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda7
            @Override // com.five_corp.ad.internal.context.e
            public final void a(com.five_corp.ad.internal.context.l lVar) {
                this.f$0.b(cVar, lVar);
            }
        }, new com.five_corp.ad.internal.context.f() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda8
            @Override // com.five_corp.ad.internal.context.f
            public final void a(com.five_corp.ad.internal.s sVar) {
                this.f$0.d(cVar, sVar);
            }
        });
    }
}

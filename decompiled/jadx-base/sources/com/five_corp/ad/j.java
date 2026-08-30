package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements com.five_corp.ad.internal.system.f {
    public final com.five_corp.ad.internal.system.i A;
    public final java.util.concurrent.atomic.AtomicBoolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.logger.a f2119a;
    public final com.five_corp.ad.internal.E b;
    public final com.five_corp.ad.internal.l c;
    public final com.five_corp.ad.internal.p d;
    public final com.five_corp.ad.internal.context.k e;
    public final com.five_corp.ad.internal.w f;
    public final com.five_corp.ad.internal.storage.e g;
    public final com.five_corp.ad.FiveAdConfig h;
    public final com.five_corp.ad.internal.cache.s i;
    public final com.five_corp.ad.internal.cache.w j;
    public final com.five_corp.ad.internal.context.g k;
    public final com.five_corp.ad.internal.adselector.a l;
    public final java.lang.String m;
    public final com.five_corp.ad.internal.bgtask.b n;
    public final com.five_corp.ad.internal.bgtask.b o;
    public final com.five_corp.ad.internal.soundstate.e p;
    public final com.five_corp.ad.internal.G q;
    public final com.five_corp.ad.internal.m r;
    public final com.five_corp.ad.internal.K s;
    public final com.five_corp.ad.internal.r t;
    public final com.five_corp.ad.internal.time.a u;
    public final com.five_corp.ad.internal.system.m v;
    public final com.five_corp.ad.internal.system.b w;
    public final com.five_corp.ad.internal.http.auxcache.i x;
    public final com.five_corp.ad.internal.http.movcache.h y;
    public final com.five_corp.ad.internal.context.s z;

    public j(android.content.Context context, com.five_corp.ad.FiveAdConfig fiveAdConfig, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.logger.a aVar2) {
        this(context, fiveAdConfig, aVar, aVar2, new com.five_corp.ad.internal.http.connection.b(), new com.five_corp.ad.internal.storage.l(context.getApplicationContext().getFilesDir(), aVar2));
    }

    public static java.lang.String a(java.lang.String str, boolean z) {
        return "20241129:" + str + ":" + z;
    }

    public final com.five_corp.ad.internal.util.g b() {
        try {
            this.A.b();
            com.five_corp.ad.internal.util.g gVarB = this.g.b(this.m);
            if (!gVarB.f2085a) {
                return gVarB;
            }
            com.five_corp.ad.internal.util.g gVarC = c();
            if (!gVarC.f2085a) {
                return gVarC;
            }
            com.five_corp.ad.internal.system.i iVar = this.A;
            synchronized (iVar.d) {
                iVar.e.f2086a.add(new java.lang.ref.WeakReference(this));
            }
            com.five_corp.ad.internal.util.f fVarA = this.s.a();
            if (!fVarA.f2085a) {
                return new com.five_corp.ad.internal.util.g(false, fVarA.b);
            }
            int iIntValue = ((java.lang.Integer) fVarA.c).intValue();
            return (4300000 > iIntValue || iIntValue >= 4400000) ? new com.five_corp.ad.internal.util.g(true, null) : new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.I, "Google Play Services version " + iIntValue + " has a bug.", null, null));
        } catch (java.lang.Throwable th) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.j, null, th, null));
        }
    }

    public final com.five_corp.ad.internal.util.g c() throws java.lang.Throwable {
        com.five_corp.ad.internal.util.g gVarA;
        com.five_corp.ad.internal.util.f fVar;
        com.five_corp.ad.internal.util.f fVar2;
        com.five_corp.ad.internal.util.f fVar3;
        boolean z;
        com.five_corp.ad.internal.util.f fVar4;
        boolean z2;
        com.five_corp.ad.internal.util.f fVar5;
        this.u.getClass();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.five_corp.ad.internal.util.g gVarA2 = this.f.a();
        if (!gVarA2.f2085a) {
            return new com.five_corp.ad.internal.util.g(false, gVarA2.b);
        }
        com.five_corp.ad.internal.w wVar = this.f;
        com.five_corp.ad.internal.util.f fVarD = wVar.d("sdk.version");
        if (fVarD.f2085a && new java.lang.String((byte[]) fVarD.c).trim().equals(java.lang.String.valueOf(com.five_corp.ad.BuildConfig.SEMVER_PATCH))) {
            gVarA = new com.five_corp.ad.internal.util.g(true, null);
        } else {
            java.io.File[] fileArrListFiles = wVar.f2116a.listFiles();
            int length = fileArrListFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gVarA = wVar.a("sdk.version", java.lang.String.valueOf(com.five_corp.ad.BuildConfig.SEMVER_PATCH).getBytes());
                    break;
                }
                if (!fileArrListFiles[i].delete()) {
                    gVarA = com.five_corp.ad.internal.util.g.b(com.five_corp.ad.internal.t.w);
                    break;
                }
                i++;
            }
        }
        if (!gVarA.f2085a) {
            return new com.five_corp.ad.internal.util.g(false, gVarA.b);
        }
        com.five_corp.ad.internal.w wVar2 = this.f;
        com.five_corp.ad.internal.l lVar = this.c;
        wVar2.getClass();
        java.util.ArrayList<com.five_corp.ad.internal.ad.a> arrayList = new java.util.ArrayList();
        for (java.io.File file : wVar2.f2116a.listFiles()) {
            java.lang.String name = file.getName();
            if (name.endsWith("response.json")) {
                com.five_corp.ad.internal.util.f fVarD2 = wVar2.d(name);
                if (fVarD2.f2085a) {
                    try {
                        java.lang.String str = new java.lang.String((byte[]) fVarD2.c);
                        lVar.getClass();
                        arrayList.add(com.five_corp.ad.internal.l.a(new org.json.JSONObject(str)));
                    } catch (com.five_corp.ad.internal.exception.b | org.json.JSONException e) {
                        android.util.Log.getStackTraceString(e);
                        wVar2.a(name);
                    }
                } else {
                    java.util.Objects.toString(fVarD2.b.f2045a);
                    wVar2.a(name);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.five_corp.ad.internal.ad.a aVar : arrayList) {
            if (com.five_corp.ad.internal.A.a(aVar, jCurrentTimeMillis)) {
                arrayList2.add(aVar);
            } else {
                com.five_corp.ad.internal.w wVar3 = this.f;
                wVar3.getClass();
                wVar3.a(aVar.c + ".response.json");
            }
        }
        com.five_corp.ad.internal.w wVar4 = this.f;
        com.five_corp.ad.internal.l lVar2 = this.c;
        wVar4.getClass();
        com.five_corp.ad.internal.C1435c c1435c = new com.five_corp.ad.internal.C1435c(new java.util.HashMap(), new java.util.HashMap(), new com.five_corp.ad.internal.media_config.a("{\"ds\":[],\"sn\":false,\"rmcl\":false}", new java.util.ArrayList(), false, false, 250000, 1800000L, false, false, java.util.Collections.emptyList(), new com.five_corp.ad.internal.media_config.b(null, null, null)));
        java.lang.String[] list = wVar4.f2116a.list(new com.five_corp.ad.internal.v());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int length2 = list.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                fVar = new com.five_corp.ad.internal.util.f(true, null, arrayList3);
                break;
            }
            try {
                fVar5 = new com.five_corp.ad.internal.util.f(true, null, java.lang.Long.valueOf(java.lang.Long.parseLong(list[i2].replace("adcfg-", "").replace(".json", ""))));
                z2 = false;
            } catch (java.lang.NumberFormatException e2) {
                z2 = false;
                fVar5 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.z3, "failed to parse timestamp in filename", e2, null), null);
            }
            if (!fVar5.f2085a) {
                fVar = new com.five_corp.ad.internal.util.f(z2, fVar5.b, null);
                break;
            }
            arrayList3.add((java.lang.Long) fVar5.c);
            i2++;
        }
        if (fVar.f2085a) {
            java.util.Iterator it = ((java.util.List) fVar.c).iterator();
            long jLongValue = 0;
            while (true) {
                if (!it.hasNext()) {
                    fVar2 = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.util.d(java.lang.Long.valueOf(jLongValue), c1435c));
                    break;
                }
                java.lang.Long l = (java.lang.Long) it.next();
                if (l.longValue() <= jLongValue) {
                    wVar4.a(com.five_corp.ad.internal.w.a(l.longValue()));
                }
                long jLongValue2 = l.longValue();
                com.five_corp.ad.internal.util.f fVarD3 = wVar4.d(com.five_corp.ad.internal.w.a(jLongValue2));
                if (fVarD3.f2085a) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String((byte[]) fVarD3.c));
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("cc");
                        lVar2.getClass();
                        java.util.ArrayList<com.five_corp.ad.internal.ad.e> arrayListA = com.five_corp.ad.internal.l.a(jSONArray);
                        java.util.HashMap map = new java.util.HashMap();
                        for (com.five_corp.ad.internal.ad.e eVar : arrayListA) {
                            if (eVar.f1809a == 2) {
                                map.put(eVar.b, eVar.c);
                            }
                        }
                        fVar4 = new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.C1435c(map, com.five_corp.ad.internal.l.b(jSONObject.getJSONArray("ss")), com.five_corp.ad.internal.l.g(jSONObject.getJSONObject("mcfg"))));
                        z = false;
                    } catch (com.five_corp.ad.internal.exception.b e3) {
                        z = false;
                        fVar3 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(e3.f1899a, null, e3, null), null);
                        fVar4 = fVar3;
                    } catch (org.json.JSONException e4) {
                        z = false;
                        fVar3 = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.y3, "failed to deserialize AdConfig", e4, null), null);
                        fVar4 = fVar3;
                    }
                } else {
                    wVar4.a(com.five_corp.ad.internal.w.a(jLongValue2));
                    z = false;
                    fVar4 = new com.five_corp.ad.internal.util.f(false, fVarD3.b, null);
                }
                if (!fVar4.f2085a) {
                    fVar2 = new com.five_corp.ad.internal.util.f(z, fVar4.b, null);
                    break;
                }
                com.five_corp.ad.internal.C1435c c1435c2 = (com.five_corp.ad.internal.C1435c) fVar4.c;
                wVar4.a(com.five_corp.ad.internal.w.a(jLongValue));
                jLongValue = l.longValue();
                c1435c = c1435c2;
            }
        } else {
            fVar2 = new com.five_corp.ad.internal.util.f(false, fVar.b, null);
        }
        if (!fVar2.f2085a) {
            return new com.five_corp.ad.internal.util.g(false, fVar2.b);
        }
        com.five_corp.ad.internal.util.d dVar = (com.five_corp.ad.internal.util.d) fVar2.c;
        java.lang.Long l2 = (java.lang.Long) dVar.f2083a;
        com.five_corp.ad.internal.C1435c c1435c3 = (com.five_corp.ad.internal.C1435c) dVar.b;
        com.five_corp.ad.internal.cache.x xVar = new com.five_corp.ad.internal.cache.x(new com.five_corp.ad.internal.C1434b(arrayList2, c1435c3.f1861a, c1435c3.b), c1435c3.c, l2.longValue());
        com.five_corp.ad.internal.cache.w wVar5 = this.j;
        long jLongValue3 = l2.longValue();
        synchronized (wVar5.g) {
            wVar5.h = jLongValue3;
        }
        wVar5.f1880a.a(new com.five_corp.ad.internal.cache.v(xVar));
        com.five_corp.ad.internal.http.auxcache.i iVar = this.x;
        iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.a(iVar, arrayList2));
        com.five_corp.ad.internal.http.movcache.h hVar = this.y;
        hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.a(hVar, arrayList2));
        return new com.five_corp.ad.internal.util.g(true, null);
    }

    public j(android.content.Context context, com.five_corp.ad.FiveAdConfig fiveAdConfig, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.logger.a aVar2, com.five_corp.ad.internal.http.connection.b bVar, com.five_corp.ad.internal.storage.l lVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        com.five_corp.ad.internal.hub.a aVar3 = new com.five_corp.ad.internal.hub.a();
        com.five_corp.ad.FiveAdConfig fiveAdConfigDeepCopy = fiveAdConfig.deepCopy();
        this.h = fiveAdConfigDeepCopy;
        com.five_corp.ad.internal.I iA = com.five_corp.ad.internal.I.a(applicationContext);
        this.f2119a = aVar2;
        com.five_corp.ad.internal.p pVar = new com.five_corp.ad.internal.p();
        this.d = pVar;
        java.util.Random random = new java.util.Random();
        com.five_corp.ad.internal.system.c cVar = new com.five_corp.ad.internal.system.c("player");
        com.five_corp.ad.internal.system.c cVar2 = new com.five_corp.ad.internal.system.c("io");
        com.five_corp.ad.internal.soundstate.e eVar = new com.five_corp.ad.internal.soundstate.e(fiveAdConfigDeepCopy.a());
        this.p = eVar;
        com.five_corp.ad.internal.K k = new com.five_corp.ad.internal.K(applicationContext);
        this.s = k;
        com.five_corp.ad.internal.http.d dVar = new com.five_corp.ad.internal.http.d(bVar);
        this.u = aVar;
        com.five_corp.ad.internal.bgtask.b bVar2 = new com.five_corp.ad.internal.bgtask.b(1, aVar, aVar2);
        this.n = bVar2;
        com.five_corp.ad.internal.bgtask.b bVar3 = new com.five_corp.ad.internal.bgtask.b(3, aVar, aVar2);
        this.o = bVar3;
        com.five_corp.ad.internal.storage.e eVar2 = new com.five_corp.ad.internal.storage.e(lVar, new com.five_corp.ad.internal.storage.r(random), cVar2, aVar2);
        this.g = eVar2;
        this.m = a(fiveAdConfigDeepCopy.appId, fiveAdConfigDeepCopy.isTest);
        com.five_corp.ad.internal.context.k kVar = new com.five_corp.ad.internal.context.k();
        this.e = kVar;
        com.five_corp.ad.internal.l lVar2 = new com.five_corp.ad.internal.l();
        this.c = lVar2;
        com.five_corp.ad.internal.w wVar = new com.five_corp.ad.internal.w(applicationContext.getFilesDir());
        this.f = wVar;
        com.five_corp.ad.internal.base_url.a aVar4 = new com.five_corp.ad.internal.base_url.a();
        com.five_corp.ad.internal.tracking_data.b bVar4 = new com.five_corp.ad.internal.tracking_data.b(applicationContext);
        com.five_corp.ad.internal.E e = new com.five_corp.ad.internal.E(aVar4, iA, fiveAdConfigDeepCopy, k, aVar, new com.five_corp.ad.internal.context.n(new com.five_corp.ad.internal.system.e(applicationContext), com.five_corp.ad.internal.tracking_data.e.a(applicationContext)), bVar4);
        this.b = e;
        com.five_corp.ad.internal.http.auxcache.i iVar = new com.five_corp.ad.internal.http.auxcache.i(aVar2, eVar2, bVar);
        this.x = iVar;
        com.five_corp.ad.internal.http.movcache.h hVar = new com.five_corp.ad.internal.http.movcache.h(eVar2, bVar);
        this.y = hVar;
        com.five_corp.ad.internal.adselector.b bVar5 = new com.five_corp.ad.internal.adselector.b(kVar, random, pVar);
        com.five_corp.ad.internal.cache.x xVar = new com.five_corp.ad.internal.cache.x(new com.five_corp.ad.internal.C1434b(new java.util.ArrayList(), new java.util.HashMap(), new java.util.HashMap()), null, 0L);
        com.five_corp.ad.internal.cache.s sVar = new com.five_corp.ad.internal.cache.s(xVar, aVar3);
        this.i = sVar;
        com.five_corp.ad.internal.cache.p pVar2 = new com.five_corp.ad.internal.cache.p(eVar2);
        com.five_corp.ad.internal.cache.w wVar2 = new com.five_corp.ad.internal.cache.w(sVar, wVar, pVar2, iVar, hVar, aVar);
        this.j = wVar2;
        com.five_corp.ad.internal.G g = new com.five_corp.ad.internal.G(e, lVar2, dVar, bVar2, bVar3);
        this.q = g;
        aVar2.a(g);
        com.five_corp.ad.internal.context.g gVar = new com.five_corp.ad.internal.context.g(fiveAdConfigDeepCopy, sVar, eVar2, pVar2, aVar, eVar, cVar, iVar, hVar);
        this.k = gVar;
        this.t = new com.five_corp.ad.internal.r(wVar2);
        com.five_corp.ad.internal.m mVar = new com.five_corp.ad.internal.m(gVar, e, lVar2, wVar2, bVar2, dVar, pVar, xVar);
        this.r = mVar;
        com.five_corp.ad.internal.context.s sVar2 = new com.five_corp.ad.internal.context.s(aVar, bVar4);
        this.z = sVar2;
        this.l = new com.five_corp.ad.internal.adselector.a(gVar, kVar, g, bVar5, mVar, sVar2);
        this.v = new com.five_corp.ad.internal.system.m();
        this.w = com.five_corp.ad.internal.system.b.a();
        this.A = new com.five_corp.ad.internal.system.i(applicationContext, aVar2);
        this.B = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("FetchAdIdHandlerThread");
        handlerThread.start();
        new android.os.Handler(handlerThread.getLooper());
        sVar.a(eVar);
        sVar.a(hVar);
        sVar.a(g);
        sVar.a(aVar4);
        sVar.a(mVar);
        sVar.a(sVar2);
    }

    public final com.five_corp.ad.internal.soundstate.d a() {
        return this.p.a();
    }
}

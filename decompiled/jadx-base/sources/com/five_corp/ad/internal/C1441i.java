package com.five_corp.ad.internal;

/* JADX INFO: renamed from: com.five_corp.ad.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1441i extends com.five_corp.ad.internal.bgtask.m {
    public final com.five_corp.ad.internal.context.g c;
    public int d;
    public final com.five_corp.ad.internal.E e;
    public final com.five_corp.ad.internal.l f;
    public final com.five_corp.ad.internal.cache.w g;
    public final com.five_corp.ad.internal.http.d h;
    public final com.five_corp.ad.internal.p i;

    public C1441i(com.five_corp.ad.internal.context.g gVar, com.five_corp.ad.internal.E e, com.five_corp.ad.internal.l lVar, com.five_corp.ad.internal.cache.w wVar, com.five_corp.ad.internal.http.d dVar, com.five_corp.ad.internal.p pVar, int i, com.five_corp.ad.internal.m mVar) {
        super(3, mVar);
        this.c = gVar;
        this.e = e;
        this.f = lVar;
        this.g = wVar;
        this.h = dVar;
        this.i = pVar;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x039a A[EDGE_INSN: B:101:0x039a->B:102:0x03ad BREAK  A[LOOP:5: B:67:0x0214->B:160:?]] */
    /* JADX WARN: Code duplicated, block: B:104:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:108:0x03d0 A[LOOP:6: B:106:0x03ca->B:108:0x03d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x03ed A[LOOP:7: B:110:0x03e7->B:112:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0451 A[LOOP:0: B:3:0x0004->B:131:0x0451, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x044f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0373  */
    /* JADX WARN: Code duplicated, block: B:97:0x037e  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.five_corp.ad.internal.s, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.five_corp.ad.internal.bgtask.m
    public final boolean b() {
        com.five_corp.ad.internal.util.g gVar;
        com.five_corp.ad.internal.util.g gVar2;
        ?? r4;
        long j;
        boolean z;
        com.five_corp.ad.internal.util.f fVar;
        boolean z2;
        com.five_corp.ad.internal.s sVar;
        com.five_corp.ad.internal.util.g gVar3;
        java.util.HashSet hashSet;
        java.util.Iterator it;
        java.util.HashSet hashSet2;
        java.util.Iterator it2;
        com.five_corp.ad.internal.t tVar;
        boolean z3 = false;
        int i = 0;
        while (i < 2) {
            com.five_corp.ad.internal.context.g gVar4 = this.c;
            int i2 = this.d;
            com.five_corp.ad.internal.C1434b c1434b = gVar4.b.b().f1881a;
            com.five_corp.ad.internal.storage.e eVar = gVar4.c;
            c1434b.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it3 = c1434b.f1843a.iterator();
            while (it3.hasNext()) {
                arrayList.add(com.five_corp.ad.internal.C1434b.a((com.five_corp.ad.internal.ad.a) it3.next(), eVar));
            }
            com.five_corp.ad.internal.soundstate.d dVarA = gVar4.f.a();
            gVar4.e.getClass();
            com.five_corp.ad.internal.context.a aVar = new com.five_corp.ad.internal.context.a(arrayList, dVarA, i2, java.lang.System.currentTimeMillis());
            com.five_corp.ad.internal.E e = this.e;
            e.getClass();
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.json.ce.l0, com.json.y8.d);
            map.put("sv", java.lang.String.valueOf(com.five_corp.ad.BuildConfig.SEMVER_PATCH));
            map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, e.b.e);
            map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, e.c.appId);
            map.put("pv", e.b.f);
            com.five_corp.ad.internal.tracking_data.a aVarA = e.g.a();
            java.lang.String str = aVarA.f2077a;
            if (str != null) {
                map.put("ty", str);
            }
            map.put("nt", aVarA.b ? "1" : "0");
            map.put("dv", e.b.f1786a);
            if (e.c.isTest) {
                map.put("test", "1");
            }
            e.f1783a.getClass();
            try {
                com.five_corp.ad.internal.util.f fVarA = this.h.a(com.five_corp.ad.internal.E.a(new android.net.Uri.Builder().scheme("https").authority("ad2.fivecdm.com"), "v1/ad", map), "POST", this.e.a(aVar).toString(), "application/json;charset=utf-8");
                if (fVarA.f2085a) {
                    com.five_corp.ad.internal.http.c cVar = (com.five_corp.ad.internal.http.c) fVarA.c;
                    int i3 = cVar.f1919a;
                    if (i3 == 403) {
                        tVar = com.five_corp.ad.internal.t.e;
                    } else {
                        int i4 = i3 / 100;
                        if (i4 == 5) {
                            tVar = com.five_corp.ad.internal.t.s;
                        } else if (i4 == 4) {
                            tVar = com.five_corp.ad.internal.t.p;
                        } else {
                            java.lang.String strA = cVar.a();
                            if (strA == null) {
                                tVar = com.five_corp.ad.internal.t.r;
                            } else {
                                if (strA.isEmpty()) {
                                    tVar = com.five_corp.ad.internal.t.u;
                                } else {
                                    try {
                                        try {
                                            try {
                                                this.f.getClass();
                                                com.five_corp.ad.internal.C1443k c1443kB = com.five_corp.ad.internal.l.b(strA);
                                                com.five_corp.ad.internal.cache.w wVar = this.g;
                                                wVar.getClass();
                                                java.util.HashMap map2 = new java.util.HashMap();
                                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                java.util.HashMap map3 = new java.util.HashMap();
                                                for (com.five_corp.ad.internal.ad.e eVar2 : c1443kB.d) {
                                                    int i5 = eVar2.f1809a;
                                                    if (i5 == 2) {
                                                        map2.put(eVar2.b, eVar2.c);
                                                    } else if (i5 == 3) {
                                                        arrayList2.add(eVar2.b);
                                                    }
                                                }
                                                java.util.Map map4 = c1443kB.b;
                                                if (map4 != null) {
                                                    for (java.util.Map.Entry entry : map4.entrySet()) {
                                                        map3.put((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
                                                    }
                                                }
                                                java.util.List list = c1443kB.f1938a;
                                                com.five_corp.ad.internal.media_config.a aVar2 = c1443kB.c;
                                                java.util.ArrayList<com.five_corp.ad.internal.ad.a> arrayList3 = new java.util.ArrayList();
                                                wVar.f1880a.a(new com.five_corp.ad.internal.cache.u(wVar, arrayList3, arrayList2, list, map2, map3, aVar2));
                                                wVar.f.getClass();
                                                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                                                synchronized (wVar.g) {
                                                    j = wVar.h;
                                                    wVar.h = jCurrentTimeMillis;
                                                }
                                                com.five_corp.ad.internal.http.auxcache.i iVar = wVar.d;
                                                iVar.f1915a.post(new com.five_corp.ad.internal.http.auxcache.a(iVar, list));
                                                com.five_corp.ad.internal.http.movcache.h hVar = wVar.e;
                                                hVar.f1931a.post(new com.five_corp.ad.internal.http.movcache.a(hVar, list));
                                                for (com.five_corp.ad.internal.ad.a aVar3 : arrayList3) {
                                                    com.five_corp.ad.internal.w wVar2 = (com.five_corp.ad.internal.w) wVar.b;
                                                    wVar2.getClass();
                                                    wVar2.a(aVar3.c + ".response.json");
                                                }
                                                java.util.Iterator it4 = list.iterator();
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        com.five_corp.ad.internal.w wVar3 = (com.five_corp.ad.internal.w) wVar.b;
                                                        wVar3.getClass();
                                                        try {
                                                            org.json.JSONArray jSONArray = new org.json.JSONArray();
                                                            for (java.util.Map.Entry entry2 : map2.entrySet()) {
                                                                com.five_corp.ad.internal.ad.f fVar2 = (com.five_corp.ad.internal.ad.f) entry2.getKey();
                                                                java.lang.Long l = (java.lang.Long) entry2.getValue();
                                                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                                                jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, fVar2.f1810a);
                                                                jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, fVar2.b);
                                                                jSONObject.put("c", fVar2.c);
                                                                jSONObject.put("t", 1);
                                                                jSONObject.put("npt", l);
                                                                jSONArray.put(jSONObject);
                                                            }
                                                            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                                                            java.util.Iterator it5 = map3.entrySet().iterator();
                                                            while (it5.hasNext()) {
                                                                java.util.Map.Entry entry3 = (java.util.Map.Entry) it5.next();
                                                                java.lang.Object obj = (java.lang.String) entry3.getKey();
                                                                java.util.List list2 = (java.util.List) entry3.getValue();
                                                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                                                jSONObject2.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, obj);
                                                                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                                                                java.util.Iterator it6 = list2.iterator();
                                                                while (it6.hasNext()) {
                                                                    com.five_corp.ad.internal.ad.b bVar = (com.five_corp.ad.internal.ad.b) it6.next();
                                                                    java.util.Iterator it7 = it5;
                                                                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                                                    java.util.Iterator it8 = it6;
                                                                    i = i;
                                                                    try {
                                                                        jSONObject3.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, bVar.f1790a.f1810a);
                                                                        jSONObject3.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, bVar.f1790a.b);
                                                                        jSONObject3.put("c", bVar.f1790a.c);
                                                                        jSONObject3.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, bVar.b);
                                                                        jSONArray3.put(jSONObject3);
                                                                        it5 = it7;
                                                                        it6 = it8;
                                                                        i = i;
                                                                    } catch (org.json.JSONException e2) {
                                                                        e = e2;
                                                                        z = false;
                                                                        fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.x3, "failed to serialize AdConfig", e, null), null);
                                                                        if (fVar.f2085a) {
                                                                            wVar3.a(com.five_corp.ad.internal.w.a(jCurrentTimeMillis), ((java.lang.String) fVar.c).getBytes());
                                                                            z2 = true;
                                                                            sVar = null;
                                                                            gVar3 = new com.five_corp.ad.internal.util.g(true, null);
                                                                        } else {
                                                                            gVar3 = new com.five_corp.ad.internal.util.g(z, fVar.b);
                                                                            z2 = true;
                                                                            sVar = null;
                                                                        }
                                                                        if (gVar3.f2085a) {
                                                                            break;
                                                                        }
                                                                        com.five_corp.ad.internal.w wVar4 = (com.five_corp.ad.internal.w) wVar.b;
                                                                        wVar4.getClass();
                                                                        wVar4.a(com.five_corp.ad.internal.w.a(j));
                                                                        gVar3 = new com.five_corp.ad.internal.util.g(z2, sVar);
                                                                        break;
                                                                        if (gVar3.f2085a) {
                                                                            hashSet = new java.util.HashSet();
                                                                            it = wVar.f1880a.a().iterator();
                                                                            while (it.hasNext()) {
                                                                                hashSet.addAll(((com.five_corp.ad.internal.cache.x) it.next()).f1881a.f1843a);
                                                                            }
                                                                            hashSet2 = new java.util.HashSet();
                                                                            it2 = hashSet.iterator();
                                                                            while (it2.hasNext()) {
                                                                                hashSet2.addAll(((com.five_corp.ad.internal.ad.a) it2.next()).G);
                                                                            }
                                                                            wVar.c.a(hashSet2);
                                                                            gVar = new com.five_corp.ad.internal.util.g(true, null);
                                                                            gVar2 = gVar;
                                                                        } else {
                                                                            gVar2 = new com.five_corp.ad.internal.util.g(false, gVar3.b);
                                                                        }
                                                                        if (gVar2.f2085a) {
                                                                            return true;
                                                                        }
                                                                        this.i.a(gVar2.b);
                                                                        this.d = 2;
                                                                        i++;
                                                                        z3 = false;
                                                                    }
                                                                }
                                                                jSONObject2.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, jSONArray3);
                                                                jSONArray2.put(jSONObject2);
                                                                it5 = it5;
                                                                i = i;
                                                            }
                                                            i = i;
                                                            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                                            jSONObject4.put("cc", jSONArray);
                                                            jSONObject4.put("ss", jSONArray2);
                                                            jSONObject4.put("mcfg", new org.json.JSONObject(aVar2.f1949a));
                                                            fVar = new com.five_corp.ad.internal.util.f(true, null, jSONObject4.toString());
                                                            z = false;
                                                        } catch (org.json.JSONException e3) {
                                                            e = e3;
                                                            i = i;
                                                        }
                                                        if (fVar.f2085a) {
                                                            gVar3 = new com.five_corp.ad.internal.util.g(z, fVar.b);
                                                            z2 = true;
                                                            sVar = null;
                                                        } else {
                                                            wVar3.a(com.five_corp.ad.internal.w.a(jCurrentTimeMillis), ((java.lang.String) fVar.c).getBytes());
                                                            z2 = true;
                                                            sVar = null;
                                                            gVar3 = new com.five_corp.ad.internal.util.g(true, null);
                                                        }
                                                        if (gVar3.f2085a) {
                                                            break;
                                                        }
                                                        com.five_corp.ad.internal.w wVar5 = (com.five_corp.ad.internal.w) wVar.b;
                                                        wVar5.getClass();
                                                        wVar5.a(com.five_corp.ad.internal.w.a(j));
                                                        gVar3 = new com.five_corp.ad.internal.util.g(z2, sVar);
                                                        break;
                                                    }
                                                    com.five_corp.ad.internal.ad.a aVar4 = (com.five_corp.ad.internal.ad.a) it4.next();
                                                    com.five_corp.ad.internal.w wVar6 = (com.five_corp.ad.internal.w) wVar.b;
                                                    wVar6.getClass();
                                                    gVar3 = wVar6.a(aVar4.c + ".response.json", aVar4.f1789a.getBytes());
                                                    if (!gVar3.f2085a) {
                                                        i = i;
                                                        break;
                                                    }
                                                }
                                                if (gVar3.f2085a) {
                                                    gVar2 = new com.five_corp.ad.internal.util.g(false, gVar3.b);
                                                } else {
                                                    hashSet = new java.util.HashSet();
                                                    it = wVar.f1880a.a().iterator();
                                                    while (it.hasNext()) {
                                                        hashSet.addAll(((com.five_corp.ad.internal.cache.x) it.next()).f1881a.f1843a);
                                                    }
                                                    hashSet2 = new java.util.HashSet();
                                                    it2 = hashSet.iterator();
                                                    while (it2.hasNext()) {
                                                        hashSet2.addAll(((com.five_corp.ad.internal.ad.a) it2.next()).G);
                                                    }
                                                    wVar.c.a(hashSet2);
                                                    gVar = new com.five_corp.ad.internal.util.g(true, null);
                                                    gVar2 = gVar;
                                                }
                                            } catch (org.json.JSONException e4) {
                                                e = e4;
                                                r4 = 0;
                                                e.toString();
                                                gVar = new com.five_corp.ad.internal.util.g(z3, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.r, r4, e, r4));
                                            }
                                        } catch (org.json.JSONException e5) {
                                            e = e5;
                                            r4 = 0;
                                        }
                                    } catch (com.five_corp.ad.internal.exception.b e6) {
                                        i = i;
                                        e6.toString();
                                        gVar = new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(e6.f1899a, null, e6, null));
                                    }
                                }
                                if (gVar2.f2085a) {
                                    return true;
                                }
                                this.i.a(gVar2.b);
                                this.d = 2;
                                i++;
                                z3 = false;
                            }
                        }
                    }
                    gVar2 = com.five_corp.ad.internal.util.g.b(tVar);
                } else {
                    gVar2 = new com.five_corp.ad.internal.util.g(z3, fVarA.b);
                }
                i = i;
            } catch (org.json.JSONException e7) {
                i = i;
                gVar = new com.five_corp.ad.internal.util.g(z3, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Y5, null, e7, null));
            }
            if (gVar2.f2085a) {
                return true;
            }
            this.i.a(gVar2.b);
            this.d = 2;
            i++;
            z3 = false;
        }
        return z3;
    }
}

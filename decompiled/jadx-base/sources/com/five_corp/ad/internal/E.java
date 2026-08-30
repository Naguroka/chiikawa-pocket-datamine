package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.base_url.a f1783a;
    public final com.five_corp.ad.internal.I b;
    public final com.five_corp.ad.FiveAdConfig c;
    public final com.five_corp.ad.internal.K d;
    public final com.five_corp.ad.internal.time.a e;
    public final com.five_corp.ad.internal.context.n f;
    public final com.five_corp.ad.internal.tracking_data.b g;

    static {
        com.five_corp.ad.internal.E.class.toString();
    }

    public E(com.five_corp.ad.internal.base_url.a aVar, com.five_corp.ad.internal.I i, com.five_corp.ad.FiveAdConfig fiveAdConfig, com.five_corp.ad.internal.K k, com.five_corp.ad.internal.time.a aVar2, com.five_corp.ad.internal.context.n nVar, com.five_corp.ad.internal.tracking_data.b bVar) {
        this.f1783a = aVar;
        this.b = i;
        this.c = fiveAdConfig;
        this.d = k;
        this.e = aVar2;
        this.f = nVar;
        this.g = bVar;
    }

    public final void a(java.util.HashMap map, com.five_corp.ad.internal.tracking_data.a aVar) {
        map.put(com.json.ce.l0, com.json.y8.d);
        map.put("dv", this.b.f1786a);
        map.put("sv", java.lang.String.valueOf(com.five_corp.ad.BuildConfig.SEMVER_PATCH));
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, this.b.e);
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, this.c.appId);
        map.put("pv", this.b.f);
        map.put("sui", this.d.b);
        java.lang.String str = aVar.f2077a;
        if (str != null) {
            map.put("ty", str);
        }
        map.put("nt", aVar.b ? "1" : "0");
        if (this.c.isTest) {
            map.put("test", "1");
        }
        map.put("ngnpa", java.lang.String.valueOf(this.c.getNeedGdprNonPersonalizedAdsTreatment().value));
        map.put("ncd", java.lang.String.valueOf(this.c.getNeedChildDirectedTreatment().value));
        map.put("maar", java.lang.String.valueOf(this.c.getFiveAdAgeRating().value));
    }

    public final java.lang.String b(com.five_corp.ad.internal.context.m mVar) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("dv", this.b.f1786a);
        map.put("sv", java.lang.String.valueOf(com.five_corp.ad.BuildConfig.SEMVER_PATCH));
        map.put("pv", this.b.f);
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, this.b.e);
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, this.c.appId);
        map.put("sl", mVar.c.f1896a.c);
        map.put(com.json.ce.l0, com.json.y8.d);
        com.five_corp.ad.internal.tracking_data.a aVar = mVar.c.d;
        map.put("nt", aVar.b ? "1" : "0");
        java.lang.String str = aVar.f2077a;
        if (str != null) {
            map.put("ty", str);
        }
        if (this.c.isTest) {
            map.put("test", "1");
        }
        com.five_corp.ad.internal.base_url.a aVar2 = this.f1783a;
        aVar2.getClass();
        return a(new android.net.Uri.Builder().scheme("https").authority(aVar2.f1844a), "/v1/chk", map);
    }

    public static java.lang.String a(android.net.Uri.Builder builder, java.lang.String str, java.util.HashMap map) {
        builder.path(str);
        for (java.util.Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        return builder.toString();
    }

    /* JADX WARN: Code duplicated, block: B:81:0x022a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234 A[LOOP:2: B:82:0x022e->B:84:0x0234, LOOP_END] */
    public final java.lang.String a(com.five_corp.ad.internal.beacon.a aVar) {
        com.five_corp.ad.FiveAdFormat fiveAdFormat;
        com.five_corp.ad.internal.ad.beacon.f fVar;
        java.util.List<com.five_corp.ad.internal.ad.beacon.g> list;
        com.five_corp.ad.internal.ad.beacon.f fVar2;
        com.five_corp.ad.internal.ad.a aVar2 = aVar.c;
        long j = aVar.i;
        com.five_corp.ad.internal.context.i iVar = aVar.f1845a;
        java.lang.String str = iVar.c;
        int i = aVar.e;
        com.five_corp.ad.internal.ad.beacon.a aVar3 = aVar.k;
        java.util.HashMap map = new java.util.HashMap();
        a(map, aVar.d);
        map.put("ld", iVar.b);
        map.put("sl", iVar.c);
        int iOrdinal = aVar.b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            fiveAdFormat = com.five_corp.ad.FiveAdFormat.CUSTOM_LAYOUT;
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new java.lang.RuntimeException();
            }
            fiveAdFormat = com.five_corp.ad.FiveAdFormat.VIDEO_REWARD;
        }
        map.put("af", java.lang.String.valueOf(fiveAdFormat.rawValue));
        if (aVar.b == com.five_corp.ad.internal.context.h.NATIVE) {
            map.put("isnt", "1");
        }
        map.put("t", aVar2.c);
        map.put("at", java.lang.String.valueOf(aVar2.d));
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, java.lang.String.valueOf(aVar2.e.f1810a));
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, java.lang.String.valueOf(aVar2.e.b));
        map.put("c", java.lang.String.valueOf(aVar2.e.c));
        map.put("ss", aVar.f.a() ? "1" : "0");
        map.put("pt", java.lang.String.valueOf(aVar.h));
        map.put("it", java.lang.String.valueOf(j));
        map.put("ct", java.lang.String.valueOf(aVar2.b.value));
        map.put("tp", java.lang.String.valueOf(com.five_corp.ad.internal.ad.beacon.b.a(i)));
        map.put("spt", java.lang.String.valueOf(aVar.g.f1848a));
        com.five_corp.ad.internal.ad.format_config.a aVarA = com.five_corp.ad.internal.ad.a.a(aVar2, str);
        if (aVarA != null) {
            map.put("sti", java.lang.String.valueOf(aVarA.f1811a));
        }
        double d = aVar.j;
        if (d >= 0.0d) {
            map.put("mvar", java.lang.String.format(java.util.Locale.US, "%.3f", java.lang.Double.valueOf(d)));
        }
        if (iVar.f1887a) {
            map.put("chk", "1");
        }
        java.lang.String str2 = aVar2.F;
        if (str2 != null) {
            map.put("ext", str2);
        }
        if (aVar3 != null) {
            map.put("clkt", java.lang.String.valueOf(com.five_corp.ad.internal.ad.beacon.c.a(aVar3.f1791a)));
            map.put("vims", java.lang.String.valueOf(com.five_corp.ad.internal.ad.beacon.h.a(aVar3.b)));
            map.put("tms", java.lang.String.valueOf(aVar3.c));
            if (aVar3.f1791a == 2) {
                map.put("ar", java.lang.String.valueOf(aVar3.d.b));
                map.put("vct", java.lang.String.valueOf(com.five_corp.ad.internal.ad.beacon.i.a(aVar3.d.f1796a)));
            }
        }
        if (aVar2.b == com.five_corp.ad.CreativeType.MOVIE) {
            map.put("vsar", java.lang.String.format(java.util.Locale.US, "%.3f", java.lang.Double.valueOf(aVar2.B.b)));
            map.put("vvct", java.lang.String.valueOf(com.five_corp.ad.internal.ad.beacon.i.a(aVar2.B.f1796a)));
        }
        if (i == 3 && aVar.m) {
            map.put("bc", "1");
        }
        java.util.Map map2 = aVar.l;
        if (map2 != null) {
            for (java.util.Map.Entry entry : map2.entrySet()) {
                map.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        int iA = com.five_corp.ad.e.a(i);
        if (iA != 0) {
            if (iA != 13) {
                list = null;
                if (aVar3 != null) {
                    java.util.List list2 = aVar2.E;
                    if (list2 == null) {
                        fVar2 = null;
                        break;
                    }
                    java.util.Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            fVar2 = null;
                            break;
                        }
                        fVar2 = (com.five_corp.ad.internal.ad.beacon.f) it.next();
                    } while (!aVar3.equals(fVar2.b));
                    if (fVar2 != null) {
                        list = fVar2.c;
                    }
                } else {
                    java.util.List<com.five_corp.ad.internal.ad.beacon.f> list3 = aVar2.E;
                    if (list3 != null) {
                        for (com.five_corp.ad.internal.ad.beacon.f fVar3 : list3) {
                            if (fVar3.f1794a == i) {
                                list = fVar3.c;
                                break;
                            }
                        }
                    }
                }
            } else {
                fVar = aVar2.D;
            }
            if (list != null) {
                for (com.five_corp.ad.internal.ad.beacon.g gVar : list) {
                    map.put(gVar.f1795a, gVar.b);
                }
            }
            com.five_corp.ad.internal.base_url.a aVar4 = this.f1783a;
            aVar4.getClass();
            return a(new android.net.Uri.Builder().scheme("https").authority(aVar4.b), "bc", map);
        }
        fVar = aVar2.C;
        list = fVar.c;
        if (list != null) {
            while (r1.hasNext()) {
                map.put(gVar.f1795a, gVar.b);
            }
        }
        com.five_corp.ad.internal.base_url.a aVar5 = this.f1783a;
        aVar5.getClass();
        return a(new android.net.Uri.Builder().scheme("https").authority(aVar5.b), "bc", map);
    }

    public final org.json.JSONObject a(com.five_corp.ad.internal.context.m mVar) throws org.json.JSONException {
        com.five_corp.ad.FiveAdFormat fiveAdFormat;
        com.five_corp.ad.internal.context.o oVarA = this.f.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("hw", this.b.b);
        jSONObject.put(com.json.ce.r, this.b.c);
        this.d.getClass();
        jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, java.util.Locale.getDefault().toString());
        jSONObject.put("ngnpa", this.c.getNeedGdprNonPersonalizedAdsTreatment().value);
        jSONObject.put("ncd", this.c.getNeedChildDirectedTreatment().value);
        jSONObject.put("maar", this.c.getFiveAdAgeRating().value);
        android.graphics.Rect rectB = this.d.b();
        jSONObject.put("sw", rectB.width());
        jSONObject.put("sh", rectB.height());
        android.view.WindowManager windowManager = (android.view.WindowManager) this.d.f1787a.getSystemService("window");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        jSONObject.put("dpr", (long) (((double) displayMetrics.density) * 1000000.0d));
        jSONObject.put("cr", this.b.d);
        jSONObject.put("nexp", oVarA.f1893a);
        jSONObject.put("ssa", com.five_corp.ad.e.a(mVar.d.b));
        jSONObject.put("ssm", com.five_corp.ad.e.a(mVar.d.d.f2048a));
        jSONObject.put("rt", mVar.e);
        int iOrdinal = mVar.f1891a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            fiveAdFormat = com.five_corp.ad.FiveAdFormat.CUSTOM_LAYOUT;
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new java.lang.RuntimeException();
            }
            fiveAdFormat = com.five_corp.ad.FiveAdFormat.VIDEO_REWARD;
        }
        jSONObject.put("af", fiveAdFormat.rawValue);
        jSONObject.put("ld", mVar.c.f1896a.b);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.five_corp.ad.internal.C1433a c1433a : mVar.b) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.five_corp.ad.internal.ad.a aVar = c1433a.f1788a.f1937a;
            jSONObject2.put(com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN_ID, aVar.e.f1810a);
            jSONObject2.put("campaign_version", aVar.e.b);
            jSONObject2.put("creative_id", aVar.e.c);
            jSONObject2.put("ots", aVar.c);
            jSONObject2.put("adserver_timestamp_ms", aVar.d);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("ad_info", jSONObject2);
            jSONObject3.put("resource_load_state", com.five_corp.ad.internal.H.a(c1433a.f1788a.b));
            jSONObject3.put("loadability_for_current_slot", c1433a.d ? 1 : 0);
            jSONObject3.put("ad_extra", aVar.F);
            jSONArray.put(jSONObject3);
        }
        jSONObject.put("ads", jSONArray);
        jSONObject.put("isnt", mVar.f1891a == com.five_corp.ad.internal.context.h.NATIVE);
        jSONObject.put("sui", this.d.b);
        return jSONObject;
    }

    public final org.json.JSONObject a(com.five_corp.ad.internal.context.a aVar) throws org.json.JSONException {
        com.five_corp.ad.internal.context.o oVarA = this.f.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("hw", this.b.b);
        jSONObject.put(com.json.ce.r, this.b.c);
        this.d.getClass();
        jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, java.util.Locale.getDefault().toString());
        jSONObject.put("ngnpa", this.c.getNeedGdprNonPersonalizedAdsTreatment().value);
        jSONObject.put("ncd", this.c.getNeedChildDirectedTreatment().value);
        jSONObject.put("maar", this.c.getFiveAdAgeRating().value);
        android.graphics.Rect rectB = this.d.b();
        jSONObject.put("sw", rectB.width());
        jSONObject.put("sh", rectB.height());
        android.view.WindowManager windowManager = (android.view.WindowManager) this.d.f1787a.getSystemService("window");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        jSONObject.put("dpr", (long) (((double) displayMetrics.density) * 1000000.0d));
        jSONObject.put("cr", this.b.d);
        jSONObject.put("ft", 0);
        jSONObject.put("nexp", oVarA.f1893a);
        jSONObject.put("ssm", com.five_corp.ad.e.a(aVar.b.f2048a));
        jSONObject.put("rt", aVar.d);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.five_corp.ad.internal.C1442j c1442j : aVar.f1882a) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.five_corp.ad.internal.ad.a aVar2 = c1442j.f1937a;
            jSONObject2.put(com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN_ID, aVar2.e.f1810a);
            jSONObject2.put("campaign_version", aVar2.e.b);
            jSONObject2.put("creative_id", aVar2.e.c);
            jSONObject2.put("ots", aVar2.c);
            jSONObject2.put("adserver_timestamp_ms", aVar2.d);
            jSONObject2.put("resource_load_state", com.five_corp.ad.internal.H.a(c1442j.b));
            jSONObject2.put("ad_extra", aVar2.F);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("ads", jSONArray);
        jSONObject.put("sui", this.d.b);
        jSONObject.put("arrs", com.five_corp.ad.internal.context.b.a(aVar.c));
        return jSONObject;
    }

    public final com.five_corp.ad.internal.util.f a(com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.tracking_data.a aVar, com.five_corp.ad.internal.soundstate.d dVar) {
        com.five_corp.ad.internal.context.o oVarA = this.f.a();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.json.ce.l0, com.json.y8.d);
            jSONObject.put("sv", java.lang.String.valueOf(com.five_corp.ad.BuildConfig.SEMVER_PATCH));
            jSONObject.put("dv", this.b.f1786a);
            jSONObject.put("pv", this.b.f);
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, this.b.e);
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, this.c.appId);
            jSONObject.put("hw", this.b.b);
            jSONObject.put("cr", this.b.d);
            this.d.getClass();
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, java.util.Locale.getDefault().toString());
            android.graphics.Rect rectB = this.d.b();
            jSONObject.put("sw", rectB.width());
            jSONObject.put("sh", rectB.height());
            jSONObject.put("sui", this.d.b);
            java.lang.String str = "1";
            if (this.c.isTest) {
                jSONObject.put("test", "1");
            }
            java.lang.String str2 = aVar.f2077a;
            if (str2 != null) {
                jSONObject.put("ty", str2);
            }
            if (!aVar.b) {
                str = "0";
            }
            jSONObject.put("nt", str);
            jSONObject.put("ngnpa", this.c.getNeedGdprNonPersonalizedAdsTreatment().value);
            jSONObject.put("ncd", this.c.getNeedChildDirectedTreatment().value);
            jSONObject.put("maar", this.c.getFiveAdAgeRating().value);
            jSONObject.put("sl", iVar.c);
            jSONObject.put("ld", iVar.b);
            jSONObject.put("ssm", com.five_corp.ad.e.a(dVar.f2048a));
            jSONObject.put("nexp", oVarA.f1893a);
            return new com.five_corp.ad.internal.util.f(true, null, "v1:".concat(new java.lang.String(android.util.Base64.encode(jSONObject.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 2))));
        } catch (org.json.JSONException e) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.K5, null, e, null), null);
        }
    }
}

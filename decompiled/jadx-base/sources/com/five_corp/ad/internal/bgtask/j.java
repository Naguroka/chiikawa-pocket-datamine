package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends com.five_corp.ad.internal.bgtask.m {
    public final com.five_corp.ad.internal.logger.b c;
    public final com.five_corp.ad.internal.E d;
    public final com.five_corp.ad.internal.http.d e;

    public j(com.five_corp.ad.internal.logger.b bVar, com.five_corp.ad.internal.E e, com.five_corp.ad.internal.http.d dVar) {
        super(5);
        this.c = bVar;
        this.d = e;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.m
    public final boolean b() throws org.json.JSONException {
        this.d.f1783a.getClass();
        android.net.Uri.Builder builderAuthority = new android.net.Uri.Builder().scheme("https").authority("log.fivecdm.com");
        builderAuthority.path("rlog");
        java.lang.String string = builderAuthority.toString();
        com.five_corp.ad.internal.E e = this.d;
        com.five_corp.ad.internal.logger.b bVar = this.c;
        e.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sv", com.five_corp.ad.BuildConfig.SEMVER_PATCH);
        jSONObject.put("pv", e.b.f);
        jSONObject.put(com.json.ce.l0, com.json.y8.d);
        jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, e.b.e);
        jSONObject.put("dv", e.b.f1786a);
        jSONObject.put("hw", e.b.b);
        e.e.getClass();
        jSONObject.put("rt", java.lang.System.currentTimeMillis());
        jSONObject.put("cr", e.b.d);
        e.d.getClass();
        jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, java.util.Locale.getDefault().toString());
        jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, e.c.appId);
        jSONObject.put("ngnpa", e.c.getNeedGdprNonPersonalizedAdsTreatment().value);
        jSONObject.put("ncd", e.c.getNeedChildDirectedTreatment().value);
        jSONObject.put("maar", e.c.getFiveAdAgeRating().value);
        jSONObject.put("sui", e.d.b);
        com.five_corp.ad.internal.tracking_data.a aVarA = e.g.a();
        java.lang.String str = aVarA.f2077a;
        if (str != null) {
            jSONObject.put("ty", str);
        }
        jSONObject.put("nt", aVarA.b ? "1" : "0");
        jSONObject.put("ll", com.five_corp.ad.e.a(bVar.f1947a));
        jSONObject.put("lm", bVar.b);
        com.five_corp.ad.internal.util.f fVarA = this.e.a(string, "POST", jSONObject.toString(), "application/json;charset=utf-8");
        return fVarA.f2085a && ((com.five_corp.ad.internal.http.c) fVarA.c).f1919a == 200;
    }
}

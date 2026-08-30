package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class aq extends com.applovin.impl.sdk.ad.b implements com.applovin.impl.hh {
    private final java.lang.String l;
    private final java.lang.String m;
    private final com.applovin.impl.jq n;
    private final long o;
    private final com.applovin.impl.nq p;
    private final com.applovin.impl.dq q;
    private final java.lang.String r;
    private final com.applovin.impl.cq s;
    private final com.applovin.impl.rg t;
    private final java.util.Set u;
    private final java.util.Set v;

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void N0() {
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public java.lang.String toString() {
        return "VastAd{title='" + this.l + "', adDescription='" + this.m + "', systemInfo=" + this.n + ", videoCreative=" + this.p + ", companionAd=" + this.q + ", adVerifications=" + this.s + ", impressionTrackers=" + this.u + ", errorTrackers=" + this.v + '}';
    }

    private aq(com.applovin.impl.aq.b bVar) {
        super(bVar.f628a, bVar.b, bVar.c);
        this.l = bVar.e;
        this.n = bVar.g;
        this.m = bVar.f;
        this.p = bVar.h;
        this.q = bVar.i;
        this.s = bVar.j;
        this.u = bVar.k;
        this.v = bVar.l;
        this.t = new com.applovin.impl.rg(this);
        android.net.Uri uriU0 = u0();
        if (uriU0 != null) {
            this.r = uriU0.toString();
        } else {
            this.r = "";
        }
        this.o = bVar.d;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean G0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public org.json.JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        java.util.List listG;
        com.applovin.impl.nq nqVar = this.p;
        return (nqVar == null || (listG = nqVar.g()) == null || listG.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean K0() {
        return getBooleanFromAdObject("vast_is_streaming", java.lang.Boolean.FALSE);
    }

    public void z1() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public java.lang.String Q() {
        return this.r;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", java.lang.Boolean.TRUE) && this.s != null;
    }

    public boolean D1() {
        return getBooleanFromAdObject("iopms", java.lang.Boolean.FALSE);
    }

    public boolean E1() {
        return getBooleanFromAdObject("iopmsfsr", java.lang.Boolean.TRUE);
    }

    public long s1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public com.applovin.impl.aq.c p1() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return com.applovin.impl.aq.c.COMPANION_AD;
        }
        return com.applovin.impl.aq.c.VIDEO;
    }

    public boolean y1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", java.lang.Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public com.applovin.impl.rg getAdEventTracker() {
        return this.t;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public android.net.Uri u0() {
        com.applovin.impl.oq oqVarW1 = w1();
        if (oqVarW1 != null) {
            return oqVarW1.e();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public android.net.Uri j() {
        com.applovin.impl.nq nqVar = this.p;
        if (nqVar != null) {
            return nqVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public android.net.Uri l0() {
        return j();
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean J0() {
        return getBooleanFromAdObject("video_clickable", java.lang.Boolean.FALSE) && j() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public java.util.List F() {
        java.util.List listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.aq$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.w((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("vimp_urls", new org.json.JSONObject()), getClCode(), null, q1(), R(), V0(), this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List w(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("vimp_urls", new org.json.JSONObject()), getClCode(), null, q1(), R(), V0(), this.sdk);
    }

    private java.lang.String q1() {
        java.lang.String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public com.applovin.impl.jq t1() {
        return this.n;
    }

    public com.applovin.impl.nq v1() {
        return this.p;
    }

    public com.applovin.impl.oq w1() {
        java.lang.Long lF = com.applovin.impl.e4.f(this.sdk);
        return this.p.a(lF != null ? lF.longValue() : 0L);
    }

    public com.applovin.impl.dq l1() {
        return this.q;
    }

    public com.applovin.impl.gq r1() {
        com.applovin.impl.nq nqVar = this.p;
        if (nqVar != null) {
            return nqVar.f();
        }
        return null;
    }

    public boolean x1() {
        return r1() != null;
    }

    public boolean C1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", java.lang.Boolean.FALSE);
    }

    public void b(java.lang.String str) {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            tlVar.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            com.applovin.impl.sdk.utils.JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public java.lang.String n1() {
        return getStringFromAdObject("html_template", "");
    }

    public android.net.Uri o1() {
        java.lang.String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(stringFromAdObject)) {
            return android.net.Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean A1() {
        return getBooleanFromAdObject("cache_companion_ad", java.lang.Boolean.TRUE);
    }

    public boolean B1() {
        return getBooleanFromAdObject("cache_video", java.lang.Boolean.TRUE);
    }

    public com.applovin.impl.cq k1() {
        return this.s;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.o;
    }

    private java.util.Set u1() {
        com.applovin.impl.nq nqVar = this.p;
        if (nqVar != null) {
            return nqVar.b();
        }
        return java.util.Collections.emptySet();
    }

    private java.util.Set m1() {
        com.applovin.impl.dq dqVar = this.q;
        if (dqVar != null) {
            return dqVar.b();
        }
        return java.util.Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.aq) || !super.equals(obj)) {
            return false;
        }
        com.applovin.impl.aq aqVar = (com.applovin.impl.aq) obj;
        java.lang.String str = this.l;
        if (str == null ? aqVar.l != null : !str.equals(aqVar.l)) {
            return false;
        }
        java.lang.String str2 = this.m;
        if (str2 == null ? aqVar.m != null : !str2.equals(aqVar.m)) {
            return false;
        }
        com.applovin.impl.jq jqVar = this.n;
        if (jqVar == null ? aqVar.n != null : !jqVar.equals(aqVar.n)) {
            return false;
        }
        com.applovin.impl.nq nqVar = this.p;
        if (nqVar == null ? aqVar.p != null : !nqVar.equals(aqVar.p)) {
            return false;
        }
        com.applovin.impl.dq dqVar = this.q;
        if (dqVar == null ? aqVar.q != null : !dqVar.equals(aqVar.q)) {
            return false;
        }
        com.applovin.impl.cq cqVar = this.s;
        if (cqVar == null ? aqVar.s != null : !cqVar.equals(aqVar.s)) {
            return false;
        }
        java.util.Set set = this.u;
        if (set == null ? aqVar.u != null : !set.equals(aqVar.u)) {
            return false;
        }
        java.util.Set set2 = this.v;
        java.util.Set set3 = aqVar.v;
        if (set2 != null) {
            return set2.equals(set3);
        }
        return set3 == null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        java.lang.String str = this.l;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.m;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        com.applovin.impl.jq jqVar = this.n;
        int iHashCode4 = (iHashCode3 + (jqVar != null ? jqVar.hashCode() : 0)) * 31;
        com.applovin.impl.nq nqVar = this.p;
        int iHashCode5 = (iHashCode4 + (nqVar != null ? nqVar.hashCode() : 0)) * 31;
        com.applovin.impl.dq dqVar = this.q;
        int iHashCode6 = (iHashCode5 + (dqVar != null ? dqVar.hashCode() : 0)) * 31;
        com.applovin.impl.cq cqVar = this.s;
        int iHashCode7 = (iHashCode6 + (cqVar != null ? cqVar.hashCode() : 0)) * 31;
        java.util.Set set = this.u;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        java.util.Set set2 = this.v;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.json.JSONObject f628a;
        private org.json.JSONObject b;
        private com.applovin.impl.sdk.j c;
        private long d;
        private java.lang.String e;
        private java.lang.String f;
        private com.applovin.impl.jq g;
        private com.applovin.impl.nq h;
        private com.applovin.impl.dq i;
        private com.applovin.impl.cq j;
        private java.util.Set k;
        private java.util.Set l;

        public com.applovin.impl.aq.b b(org.json.JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
                return this;
            }
            throw new java.lang.IllegalArgumentException("No full ad response specified.");
        }

        public com.applovin.impl.aq.b b(java.util.Set set) {
            this.k = set;
            return this;
        }

        public com.applovin.impl.aq.b b(java.lang.String str) {
            this.e = str;
            return this;
        }

        public com.applovin.impl.aq.b a(java.lang.String str) {
            this.f = str;
            return this;
        }

        public com.applovin.impl.aq.b a(org.json.JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f628a = jSONObject;
                return this;
            }
            throw new java.lang.IllegalArgumentException("No ad object specified.");
        }

        public com.applovin.impl.aq.b a(com.applovin.impl.cq cqVar) {
            this.j = cqVar;
            return this;
        }

        public com.applovin.impl.aq.b a(com.applovin.impl.dq dqVar) {
            this.i = dqVar;
            return this;
        }

        public com.applovin.impl.aq.b a(long j) {
            this.d = j;
            return this;
        }

        public com.applovin.impl.aq.b a(java.util.Set set) {
            this.l = set;
            return this;
        }

        public com.applovin.impl.aq.b a(com.applovin.impl.sdk.j jVar) {
            if (jVar != null) {
                this.c = jVar;
                return this;
            }
            throw new java.lang.IllegalArgumentException("No sdk specified.");
        }

        public com.applovin.impl.aq.b a(com.applovin.impl.jq jqVar) {
            this.g = jqVar;
            return this;
        }

        public com.applovin.impl.aq.b a(com.applovin.impl.nq nqVar) {
            this.h = nqVar;
            return this;
        }

        public com.applovin.impl.aq a() {
            return new com.applovin.impl.aq(this);
        }
    }

    public static com.applovin.impl.aq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        com.applovin.impl.aq.b bVar = new com.applovin.impl.aq.b();
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "full_response", (org.json.JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.b = jSONObject2;
        org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject2, "ads", new org.json.JSONArray()), 0, (org.json.JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f628a = jSONObject3;
        bVar.c = jVar;
        bVar.d = com.applovin.impl.sdk.utils.JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.e = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, com.ironsource.y8.h.D0, "");
        bVar.f = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.g = com.applovin.impl.jq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "system_info", (org.json.JSONObject) null), jVar);
        bVar.h = com.applovin.impl.nq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "video_creative", (org.json.JSONObject) null), jVar);
        bVar.i = com.applovin.impl.dq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "companion_ad", (org.json.JSONObject) null), jVar);
        bVar.j = com.applovin.impl.cq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "ad_verifications", (org.json.JSONObject) null), jVar);
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "impression_trackers", new org.json.JSONArray());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            com.applovin.impl.kq kqVarA = com.applovin.impl.kq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null), jVar);
            if (kqVarA != null) {
                hashSet.add(kqVarA);
            }
        }
        bVar.k = hashSet;
        org.json.JSONArray jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "error_trackers", new org.json.JSONArray());
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            com.applovin.impl.kq kqVarA2 = com.applovin.impl.kq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray2, i2, (org.json.JSONObject) null), jVar);
            if (kqVarA2 != null) {
                hashSet2.add(kqVarA2);
            }
        }
        bVar.l = hashSet2;
        com.applovin.impl.aq aqVar = new com.applovin.impl.aq(bVar);
        org.json.JSONArray jSONArray3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "cached_ad_html_resources_urls", new org.json.JSONArray());
        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
            java.lang.Object objectAtIndex = com.applovin.impl.sdk.utils.JsonUtils.getObjectAtIndex(jSONArray3, i3, null);
            if (objectAtIndex instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) objectAtIndex;
                if (!android.text.TextUtils.isEmpty(str)) {
                    aqVar.a(android.net.Uri.parse(str));
                }
            }
        }
        return aqVar;
    }

    private java.util.Set a(com.applovin.impl.aq.c cVar, java.lang.String[] strArr) {
        java.util.Map mapD;
        com.applovin.impl.dq dqVar;
        com.applovin.impl.nq nqVar;
        if (strArr != null && strArr.length > 0) {
            if (cVar == com.applovin.impl.aq.c.VIDEO && (nqVar = this.p) != null) {
                mapD = nqVar.e();
            } else {
                mapD = (cVar != com.applovin.impl.aq.c.COMPANION_AD || (dqVar = this.q) == null) ? null : dqVar.d();
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (java.lang.String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll((java.util.Collection) mapD.get(str));
                    }
                }
            }
            return java.util.Collections.unmodifiableSet(hashSet);
        }
        return java.util.Collections.emptySet();
    }

    public java.util.Set a(com.applovin.impl.aq.d dVar, java.lang.String str) {
        return a(dVar, new java.lang.String[]{str});
    }

    public java.util.Set a(com.applovin.impl.aq.d dVar, java.lang.String[] strArr) {
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + java.util.Arrays.toString(strArr) + "'...");
        }
        if (dVar == com.applovin.impl.aq.d.IMPRESSION) {
            return this.u;
        }
        if (dVar == com.applovin.impl.aq.d.VIDEO_CLICK) {
            return u1();
        }
        if (dVar == com.applovin.impl.aq.d.COMPANION_CLICK) {
            return m1();
        }
        if (dVar == com.applovin.impl.aq.d.VIDEO) {
            return a(com.applovin.impl.aq.c.VIDEO, strArr);
        }
        if (dVar == com.applovin.impl.aq.d.COMPANION) {
            return a(com.applovin.impl.aq.c.COMPANION_AD, strArr);
        }
        if (dVar == com.applovin.impl.aq.d.INDUSTRY_ICON_CLICK) {
            return r1().b();
        }
        if (dVar == com.applovin.impl.aq.d.INDUSTRY_ICON_IMPRESSION) {
            return r1().f();
        }
        if (dVar == com.applovin.impl.aq.d.ERROR) {
            return this.v;
        }
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + java.util.Arrays.toString(strArr) + "'");
        }
        return java.util.Collections.emptySet();
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.sdk.utils.JsonUtils.putLong(jSONObject, "created_at_millis", this.o);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.ironsource.y8.h.D0, this.l);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "ad_description", this.m);
        com.applovin.impl.jq jqVar = this.n;
        if (jqVar != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "system_info", jqVar.a());
        }
        com.applovin.impl.nq nqVar = this.p;
        if (nqVar != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "video_creative", nqVar.a());
        }
        com.applovin.impl.dq dqVar = this.q;
        if (dqVar != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "companion_ad", dqVar.a());
        }
        com.applovin.impl.cq cqVar = this.s;
        if (cqVar != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "ad_verifications", cqVar.a());
        }
        if (this.u != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.u.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.applovin.impl.kq) it.next()).a());
            }
            com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.v != null) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it2 = this.v.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((com.applovin.impl.kq) it2.next()).a());
            }
            com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it3 = i().iterator();
        while (it3.hasNext()) {
            arrayList.add(((android.net.Uri) it3.next()).toString());
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new org.json.JSONArray((java.util.Collection) arrayList));
        com.applovin.impl.tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "full_response", tlVar.a());
        } else {
            synchronized (this.fullResponseLock) {
                com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}

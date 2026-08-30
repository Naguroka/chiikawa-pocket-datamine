package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class nq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.List f1103a;
    private java.util.List b;
    private int c;
    private android.net.Uri d;
    private final java.util.Set f;
    private com.applovin.impl.gq g;
    private final java.util.Map h;

    public java.lang.String toString() {
        return "VastVideoCreative{videoFiles=" + this.f1103a + ", durationSeconds=" + this.c + ", destinationUri=" + this.d + ", clickTrackers=" + this.f + ", eventTrackers=" + this.h + ", industryIcon=" + this.g + '}';
    }

    private nq() {
        this.f1103a = java.util.Collections.emptyList();
        this.b = java.util.Collections.emptyList();
        this.f = new java.util.HashSet();
        this.h = new java.util.HashMap();
    }

    public static com.applovin.impl.nq a(com.applovin.impl.es esVar, com.applovin.impl.nq nqVar, com.applovin.impl.eq eqVar, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.es esVarC;
        com.applovin.impl.gq gqVarA;
        java.util.List listA;
        com.applovin.impl.es esVarC2;
        java.util.List listA2;
        com.applovin.impl.es esVarC3;
        int iA;
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (eqVar == null) {
            throw new java.lang.IllegalArgumentException("No context specified.");
        }
        if (jVar != null) {
            if (nqVar == null) {
                try {
                    nqVar = new com.applovin.impl.nq(eqVar);
                } catch (java.lang.Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastVideoCreative", "Error occurred while initializing", th);
                    }
                    jVar.D().a("VastVideoCreative", th);
                    return null;
                }
            }
            if (nqVar.c == 0 && (esVarC3 = esVar.c("Duration")) != null && (iA = a(esVarC3.d(), jVar)) > 0) {
                nqVar.c = iA;
            }
            com.applovin.impl.es esVarC4 = esVar.c("MediaFiles");
            if (esVarC4 != null && (listA2 = a(esVarC4, jVar)) != null && listA2.size() > 0) {
                java.util.List list = nqVar.f1103a;
                if (list != null) {
                    listA2.addAll(list);
                }
                nqVar.f1103a = listA2;
            }
            com.applovin.impl.es esVarC5 = esVar.c("VideoClicks");
            if (esVarC5 != null) {
                if (nqVar.d == null && (esVarC2 = esVarC5.c("ClickThrough")) != null) {
                    java.lang.String strD = esVarC2.d();
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD)) {
                        nqVar.d = android.net.Uri.parse(strD);
                    }
                }
                com.applovin.impl.mq.a(esVarC5.a("ClickTracking"), nqVar.f, eqVar, jVar);
            }
            com.applovin.impl.es esVarC6 = esVar.c("Icons");
            if (esVarC6 != null && (gqVarA = com.applovin.impl.gq.a((esVarC = esVarC6.c("Icon")), jVar)) != null) {
                com.applovin.impl.es esVarC7 = esVarC.c("IconClicks");
                if (esVarC7 != null && (listA = esVarC7.a("IconClickTracking")) != null) {
                    com.applovin.impl.mq.a(listA, gqVarA.f832a, eqVar, jVar);
                }
                java.util.List listA3 = esVarC.a("IconViewTracking");
                if (listA3 != null) {
                    com.applovin.impl.mq.a(listA3, gqVarA.b, eqVar, jVar);
                }
                nqVar.g = gqVarA;
            }
            com.applovin.impl.mq.a(esVar, nqVar.h, eqVar, jVar);
            return nqVar;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    private nq(com.applovin.impl.eq eqVar) {
        this.f1103a = java.util.Collections.emptyList();
        this.b = java.util.Collections.emptyList();
        this.f = new java.util.HashSet();
        this.h = new java.util.HashMap();
        this.b = eqVar.f();
    }

    public java.util.List g() {
        return this.f1103a;
    }

    public int d() {
        return this.c;
    }

    public android.net.Uri c() {
        return this.d;
    }

    public java.util.Set b() {
        return this.f;
    }

    public java.util.Map e() {
        return this.h;
    }

    public com.applovin.impl.gq f() {
        return this.g;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.nq)) {
            return false;
        }
        com.applovin.impl.nq nqVar = (com.applovin.impl.nq) obj;
        if (this.c != nqVar.c) {
            return false;
        }
        java.util.List list = this.f1103a;
        if (list == null ? nqVar.f1103a != null : !list.equals(nqVar.f1103a)) {
            return false;
        }
        android.net.Uri uri = this.d;
        if (uri == null ? nqVar.d != null : !uri.equals(nqVar.d)) {
            return false;
        }
        java.util.Set set = this.f;
        if (set == null ? nqVar.f != null : !set.equals(nqVar.f)) {
            return false;
        }
        java.util.Map map = this.h;
        java.util.Map map2 = nqVar.h;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public int hashCode() {
        java.util.List list = this.f1103a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.c) * 31;
        android.net.Uri uri = this.d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        java.util.Set set = this.f;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        java.util.Map map = this.h;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public static com.applovin.impl.nq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        com.applovin.impl.nq nqVar = new com.applovin.impl.nq();
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "video_files", new org.json.JSONArray());
        nqVar.f1103a = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            com.applovin.impl.oq oqVarA = com.applovin.impl.oq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null), jVar);
            if (oqVarA != null) {
                nqVar.f1103a.add(oqVarA);
            }
        }
        nqVar.b = com.applovin.impl.sdk.utils.JsonUtils.getStringList(jSONObject, "preferred_video_file_types", java.util.Collections.emptyList());
        nqVar.c = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "destination_uri", null);
        nqVar.d = com.applovin.impl.sdk.utils.StringUtils.isValidString(string) ? android.net.Uri.parse(string) : null;
        org.json.JSONArray jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "click_trackers", new org.json.JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            com.applovin.impl.kq kqVarA = com.applovin.impl.kq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray2, i2, (org.json.JSONObject) null), jVar);
            if (kqVarA != null) {
                nqVar.f.add(kqVarA);
            }
        }
        nqVar.g = com.applovin.impl.gq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "industry_icon", (org.json.JSONObject) null), jVar);
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "event_trackers", new org.json.JSONObject());
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.String next = itKeys.next();
            org.json.JSONArray jSONArray3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject2, next, new org.json.JSONArray());
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                com.applovin.impl.kq kqVarA2 = com.applovin.impl.kq.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray3, i3, (org.json.JSONObject) null), jVar);
                if (kqVarA2 != null) {
                    hashSet.add(kqVarA2);
                }
            }
            nqVar.h.put(next, hashSet);
        }
        return nqVar;
    }

    public com.applovin.impl.oq a(long j) {
        java.util.List list = this.f1103a;
        com.applovin.impl.oq oqVar = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        java.util.List<com.applovin.impl.oq> arrayList = new java.util.ArrayList(3);
        for (java.lang.String str : this.b) {
            for (com.applovin.impl.oq oqVar2 : this.f1103a) {
                java.lang.String strC = oqVar2.c();
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(oqVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f1103a;
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: com.applovin.impl.nq$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.applovin.impl.nq.a((com.applovin.impl.oq) obj, (com.applovin.impl.oq) obj2);
            }
        });
        for (com.applovin.impl.oq oqVar3 : arrayList) {
            if (oqVar3.b() > j) {
                break;
            }
            oqVar = oqVar3;
        }
        return oqVar != null ? oqVar : (com.applovin.impl.oq) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(com.applovin.impl.oq oqVar, com.applovin.impl.oq oqVar2) {
        return java.lang.Long.compare(oqVar.b(), oqVar2.b());
    }

    private static int a(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        try {
            java.util.List<java.lang.String> listExplode = com.applovin.impl.sdk.utils.CollectionUtils.explode(str, ":");
            if (listExplode.size() == 3) {
                return (int) (java.util.concurrent.TimeUnit.HOURS.toSeconds(com.applovin.impl.sdk.utils.StringUtils.parseInt(listExplode.get(0))) + java.util.concurrent.TimeUnit.MINUTES.toSeconds(com.applovin.impl.sdk.utils.StringUtils.parseInt(listExplode.get(1))) + ((long) com.applovin.impl.sdk.utils.StringUtils.parseInt(listExplode.get(2))));
            }
        } catch (java.lang.Throwable unused) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static java.util.List a(com.applovin.impl.es esVar, com.applovin.impl.sdk.j jVar) {
        java.util.List listA = esVar.a("MediaFile");
        java.util.ArrayList arrayList = new java.util.ArrayList(listA.size());
        java.util.List<java.lang.String> listExplode = com.applovin.impl.sdk.utils.CollectionUtils.explode((java.lang.String) jVar.a(com.applovin.impl.sj.I4));
        java.util.List<java.lang.String> listExplode2 = com.applovin.impl.sdk.utils.CollectionUtils.explode((java.lang.String) jVar.a(com.applovin.impl.sj.H4));
        java.util.Iterator it = listA.iterator();
        while (it.hasNext()) {
            com.applovin.impl.oq oqVarA = com.applovin.impl.oq.a((com.applovin.impl.es) it.next(), jVar);
            if (oqVarA != null) {
                try {
                    java.lang.String strC = oqVarA.c();
                    if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(oqVarA);
                    } else {
                        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.J4)).booleanValue()) {
                            java.lang.String fileExtensionFromUrl = android.webkit.MimeTypeMap.getFileExtensionFromUrl(oqVarA.e().toString());
                            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(oqVarA);
                            }
                        }
                        jVar.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            jVar.I().k("VastVideoCreative", "Video file not supported: " + oqVarA);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastVideoCreative", "Failed to validate video file: " + oqVarA, th);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List list = this.f1103a;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.applovin.impl.oq) it.next()).a());
            }
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new org.json.JSONArray((java.util.Collection) this.b));
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "duration_seconds", this.c);
        android.net.Uri uri = this.d;
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        java.util.Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((com.applovin.impl.kq) it2.next()).a());
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        com.applovin.impl.gq gqVar = this.g;
        if (gqVar != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "industry_icon", gqVar.a());
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str : this.h.keySet()) {
            java.util.Set set = (java.util.Set) this.h.get(str);
            if (set != null) {
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                java.util.Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((com.applovin.impl.kq) it3.next()).a());
                }
                com.applovin.impl.sdk.utils.JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}

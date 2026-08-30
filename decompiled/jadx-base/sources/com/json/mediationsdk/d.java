package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static final boolean A = false;
    private static com.json.mediationsdk.d B = new com.json.mediationsdk.d();
    public static final java.lang.String c = "auctionId";
    public static final java.lang.String d = "armData";
    public static final java.lang.String e = "larmData";
    public static final java.lang.String f = "isAdUnitCapped";
    public static final java.lang.String g = "settings";
    public static final java.lang.String h = "waterfall";
    public static final java.lang.String i = "genericParams";
    public static final java.lang.String j = "configurations";
    public static final java.lang.String k = "instances";
    public static final java.lang.String l = "${AUCTION_LOSS}";
    public static final java.lang.String m = "${AUCTION_MBR}";
    public static final java.lang.String n = "${AUCTION_PRICE}";
    public static final java.lang.String o = "${DYNAMIC_DEMAND_SOURCE}";
    public static final java.lang.String p = "${INSTANCE}";
    public static final java.lang.String q = "${INSTANCE_TYPE}";
    public static final java.lang.String r = "${PLACEMENT_NAME}";
    private static final java.lang.String s = "adMarkup";
    private static final java.lang.String t = "dynamicDemandSource";
    private static final java.lang.String u = "params";
    public static final java.lang.String v = "dlpl";
    public static final java.lang.String w = "adUnit";
    public static final java.lang.String x = "parallelLoad";
    public static final java.lang.String y = "bidderExclusive";
    public static final java.lang.String z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f2941a = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.json.Cif b = com.json.im.S().f();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f2942a;
        private java.util.List<com.json.j5> b;
        private com.json.j5 c;
        private org.json.JSONObject d;
        private org.json.JSONObject e;
        private int f;
        private java.lang.String g;
        private com.json.s4 h;

        public a(java.lang.String str) {
            this.f2942a = str;
        }

        public com.json.mediationsdk.demandOnly.p a(java.lang.String str) {
            com.json.s4 s4Var = this.h;
            return s4Var != null ? s4Var.a(str) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public java.lang.String a() {
            return this.f2942a;
        }

        public org.json.JSONObject b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        public java.lang.String d() {
            return this.g;
        }

        public com.json.j5 e() {
            return this.c;
        }

        public org.json.JSONObject f() {
            return this.d;
        }

        public com.json.s4 g() {
            return this.h;
        }

        public java.util.List<com.json.j5> h() {
            return this.b;
        }
    }

    static class b implements java.lang.Runnable {
        private static final int d = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f2943a;
        private java.lang.String b;
        private java.lang.String c;

        public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f2943a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String str = this.f2943a + ";" + this.b + ";" + this.c;
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(this.c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(d);
                httpURLConnection.setConnectTimeout(d);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                java.lang.String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, responseCode);
                jSONObject.put("reason", responseMessage);
                com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    private com.ironsource.mediationsdk.d.c a() {
        com.ironsource.mediationsdk.d.c cVar = com.ironsource.mediationsdk.d.c.SECURE;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            if (!((com.json.environment.ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0)) {
                return cVar;
            }
        } else if (!android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
            return cVar;
        }
        return com.ironsource.mediationsdk.d.c.NOT_SECURE;
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return "";
        }
        double d2 = java.lang.Double.parseDouble(str);
        double d3 = java.lang.Double.parseDouble(str2);
        return d3 == 0.0d ? "" : java.lang.String.valueOf(java.lang.Math.round((d2 / d3) * 1000.0d) / 1000.0d);
    }

    public static com.json.mediationsdk.d b() {
        return B;
    }

    public com.ironsource.mediationsdk.d.a a(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.lang.String strOptString = jSONObject.optString("auctionId");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            throw new org.json.JSONException("Invalid auction response - auction id is missing");
        }
        com.ironsource.mediationsdk.d.a aVar = new com.ironsource.mediationsdk.d.a(strOptString);
        org.json.JSONObject jSONObjectOptJSONObject = null;
        if (jSONObject.has("settings")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.c = new com.json.j5(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(d) ? jSONObject2.optJSONObject(d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(k)) {
                aVar.h = new com.ironsource.s4.a(jSONObject2.optJSONObject(k));
            }
        }
        aVar.b = new java.util.ArrayList();
        if (jSONObject.has(h)) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(h);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                com.json.j5 j5Var = new com.json.j5(jSONArray.getJSONObject(i2), i2, jSONObjectOptJSONObject);
                if (!j5Var.m()) {
                    aVar.f = 1002;
                    aVar.g = "waterfall " + i2;
                    com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                    throw new org.json.JSONException("invalid response");
                }
                aVar.b.add(j5Var);
            }
        }
        return aVar;
    }

    public java.lang.String a(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return str;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str;
        }
    }

    public java.lang.String a(java.lang.String str, int i2, com.json.j5 j5Var, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String strI = j5Var.i();
        return a(str, j5Var.c(), i2, b().c(j5Var.k()), strI, b().a(strI, str2), str3, str4);
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        return str.replace(n, str4).replace(l, str6).replace(m, str5).replace(p, str2).replace(q, java.lang.Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    org.json.JSONObject a(com.json.mediationsdk.i iVar) throws org.json.JSONException {
        boolean z2;
        boolean z3;
        com.json.mediationsdk.ISBannerSize iSBannerSize;
        com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unitC = iVar.c();
        boolean isEncryptedResponse = iVar.getIsEncryptedResponse();
        java.util.Map<java.lang.String, java.lang.Object> mapG = iVar.g();
        java.util.List<java.lang.String> listK = iVar.k();
        com.json.mediationsdk.h auctionHistory = iVar.getAuctionHistory();
        int sessionDepth = iVar.getSessionDepth();
        com.json.mediationsdk.ISBannerSize bannerSize = iVar.getBannerSize();
        com.json.mediationsdk.IronSourceSegment ironSourceSegment = iVar.getCom.ironsource.y3.i java.lang.String();
        boolean testSuiteLaunched = iVar.getTestSuiteLaunched();
        boolean useTestAds = iVar.getUseTestAds();
        java.util.ArrayList<com.json.c5> arrayListJ = iVar.j();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> it = mapG.keySet().iterator();
        while (true) {
            z2 = testSuiteLaunched;
            z3 = isEncryptedResponse;
            java.lang.String strA = "";
            iSBannerSize = bannerSize;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String next = it.next();
            java.util.Iterator<java.lang.String> it2 = it;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            com.json.mediationsdk.IronSourceSegment ironSourceSegment2 = ironSourceSegment;
            jSONObject3.put(com.json.ce.n0, 2);
            jSONObject3.put(com.json.ce.e0, new org.json.JSONObject((java.util.Map) mapG.get(next)));
            if (auctionHistory != null) {
                strA = auctionHistory.a(next);
            }
            jSONObject3.put(com.json.ce.q0, strA);
            jSONObject3.put("ts", useTestAds ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            testSuiteLaunched = z2;
            isEncryptedResponse = z3 ? 1 : 0;
            bannerSize = iSBannerSize;
            it = it2;
            ironSourceSegment = ironSourceSegment2;
        }
        com.json.mediationsdk.IronSourceSegment ironSourceSegment3 = ironSourceSegment;
        int i2 = 2;
        for (java.lang.String str : listK) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(com.json.ce.n0, 1);
            jSONObject4.put(com.json.ce.q0, auctionHistory != null ? auctionHistory.a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        for (com.json.c5 c5Var : arrayListJ) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put(com.json.ce.n0, c5Var.e() ? i2 : 1);
            java.util.Map<java.lang.String, java.lang.Object> mapF = c5Var.f();
            if (!mapF.isEmpty()) {
                jSONObject5.put(com.json.ce.e0, new org.json.JSONObject(mapF));
            }
            jSONObject5.put(com.json.ce.q0, auctionHistory != null ? auctionHistory.a(c5Var.g()) : "");
            jSONObject5.put("ts", useTestAds ? 1 : 0);
            if (!c5Var.getPlumbus().isEmpty()) {
                jSONObject5.put(v, c5Var.getPlumbus());
            }
            jSONObject2.put(c5Var.g(), jSONObject5);
            i2 = 2;
        }
        jSONObject.put(com.json.ce.m0, jSONObject2);
        if (iVar.getIsOneFlow()) {
            jSONObject.put(com.json.ce.m1, 1);
        }
        if (iVar.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY java.lang.String()) {
            jSONObject.put(com.json.ce.l1, 1);
        }
        org.json.JSONObject jSONObjectA = new com.json.y4(com.json.u2.a(ad_unitC)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(com.json.ce.o0, sessionDepth);
        jSONObjectA.put(com.json.ce.p0, a().ordinal());
        if (ironSourceSegment3 != null) {
            jSONObjectA.put(com.json.ce.Y0, ironSourceSegment3.toJson());
        }
        jSONObject.put(com.json.ce.j0, jSONObjectA);
        if (iSBannerSize != null) {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put(com.json.ce.g0, iSBannerSize.getDescription());
            jSONObject6.put(com.json.ce.i0, iSBannerSize.getWidth());
            jSONObject6.put(com.json.ce.h0, iSBannerSize.getHeight());
            jSONObject.put(com.json.ce.f0, jSONObject6);
        }
        jSONObject.put(com.json.ce.a0, ad_unitC.toString());
        if (iVar.getCom.ironsource.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT java.lang.String() != null) {
            jSONObject.put("adf", iVar.getCom.ironsource.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT java.lang.String());
        }
        if (iVar.getAdUnitId() != null) {
            jSONObject.put("mediationAdUnitId", iVar.getAdUnitId());
        }
        if (iVar.getIsMultipleAdsFlow() != null) {
            jSONObject.put(com.json.ce.d0, iVar.getIsMultipleAdsFlow());
        }
        jSONObject.put(com.json.ce.k0, !z3 ? 1 : 0);
        java.lang.Object objRemove = jSONObjectA.remove(com.json.ce.i1);
        if (objRemove != null) {
            jSONObject.put(com.json.ce.i1, objRemove);
        }
        if (z2) {
            jSONObject.put(com.json.ce.g1, 1);
        }
        return jSONObject;
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.d.b(str, str2, str3));
    }

    public void a(org.json.JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || android.text.TextUtils.isEmpty(jSONObject.optString(com.json.ce.a1)) || !this.f2941a.compareAndSet(false, true)) {
            return;
        }
        com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(z2, true, -1)));
    }

    public java.util.Map<java.lang.String, java.lang.String> b(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("params")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    java.lang.Object obj = jSONObject2.get(next);
                    if (obj instanceof java.lang.String) {
                        map.put(next, (java.lang.String) obj);
                    }
                }
            }
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return map;
    }

    public java.lang.String c(java.lang.String str) {
        java.lang.String string = "";
        try {
            if (android.text.TextUtils.isEmpty(str) || !com.json.hk.a(str)) {
                return "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has("dynamicDemandSource")) {
                return "";
            }
            string = jSONObject2.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + string);
            return string;
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e2.getMessage());
            return string;
        }
    }
}

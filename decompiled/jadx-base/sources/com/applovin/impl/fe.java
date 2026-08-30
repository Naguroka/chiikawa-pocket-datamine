package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fe extends com.applovin.impl.oe implements com.applovin.mediation.MaxAd {
    private final int l;
    private final java.util.concurrent.atomic.AtomicBoolean m;
    private final java.util.concurrent.atomic.AtomicBoolean n;
    protected com.applovin.impl.mediation.g o;
    private final java.lang.String p;
    private com.applovin.mediation.MaxAdWaterfallInfo q;
    private long r;
    private java.lang.String s;
    private java.lang.String t;
    private com.applovin.impl.bd u;

    public abstract com.applovin.impl.fe a(com.applovin.impl.mediation.g gVar);

    @Override // com.applovin.impl.oe
    public java.lang.String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + T() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public int J() {
        return this.l;
    }

    public com.applovin.impl.mediation.g A() {
        return this.o;
    }

    public static com.applovin.impl.fe a(int i, java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject2, com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, null);
        com.applovin.mediation.MaxAdFormat fromString = com.applovin.mediation.MaxAdFormat.formatFromString(string);
        java.util.Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new com.applovin.impl.ge(i, map, jSONObject, jSONObject2, jVar);
        }
        if (fromString == com.applovin.mediation.MaxAdFormat.NATIVE) {
            return new com.applovin.impl.ie(i, map, jSONObject, jSONObject2, jVar);
        }
        if (fromString.isFullscreenAd()) {
            return new com.applovin.impl.he(i, map, jSONObject, jSONObject2, jVar);
        }
        throw new java.lang.IllegalArgumentException("Unsupported ad format: " + string);
    }

    protected fe(int i, java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.j jVar) {
        super(map, jSONObject, jSONObject2, jVar);
        this.m = new java.util.concurrent.atomic.AtomicBoolean();
        this.n = new java.util.concurrent.atomic.AtomicBoolean();
        this.l = i;
        this.o = gVar;
        this.p = gVar != null ? gVar.b() : null;
    }

    public java.util.List U() {
        return b("mwf_info_urls");
    }

    public java.lang.String B() {
        return a("bcode", "");
    }

    public long E() {
        return a("bwt_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.B7)).longValue());
    }

    public long S() {
        return a("twt_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.C7)).longValue());
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.mediation.MaxAdWaterfallInfo getWaterfall() {
        return this.q;
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.r;
    }

    public void i(java.lang.String str) {
        this.s = str;
    }

    public java.lang.String M() {
        return this.s;
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getAdReviewCreativeId() {
        return this.t;
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.mediation.MaxAdFormat getFormat() {
        return com.applovin.mediation.MaxAdFormat.formatFromString(a(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, b(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, (java.lang.String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.sdk.AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        if (iA != -3 && iA2 != -3) {
            return new com.applovin.sdk.AppLovinSdkUtils.Size(iA, iA2);
        }
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getNetworkPlacement() {
        return com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(T());
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getCreativeId() {
        return a("creative_id", (java.lang.String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((java.lang.Boolean) this.f1122a.a(com.applovin.impl.ue.y7)).booleanValue() && getFormat().isFullscreenAd() && !u().get()) {
            this.f1122a.I();
            if (!com.applovin.impl.sdk.n.a()) {
                return 0.0d;
            }
            this.f1122a.I().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
            return 0.0d;
        }
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return ((java.lang.Double) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.fe$$ExternalSyntheticLambda5
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.fe.f((com.applovin.impl.tl) obj);
                }
            })).doubleValue();
        }
        return com.applovin.impl.sdk.utils.JsonUtils.getDouble(a("revenue_parameters", (org.json.JSONObject) null), "revenue", -1.0d);
    }

    public void a(long j) {
        this.r = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Double f(com.applovin.impl.tl tlVar) {
        return java.lang.Double.valueOf(com.applovin.impl.sdk.utils.JsonUtils.getDouble(tlVar.a("revenue_parameters", (org.json.JSONObject) null), "revenue", -1.0d));
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getRevenuePrecision() {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return (java.lang.String) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.fe$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.fe.h((com.applovin.impl.tl) obj);
                }
            });
        }
        return com.applovin.impl.sdk.utils.JsonUtils.getString(a("revenue_parameters", (org.json.JSONObject) null), "precision", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String h(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(tlVar.a("revenue_parameters", (org.json.JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getDspName() {
        return a("dsp_name", (java.lang.String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getDspId() {
        return a("dsp_id", (java.lang.String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getAdValue(java.lang.String str) {
        return getAdValue(str, null);
    }

    public double N() {
        return a("price", -1.0f);
    }

    public org.json.JSONObject x() {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return (org.json.JSONObject) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.fe$$ExternalSyntheticLambda6
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.fe.b((com.applovin.impl.tl) obj);
                }
            });
        }
        return a("ad_values", new org.json.JSONObject());
    }

    public void a(com.applovin.mediation.MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.q = maxAdWaterfallInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.json.JSONObject b(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.deepCopy(tlVar.a("ad_values", new org.json.JSONObject()));
    }

    public org.json.JSONObject O() {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return (org.json.JSONObject) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.fe$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.fe.e((com.applovin.impl.tl) obj);
                }
            });
        }
        return a("publisher_extra_info", new org.json.JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.json.JSONObject e(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.deepCopy(tlVar.a("publisher_extra_info", new org.json.JSONObject()));
    }

    public org.json.JSONObject Q() {
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return (org.json.JSONObject) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.fe$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.fe.g((com.applovin.impl.tl) obj);
                }
            });
        }
        return a("revenue_parameters", new org.json.JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.json.JSONObject g(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.sdk.utils.JsonUtils.deepCopy(tlVar.a("revenue_parameters", new org.json.JSONObject()));
    }

    public java.lang.String P() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(Q(), "revenue_event", "");
    }

    public void h(java.lang.String str) {
        this.t = str;
    }

    public java.lang.String R() {
        return b("event_id", "");
    }

    public java.lang.String v() {
        return a("adomain", (java.lang.String) null);
    }

    public boolean a0() {
        com.applovin.impl.mediation.g gVar = this.o;
        return gVar != null && gVar.k() && this.o.j();
    }

    public java.lang.String z() {
        return this.p;
    }

    public android.os.Bundle F() {
        org.json.JSONObject jSONObjectA;
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            return (android.os.Bundle) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.fe$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.c((com.applovin.impl.tl) obj);
                }
            });
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new org.json.JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new org.json.JSONObject());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObjectA, com.google.ads.mediation.facebook.FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, T());
        }
        return com.applovin.impl.sdk.utils.JsonUtils.toBundle(jSONObjectA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle c(com.applovin.impl.tl tlVar) {
        org.json.JSONObject jSONObjectA;
        if (tlVar.a("credentials")) {
            jSONObjectA = tlVar.a("credentials", new org.json.JSONObject());
        } else {
            jSONObjectA = tlVar.a("server_parameters", new org.json.JSONObject());
            com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObjectA, com.google.ads.mediation.facebook.FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, T());
        }
        return com.applovin.impl.sdk.utils.JsonUtils.toBundle(jSONObjectA);
    }

    public java.lang.String D() {
        return a("bid_response", (java.lang.String) null);
    }

    public boolean X() {
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(D());
    }

    public long C() {
        return a("bid_expiration_ms", com.applovin.impl.sdk.utils.BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public boolean Z() {
        return a("is_js_tag_ad", java.lang.Boolean.FALSE).booleanValue();
    }

    public boolean b0() {
        return a("only_load_when_initialized", java.lang.Boolean.FALSE).booleanValue();
    }

    public boolean c0() {
        return a("prefer_load_when_initialized", java.lang.Boolean.TRUE).booleanValue();
    }

    public com.applovin.mediation.MaxAdFormat I() {
        java.lang.String strA = a("haf", (java.lang.String) null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            return com.applovin.mediation.MaxAdFormat.formatFromString(strA);
        }
        return null;
    }

    public boolean Y() {
        return I() != null;
    }

    public com.applovin.impl.bd H() {
        com.applovin.impl.bd bdVar = this.u;
        if (bdVar != null) {
            return bdVar;
        }
        com.applovin.impl.tl tlVar = this.i;
        if (tlVar != null) {
            this.u = (com.applovin.impl.bd) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.fe$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.fe.d((com.applovin.impl.tl) obj);
                }
            });
        } else {
            this.u = new com.applovin.impl.bd(a("hybrid_ad_config", (org.json.JSONObject) null));
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.bd d(com.applovin.impl.tl tlVar) {
        return new com.applovin.impl.bd(tlVar.a("hybrid_ad_config", (org.json.JSONObject) null));
    }

    @Override // com.applovin.mediation.MaxAd
    public java.lang.String getAdValue(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObjectX = x();
        if (jSONObjectX.has(str)) {
            return com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObjectX, str, str2);
        }
        android.os.Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        org.json.JSONObject jSONObjectO = O();
        if (jSONObjectO.has(str)) {
            return com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObjectO, str, str2);
        }
        return a(str, str2);
    }

    public android.view.View y() {
        com.applovin.impl.mediation.g gVar;
        if (!a0() || (gVar = this.o) == null) {
            return null;
        }
        return gVar.d();
    }

    @Override // com.applovin.mediation.MaxAd
    public com.applovin.mediation.nativeAds.MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.g gVar = this.o;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public java.lang.String T() {
        return a("third_party_ad_placement_id", (java.lang.String) null);
    }

    public java.lang.String V() {
        return b("waterfall_name", "");
    }

    public java.lang.String W() {
        return b("waterfall_test_name", "");
    }

    public long G() {
        if (L() > 0) {
            return K() - L();
        }
        return -1L;
    }

    private long L() {
        return a("load_started_time_ms", 0L);
    }

    public void e0() {
        c("load_started_time_ms", android.os.SystemClock.elapsedRealtime());
    }

    public long K() {
        return a("load_completed_time_ms", 0L);
    }

    public void d0() {
        c("load_completed_time_ms", android.os.SystemClock.elapsedRealtime());
    }

    public void a(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        org.json.JSONObject jSONObjectX = x();
        com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObjectX, jSONObject);
        a("ad_values", (java.lang.Object) jSONObjectX);
    }

    public java.util.concurrent.atomic.AtomicBoolean u() {
        return this.m;
    }

    public java.util.concurrent.atomic.AtomicBoolean w() {
        return this.n;
    }

    public void b(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        org.json.JSONObject jSONObjectO = O();
        com.applovin.impl.sdk.utils.JsonUtils.putAll(jSONObjectO, jSONObject);
        a("publisher_extra_info", (java.lang.Object) jSONObjectO);
    }

    public void t() {
        this.o = null;
        this.q = null;
    }

    public void a(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ad_values")) {
            a(com.applovin.impl.sdk.utils.BundleUtils.toJSONObject(bundle.getBundle("ad_values")));
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", com.applovin.impl.sdk.utils.BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = com.applovin.impl.sdk.utils.BundleUtils.getInt("ad_width", bundle);
            int i2 = com.applovin.impl.sdk.utils.BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(com.applovin.impl.sdk.utils.BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}

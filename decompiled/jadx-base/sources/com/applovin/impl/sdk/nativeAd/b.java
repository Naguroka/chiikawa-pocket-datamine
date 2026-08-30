package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class b extends com.applovin.impl.yl implements com.applovin.impl.sdk.nativeAd.a.InterfaceC0054a, com.applovin.sdk.AppLovinAdLoadListener {
    private final java.util.List A;
    private final java.util.List B;
    private final java.util.List C;
    private final org.json.JSONObject h;
    private final org.json.JSONObject i;
    private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener j;
    private java.lang.String k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.Double n;
    private java.lang.String o;
    private android.net.Uri p;
    private android.net.Uri q;
    private com.applovin.impl.aq r;
    private android.net.Uri s;
    private android.net.Uri t;
    private android.net.Uri u;
    private android.net.Uri v;
    private final java.util.List w;
    private final java.util.List x;
    private final java.util.List y;
    private final java.util.List z;

    public b(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderNativeAd", jVar);
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = null;
        this.o = "";
        this.p = null;
        this.q = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = new java.util.ArrayList();
        this.x = new java.util.ArrayList();
        this.y = new java.util.ArrayList();
        this.z = new java.util.ArrayList();
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.h = jSONObject;
        this.i = jSONObject2;
        this.j = appLovinNativeAdLoadListener;
    }

    private void a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "url", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
            this.u = android.net.Uri.parse(string);
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processed click destination URL: " + this.u);
            }
        }
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "fallback", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string2)) {
            this.v = android.net.Uri.parse(string2);
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processed click destination backup URL: " + this.v);
            }
        }
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.h, "use_requests_for_native_ad_click_postbacks", (java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.R2)).booleanValue()) {
                try {
                    this.w.addAll(com.applovin.impl.sdk.utils.JsonUtils.toList(jSONArray));
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Processed click tracking URLs: " + this.w);
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.Object objectAtIndex = com.applovin.impl.sdk.utils.JsonUtils.getObjectAtIndex(jSONArray, i, null);
                if (objectAtIndex instanceof java.lang.String) {
                    java.lang.String str = (java.lang.String) objectAtIndex;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        this.y.add(new com.applovin.impl.sdk.network.e.a(this.f1547a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processed click tracking requests: " + this.y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.j.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f1547a.D().a(this.b, "prepareNativeComponents", th);
        }
    }

    private void c(final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.nativeAd.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(appLovinNativeAdImpl);
            }
        });
    }

    private void e() {
        com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImplBuild = new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder(com.applovin.impl.sdk.utils.JsonUtils.shallowCopy(this.h), com.applovin.impl.sdk.utils.JsonUtils.shallowCopy(this.i), this.f1547a).setTitle(this.k).setAdvertiser(this.l).setBody(this.m).setCallToAction(this.o).setStarRating(this.n).setIconUri(this.p).setMainImageUri(this.q).setPrivacyIconUri(this.s).setVastAd(this.r).setPrivacyDestinationUri(this.t).setClickDestinationUri(this.u).setClickDestinationBackupUri(this.v).setClickTrackingUrls(this.w).setJsTrackers(this.x).setClickTrackingRequests(this.y).setImpressionRequests(this.z).setViewableMRC50Requests(this.A).setViewableMRC100Requests(this.B).setViewableVideo50Requests(this.C).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f1547a.i0().a((com.applovin.impl.yl) new com.applovin.impl.sdk.nativeAd.a(appLovinNativeAdImplBuild, this.f1547a, this), com.applovin.impl.tm.b.CORE);
    }

    private boolean f() {
        return com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.h, "fire_native_ad_postbacks_from_webview", (java.lang.Boolean) this.f1547a.a(com.applovin.impl.sj.Q2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "VAST ad rendered successfully");
        }
        this.r = (com.applovin.impl.aq) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v72 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r3 = 0;
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(this.h, "privacy_icon_url", null);
        if (android.webkit.URLUtil.isValidUrl(string)) {
            this.s = android.net.Uri.parse(string);
        }
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(this.h, "privacy_url", null);
        if (android.webkit.URLUtil.isValidUrl(string2)) {
            this.t = android.net.Uri.parse(string2);
        }
        org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(this.h, "ortb_response", (org.json.JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "No oRtb response provided: " + this.h);
            }
            b("No oRtb response provided");
            return;
        }
        java.lang.String string3 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "version", null);
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "value", (org.json.JSONObject) null);
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Rendering native ad for oRTB version: " + string3);
        }
        org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject2, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE, jSONObject2);
        a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject3, "link", (org.json.JSONObject) null));
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to retrieve assets - failing ad load: " + this.h);
            }
            b("Unable to retrieve assets");
            return;
        }
        java.lang.String str = "";
        int i = 0;
        while (i < jSONArray.length()) {
            org.json.JSONObject jSONObject4 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) r3);
            if (jSONObject4.has(com.ironsource.y8.h.D0)) {
                this.k = com.applovin.impl.sdk.utils.JsonUtils.getString(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject4, com.ironsource.y8.h.D0, (org.json.JSONObject) r3), "text", r3);
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Processed title: " + this.k);
                }
            } else if (jSONObject4.has("link")) {
                a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject4, "link", (org.json.JSONObject) r3));
            } else if (jSONObject4.has("img")) {
                int i2 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject4, "id", -1);
                org.json.JSONObject jSONObject5 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject4, "img", (org.json.JSONObject) r3);
                int i3 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject5, "type", -1);
                java.lang.String string4 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject5, "url", r3);
                if (i3 == 1 || 3 == i2) {
                    this.p = android.net.Uri.parse(string4);
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Processed icon URL: " + this.p);
                    }
                } else if (i3 == 3 || 2 == i2) {
                    this.q = android.net.Uri.parse(string4);
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Processed main image URL: " + this.q);
                    }
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.k(this.b, "Unrecognized image: " + jSONObject4);
                    }
                    int i4 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject5, "w", -1);
                    int i5 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject5, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, -1);
                    if (i4 <= 0 || i5 <= 0) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.k(this.b, "Skipping...");
                        }
                    } else if (i4 / i5 > 1.0d) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a(this.b, "Inferring main image from " + i4 + "x" + i5 + "...");
                        }
                        this.q = android.net.Uri.parse(string4);
                    } else {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a(this.b, "Inferring icon image from " + i4 + "x" + i5 + "...");
                        }
                        this.p = android.net.Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                java.lang.String string5 = com.applovin.impl.sdk.utils.JsonUtils.getString(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject4, "video", (org.json.JSONObject) null), "vasttag", null);
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string5)) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Processed VAST video");
                    }
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.c.k(this.b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i6 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject4, "id", -1);
                org.json.JSONObject jSONObject6 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject4, "data", (org.json.JSONObject) null);
                int i7 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject6, "type", -1);
                java.lang.String string6 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject6, "value", null);
                if (i7 == 1 || i6 == 8) {
                    this.l = string6;
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Processed advertiser: " + this.l);
                    }
                } else if (i7 == 2 || i6 == 4) {
                    this.m = string6;
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Processed body: " + this.m);
                    }
                } else if (i7 == 12 || i6 == 5) {
                    this.o = string6;
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Processed cta: " + this.o);
                    }
                } else if (i7 == 3 || i6 == 6) {
                    double dA = com.applovin.impl.yp.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.n = java.lang.Double.valueOf(dA);
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a(this.b, "Processed star rating: " + this.n);
                        }
                    } else if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Received invalid star rating: " + string6);
                    }
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.c.k(this.b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unsupported asset object: " + jSONObject4);
            }
            i++;
            r3 = 0;
        }
        java.lang.String string7 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject3, "jstracker", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string7)) {
            this.x.add(string7);
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processed jstracker: " + string7);
            }
        }
        java.lang.Object obj = null;
        org.json.JSONArray jSONArray2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i8 = 0;
            while (i8 < jSONArray2.length()) {
                java.lang.Object objectAtIndex = com.applovin.impl.sdk.utils.JsonUtils.getObjectAtIndex(jSONArray2, i8, obj);
                if (objectAtIndex instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) objectAtIndex;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        this.z.add(new com.applovin.impl.sdk.network.e.a(this.f1547a).b(str2).b(false).a(false).h(f()).a());
                        if (com.applovin.impl.sdk.n.a()) {
                            this.c.a(this.b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i8++;
                obj = null;
            }
        }
        ?? r4 = 0;
        org.json.JSONArray jSONArray3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i9 = 0;
            while (i9 < jSONArray3.length()) {
                org.json.JSONObject jSONObject7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray3, i9, (org.json.JSONObject) r4);
                int i10 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject7, androidx.core.app.NotificationCompat.CATEGORY_EVENT, -1);
                int i11 = com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject7, "method", -1);
                java.lang.String string8 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject7, "url", r4);
                if (!android.text.TextUtils.isEmpty(string8)) {
                    if (i11 == 1 || i11 == 2) {
                        if (i11 == 2 && string8.startsWith("<script")) {
                            this.x.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarA = new com.applovin.impl.sdk.network.e.a(this.f1547a).b(string8).b(false).a(false).h(f() || i11 == 2).a();
                            if (i10 == 1) {
                                this.z.add(eVarA);
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a(this.b, "Processed impression URL: " + string8);
                                }
                            } else if (i10 == 2) {
                                this.A.add(eVarA);
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a(this.b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i10 == 3) {
                                this.B.add(eVarA);
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a(this.b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i10 == 4) {
                                this.C.add(eVarA);
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a(this.b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i10 == 555) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.c.a(this.b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (com.applovin.impl.sdk.n.a()) {
                                this.c.b(this.b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (com.applovin.impl.sdk.n.a()) {
                        this.c.b(this.b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i9++;
                r4 = 0;
            }
        }
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Processing VAST video...");
        }
        this.f1547a.i0().a(com.applovin.impl.zm.a(str, com.applovin.impl.sdk.utils.JsonUtils.shallowCopy(this.h), com.applovin.impl.sdk.utils.JsonUtils.shallowCopy(this.i), this, this.f1547a));
    }

    private void b(java.lang.String str) {
        this.j.onNativeAdLoadFailed(new com.applovin.impl.sdk.AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0054a
    public void a(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}

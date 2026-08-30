package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MediationServiceImpl implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1032a;
    private final com.applovin.impl.sdk.n b;
    private final com.applovin.impl.xj c;
    private final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference();

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1035a;

        static {
            int[] iArr = new int[com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.values().length];
            f1035a = iArr;
            try {
                iArr[com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1035a[com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1035a[com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f1035a[com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f1035a[com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f1035a[com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public class d implements com.applovin.mediation.MaxAdListener, com.applovin.mediation.MaxRewardedAdListener, com.applovin.mediation.MaxAdViewAdListener, com.applovin.mediation.MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0040a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.fe f1036a;
        private com.applovin.impl.mediation.ads.a.InterfaceC0040a b;

        public void a(com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
            this.b = interfaceC0040a;
        }

        public void b(com.applovin.mediation.MaxAd maxAd, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            com.applovin.impl.fc.b(this.b, maxAd);
        }

        public void c(com.applovin.mediation.MaxAd maxAd, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.MediationServiceImpl.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.MediationServiceImpl.this.b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            com.applovin.impl.mediation.MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f1036a, this.b);
            if (!((java.lang.Boolean) com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.a(com.applovin.impl.ue.K7)).booleanValue() || this.f1036a.u().compareAndSet(false, true)) {
                com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.k().a(this.f1036a, com.applovin.impl.sdk.g.c.SHOW);
                com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.C().c(com.applovin.impl.ba.f);
                com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.C().c(com.applovin.impl.ba.i);
                if (!maxAd.getFormat().isFullscreenAd()) {
                    com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.q().b(this.f1036a, "DID_DISPLAY");
                    com.applovin.impl.fc.c(this.b, maxAd);
                    return;
                }
                com.applovin.impl.he heVar = (com.applovin.impl.he) maxAd;
                if (heVar.q0()) {
                    com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.q().b(this.f1036a, "DID_DISPLAY");
                    com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.B().a(this.f1036a);
                    com.applovin.impl.fc.c(this.b, maxAd);
                } else {
                    com.applovin.impl.sdk.n unused2 = com.applovin.impl.mediation.MediationServiceImpl.this.b;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.mediation.MediationServiceImpl.this.b.k("MediationService", "Received ad display callback before attempting show".concat(heVar.Y() ? " for hybrid ad" : ""));
                    }
                }
            }
        }

        public void d(com.applovin.mediation.MaxAd maxAd, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            com.applovin.impl.fc.d(this.b, maxAd);
        }

        public void e(final com.applovin.mediation.MaxAd maxAd, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.D().a(com.applovin.impl.ka.K, this.f1036a);
            com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.k().a(this.f1036a, com.applovin.impl.sdk.g.c.HIDE);
            com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.q().b((com.applovin.impl.fe) maxAd, "DID_HIDE");
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(maxAd);
                }
            }, maxAd instanceof com.applovin.impl.he ? ((com.applovin.impl.he) maxAd).h0() : 0L);
        }

        public void f(com.applovin.mediation.MaxAd maxAd, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            this.f1036a.d0();
            com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.k().a(this.f1036a, com.applovin.impl.sdk.g.c.LOAD);
            com.applovin.impl.mediation.MediationServiceImpl.this.a(this.f1036a);
            com.applovin.impl.fc.f(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(com.applovin.mediation.MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(com.applovin.mediation.MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError) {
            a(maxAd, maxError, (android.os.Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(com.applovin.mediation.MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(com.applovin.mediation.MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(com.applovin.mediation.MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(java.lang.String str, com.applovin.mediation.MaxError maxError) {
            this.f1036a.d0();
            com.applovin.impl.mediation.MediationServiceImpl.this.b(this.f1036a, maxError, this.b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(com.applovin.mediation.MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(java.lang.String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(com.applovin.mediation.MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward) {
            a(maxAd, maxReward, (android.os.Bundle) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.mediation.MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.B().b(maxAd);
            }
            com.applovin.impl.fc.e(this.b, maxAd);
        }

        public void a(com.applovin.mediation.MaxAd maxAd, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.k().a(this.f1036a, com.applovin.impl.sdk.g.c.CLICK);
            com.applovin.impl.mediation.MediationServiceImpl.this.a(this.f1036a, this.b);
            com.applovin.impl.fc.a((com.applovin.mediation.MaxAdListener) this.b, maxAd);
        }

        public void a(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxError maxError, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            com.applovin.impl.mediation.MediationServiceImpl.this.a(this.f1036a, maxError, this.b);
            if ((maxAd.getFormat() == com.applovin.mediation.MaxAdFormat.REWARDED || maxAd.getFormat() == com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof com.applovin.impl.he)) {
                ((com.applovin.impl.he) maxAd).f0();
            }
        }

        public void a(com.applovin.mediation.MaxAd maxAd, com.applovin.mediation.MaxReward maxReward, android.os.Bundle bundle) {
            this.f1036a.a(bundle);
            com.applovin.impl.fc.a(this.b, maxAd, maxReward);
            com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.i0().a((com.applovin.impl.yl) new com.applovin.impl.fn((com.applovin.impl.he) maxAd, com.applovin.impl.mediation.MediationServiceImpl.this.f1032a), com.applovin.impl.tm.b.OTHER);
        }

        public d(com.applovin.impl.fe feVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
            this.f1036a = feVar;
            this.b = interfaceC0040a;
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.j jVar) {
        this.f1032a = jVar;
        this.b = jVar.I();
        this.c = new com.applovin.impl.xj(jVar);
        com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter("com.applovin.render_process_gone"));
    }

    public void destroyAd(com.applovin.mediation.MaxAd maxAd) {
        if (maxAd instanceof com.applovin.impl.fe) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.d("MediationService", "Destroying " + maxAd);
            }
            com.applovin.impl.fe feVar = (com.applovin.impl.fe) maxAd;
            com.applovin.impl.mediation.g gVarA = feVar.A();
            if (gVarA != null) {
                gVarA.a();
                feVar.t();
            }
            this.f1032a.i().c(feVar.R());
            this.f1032a.k().a(feVar, com.applovin.impl.sdk.g.c.DESTROY);
        }
    }

    public org.json.JSONObject getAndResetCustomPostBodyData() {
        return (org.json.JSONObject) this.d.getAndSet(null);
    }

    public void loadAd(java.lang.String str, java.lang.String str2, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.mediation.d.b bVar, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2, android.content.Context context, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        java.util.List<java.lang.String> adUnitIds;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context specified");
        }
        if (interfaceC0040a == null) {
            throw new java.lang.IllegalArgumentException("No listener specified");
        }
        if (android.text.TextUtils.isEmpty(this.f1032a.N())) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
        }
        if (!this.f1032a.s0()) {
            com.applovin.impl.sdk.n.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        if (this.f1032a.x0().get()) {
            adUnitIds = this.f1032a.f0().getInitializationAdUnitIds();
        } else {
            adUnitIds = this.f1032a.G() != null ? this.f1032a.G().getAdUnitIds() : null;
        }
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (com.applovin.impl.yp.c(this.f1032a)) {
                java.lang.String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/max/android/overview/advanced-settings#selective-init";
                if (((java.lang.Boolean) this.f1032a.a(com.applovin.impl.sj.h6)).booleanValue()) {
                    throw new java.lang.RuntimeException(str3);
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("MediationService", str3);
                }
            }
            this.f1032a.D().a(com.applovin.impl.ka.V, "uninitialized_ad_unit_id", com.applovin.impl.sdk.utils.CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
        }
        this.f1032a.c();
        if (str.length() != 16 && !zStartsWith && !this.f1032a.a0().startsWith("05TMD")) {
            com.applovin.impl.sdk.n.h("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + android.util.Log.getStackTraceString(new java.lang.Throwable("")));
        }
        if (this.f1032a.a(maxAdFormat)) {
            com.applovin.impl.sdk.n.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            com.applovin.impl.fc.a(interfaceC0040a, str, new com.applovin.impl.mediation.MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
        } else {
            this.f1032a.R0();
            com.applovin.impl.fc.a((com.applovin.mediation.MaxAdRequestListener) interfaceC0040a, str, true);
            this.f1032a.J().a(str, str2, maxAdFormat, bVar, map, map2, context, interfaceC0040a);
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            java.lang.Object objA = this.f1032a.B().a();
            if (objA instanceof com.applovin.impl.fe) {
                a((com.applovin.mediation.MaxError) com.applovin.mediation.adapter.MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.fe) objA, true);
            }
        }
    }

    public void processWaterfallInfoPostback(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.mediation.MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, com.applovin.mediation.MaxError maxError, long j, long j2) {
        java.util.HashMap map = new java.util.HashMap();
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, maxAdFormat.getLabel(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", str, map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("duration_ms", java.lang.String.valueOf(j2), map);
        if (maxError != null) {
            map.putAll(com.applovin.impl.la.a(maxError));
        }
        this.f1032a.D().a(com.applovin.impl.ka.H, (java.util.Map) map);
        if (com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        java.util.HashMap map2 = new java.util.HashMap(8);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", str, map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, maxAdFormat.getLabel(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putLongIfValid("request_latency_ms", java.lang.Long.valueOf(j2), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putLongIfValid("request_start_timestamp_ms", java.lang.Long.valueOf(j), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putLongIfValid("wf_latency_ms", java.lang.Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        java.util.List<com.applovin.mediation.MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        java.util.ArrayList arrayList = new java.util.ArrayList(networkResponses.size());
        for (com.applovin.mediation.MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            com.applovin.mediation.MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            java.util.HashMap map3 = new java.util.HashMap(5);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("bcode", ((com.applovin.impl.mediation.MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put("name", mediatedNetwork.getName());
            com.applovin.impl.sdk.utils.CollectionUtils.putLongIfValid("latency_ms", java.lang.Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map3);
            map3.put("load_state", java.lang.Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            com.applovin.impl.mediation.MaxErrorImpl maxErrorImpl = (com.applovin.impl.mediation.MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                java.util.HashMap map4 = new java.util.HashMap(4);
                map4.put("error_code", java.lang.Integer.valueOf(maxErrorImpl.getCode()));
                map4.put("error_message", maxErrorImpl.getMessage());
                map4.put("third_party_sdk_error_code", java.lang.Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map3.put("error_info", map4);
            }
            arrayList.add(map3);
        }
        map2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), java.util.Collections.EMPTY_MAP, map2, null, null, false);
    }

    public void setCustomPostBodyData(org.json.JSONObject jSONObject) {
        this.d.set(jSONObject);
    }

    public void showFullscreenAd(final com.applovin.impl.he heVar, final android.app.Activity activity, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (heVar != null) {
            if (activity == null && com.applovin.mediation.MaxAdFormat.APP_OPEN != heVar.getFormat()) {
                throw new java.lang.IllegalArgumentException("No activity specified");
            }
            this.f1032a.B().a(true);
            final com.applovin.impl.mediation.g gVarB = b(heVar);
            long jN0 = heVar.n0();
            if (com.applovin.impl.sdk.n.a()) {
                this.b.d("MediationService", "Showing ad " + heVar.getAdUnitId() + " with delay of " + jN0 + "ms...");
            }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(heVar, gVarB, activity, interfaceC0040a);
                }
            }, jN0);
            return;
        }
        throw new java.lang.IllegalArgumentException("No ad specified");
    }

    public void loadThirdPartyMediatedAd(final java.lang.String str, final com.applovin.impl.fe feVar, final android.app.Activity activity, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        com.applovin.impl.fi fiVarA;
        if (feVar != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("MediationService", "Loading " + feVar + "...");
            }
            this.f1032a.D().a(com.applovin.impl.ka.E, feVar);
            this.f1032a.q().b(feVar, "WILL_LOAD");
            final com.applovin.impl.mediation.g gVarA = this.f1032a.L().a(feVar);
            if (gVarA != null) {
                final com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImplA = com.applovin.impl.mediation.MaxAdapterParametersImpl.a(feVar);
                if (feVar.b0()) {
                    fiVarA = this.f1032a.K().a(feVar, activity);
                } else {
                    if (feVar.c0()) {
                        this.f1032a.K().b(feVar, activity);
                    }
                    fiVarA = null;
                }
                com.applovin.impl.fi fiVar = fiVarA;
                final com.applovin.impl.fe feVarA = feVar.a(gVarA);
                gVarA.a(str, feVarA);
                feVarA.e0();
                if (fiVar != null) {
                    java.util.concurrent.Executor executor = com.applovin.impl.fi.i;
                    fiVar.a(executor, new com.applovin.impl.fi.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda1
                        @Override // com.applovin.impl.fi.a
                        public final void a(java.lang.Object obj) {
                            this.f$0.a(feVar, interfaceC0040a, (java.lang.String) obj);
                        }
                    });
                    fiVar.a(executor, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(gVarA, str, maxAdapterParametersImplA, feVarA, activity, interfaceC0040a);
                        }
                    });
                    return;
                }
                gVarA.a(str, maxAdapterParametersImplA, feVarA, activity, new com.applovin.impl.mediation.MediationServiceImpl.d(feVarA, interfaceC0040a));
                return;
            }
            java.lang.String str2 = "Failed to load " + feVar + ": adapter not loaded";
            com.applovin.impl.sdk.n.h("MediationService", str2);
            b(feVar, new com.applovin.impl.mediation.MaxErrorImpl(-5001, str2), interfaceC0040a);
            return;
        }
        throw new java.lang.IllegalArgumentException("No mediated ad specified");
    }

    public void collectSignal(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.zj zjVar, android.content.Context context, com.applovin.impl.yj.a aVar) {
        if (zjVar == null) {
            throw new java.lang.IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("No context specified");
        }
        if (aVar != null) {
            com.applovin.impl.yj yjVarB = this.c.b(zjVar, str, maxAdFormat);
            if (yjVarB != null) {
                aVar.a(com.applovin.impl.yj.a(yjVarB));
                return;
            }
            com.applovin.impl.mediation.g gVarA = this.f1032a.L().a(zjVar, zjVar.A());
            if (gVarA != null) {
                if (((java.lang.Boolean) this.f1032a.a(com.applovin.impl.ue.J7)).booleanValue()) {
                    a(str, maxAdFormat, zjVar, context, aVar, gVarA);
                    return;
                }
                android.app.Activity activityM0 = context instanceof android.app.Activity ? (android.app.Activity) context : this.f1032a.m0();
                com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImplA = com.applovin.impl.mediation.MaxAdapterParametersImpl.a(zjVar, str, maxAdFormat);
                if (zjVar.z()) {
                    this.f1032a.K().b(zjVar, activityM0);
                }
                com.applovin.impl.mediation.MediationServiceImpl.a aVar2 = new com.applovin.impl.mediation.MediationServiceImpl.a(gVarA, str, android.os.SystemClock.elapsedRealtime(), zjVar, maxAdFormat, aVar);
                if (zjVar.v()) {
                    if (this.f1032a.K().b(zjVar)) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.a("MediationService", "Collecting signal for now-initialized adapter: " + gVarA.g());
                        }
                        gVarA.a(maxAdapterParametersImplA, zjVar, activityM0, aVar2);
                        return;
                    } else {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.b.b("MediationService", "Skip collecting signal for not-initialized adapter: " + gVarA.g());
                        }
                        aVar.a(com.applovin.impl.yj.a(zjVar, new com.applovin.impl.mediation.MaxErrorImpl("Adapter not initialized yet")));
                        return;
                    }
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("MediationService", "Collecting signal for adapter: " + gVarA.g());
                }
                gVarA.a(maxAdapterParametersImplA, zjVar, activityM0, aVar2);
                return;
            }
            aVar.a(com.applovin.impl.yj.a(zjVar, new com.applovin.impl.mediation.MaxErrorImpl("Could not load adapter")));
            return;
        }
        throw new java.lang.IllegalArgumentException("No callback specified");
    }

    class a implements com.applovin.impl.mediation.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.mediation.g f1033a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ long c;
        final /* synthetic */ com.applovin.impl.zj d;
        final /* synthetic */ com.applovin.mediation.MaxAdFormat e;
        final /* synthetic */ com.applovin.impl.yj.a f;

        @Override // com.applovin.impl.mediation.g.c
        public void a(com.applovin.mediation.MaxError maxError) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.MediationServiceImpl.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.MediationServiceImpl.this.b.b("MediationService", "Signal collection failed from: " + this.f1033a.g() + " for Ad Unit ID: " + this.b + " with error message: \"" + maxError.getMessage() + "\"");
            }
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = this.c;
            com.applovin.impl.yj yjVarA = com.applovin.impl.yj.a(this.d, this.f1033a, maxError, j, jElapsedRealtime - j);
            com.applovin.impl.mediation.MediationServiceImpl.this.a(yjVarA, this.d, this.f1033a);
            this.f.a(yjVarA);
            this.f1033a.a();
        }

        @Override // com.applovin.impl.mediation.g.c
        public void onSignalCollected(java.lang.String str) {
            com.applovin.impl.sdk.n unused = com.applovin.impl.mediation.MediationServiceImpl.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mediation.MediationServiceImpl.this.b.a("MediationService", "Signal collection successful from: " + this.f1033a.g() + " for Ad Unit ID: " + this.b + " with signal: \"" + str + "\"");
            }
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = this.c;
            long j2 = jElapsedRealtime - j;
            com.applovin.impl.yj yjVarA = com.applovin.impl.yj.a(this.d, this.f1033a, str, j, j2);
            com.applovin.impl.mediation.MediationServiceImpl.this.c.a(yjVarA, this.d, this.b, this.e);
            java.util.HashMap map = new java.util.HashMap();
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("network_name", this.d.c(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_class", this.d.b(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_version", this.f1033a.b(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("duration_ms", java.lang.String.valueOf(j2), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, java.lang.String.valueOf(this.e.getLabel()), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", this.b, map);
            com.applovin.impl.mediation.MediationServiceImpl.this.f1032a.D().a(com.applovin.impl.ka.z, (java.util.Map) map);
            this.f.a(yjVarA);
            this.f1033a.a();
        }

        a(com.applovin.impl.mediation.g gVar, java.lang.String str, long j, com.applovin.impl.zj zjVar, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.yj.a aVar) {
            this.f1033a = gVar;
            this.b = str;
            this.c = j;
            this.d = zjVar;
            this.e = maxAdFormat;
            this.f = aVar;
        }
    }

    public void showFullscreenAd(final com.applovin.impl.he heVar, final android.view.ViewGroup viewGroup, final androidx.lifecycle.Lifecycle lifecycle, final android.app.Activity activity, final com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (heVar == null) {
            throw new java.lang.IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f1032a.B().a(true);
            final com.applovin.impl.mediation.g gVarB = b(heVar);
            long jN0 = heVar.n0();
            if (com.applovin.impl.sdk.n.a()) {
                this.b.d("MediationService", "Showing ad " + heVar.getAdUnitId() + " with delay of " + jN0 + "ms...");
            }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(heVar, gVarB, viewGroup, lifecycle, activity, interfaceC0040a);
                }
            }, jN0);
            return;
        }
        throw new java.lang.IllegalArgumentException("No activity specified");
    }

    class b implements com.applovin.impl.mediation.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.fi f1034a;

        @Override // com.applovin.impl.mediation.g.c
        public void a(com.applovin.mediation.MaxError maxError) {
            this.f1034a.a(maxError);
        }

        @Override // com.applovin.impl.mediation.g.c
        public void onSignalCollected(java.lang.String str) {
            this.f1034a.b(str);
        }

        b(com.applovin.impl.fi fiVar) {
            this.f1034a = fiVar;
        }
    }

    public void processAdapterInitializationPostback(com.applovin.impl.oe oeVar, long j, com.applovin.mediation.adapter.MaxAdapter.InitializationStatus initializationStatus, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap(2);
        map.put("{INIT_STATUS}", java.lang.String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", java.lang.String.valueOf(j));
        a("minit", map, new com.applovin.impl.mediation.MaxErrorImpl(str), oeVar);
        java.util.Map mapA = com.applovin.impl.la.a(oeVar);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_init_status", java.lang.String.valueOf(initializationStatus.getCode()), mapA);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", str, mapA);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("duration_ms", java.lang.String.valueOf(j), mapA);
        switch (com.applovin.impl.mediation.MediationServiceImpl.c.f1035a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f1032a.D().a(com.applovin.impl.ka.x, mapA);
                break;
            case 4:
                this.f1032a.D().a(com.applovin.impl.ka.y, mapA);
                break;
            case 5:
            case 6:
                this.f1032a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1032a.I().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f1032a.D().a(com.applovin.impl.ka.d, "adapterNotInitializedForPostback", mapA);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.fe feVar, com.applovin.mediation.MaxError maxError, com.applovin.mediation.MaxAdListener maxAdListener) {
        a(maxError, feVar);
        destroyAd(feVar);
        com.applovin.impl.fc.a(maxAdListener, feVar.getAdUnitId(), maxError);
    }

    private void a(final java.lang.String str, final com.applovin.mediation.MaxAdFormat maxAdFormat, final com.applovin.impl.zj zjVar, android.content.Context context, final com.applovin.impl.yj.a aVar, final com.applovin.impl.mediation.g gVar) {
        final com.applovin.impl.fi fiVar = new com.applovin.impl.fi("SignalCollection:" + zjVar.c());
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.concurrent.Executor executor = com.applovin.impl.fi.i;
        fiVar.a(executor, new com.applovin.impl.fi.b() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda4
            @Override // com.applovin.impl.fi.b
            public final void a(boolean z, java.lang.Object obj, java.lang.Object obj2) {
                this.f$0.a(jElapsedRealtime, gVar, str, zjVar, maxAdFormat, aVar, z, (java.lang.String) obj, (com.applovin.mediation.MaxError) obj2);
            }
        });
        com.applovin.impl.an.a(zjVar.m(), fiVar, new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + zjVar.c() + ") timed out collecting signal"), "MediationService", this.f1032a);
        final com.applovin.impl.mediation.g.c bVar = new com.applovin.impl.mediation.MediationServiceImpl.b(fiVar);
        final android.app.Activity activityM0 = context instanceof android.app.Activity ? (android.app.Activity) context : this.f1032a.m0();
        final com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImplA = com.applovin.impl.mediation.MaxAdapterParametersImpl.a(zjVar, str, maxAdFormat);
        if (zjVar.v()) {
            com.applovin.impl.fi fiVarA = this.f1032a.K().a(zjVar, activityM0);
            fiVarA.a(executor, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(fiVar, gVar, maxAdapterParametersImplA, zjVar, activityM0, bVar);
                }
            });
            fiVarA.a(executor, new com.applovin.impl.fi.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda6
                @Override // com.applovin.impl.fi.a
                public final void a(java.lang.Object obj) {
                    this.f$0.a(gVar, fiVar, (java.lang.String) obj);
                }
            });
            return;
        }
        if (zjVar.w()) {
            com.applovin.impl.fi fiVarA2 = this.f1032a.K().a(zjVar, activityM0);
            if (fiVarA2.d() && !zjVar.y()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + gVar.g());
                }
                fiVar.a(new com.applovin.impl.mediation.MaxErrorImpl("Could not initialize adapter: " + ((java.lang.String) fiVarA2.a())));
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("MediationService", "Collecting signal for adapter: " + gVar.g());
        }
        gVar.a(maxAdapterParametersImplA, zjVar, activityM0, bVar);
    }

    public void processRawAdImpression(com.applovin.impl.fe feVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f1032a.q().b(feVar, "WILL_DISPLAY");
        if (feVar.P().endsWith("mimp")) {
            this.f1032a.q().b(feVar);
            com.applovin.impl.fc.a((com.applovin.mediation.MaxAdRevenueListener) interfaceC0040a, (com.applovin.mediation.MaxAd) feVar);
        }
        if (((java.lang.Boolean) this.f1032a.a(com.applovin.impl.sj.C4)).booleanValue()) {
            this.f1032a.Q().a(com.applovin.impl.ve.d, com.applovin.impl.we.a(feVar), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f1032a.H()));
        }
        java.util.HashMap map = new java.util.HashMap(2);
        if (feVar instanceof com.applovin.impl.he) {
            map.put("{TIME_TO_SHOW_MS}", java.lang.String.valueOf(((com.applovin.impl.he) feVar).l0()));
        }
        java.lang.String strEmptyIfNull = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(this.f1032a.o0().c());
        if (!((java.lang.Boolean) this.f1032a.a(com.applovin.impl.sj.I3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, feVar);
    }

    public void processViewabilityAdImpressionPostback(com.applovin.impl.me meVar, long j, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (meVar.P().endsWith("vimp")) {
            this.f1032a.q().b(meVar);
            com.applovin.impl.fc.a((com.applovin.mediation.MaxAdRevenueListener) interfaceC0040a, (com.applovin.mediation.MaxAd) meVar);
        }
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", java.lang.String.valueOf(j));
        map.put("{USED_VIEWABILITY_TIMER}", java.lang.String.valueOf(meVar.m0()));
        java.lang.String strEmptyIfNull = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(this.f1032a.o0().c());
        if (!((java.lang.Boolean) this.f1032a.a(com.applovin.impl.sj.I3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, meVar);
    }

    public void processCallbackAdImpressionPostback(com.applovin.impl.fe feVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        if (feVar.P().endsWith("cimp")) {
            this.f1032a.q().b(feVar);
            com.applovin.impl.fc.a((com.applovin.mediation.MaxAdRevenueListener) interfaceC0040a, (com.applovin.mediation.MaxAd) feVar);
        }
        java.util.HashMap map = new java.util.HashMap(1);
        java.lang.String strEmptyIfNull = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(this.f1032a.o0().c());
        if (!((java.lang.Boolean) this.f1032a.a(com.applovin.impl.sj.I3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, feVar);
        this.f1032a.D().a(com.applovin.impl.ka.I, feVar);
    }

    public void processAdDisplayErrorPostbackForUserError(com.applovin.mediation.MaxError maxError, com.applovin.impl.fe feVar) {
        a(maxError, feVar, false);
    }

    private com.applovin.impl.mediation.g b(com.applovin.impl.he heVar) {
        com.applovin.impl.mediation.g gVarA = heVar.A();
        if (gVarA != null) {
            return gVarA;
        }
        this.f1032a.B().a(false);
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("MediationService", "Failed to show " + heVar + ": adapter not found");
        }
        com.applovin.impl.sdk.n.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + heVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new java.lang.IllegalStateException("Could not find adapter for provided ad");
    }

    private void a(com.applovin.impl.he heVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f1032a.B().a(false);
        a(heVar, (com.applovin.mediation.MaxAdListener) interfaceC0040a);
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(heVar, interfaceC0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, com.applovin.impl.mediation.g gVar, java.lang.String str, com.applovin.impl.zj zjVar, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.yj.a aVar, boolean z, java.lang.String str2, com.applovin.mediation.MaxError maxError) {
        com.applovin.impl.yj yjVarA;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        if (z) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("MediationService", "Signal collection successful from: " + gVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
            }
            yjVarA = com.applovin.impl.yj.a(zjVar, gVar, str2, j, jElapsedRealtime);
            this.c.a(yjVarA, zjVar, str, maxAdFormat);
            java.util.HashMap map = new java.util.HashMap();
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("network_name", zjVar.c(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_class", zjVar.b(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_version", gVar.b(), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("duration_ms", java.lang.String.valueOf(jElapsedRealtime), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, java.lang.String.valueOf(maxAdFormat.getLabel()), map);
            com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            this.f1032a.D().a(com.applovin.impl.ka.z, (java.util.Map) map);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("MediationService", "Signal collection failed from: " + gVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            yjVarA = com.applovin.impl.yj.a(zjVar, gVar, maxError, j, jElapsedRealtime);
            a(yjVarA, zjVar, gVar);
        }
        aVar.a(yjVarA);
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.fi fiVar, com.applovin.impl.mediation.g gVar, com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImpl, com.applovin.impl.zj zjVar, android.app.Activity activity, com.applovin.impl.mediation.g.c cVar) {
        if (fiVar.c()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("MediationService", "Collecting signal for now-initialized adapter: " + gVar.g());
        }
        gVar.a(maxAdapterParametersImpl, zjVar, activity, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.mediation.g gVar, java.lang.String str, com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImpl, com.applovin.impl.fe feVar, android.app.Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        gVar.a(str, maxAdapterParametersImpl, feVar, activity, new com.applovin.impl.mediation.MediationServiceImpl.d(feVar, interfaceC0040a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.he heVar, java.lang.Long l, com.applovin.mediation.MaxAdListener maxAdListener) {
        if (heVar.u().get()) {
            return;
        }
        java.lang.String str = "Ad (" + heVar.k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        com.applovin.impl.sdk.n.h("MediationService", str);
        a(heVar, new com.applovin.impl.mediation.MaxErrorImpl(-1, str), maxAdListener);
        this.f1032a.B().b(heVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.he heVar, com.applovin.impl.mediation.g gVar, android.app.Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        heVar.a(true);
        a(heVar);
        gVar.c(heVar, activity);
        a(heVar, interfaceC0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.he heVar, com.applovin.impl.mediation.g gVar, android.view.ViewGroup viewGroup, androidx.lifecycle.Lifecycle lifecycle, android.app.Activity activity, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        heVar.a(true);
        a(heVar);
        gVar.a(heVar, viewGroup, lifecycle, activity);
        a(heVar, interfaceC0040a);
    }

    private void a(final com.applovin.impl.he heVar, final com.applovin.mediation.MaxAdListener maxAdListener) {
        final java.lang.Long l = (java.lang.Long) this.f1032a.a(com.applovin.impl.ue.j7);
        if (l.longValue() <= 0) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(heVar, l, maxAdListener);
            }
        }, l.longValue());
    }

    private void a(com.applovin.impl.he heVar) {
        if (heVar.getFormat() == com.applovin.mediation.MaxAdFormat.REWARDED || heVar.getFormat() == com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f1032a.i0().a((com.applovin.impl.yl) new com.applovin.impl.ln(heVar, this.f1032a), com.applovin.impl.tm.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.fe feVar, com.applovin.mediation.MaxError maxError, com.applovin.mediation.MaxAdListener maxAdListener) {
        this.f1032a.k().a(feVar, com.applovin.impl.sdk.g.c.SHOW_ERROR);
        this.f1032a.q().b(feVar, "DID_FAIL_DISPLAY");
        a(maxError, feVar, true);
        if (feVar.u().compareAndSet(false, true)) {
            com.applovin.impl.fc.a(maxAdListener, feVar, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.fe feVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a) {
        this.f1032a.q().b(feVar, "DID_CLICKED");
        this.f1032a.q().b(feVar, "DID_CLICK");
        if (feVar.P().endsWith(com.json.z8.CLICK)) {
            this.f1032a.q().b(feVar);
            com.applovin.impl.fc.a((com.applovin.mediation.MaxAdRevenueListener) interfaceC0040a, (com.applovin.mediation.MaxAd) feVar);
        }
        java.util.HashMap map = new java.util.HashMap(1);
        java.lang.String strEmptyIfNull = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(this.f1032a.o0().c());
        if (!((java.lang.Boolean) this.f1032a.a(com.applovin.impl.sj.I3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, feVar);
    }

    private void a(com.applovin.mediation.MaxError maxError, com.applovin.impl.fe feVar, boolean z) {
        a("mierr", java.util.Collections.EMPTY_MAP, maxError, feVar, z);
        if (!z || feVar == null) {
            return;
        }
        this.f1032a.D().a(com.applovin.impl.ka.J, feVar, maxError);
    }

    private void a(com.applovin.mediation.MaxError maxError, com.applovin.impl.fe feVar) {
        java.util.HashMap map = new java.util.HashMap(3);
        long jG = feVar.G();
        map.put("{LOAD_TIME_MS}", java.lang.String.valueOf(jG));
        if (feVar.getFormat().isFullscreenAd()) {
            com.applovin.impl.sdk.m.a aVarB = this.f1032a.B().b(feVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", java.lang.String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", java.lang.String.valueOf(aVarB.b()));
        }
        a("mlerr", map, maxError, feVar);
        java.util.Map mapA = com.applovin.impl.la.a(feVar);
        mapA.putAll(com.applovin.impl.la.a(maxError));
        mapA.put("duration_ms", java.lang.String.valueOf(jG));
        this.f1032a.D().a(com.applovin.impl.ka.G, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.fe feVar) {
        this.f1032a.q().b(feVar, "DID_LOAD");
        if (feVar.P().endsWith("load")) {
            this.f1032a.q().b(feVar);
        }
        java.util.HashMap map = new java.util.HashMap(3);
        long jG = feVar.G();
        map.put("{LOAD_TIME_MS}", java.lang.String.valueOf(jG));
        if (feVar.getFormat().isFullscreenAd()) {
            com.applovin.impl.sdk.m.a aVarB = this.f1032a.B().b(feVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", java.lang.String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", java.lang.String.valueOf(aVarB.b()));
        }
        a("load", map, feVar);
        java.util.Map mapA = com.applovin.impl.la.a(feVar);
        mapA.put("duration_ms", java.lang.String.valueOf(jG));
        this.f1032a.D().a(com.applovin.impl.ka.F, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.yj yjVar, com.applovin.impl.zj zjVar, com.applovin.impl.mediation.g gVar) {
        long jB = yjVar.b();
        java.util.HashMap map = new java.util.HashMap(3);
        map.put("{LOAD_TIME_MS}", java.lang.String.valueOf(jB));
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.b(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.i(), map);
        a("serr", map, yjVar.c(), zjVar);
        java.util.HashMap map2 = new java.util.HashMap();
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("network_name", zjVar.c(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_class", zjVar.b(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("adapter_version", gVar.b(), map2);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("duration_ms", java.lang.String.valueOf(jB), map2);
        this.f1032a.D().a(com.applovin.impl.ka.A, (java.util.Map) map2);
    }

    private void a(java.lang.String str, java.util.List list, java.util.Map map, java.util.Map map2, com.applovin.mediation.MaxError maxError, com.applovin.impl.oe oeVar, boolean z) {
        this.f1032a.i0().a((com.applovin.impl.yl) new com.applovin.impl.rm(str, list, map, map2, maxError, oeVar, this.f1032a, z), com.applovin.impl.tm.b.OTHER);
    }

    private void a(java.lang.String str, java.util.Map map, com.applovin.impl.oe oeVar) {
        a(str, map, (com.applovin.mediation.MaxError) null, oeVar);
    }

    private void a(java.lang.String str, java.util.Map map, com.applovin.mediation.MaxError maxError, com.applovin.impl.oe oeVar) {
        a(str, map, maxError, oeVar, true);
    }

    private void a(java.lang.String str, java.util.Map map, com.applovin.mediation.MaxError maxError, com.applovin.impl.oe oeVar, boolean z) {
        java.util.Map map2 = com.applovin.impl.sdk.utils.CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z ? com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(oeVar.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z ? com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(oeVar.e()) : "");
        if (oeVar instanceof com.applovin.impl.fe) {
            map2.put("{CREATIVE_ID}", z ? com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(((com.applovin.impl.fe) oeVar).getCreativeId()) : "");
        }
        a(str, null, map2, null, maxError, oeVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.fe feVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, java.lang.String str) {
        java.lang.String str2 = "Failed to load " + feVar + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("MediationService", str2);
        }
        b(feVar, new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.mediation.g gVar, com.applovin.impl.fi fiVar, java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + gVar.g());
        }
        fiVar.a(new com.applovin.impl.mediation.MaxErrorImpl(com.applovin.mediation.adapter.MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }
}

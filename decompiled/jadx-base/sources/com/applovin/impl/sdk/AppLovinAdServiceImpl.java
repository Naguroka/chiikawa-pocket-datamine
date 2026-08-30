package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdServiceImpl implements com.applovin.sdk.AppLovinAdService, com.applovin.impl.sdk.a.InterfaceC0051a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1257a;
    private final com.applovin.impl.sdk.n b;
    private final java.util.Map c;
    private final java.lang.Object d = new java.lang.Object();
    private final java.util.Map e = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();

    class b implements com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f1259a;
        final /* synthetic */ com.applovin.impl.sdk.ad.b b;
        final /* synthetic */ com.applovin.adview.AppLovinAdView c;
        final /* synthetic */ android.net.Uri d;

        b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, com.applovin.adview.AppLovinAdView appLovinAdView, android.net.Uri uri) {
            this.f1259a = aVar;
            this.b = bVar;
            this.c = appLovinAdView;
            this.d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            if (this.f1259a != null) {
                com.applovin.impl.sdk.AppLovinAdServiceImpl.this.f1257a.e0().resumeForClick();
                com.applovin.impl.fc.a(this.f1259a.e(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            com.applovin.impl.sdk.AppLovinAdServiceImpl.this.f1257a.e0().pauseForClick();
            com.applovin.impl.adview.a aVar = this.f1259a;
            if (aVar != null) {
                aVar.x();
                com.applovin.impl.fc.c(this.f1259a.e(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            com.applovin.impl.sdk.n unused = com.applovin.impl.sdk.AppLovinAdServiceImpl.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            com.applovin.impl.sdk.AppLovinAdServiceImpl.this.a(this.b, this.c, this.f1259a, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements com.applovin.impl.qb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.AppLovinAdServiceImpl.d f1260a;

        /* synthetic */ c(com.applovin.impl.sdk.AppLovinAdServiceImpl appLovinAdServiceImpl, com.applovin.impl.sdk.AppLovinAdServiceImpl.d dVar, com.applovin.impl.sdk.AppLovinAdServiceImpl.a aVar) {
            this(dVar);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAd;
                com.applovin.impl.sdk.AppLovinAdServiceImpl.this.f1257a.h().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    com.applovin.impl.sdk.AppLovinAdServiceImpl.this.f1257a.f().a(appLovinAdImpl, com.applovin.impl.sdk.AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), com.applovin.impl.sdk.AppLovinAdServiceImpl.this.f1257a);
            }
            java.util.Collection collectionEmptySet = java.util.Collections.emptySet();
            synchronized (this.f1260a.f1261a) {
                if (!this.f1260a.c) {
                    collectionEmptySet = new java.util.HashSet(this.f1260a.d);
                    this.f1260a.d.clear();
                }
                com.applovin.impl.sdk.AppLovinAdServiceImpl.d dVar = this.f1260a;
                dVar.b = false;
                dVar.c = false;
            }
            java.util.Iterator it = collectionEmptySet.iterator();
            while (it.hasNext()) {
                com.applovin.impl.sdk.AppLovinAdServiceImpl.this.a(appLovinAd, (com.applovin.sdk.AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(i, ""));
        }

        @Override // com.applovin.impl.qb
        public void failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError appLovinError) {
            java.util.Collection collectionEmptySet = java.util.Collections.emptySet();
            synchronized (this.f1260a.f1261a) {
                if (!this.f1260a.c) {
                    collectionEmptySet = new java.util.HashSet(this.f1260a.d);
                    this.f1260a.d.clear();
                }
                com.applovin.impl.sdk.AppLovinAdServiceImpl.d dVar = this.f1260a;
                dVar.b = false;
                dVar.c = false;
            }
            java.util.Iterator it = collectionEmptySet.iterator();
            while (it.hasNext()) {
                com.applovin.impl.sdk.AppLovinAdServiceImpl.this.b(appLovinError, (com.applovin.sdk.AppLovinAdLoadListener) it.next());
            }
        }

        private c(com.applovin.impl.sdk.AppLovinAdServiceImpl.d dVar) {
            this.f1260a = dVar;
        }
    }

    AppLovinAdServiceImpl(com.applovin.impl.sdk.j jVar) {
        this.f1257a = jVar;
        this.b = jVar.I();
        java.util.HashMap map = new java.util.HashMap(6);
        this.c = map;
        com.applovin.impl.sdk.AppLovinAdServiceImpl.a aVar = null;
        map.put(com.applovin.impl.h0.c(), new com.applovin.impl.sdk.AppLovinAdServiceImpl.d(aVar));
        map.put(com.applovin.impl.h0.k(), new com.applovin.impl.sdk.AppLovinAdServiceImpl.d(aVar));
        map.put(com.applovin.impl.h0.j(), new com.applovin.impl.sdk.AppLovinAdServiceImpl.d(aVar));
        map.put(com.applovin.impl.h0.m(), new com.applovin.impl.sdk.AppLovinAdServiceImpl.d(aVar));
        map.put(com.applovin.impl.h0.b(), new com.applovin.impl.sdk.AppLovinAdServiceImpl.d(aVar));
        map.put(com.applovin.impl.h0.h(), new com.applovin.impl.sdk.AppLovinAdServiceImpl.d(aVar));
    }

    private void c(com.applovin.impl.sdk.AppLovinError appLovinError, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof com.applovin.impl.qb) {
            ((com.applovin.impl.qb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(java.util.Map<java.lang.String, java.lang.String> map) {
        this.e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(com.applovin.sdk.AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f1257a.x().a(appLovinBidTokenCollectionListener);
    }

    public org.json.JSONObject getAndResetCustomPostBody() {
        return (org.json.JSONObject) this.f.getAndSet(null);
    }

    public java.util.Map<java.lang.String, java.lang.String> getAndResetCustomQueryParams() {
        java.util.Map<java.lang.String, java.lang.String> map;
        synchronized (this.e) {
            map = com.applovin.impl.sdk.utils.CollectionUtils.map(this.e);
            this.e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public java.lang.String getBidToken() {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "getBidToken()");
        }
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.String strD = this.f1257a.x().D();
        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strD) && com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strD;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(com.applovin.sdk.AppLovinAdSize appLovinAdSize, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.h0.a(appLovinAdSize, com.applovin.sdk.AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(java.lang.String str, final com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        java.lang.String strTrim = str != null ? str.trim() : null;
        if (android.text.TextUtils.isEmpty(strTrim)) {
            com.applovin.impl.sdk.n.h("AppLovinAdService", "Empty ad token");
            c(new com.applovin.impl.sdk.AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.w wVar = new com.applovin.impl.w(strTrim, this.f1257a);
        if (wVar.c() == com.applovin.impl.w.a.REGULAR) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Loading next ad for token: " + wVar);
            }
            a(new com.applovin.impl.qm(wVar, appLovinAdLoadListener, this.f1257a));
            return;
        }
        if (wVar.c() != com.applovin.impl.w.a.AD_RESPONSE_JSON) {
            com.applovin.impl.sdk.AppLovinError appLovinError = new com.applovin.impl.sdk.AppLovinError(-8, "Invalid token type");
            com.applovin.impl.sdk.n.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        final org.json.JSONObject jSONObjectA = wVar.a();
        if (jSONObjectA == null) {
            java.lang.String str2 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            com.applovin.impl.sdk.AppLovinError appLovinError2 = new com.applovin.impl.sdk.AppLovinError(-8, str2);
            com.applovin.impl.sdk.n.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.e4.c(jSONObjectA, this.f1257a);
        com.applovin.impl.e4.b(jSONObjectA, this.f1257a);
        com.applovin.impl.e4.a(jSONObjectA, this.f1257a);
        com.applovin.impl.u0.b(this.f1257a);
        if (com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObjectA, "ads", new org.json.JSONArray()).length() <= 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "No ad returned from the server for token: " + wVar);
            }
            c(com.applovin.impl.sdk.AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Rendering ad for token: " + wVar);
        }
        final com.applovin.impl.h0 h0VarA = com.applovin.impl.yp.a(jSONObjectA, this.f1257a);
        com.applovin.mediation.MaxAdFormat maxAdFormatD = h0VarA.d();
        if (((java.lang.Boolean) this.f1257a.a(com.applovin.impl.sj.Y0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f1257a.g().a(h0VarA, new com.applovin.impl.sdk.d.a() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda5
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f$0.a(appLovinAdLoadListener, jSONObjectA, h0VarA, bVar);
                }
            });
        } else {
            a(new com.applovin.impl.um(jSONObjectA, h0VarA, appLovinAdLoadListener, this.f1257a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(java.lang.String str, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("No zone id specified");
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.h0.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(java.lang.String str, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.h0.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        java.lang.Long l;
        if (((java.lang.Boolean) this.f1257a.a(com.applovin.impl.sj.g2)).booleanValue() && (l = (java.lang.Long) this.f1257a.b(com.applovin.impl.uj.M)) != null && java.lang.System.currentTimeMillis() - l.longValue() <= ((java.lang.Long) this.f1257a.a(com.applovin.impl.sj.k2)).longValue()) {
            if (((java.lang.Boolean) this.f1257a.a(com.applovin.impl.sj.j2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(java.util.List<com.applovin.impl.s> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.applovin.impl.s> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void setCustomPostBody(org.json.JSONObject jSONObject) {
        this.f.set(jSONObject);
    }

    public java.lang.String toString() {
        return "AppLovinAdService{adLoadStates=" + this.c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, android.net.Uri uri, android.view.MotionEvent motionEvent, boolean z, android.os.Bundle bundle) {
        if (bVar == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !java.lang.Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            boolean z2 = bundle != null && java.lang.Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z, z2));
            if (this.f1257a.Y() != null) {
                this.f1257a.Y().b(bVar.d(motionEvent, false, z2), motionEvent);
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
        }
        if (appLovinAdView == null || uri == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (bVar.isDirectDownloadEnabled()) {
            this.f1257a.n().startDirectInstallOrDownloadProcess(bVar, bundle, new com.applovin.impl.sdk.AppLovinAdServiceImpl.b(aVar, bVar, appLovinAdView, uri));
        } else {
            a(bVar, appLovinAdView, aVar, uri);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.t());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.u());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.v());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j, java.util.List<java.lang.Long> list, long j2, boolean z, int i) {
        if (bVar == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking ad closed...");
        }
        java.util.List<com.applovin.impl.s> listD = bVar.d();
        if (listD == null || listD.isEmpty()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.s sVar : listD) {
            java.lang.String strA = a(sVar.c(), j, j2, list, z, i);
            java.lang.String strA2 = a(sVar.a(), j, j2, list, z, i);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                a(new com.applovin.impl.s(strA, strA2));
            } else if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.F());
            if (this.f1257a.Y() != null) {
                this.f1257a.Y().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j, int i, boolean z) {
        if (bVar == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        java.util.List<com.applovin.impl.s> listP0 = bVar.p0();
        if (listP0 == null || listP0.isEmpty()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        java.lang.String string = java.lang.Long.toString(java.lang.System.currentTimeMillis());
        for (com.applovin.impl.s sVar : listP0) {
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(sVar.c())) {
                java.lang.String strA = a(sVar.c(), j, i, string, z);
                java.lang.String strA2 = a(sVar.a(), j, i, string, z);
                if (strA != null) {
                    a(new com.applovin.impl.s(strA, strA2));
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                this.b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final com.applovin.impl.sdk.AppLovinError appLovinError, final com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(true, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    public void loadNextAd(java.lang.String str, com.applovin.sdk.AppLovinAdSize appLovinAdSize, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.h0.a(appLovinAdSize, com.applovin.sdk.AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private android.net.Uri b(android.net.Uri uri, java.lang.String str) {
        try {
            return android.net.Uri.parse(uri.getQueryParameter(str));
        } catch (java.lang.Throwable th) {
            this.f1257a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1257a.I().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f1257a.D().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.Object f1261a;
        boolean b;
        boolean c;
        final java.util.Collection d;

        private d() {
            this.f1261a = new java.lang.Object();
            this.d = new java.util.HashSet();
        }

        public java.lang.String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.b + ", isReloadingExpiredAd=" + this.c + ", pendingAdListeners=" + this.d + '}';
        }

        /* synthetic */ d(com.applovin.impl.sdk.AppLovinAdServiceImpl.a aVar) {
            this();
        }
    }

    private boolean b() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return true;
        }
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        android.app.ApplicationExitInfo applicationExitInfo = ((android.app.ActivityManager) contextM.getSystemService("activity")).getHistoricalProcessExitReasons(contextM.getPackageName(), 0, 1).get(0);
        return applicationExitInfo.getReason() == 10 || applicationExitInfo.getReason() == 11;
    }

    public com.applovin.sdk.AppLovinAd dequeueAd(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImplA = this.f1257a.h().a(h0Var);
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + h0Var + "...");
        }
        return appLovinAdImplA;
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, android.net.Uri uri, android.view.MotionEvent motionEvent, android.os.Bundle bundle, com.applovin.impl.o9 o9Var, android.content.Context context) {
        if (bVar == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && java.lang.Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
            }
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            boolean z = bundle != null && java.lang.Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z));
            if (this.f1257a.Y() != null) {
                this.f1257a.Y().b(bVar.d(motionEvent, true, z), motionEvent);
            }
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.f1257a.n().startDirectInstallOrDownloadProcess(bVar, bundle, new com.applovin.impl.sdk.AppLovinAdServiceImpl.a(bVar, uri, o9Var, context));
        } else {
            a(bVar, uri, o9Var, context);
        }
    }

    class a implements com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f1258a;
        final /* synthetic */ android.net.Uri b;
        final /* synthetic */ com.applovin.impl.o9 c;
        final /* synthetic */ android.content.Context d;

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            com.applovin.impl.sdk.AppLovinAdServiceImpl.this.f1257a.e0().resumeForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            com.applovin.impl.sdk.AppLovinAdServiceImpl.this.f1257a.e0().pauseForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            com.applovin.impl.sdk.n unused = com.applovin.impl.sdk.AppLovinAdServiceImpl.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            com.applovin.impl.sdk.AppLovinAdServiceImpl.this.a(this.f1258a, this.b, this.c, this.d);
        }

        a(com.applovin.impl.sdk.ad.b bVar, android.net.Uri uri, com.applovin.impl.o9 o9Var, android.content.Context context) {
            this.f1258a = bVar;
            this.b = uri;
            this.c = o9Var;
            this.d = context;
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0051a
    public void onAdExpired(com.applovin.impl.i8 i8Var) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImpl = (com.applovin.impl.sdk.ad.AppLovinAdImpl) i8Var;
        com.applovin.impl.h0 adZone = appLovinAdImpl.getAdZone();
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f1257a.h().b(appLovinAdImpl);
        if (this.f1257a.y0() || !((java.lang.Boolean) this.f1257a.a(com.applovin.impl.sj.e1)).booleanValue()) {
            return;
        }
        com.applovin.impl.sdk.AppLovinAdServiceImpl.d dVarA = a(adZone);
        synchronized (dVarA.f1261a) {
            if (!dVarA.b) {
                this.f1257a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1257a.I().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                }
                dVarA.b = true;
                dVarA.c = true;
                a(adZone, new com.applovin.impl.sdk.AppLovinAdServiceImpl.c(this, dVarA, null));
            } else if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
            }
        }
    }

    private void a(final com.applovin.impl.h0 h0Var, final com.applovin.impl.sdk.AppLovinAdServiceImpl.c cVar) {
        com.applovin.impl.sdk.ad.AppLovinAdImpl appLovinAdImplE = this.f1257a.h().e(h0Var);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + h0Var);
            }
            cVar.adReceived(appLovinAdImplE);
            return;
        }
        com.applovin.mediation.MaxAdFormat maxAdFormatD = h0Var.d();
        if (((java.lang.Boolean) this.f1257a.a(com.applovin.impl.sj.Y0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f1257a.g().a(h0Var, new com.applovin.impl.sdk.d.a() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f$0.a(cVar, h0Var, bVar);
                }
            });
        } else {
            a(new com.applovin.impl.om(h0Var, cVar, this.f1257a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.AppLovinAdServiceImpl.c cVar, com.applovin.impl.h0 h0Var, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.adReceived(bVar);
                }
            });
        } else {
            a(new com.applovin.impl.om(h0Var, cVar, this.f1257a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.o9 o9Var) {
        if (o9Var != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Dismissing ad after forwarding click");
            }
            o9Var.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, org.json.JSONObject jSONObject, com.applovin.impl.h0 h0Var, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    appLovinAdLoadListener.adReceived(bVar);
                }
            });
        } else {
            a(new com.applovin.impl.um(jSONObject, h0Var, appLovinAdLoadListener, this.f1257a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, android.net.Uri uri, com.applovin.impl.o9 o9Var, android.content.Context context) {
        if (a(uri.getScheme())) {
            a(uri, bVar, (com.applovin.impl.adview.a) null, o9Var);
        } else if (com.applovin.impl.tp.b(uri)) {
            a(uri, bVar, (com.applovin.adview.AppLovinAdView) null, (com.applovin.impl.adview.a) null, context, this.f1257a);
        } else {
            com.applovin.impl.tp.a(uri, context, this.f1257a);
        }
    }

    private void a(com.applovin.impl.h0 h0Var, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        if (h0Var == null) {
            throw new java.lang.IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f1257a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1257a.I().a("AppLovinAdService", "Loading next ad of zone {" + h0Var + "}...");
            }
            com.applovin.impl.sdk.AppLovinAdServiceImpl.d dVarA = a(h0Var);
            synchronized (dVarA.f1261a) {
                dVarA.d.add(appLovinAdLoadListener);
                if (!dVarA.b) {
                    dVarA.b = true;
                    a(h0Var, new com.applovin.impl.sdk.AppLovinAdServiceImpl.c(this, dVarA, null));
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("No callback specified");
    }

    private void a(com.applovin.impl.yl ylVar) {
        if (!this.f1257a.s0()) {
            com.applovin.impl.sdk.n.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f1257a.c();
        this.f1257a.i0().a(ylVar, com.applovin.impl.tm.b.CORE);
    }

    private void a(com.applovin.impl.s sVar) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(sVar.c())) {
            this.f1257a.W().e(com.applovin.impl.sdk.network.d.b().d(sVar.c()).a(com.applovin.impl.sdk.utils.StringUtils.isValidString(sVar.a()) ? sVar.a() : null).a(sVar.b()).a(false).b(sVar.d()).a());
        } else if (com.applovin.impl.sdk.n.a()) {
            this.b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private com.applovin.impl.sdk.AppLovinAdServiceImpl.d a(com.applovin.impl.h0 h0Var) {
        com.applovin.impl.sdk.AppLovinAdServiceImpl.d dVar;
        synchronized (this.d) {
            dVar = (com.applovin.impl.sdk.AppLovinAdServiceImpl.d) this.c.get(h0Var);
            if (dVar == null) {
                dVar = new com.applovin.impl.sdk.AppLovinAdServiceImpl.d(null);
                this.c.put(h0Var, dVar);
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.applovin.sdk.AppLovinAd appLovinAd, final com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(true, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.sdk.AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f1257a.D().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.AppLovinError appLovinError, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.f1257a.D().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof com.applovin.impl.qb ? "V2" : ""), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, android.net.Uri uri) {
        android.content.Context context;
        if (!((java.lang.Boolean) this.f1257a.a(com.applovin.impl.sj.B)).booleanValue() || (context = com.applovin.impl.zq.a(appLovinAdView, this.f1257a)) == null) {
            context = appLovinAdView.getContext();
        }
        android.content.Context context2 = context;
        if (a(uri.getScheme())) {
            a(uri, bVar, aVar, (com.applovin.impl.o9) null);
        } else if (com.applovin.impl.tp.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f1257a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private java.lang.String a(java.lang.String str, long j, int i, java.lang.String str2, boolean z) {
        try {
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return android.net.Uri.parse(str).buildUpon().appendQueryParameter("et_s", java.lang.Long.toString(j)).appendQueryParameter("pv", java.lang.Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", java.lang.Boolean.toString(z)).build().toString();
        } catch (java.lang.Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f1257a.D().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(android.net.Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, android.content.Context context) {
        if (com.applovin.impl.tp.a(uri, context, this.f1257a)) {
            com.applovin.impl.fc.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.x();
    }

    private boolean a(java.lang.String str) {
        java.lang.String str2 = this.f1257a.f0().getExtraParameters().get("forwarding_click_scheme");
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(str2) && com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(android.net.Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.adview.a aVar, final com.applovin.impl.o9 o9Var) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Forwarding click " + uri);
        }
        bVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        java.lang.String str = this.f1257a.f0().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && java.lang.Boolean.parseBoolean(str)) {
            if (o9Var != null) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(true, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(o9Var);
                    }
                });
            } else {
                if (aVar == null || com.applovin.impl.yp.a(bVar.getSize())) {
                    return;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AppLovinAdService", "Closing ad after forwarding click");
                }
                aVar.z();
            }
        }
    }

    private void a(android.net.Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, android.content.Context context, com.applovin.impl.sdk.j jVar) {
        if (uri != null && com.applovin.impl.sdk.utils.StringUtils.isValidString(uri.getQuery())) {
            android.net.Uri uriB = b(uri, "primaryUrl");
            java.util.List listA = a(uri, "primaryTrackingUrl");
            android.net.Uri uriB2 = b(uri, "fallbackUrl");
            java.util.List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, jVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, jVar);
            }
            if (aVar != null) {
                aVar.x();
                return;
            }
            return;
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(android.net.Uri uri, java.lang.String str, java.util.List list, com.applovin.impl.sdk.ad.b bVar, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, android.content.Context context, com.applovin.impl.sdk.j jVar) {
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zA = com.applovin.impl.tp.a(uri, context, jVar);
        if (zA) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jVar.X().dispatchPostbackAsync(((android.net.Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                com.applovin.impl.fc.b(aVar.e(), bVar, appLovinAdView);
            }
        } else {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zA;
    }

    private java.util.List a(android.net.Uri uri, java.lang.String str) {
        java.util.List<java.lang.String> queryParameters = uri.getQueryParameters(str);
        java.util.ArrayList arrayList = new java.util.ArrayList(queryParameters.size());
        java.util.Iterator<java.lang.String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(android.net.Uri.parse(it.next()));
            } catch (java.lang.Throwable th) {
                this.f1257a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1257a.I().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f1257a.D().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private java.lang.String a(java.lang.String str, long j, long j2, java.util.List list, boolean z, int i) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return null;
        }
        android.net.Uri.Builder builderAppendQueryParameter = android.net.Uri.parse(str).buildUpon().appendQueryParameter("et_ms", java.lang.Long.toString(j)).appendQueryParameter("vs_ms", java.lang.Long.toString(j2));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i != com.applovin.impl.sdk.h.i) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", java.lang.Boolean.toString(z));
            builderAppendQueryParameter.appendQueryParameter("musw_st", java.lang.Boolean.toString(com.applovin.impl.sdk.h.a(i)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        java.util.Map<java.lang.String, java.lang.String> mapTryToStringMap;
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        java.lang.String str = (java.lang.String) this.f1257a.b(com.applovin.impl.uj.P);
        if (android.text.TextUtils.isEmpty(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = com.applovin.impl.sdk.utils.JsonUtils.tryToStringMap(com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(str, new org.json.JSONObject()));
        }
        this.f1257a.D().a(com.applovin.impl.ka.N, (java.util.Map) mapTryToStringMap);
        java.lang.String str2 = (java.lang.String) this.f1257a.b(com.applovin.impl.uj.O);
        if (str2 != null) {
            org.json.JSONObject jSONObjectJsonObjectFromJsonString = com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(str2, null);
            java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            java.lang.Long l = (java.lang.Long) this.f1257a.b(com.applovin.impl.uj.N);
            if (l != null) {
                string = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(string, "imp_duration_ms", java.lang.String.valueOf(l));
                string2 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(string2, "imp_duration_ms", java.lang.String.valueOf(l));
            }
            a(new com.applovin.impl.s(string, string2));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }
}

package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinNativeAdImpl extends com.applovin.impl.sdk.AppLovinAdBase implements com.applovin.impl.sdk.nativeAd.AppLovinNativeAd, android.view.View.OnClickListener, com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener {
    private static final java.lang.String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final java.lang.String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final java.lang.String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final java.lang.String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final java.lang.String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final com.applovin.impl.og adEventTracker;
    private final java.lang.String advertiser;
    private final java.lang.String body;
    private final java.lang.String callToAction;
    private final android.net.Uri clickDestinationBackupUri;
    private final android.net.Uri clickDestinationUri;
    private final java.util.List<com.applovin.impl.sdk.network.e> clickTrackingRequests;
    private final java.util.List<java.lang.String> clickTrackingUrls;
    private com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener eventListener;
    private android.net.Uri iconUri;
    private final java.util.List<com.applovin.impl.sdk.network.e> impressionRequests;
    private final java.util.concurrent.atomic.AtomicBoolean impressionTracked;
    private final java.util.List<java.lang.String> jsTrackers;
    private float mainImageAspectRatio;
    private android.net.Uri mainImageUri;
    private com.applovin.impl.sdk.nativeAd.AppLovinMediaView mediaView;
    private android.view.ViewGroup nativeAdView;
    private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.b onAttachStateChangeHandler;
    private com.applovin.impl.sdk.nativeAd.AppLovinOptionsView optionsView;
    private android.net.Uri privacyDestinationUri;
    private android.net.Uri privacyIconUri;
    private final java.util.List<android.view.View> registeredViews;
    private final java.lang.Double starRating;
    private final java.lang.String tag;
    private final java.lang.String title;
    private final com.applovin.impl.aq vastAd;
    private android.view.View videoView;
    private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c viewableMRC100Callback;
    private com.applovin.impl.br viewableMRC100Tracker;
    private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c viewableMRC50Callback;
    private com.applovin.impl.br viewableMRC50Tracker;
    private com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c viewableVideoMRC50Callback;
    private com.applovin.impl.br viewableVideoMRC50Tracker;

    class a implements com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.net.Uri f1306a;
        final /* synthetic */ android.net.Uri b;
        final /* synthetic */ android.content.Context c;

        a(android.net.Uri uri, android.net.Uri uri2, android.content.Context context) {
            this.f1306a = uri;
            this.b = uri2;
            this.c = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.this.launchUri(this.f1306a, this.b, this.c);
        }
    }

    private static class b implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl f1307a;

        public b(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f1307a = appLovinNativeAdImpl;
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.b)) {
                return false;
            }
            com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.b bVar = (com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.b) obj;
            if (!bVar.a(this)) {
                return false;
            }
            com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImplA = a();
            com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImplA2 = bVar.a();
            return appLovinNativeAdImplA != null ? appLovinNativeAdImplA.equals(appLovinNativeAdImplA2) : appLovinNativeAdImplA2 == null;
        }

        public int hashCode() {
            com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImplA = a();
            return (appLovinNativeAdImplA == null ? 43 : appLovinNativeAdImplA.hashCode()) + 59;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            this.f1307a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }

        public java.lang.String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl a() {
            return this.f1307a;
        }
    }

    private class c implements com.applovin.impl.br.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f1308a;

        public c(java.util.List list) {
            this.f1308a = list;
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c)) {
                return false;
            }
            com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c cVar = (com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c) obj;
            if (!cVar.a(this)) {
                return false;
            }
            java.util.List listA = a();
            java.util.List listA2 = cVar.a();
            return listA != null ? listA.equals(listA2) : listA2 == null;
        }

        public int hashCode() {
            java.util.List listA = a();
            return (listA == null ? 43 : listA.hashCode()) + 59;
        }

        @Override // com.applovin.impl.br.a
        public void onLogVisibilityImpression() {
            java.util.Iterator it = this.f1308a.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.sdk.AppLovinAdBase) com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.this).sdk.X().dispatchPostbackRequest((com.applovin.impl.sdk.network.e) it.next(), null);
            }
        }

        public java.lang.String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + a() + ")";
        }

        public java.util.List a() {
            return this.f1308a;
        }
    }

    /* synthetic */ AppLovinNativeAdImpl(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder builder, com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.a aVar) {
        this(builder);
    }

    private java.util.List<com.applovin.impl.s> getDirectClickTrackingPostbacks() {
        java.util.List<com.applovin.impl.s> listA;
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.m640x5876c986((com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = com.applovin.impl.yp.a(getJsonObjectFromAdObject("click_tracking_urls", new org.json.JSONObject()), getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return listA;
    }

    private java.util.List<java.lang.String> getPrivacySandboxClickAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_click_attribution_urls", java.util.Collections.emptyList());
    }

    private java.util.List<java.lang.String> getPrivacySandboxImpressionAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", java.util.Collections.emptyList());
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchUri(android.net.Uri uri, android.net.Uri uri2, android.content.Context context) {
        if (com.applovin.impl.tp.a(uri, context, this.sdk)) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a(this.tag, "Opening URL: " + uri);
                return;
            }
            return;
        }
        if (com.applovin.impl.tp.a(uri2, context, this.sdk)) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a(this.tag, "Opening backup URL: " + uri2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(android.view.View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            com.applovin.impl.br brVar = new com.applovin.impl.br(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = brVar;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            brVar.a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            com.applovin.impl.br brVar2 = new com.applovin.impl.br(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = brVar2;
            brVar2.a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            com.applovin.impl.aq aqVar = this.vastAd;
            if (aqVar != null && aqVar.hasVideoUrl()) {
                com.applovin.impl.br brVar3 = new com.applovin.impl.br(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = brVar3;
                brVar3.a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            java.util.List<java.lang.String> list = this.jsTrackers;
            if (list != null) {
                java.util.Iterator<java.lang.String> it = list.iterator();
                while (it.hasNext()) {
                    this.sdk.p0().b(it.next());
                }
            }
            java.util.Iterator<com.applovin.impl.sdk.network.e> it2 = this.impressionRequests.iterator();
            while (it2.hasNext()) {
                this.sdk.X().dispatchPostbackRequest(it2.next(), null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.g();
            if (this.sdk.Y() != null) {
                this.sdk.Y().b(getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.f();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public java.lang.String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public java.lang.String getBody() {
        return this.body;
    }

    public java.lang.String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public java.lang.String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public android.os.Bundle getDirectDownloadParameters() {
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        return tlVar != null ? (android.os.Bundle) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda4
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.sdk.utils.JsonUtils.toBundle(((com.applovin.impl.tl) obj).a("ah_parameters", (org.json.JSONObject) null));
            }
        }) : com.applovin.impl.sdk.utils.JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public java.lang.String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public android.net.Uri getIconUri() {
        return this.iconUri;
    }

    public float getMainImageAspectRatio() {
        return this.mainImageAspectRatio;
    }

    public android.net.Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public com.applovin.impl.sdk.nativeAd.AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.lang.String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.lang.String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public java.util.List<com.iab.omid.library.applovin.adsession.VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        java.util.List<com.iab.omid.library.applovin.adsession.VerificationScriptResource> list;
        if (this.sdk.V().e()) {
            return java.util.Collections.singletonList(com.iab.omid.library.applovin.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(com.applovin.impl.qg.c(), com.applovin.impl.qg.b(), com.applovin.impl.qg.a()));
        }
        final androidx.arch.core.util.Function function = new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.m641x77615e1e((org.json.JSONArray) obj);
            }
        };
        com.applovin.impl.tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return (java.util.List) tlVar.a(new androidx.arch.core.util.Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$3(function, (com.applovin.impl.tl) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (java.util.List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public com.applovin.impl.sdk.nativeAd.AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public android.net.Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public android.net.Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public java.lang.Double getStarRating() {
        return this.starRating;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    protected void handleNativeAdClick(android.net.Uri uri, android.net.Uri uri2, android.view.MotionEvent motionEvent, android.content.Context context) {
        if (this.sdk.Y() != null) {
            this.sdk.Y().b(getPrivacySandboxClickAttributionUrls(), motionEvent);
        }
        handleNativeAdClick(uri, uri2, context);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return com.applovin.impl.sdk.utils.StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.V().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", java.lang.Boolean.FALSE);
    }

    /* JADX INFO: renamed from: lambda$getOpenMeasurementVerificationScriptResources$2$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ java.util.List m641x77615e1e(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            try {
                java.net.URL url = new java.net.URL(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "url", null));
                java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "vendor_key", null);
                java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "parameters", null);
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string) && com.applovin.impl.sdk.utils.StringUtils.isValidString(string2)) {
                    arrayList.add(com.iab.omid.library.applovin.adsession.VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(com.iab.omid.library.applovin.adsession.VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (java.lang.Throwable th) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a(this.tag, "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lambda$unregisterViewsForInteraction$0$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ void m642xfd413d54() {
        for (android.view.View view : this.registeredViews) {
            view.setOnTouchListener(null);
            view.setOnClickListener(null);
        }
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().a(this.tag, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        com.applovin.impl.br brVar = this.viewableMRC50Tracker;
        if (brVar != null) {
            brVar.b();
        }
        com.applovin.impl.br brVar2 = this.viewableMRC100Tracker;
        if (brVar2 != null) {
            brVar2.b();
        }
        com.applovin.impl.br brVar3 = this.viewableVideoMRC50Tracker;
        if (brVar3 != null) {
            brVar3.b();
        }
        android.view.ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        com.applovin.impl.sdk.nativeAd.AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        com.applovin.impl.sdk.nativeAd.AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.content.Context context;
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().a(this.tag, "Handle view clicked");
        }
        this.sdk.j().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (!((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.B)).booleanValue() || (context = com.applovin.impl.zq.a(this.nativeAdView, this.sdk)) == null) {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(java.util.List<android.view.View> list, android.view.ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (com.applovin.impl.z3.e() && this.nativeAdView.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else if (com.applovin.impl.z3.e() || this.nativeAdView.getParent() == null) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().a(this.tag, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.sdk.I().a(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (android.view.View view : list) {
            if (view.hasOnClickListeners()) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().k(this.tag, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().k(this.tag, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().b(this.tag, "View is not enabled - " + view);
                }
            }
            if (view instanceof android.widget.Button) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a(this.tag, "Registering click for button: " + view);
                }
            } else {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().a(this.tag, "Registering click for view: " + view);
                }
            }
            if (((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.I2)).booleanValue()) {
                view.setOnTouchListener(new com.applovin.impl.adview.AppLovinTouchToClickListener(this.sdk, com.applovin.impl.sj.m0, viewGroup.getContext(), this));
            } else {
                view.setOnClickListener(this);
            }
            this.registeredViews.add(view);
        }
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().a(this.tag, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(android.net.Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageAspectRatio(float f) {
        this.mainImageAspectRatio = f;
    }

    public void setMainImageUri(android.net.Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(android.net.Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        com.applovin.impl.aq aqVar = this.vastAd;
        if (aqVar == null || !aqVar.hasVideoUrl()) {
            this.mediaView = new com.applovin.impl.sdk.nativeAd.AppLovinMediaView(this, this.sdk, com.applovin.impl.sdk.j.m());
        } else {
            try {
                this.mediaView = new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView(this, this.sdk, com.applovin.impl.sdk.j.m());
            } catch (java.lang.Throwable th) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.sdk.I().d(this.tag, "Failed to create ExoPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.D().a(TAG, "createExoPlayerVASTMediaView", th);
                this.mediaView = new com.applovin.impl.sdk.nativeAd.AppLovinMediaView(this, this.sdk, com.applovin.impl.sdk.j.m());
            }
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new com.applovin.impl.sdk.nativeAd.AppLovinOptionsView(this, this.sdk, com.applovin.impl.sdk.j.m());
            return;
        }
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().a(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(android.view.View view) {
        this.videoView = view;
    }

    public java.lang.String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m642xfd413d54();
            }
        });
    }

    private AppLovinNativeAdImpl(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new java.util.concurrent.atomic.AtomicBoolean();
        this.registeredViews = new java.util.ArrayList();
        this.onAttachStateChangeHandler = new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.b(this);
        this.adEventTracker = new com.applovin.impl.og(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.mainImageAspectRatio = builder.mainImageAspectRatio;
        this.privacyIconUri = builder.privacyIconUri;
        com.applovin.impl.aq aqVar = builder.vastAd;
        this.vastAd = aqVar;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.clickTrackingRequests = builder.clickTrackingRequests;
        this.impressionRequests = builder.impressionRequests;
        java.lang.Double d = builder.starRating;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
        if (builder.privacyDestinationUri != null) {
            this.privacyDestinationUri = builder.privacyDestinationUri;
        } else if (!isDspAd() || getSdk().k0().c()) {
            this.privacyDestinationUri = android.net.Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL);
        }
        this.viewableMRC50Callback = new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c(builder.viewableMRC100Requests);
        if (aqVar != null && aqVar.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.c(builder.viewableVideo50Requests);
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    private void handleNativeAdClick(android.net.Uri uri, android.net.Uri uri2, android.content.Context context) {
        if (this.clickTrackingRequests.size() > 0) {
            java.util.Iterator<com.applovin.impl.sdk.network.e> it = this.clickTrackingRequests.iterator();
            while (it.hasNext()) {
                this.sdk.X().dispatchPostbackRequest(it.next(), null);
            }
        } else {
            java.util.Iterator<java.lang.String> it2 = this.clickTrackingUrls.iterator();
            while (it2.hasNext()) {
                this.sdk.X().dispatchPostbackAsync(it2.next(), null);
            }
        }
        com.applovin.impl.fc.b(this.eventListener, this);
        if (isDirectDownloadEnabled()) {
            this.sdk.n().startDirectInstallOrDownloadProcess(this, null, new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.a(uri, uri2, context));
        } else {
            launchUri(uri, uri2, context);
        }
    }

    @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
    public void onClick(android.view.View view, android.view.MotionEvent motionEvent) {
        android.content.Context context;
        this.sdk.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.sdk.I().a(this.tag, "Handle view clicked");
        }
        this.sdk.j().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (!((java.lang.Boolean) this.sdk.a(com.applovin.impl.sj.B)).booleanValue() || (context = com.applovin.impl.zq.a(this.nativeAdView, this.sdk)) == null) {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, motionEvent, context);
    }

    public com.applovin.impl.aq getVastAd() {
        return this.vastAd;
    }

    /* JADX INFO: renamed from: lambda$getDirectClickTrackingPostbacks$1$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl, reason: not valid java name */
    /* synthetic */ java.util.List m640x5876c986(com.applovin.impl.tl tlVar) {
        return com.applovin.impl.yp.a(tlVar.a("click_tracking_urls", new org.json.JSONObject()), getClCode(), tlVar.a("click_tracking_url", (java.lang.String) null), this.sdk);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.kg
    public com.applovin.impl.og getAdEventTracker() {
        return this.adEventTracker;
    }

    static /* synthetic */ java.util.List lambda$getOpenMeasurementVerificationScriptResources$3(androidx.arch.core.util.Function function, com.applovin.impl.tl tlVar) {
        return (java.util.List) function.apply(tlVar.a("omid_verification_script_resources", (org.json.JSONArray) null));
    }

    public static class Builder {
        private final org.json.JSONObject adObject;
        private java.lang.String advertiser;
        private java.lang.String body;
        private java.lang.String callToAction;
        private android.net.Uri clickDestinationBackupUri;
        private android.net.Uri clickDestinationUri;
        private java.util.List<com.applovin.impl.sdk.network.e> clickTrackingRequests;
        private java.util.List<java.lang.String> clickTrackingUrls;
        private final org.json.JSONObject fullResponse;
        private android.net.Uri iconUri;
        private java.util.List<com.applovin.impl.sdk.network.e> impressionRequests;
        private java.util.List<java.lang.String> jsTrackers;
        private float mainImageAspectRatio;
        private android.net.Uri mainImageUri;
        private android.net.Uri privacyDestinationUri;
        private android.net.Uri privacyIconUri;
        private final com.applovin.impl.sdk.j sdk;
        private java.lang.Double starRating;
        private java.lang.String title;
        private com.applovin.impl.aq vastAd;
        private java.util.List<com.applovin.impl.sdk.network.e> viewableMRC100Requests;
        private java.util.List<com.applovin.impl.sdk.network.e> viewableMRC50Requests;
        private java.util.List<com.applovin.impl.sdk.network.e> viewableVideo50Requests;

        public Builder(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = jVar;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl build() {
            return new com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl(this, null);
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setAdvertiser(java.lang.String str) {
            this.advertiser = str;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setBody(java.lang.String str) {
            this.body = str;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setCallToAction(java.lang.String str) {
            this.callToAction = str;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setClickDestinationBackupUri(android.net.Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setClickDestinationUri(android.net.Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setClickTrackingRequests(java.util.List<com.applovin.impl.sdk.network.e> list) {
            this.clickTrackingRequests = list;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setClickTrackingUrls(java.util.List<java.lang.String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setIconUri(android.net.Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setImpressionRequests(java.util.List<com.applovin.impl.sdk.network.e> list) {
            this.impressionRequests = list;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setJsTrackers(java.util.List<java.lang.String> list) {
            this.jsTrackers = list;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setMainImageUri(android.net.Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setPrivacyDestinationUri(android.net.Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setPrivacyIconUri(android.net.Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setStarRating(java.lang.Double d) {
            this.starRating = d;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setTitle(java.lang.String str) {
            this.title = str;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setViewableMRC100Requests(java.util.List<com.applovin.impl.sdk.network.e> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setViewableMRC50Requests(java.util.List<com.applovin.impl.sdk.network.e> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setViewableVideo50Requests(java.util.List<com.applovin.impl.sdk.network.e> list) {
            this.viewableVideo50Requests = list;
            return this;
        }

        public com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.Builder setVastAd(com.applovin.impl.aq aqVar) {
            this.vastAd = aqVar;
            return this;
        }
    }
}

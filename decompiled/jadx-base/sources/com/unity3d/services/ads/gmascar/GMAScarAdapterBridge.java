package com.unity3d.services.ads.gmascar;

/* JADX INFO: loaded from: classes6.dex */
public class GMAScarAdapterBridge {
    private final com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge _adapterStatusBridge;
    private final com.unity3d.services.ads.gmascar.utils.GMAEventSender _gmaEventSender;
    private final com.unity3d.services.ads.gmascar.finder.GMAInitializer _gmaInitializer;
    private final com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge _initializationListenerBridge;
    private final com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge _initializationStatusBridge;
    private final com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase _mobileAdsBridge;
    private final com.unity3d.services.ads.gmascar.finder.PresenceDetector _presenceDetector;
    private com.unity3d.scar.adapter.common.IScarAdapter _scarAdapter;
    private final com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory _scarAdapterFactory;
    private final com.unity3d.services.ads.gmascar.finder.ScarVersionFinder _scarVersionFinder;
    private final com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase mobileAdsBridgeBase, com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge initializeListenerBridge, com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge initializationStatusBridge, com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge adapterStatusBridge, com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler webViewErrorHandler, com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory scarAdapterFactory, com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        this._initializationStatusBridge = initializationStatusBridge;
        this._initializationListenerBridge = initializeListenerBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = webViewErrorHandler;
        this._scarAdapterFactory = scarAdapterFactory;
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._gmaEventSender = gMAEventSender;
        com.unity3d.services.ads.gmascar.finder.PresenceDetector presenceDetector = new com.unity3d.services.ads.gmascar.finder.PresenceDetector(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        com.unity3d.services.ads.gmascar.finder.GMAInitializer gMAInitializer = new com.unity3d.services.ads.gmascar.finder.GMAInitializer(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge, gMAEventSender);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new com.unity3d.services.ads.gmascar.finder.ScarVersionFinder(mobileAdsBridgeBase, presenceDetector, gMAInitializer, gMAEventSender);
    }

    public void initializeScar() {
        if (this._presenceDetector.areGMAClassesPresent()) {
            this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.SCAR_PRESENT, new java.lang.Object[0]);
            this._gmaInitializer.initializeGMA();
        } else {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.WebViewAdsError) new com.unity3d.scar.adapter.common.GMAAdsError(com.unity3d.scar.adapter.common.GMAEvent.SCAR_NOT_PRESENT, new java.lang.Object[0]));
        }
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public void getSCARSignal(java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat) {
        this._scarAdapter = getScarAdapterObject();
        com.unity3d.services.ads.gmascar.handlers.SignalsHandler signalsHandler = new com.unity3d.services.ads.gmascar.handlers.SignalsHandler(this._gmaEventSender);
        com.unity3d.scar.adapter.common.IScarAdapter iScarAdapter = this._scarAdapter;
        if (iScarAdapter != null) {
            iScarAdapter.getSCARSignal(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), str, unityAdFormat, signalsHandler);
        } else {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.WebViewAdsError) com.unity3d.scar.adapter.common.GMAAdsError.InternalSignalsError("Could not create SCAR adapter object"));
        }
    }

    public boolean hasSCARBiddingSupport() {
        com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase == null || !mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            return false;
        }
        com.unity3d.scar.adapter.common.IScarAdapter scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        return scarAdapterObject != null;
    }

    public void getSCARBiddingSignals(boolean z, com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler biddingSignalsHandler) {
        com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            com.unity3d.scar.adapter.common.IScarAdapter scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                scarAdapterObject.getSCARBiddingSignals(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), z, biddingSignalsHandler);
                return;
            } else {
                biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
                return;
            }
        }
        biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }

    public void load(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata = new com.unity3d.scar.adapter.common.scarads.ScarAdMetadata(str, str2, str4, str3, java.lang.Integer.valueOf(i));
        com.unity3d.scar.adapter.common.IScarAdapter scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.WebViewAdsError) com.unity3d.scar.adapter.common.GMAAdsError.InternalLoadError(scarAdMetadata, "Scar Adapter object is null"));
        } else if (z) {
            loadInterstitialAd(scarAdMetadata);
        } else {
            loadRewardedAd(scarAdMetadata);
        }
    }

    private void loadInterstitialAd(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata) {
        this._scarAdapter.loadInterstitialAd(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), scarAdMetadata, new com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler(scarAdMetadata, getScarEventSubject(scarAdMetadata.getVideoLengthMs()), this._gmaEventSender));
    }

    private void loadRewardedAd(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata) {
        this._scarAdapter.loadRewardedAd(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), scarAdMetadata, new com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler(scarAdMetadata, getScarEventSubject(scarAdMetadata.getVideoLengthMs()), this._gmaEventSender));
    }

    public void loadBanner(android.content.Context context, com.unity3d.services.banners.BannerView bannerView, java.lang.String str, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        this._scarAdapter = getScarAdapterObject();
        com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler scarBannerAdHandler = new com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler(str);
        com.unity3d.scar.adapter.common.IScarAdapter iScarAdapter = this._scarAdapter;
        if (iScarAdapter != null) {
            iScarAdapter.loadBannerAd(context, bannerView, scarAdMetadata, unityBannerSize.getWidth(), unityBannerSize.getHeight(), scarBannerAdHandler);
        } else {
            com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, str);
        }
    }

    public void show(java.lang.String str, java.lang.String str2, boolean z) {
        com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata = new com.unity3d.scar.adapter.common.scarads.ScarAdMetadata(str, str2);
        com.unity3d.scar.adapter.common.IScarAdapter scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject != null) {
            scarAdapterObject.show(com.unity3d.services.core.properties.ClientProperties.getActivity(), str2, str);
        } else {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.WebViewAdsError) com.unity3d.scar.adapter.common.GMAAdsError.InternalShowError(scarAdMetadata, "Scar Adapter object is null"));
        }
    }

    private com.unity3d.services.core.misc.EventSubject getScarEventSubject(java.lang.Integer num) {
        return new com.unity3d.services.core.misc.EventSubject(new java.util.ArrayDeque(java.util.Arrays.asList(com.unity3d.scar.adapter.common.GMAEvent.FIRST_QUARTILE, com.unity3d.scar.adapter.common.GMAEvent.MIDPOINT, com.unity3d.scar.adapter.common.GMAEvent.THIRD_QUARTILE, com.unity3d.scar.adapter.common.GMAEvent.LAST_QUARTILE)), num, new com.unity3d.services.core.timer.DefaultIntervalTimerFactory());
    }

    private com.unity3d.scar.adapter.common.IScarAdapter getScarAdapterObject() {
        com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase mobileAdsBridgeBase;
        if (this._scarAdapter == null && (mobileAdsBridgeBase = this._mobileAdsBridge) != null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(mobileAdsBridgeBase.getAdapterVersion(this._scarVersionFinder.getVersionCode()), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }
}

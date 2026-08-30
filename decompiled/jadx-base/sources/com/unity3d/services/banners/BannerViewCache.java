package com.unity3d.services.banners;

/* JADX INFO: loaded from: classes6.dex */
public class BannerViewCache {
    private static com.unity3d.services.banners.BannerViewCache instance;
    private java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.unity3d.services.banners.BannerView>> _bannerViews = new java.util.HashMap<>();

    public static com.unity3d.services.banners.BannerViewCache getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.banners.BannerViewCache();
        }
        return instance;
    }

    public synchronized java.lang.String addBannerView(com.unity3d.services.banners.BannerView bannerView) {
        this._bannerViews.put(bannerView.getViewId(), new java.lang.ref.WeakReference<>(bannerView));
        return bannerView.getViewId();
    }

    public synchronized com.unity3d.services.banners.BannerView getBannerView(java.lang.String str) {
        java.lang.ref.WeakReference<com.unity3d.services.banners.BannerView> weakReference = this._bannerViews.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get();
    }

    public synchronized void removeBannerView(java.lang.String str) {
        this._bannerViews.remove(str);
    }

    public synchronized void loadBanner(com.unity3d.services.ads.operation.load.LoadBannerOperationState loadBannerOperationState) {
        java.lang.String id = loadBannerOperationState.getId();
        com.unity3d.services.banners.UnityBannerSize size = loadBannerOperationState.getSize();
        if (loadBannerOperationState.isScarAd()) {
            loadScarPlayer(id, loadBannerOperationState.getScarAdMetadata(), size);
        } else if (loadWebPlayer(id, size)) {
            com.unity3d.services.banners.bridge.BannerBridge.didLoad(id);
        }
    }

    public synchronized void loadScarPlayer(java.lang.String str, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        com.unity3d.services.banners.BannerView bannerView = getBannerView(str);
        if (bannerView != null) {
            bannerView.loadScarPlayer(str, scarAdMetadata, unityBannerSize);
        }
    }

    public synchronized void addScarContainer(java.lang.String str) {
        com.unity3d.services.banners.BannerView bannerView = getBannerView(str);
        if (bannerView != null) {
            bannerView.addScarContainer();
        }
    }

    public synchronized boolean loadWebPlayer(java.lang.String str, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        com.unity3d.services.banners.BannerView bannerView = getBannerView(str);
        if (bannerView == null) {
            return false;
        }
        bannerView.loadWebPlayer(unityBannerSize);
        return true;
    }

    public synchronized void triggerBannerLoadEvent(java.lang.String str) {
        final com.unity3d.services.banners.BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            com.unity3d.services.ads.operation.load.LoadBannerModule.getInstance().onUnityAdsAdLoaded(str);
            final com.unity3d.services.banners.BannerView.IListener listener = bannerView.getListener();
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.BannerViewCache.1
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.services.banners.BannerView.IListener iListener = listener;
                    if (iListener != null) {
                        iListener.onBannerLoaded(bannerView);
                    }
                }
            });
        }
    }

    public synchronized void triggerBannerShowEvent(java.lang.String str) {
        final com.unity3d.services.banners.BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            final com.unity3d.services.banners.BannerView.IListener listener = bannerView.getListener();
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.BannerViewCache.2
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.services.banners.BannerView.IListener iListener = listener;
                    if (iListener != null) {
                        iListener.onBannerShown(bannerView);
                    }
                }
            });
        }
    }

    public synchronized void triggerBannerClickEvent(java.lang.String str) {
        final com.unity3d.services.banners.BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            final com.unity3d.services.banners.BannerView.IListener listener = bannerView.getListener();
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.BannerViewCache.3
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.services.banners.BannerView.IListener iListener = listener;
                    if (iListener != null) {
                        iListener.onBannerClick(bannerView);
                    }
                }
            });
        }
    }

    public synchronized void triggerBannerErrorEvent(java.lang.String str, com.unity3d.services.banners.BannerErrorInfo bannerErrorInfo) {
        com.unity3d.services.ads.operation.load.LoadBannerModule.getInstance().onUnityAdsFailedToLoad(str, bannerErrorInfo.toLoadError(), bannerErrorInfo.errorMessage);
    }

    public synchronized void triggerBannerLeftApplicationEvent(java.lang.String str) {
        final com.unity3d.services.banners.BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            final com.unity3d.services.banners.BannerView.IListener listener = bannerView.getListener();
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.BannerViewCache.4
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.services.banners.BannerView.IListener iListener = listener;
                    if (iListener != null) {
                        iListener.onBannerLeftApplication(bannerView);
                    }
                }
            });
        }
    }
}

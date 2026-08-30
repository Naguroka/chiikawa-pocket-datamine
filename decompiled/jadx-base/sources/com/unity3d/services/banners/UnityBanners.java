package com.unity3d.services.banners;

/* JADX INFO: loaded from: classes6.dex */
public final class UnityBanners {
    private static com.unity3d.services.banners.UnityBanners instance;
    private com.unity3d.services.banners.IUnityBannerListener _bannerListener;
    private com.unity3d.services.banners.view.BannerPosition _currentBannerPosition = com.unity3d.services.banners.view.BannerPosition.NONE;
    private com.unity3d.services.banners.UnityBanners.BannerWrapper _currentBannerWrapper;

    private static com.unity3d.services.banners.UnityBanners getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.banners.UnityBanners();
        }
        return instance;
    }

    private class BannerWrapper extends android.widget.FrameLayout {
        private com.unity3d.services.banners.UnityBanners.BannerAdRefreshView _bannerAdRefreshView;
        private com.unity3d.services.banners.view.BannerPosition _bannerPosition;

        public BannerWrapper(android.content.Context context, com.unity3d.services.banners.UnityBanners.BannerAdRefreshView bannerAdRefreshView) {
            super(context);
            this._bannerPosition = com.unity3d.services.banners.view.BannerPosition.NONE;
            this._bannerAdRefreshView = bannerAdRefreshView;
            addView(bannerAdRefreshView);
            setupLayoutConstraints();
            setBackgroundColor(0);
        }

        public void setBannerPosition(com.unity3d.services.banners.view.BannerPosition bannerPosition) {
            this._bannerPosition = bannerPosition;
            setupLayoutConstraints();
        }

        private void setupLayoutConstraints() {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this._bannerPosition.getGravity();
            setLayoutParams(layoutParams);
        }

        public void destroy() {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.UnityBanners.BannerWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    this.removeAllViews();
                    com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(this);
                }
            });
            com.unity3d.services.banners.UnityBanners.BannerAdRefreshView bannerAdRefreshView = this._bannerAdRefreshView;
            if (bannerAdRefreshView != null) {
                bannerAdRefreshView.destroy();
                this._bannerAdRefreshView = null;
            }
        }
    }

    private UnityBanners() {
    }

    private void _loadBanner(android.app.Activity activity, java.lang.String str) {
        if (this._currentBannerWrapper == null) {
            com.unity3d.services.banners.UnityBanners.BannerAdRefreshView bannerAdRefreshView = new com.unity3d.services.banners.UnityBanners.BannerAdRefreshView(activity, str, new com.unity3d.services.banners.UnityBannerSize(320, 50));
            final com.unity3d.services.banners.UnityBanners.BannerWrapper bannerWrapper = new com.unity3d.services.banners.UnityBanners.BannerWrapper(activity, bannerAdRefreshView);
            bannerWrapper.setBannerPosition(this._currentBannerPosition);
            this._currentBannerWrapper = bannerWrapper;
            bannerAdRefreshView.setListener(new com.unity3d.services.banners.BannerView.Listener() { // from class: com.unity3d.services.banners.UnityBanners.1
                @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
                public void onBannerLoaded(com.unity3d.services.banners.BannerView bannerView) {
                    if (this._bannerListener != null) {
                        this._bannerListener.onUnityBannerLoaded(bannerView.getPlacementId(), bannerWrapper);
                    }
                }

                @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
                public void onBannerShown(com.unity3d.services.banners.BannerView bannerView) {
                    if (this._bannerListener != null) {
                        this._bannerListener.onUnityBannerShow(bannerView.getPlacementId());
                    }
                }

                @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
                public void onBannerFailedToLoad(com.unity3d.services.banners.BannerView bannerView, com.unity3d.services.banners.BannerErrorInfo bannerErrorInfo) {
                    if (this._bannerListener != null) {
                        this._bannerListener.onUnityBannerError(bannerView.getPlacementId() + " " + bannerErrorInfo.errorMessage);
                    }
                }

                @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
                public void onBannerClick(com.unity3d.services.banners.BannerView bannerView) {
                    if (this._bannerListener != null) {
                        this._bannerListener.onUnityBannerClick(bannerView.getPlacementId());
                    }
                }
            });
            bannerAdRefreshView.load();
            return;
        }
        sendError("A Banner is already in use, please call destroy before loading another banner!");
    }

    private void _destroy() {
        com.unity3d.services.banners.UnityBanners.BannerWrapper bannerWrapper = this._currentBannerWrapper;
        if (bannerWrapper != null) {
            bannerWrapper.destroy();
            this._currentBannerWrapper = null;
        }
    }

    private static void sendError(final java.lang.String str) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.UnityBanners.2
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.banners.IUnityBannerListener bannerListener = com.unity3d.services.banners.UnityBanners.getBannerListener();
                if (bannerListener != null) {
                    bannerListener.onUnityBannerError(str);
                }
            }
        });
    }

    @java.lang.Deprecated
    public static void loadBanner(android.app.Activity activity, java.lang.String str) {
        com.unity3d.services.core.log.DeviceLog.entered();
        if (!com.unity3d.ads.UnityAds.isSupported()) {
            sendError("Unity Ads is not supported on this device.");
        }
        if (!com.unity3d.ads.UnityAds.isInitialized()) {
            sendError("UnityAds is not initialized.");
        } else {
            com.unity3d.services.core.properties.ClientProperties.setActivity(activity);
            getInstance()._loadBanner(activity, str);
        }
    }

    @java.lang.Deprecated
    public static void destroy() {
        getInstance()._destroy();
    }

    @java.lang.Deprecated
    public static void setBannerListener(com.unity3d.services.banners.IUnityBannerListener iUnityBannerListener) {
        getInstance()._bannerListener = iUnityBannerListener;
    }

    @java.lang.Deprecated
    public static com.unity3d.services.banners.IUnityBannerListener getBannerListener() {
        return getInstance()._bannerListener;
    }

    @java.lang.Deprecated
    public static void setBannerPosition(com.unity3d.services.banners.view.BannerPosition bannerPosition) {
        getInstance()._currentBannerPosition = bannerPosition;
    }

    private class BannerAdRefreshView extends android.widget.RelativeLayout {
        private com.unity3d.services.banners.BannerView bannerView;
        private boolean didLoad;
        private boolean didShow;
        private boolean didSubscribeToLifecycle;
        private com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.LifecycleListener lifecycleListener;
        private java.lang.String placementId;
        private android.os.Handler refreshHandler;
        private long refreshRate;
        private long refreshTime;
        private java.lang.Runnable reloadRunnable;

        public BannerAdRefreshView(android.app.Activity activity, java.lang.String str, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
            super(activity);
            this.didLoad = false;
            this.refreshRate = 30L;
            this.didShow = false;
            this.didSubscribeToLifecycle = false;
            this.placementId = str;
            this.refreshHandler = new android.os.Handler();
            this.reloadRunnable = new java.lang.Runnable() { // from class: com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.1
                @Override // java.lang.Runnable
                public void run() {
                    this.reload();
                }
            };
            setupLayoutParams();
            setBackgroundColor(0);
            com.unity3d.services.banners.BannerView bannerView = new com.unity3d.services.banners.BannerView(activity, str, unityBannerSize);
            this.bannerView = bannerView;
            addView(bannerView);
        }

        public java.lang.String getPlacementId() {
            return this.bannerView.getPlacementId();
        }

        public com.unity3d.services.banners.UnityBannerSize getSize() {
            return this.bannerView.getSize();
        }

        public void setListener(com.unity3d.services.banners.BannerView.IListener iListener) {
            this.bannerView.setListener(iListener);
        }

        public com.unity3d.services.banners.BannerView.IListener getListener() {
            return this.bannerView.getListener();
        }

        public void load() {
            if (this.didLoad) {
                return;
            }
            this.didLoad = true;
            java.lang.Integer refreshRate = com.unity3d.services.banners.properties.BannerRefreshInfo.getInstance().getRefreshRate(this.placementId);
            if (refreshRate != null) {
                this.refreshRate = refreshRate.longValue();
            }
            reload();
        }

        public void destroy() {
            stopReloadTask();
            this.bannerView.destroy();
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.2
                @Override // java.lang.Runnable
                public void run() {
                    this.removeAllViews();
                }
            });
            this.bannerView = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void startReloadTask() {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            long j = this.refreshTime;
            if (jUptimeMillis < j) {
                this.refreshHandler.postAtTime(this.reloadRunnable, j);
            } else {
                reload();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stopReloadTask() {
            java.lang.Runnable runnable;
            android.os.Handler handler = this.refreshHandler;
            if (handler == null || (runnable = this.reloadRunnable) == null) {
                return;
            }
            handler.removeCallbacks(runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reload() {
            com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions = new com.unity3d.ads.UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(java.util.UUID.randomUUID().toString());
            this.bannerView.load(unityAdsLoadOptions);
            long jUptimeMillis = android.os.SystemClock.uptimeMillis() + java.util.concurrent.TimeUnit.SECONDS.toMillis(this.refreshRate);
            this.refreshTime = jUptimeMillis;
            this.refreshHandler.postAtTime(this.reloadRunnable, jUptimeMillis);
        }

        private void subscribeToLifecycle() {
            if (this.didSubscribeToLifecycle || com.unity3d.services.core.properties.ClientProperties.getApplication() == null) {
                return;
            }
            this.lifecycleListener = new com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.LifecycleListener() { // from class: com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.LifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(android.app.Activity activity) {
                    this.stopReloadTask();
                }

                @Override // com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.LifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(android.app.Activity activity) {
                    this.stopReloadTask();
                }

                @Override // com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.LifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(android.app.Activity activity) {
                    this.stopReloadTask();
                }

                @Override // com.unity3d.services.banners.UnityBanners.BannerAdRefreshView.LifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(android.app.Activity activity) {
                    this.startReloadTask();
                }
            };
            this.didSubscribeToLifecycle = true;
            com.unity3d.services.core.properties.ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.lifecycleListener);
        }

        private void unsubscribeFromLifecycle() {
            if (!this.didSubscribeToLifecycle || this.lifecycleListener == null || com.unity3d.services.core.properties.ClientProperties.getApplication() == null) {
                return;
            }
            this.didSubscribeToLifecycle = false;
            com.unity3d.services.core.properties.ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.lifecycleListener);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            stopReloadTask();
            unsubscribeFromLifecycle();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            subscribeToLifecycle();
            if (this.didShow) {
                startReloadTask();
            } else {
                this.didShow = true;
            }
        }

        private void setupLayoutParams() {
            setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        }

        private class LifecycleListener implements android.app.Application.ActivityLifecycleCallbacks {
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(android.app.Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(android.app.Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(android.app.Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(android.app.Activity activity) {
            }

            private LifecycleListener() {
            }
        }
    }
}

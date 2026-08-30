package com.google.unity.ads;

/* JADX INFO: loaded from: classes5.dex */
public class Banner {
    protected com.google.android.gms.ads.BaseAdView adView;
    protected boolean hidden;
    private int mHorizontalOffset;
    private android.view.View.OnLayoutChangeListener mLayoutChangeListener;
    private int mPositionCode;
    private int mVerticalOffset;
    protected com.google.unity.ads.UnityAdListener unityListener;
    protected android.app.Activity unityPlayerActivity;

    protected static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;

        protected Insets() {
        }
    }

    protected Banner() {
    }

    public Banner(android.app.Activity activity, com.google.unity.ads.UnityAdListener listener) {
        this.unityPlayerActivity = activity;
        this.unityListener = listener;
    }

    public void create(final java.lang.String publisherId, final com.google.android.gms.ads.AdSize adSize, final int positionCode) {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.Banner.1
            final /* synthetic */ com.google.unity.ads.Banner this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.createAdView(publisherId, adSize);
                this.this$0.mHorizontalOffset = 0;
                this.this$0.mVerticalOffset = 0;
                this.this$0.mPositionCode = positionCode;
                this.this$0.hidden = false;
            }
        });
    }

    public void create(final java.lang.String publisherId, final com.google.android.gms.ads.AdSize adSize, final int positionX, final int positionY) {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.Banner.2
            final /* synthetic */ com.google.unity.ads.Banner this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.createAdView(publisherId, adSize);
                this.this$0.mPositionCode = -1;
                this.this$0.mHorizontalOffset = positionX;
                this.this$0.mVerticalOffset = positionY;
                this.this$0.hidden = false;
            }
        });
    }

    protected void createAdView(final java.lang.String publisherId, final com.google.android.gms.ads.AdSize adSize) {
        com.google.android.gms.ads.AdView adView = new com.google.android.gms.ads.AdView(this.unityPlayerActivity);
        this.adView = adView;
        adView.setBackgroundColor(0);
        this.adView.setAdUnitId(publisherId);
        this.adView.setAdSize(adSize);
        this.adView.setVisibility(8);
        this.adView.setDescendantFocusability(org.objectweb.asm.Opcodes.ASM6);
        this.unityPlayerActivity.addContentView(this.adView, getLayoutParams());
        this.adView.setAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.google.unity.ads.Banner.3
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                if (com.google.unity.ads.Banner.this.unityListener != null) {
                    if (!com.google.unity.ads.Banner.this.hidden) {
                        com.google.unity.ads.Banner.this.show();
                    }
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.Banner.this.unityListener != null) {
                                com.google.unity.ads.Banner.this.unityListener.onAdLoaded();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(final com.google.android.gms.ads.LoadAdError error) {
                if (com.google.unity.ads.Banner.this.unityListener != null) {
                    new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.Banner.3.2
                        final /* synthetic */ com.google.unity.ads.Banner.AnonymousClass3 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.Banner.this.unityListener != null) {
                                com.google.unity.ads.Banner.this.unityListener.onAdFailedToLoad(error);
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                if (com.google.unity.ads.Banner.this.unityListener != null) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.3.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.Banner.this.unityListener != null) {
                                com.google.unity.ads.Banner.this.unityListener.onAdOpened();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                if (com.google.unity.ads.Banner.this.unityListener != null) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.3.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.Banner.this.unityListener != null) {
                                com.google.unity.ads.Banner.this.unityListener.onAdClosed();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                if (com.google.unity.ads.Banner.this.unityListener != null) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.3.5
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.Banner.this.unityListener != null) {
                                com.google.unity.ads.Banner.this.unityListener.onAdImpression();
                            }
                        }
                    }).start();
                }
            }

            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public void onAdClicked() {
                if (com.google.unity.ads.Banner.this.unityListener != null) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.3.6
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.Banner.this.unityListener != null) {
                                com.google.unity.ads.Banner.this.unityListener.onAdClicked();
                            }
                        }
                    }).start();
                }
            }
        });
        this.adView.setOnPaidEventListener(new com.google.android.gms.ads.OnPaidEventListener() { // from class: com.google.unity.ads.Banner.4
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
                if (com.google.unity.ads.Banner.this.unityListener != null) {
                    new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.Banner.4.1
                        final /* synthetic */ com.google.unity.ads.Banner.AnonymousClass4 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.google.unity.ads.Banner.this.unityListener != null) {
                                com.google.unity.ads.Banner.this.unityListener.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
                            }
                        }
                    }).start();
                }
            }
        });
        setLayoutChangeListener();
    }

    protected void setLayoutChangeListener() {
        this.mLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.unity.ads.Banner.5
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                if (((left == oldLeft && right == oldRight && bottom == oldBottom && top == oldTop) ? false : true) && !com.google.unity.ads.Banner.this.hidden) {
                    com.google.unity.ads.Banner.this.updatePosition();
                }
            }
        };
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.mLayoutChangeListener);
    }

    public void loadAd(final com.google.android.gms.ads.AdRequest request) {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.Banner.6
            final /* synthetic */ com.google.unity.ads.Banner this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.google.unity.ads.PluginUtils.LOGTAG, "Calling loadAd() on Android");
                this.this$0.adView.loadAd(request);
            }
        });
    }

    public void show() {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.7
            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.google.unity.ads.PluginUtils.LOGTAG, "Calling show() on Android");
                com.google.unity.ads.Banner.this.hidden = false;
                com.google.unity.ads.Banner.this.adView.setVisibility(0);
                com.google.unity.ads.Banner.this.updatePosition();
                com.google.unity.ads.Banner.this.adView.resume();
            }
        });
    }

    public void hide() {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.8
            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.google.unity.ads.PluginUtils.LOGTAG, "Calling hide() on Android");
                com.google.unity.ads.Banner.this.hidden = true;
                com.google.unity.ads.Banner.this.adView.setVisibility(8);
                com.google.unity.ads.Banner.this.adView.pause();
            }
        });
    }

    public void destroy() {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.9
            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.google.unity.ads.PluginUtils.LOGTAG, "Calling destroy() on Android");
                if (com.google.unity.ads.Banner.this.adView != null) {
                    com.google.unity.ads.Banner.this.adView.destroy();
                    android.view.ViewParent parent = com.google.unity.ads.Banner.this.adView.getParent();
                    if (parent instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) parent).removeView(com.google.unity.ads.Banner.this.adView);
                    }
                }
            }
        });
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.mLayoutChangeListener);
    }

    public java.lang.String getAdUnitId() {
        com.google.android.gms.ads.BaseAdView baseAdView = this.adView;
        if (baseAdView == null) {
            return null;
        }
        return baseAdView.getAdUnitId();
    }

    public float getHeightInPixels() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<java.lang.Integer>() { // from class: com.google.unity.ads.Banner.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Integer call() throws java.lang.Exception {
                return java.lang.Integer.valueOf(com.google.unity.ads.Banner.this.adView.getAdSize().getHeightInPixels(com.google.unity.ads.Banner.this.unityPlayerActivity));
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        try {
            return ((java.lang.Integer) futureTask.get()).intValue();
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Failed to get ad view height: %s", e.getLocalizedMessage()));
            return -1.0f;
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Failed to get ad view height: %s", e2.getLocalizedMessage()));
            return -1.0f;
        }
    }

    public float getWidthInPixels() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<java.lang.Integer>() { // from class: com.google.unity.ads.Banner.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Integer call() throws java.lang.Exception {
                return java.lang.Integer.valueOf(com.google.unity.ads.Banner.this.adView.getAdSize().getWidthInPixels(com.google.unity.ads.Banner.this.unityPlayerActivity));
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        try {
            return ((java.lang.Integer) futureTask.get()).intValue();
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Failed to get ad view width: %s", e.getLocalizedMessage()));
            return -1.0f;
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Failed to get ad view width: %s", e2.getLocalizedMessage()));
            return -1.0f;
        }
    }

    public void setPosition(final int positionCode) {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.Banner.12
            final /* synthetic */ com.google.unity.ads.Banner this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mPositionCode = positionCode;
                this.this$0.updatePosition();
            }
        });
    }

    public void setPosition(final int positionX, final int positionY) {
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.Banner.13
            final /* synthetic */ com.google.unity.ads.Banner this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mPositionCode = -1;
                this.this$0.mHorizontalOffset = positionX;
                this.this$0.mVerticalOffset = positionY;
                this.this$0.updatePosition();
            }
        });
    }

    public boolean isCollapsible() {
        com.google.android.gms.ads.BaseAdView baseAdView = this.adView;
        if (baseAdView == null) {
            return false;
        }
        return baseAdView.isCollapsible();
    }

    protected android.widget.FrameLayout.LayoutParams getLayoutParams() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = com.google.unity.ads.PluginUtils.getLayoutGravityForPositionCode(this.mPositionCode);
        com.google.unity.ads.Banner.Insets safeInsets = getSafeInsets();
        int i = safeInsets.left;
        int i2 = safeInsets.top;
        layoutParams.bottomMargin = safeInsets.bottom;
        layoutParams.rightMargin = safeInsets.right;
        if (this.mPositionCode == -1) {
            int iConvertDpToPixel = (int) com.google.unity.ads.PluginUtils.convertDpToPixel(this.mHorizontalOffset);
            if (iConvertDpToPixel >= i) {
                i = iConvertDpToPixel;
            }
            int iConvertDpToPixel2 = (int) com.google.unity.ads.PluginUtils.convertDpToPixel(this.mVerticalOffset);
            if (iConvertDpToPixel2 >= i2) {
                i2 = iConvertDpToPixel2;
            }
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
        } else {
            layoutParams.leftMargin = i;
            int i3 = this.mPositionCode;
            if (i3 == 0 || i3 == 2 || i3 == 3) {
                layoutParams.topMargin = i2;
            }
        }
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.adView == null || this.hidden) {
            return;
        }
        this.unityPlayerActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.Banner.14
            @Override // java.lang.Runnable
            public void run() {
                com.google.unity.ads.Banner.this.adView.setLayoutParams(com.google.unity.ads.Banner.this.getLayoutParams());
            }
        });
    }

    private com.google.unity.ads.Banner.Insets getSafeInsets() {
        android.view.Window window;
        android.view.WindowInsets rootWindowInsets;
        android.view.DisplayCutout displayCutout;
        com.google.unity.ads.Banner.Insets insets = new com.google.unity.ads.Banner.Insets();
        if (android.os.Build.VERSION.SDK_INT < 28 || (window = this.unityPlayerActivity.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return insets;
        }
        insets.top = displayCutout.getSafeInsetTop();
        insets.left = displayCutout.getSafeInsetLeft();
        insets.bottom = displayCutout.getSafeInsetBottom();
        insets.right = displayCutout.getSafeInsetRight();
        return insets;
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable() { // from class: com.google.unity.ads.Banner$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m920lambda$getResponseInfo$0$comgoogleunityadsBanner();
            }
        });
        this.unityPlayerActivity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.ResponseInfo) futureTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check banner response info: %s", e.getLocalizedMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: lambda$getResponseInfo$0$com-google-unity-ads-Banner, reason: not valid java name */
    /* synthetic */ com.google.android.gms.ads.ResponseInfo m920lambda$getResponseInfo$0$comgoogleunityadsBanner() throws java.lang.Exception {
        return this.adView.getResponseInfo();
    }
}

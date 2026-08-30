package com.google.unity.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
public class UnityNativeTemplateAd {
    private android.app.Activity activity;
    private com.google.unity.ads.nativead.UnityNativeTemplateAdCallback callback;
    private com.google.android.gms.ads.AdSize mAdSize;
    private android.view.View.OnLayoutChangeListener mLayoutChangeListener;
    private int mPositionCode;
    private com.google.android.gms.ads.nativead.NativeAd nativeAd;
    private com.google.android.ads.nativetemplates.TemplateView templateView;
    protected boolean hidden = false;
    private int mHorizontalOffset = 0;
    private int mVerticalOffset = 0;

    protected static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;

        protected Insets() {
        }
    }

    public UnityNativeTemplateAd(android.app.Activity activity, com.google.unity.ads.nativead.UnityNativeTemplateAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nativead.UnityNativeTemplateAd$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Runnable {
        final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd this$0;
        final /* synthetic */ java.lang.String val$adUnitId;
        final /* synthetic */ com.google.android.gms.ads.nativead.NativeAdOptions val$options;
        final /* synthetic */ com.google.android.gms.ads.AdRequest val$request;

        AnonymousClass1(final com.google.unity.ads.nativead.UnityNativeTemplateAd this$0, final java.lang.String val$adUnitId, final com.google.android.gms.ads.nativead.NativeAdOptions val$options, final com.google.android.gms.ads.AdRequest val$request) {
            this.val$adUnitId = val$adUnitId;
            this.val$options = val$options;
            this.val$request = val$request;
            this.this$0 = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.google.android.gms.ads.AdLoader.Builder(this.this$0.activity, this.val$adUnitId).forNativeAd(new com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.AnonymousClass2()).withAdListener(new com.google.android.gms.ads.AdListener() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.1.1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError adError) {
                    com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback.onNativeAdFailedToLoad(adError);
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback.onAdImpression();
                }

                @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
                public void onAdClicked() {
                    com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback.onAdClicked();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback.onAdDismissedFullScreenContent();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                    com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback.onAdShowedFullScreenContent();
                }
            }).withNativeAdOptions(this.val$options).build().loadAd(this.val$request);
        }

        /* JADX INFO: renamed from: com.google.unity.ads.nativead.UnityNativeTemplateAd$1$2, reason: invalid class name */
        class AnonymousClass2 implements com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener {
            AnonymousClass2() {
            }

            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd ad) {
                com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.nativeAd = ad;
                com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback.onNativeAdLoaded();
                com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.nativeAd.setOnPaidEventListener(new com.google.android.gms.ads.OnPaidEventListener() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.1.2.1
                    @Override // com.google.android.gms.ads.OnPaidEventListener
                    public void onPaidEvent(final com.google.android.gms.ads.AdValue adValue) {
                        new java.lang.Thread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.1.2.1.1
                            final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.AnonymousClass2.C02121 this$3;

                            {
                                this.this$3 = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                if (com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback != null) {
                                    com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1.this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
                                }
                            }
                        }).start();
                    }
                });
            }
        }
    }

    public void loadAd(final java.lang.String adUnitId, final com.google.android.gms.ads.nativead.NativeAdOptions options, final com.google.android.gms.ads.AdRequest request) {
        this.activity.runOnUiThread(new com.google.unity.ads.nativead.UnityNativeTemplateAd.AnonymousClass1(this, adUnitId, options, request));
    }

    public void setPositionCode(final int positionCode) {
        this.activity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.2
            final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd this$0;

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
        this.activity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.3
            final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd this$0;

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

    public void renderDefaultSizeAtPosition(final com.google.unity.ads.nativead.UnityNativeTemplateStyle templateStyle, final int positionX, final int positionY) {
        removeTemplateView();
        this.mPositionCode = -1;
        this.mHorizontalOffset = positionX;
        this.mVerticalOffset = positionY;
        this.mAdSize = null;
        this.activity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.4
            final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.google.unity.ads.nativead.UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = templateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.this$0.activity);
                frameLayout.addView(this.this$0.templateView, this.this$0.getLayoutParams());
                this.this$0.activity.addContentView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderDefaultSizeAtPositionCode(final com.google.unity.ads.nativead.UnityNativeTemplateStyle templateStyle, final int positionCode) {
        removeTemplateView();
        this.mPositionCode = positionCode;
        this.mAdSize = null;
        this.activity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.5
            final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.google.unity.ads.nativead.UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = templateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.this$0.activity);
                frameLayout.addView(this.this$0.templateView, this.this$0.getLayoutParams());
                this.this$0.activity.addContentView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderCustomSizeAtPosition(final com.google.unity.ads.nativead.UnityNativeTemplateStyle templateStyle, final com.google.android.gms.ads.AdSize adSize, final int positionX, final int positionY) {
        removeTemplateView();
        this.mPositionCode = -1;
        this.mHorizontalOffset = positionX;
        this.mVerticalOffset = positionY;
        this.mAdSize = adSize;
        this.activity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.6
            final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.google.unity.ads.nativead.UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = templateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.this$0.activity);
                android.widget.FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                layoutParams.height = adSize.getHeight();
                layoutParams.width = adSize.getWidth();
                frameLayout.addView(this.this$0.templateView, layoutParams);
                this.this$0.activity.addContentView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderCustomSizeAtPositionCode(final com.google.unity.ads.nativead.UnityNativeTemplateStyle templateStyle, final com.google.android.gms.ads.AdSize adSize, final int positionCode) {
        removeTemplateView();
        this.mPositionCode = positionCode;
        this.mAdSize = adSize;
        this.activity.runOnUiThread(new java.lang.Runnable(this) { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.7
            final /* synthetic */ com.google.unity.ads.nativead.UnityNativeTemplateAd this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.google.unity.ads.nativead.UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.templateView = templateStyle.asTemplateView(unityNativeTemplateAd.activity);
                this.this$0.templateView.setNativeAd(this.this$0.nativeAd);
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.this$0.activity);
                android.widget.FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                layoutParams.height = adSize.getHeight();
                layoutParams.width = adSize.getWidth();
                frameLayout.addView(this.this$0.templateView, layoutParams);
                this.this$0.activity.addContentView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.google.android.gms.ads.ResponseInfo>() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public com.google.android.gms.ads.ResponseInfo call() {
                return com.google.unity.ads.nativead.UnityNativeTemplateAd.this.nativeAd.getResponseInfo();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (com.google.android.gms.ads.ResponseInfo) futureTask.get();
        } catch (java.lang.InterruptedException e) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check native response info: %s", e.getLocalizedMessage()));
            return null;
        } catch (java.util.concurrent.ExecutionException e2) {
            android.util.Log.e(com.google.unity.ads.PluginUtils.LOGTAG, java.lang.String.format("Unable to check native response info: %s", e2.getLocalizedMessage()));
            return null;
        }
    }

    public void show() {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.9
            @Override // java.lang.Runnable
            public void run() {
                if (com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView == null) {
                    return;
                }
                com.google.unity.ads.nativead.UnityNativeTemplateAd.this.hidden = false;
                com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView.setVisibility(0);
                com.google.unity.ads.nativead.UnityNativeTemplateAd.this.updatePosition();
            }
        });
    }

    public void hide() {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.10
            @Override // java.lang.Runnable
            public void run() {
                if (com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView == null) {
                    return;
                }
                com.google.unity.ads.nativead.UnityNativeTemplateAd.this.hidden = true;
                com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView.setVisibility(8);
            }
        });
    }

    public float getHeightInPixels() {
        com.google.android.ads.nativetemplates.TemplateView templateView = this.templateView;
        if (templateView == null) {
            return 0.0f;
        }
        return templateView.getHeight();
    }

    public float getWidthInPixels() {
        com.google.android.ads.nativetemplates.TemplateView templateView = this.templateView;
        if (templateView == null) {
            return 0.0f;
        }
        return templateView.getWidth();
    }

    public void destroy() {
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.11
            @Override // java.lang.Runnable
            public void run() {
                if (com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView != null) {
                    com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView.destroyNativeAd();
                    android.view.ViewParent parent = com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView.getParent();
                    if (parent instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) parent).removeView(com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView);
                    }
                }
            }
        });
        this.activity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.mLayoutChangeListener);
        this.mLayoutChangeListener = null;
    }

    protected void setLayoutChangeListener() {
        if (this.mLayoutChangeListener != null) {
            return;
        }
        this.mLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.12
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                if ((left == oldLeft && right == oldRight && bottom == oldBottom && top == oldTop) || com.google.unity.ads.nativead.UnityNativeTemplateAd.this.hidden) {
                    return;
                }
                com.google.unity.ads.nativead.UnityNativeTemplateAd.this.updatePosition();
            }
        };
        this.activity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.mLayoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.templateView == null) {
            return;
        }
        this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.13
            @Override // java.lang.Runnable
            public void run() {
                android.widget.FrameLayout.LayoutParams layoutParams = com.google.unity.ads.nativead.UnityNativeTemplateAd.this.getLayoutParams();
                if (com.google.unity.ads.nativead.UnityNativeTemplateAd.this.mAdSize != null) {
                    layoutParams.height = com.google.unity.ads.nativead.UnityNativeTemplateAd.this.mAdSize.getHeight();
                    layoutParams.width = com.google.unity.ads.nativead.UnityNativeTemplateAd.this.mAdSize.getWidth();
                }
                com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView.setLayoutParams(layoutParams);
            }
        });
    }

    private void removeTemplateView() {
        if (this.templateView != null) {
            this.activity.runOnUiThread(new java.lang.Runnable() { // from class: com.google.unity.ads.nativead.UnityNativeTemplateAd.14
                @Override // java.lang.Runnable
                public void run() {
                    ((android.view.ViewGroup) com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView.getParent()).removeView(com.google.unity.ads.nativead.UnityNativeTemplateAd.this.templateView);
                }
            });
        }
    }

    protected android.widget.FrameLayout.LayoutParams getLayoutParams() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = com.google.unity.ads.PluginUtils.getLayoutGravityForPositionCode(this.mPositionCode);
        com.google.unity.ads.nativead.UnityNativeTemplateAd.Insets insets = getInsets();
        int i = insets.left;
        int i2 = insets.top;
        layoutParams.bottomMargin = insets.bottom;
        layoutParams.rightMargin = insets.right;
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

    private com.google.unity.ads.nativead.UnityNativeTemplateAd.Insets getInsets() {
        com.google.unity.ads.nativead.UnityNativeTemplateAd.Insets insets = new com.google.unity.ads.nativead.UnityNativeTemplateAd.Insets();
        if (android.os.Build.VERSION.SDK_INT >= 28 && this.activity.getWindow() != null && this.activity.getWindow().getDecorView().getRootWindowInsets() != null && this.activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout() != null) {
            android.view.DisplayCutout displayCutout = this.activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
            insets.top = displayCutout.getSafeInsetTop();
            insets.left = displayCutout.getSafeInsetLeft();
            insets.bottom = displayCutout.getSafeInsetBottom();
            insets.right = displayCutout.getSafeInsetRight();
        }
        return insets;
    }
}

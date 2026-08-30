package com.unity3d.services.banners.view;

/* JADX INFO: loaded from: classes6.dex */
public class BannerWebPlayerContainer extends android.widget.RelativeLayout {
    private java.lang.String _bannerAdId;
    private int _lastVisibility;
    private com.unity3d.services.banners.UnityBannerSize _size;
    private java.lang.Runnable _unsubscribeLayoutChange;
    private org.json.JSONObject _webPlayerEventSettings;
    private org.json.JSONObject _webPlayerSettings;
    private com.unity3d.services.ads.webplayer.WebPlayerView _webPlayerView;
    private org.json.JSONObject _webSettings;

    public BannerWebPlayerContainer(android.content.Context context, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, com.unity3d.services.banners.UnityBannerSize unityBannerSize) {
        super(context);
        this._lastVisibility = -1;
        this._unsubscribeLayoutChange = null;
        this._size = unityBannerSize;
        this._bannerAdId = str;
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
        this._webPlayerEventSettings = jSONObject3;
        com.unity3d.services.ads.webplayer.WebPlayerView webPlayerView = new com.unity3d.services.ads.webplayer.WebPlayerView(context, str, this._webSettings, this._webPlayerSettings);
        this._webPlayerView = webPlayerView;
        webPlayerView.setEventSettings(this._webPlayerEventSettings);
        subscribeOnLayoutChange();
        addView(this._webPlayerView);
        setupLayoutParams();
    }

    private void subscribeOnLayoutChange() {
        java.lang.Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        final android.view.View.OnLayoutChangeListener onLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.unity3d.services.banners.view.BannerWebPlayerContainer.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                com.unity3d.services.banners.view.BannerWebPlayerContainer.this.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        addOnLayoutChangeListener(onLayoutChangeListener);
        this._unsubscribeLayoutChange = new java.lang.Runnable() { // from class: com.unity3d.services.banners.view.BannerWebPlayerContainer.2
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.banners.view.BannerWebPlayerContainer.this.removeOnLayoutChangeListener(onLayoutChangeListener);
            }
        };
    }

    private void setupLayoutParams() {
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(java.lang.Math.round(com.unity3d.services.core.misc.ViewUtilities.pxFromDp(getContext(), this._size.getWidth())), java.lang.Math.round(com.unity3d.services.core.misc.ViewUtilities.pxFromDp(getContext(), this._size.getHeight()))));
        android.view.ViewGroup.LayoutParams layoutParams = this._webPlayerView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this._webPlayerView.setLayoutParams(layoutParams);
    }

    public void setWebPlayerEventSettings(org.json.JSONObject jSONObject) {
        this._webPlayerEventSettings = jSONObject;
    }

    public void setWebPlayerSettings(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        this._webSettings = jSONObject;
        this._webPlayerSettings = jSONObject2;
    }

    public void destroy() {
        java.lang.Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.banners.view.BannerWebPlayerContainer.3
            @Override // java.lang.Runnable
            public void run() {
                this.removeAllViews();
                android.view.ViewParent parent = this.getParent();
                if (parent != null && (parent instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) parent).removeView(this);
                }
                if (this._webPlayerView != null) {
                    this._webPlayerView.destroy();
                }
                this._webPlayerView = null;
            }
        });
    }

    public com.unity3d.services.ads.webplayer.WebPlayerView getWebPlayer() {
        return this._webPlayerView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.unity3d.services.banners.bridge.BannerBridge.didAttach(this._bannerAdId);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.unity3d.services.banners.bridge.BannerBridge.didDetach(this._bannerAdId);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 && i4 == 0) {
            return;
        }
        com.unity3d.services.banners.bridge.BannerBridge.resize(this._bannerAdId, getLeft(), getRight(), i, i2, getAlpha());
        android.graphics.Rect rect = new android.graphics.Rect();
        getHitRect(rect);
        if (((android.view.View) getParent()).getLocalVisibleRect(rect)) {
            onVisibilityChanged(this, 8);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        if (view == this) {
            int i2 = this._lastVisibility;
            if (i2 == -1) {
                this._lastVisibility = i;
                return;
            }
            if (i != 0 && i2 == 0) {
                com.unity3d.services.banners.bridge.BannerBridge.visibilityChanged(this._bannerAdId, i);
            }
            this._lastVisibility = i;
        }
    }

    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        com.unity3d.services.banners.bridge.BannerBridge.resize(this._bannerAdId, i, i2, i3, i4, getAlpha());
        if (getParent() != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            getHitRect(rect);
            if (!(getParent() instanceof android.view.View) || ((android.view.View) getParent()).getLocalVisibleRect(rect)) {
                return;
            }
            onVisibilityChanged(this, 8);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        onLayoutChange(this, getLeft(), getTop(), getRight(), getBottom(), getLeft(), getTop(), getRight(), getBottom());
    }
}

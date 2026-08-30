package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AdNativeComponentView extends android.widget.RelativeLayout implements com.facebook.ads.internal.api.AdComponentView {
    protected com.facebook.ads.internal.api.AdComponentViewApi mAdComponentViewApi;
    private final com.facebook.ads.internal.api.AdComponentViewParentApi mAdComponentViewParentApi;

    public abstract android.view.View getAdContentsView();

    public AdNativeComponentView(android.content.Context context) {
        super(context);
        this.mAdComponentViewParentApi = new com.facebook.ads.internal.api.AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdNativeComponentView.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onMeasure(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setMeasuredDimension(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(android.view.View view, int i) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onVisibilityChanged(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i, i2);
            }
        };
    }

    public AdNativeComponentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdComponentViewParentApi = new com.facebook.ads.internal.api.AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdNativeComponentView.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onMeasure(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setMeasuredDimension(i, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(android.view.View view, int i) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onVisibilityChanged(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i, i2);
            }
        };
    }

    public AdNativeComponentView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAdComponentViewParentApi = new com.facebook.ads.internal.api.AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdNativeComponentView.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i2, int i3) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onMeasure(i2, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i2, int i3) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setMeasuredDimension(i2, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(android.view.View view, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onVisibilityChanged(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i2, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i2) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i2);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i2, int i3) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i2, i3);
            }
        };
    }

    public AdNativeComponentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mAdComponentViewParentApi = new com.facebook.ads.internal.api.AdComponentViewParentApi() { // from class: com.facebook.ads.internal.api.AdNativeComponentView.1
            @Override // com.facebook.ads.internal.api.AdComponentView
            public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setLayoutParams(layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onMeasure(int i3, int i4) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onMeasure(i3, i4);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void setMeasuredDimension(int i3, int i4) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.setMeasuredDimension(i3, i4);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onAttachedToWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onAttachedToWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onDetachedFromWindow() {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onDetachedFromWindow();
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void bringChildToFront(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.bringChildToFront(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void onWindowFocusChanged(boolean z) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onWindowFocusChanged(z);
            }

            @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
            public void onVisibilityChanged(android.view.View view, int i3) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.onVisibilityChanged(view, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i3, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i3, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i3) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i3);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
            public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, layoutParams);
            }

            @Override // com.facebook.ads.internal.api.AdComponentView
            public void addView(android.view.View view, int i3, int i4) {
                com.facebook.ads.internal.api.AdNativeComponentView.super.addView(view, i3, i4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void attachAdComponentViewApi(com.facebook.ads.internal.api.AdComponentViewApiProvider adComponentViewApiProvider) {
        if (com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.isFallbackMode()) {
            return;
        }
        if (this.mAdComponentViewApi == null) {
            adComponentViewApiProvider.getAdComponentViewApi().onAttachedToView(this, this.mAdComponentViewParentApi);
            this.mAdComponentViewApi = adComponentViewApiProvider.getAdComponentViewApi();
            return;
        }
        throw new java.lang.IllegalStateException("AdComponentViewApi can't be attached more then once.");
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, int i) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, int i, int i2) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.setLayoutParams(layoutParams);
        } else {
            super.setLayoutParams(layoutParams);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onVisibilityChanged(view, i);
        } else {
            super.onVisibilityChanged(view, i);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onWindowFocusChanged(z);
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onDetachedFromWindow();
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(android.view.View view) {
        com.facebook.ads.internal.api.AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.bringChildToFront(view);
        } else {
            super.bringChildToFront(view);
        }
    }
}

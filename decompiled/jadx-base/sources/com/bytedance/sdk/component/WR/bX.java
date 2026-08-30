package com.bytedance.sdk.component.WR;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends android.webkit.WebView {
    private final java.util.HashSet<java.lang.String> IL;
    private boolean bX;
    public long bg;
    private boolean eqN;
    private com.bytedance.sdk.component.WR.bg ldr;
    private boolean zx;

    public bX(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IL = new java.util.HashSet<>();
        this.bg = java.lang.System.currentTimeMillis();
        bg();
    }

    public bX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IL = new java.util.HashSet<>();
        this.bg = java.lang.System.currentTimeMillis();
        bg();
    }

    public void setArbitrageTouchListener(com.bytedance.sdk.component.WR.bg bgVar) {
        this.ldr = bgVar;
    }

    private void bg() {
        android.webkit.WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new com.bytedance.sdk.component.WR.eqN.bg());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        new java.lang.StringBuilder("addJavascriptInterface: ").append(str).append(", ").append(this);
        if (!this.bX && !this.zx) {
            super.addJavascriptInterface(obj, str);
            this.IL.add(str);
        } else {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(java.lang.String str) {
        if (this.bX || this.zx) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.IL.remove(str);
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (!this.bX && !this.zx) {
            try {
                super.onPause();
                return;
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "onPause: ", e);
                return;
            }
        }
        com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "onPause: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (!this.bX && !this.zx) {
            try {
                super.onResume();
                return;
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "onResume: ", e);
                return;
            }
        }
        com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "onResume: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (!this.bX && !this.zx) {
            try {
                super.stopLoading();
                return;
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "stopLoading: ", e);
                return;
            }
        }
        com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (!this.bX && !this.zx) {
            super.reload();
        } else {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "reload: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (!this.bX && !this.zx) {
            super.goBack();
        } else {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (!this.bX && !this.zx) {
            super.goForward();
        } else {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (!this.bX && !this.zx) {
            super.goBackOrForward(i);
        } else {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (!this.bX && !this.zx) {
            super.clearCache(z);
        } else {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(java.lang.String str) {
        if (!this.bX && !this.zx) {
            try {
                super.loadUrl(str);
                return;
            } catch (java.lang.Exception | java.lang.IncompatibleClassChangeError | java.lang.NoClassDefFoundError e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void loadUrl(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (!this.bX && !this.zx) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (java.lang.Exception | java.lang.IncompatibleClassChangeError | java.lang.NoClassDefFoundError e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.bX || this.zx) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (!this.bX && !this.zx) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        if (!this.bX && !this.zx) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(java.lang.String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        new java.lang.StringBuilder("onAttachedToWindow: ").append(this);
    }

    public void setDestroyOnDetached(boolean z) {
        this.eqN = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        new java.lang.StringBuilder("onDetachedFromWindow: ").append(this);
        if (this.eqN) {
            destroy();
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.bX || this.zx) {
            return;
        }
        super.resumeTimers();
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.bX || this.zx) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.bX || this.zx) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        new java.lang.StringBuilder("destroy() called, ").append(this);
        if (this.bX) {
            return;
        }
        this.bX = true;
        IL();
        super.destroy();
    }

    private void IL() {
        if (this.bX) {
            return;
        }
        android.view.ViewParent parent = getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        java.util.Iterator<java.lang.String> it = this.IL.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    public void setRecycler(boolean z) {
        this.zx = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        com.bytedance.sdk.component.WR.bg bgVar = this.ldr;
        if (bgVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            bgVar.bg(onTouchListener);
            super.setOnTouchListener(this.ldr);
        }
    }
}

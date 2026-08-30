package com.bytedance.sdk.component.WR;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends android.widget.FrameLayout {
    private static com.bytedance.sdk.component.WR.eqN.bX DDQ;
    private com.bytedance.sdk.component.WR.eqN.IL Fy;
    private java.lang.String IL;
    private java.util.concurrent.atomic.AtomicBoolean JAA;
    private java.util.concurrent.atomic.AtomicBoolean Ja;
    private long Kg;
    private com.bytedance.sdk.component.utils.LZ LZ;
    private java.util.List<java.lang.String> Lq;
    private android.view.View PX;
    private com.bytedance.sdk.component.WR.bg.InterfaceC0101bg Ta;
    private long Uq;
    private com.bytedance.sdk.component.WR.eqN.InterfaceC0102eqN Uw;
    private volatile android.webkit.WebView VB;
    private float VzQ;
    private long WR;
    private long aGH;
    private org.json.JSONObject bX;
    private com.bytedance.sdk.component.WR.IL.bg bg;
    private boolean eo;
    private boolean eqN;
    private long iR;
    private java.util.concurrent.atomic.AtomicBoolean kMt;
    private float ldr;
    private android.content.Context rri;
    private android.util.AttributeSet tC;
    private int tuV;
    private float vb;
    private float xxp;
    private com.bytedance.sdk.component.WR.bg yDt;
    private float zx;

    public interface IL {
    }

    public interface bX {
        android.webkit.WebView createWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.WR.eqN$eqN, reason: collision with other inner class name */
    public interface InterfaceC0102eqN {
    }

    private static void bX(android.content.Context context) {
    }

    private static android.content.Context bg(android.content.Context context) {
        return context;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public com.bytedance.sdk.component.WR.IL.bg getMaterialMeta() {
        return this.bg;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.WR.IL.bg bgVar) {
        this.bg = bgVar;
    }

    @Override // android.view.View
    public java.lang.String getTag() {
        return this.IL;
    }

    public void setTag(java.lang.String str) {
        this.IL = str;
        com.bytedance.sdk.component.WR.bg bgVar = this.yDt;
        if (bgVar != null) {
            bgVar.bg(str);
        }
    }

    public void setLandingPage(boolean z) {
        this.eqN = z;
    }

    public void setTouchStateListener(com.bytedance.sdk.component.WR.eqN.InterfaceC0102eqN interfaceC0102eqN) {
        this.Uw = interfaceC0102eqN;
    }

    public eqN(android.content.Context context) {
        this(bg(context), false);
    }

    public eqN(android.content.Context context, boolean z) {
        super(bg(context));
        this.zx = 0.0f;
        this.ldr = 0.0f;
        this.iR = 0L;
        this.Kg = 0L;
        this.WR = 0L;
        this.eo = false;
        this.vb = 20.0f;
        this.VzQ = 50.0f;
        this.kMt = new java.util.concurrent.atomic.AtomicBoolean();
        this.JAA = new java.util.concurrent.atomic.AtomicBoolean();
        this.Ja = new java.util.concurrent.atomic.AtomicBoolean();
        this.rri = context;
        if (z) {
            return;
        }
        try {
            this.VB = bg((android.util.AttributeSet) null, 0);
            IL();
        } catch (java.lang.Throwable unused) {
        }
        IL(bg(context));
    }

    public void bg(boolean z, int i, int i2, java.util.List<java.lang.Integer> list, int i3, java.util.List<java.lang.String> list2) {
        if (z && this.VB != null && (this.VB instanceof com.bytedance.sdk.component.WR.bX)) {
            this.yDt = new com.bytedance.sdk.component.WR.bg(this.rri, i, i2, list, i3);
            this.Lq = list2;
            if (!android.text.TextUtils.isEmpty(this.IL)) {
                this.yDt.bg(this.IL);
            }
            ((com.bytedance.sdk.component.WR.bX) this.VB).setArbitrageTouchListener(this.yDt);
            this.Ta = this.yDt.bg();
        }
    }

    public void bg(boolean z, android.view.View view) {
        if (z) {
            this.PX = view;
            if (view == null || view.getParent() != null) {
                return;
            }
            addView(this.PX, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
    }

    public android.view.View getArbitrageLoadingView() {
        return this.PX;
    }

    public void f_() {
        try {
            this.VB = bg(this.tC, 0);
            IL();
            IL(bg(this.rri));
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("SSWebView.TAG", "initWebview: " + th.getMessage());
        }
    }

    public static void setWebViewProvider(com.bytedance.sdk.component.WR.eqN.bX bXVar) {
        DDQ = bXVar;
    }

    private android.webkit.WebView bg(android.util.AttributeSet attributeSet, int i) {
        com.bytedance.sdk.component.WR.eqN.bX bXVar = DDQ;
        if (bXVar != null) {
            return bXVar.createWebView(getContext(), attributeSet, i);
        }
        if (attributeSet == null) {
            return new android.webkit.WebView(bg(this.rri));
        }
        return new android.webkit.WebView(bg(this.rri), attributeSet);
    }

    public void setRecycler(boolean z) {
        if (this.VB == null || !(this.VB instanceof com.bytedance.sdk.component.WR.bX)) {
            return;
        }
        ((com.bytedance.sdk.component.WR.bX) this.VB).setRecycler(z);
    }

    public void IL() {
        if (this.VB != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.VB.setId(520093704);
            } catch (java.lang.Throwable unused) {
            }
            addView(this.VB, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void IL(android.content.Context context) {
        bX(context);
        vb();
        Lq();
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.VB.setNetworkAvailable(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            setJavaScriptEnabled(str);
            this.VB.loadUrl(str, map);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void a_(java.lang.String str) {
        try {
            setJavaScriptEnabled(str);
            this.VB.loadUrl(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        try {
            setJavaScriptEnabled(str);
            this.VB.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bX() {
        try {
            this.VB.stopLoading();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void eqN() {
        try {
            this.VB.reload();
        } catch (java.lang.Throwable unused) {
        }
    }

    public boolean zx() {
        if (this.VB == null) {
            return false;
        }
        try {
            return this.VB.canGoBack();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public void ldr() {
        try {
            this.VB.goBack();
        } catch (java.lang.Throwable unused) {
        }
    }

    public boolean iR() {
        if (this.VB == null) {
            return false;
        }
        try {
            return this.VB.canGoForward();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public void Kg() {
        try {
            this.VB.goForward();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void WR() {
        if (this.VB != null) {
            this.VB.onResume();
        }
    }

    public java.lang.String getUrl() {
        if (this.VB == null) {
            return null;
        }
        try {
            return this.VB.getUrl();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public java.lang.String getOriginalUrl() {
        java.lang.String url;
        if (this.VB == null) {
            return null;
        }
        try {
            java.lang.String originalUrl = this.VB.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.VB.getUrl()) == null || !url.startsWith("file://")) ? originalUrl : url;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.VB == null) {
            return 0;
        }
        try {
            return this.VB.getProgress();
        } catch (java.lang.Throwable unused) {
            return 100;
        }
    }

    public int getContentHeight() {
        if (this.VB == null) {
            return 0;
        }
        try {
            return this.VB.getContentHeight();
        } catch (java.lang.Throwable unused) {
            return 1;
        }
    }

    public void bg(boolean z) {
        try {
            this.VB.clearCache(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void eo() {
        try {
            this.VB.clearHistory();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.webkit.WebView.setDataDirectorySuffix(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(android.webkit.WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof com.bytedance.sdk.component.WR.eqN.InterfaceC0102eqN) {
                setTouchStateListener((com.bytedance.sdk.component.WR.eqN.InterfaceC0102eqN) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new com.bytedance.sdk.component.WR.eqN.bg();
            }
            this.VB.setWebViewClient(new com.bytedance.sdk.component.WR.zx(this.Ta, webViewClient, this.Lq));
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setDownloadListener(android.webkit.DownloadListener downloadListener) {
        try {
            this.VB.setDownloadListener(downloadListener);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setWebChromeClient(android.webkit.WebChromeClient webChromeClient) {
        try {
            this.VB.setWebChromeClient(webChromeClient);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.VB.setBackgroundColor(i);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.VB == null) {
            return;
        }
        try {
            this.VB.computeScroll();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent viewParentBg;
        try {
            bg(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.eo && (viewParentBg = bg(this)) != null) {
                viewParentBg.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (java.lang.Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.eo = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected android.view.ViewParent bg(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if ((parent instanceof android.widget.AbsListView) || (parent instanceof android.widget.ScrollView) || (parent instanceof android.widget.HorizontalScrollView) || !(parent instanceof android.view.View)) {
            return parent;
        }
        android.view.View view2 = (android.view.View) parent;
        return (IL(view2) || bX(view2)) ? parent : bg(view2);
    }

    private static boolean IL(android.view.View view) {
        try {
            java.lang.Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.lang.Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (java.lang.Throwable unused2) {
            return false;
        }
    }

    private static boolean bX(android.view.View view) {
        try {
            java.lang.Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.lang.Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (java.lang.Throwable unused2) {
            return false;
        }
    }

    @Override // android.view.View
    public void setLayerType(int i, android.graphics.Paint paint) {
        try {
            this.VB.setLayerType(i, paint);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.VB.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void Lq() {
        if (this.VB == null) {
            return;
        }
        try {
            this.VB.removeJavascriptInterface("searchBoxJavaBridge_");
            this.VB.removeJavascriptInterface("accessibility");
            this.VB.removeJavascriptInterface("accessibilityTraversal");
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg(java.lang.Object obj, java.lang.String str) {
        try {
            this.VB.addJavascriptInterface(obj, str);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.VB.getSettings().setJavaScriptEnabled(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.VB.getSettings().setDisplayZoomControls(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.VB.getSettings().setCacheMode(i);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void vb() {
        try {
            android.webkit.WebSettings settings = this.VB.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private void setJavaScriptEnabled(java.lang.String str) {
        android.webkit.WebSettings settings;
        try {
            if (android.text.TextUtils.isEmpty(str) || (settings = this.VB.getSettings()) == null) {
                return;
            }
            if (android.net.Uri.parse(str).getScheme().equalsIgnoreCase(com.ironsource.y8.h.b)) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void VB() {
        if (this.VB == null) {
            return;
        }
        try {
            this.VB.onPause();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public java.lang.String getUserAgentString() {
        if (this.VB == null) {
            return "";
        }
        try {
            return this.VB.getSettings().getUserAgentString();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public android.webkit.WebView getWebView() {
        return this.VB;
    }

    public void PX() {
        if (this.VB == null) {
            return;
        }
        try {
            this.VB.destroy();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void b_(java.lang.String str) {
        try {
            this.VB.removeJavascriptInterface(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            this.VB.getSettings().setAppCacheEnabled(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setSupportZoom(boolean z) {
        try {
            this.VB.getSettings().setSupportZoom(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.VB.getSettings().setUseWideViewPort(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.VB.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.VB.getSettings().setDomStorageEnabled(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.VB.getSettings().setBuiltInZoomControls(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.VB.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.VB.getSettings().setLoadWithOverviewMode(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setUserAgentString(java.lang.String str) {
        try {
            this.VB.getSettings().setUserAgentString(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(java.lang.String str) {
        try {
            this.VB.getSettings().setDefaultTextEncodingName(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.VB.getSettings().setDefaultFontSize(i);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setMixedContentMode(int i) {
        try {
            this.VB.getSettings().setMixedContentMode(i);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.VB.getSettings().setDatabaseEnabled(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.VB.setVisibility(i);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.VB.setAlpha(f);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.VB.getSettings().setAllowFileAccess(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void Ta() {
        try {
            this.VB.clearView();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void yDt() {
        try {
            this.VB.pauseTimers();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.VB.removeAllViews();
        } catch (java.lang.Throwable unused) {
        }
    }

    private void xxp() {
        if (this.LZ == null) {
            this.Ja.set(false);
            this.LZ = new com.bytedance.sdk.component.utils.LZ(getContext());
        }
        new java.lang.Object() { // from class: com.bytedance.sdk.component.WR.eqN.1
        };
        this.Ja.set(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.kMt.set(true);
        if (!this.JAA.get() || this.Ja.get()) {
            return;
        }
        xxp();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.kMt.set(false);
    }

    public long getLandingPageClickBegin() {
        return this.Uq;
    }

    public void setLandingPageClickBegin(long j) {
        this.Uq = j;
    }

    public long getLandingPageClickEnd() {
        return this.aGH;
    }

    public void setLandingPageClickEnd(long j) {
        this.aGH = j;
    }

    private void bg(android.view.MotionEvent motionEvent) {
        if (!this.eqN || this.bg == null) {
            return;
        }
        if ((this.IL == null && this.bX == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zx = motionEvent.getRawX();
                this.ldr = motionEvent.getRawY();
                this.iR = java.lang.System.currentTimeMillis();
                this.bX = new org.json.JSONObject();
                if (this.VB != null) {
                    this.Uq = this.iR;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.bX.put("start_x", java.lang.String.valueOf(this.zx));
                this.bX.put("start_y", java.lang.String.valueOf(this.ldr));
                this.bX.put("offset_x", java.lang.String.valueOf(motionEvent.getRawX() - this.zx));
                this.bX.put("offset_y", java.lang.String.valueOf(motionEvent.getRawY() - this.ldr));
                this.bX.put("url", java.lang.String.valueOf(getUrl()));
                this.bX.put("tag", "");
                this.Kg = java.lang.System.currentTimeMillis();
                if (this.VB != null) {
                    this.aGH = this.Kg;
                }
                this.bX.put("down_time", this.iR);
                this.bX.put("up_time", this.Kg);
                if (com.bytedance.sdk.component.WR.bg.bg.bg().IL() != null) {
                    long j = this.WR;
                    long j2 = this.iR;
                    if (j != j2) {
                        this.WR = j2;
                        com.bytedance.sdk.component.WR.bg.bg.bg().IL().bg(this.bg, this.IL, "in_web_click", this.bX, this.Kg - this.iR);
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.vb = f;
    }

    public void setDeepShakeValue(float f) {
        this.xxp = f;
    }

    public void setWriggleValue(float f) {
        this.VzQ = f;
    }

    public void setCalculationMethod(int i) {
        this.tuV = i;
    }

    public void setOnShakeListener(com.bytedance.sdk.component.WR.eqN.IL il) {
        this.Fy = il;
    }

    public static class bg extends android.webkit.WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.WR.eqN.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            return true;
        }
    }
}

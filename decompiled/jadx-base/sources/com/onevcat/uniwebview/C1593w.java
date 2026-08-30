package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1593w extends android.webkit.WebView implements com.onevcat.uniwebview.InterfaceC1581s {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f3765a;
    public final java.lang.String b;
    public final com.onevcat.uniwebview.c2 c;
    public final com.onevcat.uniwebview.I d;
    public final com.onevcat.uniwebview.J e;
    public final com.onevcat.uniwebview.W f;
    public boolean g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593w(android.app.Activity activity, android.view.ViewGroup containerView, android.view.ViewGroup videoView, java.lang.String name, com.onevcat.uniwebview.c2 messageSender, com.onevcat.uniwebview.V1 loadingObserver) {
        super(activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoView, "videoView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingObserver, "loadingObserver");
        this.f3765a = activity;
        this.b = name;
        this.c = messageSender;
        this.h = true;
        getSettings().setDatabaseEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setGeolocationEnabled(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(com.onevcat.uniwebview.AbstractC1590v.d);
        getSettings().setMixedContentMode(2);
        getSettings().setJavaScriptEnabled(com.onevcat.uniwebview.AbstractC1590v.c);
        getSettings().setMediaPlaybackRequiresUserGesture(!com.onevcat.uniwebview.AbstractC1590v.f3762a);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(com.onevcat.uniwebview.AbstractC1590v.b);
        java.lang.String path = getContext().getCacheDir().getPath();
        android.webkit.WebSettings settings = getSettings();
        if (settings != null && path != null && path.length() != 0 && android.os.Build.VERSION.SDK_INT < 33) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.webkit.WebSettings");
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setAppCachePath", java.lang.String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, path);
                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod("setAppCacheEnabled", java.lang.Boolean.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, java.lang.Boolean.TRUE);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.onevcat.uniwebview.I i2 = new com.onevcat.uniwebview.I(this.f3765a, this, containerView, videoView, com.onevcat.uniwebview.AbstractC1590v.f);
        this.d = i2;
        setWebChromeClient(i2);
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        com.onevcat.uniwebview.J j = new com.onevcat.uniwebview.J(context, this, loadingObserver);
        this.e = j;
        setWebViewClient(j);
        com.onevcat.uniwebview.W w = new com.onevcat.uniwebview.W(this.f3765a, this.b, this.c, new com.onevcat.uniwebview.C1584t(this));
        this.f = w;
        w.a();
        a();
    }

    public static final boolean a(android.view.View view) {
        return true;
    }

    public final void a(java.lang.String jsString, final java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsString, "jsString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, com.onevcat.uniwebview.AbstractC1575q.a("Adding JavaScript string to web view. Requesting string: ", jsString, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        evaluateJavascript(jsString, new android.webkit.ValueCallback() { // from class: com.onevcat.uniwebview.w$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.onevcat.uniwebview.C1593w.a(identifier, this, (java.lang.String) obj);
            }
        });
    }

    public final void b(java.lang.String jsString, final java.lang.String identifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsString, "jsString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, com.onevcat.uniwebview.AbstractC1575q.a("Evaluating JavaScript string within web view. Requesting string: ", jsString, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        evaluateJavascript(jsString, new android.webkit.ValueCallback() { // from class: com.onevcat.uniwebview.w$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.onevcat.uniwebview.C1593w.b(identifier, this, (java.lang.String) obj);
            }
        });
    }

    public final void c() {
        java.lang.Object systemService = this.f3765a.getSystemService("print");
        android.print.PrintManager printManager = systemService instanceof android.print.PrintManager ? (android.print.PrintManager) systemService : null;
        if (printManager == null) {
            com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
            com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Didn't find a valid print service in current activity. Abort printing...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "Didn't find a valid print service in current activity. Abort printing...");
            return;
        }
        java.lang.String url = getUrl();
        if (url != null) {
            android.print.PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = createPrintDocumentAdapter(url);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(printDocumentAdapterCreatePrintDocumentAdapter, "createPrintDocumentAdapter(targetUrl)");
            printManager.print("UniWebView Printing", printDocumentAdapterCreatePrintDocumentAdapter, new android.print.PrintAttributes.Builder().build());
        } else {
            com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
            com.onevcat.uniwebview.C1560l c1560l4 = com.onevcat.uniwebview.C1560l.b;
            c1560l4.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("The URL of page is null. Abort printing...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l4.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, "The URL of page is null. Abort printing...");
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        com.onevcat.uniwebview.W w = this.f;
        w.f3696a.unregisterReceiver(w.g);
        super.destroy();
    }

    public final boolean getCalloutEnabled() {
        return this.h;
    }

    public final com.onevcat.uniwebview.W getDownloader$uniwebview_release() {
        return this.f;
    }

    public final com.onevcat.uniwebview.c2 getMessageSender() {
        return this.c;
    }

    public final java.lang.String getName() {
        return this.b;
    }

    public final boolean getSendDownloadEventForContextMenu() {
        return this.g;
    }

    public final java.lang.String getUserAgent() {
        java.lang.String userAgentString = getSettings().getUserAgentString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(userAgentString, "settings.userAgentString");
        return userAgentString;
    }

    public final com.onevcat.uniwebview.I get_webChromeClient$uniwebview_release() {
        return this.d;
    }

    public final com.onevcat.uniwebview.J get_webClient$uniwebview_release() {
        return this.e;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "UniWebView will load url: '" + url + "' with headers: " + this.e.g;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.J j = this.e;
        j.f = 200;
        j.d = true;
        j.c = false;
        j.e = false;
        if (j.h.a(url, true, this.b)) {
            return;
        }
        loadUrl(url, this.e.g);
    }

    @Override // android.view.View
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        final java.lang.String extra;
        if (this.h && contextMenu != null) {
            super.onCreateContextMenu(contextMenu);
            int type = getHitTestResult().getType();
            if ((type == 5 || type == 8) && (extra = getHitTestResult().getExtra()) != null) {
                java.lang.String lowerCase = extra.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (kotlin.text.StringsKt.startsWith$default(lowerCase, "http://", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "https://", false, 2, (java.lang.Object) null)) {
                    contextMenu.setHeaderTitle(extra).add(0, 1, 0, getContext().getResources().getString(com.onevcat.uniwebview.R.string.SAVE_IMAGE)).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.onevcat.uniwebview.w$$ExternalSyntheticLambda1
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                            return com.onevcat.uniwebview.C1593w.a(this.f$0, extra, menuItem);
                        }
                    });
                }
            }
        }
    }

    public final void setAllowHTTPAuthPopUpWindow(boolean z) {
        this.e.j = z;
    }

    public final void setCalloutEnabled(boolean z) {
        this.h = z;
    }

    public final void setDefaultFontSize(int i2) {
        getSettings().setDefaultFontSize(kotlin.math.MathKt.roundToInt(i2 / this.f3765a.getResources().getConfiguration().fontScale));
    }

    public final void setDragInteractionEnabled(boolean z) {
        android.view.View.OnLongClickListener onLongClickListener;
        if (z) {
            setLongClickable(false);
            onLongClickListener = null;
        } else {
            setLongClickable(true);
            onLongClickListener = new android.view.View.OnLongClickListener() { // from class: com.onevcat.uniwebview.w$$ExternalSyntheticLambda4
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return com.onevcat.uniwebview.C1593w.a(view);
                }
            };
        }
        setOnLongClickListener(onLongClickListener);
    }

    public final void setOpenLinksInExternalBrowser(boolean z) {
        this.e.h.e = z;
    }

    public final void setSendDownloadEventForContextMenu(boolean z) {
        this.g = z;
    }

    public final void setUserAgent(java.lang.String userAgent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        getSettings().setUserAgentString(userAgent);
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        this.e.c = true;
        super.stopLoading();
    }

    public static final void a(java.lang.String identifier, com.onevcat.uniwebview.C1593w this$0, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "$identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Receive callback of adding JavaScript: ", it, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        if (kotlin.text.StringsKt.equals(it, "null", true)) {
            this$0.c.a(this$0.b, com.onevcat.uniwebview.d2.AddJavaScriptFinished, new com.onevcat.uniwebview.Y1(identifier, "0", "", null));
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.c.a(this$0.b, com.onevcat.uniwebview.d2.AddJavaScriptFinished, new com.onevcat.uniwebview.Y1(identifier, "-1", it, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f3  */
    public static final void b(java.lang.String identifier, com.onevcat.uniwebview.C1593w this$0, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "$identifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Receive callback of evaluating JavaScript: ", it, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        if (kotlin.text.StringsKt.equals(it, "null", true)) {
            this$0.c.a(this$0.b, com.onevcat.uniwebview.d2.EvalJavaScriptFinished, new com.onevcat.uniwebview.Y1(identifier, "0", "", null));
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        java.lang.String strReplace = new kotlin.text.Regex("^\"|\"$").replace(it, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strReplace, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strReplace.length());
        int i2 = 0;
        while (i2 < strReplace.length()) {
            char cCharAt = strReplace.charAt(i2);
            char c = '\\';
            if (cCharAt == '\\') {
                char cCharAt2 = i2 == strReplace.length() - 1 ? '\\' : strReplace.charAt(i2 + 1);
                if ('0' > cCharAt2 || cCharAt2 >= '8') {
                    if (cCharAt2 != '\\') {
                        if (cCharAt2 == 'b') {
                            cCharAt = '\b';
                        } else if (cCharAt2 == 'n') {
                            cCharAt = '\n';
                        } else if (cCharAt2 == 'r') {
                            cCharAt = '\r';
                        } else if (cCharAt2 == 't') {
                            cCharAt = '\t';
                        } else {
                            c = kotlin.text.Typography.quote;
                            if (cCharAt2 != '\"') {
                                c = '\'';
                                if (cCharAt2 != '\'') {
                                    c = 'u';
                                    if (cCharAt2 == 'u') {
                                        if (i2 < strReplace.length() - 5) {
                                            sb.append(java.lang.Character.toChars(java.lang.Integer.parseInt("" + strReplace.charAt(i2 + 2) + strReplace.charAt(i2 + 3) + strReplace.charAt(i2 + 4) + strReplace.charAt(i2 + 5), kotlin.text.CharsKt.checkRadix(16))));
                                            i2 += 6;
                                        }
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                    cCharAt = c;
                    i2++;
                } else {
                    java.lang.String str = "" + cCharAt2;
                    int i3 = i2 + 1;
                    if (i3 < strReplace.length() - 1) {
                        int i4 = i2 + 2;
                        if (kotlin.jvm.internal.Intrinsics.compare((int) strReplace.charAt(i4), 48) >= 0 && kotlin.jvm.internal.Intrinsics.compare((int) strReplace.charAt(i4), 55) <= 0) {
                            str = str + strReplace.charAt(i4);
                            if (i4 < strReplace.length() - 1) {
                                i3 = i2 + 3;
                                if (kotlin.jvm.internal.Intrinsics.compare((int) strReplace.charAt(i3), 48) < 0 || kotlin.jvm.internal.Intrinsics.compare((int) strReplace.charAt(i3), 55) > 0) {
                                    i3 = i4;
                                } else {
                                    str = str + strReplace.charAt(i3);
                                }
                            } else {
                                i3 = i4;
                            }
                        }
                    }
                    sb.append((char) java.lang.Integer.parseInt(str, kotlin.text.CharsKt.checkRadix(8)));
                    i2 = i3 + 1;
                }
            }
            sb.append(cCharAt);
            i2++;
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        this$0.c.a(this$0.b, com.onevcat.uniwebview.d2.EvalJavaScriptFinished, new com.onevcat.uniwebview.Y1(identifier, "0", string, null));
    }

    public final void a() {
        setDownloadListener(new android.webkit.DownloadListener() { // from class: com.onevcat.uniwebview.w$$ExternalSyntheticLambda3
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
                com.onevcat.uniwebview.C1593w.a(this.f$0, str, str2, str3, str4, j);
            }
        });
    }

    public static final void a(com.onevcat.uniwebview.C1593w this$0, java.lang.String url, java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.onevcat.uniwebview.W w = this$0.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
        w.a(url, str2, str3, true);
    }

    public static final boolean a(com.onevcat.uniwebview.C1593w this$0, java.lang.String originalUrl, android.view.MenuItem it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalUrl, "$originalUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.f.a(originalUrl, null, android.webkit.MimeTypeMap.getFileExtensionFromUrl(originalUrl), this$0.g);
        return true;
    }

    public final void b() {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Checking pop up web view in generalGoBack.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l2.a(enumC1557k, "Checking pop up web view in generalGoBack.");
        com.onevcat.uniwebview.C1593w c1593w = this.d.i;
        if (c1593w != null) {
            if (c1593w.canGoBack()) {
                c1560l2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("popupWebView can go back. Performing going back.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                c1560l2.a(enumC1557k, "popupWebView can go back. Performing going back.");
                c1593w.goBack();
                return;
            }
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("popupWebView cannot go back. Performing close.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l2.a(enumC1557k, "popupWebView cannot go back. Performing close.");
            c1593w.evaluateJavascript("window.close()", null);
            return;
        }
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Checking main web view can go back...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l2.a(enumC1557k, "Checking main web view can go back...");
        if (canGoBack()) {
            goBack();
        }
    }

    public final void a(int i2, int i3, boolean z) {
        if (!z) {
            scrollTo(i2, i3);
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(this, "scrollX", getScrollX(), i2);
        android.animation.ObjectAnimator objectAnimatorOfInt2 = android.animation.ObjectAnimator.ofInt(this, "scrollY", getScrollY(), i3);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
        animatorSet.setDuration(400L).start();
    }
}

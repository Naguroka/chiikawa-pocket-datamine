package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class J extends android.webkit.WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f3666a;
    public final com.onevcat.uniwebview.V1 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public final java.util.LinkedHashMap g;
    public final com.onevcat.uniwebview.C1578r h;
    public final java.util.LinkedHashSet i;
    public boolean j;

    public J(android.content.Context context, com.onevcat.uniwebview.InterfaceC1581s responderDelegate, com.onevcat.uniwebview.V1 loadingObserver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responderDelegate, "responderDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingObserver, "loadingObserver");
        this.f3666a = context;
        this.b = loadingObserver;
        this.d = true;
        this.f = 200;
        this.g = new java.util.LinkedHashMap();
        this.h = new com.onevcat.uniwebview.C1578r(context, responderDelegate);
        this.i = new java.util.LinkedHashSet();
        this.j = true;
    }

    public final void a(final android.webkit.WebView webView, final android.webkit.HttpAuthHandler httpAuthHandler, final java.lang.String str, final java.lang.String str2) {
        final android.widget.EditText editText = new android.widget.EditText(this.f3666a);
        editText.setHint(this.f3666a.getResources().getString(com.onevcat.uniwebview.R.string.USERNAME));
        final android.widget.EditText editText2 = new android.widget.EditText(this.f3666a);
        editText2.setHint(this.f3666a.getResources().getString(com.onevcat.uniwebview.R.string.PASSWORD));
        editText2.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        android.app.AlertDialog.Builder message = new android.app.AlertDialog.Builder(this.f3666a).setTitle(this.f3666a.getResources().getString(com.onevcat.uniwebview.R.string.AUTH_REQUIRE_TITLE)).setMessage(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "Builder(context)\n       …        .setMessage(host)");
        com.onevcat.uniwebview.AbstractC1527a.a(message, editText, editText2).setCancelable(false).setPositiveButton(this.f3666a.getString(android.R.string.ok), new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.J$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.J.a(editText, editText2, this, str, str2, webView, httpAuthHandler, dialogInterface, i);
            }
        }).setNegativeButton(this.f3666a.getString(android.R.string.cancel), new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.J$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.J.a(httpAuthHandler, dialogInterface, i);
            }
        }).create().show();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        if (this.d) {
            if (this.e) {
                com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message = "WebClient onReceivedError for url: " + str + ", Error Code: -1202, Error: SSL error";
                c1560l.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
                this.b.a(com.onevcat.uniwebview.X1.a(str, -1202, "SSL error"));
                return;
            }
            if (!this.c) {
                com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
                java.lang.String message2 = "WebClient onPageFinished: " + str + ", HTTP Status Code: " + this.f;
                c1560l2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                c1560l2.a(com.onevcat.uniwebview.EnumC1557k.INFO, message2);
                this.b.a(str, this.f);
                return;
            }
            com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message3 = "WebClient onReceivedError for url: " + str + ", Error Code: -999, Error: Operation cancelled";
            c1560l3.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
            c1560l3.a(com.onevcat.uniwebview.EnumC1557k.INFO, message3);
            this.b.a(com.onevcat.uniwebview.X1.a(str, -999, "Operation cancelled"));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("WebClient onPageStarted: ", str, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        this.b.a(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        if (httpAuthHandler == null) {
            return;
        }
        if (!httpAuthHandler.useHttpAuthUsernamePassword() || webView == null) {
            str3 = null;
            str4 = null;
        } else {
            java.lang.String[] httpAuthUsernamePassword = android.os.Build.VERSION.SDK_INT >= 26 ? android.webkit.WebViewDatabase.getInstance(this.f3666a).getHttpAuthUsernamePassword(str, str2) : webView.getHttpAuthUsernamePassword(str, str2);
            if (httpAuthUsernamePassword == null || httpAuthUsernamePassword.length != 2) {
                str3 = null;
                str4 = null;
            } else {
                str3 = httpAuthUsernamePassword[0];
                str4 = httpAuthUsernamePassword[1];
            }
        }
        if (str3 != null && str4 != null) {
            httpAuthHandler.proceed(str3, str4);
        } else if (this.j) {
            a(webView, httpAuthHandler, str, str2);
        } else {
            httpAuthHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "WebClient onReceivedHttpError. Error Code: " + (webResourceResponse != null ? java.lang.Integer.valueOf(webResourceResponse.getStatusCode()) : null) + ", url: " + webResourceRequest + "?.url";
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l2.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        if (webResourceResponse == null || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.f = webResourceResponse.getStatusCode();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "WebClient onReceivedSslError. Error url: " + (sslError != null ? sslError.getUrl() : null) + ", Error type: " + (sslError != null ? java.lang.Integer.valueOf(sslError.getPrimaryError()) : null);
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.CRITICAL;
        c1560l.a(enumC1557k, message);
        if (sslError == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Receiving SSL error callback with `null` error. This should not happen.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(enumC1557k, "Receiving SSL error callback with `null` error. This should not happen.");
            this.e = true;
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Trying to process SSL error...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        com.onevcat.uniwebview.EnumC1557k enumC1557k2 = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l.a(enumC1557k2, "Trying to process SSL error...");
        try {
            java.lang.String host = new java.net.URI(sslError.getUrl()).getHost();
            android.net.http.SslCertificate certificate = sslError.getCertificate();
            if (certificate.getIssuedBy() != null && certificate.getIssuedTo() != null) {
                if (this.i.contains(host)) {
                    java.lang.String message2 = "Found domain '" + host + "' in exception list. Processing url.";
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                    c1560l.a(enumC1557k2, message2);
                    if (sslErrorHandler != null) {
                        sslErrorHandler.proceed();
                        return;
                    }
                    return;
                }
                java.lang.String message3 = "Domain '" + host + "' is not in exception list. Refuse proceeding url.";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
                c1560l.a(enumC1557k2, message3);
                this.e = true;
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Cannot get correct certificate issuer. SSL challenge failed.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l.a(enumC1557k2, "Cannot get correct certificate issuer. SSL challenge failed.");
            this.e = true;
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        } catch (java.lang.Exception e) {
            com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message4 = "Exception during handling SSL error: " + e;
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message4, "message");
            c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message4);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.onevcat.uniwebview.C1560l c1560l;
        java.lang.String message;
        if (renderProcessGoneDetail == null) {
            c1560l = com.onevcat.uniwebview.C1560l.b;
            message = "onRenderProcessGone is triggered. Detail: null";
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            c1560l = com.onevcat.uniwebview.C1560l.b;
            message = "onRenderProcessGone is triggered. didCrash: " + renderProcessGoneDetail.didCrash() + ", priority: " + renderProcessGoneDetail.rendererPriorityAtExit();
        } else {
            c1560l = com.onevcat.uniwebview.C1560l.b;
            message = "onRenderProcessGone is triggered.";
        }
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
        this.b.a();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (str == null) {
            return false;
        }
        if (this.h.a(str, false, webView instanceof com.onevcat.uniwebview.C1593w ? ((com.onevcat.uniwebview.C1593w) webView).getName() : null)) {
            return true;
        }
        this.f = 200;
        this.d = true;
        this.c = false;
        this.e = false;
        if (!(!this.g.isEmpty())) {
            return false;
        }
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Adding customize header to request. " + this.g;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message);
        if (webView != null) {
            webView.loadUrl(str, this.g);
        }
        return true;
    }

    public static final void a(android.widget.EditText userText, android.widget.EditText passwordText, com.onevcat.uniwebview.J this$0, java.lang.String str, java.lang.String str2, android.webkit.WebView webView, android.webkit.HttpAuthHandler handler, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userText, "$userText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordText, "$passwordText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "$handler");
        java.lang.String string = userText.getText().toString();
        java.lang.String string2 = passwordText.getText().toString();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.webkit.WebViewDatabase.getInstance(this$0.f3666a).setHttpAuthUsernamePassword(str, str2, string, string2);
        } else if (webView != null) {
            webView.setHttpAuthUsernamePassword(str, str2, string, string2);
        }
        handler.proceed(string, string2);
    }

    public static final void a(android.webkit.HttpAuthHandler handler, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "$handler");
        handler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "WebClient onReceivedError. Request: " + webResourceRequest + "; Error: " + webResourceError;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.INFO;
        c1560l.a(enumC1557k, message);
        if (webResourceRequest != null) {
            java.lang.String message2 = "WebClient request detail: " + webResourceRequest.getUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
            c1560l.a(enumC1557k, message2);
        }
        if (webResourceError != null) {
            java.lang.String message3 = "WebClient error detail: " + ((java.lang.Object) webResourceError.getDescription());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
            c1560l.a(enumC1557k, message3);
        }
        if (webResourceError == null || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.d = false;
        this.b.a(com.onevcat.uniwebview.X1.a(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString()));
    }
}

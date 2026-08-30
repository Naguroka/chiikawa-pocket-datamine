package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class I extends android.webkit.WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f3663a;
    public final com.onevcat.uniwebview.C1593w b;
    public final android.view.ViewGroup c;
    public final android.view.ViewGroup d;
    public final boolean e;
    public boolean f;
    public android.widget.FrameLayout g;
    public final java.util.LinkedHashSet h;
    public com.onevcat.uniwebview.C1593w i;
    public boolean j;

    public I(android.app.Activity activity, com.onevcat.uniwebview.C1593w webView, android.view.ViewGroup containerView, android.view.ViewGroup videoView, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f3663a = activity;
        this.b = webView;
        this.c = containerView;
        this.d = videoView;
        this.e = z;
        this.h = new java.util.LinkedHashSet();
    }

    public static final void a(android.webkit.JsResult jsResult, android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    public static final void b(android.webkit.JsResult jsResult, android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    public static final void c(android.webkit.JsResult jsResult, android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        super.onCloseWindow(webView);
        android.view.ViewParent parent = webView != null ? webView.getParent() : null;
        com.onevcat.uniwebview.C1593w c1593w = parent instanceof com.onevcat.uniwebview.C1593w ? (com.onevcat.uniwebview.C1593w) parent : null;
        if (c1593w == null) {
            return;
        }
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("onCloseWindow...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l.a(enumC1557k, "onCloseWindow...");
        java.lang.String message = "Get a parent view: " + c1593w;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(enumC1557k, message);
        c1593w.removeView(webView);
        com.onevcat.uniwebview.C1593w c1593w2 = c1593w.get_webChromeClient$uniwebview_release().i;
        if (c1593w2 != null) {
            c1593w.getMessageSender().a(c1593w.getName(), com.onevcat.uniwebview.d2.MultipleWindowClosed, c1593w2.getName());
            c1593w.get_webChromeClient$uniwebview_release().i = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        com.onevcat.uniwebview.EnumC1557k enumC1557k;
        java.lang.StringBuilder sb;
        com.onevcat.uniwebview.EnumC1557k enumC1557k2;
        java.lang.String str;
        java.lang.String str2;
        if (!this.e) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (consoleMessage == null) {
            return super.onConsoleMessage(null);
        }
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String str3 = consoleMessage.message() + ", source: " + consoleMessage.sourceId() + " line: " + consoleMessage.lineNumber();
        android.webkit.ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        int i = messageLevel == null ? -1 : com.onevcat.uniwebview.F.f3656a[messageLevel.ordinal()];
        if (i == -1) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (i != 1) {
            if (i == 2) {
                enumC1557k2 = com.onevcat.uniwebview.EnumC1557k.INFO;
                str = "log: " + str3;
                c1560l.getClass();
                str2 = "🟢";
            } else {
                if (i != 3) {
                    if (i == 4) {
                        enumC1557k2 = com.onevcat.uniwebview.EnumC1557k.CRITICAL;
                        str = "error: " + str3;
                        c1560l.getClass();
                        str2 = "🔴";
                    } else if (i == 5) {
                        enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
                        sb = new java.lang.StringBuilder("tip: ");
                    }
                    return true;
                }
                enumC1557k2 = com.onevcat.uniwebview.EnumC1557k.WARNING;
                str = "warning: " + str3;
                c1560l.getClass();
                str2 = "🟡";
            }
            com.onevcat.uniwebview.C1560l.a(enumC1557k2, str2, str);
            return true;
        }
        enumC1557k = com.onevcat.uniwebview.EnumC1557k.DEBUG;
        sb = new java.lang.StringBuilder("debug: ");
        java.lang.String string = sb.append(str3).toString();
        c1560l.getClass();
        com.onevcat.uniwebview.C1560l.a(enumC1557k, "🔵", string);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("onCreateWindow...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
        c1560l.a(enumC1557k, "onCreateWindow...");
        android.webkit.WebView.HitTestResult hitTestResult = webView != null ? webView.getHitTestResult() : null;
        java.lang.String extra = hitTestResult != null ? hitTestResult.getExtra() : null;
        java.lang.String message2 = "Checking hitting result, url: " + extra;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
        c1560l.a(enumC1557k, message2);
        if (this.b.get_webClient$uniwebview_release().h.a(extra, false)) {
            return false;
        }
        if (!this.b.getSettings().supportMultipleWindows() || (!z2 && !this.j)) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        android.app.Activity activity = this.f3663a;
        android.view.ViewGroup viewGroup = this.c;
        android.view.ViewGroup viewGroup2 = this.d;
        java.lang.String string = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        com.onevcat.uniwebview.C1593w c1593w = new com.onevcat.uniwebview.C1593w(activity, viewGroup, viewGroup2, string, new com.onevcat.uniwebview.H(), new com.onevcat.uniwebview.G());
        c1593w.getSettings().setUserAgentString(this.b.getSettings().getUserAgentString());
        c1593w.getSettings().setSupportMultipleWindows(true);
        c1593w.get_webChromeClient$uniwebview_release().j = this.j;
        c1593w.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (webView != null) {
            webView.addView(c1593w);
        }
        java.lang.Object obj = message != null ? message.obj : null;
        if (obj instanceof android.webkit.WebView.WebViewTransport) {
            ((android.webkit.WebView.WebViewTransport) obj).setWebView(c1593w);
        }
        if (message != null) {
            message.sendToTarget();
        }
        this.i = c1593w;
        this.b.getMessageSender().a(this.b.getName(), com.onevcat.uniwebview.d2.MultipleWindowOpened, c1593w.getName());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(str, true, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        if (this.f) {
            this.d.setVisibility(4);
            this.d.removeView(this.g);
            this.c.setVisibility(0);
            this.f = false;
            this.g = null;
            this.b.clearFocus();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
        new android.app.AlertDialog.Builder(this.f3663a).setTitle(str).setMessage(str2).setCancelable(false).setIcon(android.R.drawable.ic_dialog_alert).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.I.a(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
        new android.app.AlertDialog.Builder(this.f3663a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setPositiveButton(android.R.string.yes, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.I.b(jsResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.no, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.I.c(jsResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, final android.webkit.JsPromptResult jsPromptResult) {
        final android.widget.EditText editText = new android.widget.EditText(this.f3663a);
        editText.setSingleLine();
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        android.app.AlertDialog.Builder cancelable = new android.app.AlertDialog.Builder(this.f3663a).setTitle(str).setMessage(str2).setIcon(android.R.drawable.ic_dialog_info).setCancelable(false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cancelable, "Builder(activity)\n      …    .setCancelable(false)");
        com.onevcat.uniwebview.AbstractC1527a.a(cancelable, editText).setPositiveButton(android.R.string.yes, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.I.a(editText, jsPromptResult, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.no, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.onevcat.uniwebview.I.a(jsPromptResult, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) throws org.json.JSONException {
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "UniWebViewChromeClient onPermissionRequest. URL: " + (permissionRequest != null ? permissionRequest.getOrigin() : null);
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.INFO;
        c1560l.a(enumC1557k, message);
        if (permissionRequest == null) {
            return;
        }
        com.onevcat.uniwebview.B b = new com.onevcat.uniwebview.B(this.b.getName(), permissionRequest);
        com.onevcat.uniwebview.UniWebViewInterface.Companion.getClass();
        com.onevcat.uniwebview.E eA = com.onevcat.uniwebview.U1.a(b);
        java.lang.String message2 = "Getting result from 'RequestMediaCapturePermission' channel method: " + eA;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
        c1560l.a(enumC1557k, message2);
        if (eA != null) {
            java.lang.String string = eA.b.getString("result");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "json.getString(RESULT_KEY)");
            if (kotlin.jvm.internal.Intrinsics.areEqual(string, "grant")) {
                permissionRequest.grant(permissionRequest.getResources());
                return;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(string, "deny")) {
                permissionRequest.deny();
                return;
            } else {
                a(permissionRequest);
                return;
            }
        }
        if (this.h.isEmpty()) {
            a(permissionRequest);
            return;
        }
        java.lang.String message3 = "No RequestMediaCapturePermission channel method but valid permissionTrustDomains. Compatible onPermissionRequest. URL: " + permissionRequest.getOrigin();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
        c1560l.a(enumC1557k, message3);
        try {
            java.lang.String host = permissionRequest.getOrigin().getHost();
            if (host == null || !this.h.contains(host)) {
                java.lang.String message4 = "Permission domain '" + host + "' is not contained in allow list. Deny this request.";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message4, "message");
                com.onevcat.uniwebview.EnumC1557k enumC1557k2 = com.onevcat.uniwebview.EnumC1557k.CRITICAL;
                c1560l.a(enumC1557k2, message4);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                c1560l.a(enumC1557k2, "If you want to allow permission access from this domain, add it through `UniWebView.AddPermissionTrustDomain` first.");
                permissionRequest.deny();
            } else {
                java.lang.String message5 = "Permission domain '" + host + "' is contained in allow list. Granting...";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message5, "message");
                c1560l.a(enumC1557k, message5);
                permissionRequest.grant(permissionRequest.getResources());
            }
        } catch (java.lang.Exception e) {
            com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message6 = "onPermissionRequest failed due to exception: " + e.getMessage();
            c1560l2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message6, "message");
            c1560l2.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message6);
            permissionRequest.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        this.b.getMessageSender().a(this.b.getName(), com.onevcat.uniwebview.d2.PageProgressChanged, java.lang.String.valueOf(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof android.widget.FrameLayout) {
            this.f = true;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            this.g = frameLayout;
            this.c.setVisibility(4);
            this.d.setVisibility(0);
            this.d.addView(this.g, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (this.b.getSettings().getJavaScriptEnabled() && (frameLayout.getFocusedChild() instanceof android.view.SurfaceView)) {
                this.b.loadUrl("javascript:\n                    var _ytrp_html5_video_last;\n                    var _ytrp_html5_video = document.getElementsByTagName('video')[0];\n                    if (_ytrp_html5_video != undefined && _ytrp_html5_video != _ytrp_html5_video_last) {\n                      _ytrp_html5_video_last = _ytrp_html5_video;\n                      function _ytrp_html5_video_ended() {\n                        window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                      }\n                      window.location.href = 'uniwebviewinternal://__uniwebview_internal_video_end';\n                    }");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        com.onevcat.uniwebview.T handler = new com.onevcat.uniwebview.T(valueCallback, fileChooserParams);
        android.app.Activity context = this.f3663a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.onevcat.uniwebview.InterfaceC1601y.f3771a.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        java.lang.String handlerId = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
        com.onevcat.uniwebview.C1598x.b.put(handlerId, handler);
        handler.g = handlerId;
        handler.h = context;
        com.onevcat.uniwebview.W1 w1 = com.onevcat.uniwebview.UniWebViewProxyActivity.Companion;
        if (handlerId == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("handlerId");
            handlerId = null;
        }
        w1.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.onevcat.uniwebview.UniWebViewProxyActivity.class);
        intent.putExtra(com.onevcat.uniwebview.UniWebViewProxyActivity.HANDLER_ID, handlerId);
        context.startActivity(intent);
        return true;
    }

    public static final void a(android.widget.EditText input, android.webkit.JsPromptResult jsPromptResult, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "$input");
        java.lang.String string = input.getText().toString();
        dialogInterface.dismiss();
        if (jsPromptResult != null) {
            jsPromptResult.confirm(string);
        }
    }

    public static final void a(android.webkit.JsPromptResult jsPromptResult, android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    public final void a(final android.webkit.PermissionRequest permissionRequest) {
        android.content.res.Resources resources;
        int i;
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Prepare capture permission prompt. URL: " + permissionRequest.getOrigin() + "; resources: " + permissionRequest.getResources();
        c1560l2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l2.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        final java.lang.String[] resources2 = permissionRequest.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        java.util.ArrayList arrayList = new java.util.ArrayList(resources2.length);
        int length = resources2.length;
        int i2 = 0;
        while (true) {
            java.lang.String string = "unknown";
            if (i2 >= length) {
                break;
            }
            java.lang.String str = resources2[i2];
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1660821873) {
                    if (iHashCode != 968612586) {
                        if (iHashCode != 1069496794) {
                            if (iHashCode == 1233677653 && str.equals("android.webkit.resource.MIDI_SYSEX")) {
                                string = "MIDI sysex";
                            }
                        } else if (str.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                            string = "protected media ID";
                        }
                    } else if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        resources = this.f3663a.getResources();
                        i = com.onevcat.uniwebview.R.string.MICROPHONE;
                        string = resources.getString(i);
                    }
                } else if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    resources = this.f3663a.getResources();
                    i = com.onevcat.uniwebview.R.string.CAMERA;
                    string = resources.getString(i);
                }
            }
            arrayList.add(string);
            i2++;
        }
        java.lang.String strJoinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        java.lang.String host = permissionRequest.getOrigin().getHost();
        java.lang.String string2 = this.f3663a.getResources().getString(com.onevcat.uniwebview.R.string.MEDIA_CAPTURE_PERMISSION_REQUEST, host != null ? host : "unknown", strJoinToString$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activity.resources.getSt…QUEST, host, permissions)");
        new android.app.AlertDialog.Builder(this.f3663a).setTitle(this.f3663a.getResources().getString(com.onevcat.uniwebview.R.string.MEDIA_CAPTURE_PERMISSION_REQUEST_TITLE)).setMessage(string2).setCancelable(false).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                com.onevcat.uniwebview.I.a(permissionRequest, resources2, dialogInterface, i3);
            }
        }).setNegativeButton(android.R.string.cancel, new android.content.DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.I$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                com.onevcat.uniwebview.I.a(permissionRequest, dialogInterface, i3);
            }
        }).create().show();
    }

    public static final void a(android.webkit.PermissionRequest request, java.lang.String[] strArr, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        dialogInterface.dismiss();
        request.grant(strArr);
    }

    public static final void a(android.webkit.PermissionRequest request, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        dialogInterface.dismiss();
        request.deny();
    }
}

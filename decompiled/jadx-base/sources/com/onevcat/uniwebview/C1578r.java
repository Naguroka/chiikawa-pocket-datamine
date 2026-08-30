package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C1578r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f3752a;
    public final com.onevcat.uniwebview.InterfaceC1581s b;
    public final com.onevcat.uniwebview.C1560l c;
    public final java.util.Set d;
    public boolean e;

    public C1578r(android.content.Context context, com.onevcat.uniwebview.InterfaceC1581s delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3752a = context;
        this.b = delegate;
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        this.c = com.onevcat.uniwebview.C1560l.b;
        this.d = kotlin.collections.SetsKt.mutableSetOf("uniwebview");
    }

    public final boolean a(java.lang.String str, boolean z) {
        if (str == null || z || !this.e || ((com.onevcat.uniwebview.C1593w) this.b).getHitTestResult().getType() == 0) {
            return false;
        }
        com.onevcat.uniwebview.C1560l c1560l = this.c;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("UniWebView is opening links in external browser.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "UniWebView is opening links in external browser.");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        a(intent);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f1  */
    public final boolean a(java.lang.String url, boolean z, java.lang.String str) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent uri;
        android.content.Intent uri2;
        android.content.Intent intent4;
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (str != null) {
            com.onevcat.uniwebview.U1 u1 = com.onevcat.uniwebview.UniWebViewInterface.Companion;
            com.onevcat.uniwebview.C c = new com.onevcat.uniwebview.C(str, url);
            u1.getClass();
            com.onevcat.uniwebview.E eA = com.onevcat.uniwebview.U1.a(c);
            if (eA != null) {
                try {
                    if (!eA.b.getBoolean("result")) {
                        return true;
                    }
                } catch (java.lang.Exception e) {
                    com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                    java.lang.String message = "Exception during parsing result for `ShouldUniWebViewHandleRequest`: " + e + ". Result from managed code: " + eA.f3653a;
                    c1560l.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                    c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
                }
            }
        }
        java.util.Locale ROOT = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        java.lang.String url2 = url.toLowerCase(ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url2, "this as java.lang.String).toLowerCase(locale)");
        android.content.Intent intent5 = null;
        if (kotlin.text.StringsKt.startsWith$default(url2, "file:", false, 2, (java.lang.Object) null)) {
            com.onevcat.uniwebview.C1593w c1593w = (com.onevcat.uniwebview.C1593w) this.b;
            if (c1593w.getSettings().getAllowFileAccess()) {
                com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
                c1560l2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Loading a local file. The local file loading will never be overridden.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                c1560l2.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Loading a local file. The local file loading will never be overridden.");
                return false;
            }
            com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
            c1560l3.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l3.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Local file loading is disabled. To enable loading from a `file://` URL, call `SetAllowFileAccess` with true.");
            c1593w.c.a(c1593w.b, com.onevcat.uniwebview.d2.PageErrorReceived, new com.onevcat.uniwebview.Y1("", "-1", "Local file loading is disabled.", null));
            return true;
        }
        if (kotlin.text.StringsKt.startsWith$default(url2, "uniwebviewinternal://", false, 2, (java.lang.Object) null)) {
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) url2, (java.lang.CharSequence) "__uniwebview_internal_video_end", false, 2, (java.lang.Object) null)) {
                ((com.onevcat.uniwebview.C1593w) this.b).d.onHideCustomView();
            }
            com.onevcat.uniwebview.C1560l c1560l4 = this.c;
            c1560l4.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Url handled internally in UniWebView", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l4.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Url handled internally in UniWebView");
            return true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url2, "url");
        com.onevcat.uniwebview.C1560l c1560l5 = this.c;
        c1560l5.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, com.onevcat.uniwebview.AbstractC1575q.a("Checking url could match with a defined url scheme: ", url2, c1560l5, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        java.util.Set set = this.d;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.startsWith$default(url2, ((java.lang.String) it.next()) + "://", false, 2, (java.lang.Object) null)) {
                    com.onevcat.uniwebview.C1560l c1560l6 = this.c;
                    c1560l6.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, com.onevcat.uniwebview.AbstractC1575q.a("Found url matching scheme: ", url2, c1560l6, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
                    com.onevcat.uniwebview.C1560l c1560l7 = this.c;
                    java.lang.String message2 = "Url handled by defined scheme. Redirected to Unity. ".concat(url);
                    c1560l7.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                    c1560l7.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message2);
                    com.onevcat.uniwebview.C1593w c1593w2 = (com.onevcat.uniwebview.C1593w) this.b;
                    c1593w2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    c1593w2.c.a(c1593w2.b, com.onevcat.uniwebview.d2.MessageReceived, url);
                    return true;
                }
            }
        }
        com.onevcat.uniwebview.C1560l c1560l8 = this.c;
        c1560l8.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, com.onevcat.uniwebview.AbstractC1575q.a("Did not find a matched scheme for: ", url2, c1560l8, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        if (kotlin.text.StringsKt.startsWith$default(url2, "sms:", false, 2, (java.lang.Object) null)) {
            com.onevcat.uniwebview.C1560l c1560l9 = this.c;
            c1560l9.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Received sms url...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
            c1560l9.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Received sms url...");
            intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = null;
        }
        if (!a(intent)) {
            if (kotlin.text.StringsKt.startsWith$default(url2, "tel:", false, 2, (java.lang.Object) null)) {
                com.onevcat.uniwebview.C1560l c1560l10 = this.c;
                c1560l10.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Received tel url...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                c1560l10.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Received tel url...");
                intent2 = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse(url));
            } else {
                intent2 = null;
            }
            if (!a(intent2)) {
                if (kotlin.text.StringsKt.startsWith$default(url2, androidx.core.net.MailTo.MAILTO_SCHEME, false, 2, (java.lang.Object) null)) {
                    com.onevcat.uniwebview.C1560l c1560l11 = this.c;
                    c1560l11.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Received mailto url...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                    c1560l11.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Received mailto url...");
                    intent3 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse(url));
                } else {
                    intent3 = null;
                }
                if (!a(intent3)) {
                    if (kotlin.text.StringsKt.startsWith$default(url2, "intent:", false, 2, (java.lang.Object) null)) {
                        com.onevcat.uniwebview.C1560l c1560l12 = this.c;
                        c1560l12.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Received intent url...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                        c1560l12.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Received intent url...");
                        try {
                            uri = android.content.Intent.parseUri(url, 1);
                            if (this.f3752a.getPackageManager().resolveActivity(uri, 65536) == null) {
                                java.lang.String str2 = uri.getPackage();
                                if (str2 == null) {
                                    uri = null;
                                } else {
                                    android.content.Intent intent6 = new android.content.Intent("android.intent.action.VIEW");
                                    intent6.setData(android.net.Uri.parse("market://details?id=".concat(str2)));
                                    uri = intent6;
                                }
                            }
                        } catch (java.lang.Exception e2) {
                            com.onevcat.uniwebview.C1560l c1560l13 = this.c;
                            java.lang.String message3 = "Parsing intent url error: " + e2 + ".message";
                            c1560l13.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
                            c1560l13.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message3);
                        }
                    } else {
                        uri = null;
                    }
                    if (!a(uri)) {
                        if (kotlin.text.StringsKt.startsWith$default(url2, "market:", false, 2, (java.lang.Object) null)) {
                            com.onevcat.uniwebview.C1560l c1560l14 = this.c;
                            c1560l14.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Received market url...", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
                            c1560l14.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Received market url...");
                            try {
                                uri2 = android.content.Intent.parseUri(url, 1);
                            } catch (java.lang.Exception e3) {
                                com.onevcat.uniwebview.C1560l c1560l15 = this.c;
                                java.lang.String message4 = "Parsing market url error. " + e3.getMessage();
                                c1560l15.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message4, "message");
                                c1560l15.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message4);
                                uri2 = null;
                            }
                        } else {
                            uri2 = null;
                        }
                        if (!a(uri2)) {
                            if (a(url, z)) {
                                return true;
                            }
                            java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"http:", "https:", "file:", com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE});
                            if ((listListOf instanceof java.util.Collection) && listListOf.isEmpty()) {
                                intent4 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
                                listQueryIntentActivities = this.f3752a.getPackageManager().queryIntentActivities(intent4, 0);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                                if (!listQueryIntentActivities.isEmpty()) {
                                    intent5 = intent4;
                                }
                            } else {
                                java.util.Iterator it2 = listListOf.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        intent4 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
                                        listQueryIntentActivities = this.f3752a.getPackageManager().queryIntentActivities(intent4, 0);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                                        if (!listQueryIntentActivities.isEmpty()) {
                                            intent5 = intent4;
                                        }
                                    } else if (kotlin.text.StringsKt.startsWith$default(url2, (java.lang.String) it2.next(), false, 2, (java.lang.Object) null)) {
                                    }
                                }
                            }
                            if (a(intent5)) {
                                com.onevcat.uniwebview.C1560l c1560l16 = this.c;
                                java.lang.String message5 = "Url handled by a third party app: ".concat(url);
                                c1560l16.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message5, "message");
                                c1560l16.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message5);
                                return true;
                            }
                            com.onevcat.uniwebview.C1560l c1560l17 = this.c;
                            java.lang.String message6 = "Url is opening without overridden: ".concat(url);
                            c1560l17.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message6, "message");
                            c1560l17.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message6);
                            return false;
                        }
                    }
                }
            }
        }
        com.onevcat.uniwebview.C1560l c1560l18 = this.c;
        c1560l18.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Url handled by intent.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l18.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, "Url handled by intent.");
        return true;
    }

    public final boolean a(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            this.f3752a.startActivity(intent);
            return true;
        } catch (java.lang.Exception unused) {
            com.onevcat.uniwebview.C1560l c1560l = this.c;
            java.lang.String message = "No Activity found to handle Intent: " + intent.getData();
            c1560l.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
            return false;
        }
    }
}

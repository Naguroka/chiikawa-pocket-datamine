package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewInterface;", "", "<init>", "()V", "Companion", "com/onevcat/uniwebview/U1", "uniwebview_release"}, k = 1, mv = {1, 6, 0})
public final class UniWebViewInterface {
    public static final com.onevcat.uniwebview.U1 Companion = new com.onevcat.uniwebview.U1();
    public static final long RUN_SYNC_WAIT_TIME_MS = 5000;
    private static com.onevcat.uniwebview.UniWebViewNativeChannel channel;

    @kotlin.jvm.JvmStatic
    public static final void addJavaScript(java.lang.String str, java.lang.String str2, java.lang.String identifier) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "jsString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface addJavaScript to: ", str, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1531b0(str2, identifier));
    }

    @kotlin.jvm.JvmStatic
    public static final void addPermissionTrustDomain(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, com.ironsource.y8.i.D);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface addPermissionTrustDomain: ", str, ", domain: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1534c0(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void addSslExceptionDomain(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, com.ironsource.y8.i.D);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface addSslExceptionDomain: ", str, ", domain: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1537d0(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void addUrlScheme(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "scheme");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface addUrlScheme: ", str, ", scheme: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1540e0(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final boolean animateTo(java.lang.String str, int i, int i2, int i3, int i4, float f, float f2, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface animateTo: {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(str, new com.onevcat.uniwebview.C1543f0(i, i2, i3, i4, f, f2, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final void authenticationInit(java.lang.String str, java.lang.String str2, java.lang.String scheme) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface authenticationInit: " + str + ", url: " + str2 + ", scheme: " + scheme;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.C1546g0(str, str2, scheme));
    }

    @kotlin.jvm.JvmStatic
    public static final void authenticationSetPrivateMode(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface authenticationSetPrivateMode: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.C1549h0(name, z));
    }

    @kotlin.jvm.JvmStatic
    public static final void authenticationStart(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface authenticationStart: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.C1552i0(name));
    }

    @kotlin.jvm.JvmStatic
    public static final void bringContentToFront(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.C1555j0.f3731a);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canGoBack(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface canGoBack: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(name, com.onevcat.uniwebview.C1558k0.f3734a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canGoForward(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface canGoForward: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(name, com.onevcat.uniwebview.C1561l0.f3737a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final void captureSnapshot(java.lang.String name, java.lang.String str) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface captureSnapshot: ", name, ". File name: ", str, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1564m0(str));
    }

    @kotlin.jvm.JvmStatic
    public static final void cleanCache(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface cleanCache: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.C1567n0.f3743a);
    }

    @kotlin.jvm.JvmStatic
    public static final void clearCookies() {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interface clearCookies", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Interface clearCookies");
        com.onevcat.uniwebview.P.a();
    }

    @kotlin.jvm.JvmStatic
    public static final void clearHttpAuthUsernamePassword(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "host", str2, "realm");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface clearHttpAuthUsernamePassword. Host: ", str, ", realm: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.C1570o0(str, str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void destroy(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface destroy web view: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.C1573p0.f3748a);
    }

    @kotlin.jvm.JvmStatic
    public static final void evaluateJavaScript(java.lang.String str, java.lang.String str2, java.lang.String identifier) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "jsString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface evaluateJavaScript in: ", str, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1576q0(str2, identifier));
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getCookie(java.lang.String url, java.lang.String key) {
        com.onevcat.uniwebview.Z.a(Companion, url, "url", key, com.ironsource.y8.h.W);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface getCookie from: ", url, " | key: ", key, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.lang.String cookie = android.webkit.CookieManager.getInstance().getCookie(url);
        if (cookie == null) {
            java.lang.String message2 = "The content for given url '" + url + "' is not found in cookie manager.";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
            c1560l.a(com.onevcat.uniwebview.EnumC1557k.DEBUG, message2);
        } else {
            java.lang.String message3 = "Cookie string is found: '" + cookie + "', for url: " + url;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
            com.onevcat.uniwebview.EnumC1557k enumC1557k = com.onevcat.uniwebview.EnumC1557k.VERBOSE;
            c1560l.a(enumC1557k, message3);
            java.lang.String message4 = "Trying to parse cookie to find value for key: " + key;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message4, "message");
            c1560l.a(enumC1557k, message4);
            java.util.Iterator it = kotlin.collections.CollectionsKt.reversed(new kotlin.text.Regex(";").split(cookie, 0)).iterator();
            while (it.hasNext()) {
                java.util.List<java.lang.String> listSplit = new kotlin.text.Regex(com.ironsource.y8.i.b).split(kotlin.text.StringsKt.trim((java.lang.CharSequence) it.next()).toString(), 0);
                if (listSplit.size() >= 2 && kotlin.jvm.internal.Intrinsics.areEqual(listSplit.get(0), key)) {
                    java.lang.String str = listSplit.get(1);
                    com.onevcat.uniwebview.C1560l c1560l2 = com.onevcat.uniwebview.C1560l.b;
                    java.lang.String message5 = com.onevcat.uniwebview.O.a("Found cookie value: ", str, " for key: ", key, c1560l2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message5, "message");
                    c1560l2.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message5);
                    return str;
                }
            }
            com.onevcat.uniwebview.C1560l c1560l3 = com.onevcat.uniwebview.C1560l.b;
            java.lang.String message6 = "Did not find the key '" + key + "' in cookie.";
            c1560l3.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message6, "message");
            c1560l3.a(com.onevcat.uniwebview.EnumC1557k.VERBOSE, message6);
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    @kotlin.jvm.JvmStatic
    public static final byte[] getRenderedData(java.lang.String name, int i, int i2, int i3, int i4) {
        byte[] byteArray;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1539e c1539e = com.onevcat.uniwebview.C1539e.b;
        c1539e.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.N n = (com.onevcat.uniwebview.N) c1539e.f3717a.get(name);
        if (n == null || (byteArrayOutputStream = n.m) == null) {
            byteArray = null;
        } else {
            byteArrayOutputStream.reset();
            android.graphics.Bitmap bitmap = n.n;
            if (bitmap == null) {
                byteArray = null;
            } else {
                try {
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (java.lang.Exception e) {
                    com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
                    java.lang.String message = "Creating snapshot buffer exception: " + e;
                    c1560l.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                    c1560l.a(com.onevcat.uniwebview.EnumC1557k.CRITICAL, message);
                    byteArray = null;
                }
            }
        }
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1579r0((i == -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new android.graphics.Rect(i, i2, i3 + i, i4 + i2)));
        return byteArray;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUrl(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface getUrl: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        java.lang.String str = (java.lang.String) com.onevcat.uniwebview.U1.c(name, com.onevcat.uniwebview.C1582s0.f3755a);
        return str == null ? "" : str;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getUserAgent(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface getUserAgent: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        java.lang.String str = (java.lang.String) com.onevcat.uniwebview.U1.c(name, com.onevcat.uniwebview.C1585t0.f3758a);
        return str == null ? "" : str;
    }

    @kotlin.jvm.JvmStatic
    public static final float getWebViewAlpha(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface getWebViewAlpha: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        java.lang.Float f = (java.lang.Float) com.onevcat.uniwebview.U1.c(name, com.onevcat.uniwebview.C1588u0.f3760a);
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @kotlin.jvm.JvmStatic
    public static final void goBack(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface goBack: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.C1591v0.f3763a);
    }

    @kotlin.jvm.JvmStatic
    public static final void goForward(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface goForward: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.C1596w0.f3766a);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hide(java.lang.String str, boolean z, int i, float f, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interface hide", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Interface hide");
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(str, new com.onevcat.uniwebview.C1599x0(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final void hideAsync(java.lang.String str, boolean z, int i, float f, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interface hideAsync", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Interface hideAsync");
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1602y0(z, i, f, str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void hideSpinner(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface hideSpinner: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.C1605z0.f3774a);
    }

    @kotlin.jvm.JvmStatic
    public static final void init(java.lang.String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface init: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.A0(name, i, i2, i3, i4));
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAuthenticationIsSupported() {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interface authenticationIsSupported.", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Interface authenticationIsSupported.");
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(com.onevcat.uniwebview.B0.f3646a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isSafeBrowsingSupported() {
        Companion.getClass();
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(com.onevcat.uniwebview.B0.f3646a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isWebViewSupported() {
        Companion.getClass();
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(com.onevcat.uniwebview.C0.f3648a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final void load(java.lang.String name, java.lang.String str) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface load: ", name, ", url: ", str, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.D0(str));
    }

    @kotlin.jvm.JvmStatic
    public static final void loadHTMLString(java.lang.String name, java.lang.String str, java.lang.String str2) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interface loadHTMLString", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Interface loadHTMLString");
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.E0(str, str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void prepare() {
        Companion.getClass();
        com.onevcat.uniwebview.U1.c(com.onevcat.uniwebview.F0.f3657a);
    }

    @kotlin.jvm.JvmStatic
    public static final void print(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface print: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.G0.f3659a);
    }

    @kotlin.jvm.JvmStatic
    public static final void registerChannel(com.onevcat.uniwebview.UniWebViewNativeChannel channel2) {
        com.onevcat.uniwebview.U1 u1 = Companion;
        u1.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel2, "channel");
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.H0(u1, channel2));
    }

    @kotlin.jvm.JvmStatic
    public static final void reload(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface reload: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.I0.f3664a);
    }

    @kotlin.jvm.JvmStatic
    public static final void removeCookie(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "url", str2, com.ironsource.y8.h.W);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface removeCookie: ", str, ", key: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.P.a(str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final void removeCookies(java.lang.String url) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface remove cookies for: ", url, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.onevcat.uniwebview.P.a(url, (java.lang.String) null);
    }

    @kotlin.jvm.JvmStatic
    public static final void removePermissionTrustDomain(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, com.ironsource.y8.i.D);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface removePermissionTrustDomain: ", str, ", domain: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.J0(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void removeSslExceptionDomain(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, com.ironsource.y8.i.D);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface removeSslExceptionDomain: ", str, ", domain: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.K0(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void removeUrlScheme(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "scheme");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface removeUrlScheme: ", str, ", scheme: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.L0(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void safeBrowsingInit(java.lang.String name, java.lang.String str) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface safeBrowsingInit: ", name, ", url: ", str, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.O0(str, name));
    }

    @kotlin.jvm.JvmStatic
    public static final void safeBrowsingSetToolbarColor(java.lang.String name, float f, float f2, float f3) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface safeBrowsingSetToolbarColor: " + name + ", rgb: {" + f + ", " + f2 + ", " + f3 + ')';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.P0(name, f, f2, f3));
    }

    @kotlin.jvm.JvmStatic
    public static final void safeBrowsingShow(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface safeBrowsingShow: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.Q0(name));
    }

    @kotlin.jvm.JvmStatic
    public static final float screenHeight() {
        Companion.getClass();
        return com.unity3d.player.UnityPlayer.currentActivity.findViewById(android.R.id.content).getHeight();
    }

    @kotlin.jvm.JvmStatic
    public static final float screenWidth() {
        Companion.getClass();
        return com.unity3d.player.UnityPlayer.currentActivity.findViewById(android.R.id.content).getWidth();
    }

    @kotlin.jvm.JvmStatic
    public static final void scrollTo(java.lang.String name, int i, int i2, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface scrollTo: " + name + ", {" + i + ", " + i2 + "}, animated: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.R0(i, i2, z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAcceptThirdPartyCookies(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setAcceptThirdPartyCookies: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.S0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowAutoPlay(boolean z) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setAllowAutoPlay: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.T0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowFileAccess(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setAllowFileAccess: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.U0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowFileAccessFromFileURLs(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setAllowFileAccessFromFileURLs: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.V0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowHTTPAuthPopUpWindow(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setAllowHTTPAuthPopUpWindow: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.W0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowJavaScriptOpenWindow(boolean z) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setAllowJavaScriptOpenWindow: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.X0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowUniversalAccessFromFileURLs(boolean z) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setAllowUniversalAccessFromFileURLs: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.Y0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowUserDismissSpinnerByGesture(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setAllowUserDismissSpinnerByGesture: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.Z0(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setAllowUserEditFileNameBeforeDownloading(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setAllowUserEditFileNameBeforeDownloading: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1529a1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setBackgroundColor(java.lang.String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setBackgroundColor rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1532b1(f, f2, f3, f4));
    }

    @kotlin.jvm.JvmStatic
    public static final void setBouncesEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setBouncesEnabled: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1535c1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setCacheMode(java.lang.String name, int i) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setCacheMode: " + name + ", mode: " + i;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1538d1(i));
    }

    @kotlin.jvm.JvmStatic
    public static final void setCalloutEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setCalloutEnabled: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1541e1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setCookie(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "url", str2, "cookie");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface setCookie: ", str2, " | to url: ", str, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.P.b(str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final void setDefaultFontSize(java.lang.String name, int i) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setDefaultFontSize: " + name + ", size: " + i;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1544f1(i));
    }

    @kotlin.jvm.JvmStatic
    public static final void setDownloadEventForContextMenuEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface SetDownloadEventForContextMenuEnabled: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1547g1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setDragInteractionEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setDragInteractionEnabled: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1550h1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarBackgroundColor(java.lang.String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setEmbeddedToolbarBackgroundColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + ')';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1553i1(f, f2, f3, f4));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarButtonTextColor(java.lang.String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setEmbeddedToolbarButtonTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + ')';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1556j1(f, f2, f3, f4));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarDoneButtonText(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "text");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface setEmbeddedToolbarDoneButtonText: ", str, ", text: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1559k1(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarGoBackButtonText(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "text");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface setEmbeddedToolbarGoBackButtonText: ", str, ", text: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1562l1(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarGoForwardButtonText(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "text");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface setEmbeddedToolbarGoForwardButtonText: ", str, ", text: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1565m1(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarNavigationButtonsShow(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setEmbeddedToolbarNavigationButtonsShow: ", name, ", show: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1568n1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarOnTop(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setEmbeddedToolbarOnTop: ", name, ", top: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1571o1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarTitleText(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "text");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface setEmbeddedToolbarTitleText: ", str, ", text: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1574p1(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEmbeddedToolbarTitleTextColor(java.lang.String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setEmbeddedToolbarTitleTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + ')';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1577q1(f, f2, f3, f4));
    }

    @kotlin.jvm.JvmStatic
    public static final void setEnableKeyboardAvoidance(boolean z) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setEnableKeyboardAvoidance: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.C1580r1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setForwardWebConsoleToNativeOutput(boolean z) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setForwardWebConsoleToNativeOutput: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.C1583s1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setFrame(java.lang.String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setFrame: " + name + ", {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1586t1(i, i2, i3, i4));
    }

    @kotlin.jvm.JvmStatic
    public static final void setHeaderField(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, com.ironsource.y8.h.W);
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setHeaderField: " + str + ". {key: " + str2 + ", value: " + str3 + '}';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.C1589u1(str2, str3));
    }

    @kotlin.jvm.JvmStatic
    public static final void setHorizontalScrollBarEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setHorizontalScrollBarEnabled: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1592v1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setJavaScriptEnabled(boolean z) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setJavaScriptEnabled: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.C1597w1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setLoadWithOverviewMode(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setLoadWithOverviewMode: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1600x1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setLogLevel(int i) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l.b.f3736a = i;
    }

    @kotlin.jvm.JvmStatic
    public static final void setOpenLinksInExternalBrowser(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setOpenLinksInExternalBrowser: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1603y1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setPosition(java.lang.String name, int i, int i2) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setPosition: " + name + ", {" + i + ", " + i2 + '}';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1606z1(i, i2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setShowEmbeddedToolbar(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setShowEmbeddedToolbar: ", name, ", show: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.A1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setShowSpinnerWhileLoading(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setShowSpinnerWhileLoading: ", name, ", show: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.B1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setSize(java.lang.String name, int i, int i2) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setSize: " + name + ", {" + i + ", " + i2 + '}';
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.C1(i, i2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setSpinnerText(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "text");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface setSpinnerText: ", str, ", text: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.D1(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setSupportMultipleWindows(java.lang.String name, boolean z, boolean z2) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setSupportMultipleWindows: " + name + ", flag: " + z + ", allowJS: " + z2;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.E1(z2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setTextZoom(java.lang.String name, int i) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setTextZoom: " + name + ", textZoom: " + i;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.F1(i));
    }

    @kotlin.jvm.JvmStatic
    public static final void setTransparencyClickingThroughEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setTransparencyClickingThroughEnabled: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.G1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setUseWideViewPort(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setUseWideViewPort: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.H1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserAgent(java.lang.String str, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "userAgent");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.O.a("Interface setUserAgent: ", str, ", UA: ", str2, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.I1(str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserInteractionEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setUserInteractionEnabled: ", name, ", flag: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.J1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setVerticalScrollBarEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setVerticalScrollBarEnabled: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.K1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setWebContentsDebuggingEnabled(boolean z) {
        Companion.getClass();
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setWebContentsDebuggingEnabled: " + z;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(new com.onevcat.uniwebview.L1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final void setWebViewAlpha(java.lang.String name, float f) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = "Interface setWebViewAlpha: " + name + ", alpha: " + f;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.M1(f));
    }

    @kotlin.jvm.JvmStatic
    public static final void setZoomEnabled(java.lang.String name, boolean z) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        java.lang.String message = com.onevcat.uniwebview.AbstractC1528a0.a("Interface setZoomEnabled: ", name, ", enabled: ", z, c1560l);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, message);
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.N1(z));
    }

    @kotlin.jvm.JvmStatic
    public static final boolean show(java.lang.String str, boolean z, int i, float f, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interface show", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Interface show");
        java.lang.Boolean bool = (java.lang.Boolean) com.onevcat.uniwebview.U1.c(str, new com.onevcat.uniwebview.O1(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final void showAsync(java.lang.String str, boolean z, int i, float f, java.lang.String str2) {
        com.onevcat.uniwebview.Z.a(Companion, str, "name", str2, "identifier");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interface showAsync", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, "Interface showAsync");
        com.onevcat.uniwebview.U1.a(str, new com.onevcat.uniwebview.P1(z, i, f, str2));
    }

    @kotlin.jvm.JvmStatic
    public static final void showSpinner(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface showSpinner: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.Q1.f3686a);
    }

    @kotlin.jvm.JvmStatic
    public static final void startSnapshotForRendering(java.lang.String name, java.lang.String str) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface startSnapshotForRendering: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, new com.onevcat.uniwebview.R1(str));
    }

    @kotlin.jvm.JvmStatic
    public static final void stop(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface stop: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.S1.f3690a);
    }

    @kotlin.jvm.JvmStatic
    public static final void stopSnapshotForRendering(java.lang.String name) {
        Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.onevcat.uniwebview.C1560l c1560l = com.onevcat.uniwebview.C1560l.b;
        c1560l.a(com.onevcat.uniwebview.EnumC1557k.INFO, com.onevcat.uniwebview.AbstractC1575q.a("Interface stopSnapshotForRendering: ", name, c1560l, com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE));
        com.onevcat.uniwebview.U1.a(name, com.onevcat.uniwebview.T1.f3692a);
    }
}

package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.os.Handler f313a;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("com.amoad.amoadutils");
        handlerThread.start();
        f313a = new android.os.Handler(handlerThread.getLooper());
    }

    static float a(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view.isShown() && view.getGlobalVisibleRect(rect)) {
            return (rect.width() * rect.height()) / (view.getWidth() * view.getHeight());
        }
        return 0.0f;
    }

    static java.lang.String a(java.lang.String str, com.amoad.a aVar, android.util.Size size) {
        try {
            java.net.URI uri = new java.net.URI(str);
            java.lang.String str2 = (uri.getQuery() == null || uri.getQuery().length() <= 0) ? "?" : com.ironsource.y8.i.c;
            java.util.HashMap map = new java.util.HashMap();
            if (aVar != null) {
                map.put("tap_x", java.lang.String.valueOf(aVar.f184a));
                map.put("tap_y", java.lang.String.valueOf(aVar.b));
            }
            if (size != null) {
                map.put("container_width", java.lang.String.valueOf(size.getWidth()));
                map.put("container_height", java.lang.String.valueOf(size.getHeight()));
            }
            if (map.isEmpty()) {
                return str;
            }
            for (java.lang.String str3 : map.keySet()) {
                str = str + str2 + str3 + com.ironsource.y8.i.b + ((java.lang.String) map.get(str3));
                str2 = com.ironsource.y8.i.c;
            }
        } catch (java.lang.Exception unused) {
        }
        return str;
    }

    static final java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            com.amoad.Logger.w("AMoAdUtils", e);
            return str;
        }
    }

    static final void a(final android.content.Context context, final com.amoad.bk bkVar, final float f, final long j, final long j2) {
        com.amoad.Logger.d("AMoAdUtils", "startTrackingEventCall()");
        if (android.text.TextUtils.isEmpty(bkVar.f292a)) {
            return;
        }
        f313a.post(new java.lang.Runnable() { // from class: com.amoad.l.5
            @Override // java.lang.Runnable
            public final void run() {
                if (bkVar.c || (com.amoad.s.a(new com.amoad.be(context, bkVar.f292a.replace("${inview_ratio}", java.lang.String.format(java.util.Locale.getDefault(), "%.2f", java.lang.Float.valueOf(f))).replace("${duration_millis}", java.lang.String.format(java.util.Locale.getDefault(), com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT, java.lang.Long.valueOf(j2))).replace("${progress_offset}", java.lang.String.format(java.util.Locale.getDefault(), "%.0f", java.lang.Float.valueOf((j2 / j) * 100.0f))))) instanceof com.amoad.s.b)) {
                    return;
                }
                bkVar.c = true;
            }
        });
    }

    static final void a(final android.content.Context context, final java.lang.String str) {
        com.amoad.Logger.d("AMoAdUtils", "startImpCall()");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f313a.post(new java.lang.Runnable() { // from class: com.amoad.l.1
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.s.a(new com.amoad.be(context, str));
            }
        });
    }

    static void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !java.util.regex.Pattern.matches("[a-f0-9]{64}", str)) {
            throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("sidが不正です。（sid={0}）管理画面から取得したsidを指定してください。", str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    static boolean a(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        int rotation = windowManager.getDefaultDisplay().getRotation();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        char c = '\t';
        if (((rotation == 0 || rotation == 2) && i2 > i) || ((rotation == 1 || rotation == 3) && i > i2)) {
            if (rotation == 0) {
                c = 1;
            } else if (rotation == 1) {
                c = 0;
            } else if (rotation != 2) {
                if (rotation != 3) {
                    c = 1;
                } else {
                    c = '\b';
                }
            }
        } else if (rotation == 0) {
            c = 0;
        } else if (rotation == 1) {
            c = 1;
        } else if (rotation == 2) {
            c = '\b';
        } else if (rotation != 3) {
            c = 1;
        }
        return c == 0 || '\b' == c;
    }

    static boolean a(android.view.View view, android.graphics.Rect rect) {
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        rect.offset(-iArr[0], -iArr[1]);
        return globalVisibleRect;
    }

    static final java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return "";
        }
        try {
            return java.net.URLDecoder.decode(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            com.amoad.Logger.w("AMoAdUtils", e);
            return str;
        }
    }

    static final void b(final android.content.Context context, final java.lang.String str) {
        com.amoad.Logger.d("AMoAdUtils", "startVimpCall()");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f313a.post(new java.lang.Runnable() { // from class: com.amoad.l.2
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.s.a(new com.amoad.be(context, str));
            }
        });
    }

    public static final void c(final android.content.Context context, final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.amoad.bc.b(new java.lang.Runnable() { // from class: com.amoad.l.3
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                com.amoad.c cVarA = com.amoad.p.a(context);
                if (cVarA != null) {
                    java.lang.String str2 = cVarA.b;
                    if (!android.text.TextUtils.isEmpty(str2) && str.contains(".amoad.") && str.contains("rd.html")) {
                        sb.append("&auid=").append(com.amoad.l.a(str2, com.adjust.sdk.Constants.ENCODING));
                    }
                }
                java.lang.String string = sb.toString();
                com.amoad.Logger.d("AMoAdUtils", string);
                com.amoad.l.d(context, string);
            }
        });
    }

    static void d(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.amoad.AMoAdLogger.getInstance().e(e);
        }
    }

    static final void e(final android.content.Context context, final java.lang.String str) {
        com.amoad.Logger.d("AMoAdUtils", "startClickCall()");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f313a.post(new java.lang.Runnable() { // from class: com.amoad.l.4
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.s.a(new com.amoad.be(context, str));
            }
        });
    }
}

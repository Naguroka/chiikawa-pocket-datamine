package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f2983a = "BANNER";
    public static final java.lang.String b = "LARGE";
    public static final java.lang.String c = "RECTANGLE";
    public static final java.lang.String d = "LEADERBOARD";
    public static final java.lang.String e = "SMART";
    public static final java.lang.String f = "CUSTOM";
    public static final java.lang.String g = "MEDIUM_RECTANGLE";
    public static final java.lang.String h = "bannerAdSize";
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;
    public static final int m = 4;
    public static final int n = 5;
    public static final int o = 6;
    public static final int p = -1;
    public static final java.lang.String q = "Adaptive=true";

    interface a {
        void a(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list, java.lang.StringBuilder sb);
    }

    interface b {
        void a();

        void a(java.lang.String str);
    }

    public static int a(int i2) {
        int i3 = -1;
        for (com.json.mediationsdk.AbstractAdapter abstractAdapter : com.json.mediationsdk.c.b().a().values()) {
            try {
                int adaptiveHeight = abstractAdapter.getAdaptiveHeight(i2);
                if (adaptiveHeight > i3) {
                    i3 = adaptiveHeight;
                }
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception while calling getAdaptiveHeight for adapter - " + abstractAdapter.getProviderName());
            }
        }
        return i3;
    }

    static long a(long j2, long j3) {
        return j3 - (new java.util.Date().getTime() - j2);
    }

    public static com.json.mediationsdk.ISBannerSize a() {
        return new com.json.mediationsdk.ISBannerSize(d, 728, 90);
    }

    public static com.json.mediationsdk.ISBannerSize a(java.lang.String str, int i2, int i3) {
        return new com.json.mediationsdk.ISBannerSize(str, i2, i3);
    }

    public static java.lang.String a(com.json.mediationsdk.ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.containerParams.getWidth() + "x" + iSBannerSize.containerParams.getHeight() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    private static void a(int i2, int i3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i3 == -1) {
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "w:" + i2 + ",h:" + i3);
            }
            com.json.jj.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    public static void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.a();
        }
    }

    private static void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, android.view.View view, android.content.Context context, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        int iDpToPixels = com.json.mediationsdk.AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getWidth());
        int iDpToPixels2 = com.json.mediationsdk.AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getHeight());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) ironSourceBannerLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new android.widget.FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        ironSourceBannerLayout.setLayoutParams(layoutParams2);
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.containerParams.getHeight() + " width - " + iSBannerSize.containerParams.getWidth());
        ironSourceBannerLayout.addView(relativeLayout, 0, layoutParams2);
    }

    public static void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        a(ironSourceBannerLayout, view, layoutParams, (com.json.y7) null);
    }

    public static void a(final com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, final android.view.View view, final android.widget.FrameLayout.LayoutParams layoutParams, final com.json.y7 y7Var) {
        if (ironSourceBannerLayout == null || view == null || layoutParams == null) {
            return;
        }
        final android.content.Context applicationContext = com.json.environment.ContextProvider.getInstance().getApplicationContext();
        final com.json.mediationsdk.ISBannerSize size = ironSourceBannerLayout.getSize();
        com.json.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new java.lang.Runnable() { // from class: com.ironsource.mediationsdk.l$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.json.mediationsdk.l.a(ironSourceBannerLayout, view, size, applicationContext, layoutParams, y7Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, android.view.View view, com.json.mediationsdk.ISBannerSize iSBannerSize, android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, com.json.y7 y7Var) {
        try {
            ironSourceBannerLayout.removeAllViews();
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(ironSourceBannerLayout, view, context, iSBannerSize);
                } else {
                    ironSourceBannerLayout.addView(view, 0, layoutParams);
                }
            }
            if (y7Var != null) {
                y7Var.a();
            }
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Error while binding a banner - " + android.util.Log.getStackTraceString(e2));
        }
    }

    static void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.json.e7 e7Var, com.ironsource.mediationsdk.l.b bVar) {
        java.lang.String str;
        if (c(ironSourceBannerLayout)) {
            str = null;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = java.lang.String.format("can't load banner - %s", objArr);
        }
        if (e7Var == null || android.text.TextUtils.isEmpty(e7Var.getCom.ironsource.op.d java.lang.String())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = e7Var == null ? "placement is null" : "placement name is empty";
            str = java.lang.String.format("can't load banner - %s", objArr2);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            bVar.a();
        } else {
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
            bVar.a(str);
        }
    }

    static void a(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.l.b bVar) {
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            bVar.a();
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        bVar.a(java.lang.String.format("can't destroy banner - %s", objArr));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:4:0x0004, B:5:0x0011, B:35:0x0062, B:42:0x00a9, B:44:0x00af, B:46:0x00b9, B:47:0x00d8, B:36:0x008e, B:41:0x00a6, B:37:0x0093, B:38:0x0098, B:39:0x009d, B:40:0x00a2, B:7:0x0015, B:10:0x001f, B:13:0x0029, B:16:0x0033, B:19:0x003d, B:22:0x0047), top: B:52:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[Catch: Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:4:0x0004, B:5:0x0011, B:35:0x0062, B:42:0x00a9, B:44:0x00af, B:46:0x00b9, B:47:0x00d8, B:36:0x008e, B:41:0x00a6, B:37:0x0093, B:38:0x0098, B:39:0x009d, B:40:0x00a2, B:7:0x0015, B:10:0x001f, B:13:0x0029, B:16:0x0033, B:19:0x003d, B:22:0x0047), top: B:52:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(java.util.Map<java.lang.String, java.lang.Object> map, com.json.mediationsdk.ISBannerSize iSBannerSize) {
        byte b2;
        int i2;
        java.lang.String strA;
        if (iSBannerSize != null) {
            try {
                java.lang.String description = iSBannerSize.getDescription();
                switch (description.hashCode()) {
                    case -387072689:
                        if (!description.equals(c)) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 72205083:
                        if (!description.equals(b)) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 79011241:
                        if (!description.equals(e)) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 446888797:
                        if (!description.equals(d)) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 1951953708:
                        if (!description.equals(f2983a)) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 1999208305:
                        if (!description.equals("CUSTOM")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    i2 = 1;
                } else if (b2 == 1) {
                    i2 = 2;
                } else if (b2 == 2) {
                    i2 = 3;
                } else {
                    if (b2 != 3) {
                        if (b2 == 4) {
                            i2 = 5;
                        } else if (b2 == 5) {
                            map.put(h, 6);
                            map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                        }
                        if (iSBannerSize.isAdaptive()) {
                            strA = a(iSBannerSize);
                            if (map.containsKey(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1)) {
                                strA = map.get(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                            }
                            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, strA);
                        }
                    }
                    i2 = 4;
                }
                map.put(h, i2);
                if (iSBannerSize.isAdaptive()) {
                    strA = a(iSBannerSize);
                    if (map.containsKey(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1)) {
                        strA = map.get(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                    }
                    map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, strA);
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(android.util.Log.getStackTraceString(e2));
            }
        }
    }

    public static boolean a(com.json.mediationsdk.ISContainerParams iSContainerParams, int i2, int i3) {
        if (iSContainerParams == null || iSContainerParams.getWidth() <= 0 || iSContainerParams.getHeight() <= 0) {
            com.json.mediationsdk.logger.IronLog.API.warning("Container size is invalid: Default banner size will be used.");
            return false;
        }
        if (iSContainerParams.getWidth() >= i2 && iSContainerParams.getHeight() >= i3) {
            return true;
        }
        com.json.mediationsdk.logger.IronLog.API.warning("Container size too small: Banner may not display correctly.");
        return true;
    }

    public static int b(int i2) {
        int iA;
        if (com.json.mediationsdk.p.m().O()) {
            iA = a(i2);
        } else {
            com.json.mediationsdk.logger.IronLog.API.error("The mediation must be successfully initiated before calling this API");
            iA = -1;
        }
        a(i2, iA);
        com.json.mediationsdk.logger.IronLog.API.verbose("maximal height - " + iA + " for width - " + i2);
        return iA;
    }

    public static com.json.mediationsdk.ISBannerSize b() {
        if (com.json.mediationsdk.AdapterUtils.isLargeScreen(com.json.environment.ContextProvider.getInstance().getApplicationContext())) {
            a(e, 728, 90);
        }
        return a(e, 320, 50);
    }

    public static void b(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        com.json.mediationsdk.ISBannerSize size;
        if (ironSourceBannerLayout == null || (size = ironSourceBannerLayout.getSize()) == null || !size.isSmart()) {
            return;
        }
        com.json.mediationsdk.ISBannerSize iSBannerSizeB = b();
        iSBannerSizeB.setContainerParams(size.containerParams);
        iSBannerSizeB.setAdaptive(size.isAdaptive());
        ironSourceBannerLayout.setBannerSize(iSBannerSizeB);
    }

    static boolean c(com.json.mediationsdk.IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }
}

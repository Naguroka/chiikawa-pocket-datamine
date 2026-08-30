package com.bytedance.sdk.openadsdk.core.act;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static int IL = -1;
    private static int bX = -1;
    private static java.lang.String bg = null;
    private static volatile boolean eqN = false;
    private static com.bytedance.sdk.openadsdk.core.act.ActServiceConnection ldr;
    private static java.lang.Boolean zx;

    private bg() {
    }

    public static java.lang.String bg(final android.content.Context context) {
        java.lang.String str = bg;
        if (str != null) {
            return str;
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
            android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            java.lang.String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentActivities) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setAction(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                bg = null;
            } else if (!android.text.TextUtils.isEmpty(str2) && !bg(context, intent) && arrayList.contains(str2)) {
                bg = str2;
            } else {
                bg = (java.lang.String) arrayList.get(0);
            }
            if (!android.text.TextUtils.isEmpty(bg)) {
                synchronized (com.bytedance.sdk.openadsdk.core.act.bg.class) {
                    if (!eqN) {
                        com.bytedance.sdk.openadsdk.core.act.IL il = new com.bytedance.sdk.openadsdk.core.act.IL() { // from class: com.bytedance.sdk.openadsdk.core.act.bg.1
                            @Override // com.bytedance.sdk.openadsdk.core.act.IL
                            public void bg(final androidx.browser.customtabs.CustomTabsClient customTabsClient) {
                                com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.bg.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        java.lang.Throwable th;
                                        boolean zIsEngagementSignalsApiAvailable;
                                        boolean engagementSignalsCallback = false;
                                        try {
                                            androidx.browser.customtabs.CustomTabsCallback customTabsCallback = new androidx.browser.customtabs.CustomTabsCallback();
                                            androidx.browser.customtabs.EngagementSignalsCallback engagementSignalsCallback2 = new androidx.browser.customtabs.EngagementSignalsCallback() { // from class: com.bytedance.sdk.openadsdk.core.act.bg.1.1.1
                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) {
                                                }

                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onSessionEnded(boolean z, android.os.Bundle bundle) {
                                                }

                                                @Override // androidx.browser.customtabs.EngagementSignalsCallback
                                                public void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) {
                                                }
                                            };
                                            androidx.browser.customtabs.CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(customTabsCallback);
                                            zIsEngagementSignalsApiAvailable = customTabsSessionNewSession != null ? customTabsSessionNewSession.isEngagementSignalsApiAvailable(android.os.Bundle.EMPTY) : false;
                                            try {
                                                if (zIsEngagementSignalsApiAvailable) {
                                                    int unused = com.bytedance.sdk.openadsdk.core.act.bg.IL = 1;
                                                    engagementSignalsCallback = customTabsSessionNewSession.setEngagementSignalsCallback(engagementSignalsCallback2, android.os.Bundle.EMPTY);
                                                    if (engagementSignalsCallback) {
                                                        int unused2 = com.bytedance.sdk.openadsdk.core.act.bg.bX = 1;
                                                    }
                                                } else {
                                                    int unused3 = com.bytedance.sdk.openadsdk.core.act.bg.IL = 0;
                                                }
                                                if (!zIsEngagementSignalsApiAvailable || !engagementSignalsCallback) {
                                                    java.lang.Boolean unused4 = com.bytedance.sdk.openadsdk.core.act.bg.zx = java.lang.Boolean.FALSE;
                                                } else {
                                                    java.lang.Boolean unused5 = com.bytedance.sdk.openadsdk.core.act.bg.zx = java.lang.Boolean.TRUE;
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                engagementSignalsCallback = zIsEngagementSignalsApiAvailable;
                                                com.bytedance.sdk.component.utils.PX.bg("CustomTabsHelper", th.getMessage());
                                                zIsEngagementSignalsApiAvailable = engagementSignalsCallback;
                                                engagementSignalsCallback = false;
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                        }
                                        java.lang.Object[] objArr = new java.lang.Object[5];
                                        java.lang.Boolean.valueOf(zIsEngagementSignalsApiAvailable);
                                        java.lang.Boolean.valueOf(engagementSignalsCallback);
                                        com.bytedance.sdk.openadsdk.core.act.ActServiceConnection actServiceConnection = com.bytedance.sdk.openadsdk.core.act.bg.ldr;
                                        if (!com.bytedance.sdk.openadsdk.core.act.bg.eqN || actServiceConnection == null) {
                                            return;
                                        }
                                        try {
                                            context.unbindService(actServiceConnection);
                                        } catch (java.lang.Throwable unused6) {
                                        }
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.act.IL
                            public void bg() {
                                com.bytedance.sdk.openadsdk.core.act.ActServiceConnection unused = com.bytedance.sdk.openadsdk.core.act.bg.ldr = null;
                            }
                        };
                        if (ldr == null) {
                            ldr = new com.bytedance.sdk.openadsdk.core.act.ActServiceConnection(il);
                        }
                        androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(context, bg, ldr);
                        eqN = true;
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("CustomTabsHelper", th.getMessage());
        }
        com.bytedance.sdk.openadsdk.yDt.bX.bg("act_package_name", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.act.bg.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.ironsource.y8.h.V, com.bytedance.sdk.openadsdk.core.act.bg.bg);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("act_package_name").IL(jSONObject.toString());
            }
        });
        return bg;
    }

    private static boolean bg(android.content.Context context, android.content.Intent intent) {
        try {
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentActivities) {
                android.content.IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (java.lang.RuntimeException unused) {
            android.util.Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        return false;
    }

    public static int bg() {
        java.lang.Boolean bool = zx;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static int IL(android.content.Context context) {
        try {
            return !android.text.TextUtils.isEmpty(bg(context)) ? 1 : 0;
        } catch (java.lang.Throwable unused) {
        }
    }

    public static int IL() {
        return IL;
    }

    public static int bX() {
        return bX;
    }

    public static void bg(int i) {
        IL = i;
    }

    public static void IL(int i) {
        bX = i;
    }
}

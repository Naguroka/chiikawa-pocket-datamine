package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Fy {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.yDt.bg.IL IL(java.lang.String str, int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.yDt.bg.IL il = new com.bytedance.sdk.openadsdk.yDt.bg.IL();
        il.bg(str);
        il.bg(tuv);
        il.IL(com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv));
        il.bg(i);
        il.bg(false);
        il.IL(tuv.jz());
        return il;
    }

    public static boolean bg(android.content.Context context, final java.lang.String str, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final java.lang.String str2) {
        if (context instanceof android.app.Activity) {
            if (!bg((android.app.Activity) context)) {
                context = null;
            }
        } else {
            android.app.Activity activityIL = com.bytedance.sdk.openadsdk.core.Lq.bg().zx().IL();
            if (activityIL != null && bg(activityIL)) {
                context = activityIL;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        if (context == null) {
            return false;
        }
        final java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv);
        if (!com.bytedance.sdk.component.utils.Lq.bg(str)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(IL(str2, 5, tuv));
            return false;
        }
        final java.lang.String strIL = com.bytedance.sdk.openadsdk.core.model.tuV.IL(context, tuv);
        if (!android.text.TextUtils.isEmpty(strIL)) {
            try {
                final androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder();
                builder.setUrlBarHidingEnabled(false);
                builder.setShareState(2);
                if (context instanceof android.app.Activity) {
                    builder.setDefaultColorSchemeParams(new androidx.browser.customtabs.CustomTabColorSchemeParams.Builder().setToolbarColor(((android.app.Activity) context).getWindow().getNavigationBarColor()).build());
                }
                final android.content.Context context2 = context;
                new com.bytedance.sdk.openadsdk.core.act.AdActAction(context, tuv, str2, str).bg(new com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback() { // from class: com.bytedance.sdk.openadsdk.utils.Fy.1
                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindSuccess(androidx.browser.customtabs.CustomTabsSession customTabsSession) {
                        if (customTabsSession != null) {
                            try {
                                builder.setSession(customTabsSession);
                            } catch (java.lang.Throwable th) {
                                java.lang.String message = th.getMessage();
                                com.bytedance.sdk.component.utils.PX.bg("OpenUtils", message);
                                com.bytedance.sdk.openadsdk.yDt.bg.IL IL = com.bytedance.sdk.openadsdk.utils.Fy.IL(str2, 13, tuv);
                                IL.bX(message);
                                com.bytedance.sdk.openadsdk.eqN.bX.bg(IL);
                                com.bytedance.sdk.openadsdk.utils.Fy.IL(context2, str, tuv, str2, strBg);
                                return;
                            }
                        }
                        androidx.browser.customtabs.CustomTabsIntent customTabsIntentBuild = builder.build();
                        if (!(context2 instanceof android.app.Activity)) {
                            customTabsIntentBuild.intent.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.core.act.bX.bg(context2, strIL, customTabsIntentBuild, android.net.Uri.parse(str));
                        android.content.Context context3 = context2;
                        if (context3 instanceof com.bytedance.sdk.openadsdk.activity.TTBaseActivity) {
                            ((com.bytedance.sdk.openadsdk.activity.TTBaseActivity) context3).IL(true);
                        }
                        com.bytedance.sdk.openadsdk.yDt.bg.IL IL2 = com.bytedance.sdk.openadsdk.utils.Fy.IL(str2, 100, tuv);
                        IL2.bg(true);
                        IL2.IL(8);
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(IL2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindFail(int i, java.lang.String str3) {
                        com.bytedance.sdk.openadsdk.yDt.bg.IL IL = com.bytedance.sdk.openadsdk.utils.Fy.IL(str2, i, tuv);
                        IL.bX(str3);
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(IL);
                        com.bytedance.sdk.openadsdk.utils.Fy.IL(context2, str, tuv, str2, strBg);
                    }
                });
                return true;
            } catch (java.lang.Throwable th) {
                java.lang.String message = th.getMessage();
                com.bytedance.sdk.component.utils.PX.bg("OpenUtils", message);
                com.bytedance.sdk.openadsdk.yDt.bg.IL IL = IL(str2, 12, tuv);
                IL.bX(message);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(IL);
                return IL(context, str, tuv, str2, strBg);
            }
        }
        return IL(context, str, tuv, str2, strBg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IL(android.content.Context context, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        try {
            intent.setData(android.net.Uri.parse(str));
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.yDt.bg.IL IL = IL(str2, 100, tuv);
                IL.bg(true);
                IL.IL(2);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(IL);
                return true;
            } catch (java.lang.Throwable th) {
                java.lang.String message = th.getMessage();
                com.bytedance.sdk.openadsdk.yDt.bg.IL IL2 = IL(str2, 7, tuv);
                IL2.bX(message);
                IL2.IL(2);
                com.bytedance.sdk.openadsdk.eqN.bX.bg(IL2);
                return false;
            }
        } catch (java.lang.Throwable th2) {
            java.lang.String message2 = th2.getMessage();
            com.bytedance.sdk.openadsdk.yDt.bg.IL IL3 = IL(str2, 6, tuv);
            IL3.bX(message2);
            IL3.IL(2);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(IL3);
            return false;
        }
    }

    public static boolean IL(android.content.Context context, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str2) {
        if (context instanceof android.app.Activity) {
            if (!bg((android.app.Activity) context)) {
                context = null;
            }
        } else {
            android.app.Activity activityIL = com.bytedance.sdk.openadsdk.core.Lq.bg().zx().IL();
            if (activityIL != null && bg(activityIL)) {
                context = activityIL;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        android.content.Context context2 = context;
        if (context2 == null || !bg(str)) {
            return false;
        }
        android.net.Uri uri = android.net.Uri.parse(str);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(uri);
        java.util.HashMap map = new java.util.HashMap();
        map.put("deeplink_url", str);
        map.put("jsb_deeplink", 1);
        if (com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg()) {
            return com.bytedance.sdk.openadsdk.VzQ.bg.bg.bX.bg(context2, str, tuv, com.bytedance.sdk.openadsdk.utils.ayS.IL(tuv), map, true);
        }
        if (com.bytedance.sdk.openadsdk.utils.ayS.Kg(context2)) {
            if (com.bytedance.sdk.openadsdk.utils.ayS.bg(context2, intent)) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str2, "open_url_app", map);
                try {
                    if (!(context2 instanceof android.app.Activity)) {
                        intent.addFlags(268435456);
                    }
                    context2.startActivity(intent);
                    com.bytedance.sdk.openadsdk.eqN.PX.bg().bg(map).bg(tuv, str2);
                    return true;
                } catch (java.lang.Throwable unused) {
                }
            }
            return false;
        }
        try {
            if (!(context2 instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, str2, "open_url_app", map);
            context2.startActivity(intent);
            com.bytedance.sdk.openadsdk.eqN.PX.bg().bg(map).bg(tuv, str2);
            return true;
        } catch (java.lang.Exception unused2) {
            return false;
        }
    }

    public static boolean bg(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str);
    }

    public static boolean bg(android.app.Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}

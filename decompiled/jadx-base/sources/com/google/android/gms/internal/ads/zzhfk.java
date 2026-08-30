package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhfk {
    private static java.lang.String zza;

    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    public static java.lang.String zza(android.content.Context context) {
        java.lang.String str = zza;
        if (str != null) {
            return str;
        }
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
            zza = null;
        } else if (arrayList.size() == 1) {
            zza = (java.lang.String) arrayList.get(0);
        } else if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                    java.util.Iterator<android.content.pm.ResolveInfo> it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            android.content.pm.ResolveInfo next = it.next();
                            android.content.IntentFilter intentFilter = next.filter;
                            if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                            }
                        } else if (arrayList.contains(str2)) {
                            zza = str2;
                        }
                        if (arrayList.contains("com.android.chrome")) {
                            zza = "com.android.chrome";
                        } else if (arrayList.contains("com.chrome.beta")) {
                            zza = "com.chrome.beta";
                        } else if (arrayList.contains("com.chrome.dev")) {
                            zza = "com.chrome.dev";
                        }
                    }
                } else if (arrayList.contains(str2)) {
                    zza = str2;
                } else if (arrayList.contains("com.android.chrome")) {
                    zza = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    zza = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    zza = "com.chrome.dev";
                }
            } catch (java.lang.RuntimeException unused) {
                android.util.Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            }
        } else if (arrayList.contains("com.android.chrome")) {
            zza = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            zza = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            zza = "com.chrome.dev";
        }
        return zza;
    }
}

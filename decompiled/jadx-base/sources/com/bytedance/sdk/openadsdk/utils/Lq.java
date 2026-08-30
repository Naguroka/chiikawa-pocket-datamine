package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Lq {
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void bg() {
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        if (contextBg != null && com.bytedance.sdk.component.utils.PX.eqN()) {
            com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "The pangolin sdk access, the environment is debug, the initial configuration detection starts");
            java.lang.String packageName = contextBg.getPackageName();
            int i = contextBg.getApplicationInfo().targetSdkVersion;
            boolean z = true;
            try {
                java.lang.String[] strArr = contextBg.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    java.util.List<java.lang.String> listIL = IL();
                    for (java.lang.String str : strArr) {
                        if (str != null) {
                            listIL.remove(str);
                        }
                    }
                    if (listIL.isEmpty()) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "AndroidManifest.xml permissions configuration is normal");
                    } else {
                        java.util.Iterator<java.lang.String> it = listIL.iterator();
                        while (it.hasNext()) {
                            try {
                                com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "    May be missing permissions：" + it.next() + "，Please refer to the access documentation");
                                z = false;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                z = false;
                                com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation", th);
                                if (i < 23) {
                                    try {
                                        com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i + "&phone=" + android.os.Build.VERSION.SDK_INT + ", require=23");
                                    } catch (java.lang.Throwable th2) {
                                        com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "The dynamic permission is abnormal. Please check and read the access document in detail： ", th2);
                                    }
                                }
                                if (!z) {
                                    com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion");
                                }
                                com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
                            }
                        }
                    }
                } else {
                    com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation");
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
            if (i < 23) {
                com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i + "&phone=" + android.os.Build.VERSION.SDK_INT + ", require=23");
            }
            if (!z) {
                com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion");
            }
            com.bytedance.sdk.component.utils.PX.bg("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
        }
    }

    private static java.util.List<java.lang.String> IL() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}

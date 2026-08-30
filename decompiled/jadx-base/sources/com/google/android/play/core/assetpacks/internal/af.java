package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class af {
    public static void a(android.content.pm.PackageManager packageManager, android.content.ComponentName componentName, int i) {
        android.content.pm.ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                java.lang.String packageName = componentName.getPackageName();
                java.lang.String className = componentName.getClassName();
                try {
                    android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, com.json.mediationsdk.utils.IronSourceConstants.SDK_INIT_SUCCESS);
                    android.content.pm.ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0: while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        android.content.pm.ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                        }
                        i2++;
                    }
                    if (componentInfo != null && componentInfo.isEnabled()) {
                        return;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }
}

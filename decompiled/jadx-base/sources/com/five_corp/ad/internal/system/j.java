package com.five_corp.ad.internal.system;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static android.content.pm.PackageInfo a(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        return android.os.Build.VERSION.SDK_INT < 33 ? packageManager.getPackageInfo(str, 128) : packageManager.getPackageInfo(str, android.content.pm.PackageManager.PackageInfoFlags.of(128L));
    }
}

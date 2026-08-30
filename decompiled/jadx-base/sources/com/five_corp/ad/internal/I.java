package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1786a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;

    public I(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f1786a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public static com.five_corp.ad.internal.I a(android.content.Context context) {
        java.lang.String packageName;
        android.telephony.TelephonyManager telephonyManager;
        java.lang.String simOperatorName = "";
        java.lang.String str = "0";
        try {
            packageName = context.getPackageName();
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                try {
                    str = com.five_corp.ad.internal.system.j.a(context, packageName).versionName;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", packageName) == 0 && (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) != null) {
                    simOperatorName = telephonyManager.getSimOperatorName();
                }
            } catch (java.lang.Exception unused2) {
            }
        } catch (java.lang.Exception unused3) {
            packageName = "";
        }
        return new com.five_corp.ad.internal.I(android.os.Build.VERSION.RELEASE, android.os.Build.MODEL, android.os.Build.MANUFACTURER, simOperatorName, packageName, str);
    }
}

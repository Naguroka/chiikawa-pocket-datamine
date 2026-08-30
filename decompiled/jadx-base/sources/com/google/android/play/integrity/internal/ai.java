package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.integrity.internal.s f2333a = new com.google.android.play.integrity.internal.s("PhoneskyVerificationUtils");

    public static int a(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled && c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean b(android.content.Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && c(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    private static boolean c(android.content.pm.Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f2333a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
            return false;
        }
        for (android.content.pm.Signature signature : signatureArr) {
            java.lang.String strA = com.google.android.play.integrity.internal.ah.a(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                return true;
            }
            if ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                return true;
            }
        }
        return false;
    }
}

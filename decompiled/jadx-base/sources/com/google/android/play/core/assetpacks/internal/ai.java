package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2241a = new com.google.android.play.core.assetpacks.internal.o("PhoneskyVerificationUtils");

    public static boolean a(android.content.Context context) {
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        return packagesForUid != null && java.util.Arrays.asList(packagesForUid).contains("com.android.vending");
    }

    public static boolean b(android.content.Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    f2241a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
                } else {
                    for (android.content.pm.Signature signature : signatureArr) {
                        java.lang.String strA = com.google.android.play.core.assetpacks.internal.ah.a(signature.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                            return true;
                        }
                        if ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                            return true;
                        }
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}

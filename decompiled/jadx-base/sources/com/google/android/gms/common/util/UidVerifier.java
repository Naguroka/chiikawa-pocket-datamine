package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean isGooglePlayServicesUid(android.content.Context context, int i) {
        if (!uidHasPackageName(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            if (!android.util.Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            android.util.Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean uidHasPackageName(android.content.Context context, int i, java.lang.String str) {
        return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).zza(i, str);
    }
}

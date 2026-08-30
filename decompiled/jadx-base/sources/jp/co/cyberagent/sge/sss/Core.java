package jp.co.cyberagent.sge.sss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Core {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f3958a = true;

    static {
        try {
            java.lang.System.loadLibrary("checker");
        } catch (java.lang.UnsatisfiedLinkError unused) {
        }
    }

    private static java.lang.String a(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            sb.append(java.lang.Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    private static boolean b(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (!f3958a && activityManager == null) {
            throw new java.lang.AssertionError();
        }
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < runningServices.size(); i++) {
            if (runningServices.get(i).process.contains("fridaserver")) {
                z = true;
            }
        }
        return z;
    }

    static java.lang.String c(android.content.Context context) {
        java.util.List listD = d(context);
        return !listD.isEmpty() ? (java.lang.String) listD.get(0) : "";
    }

    private static java.util.List d(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int i = 0;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.content.pm.SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                if (signingInfo.hasMultipleSigners()) {
                    android.content.pm.Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    int length = apkContentsSigners.length;
                    while (i < length) {
                        arrayList.add(a(java.security.MessageDigest.getInstance(java.security.spec.MGF1ParameterSpec.SHA256.getDigestAlgorithm()).digest(apkContentsSigners[i].toByteArray())));
                        i++;
                    }
                } else {
                    android.content.pm.Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length2 = signingCertificateHistory.length;
                    while (i < length2) {
                        arrayList.add(a(java.security.MessageDigest.getInstance(java.security.spec.MGF1ParameterSpec.SHA256.getDigestAlgorithm()).digest(signingCertificateHistory[i].toByteArray())));
                        i++;
                    }
                }
            } else {
                android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                int length3 = signatureArr.length;
                while (i < length3) {
                    arrayList.add(a(java.security.MessageDigest.getInstance(java.security.spec.MGF1ParameterSpec.SHA256.getDigestAlgorithm()).digest(signatureArr[i].toByteArray())));
                    i++;
                }
            }
            return arrayList;
        } catch (java.lang.Exception unused) {
            return java.util.Collections.emptyList();
        }
    }

    private static java.lang.String[] e(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    static boolean f(android.content.Context context) {
        if (b(context)) {
            return true;
        }
        return riddle();
    }

    static boolean g(android.content.Context context) {
        if (f(context)) {
            return true;
        }
        return riddleS();
    }

    static boolean h(android.content.Context context) {
        com.scottyab.rootbeer.RootBeer rootBeer = new com.scottyab.rootbeer.RootBeer(context);
        rootBeer.setLogging(false);
        return rootBeer.isRootedWithBusyBoxCheck();
    }

    static native boolean riddle();

    static native boolean riddleS();

    static boolean a(android.content.Context context) {
        java.lang.String[] strArrE = e(context);
        if (strArrE == null) {
            return false;
        }
        for (java.lang.String str : strArrE) {
            if (str.equals("android.permission.SYSTEM_ALERT_WINDOW") || str.equals("android.permission.ACTION_MANAGE_OVERLAY_PERMISSION")) {
                return true;
            }
        }
        return false;
    }
}

package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class PackageIdentityUtils {
    private static final java.lang.String TAG = "PackageIdentity";

    interface SignaturesCompat {
        java.util.List<byte[]> getFingerprintsForPackage(java.lang.String str, android.content.pm.PackageManager packageManager) throws android.content.pm.PackageManager.NameNotFoundException;

        boolean packageMatchesToken(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException;
    }

    private PackageIdentityUtils() {
    }

    static java.util.List<byte[]> getFingerprintsForPackage(java.lang.String str, android.content.pm.PackageManager packageManager) {
        try {
            return getImpl().getFingerprintsForPackage(str, packageManager);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e(TAG, "Could not get fingerprint for package.", e);
            return null;
        }
    }

    static boolean packageMatchesToken(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) {
        try {
            return getImpl().packageMatchesToken(str, packageManager, tokenContents);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.io.IOException e) {
            android.util.Log.e(TAG, "Could not check if package matches token.", e);
            return false;
        }
    }

    private static androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat getImpl() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new androidx.browser.trusted.PackageIdentityUtils.Api28Implementation();
        }
        return new androidx.browser.trusted.PackageIdentityUtils.Pre28Implementation();
    }

    static class Api28Implementation implements androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat {
        Api28Implementation() {
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public java.util.List<byte[]> getFingerprintsForPackage(java.lang.String str, android.content.pm.PackageManager packageManager) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.pm.SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (android.content.pm.Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(androidx.browser.trusted.PackageIdentityUtils.getCertificateSHA256Fingerprint(signature));
                }
            } else {
                arrayList.add(androidx.browser.trusted.PackageIdentityUtils.getCertificateSHA256Fingerprint(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean packageMatchesToken(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
            java.util.List<byte[]> fingerprintsForPackage;
            if (!tokenContents.getPackageName().equals(str) || (fingerprintsForPackage = getFingerprintsForPackage(str, packageManager)) == null) {
                return false;
            }
            if (fingerprintsForPackage.size() == 1) {
                return packageManager.hasSigningCertificate(str, tokenContents.getFingerprint(0), 1);
            }
            return tokenContents.equals(androidx.browser.trusted.TokenContents.create(str, fingerprintsForPackage));
        }
    }

    static class Pre28Implementation implements androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat {
        Pre28Implementation() {
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public java.util.List<byte[]> getFingerprintsForPackage(java.lang.String str, android.content.pm.PackageManager packageManager) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            java.util.ArrayList arrayList = new java.util.ArrayList(packageInfo.signatures.length);
            for (android.content.pm.Signature signature : packageInfo.signatures) {
                byte[] certificateSHA256Fingerprint = androidx.browser.trusted.PackageIdentityUtils.getCertificateSHA256Fingerprint(signature);
                if (certificateSHA256Fingerprint == null) {
                    return null;
                }
                arrayList.add(certificateSHA256Fingerprint);
            }
            return arrayList;
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean packageMatchesToken(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
            java.util.List<byte[]> fingerprintsForPackage;
            if (str.equals(tokenContents.getPackageName()) && (fingerprintsForPackage = getFingerprintsForPackage(str, packageManager)) != null) {
                return tokenContents.equals(androidx.browser.trusted.TokenContents.create(str, fingerprintsForPackage));
            }
            return false;
        }
    }

    static byte[] getCertificateSHA256Fingerprint(android.content.pm.Signature signature) {
        try {
            return java.security.MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }
}

package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public final class PackageInfoCompat {
    public static long getLongVersionCode(android.content.pm.PackageInfo packageInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.pm.PackageInfoCompat.Api28Impl.getLongVersionCode(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public static java.util.List<android.content.pm.Signature> getSignatures(android.content.pm.PackageManager packageManager, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.Signature[] signingCertificateHistory;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.content.pm.SigningInfo signingInfo = packageManager.getPackageInfo(str, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            if (androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasMultipleSigners(signingInfo)) {
                signingCertificateHistory = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getApkContentsSigners(signingInfo);
            } else {
                signingCertificateHistory = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getSigningCertificateHistory(signingInfo);
            }
        } else {
            signingCertificateHistory = packageManager.getPackageInfo(str, 64).signatures;
        }
        if (signingCertificateHistory == null) {
            return java.util.Collections.emptyList();
        }
        return java.util.Arrays.asList(signingCertificateHistory);
    }

    public static boolean hasSignatures(android.content.pm.PackageManager packageManager, java.lang.String str, java.util.Map<byte[], java.lang.Integer> map, boolean z) throws android.content.pm.PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        java.util.Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr2 : setKeySet) {
            if (bArr2 == null) {
                throw new java.lang.IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            java.lang.Integer num = map.get(bArr2);
            if (num == null) {
                throw new java.lang.IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        java.util.List<android.content.pm.Signature> signatures = getSignatures(packageManager, str);
        if (!z && android.os.Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : setKeySet) {
                if (!androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasSigningCertificate(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (signatures.size() != 0 && map.size() <= signatures.size() && (!z || map.size() == signatures.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[signatures.size()][];
                for (int i = 0; i < signatures.size(); i++) {
                    bArr[i] = computeSHA256Digest(signatures.get(i).toByteArray());
                }
            } else {
                bArr = null;
            }
            java.util.Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                java.lang.Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 == 1) {
                        if (!byteArrayContains(bArr, next)) {
                            return false;
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                } else if (!signatures.contains(new android.content.pm.Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean byteArrayContains(byte[][] bArr, byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (java.util.Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] computeSHA256Digest(byte[] bArr) {
        try {
            return java.security.MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    private PackageInfoCompat() {
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static boolean hasSigningCertificate(android.content.pm.PackageManager packageManager, java.lang.String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }

        static boolean hasMultipleSigners(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static android.content.pm.Signature[] getApkContentsSigners(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static android.content.pm.Signature[] getSigningCertificateHistory(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static long getLongVersionCode(android.content.pm.PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }
}

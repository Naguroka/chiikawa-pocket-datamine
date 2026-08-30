package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class dq {
    static java.lang.String a(java.util.List list) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        int i;
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.io.File) it.next());
            do {
                try {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    throw th;
                }
            } while (i != -1);
            fileInputStream.close();
        }
        return android.util.Base64.encodeToString(messageDigest.digest(), 11);
    }
}

package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: MD5Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f1756a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(java.io.InputStream inputStream, java.lang.String str) throws java.lang.Exception {
        if (str == null) {
            throw new java.lang.RuntimeException("md5 check failed: md5 == null");
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 4096);
                        if (i == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                        }
                    }
                    com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(inputStream);
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        java.lang.String strA = a(bArrDigest, bArrDigest.length);
                        if (!str.equals(strA)) {
                            throw new java.lang.RuntimeException("md5 check failed file: local md5:" + strA + " expect md5:" + str);
                        }
                    } catch (java.lang.Exception e) {
                        throw new java.lang.RuntimeException("md5 check failed:" + e.getMessage(), e);
                    }
                } catch (java.lang.Exception e2) {
                    throw new java.lang.RuntimeException("md5 check failed:" + e2.getMessage(), e2);
                }
            } catch (java.lang.Throwable th) {
                com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(inputStream);
                throw th;
            }
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException("md5 check failed:" + e3.getMessage(), e3);
        }
    }

    private static java.lang.String a(byte[] bArr, int i) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("bytes is null");
        }
        if (i > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int i2 = i << 1;
        char[] cArr = new char[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i4] & 255;
            int i6 = i3 + 1;
            char[] cArr2 = f1756a;
            cArr[i3] = cArr2[i5 >> 4];
            i3 = i6 + 1;
            cArr[i6] = cArr2[i5 & 15];
        }
        return new java.lang.String(cArr, 0, i2);
    }
}

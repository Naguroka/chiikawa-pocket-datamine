package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bt {
    static com.google.android.play.core.assetpacks.AssetLocation a(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        java.lang.Long lValueOf;
        int i;
        com.google.android.play.core.assetpacks.internal.aj.b(str != null, "Attempted to get file location from a null apk path.");
        com.google.android.play.core.assetpacks.internal.aj.b(str2 != null, java.lang.String.format("Attempted to get file location in apk %s with a null file path.", str));
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(str, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        byte[] bArr = new byte[22];
        randomAccessFile.seek(randomAccessFile.length() - 22);
        randomAccessFile.readFully(bArr);
        com.google.android.play.core.assetpacks.bs bsVarB = com.google.android.play.core.assetpacks.br.b(bArr, 0) == 1347093766 ? b(bArr) : null;
        byte b = 5;
        if (bsVarB == null) {
            long length = randomAccessFile.length() - 22;
            int iMin = (int) java.lang.Math.min(1024L, randomAccessFile.length());
            byte[] bArr2 = new byte[iMin];
            byte[] bArr3 = new byte[22];
            long jMax = length;
            loop0: while (true) {
                long j = length - 65536;
                long j2 = j < 0 ? 0L : j;
                jMax = java.lang.Math.max((jMax - ((long) iMin)) + 3, j2);
                randomAccessFile.seek(jMax);
                randomAccessFile.readFully(bArr2);
                int i2 = iMin - 4;
                while (i2 >= 0) {
                    byte b2 = bArr2[i2];
                    if (b2 == b) {
                        i = 2;
                    } else if (b2 == 6) {
                        i = 3;
                    } else if (b2 != 75) {
                        i = b2 != 80 ? -1 : 0;
                    } else {
                        i = 1;
                    }
                    if (i >= 0 && i2 >= i && com.google.android.play.core.assetpacks.br.b(bArr2, i2 - i) == 1347093766) {
                        randomAccessFile.seek((jMax + ((long) i2)) - ((long) i));
                        randomAccessFile.readFully(bArr3);
                        bsVarB = b(bArr3);
                        break loop0;
                    }
                    i2 -= 4;
                    b = 5;
                }
                if (jMax == j2) {
                    throw new java.util.zip.ZipException(java.lang.String.format("End Of Central Directory signature not found in APK %s", str));
                }
                b = 5;
            }
        }
        long jA = bsVarB.f2161a;
        byte[] bytes = str2.getBytes(com.adjust.sdk.Constants.ENCODING);
        byte[] bArr4 = new byte[46];
        byte[] bArr5 = new byte[str2.length()];
        int i3 = 0;
        while (true) {
            if (i3 >= bsVarB.b) {
                lValueOf = null;
                break;
            }
            randomAccessFile.seek(jA);
            randomAccessFile.readFully(bArr4);
            int iB = com.google.android.play.core.assetpacks.br.b(bArr4, 0);
            if (iB != 1347092738) {
                throw new java.util.zip.ZipException(java.lang.String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", str2, str, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(bsVarB.b), java.lang.Integer.valueOf(iB), 1347092738));
            }
            randomAccessFile.seek(jA + 28);
            int iA = com.google.android.play.core.assetpacks.br.a(bArr4, 28);
            if (iA == str2.length()) {
                randomAccessFile.seek(46 + jA);
                randomAccessFile.read(bArr5);
                if (java.util.Arrays.equals(bArr5, bytes)) {
                    lValueOf = java.lang.Long.valueOf(com.google.android.play.core.assetpacks.br.c(bArr4, 42));
                    break;
                }
            }
            jA += (long) (iA + 46 + com.google.android.play.core.assetpacks.br.a(bArr4, 30) + com.google.android.play.core.assetpacks.br.a(bArr4, 32));
            i3++;
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        byte[] bArr6 = new byte[8];
        randomAccessFile.seek(22 + jLongValue);
        randomAccessFile.readFully(bArr6);
        return new com.google.android.play.core.assetpacks.bl(str, jLongValue + 30 + ((long) com.google.android.play.core.assetpacks.br.a(bArr6, 4)) + ((long) com.google.android.play.core.assetpacks.br.a(bArr6, 6)), com.google.android.play.core.assetpacks.br.c(bArr6, 0));
    }

    private static com.google.android.play.core.assetpacks.bs b(byte[] bArr) {
        int iA = com.google.android.play.core.assetpacks.br.a(bArr, 10);
        return new com.google.android.play.core.assetpacks.bs(com.google.android.play.core.assetpacks.br.c(bArr, 16), com.google.android.play.core.assetpacks.br.c(bArr, 12), iA);
    }
}

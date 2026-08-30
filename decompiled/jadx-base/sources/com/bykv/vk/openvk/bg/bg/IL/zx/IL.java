package com.bykv.vk.openvk.bg.bg.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static long bg(java.lang.String str, java.lang.String str2) {
        java.io.File fileBX = bX(str, str2);
        if (fileBX.exists()) {
            return fileBX.length();
        }
        java.io.File fileIL = IL(str, str2);
        if (fileIL.exists()) {
            return fileIL.length();
        }
        return 0L;
    }

    public static java.io.File IL(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new java.io.File(file, str2 + ".temp");
    }

    public static java.io.File bX(java.lang.String str, java.lang.String str2) {
        java.io.File file = new java.io.File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new java.io.File(file, str2);
    }

    public static void bg(java.io.RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, java.lang.String str) throws java.io.IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (java.lang.Throwable unused) {
        }
    }
}

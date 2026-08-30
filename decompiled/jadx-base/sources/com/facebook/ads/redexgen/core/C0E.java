package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0E {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"pXXvlweo53LEBZFO8IULCIdZyckTRG5r", "DuGHfKZCm01", "80fcVnrJERY0uuv61EoOWTfKBWpdgNO", "9CXibrLJZkMktsdeymca", "5EX4ZE8RGyFWDwwd0Tfx6XQfl6R1kt5", "MQihPub9yWY", "FZA8FrqtMtEe7NzfiE56", "M8QLs2sFGOm02m2V5lAOlFR2Pc3pvKwT"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{92, 21, 15, 92, 18, 19, 8, 92, 24, 21, 14, 25, 31, 8, 19, 14, 5, 93, 52, 25, 2, 21, 19, 4, 31, 2, 9, 80, 85, 3, 80, 19, 17, 30, 87, 4, 80, 18, 21, 80, 19, 2, 21, 17, 4, 21, 20, 62, 9, 9, 20, 9, 91, 9, 30, 24, 9, 30, 26, 15, 30, 91, 1, 30, 9, 20, 86, 8, 18, 1, 30, 91, 29, 18, 23, 30, 91, 122, 77, 77, 80, 77, 31, 76, 90, 75, 31, 83, 94, 76, 75, 31, 82, 80, 91, 86, 89, 86, 90, 91, 31, 91, 94, 75, 90, 31, 75, 80, 31, 83, 124, 121, 112, 53, 99, 102, 117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized void A06(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new java.io.IOException(A00(109, 5, 102) + file + A00(0, 18, 15));
            }
        } else if (!file.mkdirs()) {
            throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, A00(18, 29, 3), file.getAbsolutePath()));
        }
    }

    static {
        A02();
    }

    public static java.util.List<java.io.File> A01(java.io.File file) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            java.util.List<java.io.File> listAsList = java.util.Arrays.asList(fileArrListFiles);
            java.util.Collections.sort(listAsList, new com.facebook.ads.redexgen.core.C0D());
            return listAsList;
        }
        return linkedList;
    }

    public static void A03(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (!file.setLastModified(jCurrentTimeMillis)) {
                A04(file);
                if (file.lastModified() >= jCurrentTimeMillis) {
                } else {
                    throw new java.io.IOException(A00(77, 32, 76) + file);
                }
            }
        }
    }

    public static void A04(java.io.File file) throws java.io.IOException {
        long length = file.length();
        if (length == 0) {
            A05(file);
            java.lang.String[] strArr = A01;
            if (strArr[7].charAt(10) == strArr[0].charAt(10)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "fwMIAeZxeVy";
            strArr2[1] = "XGkZ1N2vKGp";
            return;
        }
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, A00(114, 3, 98));
        long size = length - 1;
        randomAccessFile.seek(size);
        byte b = randomAccessFile.readByte();
        randomAccessFile.seek(length - 1);
        randomAccessFile.write(b);
        randomAccessFile.close();
    }

    public static void A05(java.io.File file) throws java.io.IOException {
        if (file.delete() && file.createNewFile()) {
        } else {
            throw new java.io.IOException(A00(47, 30, 8) + file);
        }
    }
}

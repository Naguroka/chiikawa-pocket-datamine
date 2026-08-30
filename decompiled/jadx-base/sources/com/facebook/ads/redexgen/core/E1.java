package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E1 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"bVxMbGWMA9jVqolFs2HsJgUnCU8MCanK", "OCmo2WCRSteO5ntkzBQCJXTiECLA8K2u", "6FY1eZNyDjZQrv8KxagfJj6lvFVpVQ54", "zrL5IKpuegwH8b9kbv5GAokwitjsOCQV", "dSxtxdluyuZ2vzWHskdughm6oHyQGkXe", "vqCArik978fx6oGYvzvdV3Nkzt", "3IzFa4dcZPuwN51Jo", "aZPQYxeTAZ4iEKfn1v1X1lDpWQYDsyvs"};
    public final com.facebook.ads.redexgen.core.C0732Hh A00;
    public final java.io.File A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 96);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{125, 70, 91, 93, 88, 88, 71, 90, 92, 77, 76, 8, 73, 75, 92, 65, 71, 70, 8, 78, 65, 68, 77, 8, 94, 77, 90, 91, 65, 71, 70, 18, 8};
    }

    static {
        A01();
    }

    public E1(java.io.File file) {
        this.A01 = file;
        this.A00 = new com.facebook.ads.redexgen.core.C0732Hh(file);
    }

    public final void A02(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction... downloadActionArr) throws java.io.IOException {
        java.io.DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new java.io.DataOutputStream(this.A00.A03());
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(downloadActionArr.length);
            for (com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction : downloadActionArr) {
                com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.A03(downloadAction, dataOutputStream);
            }
            this.A00.A06(dataOutputStream);
            com.facebook.ads.redexgen.core.IK.A0X(null);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.IK.A0X(dataOutputStream);
            throw th;
        }
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] A03(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer... deserializerArr) throws java.io.IOException {
        if (!this.A01.exists()) {
            return new com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[0];
        }
        try {
            java.io.InputStream inputStreamA04 = this.A00.A04();
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStreamA04);
            int i = dataInputStream.readInt();
            if (i <= 0) {
                int version = dataInputStream.readInt();
                com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] downloadActionArr = new com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[version];
                for (int i2 = 0; i2 < version; i2++) {
                    downloadActionArr[i2] = com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.A00(deserializerArr, dataInputStream);
                }
                com.facebook.ads.redexgen.core.IK.A0X(inputStreamA04);
                if (A03[5].length() != 26) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A03;
                strArr[2] = "8ap1sevifaKfOHRAR0hSzB2Z0Rzpwosq";
                strArr[4] = "H4WTbGVyDanNwNDCQrC8WYgXSDH9x91J";
                return downloadActionArr;
            }
            throw new java.io.IOException(A00(0, 33, 72) + i);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.IK.A0X(null);
            throw th;
        }
    }
}

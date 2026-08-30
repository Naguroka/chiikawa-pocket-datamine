package com.facebook.ads.internal.exoplayer2.thirdparty.offline;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DownloadAction {
    public static byte[] A05;
    public final int A00;
    public final android.net.Uri A01;
    public final java.lang.String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{81, 93, 34, 3, 76, 8, 9, 31, 9, 30, 5, 13, 0, 5, 22, 9, 30, 76, 10, 3, 25, 2, 8, 76, 10, 3, 30, 86};
    }

    public abstract com.facebook.ads.redexgen.core.EP A07(com.facebook.ads.redexgen.core.EQ eq);

    public abstract void A08(java.io.DataOutputStream dataOutputStream) throws java.io.IOException;

    public abstract boolean A09(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction);

    public static abstract class Deserializer {
        public final int A00;
        public final java.lang.String A01;

        public abstract com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction A01(int i, java.io.DataInputStream dataInputStream) throws java.io.IOException;

        public Deserializer(java.lang.String str, int i) {
            this.A01 = str;
            this.A00 = i;
        }
    }

    public DownloadAction(java.lang.String str, int i, android.net.Uri uri, boolean z, byte[] bArr) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = uri;
        this.A03 = z;
        this.A04 = bArr == null ? new byte[0] : bArr;
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction A00(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer[] deserializerArr, java.io.InputStream inputStream) throws java.io.IOException {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        java.lang.String utf = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        for (com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer deserializer : deserializerArr) {
            if (utf.equals(deserializer.A01) && deserializer.A00 >= i) {
                return deserializer.A01(i, dataInputStream);
            }
        }
        java.lang.String type = A01(2, 26, 118) + utf + A01(0, 2, 103) + i;
        throw new com.facebook.ads.redexgen.core.E4(type);
    }

    public static void A03(com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.A02);
        dataOutputStream.writeInt(downloadAction.A00);
        downloadAction.A08(dataOutputStream);
        dataOutputStream.flush();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction = (com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction) obj;
        return this.A02.equals(downloadAction.A02) && this.A00 == downloadAction.A00 && this.A01.equals(downloadAction.A01) && this.A03 == downloadAction.A03 && java.util.Arrays.equals(this.A04, downloadAction.A04);
    }

    public int hashCode() {
        return (((this.A01.hashCode() * 31) + (this.A03 ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.A04);
    }
}

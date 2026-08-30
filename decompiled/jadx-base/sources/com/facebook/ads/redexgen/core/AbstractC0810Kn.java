package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0810Kn implements com.facebook.ads.redexgen.core.S5 {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.S6 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 25);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, 88, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, 90, 101};
    }

    public AbstractC0810Kn(com.facebook.ads.redexgen.core.S6 s6) {
        this.A00 = s6;
    }

    @Override // com.facebook.ads.redexgen.core.S5
    public final boolean ABv(com.facebook.ads.redexgen.core.S3 s3) {
        com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpA00 = s3.A00();
        if (this.A00.A9X()) {
            android.util.Log.e(com.facebook.ads.redexgen.core.AbstractC0810Kn.class.getSimpleName(), A00(14, 27, 123), s3);
        }
        if (interfaceC0992RpA00 != null && interfaceC0992RpA00.A8R() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.S5
    public final java.net.HttpURLConnection AEH(java.lang.String str, java.net.Proxy proxy) throws java.io.IOException {
        java.net.URL url = new java.net.URL(str);
        if (proxy == null) {
            return (java.net.HttpURLConnection) url.openConnection();
        }
        return (java.net.HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.core.S5
    public final java.io.InputStream AEI(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.core.S5
    public final java.io.OutputStream AEJ(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.core.S5
    public final void AEZ(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.S1 s1, java.lang.String str) throws java.io.IOException {
        httpURLConnection.setRequestMethod(s1.A03());
        httpURLConnection.setDoOutput(s1.A05());
        httpURLConnection.setDoInput(s1.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.facebook.ads.redexgen.core.S5
    public final byte[] AEr(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[16384];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.S5
    public final void AHj(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        outputStream.write(bArr);
    }
}

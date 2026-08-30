package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface S5 {
    boolean ABv(com.facebook.ads.redexgen.core.S3 s3);

    java.net.HttpURLConnection AEH(java.lang.String str, java.net.Proxy proxy) throws java.io.IOException;

    java.io.InputStream AEI(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException;

    java.io.OutputStream AEJ(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException;

    void AEZ(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.S1 s1, java.lang.String str) throws java.io.IOException;

    byte[] AEr(java.io.InputStream inputStream) throws java.io.IOException;

    void AHj(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException;
}

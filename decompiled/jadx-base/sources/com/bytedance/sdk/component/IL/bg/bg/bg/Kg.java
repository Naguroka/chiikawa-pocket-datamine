package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends com.bytedance.sdk.component.IL.bg.xxp {
    java.io.InputStream IL;
    java.net.HttpURLConnection bg;

    Kg(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        this.bg = httpURLConnection;
        this.IL = new com.bytedance.sdk.component.IL.bg.bg.bg.ldr(httpURLConnection.getInputStream(), httpURLConnection);
    }

    Kg(java.net.HttpURLConnection httpURLConnection, java.io.InputStream inputStream) {
        this.bg = httpURLConnection;
        this.IL = new com.bytedance.sdk.component.IL.bg.bg.bg.ldr(inputStream, httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.IL.bg.xxp
    public long bg() {
        try {
            return this.bg.getContentLength();
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.xxp
    public java.lang.String IL() {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(this.IL));
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    stringBuffer.append(line + "\n");
                } else {
                    java.lang.String string = stringBuffer.toString();
                    close();
                    return string;
                }
            }
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.xxp, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.IL.close();
            this.bg.disconnect();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.xxp
    public java.io.InputStream bX() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.IL.bg.xxp
    public byte[] eqN() {
        try {
            byte[] bArr = new byte[1024];
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            while (true) {
                int i = this.IL.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (java.lang.Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.xxp
    public com.bytedance.sdk.component.IL.bg.WR zx() {
        if (this.bg.getContentType() != null) {
            return com.bytedance.sdk.component.IL.bg.WR.bg(this.bg.getContentType());
        }
        return null;
    }
}

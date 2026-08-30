package com.bytedance.adsdk.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.adsdk.IL.eqN.eqN {
    private final java.net.HttpURLConnection bg;

    public bg(java.net.HttpURLConnection httpURLConnection) {
        this.bg = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.IL.eqN.eqN
    public boolean bg() {
        try {
            return this.bg.getResponseCode() / 100 == 2;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.IL.eqN.eqN
    public java.io.InputStream IL() throws java.io.IOException {
        return this.bg.getInputStream();
    }

    @Override // com.bytedance.adsdk.IL.eqN.eqN
    public java.lang.String bX() {
        return this.bg.getContentType();
    }

    @Override // com.bytedance.adsdk.IL.eqN.eqN
    public java.lang.String eqN() {
        try {
            if (bg()) {
                return null;
            }
            return "Unable to fetch " + this.bg.getURL() + ". Failed with " + this.bg.getResponseCode() + "\n" + bg(this.bg);
        } catch (java.io.IOException e) {
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.bg.disconnect();
    }

    private java.lang.String bg(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getErrorStream()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            try {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line).append('\n');
                } else {
                    try {
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }
}

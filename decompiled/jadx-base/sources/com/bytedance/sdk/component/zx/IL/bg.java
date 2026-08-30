package com.bytedance.sdk.component.zx.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.sdk.component.zx.eqN<com.bytedance.sdk.component.zx.IL.eqN> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    @Override // com.bytedance.sdk.component.zx.eqN
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.zx.IL.eqN<byte[]> bg(com.bytedance.sdk.component.zx.zx zxVar) throws java.lang.Throwable {
        java.io.InputStream inputStream;
        byte[] byteArray;
        ?? byteArrayOutputStream;
        java.lang.String message;
        ?? r6;
        java.io.InputStream inputStream2 = null;
        java.util.Map<java.lang.String, java.lang.String> mapBg = null;
        int i = 0;
        try {
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(zxVar.bg()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        while (true) {
                            try {
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            } catch (java.net.MalformedURLException e) {
                                e = e;
                                byteArray = null;
                            } catch (java.io.IOException e2) {
                                e = e2;
                                byteArray = null;
                            }
                            android.util.Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                            message = e.getMessage();
                            r6 = byteArrayOutputStream;
                            com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                            com.bytedance.sdk.component.zx.bX.bX.IL.bg(r6);
                            return new com.bytedance.sdk.component.zx.IL.eqN<>(i, byteArray, message, mapBg);
                        }
                        mapBg = zxVar.IL() ? bg(httpURLConnection) : null;
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(byteArrayOutputStream);
                        message = "success";
                    } catch (java.net.MalformedURLException e3) {
                        e = e3;
                        android.util.Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                        message = e.getMessage();
                        r6 = byteArrayOutputStream;
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(r6);
                    } catch (java.io.IOException e4) {
                        e = e4;
                        android.util.Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                        message = e.getMessage();
                        r6 = byteArrayOutputStream;
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                        com.bytedance.sdk.component.zx.bX.bX.IL.bg(r6);
                    }
                    i = 200;
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (java.net.MalformedURLException e5) {
                    e = e5;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                } catch (java.io.IOException e6) {
                    e = e6;
                    byteArray = null;
                    byteArrayOutputStream = byteArray;
                    android.util.Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    r6 = byteArrayOutputStream;
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream);
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(r6);
                    return new com.bytedance.sdk.component.zx.IL.eqN<>(i, byteArray, message, mapBg);
                } catch (java.lang.Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream2);
                    com.bytedance.sdk.component.zx.bX.bX.IL.bg(0);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.net.MalformedURLException e7) {
            e = e7;
            inputStream = null;
            byteArray = null;
        } catch (java.io.IOException e8) {
            e = e8;
            inputStream = null;
            byteArray = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(inputStream2);
            com.bytedance.sdk.component.zx.bX.bX.IL.bg(0);
            throw th;
        }
        return new com.bytedance.sdk.component.zx.IL.eqN<>(i, byteArray, message, mapBg);
    }

    private java.util.Map<java.lang.String, java.lang.String> bg(java.net.HttpURLConnection httpURLConnection) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
        for (java.lang.String str : headerFields.keySet()) {
            java.util.List<java.lang.String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}

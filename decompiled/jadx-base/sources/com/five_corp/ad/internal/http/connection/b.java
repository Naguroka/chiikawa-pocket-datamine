package com.five_corp.ad.internal.http.connection;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.five_corp.ad.internal.http.connection.c {
    /* JADX WARN: Code duplicated, block: B:34:0x006c A[Catch: NullPointerException -> 0x007b, SecurityException -> 0x008b, IllegalArgumentException -> 0x009b, IllegalStateException -> 0x00ab, IOException -> 0x00bb, ProtocolException -> 0x00cb, MalformedURLException -> 0x00db, TryCatch #5 {IllegalArgumentException -> 0x009b, IllegalStateException -> 0x00ab, NullPointerException -> 0x007b, SecurityException -> 0x008b, MalformedURLException -> 0x00db, ProtocolException -> 0x00cb, IOException -> 0x00bb, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0015, B:9:0x0023, B:11:0x002a, B:13:0x0031, B:16:0x0039, B:19:0x0049, B:34:0x006c, B:35:0x006f, B:31:0x0066), top: B:64:0x0002 }] */
    @Override // com.five_corp.ad.internal.http.connection.c
    public final com.five_corp.ad.internal.util.f a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, int i2) throws java.lang.Throwable {
        java.io.OutputStream outputStream;
        try {
            java.net.HttpURLConnection httpURLConnectionA = a(str);
            if (httpURLConnectionA == null) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.m2, null, null, null), null);
            }
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setConnectTimeout(i);
            httpURLConnectionA.setReadTimeout(i2);
            httpURLConnectionA.setRequestMethod(str2);
            if (str4 != null) {
                httpURLConnectionA.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, str4);
            }
            if (str5 != null) {
                httpURLConnectionA.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, str5);
            }
            if (str6 != null) {
                httpURLConnectionA.setRequestProperty("Content-Type", str6);
            }
            if (str3 != null) {
                httpURLConnectionA.setDoOutput(true);
                try {
                    outputStream = httpURLConnectionA.getOutputStream();
                    try {
                        try {
                            outputStream.write(str3.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                            outputStream.close();
                        } catch (java.io.IOException e) {
                            e = e;
                            com.five_corp.ad.internal.util.f fVar = new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.i2, "URL connection output stream io exception", e, null), null);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            return fVar;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    outputStream = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            }
            return new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.http.connection.a(httpURLConnectionA));
        } catch (java.lang.IllegalArgumentException e3) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.h2, "illegal timeout parameter", e3, null), null);
        } catch (java.lang.IllegalStateException e4) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.g2, "illegal state exception on create url connection", e4, null), null);
        } catch (java.lang.NullPointerException e5) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.l2, "null pointer exception on create url connection", e5, null), null);
        } catch (java.lang.SecurityException e6) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.k2, "security exception on create url connection", e6, null), null);
        } catch (java.net.MalformedURLException e7) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.V1, "malformed URL: " + str, e7, null), null);
        } catch (java.net.ProtocolException e8) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.j2, "protocol exception on create url connection", e8, null), null);
        } catch (java.io.IOException e9) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.W1, "fail to open url connection", e9, null), null);
        }
    }

    public static java.net.HttpURLConnection a(java.lang.String str) {
        return (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
    }
}

package com.five_corp.ad.internal.http.connection;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.net.HttpURLConnection f1922a;
    public java.io.InputStream b = null;

    public a(java.net.HttpURLConnection httpURLConnection) {
        this.f1922a = httpURLConnection;
    }

    public final com.five_corp.ad.internal.util.g a() {
        try {
            this.f1922a.connect();
            return new com.five_corp.ad.internal.util.g(true, null);
        } catch (java.net.SocketTimeoutException e) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Y1, null, e, null));
        } catch (java.io.IOException e2) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.X1, null, e2, null));
        } catch (java.lang.Exception e3) {
            return new com.five_corp.ad.internal.util.g(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.f2, null, e3, null));
        }
    }

    public final com.five_corp.ad.internal.util.f b() {
        try {
            return new com.five_corp.ad.internal.util.f(true, null, java.lang.Integer.valueOf(this.f1922a.getResponseCode()));
        } catch (java.io.IOException e) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.Z1, null, e, null), null);
        }
    }

    public final com.five_corp.ad.internal.util.f a(byte[] bArr) {
        if (this.b == null) {
            try {
                this.b = a(this.f1922a);
            } catch (java.net.SocketTimeoutException e) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.c2, null, e, null), null);
            } catch (java.io.IOException e2) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.a2, null, e2, null), null);
            } catch (java.lang.Exception e3) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.b2, null, e3, null), null);
            }
        }
        try {
            return new com.five_corp.ad.internal.util.f(true, null, java.lang.Integer.valueOf(this.b.read(bArr)));
        } catch (java.io.IOException e4) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.d2, null, e4, null), null);
        } catch (java.lang.Exception e5) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.e2, null, e5, null), null);
        }
    }

    public static java.io.InputStream a(java.net.HttpURLConnection httpURLConnection) {
        java.lang.String contentEncoding = httpURLConnection.getContentEncoding();
        return (contentEncoding == null || !contentEncoding.contains("gzip")) ? httpURLConnection.getInputStream() : new java.util.zip.GZIPInputStream(httpURLConnection.getInputStream());
    }
}

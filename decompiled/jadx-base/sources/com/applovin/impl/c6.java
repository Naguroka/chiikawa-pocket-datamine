package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class c6 extends com.applovin.impl.a2 implements com.applovin.impl.pa {
    private final boolean e;
    private final int f;
    private final int g;
    private final java.lang.String h;
    private final com.applovin.impl.pa.f i;
    private final com.applovin.impl.pa.f j;
    private final boolean k;
    private com.applovin.exoplayer2.common.base.Predicate l;
    private com.applovin.impl.k5 m;
    private java.net.HttpURLConnection n;
    private java.io.InputStream o;
    private boolean p;
    private int q;
    private long r;
    private long s;

    public static final class b implements com.applovin.impl.pa.b {
        private com.applovin.impl.xo b;
        private com.applovin.exoplayer2.common.base.Predicate c;
        private java.lang.String d;
        private boolean g;
        private boolean h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.pa.f f668a = new com.applovin.impl.pa.f();
        private int e = 8000;
        private int f = 8000;

        @Override // com.applovin.impl.pa.b, com.applovin.impl.h5.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.c6 a() {
            com.applovin.impl.c6 c6Var = new com.applovin.impl.c6(this.d, this.e, this.f, this.g, this.f668a, this.c, this.h);
            com.applovin.impl.xo xoVar = this.b;
            if (xoVar != null) {
                c6Var.a(xoVar);
            }
            return c6Var;
        }

        public com.applovin.impl.c6.b a(java.lang.String str) {
            this.d = str;
            return this;
        }
    }

    private c6(java.lang.String str, int i, int i2, boolean z, com.applovin.impl.pa.f fVar, com.applovin.exoplayer2.common.base.Predicate predicate, boolean z2) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = z;
        this.i = fVar;
        this.l = predicate;
        this.j = new com.applovin.impl.pa.f();
        this.k = z2;
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        java.net.HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.impl.h5
    public java.util.Map e() {
        java.net.HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? java.util.Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.applovin.impl.h5
    public void close() {
        try {
            java.io.InputStream inputStream = this.o;
            if (inputStream != null) {
                long j = this.r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.s;
                }
                a(this.n, j2);
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    throw new com.applovin.impl.pa.c(e, (com.applovin.impl.k5) com.applovin.impl.xp.a(this.m), 2000, 3);
                }
            }
            this.o = null;
            h();
            if (this.p) {
                this.p = false;
                g();
            }
        } catch (java.lang.Throwable th) {
            this.o = null;
            h();
            if (this.p) {
                this.p = false;
                g();
            }
            throw th;
        }
    }

    private java.net.HttpURLConnection d(com.applovin.impl.k5 k5Var) throws java.io.IOException {
        java.net.URL url = new java.net.URL(k5Var.f947a.toString());
        int i = k5Var.c;
        byte[] bArr = k5Var.d;
        long j = k5Var.g;
        long j2 = k5Var.h;
        boolean zB = k5Var.b(1);
        if (!this.e && !this.k) {
            return a(url, i, bArr, j, j2, zB, true, k5Var.e);
        }
        int i2 = 0;
        java.net.URL urlA = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 <= 20) {
                long j3 = j;
                long j4 = j;
                int i5 = i3;
                java.net.URL url2 = urlA;
                long j5 = j2;
                java.net.HttpURLConnection httpURLConnectionA = a(urlA, i3, bArr2, j3, j2, zB, false, k5Var.e);
                int responseCode = httpURLConnectionA.getResponseCode();
                java.lang.String headerField = httpURLConnectionA.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    httpURLConnectionA.disconnect();
                    urlA = a(url2, headerField, k5Var);
                    i3 = i5;
                } else {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        return httpURLConnectionA;
                    }
                    httpURLConnectionA.disconnect();
                    if (this.k && responseCode == 302) {
                        i3 = i5;
                    } else {
                        bArr2 = null;
                        i3 = 1;
                    }
                    urlA = a(url2, headerField, k5Var);
                }
                i2 = i4;
                j = j4;
                j2 = j5;
            } else {
                throw new com.applovin.impl.pa.c(new java.net.NoRouteToHostException("Too many redirects: " + i4), k5Var, 2001, 1);
            }
        }
    }

    private java.net.URL a(java.net.URL url, java.lang.String str, com.applovin.impl.k5 k5Var) throws com.applovin.impl.pa.c {
        if (str != null) {
            try {
                java.net.URL url2 = new java.net.URL(url, str);
                java.lang.String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                    throw new com.applovin.impl.pa.c("Unsupported protocol redirect: " + protocol, k5Var, 2001, 1);
                }
                if (this.e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new com.applovin.impl.pa.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", k5Var, 2001, 1);
            } catch (java.net.MalformedURLException e) {
                throw new com.applovin.impl.pa.c(e, k5Var, 2001, 1);
            }
        }
        throw new com.applovin.impl.pa.c("Null location redirect", k5Var, 2001, 1);
    }

    private void h() {
        java.net.HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                com.applovin.impl.oc.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.n = null;
        }
    }

    private int e(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.r;
        if (j != -1) {
            long j2 = j - this.s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) java.lang.Math.min(i2, j2);
        }
        int i3 = ((java.io.InputStream) com.applovin.impl.xp.a((java.lang.Object) this.o)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.s += (long) i3;
        d(i3);
        return i3;
    }

    private static boolean a(java.net.HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_ENCODING));
    }

    private java.net.HttpURLConnection a(java.net.URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, java.util.Map map) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f);
        httpURLConnectionA.setReadTimeout(this.g);
        java.util.HashMap map2 = new java.util.HashMap();
        com.applovin.impl.pa.f fVar = this.i;
        if (fVar != null) {
            map2.putAll(fVar.a());
        }
        map2.putAll(this.j.a());
        map2.putAll(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String strA = com.applovin.impl.ra.a(j, j2);
        if (strA != null) {
            httpURLConnectionA.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, strA);
        }
        java.lang.String str = this.h;
        if (str != null) {
            httpURLConnectionA.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str);
        }
        httpURLConnectionA.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z2);
        httpURLConnectionA.setDoOutput(bArr != null);
        httpURLConnectionA.setRequestMethod(com.applovin.impl.k5.a(i));
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            java.io.OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA.connect();
        }
        return httpURLConnectionA;
    }

    private static void a(java.net.HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = com.applovin.impl.xp.f1515a) < 19 || i > 20) {
            return;
        }
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            java.lang.String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                java.lang.reflect.Method declaredMethod = ((java.lang.Class) com.applovin.impl.b1.a(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) throws com.applovin.impl.pa.c {
        byte[] bArrA;
        this.m = k5Var;
        long j = 0;
        this.s = 0L;
        this.r = 0L;
        b(k5Var);
        try {
            java.net.HttpURLConnection httpURLConnectionD = d(k5Var);
            this.n = httpURLConnectionD;
            this.q = httpURLConnectionD.getResponseCode();
            java.lang.String responseMessage = httpURLConnectionD.getResponseMessage();
            int i = this.q;
            if (i >= 200 && i <= 299) {
                java.lang.String contentType = httpURLConnectionD.getContentType();
                com.applovin.exoplayer2.common.base.Predicate predicate = this.l;
                if (predicate != null && !predicate.apply(contentType)) {
                    h();
                    throw new com.applovin.impl.pa.d(contentType, k5Var);
                }
                if (this.q == 200) {
                    long j2 = k5Var.g;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                boolean zA = a(httpURLConnectionD);
                if (!zA) {
                    long j3 = k5Var.h;
                    if (j3 != -1) {
                        this.r = j3;
                    } else {
                        long jA = com.applovin.impl.ra.a(httpURLConnectionD.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH), httpURLConnectionD.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE));
                        this.r = jA != -1 ? jA - j : -1L;
                    }
                } else {
                    this.r = k5Var.h;
                }
                try {
                    this.o = httpURLConnectionD.getInputStream();
                    if (zA) {
                        this.o = new java.util.zip.GZIPInputStream(this.o);
                    }
                    this.p = true;
                    c(k5Var);
                    try {
                        a(j, k5Var);
                        return this.r;
                    } catch (java.io.IOException e) {
                        h();
                        if (e instanceof com.applovin.impl.pa.c) {
                            throw ((com.applovin.impl.pa.c) e);
                        }
                        throw new com.applovin.impl.pa.c(e, k5Var, 2000, 1);
                    }
                } catch (java.io.IOException e2) {
                    h();
                    throw new com.applovin.impl.pa.c(e2, k5Var, 2000, 1);
                }
            }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnectionD.getHeaderFields();
            if (this.q == 416) {
                if (k5Var.g == com.applovin.impl.ra.a(httpURLConnectionD.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE))) {
                    this.p = true;
                    c(k5Var);
                    long j4 = k5Var.h;
                    if (j4 != -1) {
                        return j4;
                    }
                    return 0L;
                }
            }
            java.io.InputStream errorStream = httpURLConnectionD.getErrorStream();
            try {
                if (errorStream != null) {
                    bArrA = com.applovin.impl.xp.a(errorStream);
                } else {
                    bArrA = com.applovin.impl.xp.f;
                }
            } catch (java.io.IOException unused) {
                bArrA = com.applovin.impl.xp.f;
            }
            byte[] bArr = bArrA;
            h();
            throw new com.applovin.impl.pa.e(this.q, responseMessage, this.q == 416 ? new com.applovin.impl.i5(2008) : null, headerFields, k5Var, bArr);
        } catch (java.io.IOException e3) {
            h();
            throw com.applovin.impl.pa.c.a(e3, k5Var, 1);
        }
    }

    java.net.HttpURLConnection a(java.net.URL url) {
        return (java.net.HttpURLConnection) url.openConnection();
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) throws com.applovin.impl.pa.c {
        try {
            return e(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw com.applovin.impl.pa.c.a(e, (com.applovin.impl.k5) com.applovin.impl.xp.a(this.m), 2);
        }
    }

    private void a(long j, com.applovin.impl.k5 k5Var) throws java.io.IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((java.io.InputStream) com.applovin.impl.xp.a((java.lang.Object) this.o)).read(bArr, 0, (int) java.lang.Math.min(j, 4096));
            if (java.lang.Thread.currentThread().isInterrupted()) {
                throw new com.applovin.impl.pa.c(new java.io.InterruptedIOException(), k5Var, 2000, 1);
            }
            if (i != -1) {
                j -= (long) i;
                d(i);
            } else {
                throw new com.applovin.impl.pa.c(k5Var, 2008, 1);
            }
        }
    }
}

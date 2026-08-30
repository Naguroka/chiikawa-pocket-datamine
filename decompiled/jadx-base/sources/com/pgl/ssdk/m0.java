package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3799a;
    private java.lang.String b;
    private int d;
    private int e;
    private byte[] f;
    public java.lang.String c = "";
    private int g = -1;
    private byte[] h = null;
    private int i = 10000;
    private int j = 2;
    private int k = 0;
    private boolean l = false;
    private boolean m = true;
    private java.net.HttpURLConnection n = null;
    private java.lang.Runnable o = new com.pgl.ssdk.m0.a();

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.pgl.ssdk.m0.this.a() || com.pgl.ssdk.m0.this.k >= com.pgl.ssdk.m0.this.j) {
                return;
            }
            com.pgl.ssdk.m0.c(com.pgl.ssdk.m0.this);
            com.pgl.ssdk.o0.a(this);
        }
    }

    public m0(android.content.Context context, java.lang.String str) {
        str = (str == null || str.length() <= 0) ? "" : str;
        this.f3799a = context;
        this.b = str;
    }

    static /* synthetic */ int c(com.pgl.ssdk.m0 m0Var) {
        int i = m0Var.k;
        m0Var.k = i + 1;
        return i;
    }

    public abstract boolean a(int i, byte[] bArr);

    private void a(int i) throws java.net.ProtocolException {
        java.lang.String str;
        if (i == 1) {
            str = "POST";
        } else if (i == 3) {
            str = "PUT";
        } else if (i == 4) {
            str = "DELETE";
        } else if (i != 5) {
            str = i != 6 ? "GET" : "TRACE";
        } else {
            str = "HEAD";
        }
        this.n.setRequestMethod(str);
    }

    private void b(int i) {
        java.lang.String str;
        if (i != 1) {
            str = i != 2 ? "" : "application/octet-stream";
        } else {
            str = "application/json; charset=utf-8";
        }
        if (str.length() > 0) {
            this.n.addRequestProperty("Content-Type", str);
        }
        this.n.addRequestProperty(com.google.common.net.HttpHeaders.COOKIE, "sessionid=" + this.b);
        try {
            java.lang.String language = java.util.Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.n.addRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_LANGUAGE, java.util.Locale.getDefault().toString() + "," + language + ";q=0.9");
            } else {
                this.n.addRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_LANGUAGE, java.util.Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr, 0, 1024);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0075 A[Catch: all -> 0x007d, PHI: r1
  0x0075: PHI (r1v14 java.io.InputStream) = (r1v13 java.io.InputStream), (r1v19 java.io.InputStream) binds: [B:18:0x0072, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x001f, B:9:0x003c, B:11:0x003f, B:12:0x0055, B:20:0x0075, B:6:0x0017), top: B:36:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[PHI: r1 r2
  0x0083: PHI (r1v1 java.net.HttpURLConnection) = (r1v0 java.net.HttpURLConnection), (r1v15 java.net.HttpURLConnection) binds: [B:25:0x0080, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r2v1 boolean) = (r2v0 boolean), (r2v7 boolean) binds: [B:25:0x0080, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean a() {
        java.net.HttpURLConnection httpURLConnection;
        boolean z;
        java.io.InputStream inputStream;
        try {
            java.net.URL url = new java.net.URL(this.c);
            if (this.m) {
                this.n = (java.net.HttpURLConnection) url.openConnection(java.net.Proxy.NO_PROXY);
            } else {
                this.n = (java.net.HttpURLConnection) url.openConnection();
            }
            this.n.setConnectTimeout(this.i);
            this.n.setReadTimeout(this.i);
            a(this.d);
            b(this.e);
            byte[] bArr = this.f;
            z = true;
            if (bArr != null && bArr.length > 0) {
                this.n.setDoOutput(true);
                java.io.OutputStream outputStream = this.n.getOutputStream();
                outputStream.write(this.f);
                outputStream.flush();
                outputStream.close();
            }
            this.n.connect();
            try {
                this.g = this.n.getResponseCode();
                inputStream = this.n.getInputStream();
                try {
                    this.h = a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (java.lang.Throwable unused) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (java.lang.Throwable unused2) {
                inputStream = null;
            }
            httpURLConnection = this.n;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.n = null;
            }
        } catch (java.lang.Throwable unused3) {
            httpURLConnection = this.n;
            z = false;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.n = null;
            }
        }
        if (z) {
            a(this.g, this.h);
        }
        return z;
    }

    private void b(int i, int i2, byte[] bArr) {
        this.d = i;
        this.e = i2;
        this.f = bArr;
    }

    public void a(int i, int i2, byte[] bArr) {
        b(i, i2, bArr);
        com.pgl.ssdk.o0.a(this.o);
    }
}

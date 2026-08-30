package com.apm.insight.k;

/* JADX INFO: compiled from: CrashUploader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f429a = false;
    private static com.apm.insight.b.h.a b;

    public static boolean a() {
        return false;
    }

    public static boolean b() {
        return false;
    }

    private static com.apm.insight.l.f a(java.lang.String str, byte[] bArr, com.apm.insight.k.e.a aVar, java.lang.String str2) throws java.io.IOException {
        java.lang.String str3;
        if (com.apm.insight.Npth.isStopUpload()) {
            return new com.apm.insight.l.f(com.ironsource.g3.c.b.b);
        }
        if (str == null) {
            return new com.apm.insight.l.f(com.ironsource.g3.c.b.b);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (com.apm.insight.k.e.a.f430a == aVar && length > 128) {
            bArr = a(bArr);
            str3 = "gzip";
        } else if (com.apm.insight.k.e.a.b != aVar || length <= 128) {
            str3 = null;
        } else {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8192);
            java.util.zip.Deflater deflater = new java.util.zip.Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream.toByteArray();
            str3 = "deflate";
        }
        if (bArr == null) {
            return new com.apm.insight.l.f(com.ironsource.g3.c.b.c);
        }
        return a(str, bArr, str2, str3, "POST");
    }

    private static byte[] a(byte[] bArr) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8192);
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable th) {
            try {
                com.apm.insight.a.b(th);
                return null;
            } finally {
                gZIPOutputStream.close();
            }
        }
    }

    public static void a(com.apm.insight.b.h.a aVar) {
        b = aVar;
    }

    private static com.apm.insight.l.f a(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.io.InputStream inputStream;
        byte[] bArrA;
        java.io.DataOutputStream dataOutputStream;
        java.net.HttpURLConnection httpURLConnection = null;
        java.util.zip.GZIPInputStream gZIPInputStream = null;
        try {
            com.apm.insight.b.h.a aVar = b;
            if (aVar != null) {
                try {
                    str = aVar.c();
                } catch (java.lang.Throwable unused) {
                }
            }
            java.net.HttpURLConnection httpURLConnection2 = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            try {
                httpURLConnection2.setDoOutput(true);
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty(com.google.common.net.HttpHeaders.CONTENT_ENCODING, str3);
                }
                httpURLConnection2.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "gzip");
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new java.io.DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.insight.a.a((java.io.Closeable) dataOutputStream);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            com.apm.insight.a.a((java.io.Closeable) dataOutputStream);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    com.apm.insight.l.f fVar = new com.apm.insight.l.f("http response code ".concat(java.lang.String.valueOf(responseCode)));
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                    com.apm.insight.a.a((java.io.Closeable) null);
                    return fVar;
                }
                java.io.InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                        try {
                            java.util.zip.GZIPInputStream gZIPInputStream2 = new java.util.zip.GZIPInputStream(inputStream2);
                            try {
                                bArrA = a(gZIPInputStream2);
                                com.apm.insight.a.a((java.io.Closeable) gZIPInputStream2);
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                gZIPInputStream = gZIPInputStream2;
                                com.apm.insight.a.a((java.io.Closeable) gZIPInputStream);
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                        }
                    } else {
                        bArrA = a(inputStream2);
                    }
                    com.apm.insight.l.f fVar2 = new com.apm.insight.l.f(bArrA);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (java.lang.Exception unused3) {
                        }
                    }
                    com.apm.insight.a.a((java.io.Closeable) inputStream2);
                    return fVar2;
                } catch (java.lang.Throwable th5) {
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    th = th5;
                    try {
                        com.apm.insight.a.a(th);
                        return new com.apm.insight.l.f(207, th);
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (java.lang.Exception unused4) {
                            }
                        }
                        com.apm.insight.a.a((java.io.Closeable) inputStream);
                    }
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    public static com.apm.insight.l.f a(java.lang.String str, java.lang.String str2) {
        return d(str, str2);
    }

    public static com.apm.insight.l.f b(java.lang.String str, java.lang.String str2) {
        return d(str, str2);
    }

    public static com.apm.insight.l.f a(java.lang.String str, java.lang.String str2, java.io.File... fileArr) {
        return b(str, str2, fileArr);
    }

    private static com.apm.insight.l.f b(java.lang.String str, java.lang.String str2, java.io.File... fileArr) {
        if (com.apm.insight.Npth.isStopUpload()) {
            return new com.apm.insight.l.f(com.ironsource.g3.c.b.b);
        }
        try {
            com.apm.insight.k.i iVar = new com.apm.insight.k.i(c(str, "have_dump=true"), com.adjust.sdk.Constants.ENCODING, true);
            iVar.b("json", str2);
            iVar.a(com.ironsource.y8.h.b, fileArr);
            try {
                return new com.apm.insight.l.f(new org.json.JSONObject(iVar.a()));
            } catch (org.json.JSONException e) {
                return new com.apm.insight.l.f(0, e);
            }
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
            return new com.apm.insight.l.f(207);
        }
    }

    private static java.lang.String c(java.lang.String str, java.lang.String str2) {
        try {
            if (android.text.TextUtils.isEmpty(new java.net.URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith(com.ironsource.y8.i.c)) {
                str = str + com.ironsource.y8.i.c;
            }
            return str + str2;
        } catch (java.lang.Throwable unused) {
            return str;
        }
    }

    public static boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list) {
        if (com.apm.insight.Npth.isStopUpload()) {
            return false;
        }
        try {
            com.apm.insight.k.i iVar = new com.apm.insight.k.i(str, com.adjust.sdk.Constants.ENCODING, false);
            iVar.a(com.json.tk.SESSION_HISTORY_KEY_AD_ID, str2);
            iVar.a("device_id", str3);
            iVar.a(com.json.ce.y, com.json.y8.d);
            iVar.a("process_name", str4);
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                java.io.File file = new java.io.File(it.next());
                if (file.exists()) {
                    java.util.HashMap map = new java.util.HashMap();
                    map.put("logtype", "alog");
                    map.put("scene", "Crash");
                    iVar.a(file.getName(), file, map);
                }
            }
            try {
                return new org.json.JSONObject(iVar.a()).optInt("errno", -1) == 200;
            } catch (org.json.JSONException unused) {
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static java.lang.String c() {
        return com.apm.insight.e.i().getJavaCrashUploadUrl();
    }

    public static java.lang.String d() {
        return com.apm.insight.e.i().getAlogUploadUrl();
    }

    public static java.lang.String e() {
        return com.apm.insight.e.i().getLaunchCrashUploadUrl();
    }

    public static java.lang.String f() {
        return com.apm.insight.e.i().getExceptionUploadUrl();
    }

    public static java.lang.String g() {
        return com.apm.insight.e.i().getNativeCrashUploadUrl();
    }

    private static com.apm.insight.l.f d(java.lang.String str, java.lang.String str2) {
        try {
            if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str)) {
                return a(str, str2.getBytes(), com.apm.insight.k.e.a.f430a, "application/json; charset=utf-8");
            }
            return new com.apm.insight.l.f(com.ironsource.g3.c.b.b);
        } catch (java.lang.Throwable th) {
            com.apm.insight.a.b(th);
            return new com.apm.insight.l.f(207, th);
        }
    }

    private static byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 != i) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.insight.a.a((java.io.Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: CrashUploader.java */
    public static final class a {
        private int d;
        private static com.apm.insight.k.e.a c = new com.apm.insight.k.e.a("NONE", 0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.apm.insight.k.e.a f430a = new com.apm.insight.k.e.a("GZIP", 1, 1);
        public static final com.apm.insight.k.e.a b = new com.apm.insight.k.e.a("DEFLATER", 2, 2);

        private a(java.lang.String str, int i, int i2) {
            super(str, i);
            this.d = i2;
        }
    }

    /* JADX INFO: compiled from: CrashUploader.java */
    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);

        private int l;

        b(int i) {
            this.l = i;
        }
    }

    public static byte[] a(java.lang.String str, byte[] bArr) {
        try {
            android.text.TextUtils.isDigitsOnly(str);
            return a(str, bArr, com.apm.insight.k.e.a.f430a, "application/json; charset=utf-8").b();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

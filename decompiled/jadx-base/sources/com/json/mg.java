package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3035a = "POST";
    private static final java.lang.String b = "GET";
    private static final java.lang.String c = "ISHttpService";

    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final java.lang.String j = "UTF-8";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f3036a;
        final java.lang.String b;
        final java.lang.String c;
        final int d;
        final int e;
        final java.lang.String f;
        java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> g;

        /* JADX INFO: renamed from: com.ironsource.mg$a$a, reason: collision with other inner class name */
        static class C0240a {
            java.lang.String b;
            java.lang.String d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> f3037a = new java.util.ArrayList();
            java.lang.String c = "POST";
            int e = 15000;
            int f = 15000;
            java.lang.String g = "UTF-8";

            C0240a() {
            }

            com.ironsource.mg.a.C0240a a(int i) {
                this.e = i;
                return this;
            }

            com.ironsource.mg.a.C0240a a(android.util.Pair<java.lang.String, java.lang.String> pair) {
                this.f3037a.add(pair);
                return this;
            }

            com.ironsource.mg.a.C0240a a(java.lang.String str) {
                this.d = str;
                return this;
            }

            com.ironsource.mg.a.C0240a a(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) {
                this.f3037a.addAll(list);
                return this;
            }

            com.ironsource.mg.a a() {
                return new com.ironsource.mg.a(this);
            }

            com.ironsource.mg.a.C0240a b(int i) {
                this.f = i;
                return this;
            }

            com.ironsource.mg.a.C0240a b(java.lang.String str) {
                this.g = str;
                return this;
            }

            com.ironsource.mg.a.C0240a c(java.lang.String str) {
                this.b = str;
                return this;
            }

            com.ironsource.mg.a.C0240a d(java.lang.String str) {
                this.c = str;
                return this;
            }
        }

        public a(com.ironsource.mg.a.C0240a c0240a) {
            this.f3036a = c0240a.b;
            this.b = c0240a.c;
            this.c = c0240a.d;
            this.g = new java.util.ArrayList<>(c0240a.f3037a);
            this.d = c0240a.e;
            this.e = c0240a.f;
            this.f = c0240a.g;
        }

        boolean a() {
            return "POST".equals(this.b);
        }
    }

    public static com.json.bq a(java.lang.String str, java.lang.String str2, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.lang.Exception {
        android.net.Uri uriBuild = android.net.Uri.parse(str).buildUpon().encodedQuery(str2).build();
        com.ironsource.mg.a.C0240a c0240a = new com.ironsource.mg.a.C0240a();
        c0240a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0240a.a());
    }

    private static java.net.HttpURLConnection a(com.ironsource.mg.a aVar) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(aVar.f3036a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }

    private static void a(java.net.HttpURLConnection httpURLConnection, com.ironsource.mg.a aVar) throws java.lang.Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.CONTENT_LENGTH, java.lang.Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(java.net.HttpURLConnection httpURLConnection, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.net.ProtocolException {
        for (android.util.Pair<java.lang.String, java.lang.String> pair : list) {
            httpURLConnection.setRequestProperty((java.lang.String) pair.first, (java.lang.String) pair.second);
        }
    }

    private static void a(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.lang.Exception {
        httpURLConnection.setDoOutput(true);
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a0: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x00a0 */
    public static com.json.bq b(com.ironsource.mg.a aVar) throws java.lang.Exception {
        java.net.HttpURLConnection httpURLConnectionA;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        if (!a(aVar.f3036a, aVar.c)) {
            throw new java.security.InvalidParameterException("not valid params");
        }
        com.json.bq bqVar = new com.json.bq();
        java.io.InputStream inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        java.net.HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnectionA = a(aVar);
                try {
                    a(httpURLConnectionA, aVar.g);
                    a(httpURLConnectionA, aVar);
                    inputStream3 = httpURLConnectionA.getInputStream();
                    bqVar.f2539a = httpURLConnectionA.getResponseCode();
                    if (inputStream3 != null) {
                        bqVar.b = com.json.ev.a(inputStream3);
                    }
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                } catch (java.io.InterruptedIOException e) {
                    e = e;
                    android.util.Log.d(c, "Failed post to " + aVar.f3036a + " exception: " + e.getMessage());
                    throw e;
                } catch (javax.net.ssl.SSLException e2) {
                    e = e2;
                    android.util.Log.d(c, "Failed post to " + aVar.f3036a + " exception: " + e.getMessage());
                    throw e;
                } catch (java.io.IOException e3) {
                    e = e3;
                    inputStream = inputStream3;
                    httpURLConnection = httpURLConnectionA;
                    com.json.l9.d().a(e);
                    if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                        throw new com.json.co(e);
                    }
                    if (httpURLConnection != null) {
                        int responseCode = httpURLConnection.getResponseCode();
                        bqVar.f2539a = responseCode;
                        if (responseCode >= 400) {
                            android.util.Log.d(c, "Failed post to " + aVar.f3036a + " StatusCode: " + bqVar.f2539a);
                            if (inputStream != null) {
                                java.io.InputStream inputStream4 = inputStream;
                                httpURLConnectionA = httpURLConnection;
                                inputStream3 = inputStream4;
                                inputStream3.close();
                            } else {
                                httpURLConnectionA = httpURLConnection;
                            }
                        }
                    }
                    throw e;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                httpURLConnectionA = null;
                inputStream3 = inputStream2;
            }
        } catch (java.io.InterruptedIOException e4) {
            e = e4;
            android.util.Log.d(c, "Failed post to " + aVar.f3036a + " exception: " + e.getMessage());
            throw e;
        } catch (javax.net.ssl.SSLException e5) {
            e = e5;
            android.util.Log.d(c, "Failed post to " + aVar.f3036a + " exception: " + e.getMessage());
            throw e;
        } catch (java.io.IOException e6) {
            e = e6;
            inputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            httpURLConnectionA = null;
        }
        httpURLConnectionA.disconnect();
        return bqVar;
    }

    public static com.json.bq b(java.lang.String str, java.lang.String str2, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.lang.Exception {
        com.ironsource.mg.a.C0240a c0240a = new com.ironsource.mg.a.C0240a();
        c0240a.c(str).a(str2).d("POST").a(list);
        return b(c0240a.a());
    }
}

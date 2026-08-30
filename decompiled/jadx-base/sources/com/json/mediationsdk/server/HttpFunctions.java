package com.json.mediationsdk.server;

/* JADX INFO: loaded from: classes5.dex */
public class HttpFunctions {
    public static final java.lang.String ERROR_PREFIX = "ERROR:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3018a = 15000;
    private static final java.lang.String b = "GET";
    private static final java.lang.String c = "POST";
    private static final java.lang.String d = "UTF-8";
    private static final java.lang.String e = "Bad Request - 400";
    private static final java.util.concurrent.ExecutorService f = java.util.concurrent.Executors.newSingleThreadExecutor();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3019a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.json.ue c;

        a(java.lang.String str, java.lang.String str2, com.json.ue ueVar) {
            this.f3019a = str;
            this.b = str2;
            this.c = ueVar;
        }

        @Override // java.lang.Runnable
        public void run() throws java.lang.Throwable {
            java.net.HttpURLConnection httpURLConnectionB;
            java.io.OutputStream outputStream;
            try {
                httpURLConnectionB = com.json.mediationsdk.server.HttpFunctions.b(this.f3019a);
                try {
                    outputStream = httpURLConnectionB.getOutputStream();
                    try {
                        try {
                            com.json.mediationsdk.server.HttpFunctions.b(this.b, outputStream);
                            int responseCode = httpURLConnectionB.getResponseCode();
                            boolean z = responseCode == 200;
                            if (!z) {
                                com.json.mediationsdk.logger.IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                            }
                            this.c.a(z);
                        } catch (java.lang.Exception e) {
                            e = e;
                            com.json.l9.d().a(e);
                            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                            this.c.a(false);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        com.json.mediationsdk.server.HttpFunctions.b(outputStream, httpURLConnectionB, null);
                        throw th;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    outputStream = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    outputStream = null;
                    com.json.mediationsdk.server.HttpFunctions.b(outputStream, httpURLConnectionB, null);
                    throw th;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                httpURLConnectionB = null;
                outputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                httpURLConnectionB = null;
                outputStream = null;
            }
            com.json.mediationsdk.server.HttpFunctions.b(outputStream, httpURLConnectionB, null);
        }
    }

    private static java.lang.String a(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
        }
        java.lang.String string = sb.toString();
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.net.HttpURLConnection b(java.lang.String str) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setReadTimeout(f3018a);
        httpURLConnection.setConnectTimeout(f3018a);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(java.io.OutputStream outputStream, java.net.HttpURLConnection httpURLConnection, java.io.BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.io.IOException e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception while closing output stream " + e2.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException e3) {
                com.json.l9.d().a(e3);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception while closing reader " + e3.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static java.lang.String getStringFromURL(java.lang.String str) throws java.lang.Exception {
        return getStringFromURL(str, null);
    }

    public static java.lang.String getStringFromURL(java.lang.String str, com.ironsource.mediationsdk.p.c cVar) throws java.lang.Throwable {
        java.net.HttpURLConnection httpURLConnection;
        java.io.BufferedReader bufferedReader;
        java.lang.Exception e2;
        java.io.BufferedReader bufferedReader2;
        java.lang.Throwable th;
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(f3018a);
                httpURLConnection.setConnectTimeout(f3018a);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (cVar != null) {
                        cVar.a(e);
                    }
                    b(null, httpURLConnection, null);
                    return null;
                }
                bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    java.lang.String strA = a(bufferedReader2);
                    b(null, httpURLConnection, bufferedReader2);
                    return strA;
                } catch (java.lang.Exception e3) {
                    e2 = e3;
                    try {
                        com.json.l9.d().a(e2);
                        b(null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (java.lang.Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        java.io.BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        b(null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    b(null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                e2 = e;
                bufferedReader2 = null;
                com.json.l9.d().a(e2);
                b(null, httpURLConnection, bufferedReader2);
                return null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                bufferedReader = null;
                java.io.BufferedReader bufferedReader4 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader4;
                b(null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            httpURLConnection = null;
        } catch (java.lang.Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static java.lang.String sendPostRequest(java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.p.c cVar) {
        java.io.BufferedReader bufferedReader;
        java.io.OutputStream outputStream;
        java.net.HttpURLConnection httpURLConnectionB;
        java.lang.Exception e2;
        java.io.BufferedReader bufferedReader2;
        java.lang.Throwable th;
        java.net.HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionB = b(str);
            try {
                httpURLConnectionB.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                outputStream = httpURLConnectionB.getOutputStream();
                try {
                    b(str2, outputStream);
                    int responseCode = httpURLConnectionB.getResponseCode();
                    if (!(responseCode == 200)) {
                        if (responseCode == 400 && cVar != null) {
                            cVar.a(e);
                        }
                        b(outputStream, httpURLConnectionB, null);
                        return null;
                    }
                    bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnectionB.getInputStream()));
                    try {
                        java.lang.String strA = a(bufferedReader2);
                        b(outputStream, httpURLConnectionB, bufferedReader2);
                        return strA;
                    } catch (java.lang.Exception e3) {
                        e2 = e3;
                        try {
                            com.json.l9.d().a(e2);
                            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception while sending request " + e2.getMessage());
                            b(outputStream, httpURLConnectionB, bufferedReader2);
                            return null;
                        } catch (java.lang.Throwable th2) {
                            httpURLConnection = httpURLConnectionB;
                            bufferedReader = bufferedReader2;
                            th = th2;
                            th = th;
                            bufferedReader2 = bufferedReader;
                            httpURLConnectionB = httpURLConnection;
                            b(outputStream, httpURLConnectionB, bufferedReader2);
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        b(outputStream, httpURLConnectionB, bufferedReader2);
                        throw th;
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                    e2 = e;
                    bufferedReader2 = null;
                    com.json.l9.d().a(e2);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception while sending request " + e2.getMessage());
                    b(outputStream, httpURLConnectionB, bufferedReader2);
                    return null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    httpURLConnection = httpURLConnectionB;
                    bufferedReader = null;
                    th = th;
                    bufferedReader2 = bufferedReader;
                    httpURLConnectionB = httpURLConnection;
                    b(outputStream, httpURLConnectionB, bufferedReader2);
                    throw th;
                }
            } catch (java.lang.Exception e5) {
                e = e5;
                outputStream = null;
            } catch (java.lang.Throwable th5) {
                th = th5;
                outputStream = null;
                httpURLConnection = httpURLConnectionB;
                bufferedReader = null;
            }
        } catch (java.lang.Exception e6) {
            e = e6;
            httpURLConnectionB = null;
            outputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            bufferedReader = null;
            outputStream = null;
        }
    }

    public static void sendPostRequest(java.lang.String str, java.lang.String str2, com.json.ue ueVar) {
        f.submit(new com.ironsource.mediationsdk.server.HttpFunctions.a(str, str2, ueVar));
    }
}

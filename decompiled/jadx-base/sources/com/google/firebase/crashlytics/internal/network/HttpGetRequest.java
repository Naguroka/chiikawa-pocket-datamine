package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: classes5.dex */
public class HttpGetRequest {
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private static final java.lang.String METHOD_GET = "GET";
    private static final int READ_BUFFER_SIZE = 8192;
    private final java.util.Map<java.lang.String, java.lang.String> headers = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.lang.String> queryParams;
    private final java.lang.String url;

    public HttpGetRequest(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.url = str;
        this.queryParams = map;
    }

    public com.google.firebase.crashlytics.internal.network.HttpGetRequest header(java.lang.String str, java.lang.String str2) {
        this.headers.put(str, str2);
        return this;
    }

    public com.google.firebase.crashlytics.internal.network.HttpGetRequest header(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    public com.google.firebase.crashlytics.internal.network.HttpResponse execute() throws java.lang.Throwable {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBlockingThread();
        java.io.InputStream inputStream = null;
        java.lang.String stream = null;
        inputStream = null;
        try {
            java.lang.String strCreateUrlWithParams = createUrlWithParams(this.url, this.queryParams);
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("GET Request URL: " + strCreateUrlWithParams);
            httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(strCreateUrlWithParams).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.headers.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                java.io.InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        stream = readStream(inputStream2);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new com.google.firebase.crashlytics.internal.network.HttpResponse(responseCode, stream);
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    private java.lang.String createUrlWithParams(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.UnsupportedEncodingException {
        java.lang.String strCreateParamsString = createParamsString(map);
        if (strCreateParamsString.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith(com.ironsource.y8.i.c)) {
                strCreateParamsString = com.ironsource.y8.i.c + strCreateParamsString;
            }
            return str + strCreateParamsString;
        }
        return str + "?" + strCreateParamsString;
    }

    private java.lang.String createParamsString(java.util.Map<java.lang.String, java.lang.String> map) throws java.io.UnsupportedEncodingException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
        sb.append(next.getKey()).append(com.ironsource.y8.i.b).append(next.getValue() != null ? java.net.URLEncoder.encode(next.getValue(), com.adjust.sdk.Constants.ENCODING) : "");
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, java.lang.String> next2 = it.next();
            sb.append(com.ironsource.y8.i.c).append(next2.getKey()).append(com.ironsource.y8.i.b).append(next2.getValue() != null ? java.net.URLEncoder.encode(next2.getValue(), com.adjust.sdk.Constants.ENCODING) : "");
        }
        return sb.toString();
    }

    private java.lang.String readStream(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.adjust.sdk.Constants.ENCODING));
        char[] cArr = new char[8192];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i != -1) {
                sb.append(cArr, 0, i);
            } else {
                return sb.toString();
            }
        }
    }
}

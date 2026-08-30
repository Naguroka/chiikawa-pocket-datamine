package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustLinkResolution {
    private static volatile java.util.concurrent.ExecutorService executor = null;
    private static final java.lang.String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link"};
    private static final int maxRecursions = 10;

    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(android.net.Uri uri);
    }

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.net.URL f73a;
        public final /* synthetic */ com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback b;

        public a(java.net.URL url, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
            this.f73a = url;
            this.b = adjustLinkResolutionCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.AdjustLinkResolution.requestAndResolve(this.f73a, 0, this.b);
        }
    }

    private AdjustLinkResolution() {
    }

    private static java.net.URL convertToHttps(java.net.URL url) {
        java.lang.String externalForm;
        if (url == null || (externalForm = url.toExternalForm()) == null || !externalForm.startsWith("http:")) {
            return url;
        }
        try {
            return new java.net.URL("https:" + externalForm.substring(5));
        } catch (java.net.MalformedURLException unused) {
            return url;
        }
    }

    private static android.net.Uri convertToUri(java.net.URL url) {
        if (url == null) {
            return null;
        }
        return android.net.Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(java.lang.String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requestAndResolve(java.net.URL url, int i, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        java.net.HttpURLConnection httpURLConnection;
        java.net.URL urlConvertToHttps = convertToHttps(url);
        java.net.URL url2 = null;
        try {
            httpURLConnection = (java.net.HttpURLConnection) urlConvertToHttps.openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.connect();
                java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                if (headerField != null) {
                    url2 = new java.net.URL(headerField);
                }
            } catch (java.lang.Throwable unused) {
                if (httpURLConnection != null) {
                }
                resolveLink(url2, urlConvertToHttps, i + 1, adjustLinkResolutionCallback);
            }
        } catch (java.lang.Throwable unused2) {
            httpURLConnection = null;
        }
        httpURLConnection.disconnect();
        resolveLink(url2, urlConvertToHttps, i + 1, adjustLinkResolutionCallback);
    }

    public static void resolveLink(java.lang.String str, java.lang.String[] strArr, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        java.net.URL url;
        if (adjustLinkResolutionCallback == null) {
            return;
        }
        if (str == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        try {
            url = new java.net.URL(str);
        } catch (java.net.MalformedURLException unused) {
            url = null;
        }
        if (url == null) {
            adjustLinkResolutionCallback.resolvedLinkCallback(null);
            return;
        }
        if (!urlMatchesSuffix(url.getHost(), strArr)) {
            adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
            return;
        }
        if (executor == null) {
            synchronized (expectedUrlHostSuffixArray) {
                if (executor == null) {
                    executor = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
        }
        executor.execute(new com.adjust.sdk.AdjustLinkResolution.a(url, adjustLinkResolutionCallback));
    }

    private static boolean urlMatchesSuffix(java.lang.String str, java.lang.String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (java.lang.String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static void resolveLink(java.net.URL url, java.net.URL url2, int i, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        android.net.Uri uriConvertToUri;
        if (url == null) {
            uriConvertToUri = convertToUri(url2);
        } else {
            if (!isTerminalUrl(url.getHost()) && i <= 10) {
                requestAndResolve(url, i, adjustLinkResolutionCallback);
                return;
            }
            uriConvertToUri = convertToUri(url);
        }
        adjustLinkResolutionCallback.resolvedLinkCallback(uriConvertToUri);
    }
}

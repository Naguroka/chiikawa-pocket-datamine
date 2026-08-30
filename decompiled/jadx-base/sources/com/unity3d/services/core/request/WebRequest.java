package com.unity3d.services.core.request;

/* JADX INFO: loaded from: classes6.dex */
public class WebRequest {
    private java.io.ByteArrayOutputStream _baos;
    private byte[] _body;
    private boolean _canceled;
    private int _connectTimeout;
    private long _contentLength;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> _headers;
    private com.unity3d.services.core.request.IWebRequestProgressListener _progressListener;
    private int _readTimeout;
    private java.lang.String _requestType;
    private int _responseCode;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> _responseHeaders;
    private java.net.URL _url;

    public enum RequestType {
        POST,
        GET,
        HEAD
    }

    public WebRequest(java.lang.String str, java.lang.String str2) throws java.net.MalformedURLException {
        this(str, str2, null);
    }

    public WebRequest(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) throws java.net.MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    public WebRequest(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, int i, int i2) throws java.net.MalformedURLException {
        this._responseCode = -1;
        this._contentLength = -1L;
        this._canceled = false;
        this._url = new java.net.URL(str);
        this._requestType = str2;
        this._headers = map;
        this._connectTimeout = i;
        this._readTimeout = i2;
    }

    public void cancel() {
        this._canceled = true;
    }

    public boolean isCanceled() {
        return this._canceled;
    }

    public java.net.URL getUrl() {
        return this._url;
    }

    public java.lang.String getRequestType() {
        return this._requestType;
    }

    public byte[] getBody() {
        return this._body;
    }

    public void setBody(java.lang.String str) {
        this._body = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void setBody(byte[] bArr) {
        this._body = bArr;
    }

    public java.lang.String getQuery() {
        java.net.URL url = this._url;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this._responseHeaders;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this._headers;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public void setConnectTimeout(int i) {
        this._connectTimeout = i;
    }

    public int getReadTimeout() {
        return this._readTimeout;
    }

    public void setReadTimeout(int i) {
        this._readTimeout = i;
    }

    public void setProgressListener(com.unity3d.services.core.request.IWebRequestProgressListener iWebRequestProgressListener) {
        this._progressListener = iWebRequestProgressListener;
    }

    public long makeStreamRequest(java.io.OutputStream outputStream) throws java.lang.Exception {
        java.io.InputStream errorStream;
        java.net.HttpURLConnection httpUrlConnectionWithHeaders = getHttpUrlConnectionWithHeaders();
        httpUrlConnectionWithHeaders.setDoInput(true);
        if (getRequestType().equals(com.unity3d.services.core.request.WebRequest.RequestType.POST.name())) {
            httpUrlConnectionWithHeaders.setDoOutput(true);
            java.io.OutputStream outputStream2 = null;
            try {
                try {
                    outputStream2 = httpUrlConnectionWithHeaders.getOutputStream();
                    if (getBody() == null) {
                        java.lang.String query = getQuery();
                        if (query != null) {
                            outputStream2.write(query.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                        }
                    } else {
                        outputStream2.write(getBody());
                    }
                    outputStream2.flush();
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (java.io.IOException e) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error closing writer", e);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                            throw th;
                        } catch (java.io.IOException e2) {
                            com.unity3d.services.core.log.DeviceLog.exception("Error closing writer", e2);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException e3) {
                com.unity3d.services.core.log.DeviceLog.exception("Error while writing POST params", e3);
                throw new com.unity3d.services.core.request.NetworkIOException("Error writing POST params: " + e3.getMessage());
            }
        }
        try {
            this._responseCode = httpUrlConnectionWithHeaders.getResponseCode();
            long contentLength = httpUrlConnectionWithHeaders.getContentLength();
            this._contentLength = contentLength;
            if (contentLength == -1) {
                this._contentLength = httpUrlConnectionWithHeaders.getHeaderFieldInt("X-OrigLength", -1);
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = this._baos;
            long j = 0;
            java.io.OutputStream outputStream3 = outputStream;
            if (byteArrayOutputStream != null && byteArrayOutputStream == outputStream3 && this._contentLength > 0) {
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream((int) this._contentLength);
                this._baos = byteArrayOutputStream2;
                outputStream3 = byteArrayOutputStream2;
            }
            if (httpUrlConnectionWithHeaders.getHeaderFields() != null) {
                this._responseHeaders = httpUrlConnectionWithHeaders.getHeaderFields();
            }
            try {
                errorStream = httpUrlConnectionWithHeaders.getInputStream();
            } catch (java.io.IOException e4) {
                errorStream = httpUrlConnectionWithHeaders.getErrorStream();
                if (errorStream == null) {
                    throw new com.unity3d.services.core.request.NetworkIOException("Can't open error stream: " + e4.getMessage());
                }
            }
            com.unity3d.services.core.request.IWebRequestProgressListener iWebRequestProgressListener = this._progressListener;
            if (iWebRequestProgressListener != null) {
                iWebRequestProgressListener.onRequestStart(getUrl().toString(), this._contentLength, this._responseCode, this._responseHeaders);
            }
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(errorStream);
            byte[] bArr = new byte[4096];
            int i = 0;
            while (!isCanceled() && i != -1) {
                try {
                    i = bufferedInputStream.read(bArr);
                    if (i > 0) {
                        outputStream3.write(bArr, 0, i);
                        j += (long) i;
                        com.unity3d.services.core.request.IWebRequestProgressListener iWebRequestProgressListener2 = this._progressListener;
                        if (iWebRequestProgressListener2 != null) {
                            iWebRequestProgressListener2.onRequestProgress(getUrl().toString(), j, this._contentLength);
                        }
                    }
                } catch (java.io.IOException e5) {
                    throw new com.unity3d.services.core.request.NetworkIOException("Network exception: " + e5.getMessage());
                } catch (java.lang.Exception e6) {
                    throw new java.lang.Exception("Unknown Exception: " + e6.getMessage());
                }
            }
            httpUrlConnectionWithHeaders.disconnect();
            outputStream3.flush();
            return j;
        } catch (java.io.IOException | java.lang.RuntimeException e7) {
            throw new com.unity3d.services.core.request.NetworkIOException("Response code: " + e7.getMessage());
        }
    }

    public java.lang.String makeRequest() throws java.lang.Exception {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this._baos = byteArrayOutputStream;
        makeStreamRequest(byteArrayOutputStream);
        return this._baos.toString(com.adjust.sdk.Constants.ENCODING);
    }

    private java.net.HttpURLConnection getHttpUrlConnectionWithHeaders() throws com.unity3d.services.core.request.NetworkIOException, java.lang.IllegalArgumentException {
        java.net.HttpURLConnection httpURLConnection;
        if (getUrl().toString().startsWith("https://")) {
            try {
                httpURLConnection = (javax.net.ssl.HttpsURLConnection) getUrl().openConnection();
            } catch (java.io.IOException e) {
                throw new com.unity3d.services.core.request.NetworkIOException("Open HTTPS connection: " + e.getMessage());
            }
        } else if (getUrl().toString().startsWith("http://")) {
            try {
                httpURLConnection = (java.net.HttpURLConnection) getUrl().openConnection();
            } catch (java.io.IOException e2) {
                throw new com.unity3d.services.core.request.NetworkIOException("Open HTTP connection: " + e2.getMessage());
            }
        } else {
            throw new java.lang.IllegalArgumentException("Invalid url-protocol in url: " + getUrl().toString());
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(getConnectTimeout());
        httpURLConnection.setReadTimeout(getReadTimeout());
        try {
            httpURLConnection.setRequestMethod(getRequestType());
            if (getHeaders() != null && getHeaders().size() > 0) {
                for (java.lang.String str : getHeaders().keySet()) {
                    for (java.lang.String str2 : getHeaders().get(str)) {
                        com.unity3d.services.core.log.DeviceLog.debug("Setting header: " + str + com.ironsource.y8.i.b + str2);
                        httpURLConnection.setRequestProperty(str, str2);
                    }
                }
            }
            return httpURLConnection;
        } catch (java.net.ProtocolException e3) {
            throw new com.unity3d.services.core.request.NetworkIOException("Set Request Method: " + getRequestType() + ", " + e3.getMessage());
        }
    }
}

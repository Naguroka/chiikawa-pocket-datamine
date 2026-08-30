package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UrlResponseInfo {

    public static abstract class HeaderBlock {
        public abstract java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAsList();

        public abstract java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAsMap();
    }

    public abstract java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAllHeaders();

    public abstract java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAllHeadersAsList();

    public abstract int getHttpStatusCode();

    public abstract java.lang.String getHttpStatusText();

    public abstract java.lang.String getNegotiatedProtocol();

    public abstract java.lang.String getProxyServer();

    public abstract long getReceivedByteCount();

    public abstract java.lang.String getUrl();

    public abstract java.util.List<java.lang.String> getUrlChain();

    public abstract boolean wasCached();
}

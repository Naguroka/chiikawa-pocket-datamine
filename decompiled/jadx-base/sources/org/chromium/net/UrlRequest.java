package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UrlRequest {

    public static abstract class Builder {
        public static final int REQUEST_PRIORITY_HIGHEST = 4;
        public static final int REQUEST_PRIORITY_IDLE = 0;
        public static final int REQUEST_PRIORITY_LOW = 2;
        public static final int REQUEST_PRIORITY_LOWEST = 1;
        public static final int REQUEST_PRIORITY_MEDIUM = 3;

        public abstract org.chromium.net.UrlRequest.Builder addHeader(java.lang.String str, java.lang.String str2);

        public abstract org.chromium.net.UrlRequest.Builder allowDirectExecutor();

        public abstract org.chromium.net.UrlRequest build();

        public abstract org.chromium.net.UrlRequest.Builder disableCache();

        public abstract org.chromium.net.UrlRequest.Builder setHttpMethod(java.lang.String str);

        public abstract org.chromium.net.UrlRequest.Builder setPriority(int i);

        public abstract org.chromium.net.UrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor);
    }

    public static abstract class Callback {
        public void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        }

        public abstract void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException);

        public abstract void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) throws java.lang.Exception;

        public abstract void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception;

        public abstract void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) throws java.lang.Exception;

        public abstract void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo);
    }

    public static abstract class StatusListener {
        public abstract void onStatus(int i);
    }

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener);

    public abstract boolean isDone();

    public abstract void read(java.nio.ByteBuffer byteBuffer);

    public abstract void start();

    public static class Status {
        public static final int CONNECTING = 10;
        public static final int DOWNLOADING_PAC_FILE = 5;
        public static final int ESTABLISHING_PROXY_TUNNEL = 8;
        public static final int IDLE = 0;
        public static final int INVALID = -1;
        public static final int READING_RESPONSE = 14;
        public static final int RESOLVING_HOST = 9;
        public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
        public static final int RESOLVING_PROXY_FOR_URL = 6;
        public static final int SENDING_REQUEST = 12;
        public static final int SSL_HANDSHAKE = 11;
        public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
        public static final int WAITING_FOR_CACHE = 4;
        public static final int WAITING_FOR_DELEGATE = 3;
        public static final int WAITING_FOR_RESPONSE = 13;
        public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;

        private Status() {
        }
    }
}

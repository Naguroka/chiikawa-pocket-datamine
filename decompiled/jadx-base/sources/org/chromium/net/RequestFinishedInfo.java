package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RequestFinishedInfo {
    public static final int CANCELED = 2;
    public static final int FAILED = 1;
    public static final int SUCCEEDED = 0;

    public static abstract class Metrics {
        public abstract java.util.Date getConnectEnd();

        public abstract java.util.Date getConnectStart();

        public abstract java.util.Date getDnsEnd();

        public abstract java.util.Date getDnsStart();

        public abstract java.util.Date getPushEnd();

        public abstract java.util.Date getPushStart();

        public abstract java.lang.Long getReceivedByteCount();

        public abstract java.util.Date getRequestEnd();

        public abstract java.util.Date getRequestStart();

        public abstract java.util.Date getResponseStart();

        public abstract java.util.Date getSendingEnd();

        public abstract java.util.Date getSendingStart();

        public abstract java.lang.Long getSentByteCount();

        public abstract boolean getSocketReused();

        public abstract java.util.Date getSslEnd();

        public abstract java.util.Date getSslStart();

        public abstract java.lang.Long getTotalTimeMs();

        public abstract java.lang.Long getTtfbMs();
    }

    public abstract java.util.Collection<java.lang.Object> getAnnotations();

    public abstract org.chromium.net.CronetException getException();

    public abstract int getFinishedReason();

    public abstract org.chromium.net.RequestFinishedInfo.Metrics getMetrics();

    public abstract org.chromium.net.UrlResponseInfo getResponseInfo();

    public abstract java.lang.String getUrl();

    public static abstract class Listener {
        private final java.util.concurrent.Executor mExecutor;

        public abstract void onRequestFinished(org.chromium.net.RequestFinishedInfo requestFinishedInfo);

        public Listener(java.util.concurrent.Executor executor) {
            if (executor == null) {
                throw new java.lang.IllegalStateException("Executor must not be null");
            }
            this.mExecutor = executor;
        }

        public java.util.concurrent.Executor getExecutor() {
            return this.mExecutor;
        }
    }
}

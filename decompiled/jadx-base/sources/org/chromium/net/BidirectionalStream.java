package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BidirectionalStream {

    public static abstract class Builder {
        public static final int STREAM_PRIORITY_HIGHEST = 4;
        public static final int STREAM_PRIORITY_IDLE = 0;
        public static final int STREAM_PRIORITY_LOW = 2;
        public static final int STREAM_PRIORITY_LOWEST = 1;
        public static final int STREAM_PRIORITY_MEDIUM = 3;

        public abstract org.chromium.net.BidirectionalStream.Builder addHeader(java.lang.String str, java.lang.String str2);

        public abstract org.chromium.net.BidirectionalStream build();

        public abstract org.chromium.net.BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z);

        public abstract org.chromium.net.BidirectionalStream.Builder setHttpMethod(java.lang.String str);

        public abstract org.chromium.net.BidirectionalStream.Builder setPriority(int i);
    }

    public static abstract class Callback {
        public void onCanceled(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        }

        public abstract void onFailed(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException);

        public abstract void onReadCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z);

        public abstract void onResponseHeadersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo);

        public void onResponseTrailersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.UrlResponseInfo.HeaderBlock headerBlock) {
        }

        public abstract void onStreamReady(org.chromium.net.BidirectionalStream bidirectionalStream);

        public abstract void onSucceeded(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo);

        public abstract void onWriteCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z);
    }

    public abstract void cancel();

    public abstract void flush();

    public abstract boolean isDone();

    public abstract void read(java.nio.ByteBuffer byteBuffer);

    public abstract void start();

    public abstract void write(java.nio.ByteBuffer byteBuffer, boolean z);
}

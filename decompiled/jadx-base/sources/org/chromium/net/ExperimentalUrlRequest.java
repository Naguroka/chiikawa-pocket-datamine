package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ExperimentalUrlRequest extends org.chromium.net.UrlRequest {

    public static abstract class Builder extends org.chromium.net.UrlRequest.Builder {
        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder addHeader(java.lang.String str, java.lang.String str2);

        public org.chromium.net.ExperimentalUrlRequest.Builder addRequestAnnotation(java.lang.Object obj) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest build();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder disableCache();

        public org.chromium.net.ExperimentalUrlRequest.Builder disableConnectionMigration() {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setHttpMethod(java.lang.String str);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setPriority(int i);

        public org.chromium.net.ExperimentalUrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
            return this;
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
            return this;
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor);
    }
}

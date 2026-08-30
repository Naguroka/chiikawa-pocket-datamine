package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ExperimentalCronetEngine extends org.chromium.net.CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;

    public void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor);

    @Override // org.chromium.net.CronetEngine
    public abstract org.chromium.net.ExperimentalUrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    public void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void startNetLogToDisk(java.lang.String str, boolean z, int i) {
    }

    public static class Builder extends org.chromium.net.CronetEngine.Builder {
        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableSdch(boolean z) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z, java.util.Date date) {
            return addPublicKeyPins(str, (java.util.Set<byte[]>) set, z, date);
        }

        public Builder(android.content.Context context) {
            super(context);
        }

        public Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder setExperimentalOptions(java.lang.String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        public org.chromium.net.ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setUserAgent(java.lang.String str) {
            super.setUserAgent(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setStoragePath(java.lang.String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addQuicHint(java.lang.String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z, java.util.Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }
    }

    public java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) throws java.io.IOException {
        return url.openConnection(proxy);
    }
}

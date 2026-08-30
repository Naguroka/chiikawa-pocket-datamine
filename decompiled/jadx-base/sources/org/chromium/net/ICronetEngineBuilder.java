package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ICronetEngineBuilder {
    public abstract org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z, java.util.Date date);

    public abstract org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i, int i2);

    public abstract org.chromium.net.ExperimentalCronetEngine build();

    public org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z);

    public abstract org.chromium.net.ICronetEngineBuilder enableHttpCache(int i, long j);

    public org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z);

    public abstract org.chromium.net.ICronetEngineBuilder enableQuic(boolean z);

    public abstract org.chromium.net.ICronetEngineBuilder enableSdch(boolean z);

    public abstract java.lang.String getDefaultUserAgent();

    public abstract org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str);

    public abstract org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader);

    public abstract org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str);

    public org.chromium.net.ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str);
}

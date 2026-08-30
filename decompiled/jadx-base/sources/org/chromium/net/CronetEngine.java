package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CronetEngine {
    private static final java.lang.String TAG = "CronetEngine";

    public abstract java.net.URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract java.lang.String getVersionString();

    public abstract org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    public abstract java.net.URLConnection openConnection(java.net.URL url) throws java.io.IOException;

    public abstract void shutdown();

    public abstract void startNetLogToFile(java.lang.String str, boolean z);

    public abstract void stopNetLog();

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        protected final org.chromium.net.ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(java.lang.String str);
        }

        @java.lang.Deprecated
        public org.chromium.net.CronetEngine.Builder enableSdch(boolean z) {
            return this;
        }

        public Builder(android.content.Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        public java.lang.String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public org.chromium.net.CronetEngine.Builder setUserAgent(java.lang.String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setStoragePath(java.lang.String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableBrotli(boolean z) {
            this.mBuilderDelegate.enableBrotli(z);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder addQuicHint(java.lang.String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z, java.util.Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public org.chromium.net.CronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        private static org.chromium.net.ICronetEngineBuilder createBuilderDelegate(android.content.Context context) {
            org.chromium.net.CronetProvider cronetProvider = getEnabledCronetProviders(context, new java.util.ArrayList(org.chromium.net.CronetProvider.getAllProviders(context))).get(0);
            if (android.util.Log.isLoggable(org.chromium.net.CronetEngine.TAG, 3)) {
                android.util.Log.d(org.chromium.net.CronetEngine.TAG, java.lang.String.format("Using '%s' provider for creating CronetEngine.Builder.", cronetProvider));
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        static java.util.List<org.chromium.net.CronetProvider> getEnabledCronetProviders(android.content.Context context, java.util.List<org.chromium.net.CronetProvider> list) {
            if (list.size() == 0) {
                throw new java.lang.RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            java.util.Iterator<org.chromium.net.CronetProvider> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().isEnabled()) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                throw new java.lang.RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            java.util.Collections.sort(list, new java.util.Comparator<org.chromium.net.CronetProvider>() { // from class: org.chromium.net.CronetEngine.Builder.1
                @Override // java.util.Comparator
                public int compare(org.chromium.net.CronetProvider cronetProvider, org.chromium.net.CronetProvider cronetProvider2) {
                    if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
                        return 1;
                    }
                    if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
                        return -1;
                    }
                    return -org.chromium.net.CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
                }
            });
            return list;
        }

        static int compareVersions(java.lang.String str, java.lang.String str2) {
            if (str == null || str2 == null) {
                throw new java.lang.IllegalArgumentException("The input values cannot be null");
            }
            java.lang.String[] strArrSplit = str.split("\\.");
            java.lang.String[] strArrSplit2 = str2.split("\\.");
            for (int i = 0; i < strArrSplit.length && i < strArrSplit2.length; i++) {
                try {
                    int i2 = java.lang.Integer.parseInt(strArrSplit[i]);
                    int i3 = java.lang.Integer.parseInt(strArrSplit2[i]);
                    if (i2 != i3) {
                        return java.lang.Integer.signum(i2 - i3);
                    }
                } catch (java.lang.NumberFormatException e) {
                    throw new java.lang.IllegalArgumentException("Unable to convert version segments into integers: " + strArrSplit[i] + " & " + strArrSplit2[i], e);
                }
            }
            return java.lang.Integer.signum(strArrSplit.length - strArrSplit2.length);
        }
    }
}

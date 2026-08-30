package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSessionManagerProvider implements androidx.media3.exoplayer.drm.DrmSessionManagerProvider {
    private androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration;
    private androidx.media3.datasource.DataSource.Factory drmHttpDataSourceFactory;
    private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy drmLoadErrorHandlingPolicy;
    private final java.lang.Object lock = new java.lang.Object();
    private androidx.media3.exoplayer.drm.DrmSessionManager manager;
    private java.lang.String userAgent;

    public void setDrmHttpDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
        this.drmHttpDataSourceFactory = factory;
    }

    @java.lang.Deprecated
    public void setDrmUserAgent(java.lang.String str) {
        this.userAgent = str;
    }

    public void setDrmLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.drmLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public androidx.media3.exoplayer.drm.DrmSessionManager get(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.exoplayer.drm.DrmSessionManager drmSessionManager;
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = mediaItem.localConfiguration.drmConfiguration;
        if (drmConfiguration == null) {
            return androidx.media3.exoplayer.drm.DrmSessionManager.DRM_UNSUPPORTED;
        }
        synchronized (this.lock) {
            if (!androidx.media3.common.util.Util.areEqual(drmConfiguration, this.drmConfiguration)) {
                this.drmConfiguration = drmConfiguration;
                this.manager = createManager(drmConfiguration);
            }
            drmSessionManager = (androidx.media3.exoplayer.drm.DrmSessionManager) androidx.media3.common.util.Assertions.checkNotNull(this.manager);
        }
        return drmSessionManager;
    }

    private androidx.media3.exoplayer.drm.DrmSessionManager createManager(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration) {
        androidx.media3.datasource.DataSource.Factory userAgent = this.drmHttpDataSourceFactory;
        if (userAgent == null) {
            userAgent = new androidx.media3.datasource.DefaultHttpDataSource.Factory().setUserAgent(this.userAgent);
        }
        androidx.media3.exoplayer.drm.HttpMediaDrmCallback httpMediaDrmCallback = new androidx.media3.exoplayer.drm.HttpMediaDrmCallback(drmConfiguration.licenseUri == null ? null : drmConfiguration.licenseUri.toString(), drmConfiguration.forceDefaultLicenseUri, userAgent);
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = drmConfiguration.licenseRequestHeaders.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
            httpMediaDrmCallback.setKeyRequestProperty(next.getKey(), next.getValue());
        }
        androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder useDrmSessionsForClearContent = new androidx.media3.exoplayer.drm.DefaultDrmSessionManager.Builder().setUuidAndExoMediaDrmProvider(drmConfiguration.scheme, androidx.media3.exoplayer.drm.FrameworkMediaDrm.DEFAULT_PROVIDER).setMultiSession(drmConfiguration.multiSession).setPlayClearSamplesWithoutKeys(drmConfiguration.playClearContentWithoutKey).setUseDrmSessionsForClearContent(com.google.common.primitives.Ints.toArray(drmConfiguration.forcedSessionTrackTypes));
        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.drmLoadErrorHandlingPolicy;
        if (loadErrorHandlingPolicy != null) {
            useDrmSessionsForClearContent.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        }
        androidx.media3.exoplayer.drm.DefaultDrmSessionManager defaultDrmSessionManagerBuild = useDrmSessionsForClearContent.build(httpMediaDrmCallback);
        defaultDrmSessionManagerBuild.setMode(0, drmConfiguration.getKeySetId());
        return defaultDrmSessionManagerBuild;
    }
}

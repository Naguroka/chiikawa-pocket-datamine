package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements androidx.media3.exoplayer.source.MediaSourceFactory {
    private static final java.lang.String TAG = "DMediaSourceFactory";
    private androidx.media3.common.AdViewProvider adViewProvider;
    private androidx.media3.exoplayer.source.ads.AdsLoader.Provider adsLoaderProvider;
    private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader;
    private androidx.media3.exoplayer.source.ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean parseSubtitlesDuringExtraction;
    private androidx.media3.exoplayer.source.MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;

    @java.lang.Deprecated
    public interface AdsLoaderProvider extends androidx.media3.exoplayer.source.ads.AdsLoader.Provider {
    }

    public DefaultMediaSourceFactory(android.content.Context context) {
        this(new androidx.media3.datasource.DefaultDataSource.Factory(context));
    }

    public DefaultMediaSourceFactory(android.content.Context context, androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
        this(new androidx.media3.datasource.DefaultDataSource.Factory(context), extractorsFactory);
    }

    public DefaultMediaSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
        this(factory, new androidx.media3.extractor.DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        this.subtitleParserFactory = new androidx.media3.extractor.text.DefaultSubtitleParserFactory();
        androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader(extractorsFactory, this.subtitleParserFactory);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = androidx.media3.common.C.TIME_UNSET;
        this.liveMinOffsetMs = androidx.media3.common.C.TIME_UNSET;
        this.liveMaxOffsetMs = androidx.media3.common.C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.parseSubtitlesDuringExtraction = z;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.subtitleParserFactory = (androidx.media3.extractor.text.SubtitleParser.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
        this.delegateFactoryLoader.setSubtitleParserFactory(factory);
        return this;
    }

    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setAdsLoaderProvider(androidx.media3.exoplayer.source.ads.AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setAdViewProvider(androidx.media3.common.AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLocalAdInsertionComponents(androidx.media3.exoplayer.source.ads.AdsLoader.Provider provider, androidx.media3.common.AdViewProvider adViewProvider) {
        this.adsLoaderProvider = (androidx.media3.exoplayer.source.ads.AdsLoader.Provider) androidx.media3.common.util.Assertions.checkNotNull(provider);
        this.adViewProvider = (androidx.media3.common.AdViewProvider) androidx.media3.common.util.Assertions.checkNotNull(adViewProvider);
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setExternalImageLoader(androidx.media3.exoplayer.source.ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveTargetOffsetMs(long j) {
        this.liveTargetOffsetMs = j;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMinOffsetMs(long j) {
        this.liveMinOffsetMs = j;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMaxOffsetMs(long j) {
        this.liveMaxOffsetMs = j;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMinSpeed(float f) {
        this.liveMinSpeed = f;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMaxSpeed(float f) {
        this.liveMaxSpeed = f;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
        this.delegateFactoryLoader.setCmcdConfigurationFactory((androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.setDrmSessionManagerProvider((androidx.media3.exoplayer.drm.DrmSessionManagerProvider) androidx.media3.common.util.Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = (androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy) androidx.media3.common.util.Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        java.lang.String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(androidx.media3.common.C.SSAI_SCHEME)) {
            return ((androidx.media3.exoplayer.source.MediaSource.Factory) androidx.media3.common.util.Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        if (java.util.Objects.equals(mediaItem.localConfiguration.mimeType, androidx.media3.common.MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
            return new androidx.media3.exoplayer.source.ExternallyLoadedMediaSource.Factory(androidx.media3.common.util.Util.msToUs(mediaItem.localConfiguration.imageDurationMs), (androidx.media3.exoplayer.source.ExternalLoader) androidx.media3.common.util.Assertions.checkNotNull(this.externalImageLoader)).createMediaSource(mediaItem);
        }
        int iInferContentTypeForUriAndMimeType = androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(mediaItem.localConfiguration.uri, mediaItem.localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != androidx.media3.common.C.TIME_UNSET) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
        }
        try {
            androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
            androidx.media3.common.MediaItem.LiveConfiguration.Builder builderBuildUpon = mediaItem.liveConfiguration.buildUpon();
            if (mediaItem.liveConfiguration.targetOffsetMs == androidx.media3.common.C.TIME_UNSET) {
                builderBuildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
            }
            if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
            }
            if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
            }
            if (mediaItem.liveConfiguration.minOffsetMs == androidx.media3.common.C.TIME_UNSET) {
                builderBuildUpon.setMinOffsetMs(this.liveMinOffsetMs);
            }
            if (mediaItem.liveConfiguration.maxOffsetMs == androidx.media3.common.C.TIME_UNSET) {
                builderBuildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
            }
            androidx.media3.common.MediaItem.LiveConfiguration liveConfigurationBuild = builderBuildUpon.build();
            if (!liveConfigurationBuild.equals(mediaItem.liveConfiguration)) {
                mediaItem = mediaItem.buildUpon().setLiveConfiguration(liveConfigurationBuild).build();
            }
            androidx.media3.exoplayer.source.MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
            com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> immutableList = ((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
            if (!immutableList.isEmpty()) {
                androidx.media3.exoplayer.source.MediaSource[] mediaSourceArr = new androidx.media3.exoplayer.source.MediaSource[immutableList.size() + 1];
                mediaSourceArr[0] = mediaSourceCreateMediaSource;
                for (int i = 0; i < immutableList.size(); i++) {
                    if (this.parseSubtitlesDuringExtraction) {
                        final androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setSampleMimeType(immutableList.get(i).mimeType).setLanguage(immutableList.get(i).language).setSelectionFlags(immutableList.get(i).selectionFlags).setRoleFlags(immutableList.get(i).roleFlags).setLabel(immutableList.get(i).label).setId(immutableList.get(i).id).build();
                        androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory factory = new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(this.dataSourceFactory, new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$$ExternalSyntheticLambda0
                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public final androidx.media3.extractor.Extractor[] createExtractors() {
                                return this.f$0.m180xeef04c56(formatBuild);
                            }
                        });
                        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        mediaSourceArr[i + 1] = factory.createMediaSource(androidx.media3.common.MediaItem.fromUri(immutableList.get(i).uri.toString()));
                    } else {
                        androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory factory2 = new androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i + 1] = factory2.createMediaSource(immutableList.get(i), androidx.media3.common.C.TIME_UNSET);
                    }
                }
                mediaSourceCreateMediaSource = new androidx.media3.exoplayer.source.MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, mediaSourceCreateMediaSource));
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: lambda$createMediaSource$0$androidx-media3-exoplayer-source-DefaultMediaSourceFactory, reason: not valid java name */
    /* synthetic */ androidx.media3.extractor.Extractor[] m180xeef04c56(androidx.media3.common.Format format) {
        androidx.media3.extractor.Extractor unknownSubtitlesExtractor;
        androidx.media3.extractor.Extractor[] extractorArr = new androidx.media3.extractor.Extractor[1];
        if (this.subtitleParserFactory.supportsFormat(format)) {
            unknownSubtitlesExtractor = new androidx.media3.extractor.text.SubtitleExtractor(this.subtitleParserFactory.create(format), format);
        } else {
            unknownSubtitlesExtractor = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory.UnknownSubtitlesExtractor(format);
        }
        extractorArr[0] = unknownSubtitlesExtractor;
        return extractorArr;
    }

    private static androidx.media3.exoplayer.source.MediaSource maybeClipMediaSource(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        return (mediaItem.clippingConfiguration.startPositionUs == 0 && mediaItem.clippingConfiguration.endPositionUs == Long.MIN_VALUE && !mediaItem.clippingConfiguration.relativeToDefaultPosition) ? mediaSource : new androidx.media3.exoplayer.source.ClippingMediaSource(mediaSource, mediaItem.clippingConfiguration.startPositionUs, mediaItem.clippingConfiguration.endPositionUs, !mediaItem.clippingConfiguration.startsAtKeyFrame, mediaItem.clippingConfiguration.relativeToLiveWindow, mediaItem.clippingConfiguration.relativeToDefaultPosition);
    }

    private androidx.media3.exoplayer.source.MediaSource maybeWrapWithAdsMediaSource(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        java.lang.Object objOf;
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        androidx.media3.exoplayer.source.ads.AdsLoader.Provider provider = this.adsLoaderProvider;
        androidx.media3.common.AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            androidx.media3.common.util.Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        androidx.media3.exoplayer.source.ads.AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            androidx.media3.common.util.Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        androidx.media3.datasource.DataSpec dataSpec = new androidx.media3.datasource.DataSpec(adsConfiguration.adTagUri);
        if (adsConfiguration.adsId != null) {
            objOf = adsConfiguration.adsId;
        } else {
            objOf = com.google.common.collect.ImmutableList.of((android.net.Uri) mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri);
        }
        return new androidx.media3.exoplayer.source.ads.AdsMediaSource(mediaSource, dataSpec, objOf, this, adsLoader, adViewProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class DelegateFactoryLoader {
        private androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfigurationFactory;
        private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private final androidx.media3.extractor.ExtractorsFactory extractorsFactory;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
        private final java.util.Map<java.lang.Integer, com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory>> mediaSourceFactorySuppliers = new java.util.HashMap();
        private final java.util.Map<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.Factory> mediaSourceFactories = new java.util.HashMap();
        private boolean parseSubtitlesDuringExtraction = true;

        public DelegateFactoryLoader(androidx.media3.extractor.ExtractorsFactory extractorsFactory, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.extractorsFactory = extractorsFactory;
            this.subtitleParserFactory = factory;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return com.google.common.primitives.Ints.toArray(this.mediaSourceFactorySuppliers.keySet());
        }

        public androidx.media3.exoplayer.source.MediaSource.Factory getMediaSourceFactory(int i) throws java.lang.ClassNotFoundException {
            androidx.media3.exoplayer.source.MediaSource.Factory factory = this.mediaSourceFactories.get(java.lang.Integer.valueOf(i));
            if (factory != null) {
                return factory;
            }
            androidx.media3.exoplayer.source.MediaSource.Factory factory2 = loadSupplier(i).get();
            androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            this.mediaSourceFactories.put(java.lang.Integer.valueOf(i), factory2);
            return factory2;
        }

        public void setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z) {
            this.parseSubtitlesDuringExtraction = z;
            this.extractorsFactory.experimentalSetTextTrackTranscodingEnabled(z);
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z);
            }
        }

        public void setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            this.extractorsFactory.setSubtitleParserFactory(factory);
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(factory);
            }
        }

        public void setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setJpegExtractorFlags(int i) {
            androidx.media3.extractor.ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof androidx.media3.extractor.DefaultExtractorsFactory) {
                ((androidx.media3.extractor.DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i);
            }
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        private com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> maybeLoadSupplier(int i) {
            try {
                return loadSupplier(i);
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            }
        }

        private com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> loadSupplier(int i) throws java.lang.ClassNotFoundException {
            com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> supplier;
            com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> supplier2;
            com.google.common.base.Supplier<androidx.media3.exoplayer.source.MediaSource.Factory> supplier3 = this.mediaSourceFactorySuppliers.get(java.lang.Integer.valueOf(i));
            if (supplier3 != null) {
                return supplier3;
            }
            final androidx.media3.datasource.DataSource.Factory factory = (androidx.media3.datasource.DataSource.Factory) androidx.media3.common.util.Assertions.checkNotNull(this.dataSourceFactory);
            if (i == 0) {
                final java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
                supplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.newInstance(clsAsSubclass, factory);
                    }
                };
            } else if (i == 1) {
                final java.lang.Class<? extends U> clsAsSubclass2 = java.lang.Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
                supplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Supplier
                    public final java.lang.Object get() {
                        return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.newInstance(clsAsSubclass2, factory);
                    }
                };
            } else {
                if (i == 2) {
                    final java.lang.Class<? extends U> clsAsSubclass3 = java.lang.Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
                    supplier = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda2
                        @Override // com.google.common.base.Supplier
                        public final java.lang.Object get() {
                            return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.newInstance(clsAsSubclass3, factory);
                        }
                    };
                } else if (i == 3) {
                    final java.lang.Class<? extends U> clsAsSubclass4 = java.lang.Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
                    supplier2 = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda3
                        @Override // com.google.common.base.Supplier
                        public final java.lang.Object get() {
                            return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.newInstance(clsAsSubclass4);
                        }
                    };
                } else if (i == 4) {
                    supplier2 = new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda4
                        @Override // com.google.common.base.Supplier
                        public final java.lang.Object get() {
                            return this.f$0.m181xa479647d(factory);
                        }
                    };
                } else {
                    throw new java.lang.IllegalArgumentException("Unrecognized contentType: " + i);
                }
                this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i), supplier2);
                return supplier2;
            }
            supplier2 = supplier;
            this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i), supplier2);
            return supplier2;
        }

        /* JADX INFO: renamed from: lambda$loadSupplier$4$androidx-media3-exoplayer-source-DefaultMediaSourceFactory$DelegateFactoryLoader, reason: not valid java name */
        /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory m181xa479647d(androidx.media3.datasource.DataSource.Factory factory) {
            return new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(factory, this.extractorsFactory);
        }
    }

    private static final class UnknownSubtitlesExtractor implements androidx.media3.extractor.Extractor {
        private final androidx.media3.common.Format format;

        @Override // androidx.media3.extractor.Extractor
        public void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public void seek(long j, long j2) {
        }

        @Override // androidx.media3.extractor.Extractor
        public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
            return true;
        }

        public UnknownSubtitlesExtractor(androidx.media3.common.Format format) {
            this.format = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
            androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
            extractorOutput.endTracks();
            trackOutputTrack.format(this.format.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.TEXT_UNKNOWN).setCodecs(this.format.sampleMimeType).build());
        }

        @Override // androidx.media3.extractor.Extractor
        public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
            return extractorInput.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.MediaSource.Factory newInstance(java.lang.Class<? extends androidx.media3.exoplayer.source.MediaSource.Factory> cls, androidx.media3.datasource.DataSource.Factory factory) {
        try {
            return cls.getConstructor(androidx.media3.datasource.DataSource.Factory.class).newInstance(factory);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.MediaSource.Factory newInstance(java.lang.Class<? extends androidx.media3.exoplayer.source.MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}

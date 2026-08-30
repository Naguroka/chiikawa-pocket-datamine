package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class ExoPlayerAssetLoader implements androidx.media3.transformer.AssetLoader {
    private static final long EMULATOR_RELEASE_TIMEOUT_MS = 5000;
    private final androidx.media3.transformer.CapturingDecoderFactory decoderFactory;
    private final androidx.media3.transformer.EditedMediaItem editedMediaItem;
    private final androidx.media3.exoplayer.ExoPlayer player;
    private int progressState;

    public static final class Factory implements androidx.media3.transformer.AssetLoader.Factory {
        private final androidx.media3.common.util.Clock clock;
        private final android.content.Context context;
        private final androidx.media3.transformer.Codec.DecoderFactory decoderFactory;
        private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;

        public Factory(android.content.Context context, androidx.media3.transformer.Codec.DecoderFactory decoderFactory, androidx.media3.common.util.Clock clock) {
            this.context = context;
            this.decoderFactory = decoderFactory;
            this.clock = clock;
            this.mediaSourceFactory = null;
        }

        public Factory(android.content.Context context, androidx.media3.transformer.Codec.DecoderFactory decoderFactory, androidx.media3.common.util.Clock clock, androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this.context = context;
            this.decoderFactory = decoderFactory;
            this.clock = clock;
            this.mediaSourceFactory = factory;
        }

        @Override // androidx.media3.transformer.AssetLoader.Factory
        public androidx.media3.transformer.AssetLoader createAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, android.os.Looper looper, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.transformer.AssetLoader.CompositionSettings compositionSettings) {
            androidx.media3.exoplayer.source.MediaSource.Factory defaultMediaSourceFactory;
            androidx.media3.exoplayer.source.MediaSource.Factory factory = this.mediaSourceFactory;
            if (factory == null) {
                androidx.media3.extractor.DefaultExtractorsFactory defaultExtractorsFactory = new androidx.media3.extractor.DefaultExtractorsFactory();
                if (editedMediaItem.flattenForSlowMotion) {
                    defaultExtractorsFactory.setMp4ExtractorFlags(4);
                }
                defaultMediaSourceFactory = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(this.context, defaultExtractorsFactory);
            } else {
                defaultMediaSourceFactory = factory;
            }
            return new androidx.media3.transformer.ExoPlayerAssetLoader(this.context, editedMediaItem, defaultMediaSourceFactory, this.decoderFactory, compositionSettings.hdrMode, looper, listener, this.clock);
        }
    }

    private ExoPlayerAssetLoader(android.content.Context context, androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.transformer.Codec.DecoderFactory decoderFactory, int i, android.os.Looper looper, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.common.util.Clock clock) {
        this.editedMediaItem = editedMediaItem;
        androidx.media3.transformer.CapturingDecoderFactory capturingDecoderFactory = new androidx.media3.transformer.CapturingDecoderFactory(decoderFactory);
        this.decoderFactory = capturingDecoderFactory;
        androidx.media3.exoplayer.trackselection.DefaultTrackSelector defaultTrackSelector = new androidx.media3.exoplayer.trackselection.DefaultTrackSelector(context);
        defaultTrackSelector.setParameters(new androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters.Builder(context).setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build());
        androidx.media3.exoplayer.ExoPlayer.Builder releaseTimeoutMs = new androidx.media3.exoplayer.ExoPlayer.Builder(context, new androidx.media3.transformer.ExoPlayerAssetLoader.RenderersFactoryImpl(editedMediaItem.removeAudio, editedMediaItem.removeVideo, editedMediaItem.flattenForSlowMotion, capturingDecoderFactory, i, listener)).setMediaSourceFactory(factory).setTrackSelector(defaultTrackSelector).setLoadControl(new androidx.media3.exoplayer.DefaultLoadControl.Builder().setBufferDurationsMs(50000, 50000, 250, 500).build()).setLooper(looper).setUsePlatformDiagnostics(false).setReleaseTimeoutMs(getReleaseTimeoutMs());
        if (clock != androidx.media3.common.util.Clock.DEFAULT) {
            releaseTimeoutMs.setClock(clock);
        }
        androidx.media3.exoplayer.ExoPlayer exoPlayerBuild = releaseTimeoutMs.build();
        this.player = exoPlayerBuild;
        exoPlayerBuild.addListener(new androidx.media3.transformer.ExoPlayerAssetLoader.PlayerListener(listener));
        this.progressState = 0;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void start() {
        this.player.setMediaItem(this.editedMediaItem.mediaItem);
        this.player.prepare();
        this.progressState = 1;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public int getProgress(androidx.media3.transformer.ProgressHolder progressHolder) {
        if (this.progressState == 2) {
            progressHolder.progress = java.lang.Math.min((int) ((this.player.getCurrentPosition() * 100) / this.player.getDuration()), 99);
        }
        return this.progressState;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.String> getDecoderNames() {
        com.google.common.collect.ImmutableMap.Builder builder = new com.google.common.collect.ImmutableMap.Builder();
        java.lang.String audioDecoderName = this.decoderFactory.getAudioDecoderName();
        if (audioDecoderName != null) {
            builder.put(1, audioDecoderName);
        }
        java.lang.String videoDecoderName = this.decoderFactory.getVideoDecoderName();
        if (videoDecoderName != null) {
            builder.put(2, videoDecoderName);
        }
        return builder.buildOrThrow();
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void release() {
        this.player.release();
        this.progressState = 0;
    }

    private static final class RenderersFactoryImpl implements androidx.media3.exoplayer.RenderersFactory {
        private final androidx.media3.transformer.AssetLoader.Listener assetLoaderListener;
        private final androidx.media3.transformer.Codec.DecoderFactory decoderFactory;
        private final boolean flattenForSlowMotion;
        private final int hdrMode;
        private final androidx.media3.transformer.TransformerMediaClock mediaClock = new androidx.media3.transformer.TransformerMediaClock();
        private final boolean removeAudio;
        private final boolean removeVideo;

        public RenderersFactoryImpl(boolean z, boolean z2, boolean z3, androidx.media3.transformer.Codec.DecoderFactory decoderFactory, int i, androidx.media3.transformer.AssetLoader.Listener listener) {
            this.removeAudio = z;
            this.removeVideo = z2;
            this.flattenForSlowMotion = z3;
            this.decoderFactory = decoderFactory;
            this.hdrMode = i;
            this.assetLoaderListener = listener;
        }

        @Override // androidx.media3.exoplayer.RenderersFactory
        public androidx.media3.exoplayer.Renderer[] createRenderers(android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.text.TextOutput textOutput, androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!this.removeAudio) {
                arrayList.add(new androidx.media3.transformer.ExoAssetLoaderAudioRenderer(this.decoderFactory, this.mediaClock, this.assetLoaderListener));
            }
            if (!this.removeVideo) {
                arrayList.add(new androidx.media3.transformer.ExoAssetLoaderVideoRenderer(this.flattenForSlowMotion, this.decoderFactory, this.hdrMode, this.mediaClock, this.assetLoaderListener));
            }
            return (androidx.media3.exoplayer.Renderer[]) arrayList.toArray(new androidx.media3.exoplayer.Renderer[arrayList.size()]);
        }
    }

    private final class PlayerListener implements androidx.media3.common.Player.Listener {
        private final androidx.media3.transformer.AssetLoader.Listener assetLoaderListener;

        public PlayerListener(androidx.media3.transformer.AssetLoader.Listener listener) {
            this.assetLoaderListener = listener;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(androidx.media3.common.Timeline timeline, int i) {
            try {
                if (androidx.media3.transformer.ExoPlayerAssetLoader.this.progressState != 1) {
                    return;
                }
                androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
                timeline.getWindow(0, window);
                if (window.isPlaceholder) {
                    return;
                }
                long j = window.durationUs;
                androidx.media3.transformer.ExoPlayerAssetLoader.this.progressState = (j <= 0 || j == androidx.media3.common.C.TIME_UNSET) ? 3 : 2;
                this.assetLoaderListener.onDurationUs(window.durationUs);
            } catch (java.lang.RuntimeException e) {
                this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e, 1000));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r3v5, types: [androidx.media3.transformer.AssetLoader$Listener] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(androidx.media3.common.Tracks tracks) {
            int i;
            try {
                ?? IsTypeSelected = tracks.isTypeSelected(1);
                ?? r0 = IsTypeSelected;
                if (tracks.isTypeSelected(2)) {
                    i = IsTypeSelected + 1;
                }
                if (r0 > 0) {
                    r0 = i;
                    this.assetLoaderListener.onTrackCount(r0);
                    androidx.media3.transformer.ExoPlayerAssetLoader.this.player.play();
                } else {
                    r0 = i;
                    this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(new java.lang.IllegalStateException("The asset loader has no track to output."), 1001));
                }
            } catch (java.lang.RuntimeException e) {
                this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(e, 1000));
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
            this.assetLoaderListener.onError(androidx.media3.transformer.ExportException.createForAssetLoader(playbackException, ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.transformer.ExportException.NAME_TO_ERROR_CODE.getOrDefault(playbackException.getErrorCodeName(), 1000))).intValue()));
        }
    }

    private static long getReleaseTimeoutMs() {
        return androidx.media3.common.util.Util.isRunningOnEmulator() ? 5000L : 500L;
    }
}

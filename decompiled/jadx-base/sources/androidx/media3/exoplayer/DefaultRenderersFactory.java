package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRenderersFactory implements androidx.media3.exoplayer.RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final java.lang.String TAG = "DefaultRenderersFactory";
    private final androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final android.content.Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector = androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    protected void buildMiscellaneousRenderers(android.content.Context context, android.os.Handler handler, int i, java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList) {
    }

    public DefaultRenderersFactory(android.content.Context context) {
        this.context = context;
        this.codecAdapterFactory = new androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory(context);
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z) {
        this.codecAdapterFactory.experimentalSetAsyncCryptoFlagEnabled(z);
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory setMediaCodecSelector(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory setEnableAudioFloatOutput(boolean z) {
        this.enableFloatOutput = z;
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z) {
        this.enableAudioTrackPlaybackParams = z;
        return this;
    }

    public final androidx.media3.exoplayer.DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public androidx.media3.exoplayer.Renderer[] createRenderers(android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.text.TextOutput textOutput, androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput) {
        java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList = new java.util.ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        androidx.media3.exoplayer.audio.AudioSink audioSinkBuildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (audioSinkBuildAudioSink != null) {
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, audioSinkBuildAudioSink, handler, audioRendererEventListener, arrayList);
        }
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (androidx.media3.exoplayer.Renderer[]) arrayList.toArray(new androidx.media3.exoplayer.Renderer[0]);
    }

    protected void buildVideoRenderers(android.content.Context context, int i, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, long j, java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList) {
        int i2;
        int i3;
        arrayList.add(new androidx.media3.exoplayer.video.MediaCodecVideoRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, j, z, handler, videoRendererEventListener, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (androidx.media3.exoplayer.Renderer) java.lang.Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, androidx.media3.exoplayer.video.VideoRendererEventListener.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, videoRendererEventListener, 50));
                    androidx.media3.common.util.Log.i(TAG, "Loaded LibvpxVideoRenderer.");
                } catch (java.lang.ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (java.lang.ClassNotFoundException unused2) {
        }
        try {
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (androidx.media3.exoplayer.Renderer) java.lang.Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, androidx.media3.exoplayer.video.VideoRendererEventListener.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, videoRendererEventListener, 50));
                    androidx.media3.common.util.Log.i(TAG, "Loaded Libgav1VideoRenderer.");
                } catch (java.lang.ClassNotFoundException unused3) {
                    i2 = i3;
                    i3 = i2;
                }
            } catch (java.lang.ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i3, (androidx.media3.exoplayer.Renderer) java.lang.Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(java.lang.Long.TYPE, android.os.Handler.class, androidx.media3.exoplayer.video.VideoRendererEventListener.class, java.lang.Integer.TYPE).newInstance(java.lang.Long.valueOf(j), handler, videoRendererEventListener, 50));
                androidx.media3.common.util.Log.i(TAG, "Loaded FfmpegVideoRenderer.");
            } catch (java.lang.ClassNotFoundException unused5) {
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException("Error instantiating AV1 extension", e3);
        }
    }

    protected void buildAudioRenderers(android.content.Context context, int i, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, androidx.media3.exoplayer.audio.AudioSink audioSink, android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList) {
        int i2;
        int i3;
        int i4;
        arrayList.add(new androidx.media3.exoplayer.audio.MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (androidx.media3.exoplayer.Renderer) java.lang.Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(android.content.Context.class).newInstance(context));
                    androidx.media3.common.util.Log.i(TAG, "Loaded MidiRenderer.");
                } catch (java.lang.ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (java.lang.ClassNotFoundException unused2) {
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (androidx.media3.exoplayer.Renderer) java.lang.Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(android.os.Handler.class, androidx.media3.exoplayer.audio.AudioRendererEventListener.class, androidx.media3.exoplayer.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        androidx.media3.common.util.Log.i(TAG, "Loaded LibopusAudioRenderer.");
                    } catch (java.lang.ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating Opus extension", e);
                }
            } catch (java.lang.ClassNotFoundException unused4) {
            }
            try {
                try {
                    i4 = i3 + 1;
                    try {
                        arrayList.add(i3, (androidx.media3.exoplayer.Renderer) java.lang.Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(android.os.Handler.class, androidx.media3.exoplayer.audio.AudioRendererEventListener.class, androidx.media3.exoplayer.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        androidx.media3.common.util.Log.i(TAG, "Loaded LibflacAudioRenderer.");
                    } catch (java.lang.ClassNotFoundException unused5) {
                        i3 = i4;
                        i4 = i3;
                    }
                } catch (java.lang.Exception e2) {
                    throw new java.lang.RuntimeException("Error instantiating FLAC extension", e2);
                }
            } catch (java.lang.ClassNotFoundException unused6) {
            }
            try {
                arrayList.add(i4, (androidx.media3.exoplayer.Renderer) java.lang.Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(android.os.Handler.class, androidx.media3.exoplayer.audio.AudioRendererEventListener.class, androidx.media3.exoplayer.audio.AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                androidx.media3.common.util.Log.i(TAG, "Loaded FfmpegAudioRenderer.");
            } catch (java.lang.ClassNotFoundException unused7) {
            } catch (java.lang.Exception e3) {
                throw new java.lang.RuntimeException("Error instantiating FFmpeg extension", e3);
            }
        } catch (java.lang.Exception e4) {
            throw new java.lang.RuntimeException("Error instantiating MIDI extension", e4);
        }
    }

    protected void buildTextRenderers(android.content.Context context, androidx.media3.exoplayer.text.TextOutput textOutput, android.os.Looper looper, int i, java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.text.TextRenderer(textOutput, looper));
    }

    protected void buildMetadataRenderers(android.content.Context context, androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput, android.os.Looper looper, int i, java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.metadata.MetadataRenderer(metadataOutput, looper));
    }

    protected void buildCameraMotionRenderers(android.content.Context context, int i, java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.video.spherical.CameraMotionRenderer());
    }

    protected void buildImageRenderers(java.util.ArrayList<androidx.media3.exoplayer.Renderer> arrayList) {
        arrayList.add(new androidx.media3.exoplayer.image.ImageRenderer(androidx.media3.exoplayer.image.ImageDecoder.Factory.DEFAULT, null));
    }

    protected androidx.media3.exoplayer.audio.AudioSink buildAudioSink(android.content.Context context, boolean z, boolean z2) {
        return new androidx.media3.exoplayer.audio.DefaultAudioSink.Builder(context).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).build();
    }

    protected androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }
}

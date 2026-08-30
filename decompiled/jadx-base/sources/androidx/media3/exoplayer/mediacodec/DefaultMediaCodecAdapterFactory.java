package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaCodecAdapterFactory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final java.lang.String TAG = "DMCodecAdapterFactory";
    private boolean asyncCryptoFlagEnabled;
    private int asynchronousMode;
    private final android.content.Context context;

    @java.lang.Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = true;
        this.context = null;
    }

    public DefaultMediaCodecAdapterFactory(android.content.Context context) {
        this.context = context;
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = true;
    }

    public androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    public androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    public androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory experimentalSetAsyncCryptoFlagEnabled(boolean z) {
        this.asyncCryptoFlagEnabled = z;
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException {
        int i;
        if (androidx.media3.common.util.Util.SDK_INT >= 23 && ((i = this.asynchronousMode) == 1 || (i == 0 && shouldUseAsynchronousAdapterInDefaultMode()))) {
            int trackType = androidx.media3.common.MimeTypes.getTrackType(configuration.format.sampleMimeType);
            androidx.media3.common.util.Log.i(TAG, "Creating an asynchronous MediaCodec adapter for track type " + androidx.media3.common.util.Util.getTrackTypeString(trackType));
            androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory factory = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory(trackType);
            factory.experimentalSetAsyncCryptoFlagEnabled(this.asyncCryptoFlagEnabled);
            return factory.createAdapter(configuration);
        }
        return new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            return true;
        }
        return this.context != null && androidx.media3.common.util.Util.SDK_INT >= 28 && this.context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }
}

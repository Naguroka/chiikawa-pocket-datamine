package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public interface AssetLoader {
    public static final int SUPPORTED_OUTPUT_TYPE_DECODED = 2;
    public static final int SUPPORTED_OUTPUT_TYPE_ENCODED = 1;

    public interface Factory {
        androidx.media3.transformer.AssetLoader createAssetLoader(androidx.media3.transformer.EditedMediaItem editedMediaItem, android.os.Looper looper, androidx.media3.transformer.AssetLoader.Listener listener, androidx.media3.transformer.AssetLoader.CompositionSettings compositionSettings);
    }

    public interface Listener {
        void onDurationUs(long j);

        void onError(androidx.media3.transformer.ExportException exportException);

        androidx.media3.transformer.SampleConsumer onOutputFormat(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException;

        boolean onTrackAdded(androidx.media3.common.Format format, int i);

        void onTrackCount(int i);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SupportedOutputTypes {
    }

    com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.String> getDecoderNames();

    int getProgress(androidx.media3.transformer.ProgressHolder progressHolder);

    void release();

    void start();

    public static class CompositionSettings {
        public final int hdrMode;
        public final boolean retainHdrFromUltraHdrImage;

        public CompositionSettings(int i, boolean z) {
            this.hdrMode = i;
            this.retainHdrFromUltraHdrImage = z;
        }
    }
}

package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class Composition {
    public static final int HDR_MODE_EXPERIMENTAL_FORCE_INTERPRET_HDR_AS_SDR = 3;
    public static final int HDR_MODE_KEEP_HDR = 0;
    public static final int HDR_MODE_TONE_MAP_HDR_TO_SDR_USING_MEDIACODEC = 1;
    public static final int HDR_MODE_TONE_MAP_HDR_TO_SDR_USING_OPEN_GL = 2;
    public final androidx.media3.transformer.Effects effects;
    public final boolean forceAudioTrack;
    public final int hdrMode;
    public final boolean retainHdrFromUltraHdrImage;
    public final com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItemSequence> sequences;
    public final boolean transmuxAudio;
    public final boolean transmuxVideo;
    public final androidx.media3.effect.VideoCompositorSettings videoCompositorSettings;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HdrMode {
    }

    public static final class Builder {
        private androidx.media3.transformer.Effects effects;
        private boolean forceAudioTrack;
        private int hdrMode;
        private boolean retainHdrFromUltraHdrImage;
        private com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItemSequence> sequences;
        private boolean transmuxAudio;
        private boolean transmuxVideo;
        private androidx.media3.effect.VideoCompositorSettings videoCompositorSettings;

        public Builder(androidx.media3.transformer.EditedMediaItemSequence editedMediaItemSequence, androidx.media3.transformer.EditedMediaItemSequence... editedMediaItemSequenceArr) {
            this(new com.google.common.collect.ImmutableList.Builder().add(editedMediaItemSequence).add((java.lang.Object[]) editedMediaItemSequenceArr).build());
        }

        public Builder(java.util.List<androidx.media3.transformer.EditedMediaItemSequence> list) {
            androidx.media3.common.util.Assertions.checkArgument(!list.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
            this.sequences = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            this.videoCompositorSettings = androidx.media3.effect.VideoCompositorSettings.DEFAULT;
            this.effects = androidx.media3.transformer.Effects.EMPTY;
        }

        private Builder(androidx.media3.transformer.Composition composition) {
            this.sequences = composition.sequences;
            this.videoCompositorSettings = composition.videoCompositorSettings;
            this.effects = composition.effects;
            this.forceAudioTrack = composition.forceAudioTrack;
            this.transmuxAudio = composition.transmuxAudio;
            this.transmuxVideo = composition.transmuxVideo;
            this.hdrMode = composition.hdrMode;
            this.retainHdrFromUltraHdrImage = composition.retainHdrFromUltraHdrImage;
        }

        public androidx.media3.transformer.Composition.Builder setVideoCompositorSettings(androidx.media3.effect.VideoCompositorSettings videoCompositorSettings) {
            this.videoCompositorSettings = videoCompositorSettings;
            return this;
        }

        public androidx.media3.transformer.Composition.Builder setEffects(androidx.media3.transformer.Effects effects) {
            this.effects = effects;
            return this;
        }

        public androidx.media3.transformer.Composition.Builder experimentalSetForceAudioTrack(boolean z) {
            this.forceAudioTrack = z;
            return this;
        }

        public androidx.media3.transformer.Composition.Builder setTransmuxAudio(boolean z) {
            this.transmuxAudio = z;
            return this;
        }

        public androidx.media3.transformer.Composition.Builder setTransmuxVideo(boolean z) {
            this.transmuxVideo = z;
            return this;
        }

        public androidx.media3.transformer.Composition.Builder setHdrMode(int i) {
            this.hdrMode = i;
            return this;
        }

        public androidx.media3.transformer.Composition.Builder experimentalSetRetainHdrFromUltraHdrImage(boolean z) {
            this.retainHdrFromUltraHdrImage = z;
            return this;
        }

        public androidx.media3.transformer.Composition build() {
            com.google.common.collect.ImmutableList<androidx.media3.transformer.EditedMediaItemSequence> immutableList = this.sequences;
            androidx.media3.effect.VideoCompositorSettings videoCompositorSettings = this.videoCompositorSettings;
            androidx.media3.transformer.Effects effects = this.effects;
            boolean z = this.forceAudioTrack;
            boolean z2 = this.transmuxAudio;
            boolean z3 = this.transmuxVideo;
            int i = this.hdrMode;
            return new androidx.media3.transformer.Composition(immutableList, videoCompositorSettings, effects, z, z2, z3, i, this.retainHdrFromUltraHdrImage && i == 0);
        }

        androidx.media3.transformer.Composition.Builder setSequences(java.util.List<androidx.media3.transformer.EditedMediaItemSequence> list) {
            androidx.media3.common.util.Assertions.checkArgument(!list.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
            this.sequences = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }
    }

    androidx.media3.transformer.Composition.Builder buildUpon() {
        return new androidx.media3.transformer.Composition.Builder();
    }

    private Composition(java.util.List<androidx.media3.transformer.EditedMediaItemSequence> list, androidx.media3.effect.VideoCompositorSettings videoCompositorSettings, androidx.media3.transformer.Effects effects, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        androidx.media3.common.util.Assertions.checkArgument((z2 && z) ? false : true, "Audio transmuxing and audio track forcing are not allowed together.");
        this.sequences = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.videoCompositorSettings = videoCompositorSettings;
        this.effects = effects;
        this.transmuxAudio = z2;
        this.transmuxVideo = z3;
        this.forceAudioTrack = z;
        this.hdrMode = i;
        this.retainHdrFromUltraHdrImage = z4;
    }
}

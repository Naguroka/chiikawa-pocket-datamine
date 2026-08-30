package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class EditedMediaItem {
    public final long durationUs;
    public final androidx.media3.transformer.Effects effects;
    public final boolean flattenForSlowMotion;
    public final int frameRate;
    public final androidx.media3.common.MediaItem mediaItem;
    private long presentationDurationUs;
    public final boolean removeAudio;
    public final boolean removeVideo;

    public static final class Builder {
        private long durationUs;
        private androidx.media3.transformer.Effects effects;
        private boolean flattenForSlowMotion;
        private int frameRate;
        private androidx.media3.common.MediaItem mediaItem;
        private boolean removeAudio;
        private boolean removeVideo;

        public Builder(androidx.media3.common.MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            this.durationUs = androidx.media3.common.C.TIME_UNSET;
            this.frameRate = androidx.media3.common.C.RATE_UNSET_INT;
            this.effects = androidx.media3.transformer.Effects.EMPTY;
        }

        private Builder(androidx.media3.transformer.EditedMediaItem editedMediaItem) {
            this.mediaItem = editedMediaItem.mediaItem;
            this.removeAudio = editedMediaItem.removeAudio;
            this.removeVideo = editedMediaItem.removeVideo;
            this.flattenForSlowMotion = editedMediaItem.flattenForSlowMotion;
            this.durationUs = editedMediaItem.durationUs;
            this.frameRate = editedMediaItem.frameRate;
            this.effects = editedMediaItem.effects;
        }

        public androidx.media3.transformer.EditedMediaItem.Builder setRemoveAudio(boolean z) {
            this.removeAudio = z;
            return this;
        }

        public androidx.media3.transformer.EditedMediaItem.Builder setRemoveVideo(boolean z) {
            this.removeVideo = z;
            return this;
        }

        public androidx.media3.transformer.EditedMediaItem.Builder setFlattenForSlowMotion(boolean z) {
            androidx.media3.common.util.Assertions.checkArgument(this.mediaItem.clippingConfiguration.equals(androidx.media3.common.MediaItem.ClippingConfiguration.UNSET) || !z, "Slow motion flattening is not supported when clipping is requested");
            this.flattenForSlowMotion = z;
            return this;
        }

        public androidx.media3.transformer.EditedMediaItem.Builder setDurationUs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j > 0);
            this.durationUs = j;
            return this;
        }

        public androidx.media3.transformer.EditedMediaItem.Builder setFrameRate(int i) {
            androidx.media3.common.util.Assertions.checkArgument(i > 0);
            this.frameRate = i;
            return this;
        }

        public androidx.media3.transformer.EditedMediaItem.Builder setEffects(androidx.media3.transformer.Effects effects) {
            this.effects = effects;
            return this;
        }

        public androidx.media3.transformer.EditedMediaItem build() {
            return new androidx.media3.transformer.EditedMediaItem(this.mediaItem, this.removeAudio, this.removeVideo, this.flattenForSlowMotion, this.durationUs, this.frameRate, this.effects);
        }

        androidx.media3.transformer.EditedMediaItem.Builder setMediaItem(androidx.media3.common.MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }
    }

    private EditedMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z, boolean z2, boolean z3, long j, int i, androidx.media3.transformer.Effects effects) {
        androidx.media3.common.util.Assertions.checkState((z && z2) ? false : true, "Audio and video cannot both be removed");
        this.mediaItem = mediaItem;
        this.removeAudio = z;
        this.removeVideo = z2;
        this.flattenForSlowMotion = z3;
        this.durationUs = j;
        this.frameRate = i;
        this.effects = effects;
        this.presentationDurationUs = androidx.media3.common.C.TIME_UNSET;
    }

    androidx.media3.transformer.EditedMediaItem.Builder buildUpon() {
        return new androidx.media3.transformer.EditedMediaItem.Builder();
    }

    long getPresentationDurationUs() {
        if (this.presentationDurationUs == androidx.media3.common.C.TIME_UNSET) {
            if (this.mediaItem.clippingConfiguration.equals(androidx.media3.common.MediaItem.ClippingConfiguration.UNSET) || this.durationUs == androidx.media3.common.C.TIME_UNSET) {
                this.presentationDurationUs = this.durationUs;
            } else {
                androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = this.mediaItem.clippingConfiguration;
                androidx.media3.common.util.Assertions.checkArgument(!clippingConfiguration.relativeToDefaultPosition);
                if (clippingConfiguration.endPositionUs == Long.MIN_VALUE) {
                    this.presentationDurationUs = this.durationUs - clippingConfiguration.startPositionUs;
                } else {
                    androidx.media3.common.util.Assertions.checkArgument(clippingConfiguration.endPositionUs <= this.durationUs);
                    this.presentationDurationUs = clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs;
                }
            }
        }
        return this.presentationDurationUs;
    }

    long getDurationAfterEffectsApplied(long j) {
        long durationAfterProcessorApplied;
        boolean z = this.removeAudio;
        long j2 = androidx.media3.common.C.TIME_UNSET;
        if (z) {
            durationAfterProcessorApplied = -9223372036854775807L;
        } else {
            com.google.common.collect.UnmodifiableIterator<androidx.media3.common.audio.AudioProcessor> it = this.effects.audioProcessors.iterator();
            durationAfterProcessorApplied = j;
            while (it.hasNext()) {
                durationAfterProcessorApplied = it.next().getDurationAfterProcessorApplied(durationAfterProcessorApplied);
            }
        }
        if (!this.removeVideo) {
            com.google.common.collect.UnmodifiableIterator<androidx.media3.common.Effect> it2 = this.effects.videoEffects.iterator();
            while (it2.hasNext()) {
                j = it2.next().getDurationAfterEffectApplied(j);
            }
            j2 = j;
        }
        return java.lang.Math.max(durationAfterProcessorApplied, j2);
    }
}

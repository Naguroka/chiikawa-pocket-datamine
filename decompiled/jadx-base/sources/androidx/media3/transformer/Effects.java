package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class Effects {
    public static final androidx.media3.transformer.Effects EMPTY = new androidx.media3.transformer.Effects(com.google.common.collect.ImmutableList.of(), com.google.common.collect.ImmutableList.of());
    public final com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> audioProcessors;
    public final com.google.common.collect.ImmutableList<androidx.media3.common.Effect> videoEffects;

    public Effects(java.util.List<androidx.media3.common.audio.AudioProcessor> list, java.util.List<androidx.media3.common.Effect> list2) {
        this.audioProcessors = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.videoEffects = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list2);
    }

    public static android.util.Pair<androidx.media3.common.audio.AudioProcessor, androidx.media3.common.Effect> createExperimentalSpeedChangingEffect(androidx.media3.common.audio.SpeedProvider speedProvider) {
        final androidx.media3.common.audio.SpeedChangingAudioProcessor speedChangingAudioProcessor = new androidx.media3.common.audio.SpeedChangingAudioProcessor(speedProvider);
        java.util.Objects.requireNonNull(speedChangingAudioProcessor);
        return android.util.Pair.create(speedChangingAudioProcessor, new androidx.media3.effect.TimestampAdjustment(new androidx.media3.effect.TimestampAdjustment.TimestampMap() { // from class: androidx.media3.transformer.Effects$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.TimestampAdjustment.TimestampMap
            public final void calculateOutputTimeUs(long j, androidx.media3.common.util.TimestampConsumer timestampConsumer) {
                speedChangingAudioProcessor.getSpeedAdjustedTimeAsync(j, timestampConsumer);
            }
        }));
    }
}

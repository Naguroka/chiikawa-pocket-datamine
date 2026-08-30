package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class ThumbnailStripEffect implements androidx.media3.effect.GlEffect {
    private int currentThumbnailIndex;
    final int stripHeight;
    final int stripWidth;
    private final java.util.List<java.lang.Long> timestampsMs = new java.util.ArrayList();

    public ThumbnailStripEffect(int i, int i2) {
        this.stripWidth = i;
        this.stripHeight = i2;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.ThumbnailStripShaderProgram toGlShaderProgram(android.content.Context context, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.ThumbnailStripShaderProgram(context, z, this);
    }

    public void setTimestampsMs(java.util.List<java.lang.Long> list) {
        this.timestampsMs.clear();
        this.timestampsMs.addAll(list);
        this.currentThumbnailIndex = 0;
    }

    public boolean isDone() {
        return this.currentThumbnailIndex >= this.timestampsMs.size();
    }

    public int getNextThumbnailIndex() {
        return this.currentThumbnailIndex;
    }

    public long getNextTimestampMs() {
        if (isDone()) {
            return Long.MIN_VALUE;
        }
        return this.timestampsMs.get(this.currentThumbnailIndex).longValue();
    }

    public int getNumberOfThumbnails() {
        return this.timestampsMs.size();
    }

    void onThumbnailDrawn() {
        this.currentThumbnailIndex++;
    }
}

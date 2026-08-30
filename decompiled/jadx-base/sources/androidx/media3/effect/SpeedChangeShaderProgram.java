package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class SpeedChangeShaderProgram extends androidx.media3.effect.PassthroughShaderProgram {
    private long lastSpeedChangeInputTimeUs = androidx.media3.common.C.TIME_UNSET;
    private long lastSpeedChangeOutputTimeUs = androidx.media3.common.C.TIME_UNSET;
    private final androidx.media3.effect.SpeedChangeShaderProgram.OffsetSpeedProvider speedProvider;

    public SpeedChangeShaderProgram(androidx.media3.common.audio.SpeedProvider speedProvider) {
        this.speedProvider = new androidx.media3.effect.SpeedChangeShaderProgram.OffsetSpeedProvider(speedProvider);
    }

    @Override // androidx.media3.effect.PassthroughShaderProgram, androidx.media3.effect.GlShaderProgram
    public void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
        long j2 = this.lastSpeedChangeInputTimeUs;
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            this.lastSpeedChangeInputTimeUs = j;
            this.lastSpeedChangeOutputTimeUs = j;
            this.speedProvider.setOffset(j);
        } else {
            long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(j2);
            while (nextSpeedChangeTimeUs != androidx.media3.common.C.TIME_UNSET && nextSpeedChangeTimeUs <= j) {
                this.lastSpeedChangeOutputTimeUs = getOutputTimeUs(nextSpeedChangeTimeUs, this.speedProvider.getSpeed(this.lastSpeedChangeInputTimeUs));
                this.lastSpeedChangeInputTimeUs = nextSpeedChangeTimeUs;
                nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(nextSpeedChangeTimeUs);
            }
            j = getOutputTimeUs(j, this.speedProvider.getSpeed(j));
        }
        super.queueInputFrame(glObjectsProvider, glTextureInfo, j);
    }

    @Override // androidx.media3.effect.PassthroughShaderProgram, androidx.media3.effect.GlShaderProgram
    public void signalEndOfCurrentInputStream() {
        super.signalEndOfCurrentInputStream();
        this.lastSpeedChangeInputTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.lastSpeedChangeOutputTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    private long getOutputTimeUs(long j, float f) {
        return (long) (this.lastSpeedChangeOutputTimeUs + ((j - this.lastSpeedChangeInputTimeUs) / f));
    }

    private static class OffsetSpeedProvider implements androidx.media3.common.audio.SpeedProvider {
        private long offset;
        private final androidx.media3.common.audio.SpeedProvider speedProvider;

        public OffsetSpeedProvider(androidx.media3.common.audio.SpeedProvider speedProvider) {
            this.speedProvider = speedProvider;
        }

        public void setOffset(long j) {
            this.offset = j;
        }

        @Override // androidx.media3.common.audio.SpeedProvider
        public float getSpeed(long j) {
            return this.speedProvider.getSpeed(j - this.offset);
        }

        @Override // androidx.media3.common.audio.SpeedProvider
        public long getNextSpeedChangeTimeUs(long j) {
            long nextSpeedChangeTimeUs = this.speedProvider.getNextSpeedChangeTimeUs(j - this.offset);
            return nextSpeedChangeTimeUs == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : this.offset + nextSpeedChangeTimeUs;
        }
    }
}

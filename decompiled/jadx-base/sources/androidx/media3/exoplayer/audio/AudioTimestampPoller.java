package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
final class AudioTimestampPoller {
    private static final int ERROR_POLL_INTERVAL_US = 500000;
    private static final int FAST_POLL_INTERVAL_US = 10000;
    private static final int INITIALIZING_DURATION_US = 500000;
    private static final int SLOW_POLL_INTERVAL_US = 10000000;
    private static final int STATE_ERROR = 4;
    private static final int STATE_INITIALIZING = 0;
    private static final int STATE_NO_TIMESTAMP = 3;
    private static final int STATE_TIMESTAMP = 1;
    private static final int STATE_TIMESTAMP_ADVANCING = 2;
    private final androidx.media3.exoplayer.audio.AudioTimestampPoller.AudioTimestampWrapper audioTimestamp;
    private long initialTimestampPositionFrames;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private int state;

    public AudioTimestampPoller(android.media.AudioTrack audioTrack) {
        this.audioTimestamp = new androidx.media3.exoplayer.audio.AudioTimestampPoller.AudioTimestampWrapper(audioTrack);
        reset();
    }

    public boolean maybePollTimestamp(long j) {
        androidx.media3.exoplayer.audio.AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper = this.audioTimestamp;
        if (audioTimestampWrapper == null || j - this.lastTimestampSampleTimeUs < this.sampleIntervalUs) {
            return false;
        }
        this.lastTimestampSampleTimeUs = j;
        boolean zMaybeUpdateTimestamp = audioTimestampWrapper.maybeUpdateTimestamp();
        int i = this.state;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException();
                        }
                    } else if (zMaybeUpdateTimestamp) {
                        reset();
                    }
                } else if (!zMaybeUpdateTimestamp) {
                    reset();
                }
            } else if (!zMaybeUpdateTimestamp) {
                reset();
            } else if (this.audioTimestamp.getTimestampPositionFrames() > this.initialTimestampPositionFrames) {
                updateState(2);
            }
        } else if (zMaybeUpdateTimestamp) {
            if (this.audioTimestamp.getTimestampSystemTimeUs() < this.initializeSystemTimeUs) {
                return false;
            }
            this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
            updateState(1);
        } else if (j - this.initializeSystemTimeUs > 500000) {
            updateState(3);
        }
        return zMaybeUpdateTimestamp;
    }

    public void rejectTimestamp() {
        updateState(4);
    }

    public void acceptTimestamp() {
        if (this.state == 4) {
            reset();
        }
    }

    public boolean hasTimestamp() {
        int i = this.state;
        return i == 1 || i == 2;
    }

    public boolean hasAdvancingTimestamp() {
        return this.state == 2;
    }

    public void reset() {
        if (this.audioTimestamp != null) {
            updateState(0);
        }
    }

    public long getTimestampSystemTimeUs() {
        androidx.media3.exoplayer.audio.AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper = this.audioTimestamp;
        return audioTimestampWrapper != null ? audioTimestampWrapper.getTimestampSystemTimeUs() : androidx.media3.common.C.TIME_UNSET;
    }

    public long getTimestampPositionFrames() {
        androidx.media3.exoplayer.audio.AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper = this.audioTimestamp;
        if (audioTimestampWrapper != null) {
            return audioTimestampWrapper.getTimestampPositionFrames();
        }
        return -1L;
    }

    public void expectTimestampFramePositionReset() {
        androidx.media3.exoplayer.audio.AudioTimestampPoller.AudioTimestampWrapper audioTimestampWrapper = this.audioTimestamp;
        if (audioTimestampWrapper != null) {
            audioTimestampWrapper.expectTimestampFramePositionReset();
        }
    }

    private void updateState(int i) {
        this.state = i;
        if (i == 0) {
            this.lastTimestampSampleTimeUs = 0L;
            this.initialTimestampPositionFrames = -1L;
            this.initializeSystemTimeUs = java.lang.System.nanoTime() / 1000;
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i == 1) {
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.sampleIntervalUs = 10000000L;
        } else {
            if (i == 4) {
                this.sampleIntervalUs = 500000L;
                return;
            }
            throw new java.lang.IllegalStateException();
        }
    }

    private static final class AudioTimestampWrapper {
        private long accumulatedRawTimestampFramePosition;
        private final android.media.AudioTimestamp audioTimestamp = new android.media.AudioTimestamp();
        private final android.media.AudioTrack audioTrack;
        private boolean expectTimestampFramePositionReset;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public AudioTimestampWrapper(android.media.AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.audioTrack.getTimestamp(this.audioTimestamp);
            if (timestamp) {
                long j = this.audioTimestamp.framePosition;
                long j2 = this.lastTimestampRawPositionFrames;
                if (j2 > j) {
                    if (this.expectTimestampFramePositionReset) {
                        this.accumulatedRawTimestampFramePosition += j2;
                        this.expectTimestampFramePositionReset = false;
                    } else {
                        this.rawTimestampFramePositionWrapCount++;
                    }
                }
                this.lastTimestampRawPositionFrames = j;
                this.lastTimestampPositionFrames = j + this.accumulatedRawTimestampFramePosition + (this.rawTimestampFramePositionWrapCount << 32);
            }
            return timestamp;
        }

        public long getTimestampSystemTimeUs() {
            return this.audioTimestamp.nanoTime / 1000;
        }

        public long getTimestampPositionFrames() {
            return this.lastTimestampPositionFrames;
        }

        public void expectTimestampFramePositionReset() {
            this.expectTimestampFramePositionReset = true;
        }
    }
}

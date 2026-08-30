package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final long MODE_SWITCH_SMOOTHING_DURATION_US = 1000000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    private static final long RAW_PLAYBACK_HEAD_POSITION_UPDATE_INTERVAL_MS = 5;
    private androidx.media3.exoplayer.audio.AudioTimestampPoller audioTimestampPoller;
    private android.media.AudioTrack audioTrack;
    private float audioTrackPlaybackSpeed;
    private int bufferSize;
    private long bufferSizeUs;
    private androidx.media3.common.util.Clock clock;
    private long endPlaybackHeadPosition;
    private boolean expectRawPlaybackHeadReset;
    private long forceResetWorkaroundTimeMs;
    private java.lang.reflect.Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastPositionUs;
    private long lastRawPlaybackHeadPositionSampleTimeMs;
    private boolean lastSampleUsedGetTimestampMode;
    private long lastSystemTimeUs;
    private long latencyUs;
    private final androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private boolean notifiedPositionIncreasing;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long previousModePositionUs;
    private long previousModeSystemTimeUs;
    private long rawPlaybackHeadPosition;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;
    private long sumRawPlaybackHeadPosition;

    public interface Listener {
        void onInvalidLatency(long j);

        void onPositionAdvancing(long j);

        void onPositionFramesMismatch(long j, long j2, long j3, long j4);

        void onSystemTimeUsMismatch(long j, long j2, long j3, long j4);

        void onUnderrun(int i, long j);
    }

    public AudioTrackPositionTracker(androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener listener) {
        this.listener = (androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener) androidx.media3.common.util.Assertions.checkNotNull(listener);
        try {
            this.getLatencyMethod = android.media.AudioTrack.class.getMethod("getLatency", null);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        this.playheadOffsets = new long[10];
        this.clock = androidx.media3.common.util.Clock.DEFAULT;
    }

    public void setAudioTrack(android.media.AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.audioTrack = audioTrack;
        this.outputPcmFrameSize = i2;
        this.bufferSize = i3;
        this.audioTimestampPoller = new androidx.media3.exoplayer.audio.AudioTimestampPoller(audioTrack);
        this.outputSampleRate = audioTrack.getSampleRate();
        this.needsPassthroughWorkarounds = z && needsPassthroughWorkarounds(i);
        boolean zIsEncodingLinearPcm = androidx.media3.common.util.Util.isEncodingLinearPcm(i);
        this.isOutputPcm = zIsEncodingLinearPcm;
        this.bufferSizeUs = zIsEncodingLinearPcm ? androidx.media3.common.util.Util.sampleCountToDurationUs(i3 / i2, this.outputSampleRate) : -9223372036854775807L;
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.passthroughWorkaroundPauseOffset = 0L;
        this.hasData = false;
        this.stopTimestampUs = androidx.media3.common.C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = androidx.media3.common.C.TIME_UNSET;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
    }

    public void setAudioTrackPlaybackSpeed(float f) {
        this.audioTrackPlaybackSpeed = f;
        androidx.media3.exoplayer.audio.AudioTimestampPoller audioTimestampPoller = this.audioTimestampPoller;
        if (audioTimestampPoller != null) {
            audioTimestampPoller.reset();
        }
        resetSyncParams();
    }

    public long getCurrentPositionUs(boolean z) {
        long mediaDurationForPlayoutDuration;
        if (((android.media.AudioTrack) androidx.media3.common.util.Assertions.checkNotNull(this.audioTrack)).getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long jNanoTime = this.clock.nanoTime() / 1000;
        androidx.media3.exoplayer.audio.AudioTimestampPoller audioTimestampPoller = (androidx.media3.exoplayer.audio.AudioTimestampPoller) androidx.media3.common.util.Assertions.checkNotNull(this.audioTimestampPoller);
        boolean zHasAdvancingTimestamp = audioTimestampPoller.hasAdvancingTimestamp();
        if (zHasAdvancingTimestamp) {
            mediaDurationForPlayoutDuration = androidx.media3.common.util.Util.sampleCountToDurationUs(audioTimestampPoller.getTimestampPositionFrames(), this.outputSampleRate) + androidx.media3.common.util.Util.getMediaDurationForPlayoutDuration(jNanoTime - audioTimestampPoller.getTimestampSystemTimeUs(), this.audioTrackPlaybackSpeed);
        } else {
            if (this.playheadOffsetCount == 0) {
                mediaDurationForPlayoutDuration = getPlaybackHeadPositionUs();
            } else {
                mediaDurationForPlayoutDuration = androidx.media3.common.util.Util.getMediaDurationForPlayoutDuration(this.smoothedPlayheadOffsetUs + jNanoTime, this.audioTrackPlaybackSpeed);
            }
            if (!z) {
                mediaDurationForPlayoutDuration = java.lang.Math.max(0L, mediaDurationForPlayoutDuration - this.latencyUs);
            }
        }
        if (this.lastSampleUsedGetTimestampMode != zHasAdvancingTimestamp) {
            this.previousModeSystemTimeUs = this.lastSystemTimeUs;
            this.previousModePositionUs = this.lastPositionUs;
        }
        long j = jNanoTime - this.previousModeSystemTimeUs;
        if (j < 1000000) {
            long mediaDurationForPlayoutDuration2 = this.previousModePositionUs + androidx.media3.common.util.Util.getMediaDurationForPlayoutDuration(j, this.audioTrackPlaybackSpeed);
            long j2 = (j * 1000) / 1000000;
            mediaDurationForPlayoutDuration = ((mediaDurationForPlayoutDuration * j2) + ((1000 - j2) * mediaDurationForPlayoutDuration2)) / 1000;
        }
        if (!this.notifiedPositionIncreasing) {
            long j3 = this.lastPositionUs;
            if (mediaDurationForPlayoutDuration > j3) {
                this.notifiedPositionIncreasing = true;
                this.listener.onPositionAdvancing(this.clock.currentTimeMillis() - androidx.media3.common.util.Util.usToMs(androidx.media3.common.util.Util.getPlayoutDurationForMediaDuration(androidx.media3.common.util.Util.usToMs(mediaDurationForPlayoutDuration - j3), this.audioTrackPlaybackSpeed)));
            }
        }
        this.lastSystemTimeUs = jNanoTime;
        this.lastPositionUs = mediaDurationForPlayoutDuration;
        this.lastSampleUsedGetTimestampMode = zHasAdvancingTimestamp;
        return mediaDurationForPlayoutDuration;
    }

    public void start() {
        if (this.stopTimestampUs != androidx.media3.common.C.TIME_UNSET) {
            this.stopTimestampUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime());
        }
        ((androidx.media3.exoplayer.audio.AudioTimestampPoller) androidx.media3.common.util.Assertions.checkNotNull(this.audioTimestampPoller)).reset();
    }

    public boolean isPlaying() {
        return ((android.media.AudioTrack) androidx.media3.common.util.Assertions.checkNotNull(this.audioTrack)).getPlayState() == 3;
    }

    public boolean mayHandleBuffer(long j) {
        int playState = ((android.media.AudioTrack) androidx.media3.common.util.Assertions.checkNotNull(this.audioTrack)).getPlayState();
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2) {
                this.hasData = false;
                return false;
            }
            if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        boolean z = this.hasData;
        boolean zHasPendingData = hasPendingData(j);
        this.hasData = zHasPendingData;
        if (z && !zHasPendingData && playState != 1) {
            this.listener.onUnderrun(this.bufferSize, androidx.media3.common.util.Util.usToMs(this.bufferSizeUs));
        }
        return true;
    }

    public int getAvailableBufferSize(long j) {
        return this.bufferSize - ((int) (j - (getPlaybackHeadPosition() * ((long) this.outputPcmFrameSize))));
    }

    public boolean isStalled(long j) {
        return this.forceResetWorkaroundTimeMs != androidx.media3.common.C.TIME_UNSET && j > 0 && this.clock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= FORCE_RESET_WORKAROUND_TIMEOUT_MS;
    }

    public void handleEndOfStream(long j) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime());
        this.endPlaybackHeadPosition = j;
    }

    public boolean hasPendingData(long j) {
        return j > androidx.media3.common.util.Util.durationUsToSampleCount(getCurrentPositionUs(false), this.outputSampleRate) || forceHasPendingData();
    }

    public boolean pause() {
        resetSyncParams();
        if (this.stopTimestampUs == androidx.media3.common.C.TIME_UNSET) {
            ((androidx.media3.exoplayer.audio.AudioTimestampPoller) androidx.media3.common.util.Assertions.checkNotNull(this.audioTimestampPoller)).reset();
            return true;
        }
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        return false;
    }

    public void expectRawPlaybackHeadReset() {
        this.expectRawPlaybackHeadReset = true;
        androidx.media3.exoplayer.audio.AudioTimestampPoller audioTimestampPoller = this.audioTimestampPoller;
        if (audioTimestampPoller != null) {
            audioTimestampPoller.expectTimestampFramePositionReset();
        }
    }

    public void reset() {
        resetSyncParams();
        this.audioTrack = null;
        this.audioTimestampPoller = null;
    }

    public void setClock(androidx.media3.common.util.Clock clock) {
        this.clock = clock;
    }

    private void maybeSampleSyncParams() {
        long jNanoTime = this.clock.nanoTime() / 1000;
        if (jNanoTime - this.lastPlayheadSampleTimeUs >= 30000) {
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (playbackHeadPositionUs != 0) {
                this.playheadOffsets[this.nextPlayheadOffsetIndex] = androidx.media3.common.util.Util.getPlayoutDurationForMediaDuration(playbackHeadPositionUs, this.audioTrackPlaybackSpeed) - jNanoTime;
                this.nextPlayheadOffsetIndex = (this.nextPlayheadOffsetIndex + 1) % 10;
                int i = this.playheadOffsetCount;
                if (i < 10) {
                    this.playheadOffsetCount = i + 1;
                }
                this.lastPlayheadSampleTimeUs = jNanoTime;
                this.smoothedPlayheadOffsetUs = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.playheadOffsetCount;
                    if (i2 >= i3) {
                        break;
                    }
                    this.smoothedPlayheadOffsetUs += this.playheadOffsets[i2] / ((long) i3);
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.needsPassthroughWorkarounds) {
            return;
        }
        maybePollAndCheckTimestamp(jNanoTime);
        maybeUpdateLatency(jNanoTime);
    }

    private void maybePollAndCheckTimestamp(long j) {
        androidx.media3.exoplayer.audio.AudioTimestampPoller audioTimestampPoller = (androidx.media3.exoplayer.audio.AudioTimestampPoller) androidx.media3.common.util.Assertions.checkNotNull(this.audioTimestampPoller);
        if (audioTimestampPoller.maybePollTimestamp(j)) {
            long timestampSystemTimeUs = audioTimestampPoller.getTimestampSystemTimeUs();
            long timestampPositionFrames = audioTimestampPoller.getTimestampPositionFrames();
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (java.lang.Math.abs(timestampSystemTimeUs - j) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.listener.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j, playbackHeadPositionUs);
                audioTimestampPoller.rejectTimestamp();
            } else if (java.lang.Math.abs(androidx.media3.common.util.Util.sampleCountToDurationUs(timestampPositionFrames, this.outputSampleRate) - playbackHeadPositionUs) > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.listener.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j, playbackHeadPositionUs);
                audioTimestampPoller.rejectTimestamp();
            } else {
                audioTimestampPoller.acceptTimestamp();
            }
        }
    }

    private void maybeUpdateLatency(long j) {
        java.lang.reflect.Method method;
        if (!this.isOutputPcm || (method = this.getLatencyMethod) == null || j - this.lastLatencySampleTimeUs < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((java.lang.Integer) androidx.media3.common.util.Util.castNonNull((java.lang.Integer) method.invoke(androidx.media3.common.util.Assertions.checkNotNull(this.audioTrack), new java.lang.Object[0]))).intValue()) * 1000) - this.bufferSizeUs;
            this.latencyUs = jIntValue;
            long jMax = java.lang.Math.max(jIntValue, 0L);
            this.latencyUs = jMax;
            if (jMax > androidx.media3.exoplayer.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.listener.onInvalidLatency(jMax);
                this.latencyUs = 0L;
            }
        } catch (java.lang.Exception unused) {
            this.getLatencyMethod = null;
        }
        this.lastLatencySampleTimeUs = j;
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
        this.lastSystemTimeUs = 0L;
        this.previousModeSystemTimeUs = 0L;
        this.notifiedPositionIncreasing = false;
    }

    private boolean forceHasPendingData() {
        return this.needsPassthroughWorkarounds && ((android.media.AudioTrack) androidx.media3.common.util.Assertions.checkNotNull(this.audioTrack)).getPlayState() == 2 && getPlaybackHeadPosition() == 0;
    }

    private static boolean needsPassthroughWorkarounds(int i) {
        return androidx.media3.common.util.Util.SDK_INT < 23 && (i == 5 || i == 6);
    }

    private long getPlaybackHeadPositionUs() {
        return androidx.media3.common.util.Util.sampleCountToDurationUs(getPlaybackHeadPosition(), this.outputSampleRate);
    }

    private long getPlaybackHeadPosition() {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (this.stopTimestampUs != androidx.media3.common.C.TIME_UNSET) {
            if (((android.media.AudioTrack) androidx.media3.common.util.Assertions.checkNotNull(this.audioTrack)).getPlayState() == 2) {
                return this.stopPlaybackHeadPosition;
            }
            return java.lang.Math.min(this.endPlaybackHeadPosition, this.stopPlaybackHeadPosition + androidx.media3.common.util.Util.durationUsToSampleCount(androidx.media3.common.util.Util.getMediaDurationForPlayoutDuration(androidx.media3.common.util.Util.msToUs(jElapsedRealtime) - this.stopTimestampUs, this.audioTrackPlaybackSpeed), this.outputSampleRate));
        }
        if (jElapsedRealtime - this.lastRawPlaybackHeadPositionSampleTimeMs >= 5) {
            updateRawPlaybackHeadPosition(jElapsedRealtime);
            this.lastRawPlaybackHeadPositionSampleTimeMs = jElapsedRealtime;
        }
        return this.rawPlaybackHeadPosition + this.sumRawPlaybackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    private void updateRawPlaybackHeadPosition(long j) {
        android.media.AudioTrack audioTrack = (android.media.AudioTrack) androidx.media3.common.util.Assertions.checkNotNull(this.audioTrack);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.passthroughWorkaroundPauseOffset = this.rawPlaybackHeadPosition;
            }
            playbackHeadPosition += this.passthroughWorkaroundPauseOffset;
        }
        if (androidx.media3.common.util.Util.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.rawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == androidx.media3.common.C.TIME_UNSET) {
                    this.forceResetWorkaroundTimeMs = j;
                    return;
                }
                return;
            }
            this.forceResetWorkaroundTimeMs = androidx.media3.common.C.TIME_UNSET;
        }
        long j2 = this.rawPlaybackHeadPosition;
        if (j2 > playbackHeadPosition) {
            if (this.expectRawPlaybackHeadReset) {
                this.sumRawPlaybackHeadPosition += j2;
                this.expectRawPlaybackHeadReset = false;
            } else {
                this.rawPlaybackHeadWrapCount++;
            }
        }
        this.rawPlaybackHeadPosition = playbackHeadPosition;
    }
}

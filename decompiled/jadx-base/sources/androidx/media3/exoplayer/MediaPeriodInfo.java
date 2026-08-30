package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    MediaPeriodInfo(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        androidx.media3.common.util.Assertions.checkArgument(!z4 || z2);
        androidx.media3.common.util.Assertions.checkArgument(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        androidx.media3.common.util.Assertions.checkArgument(z5);
        this.id = mediaPeriodId;
        this.startPositionUs = j;
        this.requestedContentPositionUs = j2;
        this.endPositionUs = j3;
        this.durationUs = j4;
        this.isFollowedByTransitionToSameStream = z;
        this.isLastInTimelinePeriod = z2;
        this.isLastInTimelineWindow = z3;
        this.isFinal = z4;
    }

    public androidx.media3.exoplayer.MediaPeriodInfo copyWithStartPositionUs(long j) {
        return j == this.startPositionUs ? this : new androidx.media3.exoplayer.MediaPeriodInfo(this.id, j, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public androidx.media3.exoplayer.MediaPeriodInfo copyWithRequestedContentPositionUs(long j) {
        return j == this.requestedContentPositionUs ? this : new androidx.media3.exoplayer.MediaPeriodInfo(this.id, this.startPositionUs, j, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = (androidx.media3.exoplayer.MediaPeriodInfo) obj;
        return this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && androidx.media3.common.util.Util.areEqual(this.id, mediaPeriodInfo.id);
    }

    public int hashCode() {
        return ((((((((((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}

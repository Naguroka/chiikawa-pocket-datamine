package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface LoadErrorHandlingPolicy {
    public static final int FALLBACK_TYPE_LOCATION = 1;
    public static final int FALLBACK_TYPE_TRACK = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo);

    int getMinimumLoadableRetryCount(int i);

    long getRetryDelayMsFor(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo);

    default void onLoadTaskConcluded(long j) {
    }

    public static final class LoadErrorInfo {
        public final int errorCount;
        public final java.io.IOException exception;
        public final androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo;
        public final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData;

        public LoadErrorInfo(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, int i) {
            this.loadEventInfo = loadEventInfo;
            this.mediaLoadData = mediaLoadData;
            this.exception = iOException;
            this.errorCount = i;
        }
    }

    public static final class FallbackOptions {
        public final int numberOfExcludedLocations;
        public final int numberOfExcludedTracks;
        public final int numberOfLocations;
        public final int numberOfTracks;

        public FallbackOptions(int i, int i2, int i3, int i4) {
            this.numberOfLocations = i;
            this.numberOfExcludedLocations = i2;
            this.numberOfTracks = i3;
            this.numberOfExcludedTracks = i4;
        }

        public boolean isFallbackAvailable(int i) {
            if (i == 1) {
                if (this.numberOfLocations - this.numberOfExcludedLocations <= 1) {
                    return false;
                }
            } else if (this.numberOfTracks - this.numberOfExcludedTracks <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class FallbackSelection {
        public final long exclusionDurationMs;
        public final int type;

        public FallbackSelection(int i, long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0);
            this.type = i;
            this.exclusionDurationMs = j;
        }
    }
}

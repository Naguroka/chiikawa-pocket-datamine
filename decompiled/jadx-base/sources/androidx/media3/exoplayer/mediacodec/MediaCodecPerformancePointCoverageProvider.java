package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static java.lang.Boolean shouldIgnorePerformancePoints;

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (androidx.media3.common.util.Util.SDK_INT < 29) {
            return 0;
        }
        java.lang.Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.Api29.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
        }
        return 0;
    }

    private static final class Api29 {
        private Api29() {
        }

        public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
            if (iEvaluatePerformancePointCoverage == 1 && androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                java.lang.Boolean unused = androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = java.lang.Boolean.valueOf(shouldIgnorePerformancePoints());
                if (androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }

        private static boolean shouldIgnorePerformancePoints() {
            java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            if (androidx.media3.common.util.Util.SDK_INT >= 35) {
                return false;
            }
            try {
                androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setSampleMimeType("video/avc").build();
                if (formatBuild.sampleMimeType != null) {
                    java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfosSoftMatch = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSoftMatch(androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT, formatBuild, false, false);
                    for (int i = 0; i < decoderInfosSoftMatch.size(); i++) {
                        if (decoderInfosSoftMatch.get(i).capabilities != null && decoderInfosSoftMatch.get(i).capabilities.getVideoCapabilities() != null && (supportedPerformancePoints = decoderInfosSoftMatch.get(i).capabilities.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException unused) {
            }
            return true;
        }

        private static int evaluatePerformancePointCoverage(java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }
}

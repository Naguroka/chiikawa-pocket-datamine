package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public interface SubtitleParser {

    public interface Factory {
        public static final androidx.media3.extractor.text.SubtitleParser.Factory UNSUPPORTED = new androidx.media3.extractor.text.SubtitleParser.Factory() { // from class: androidx.media3.extractor.text.SubtitleParser.Factory.1
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(androidx.media3.common.Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(androidx.media3.common.Format format) {
                return false;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format) {
                throw new java.lang.IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        };

        androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format);

        int getCueReplacementBehavior(androidx.media3.common.Format format);

        boolean supportsFormat(androidx.media3.common.Format format);
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer);

    default void reset() {
    }

    public static class OutputOptions {
        private static final androidx.media3.extractor.text.SubtitleParser.OutputOptions ALL = new androidx.media3.extractor.text.SubtitleParser.OutputOptions(androidx.media3.common.C.TIME_UNSET, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        private OutputOptions(long j, boolean z) {
            this.startTimeUs = j;
            this.outputAllCues = z;
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions allCues() {
            return ALL;
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions onlyCuesAfter(long j) {
            return new androidx.media3.extractor.text.SubtitleParser.OutputOptions(j, false);
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions cuesAfterThenRemainingCuesBefore(long j) {
            return new androidx.media3.extractor.text.SubtitleParser.OutputOptions(j, true);
        }
    }

    default void parse(byte[] bArr, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    default androidx.media3.extractor.text.Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        final com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions = androidx.media3.extractor.text.SubtitleParser.OutputOptions.ALL;
        java.util.Objects.requireNonNull(builder);
        parse(bArr, i, i2, outputOptions, new androidx.media3.common.util.Consumer() { // from class: androidx.media3.extractor.text.SubtitleParser$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                builder.add((androidx.media3.extractor.text.CuesWithTiming) obj);
            }
        });
        return new androidx.media3.extractor.text.CuesWithTimingSubtitle(builder.build());
    }
}

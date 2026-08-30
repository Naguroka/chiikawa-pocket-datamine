package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public class LegacySubtitleUtil {
    private LegacySubtitleUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    public static void toCuesWithTiming(androidx.media3.extractor.text.Subtitle subtitle, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        boolean z;
        if (subtitle.getEventTimeCount() == 0) {
            return;
        }
        int startIndex = getStartIndex(subtitle, outputOptions);
        if (outputOptions.startTimeUs != androidx.media3.common.C.TIME_UNSET) {
            java.util.List<androidx.media3.common.text.Cue> cues = subtitle.getCues(outputOptions.startTimeUs);
            long eventTime = subtitle.getEventTime(startIndex);
            if (cues.isEmpty() || startIndex >= subtitle.getEventTimeCount() || outputOptions.startTimeUs >= eventTime) {
                z = false;
            } else {
                consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(cues, outputOptions.startTimeUs, eventTime - outputOptions.startTimeUs));
                z = true;
            }
        } else {
            z = false;
        }
        for (int i = startIndex; i < subtitle.getEventTimeCount(); i++) {
            outputSubtitleEvent(subtitle, i, consumer);
        }
        if (outputOptions.outputAllCues) {
            if (z) {
                startIndex--;
            }
            for (int i2 = 0; i2 < startIndex; i2++) {
                outputSubtitleEvent(subtitle, i2, consumer);
            }
            if (z) {
                consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
            }
        }
    }

    private static int getStartIndex(androidx.media3.extractor.text.Subtitle subtitle, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions) {
        if (outputOptions.startTimeUs == androidx.media3.common.C.TIME_UNSET) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(outputOptions.startTimeUs);
        if (nextEventTimeIndex == -1) {
            return subtitle.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || subtitle.getEventTime(nextEventTimeIndex + (-1)) != outputOptions.startTimeUs) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    private static void outputSubtitleEvent(androidx.media3.extractor.text.Subtitle subtitle, int i, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i);
        java.util.List<androidx.media3.common.text.Cue> cues = subtitle.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == subtitle.getEventTimeCount() - 1) {
            throw new java.lang.IllegalStateException();
        }
        long eventTime2 = subtitle.getEventTime(i + 1) - subtitle.getEventTime(i);
        if (eventTime2 > 0) {
            consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(cues, eventTime, eventTime2));
        }
    }
}

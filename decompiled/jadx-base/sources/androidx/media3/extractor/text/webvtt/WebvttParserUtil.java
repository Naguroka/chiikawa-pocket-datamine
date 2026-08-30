package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttParserUtil {
    private static final java.util.regex.Pattern COMMENT = java.util.regex.Pattern.compile("^NOTE([ \t].*)?$");
    private static final java.lang.String WEBVTT_HEADER = "WEBVTT";

    private WebvttParserUtil() {
    }

    public static void validateWebvttHeaderLine(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        int position = parsableByteArray.getPosition();
        if (isWebvttHeaderLine(parsableByteArray)) {
            return;
        }
        parsableByteArray.setPosition(position);
        throw androidx.media3.common.ParserException.createForMalformedContainer("Expected WEBVTT. Got " + parsableByteArray.readLine(), null);
    }

    public static boolean isWebvttHeaderLine(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String line = parsableByteArray.readLine();
        return line != null && line.startsWith(WEBVTT_HEADER);
    }

    public static long parseTimestampUs(java.lang.String str) throws java.lang.NumberFormatException {
        java.lang.String[] strArrSplitAtFirst = androidx.media3.common.util.Util.splitAtFirst(str, "\\.");
        long j = 0;
        for (java.lang.String str2 : androidx.media3.common.util.Util.split(strArrSplitAtFirst[0], ":")) {
            j = (j * 60) + java.lang.Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j2 += java.lang.Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j2 * 1000;
    }

    public static float parsePercentage(java.lang.String str) throws java.lang.NumberFormatException {
        if (!str.endsWith("%")) {
            throw new java.lang.NumberFormatException("Percentages must end with %");
        }
        return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static java.util.regex.Matcher findNextCueHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String line;
        while (true) {
            java.lang.String line2 = parsableByteArray.readLine();
            if (line2 == null) {
                return null;
            }
            if (COMMENT.matcher(line2).matches()) {
                do {
                    line = parsableByteArray.readLine();
                    if (line == null) {
                        break;
                    }
                } while (!line.isEmpty());
            } else {
                java.util.regex.Matcher matcher = androidx.media3.extractor.text.webvtt.WebvttCueParser.CUE_HEADER_PATTERN.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}

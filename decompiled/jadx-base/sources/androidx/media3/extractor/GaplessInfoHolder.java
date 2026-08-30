package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class GaplessInfoHolder {
    private static final java.util.regex.Pattern GAPLESS_COMMENT_PATTERN = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    private static final java.lang.String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final java.lang.String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay = -1;
    public int encoderPadding = -1;

    public boolean setFromMetadata(androidx.media3.common.Metadata metadata) {
        for (int i = 0; i < metadata.length(); i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.extractor.metadata.id3.CommentFrame) {
                androidx.media3.extractor.metadata.id3.CommentFrame commentFrame = (androidx.media3.extractor.metadata.id3.CommentFrame) entry;
                if (GAPLESS_DESCRIPTION.equals(commentFrame.description) && setFromComment(commentFrame.text)) {
                    return true;
                }
            } else if (entry instanceof androidx.media3.extractor.metadata.id3.InternalFrame) {
                androidx.media3.extractor.metadata.id3.InternalFrame internalFrame = (androidx.media3.extractor.metadata.id3.InternalFrame) entry;
                if (GAPLESS_DOMAIN.equals(internalFrame.domain) && GAPLESS_DESCRIPTION.equals(internalFrame.description) && setFromComment(internalFrame.text)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean setFromComment(java.lang.String str) {
        java.util.regex.Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(1)), 16);
            int i2 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.encoderDelay = i;
            this.encoderPadding = i2;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }
}

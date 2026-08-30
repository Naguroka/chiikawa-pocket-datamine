package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final java.util.regex.Pattern WHITESPACE_PATTERN = java.util.regex.Pattern.compile("\\s+");
    private static final com.google.common.collect.ImmutableSet<java.lang.String> SINGLE_STYLE_VALUES = com.google.common.collect.ImmutableSet.of("auto", "none");
    private static final com.google.common.collect.ImmutableSet<java.lang.String> MARK_SHAPE_VALUES = com.google.common.collect.ImmutableSet.of(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final com.google.common.collect.ImmutableSet<java.lang.String> MARK_FILL_VALUES = com.google.common.collect.ImmutableSet.of(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final com.google.common.collect.ImmutableSet<java.lang.String> POSITION_VALUES = com.google.common.collect.ImmutableSet.of(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public static androidx.media3.extractor.text.ttml.TextEmphasis parse(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(com.google.common.collect.ImmutableSet.copyOf(android.text.TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    private static androidx.media3.extractor.text.ttml.TextEmphasis parseWords(com.google.common.collect.ImmutableSet<java.lang.String> immutableSet) {
        byte b;
        int i;
        byte b2;
        java.lang.String str = (java.lang.String) com.google.common.collect.Iterables.getFirst(com.google.common.collect.Sets.intersection(POSITION_VALUES, immutableSet), androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode = str.hashCode();
        int i2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                if (iHashCode == 92734940 && str.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b = 2;
        } else {
            b = -1;
        }
        if (b != 0) {
            i = b != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        com.google.common.collect.Sets.SetView setViewIntersection = com.google.common.collect.Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        if (!setViewIntersection.isEmpty()) {
            java.lang.String str2 = (java.lang.String) setViewIntersection.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3005871) {
                if (iHashCode2 == 3387192 && str2.equals("none")) {
                    b4 = 0;
                } else {
                    b4 = -1;
                }
            } else if (!str2.equals("auto")) {
                b4 = -1;
            }
            return new androidx.media3.extractor.text.ttml.TextEmphasis(b4 == 0 ? 0 : -1, 0, i);
        }
        com.google.common.collect.Sets.SetView setViewIntersection2 = com.google.common.collect.Sets.intersection(MARK_FILL_VALUES, immutableSet);
        com.google.common.collect.Sets.SetView setViewIntersection3 = com.google.common.collect.Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
            return new androidx.media3.extractor.text.ttml.TextEmphasis(-1, 0, i);
        }
        java.lang.String str3 = (java.lang.String) com.google.common.collect.Iterables.getFirst(setViewIntersection2, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 != -1274499742) {
            if (iHashCode3 == 3417674 && str3.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (str3.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED)) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        int i3 = b2 != 0 ? 1 : 2;
        java.lang.String str4 = (java.lang.String) com.google.common.collect.Iterables.getFirst(setViewIntersection3, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 != 99657 || !str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                    b3 = -1;
                }
            } else if (str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                b3 = 1;
            } else {
                b3 = -1;
            }
        } else if (str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
            b3 = 2;
        } else {
            b3 = -1;
        }
        if (b3 != 0) {
            i2 = b3 != 1 ? 1 : 3;
        }
        return new androidx.media3.extractor.text.ttml.TextEmphasis(i2, i3, i);
    }
}

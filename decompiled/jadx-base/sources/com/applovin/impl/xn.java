package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class xn {
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("\\s+");
    private static final com.applovin.impl.hb e = com.applovin.impl.hb.a("auto", "none");
    private static final com.applovin.impl.hb f = com.applovin.impl.hb.a(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final com.applovin.impl.hb g = com.applovin.impl.hb.a(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final com.applovin.impl.hb h = com.applovin.impl.hb.a(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1514a;
    public final int b;
    public final int c;

    private xn(int i, int i2, int i3) {
        this.f1514a = i;
        this.b = i2;
        this.c = i3;
    }

    public static com.applovin.impl.xn a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a(com.applovin.impl.hb.a((java.lang.Object[]) android.text.TextUtils.split(lowerCase, d)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0107  */
    private static com.applovin.impl.xn a(com.applovin.impl.hb hbVar) {
        byte b;
        int i;
        int i2;
        java.lang.String str;
        int iHashCode;
        java.lang.String str2 = (java.lang.String) com.applovin.impl.vb.a(com.applovin.impl.rj.a((java.util.Set) h, (java.util.Set) hbVar), androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode2 = str2.hashCode();
        byte b2 = 0;
        int i3 = 2;
        int i4 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b = 2;
        } else {
            b = -1;
        }
        if (b != 0) {
            i = b != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        com.applovin.impl.rj.c cVarA = com.applovin.impl.rj.a((java.util.Set) e, (java.util.Set) hbVar);
        if (!cVarA.isEmpty()) {
            java.lang.String str3 = (java.lang.String) cVarA.iterator().next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i4 = 0;
            }
            return new com.applovin.impl.xn(i4, 0, i);
        }
        com.applovin.impl.rj.c cVarA2 = com.applovin.impl.rj.a((java.util.Set) g, (java.util.Set) hbVar);
        com.applovin.impl.rj.c cVarA3 = com.applovin.impl.rj.a((java.util.Set) f, (java.util.Set) hbVar);
        if (cVarA2.isEmpty() && cVarA3.isEmpty()) {
            return new com.applovin.impl.xn(-1, 0, i);
        }
        java.lang.String str4 = (java.lang.String) com.applovin.impl.vb.a(cVarA2, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 == -1274499742) {
            str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        } else {
            if (iHashCode4 == 3417674 && str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                i2 = 2;
            }
            str = (java.lang.String) com.applovin.impl.vb.a(cVarA3, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        b2 = -1;
                    }
                } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
            }
            return new com.applovin.impl.xn(i3, i2, i);
        }
        i2 = 1;
        str = (java.lang.String) com.applovin.impl.vb.a(cVarA3, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b2 = -1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                i3 = 1;
            } else {
                i3 = 3;
            }
        }
        return new com.applovin.impl.xn(i3, i2, i);
    }
}

package androidx.media3.extractor.text.ssa;

/* JADX INFO: loaded from: classes.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final java.lang.String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final java.lang.String name;
    public final java.lang.Integer outlineColor;
    public final java.lang.Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    private static boolean isValidAlignment(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i) {
        return i == 1 || i == 3;
    }

    private SsaStyle(java.lang.String str, int i, java.lang.Integer num, java.lang.Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.name = str;
        this.alignment = i;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f;
        this.bold = z;
        this.italic = z2;
        this.underline = z3;
        this.strikeout = z4;
        this.borderStyle = i2;
    }

    public static androidx.media3.extractor.text.ssa.SsaStyle fromStyleLine(java.lang.String str, androidx.media3.extractor.text.ssa.SsaStyle.Format format) {
        androidx.media3.common.util.Assertions.checkArgument(str.startsWith("Style:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(6), ",");
        if (strArrSplit.length != format.length) {
            androidx.media3.common.util.Log.w(TAG, androidx.media3.common.util.Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", java.lang.Integer.valueOf(format.length), java.lang.Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            return new androidx.media3.extractor.text.ssa.SsaStyle(strArrSplit[format.nameIndex].trim(), format.alignmentIndex != -1 ? parseAlignment(strArrSplit[format.alignmentIndex].trim()) : -1, format.primaryColorIndex != -1 ? parseColor(strArrSplit[format.primaryColorIndex].trim()) : null, format.outlineColorIndex != -1 ? parseColor(strArrSplit[format.outlineColorIndex].trim()) : null, format.fontSizeIndex != -1 ? parseFontSize(strArrSplit[format.fontSizeIndex].trim()) : -3.4028235E38f, format.boldIndex != -1 && parseBooleanValue(strArrSplit[format.boldIndex].trim()), format.italicIndex != -1 && parseBooleanValue(strArrSplit[format.italicIndex].trim()), format.underlineIndex != -1 && parseBooleanValue(strArrSplit[format.underlineIndex].trim()), format.strikeoutIndex != -1 && parseBooleanValue(strArrSplit[format.strikeoutIndex].trim()), format.borderStyleIndex != -1 ? parseBorderStyle(strArrSplit[format.borderStyleIndex].trim()) : -1);
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str.trim());
            if (isValidAlignment(i)) {
                return i;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        androidx.media3.common.util.Log.w(TAG, "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static int parseBorderStyle(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str.trim());
            if (isValidBorderStyle(i)) {
                return i;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        androidx.media3.common.util.Log.w(TAG, "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static java.lang.Integer parseColor(java.lang.String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = java.lang.Long.parseLong(str.substring(2), 16);
            } else {
                j = java.lang.Long.parseLong(str);
            }
            androidx.media3.common.util.Assertions.checkArgument(j <= androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(com.google.common.primitives.Ints.checkedCast(((j >> 24) & 255) ^ 255), com.google.common.primitives.Ints.checkedCast(j & 255), com.google.common.primitives.Ints.checkedCast((j >> 8) & 255), com.google.common.primitives.Ints.checkedCast((j >> 16) & 255)));
        } catch (java.lang.IllegalArgumentException e) {
            androidx.media3.common.util.Log.w(TAG, "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float parseFontSize(java.lang.String str) {
        try {
            return java.lang.Float.parseFloat(str);
        } catch (java.lang.NumberFormatException e) {
            androidx.media3.common.util.Log.w(TAG, "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean parseBooleanValue(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (java.lang.NumberFormatException e) {
            androidx.media3.common.util.Log.w(TAG, "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.nameIndex = i;
            this.alignmentIndex = i2;
            this.primaryColorIndex = i3;
            this.outlineColorIndex = i4;
            this.fontSizeIndex = i5;
            this.boldIndex = i6;
            this.italicIndex = i7;
            this.underlineIndex = i8;
            this.strikeoutIndex = i9;
            this.borderStyleIndex = i10;
            this.length = i11;
        }

        public static androidx.media3.extractor.text.ssa.SsaStyle.Format fromFormatLine(java.lang.String str) {
            java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(strArrSplit[i11].trim());
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "italic":
                        i7 = i11;
                        break;
                    case "underline":
                        i8 = i11;
                        break;
                    case "strikeout":
                        i9 = i11;
                        break;
                    case "primarycolour":
                        i3 = i11;
                        break;
                    case "bold":
                        i6 = i11;
                        break;
                    case "name":
                        i = i11;
                        break;
                    case "fontsize":
                        i5 = i11;
                        break;
                    case "borderstyle":
                        i10 = i11;
                        break;
                    case "alignment":
                        i2 = i11;
                        break;
                    case "outlinecolour":
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new androidx.media3.extractor.text.ssa.SsaStyle.Format(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    static final class Overrides {
        private static final java.lang.String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final android.graphics.PointF position;
        private static final java.util.regex.Pattern BRACES_PATTERN = java.util.regex.Pattern.compile("\\{([^}]*)\\}");
        private static final java.lang.String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final java.util.regex.Pattern POSITION_PATTERN = java.util.regex.Pattern.compile(androidx.media3.common.util.Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final java.util.regex.Pattern MOVE_PATTERN = java.util.regex.Pattern.compile(androidx.media3.common.util.Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final java.util.regex.Pattern ALIGNMENT_OVERRIDE_PATTERN = java.util.regex.Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i, android.graphics.PointF pointF) {
            this.alignment = i;
            this.position = pointF;
        }

        public static androidx.media3.extractor.text.ssa.SsaStyle.Overrides parseFromDialogue(java.lang.String str) {
            java.util.regex.Matcher matcher = BRACES_PATTERN.matcher(str);
            android.graphics.PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                java.lang.String str2 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1));
                try {
                    android.graphics.PointF position = parsePosition(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (java.lang.RuntimeException unused) {
                }
                try {
                    int alignmentOverride = parseAlignmentOverride(str2);
                    if (alignmentOverride != -1) {
                        i = alignmentOverride;
                    }
                } catch (java.lang.RuntimeException unused2) {
                }
            }
            return new androidx.media3.extractor.text.ssa.SsaStyle.Overrides(i, pointF);
        }

        public static java.lang.String stripStyleOverrides(java.lang.String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }

        private static android.graphics.PointF parsePosition(java.lang.String str) {
            java.lang.String strGroup;
            java.lang.String strGroup2;
            java.util.regex.Matcher matcher = POSITION_PATTERN.matcher(str);
            java.util.regex.Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    androidx.media3.common.util.Log.i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new android.graphics.PointF(java.lang.Float.parseFloat(((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(strGroup)).trim()), java.lang.Float.parseFloat(((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(strGroup2)).trim()));
        }

        private static int parseAlignmentOverride(java.lang.String str) {
            java.util.regex.Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return androidx.media3.extractor.text.ssa.SsaStyle.parseAlignment((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }
    }
}

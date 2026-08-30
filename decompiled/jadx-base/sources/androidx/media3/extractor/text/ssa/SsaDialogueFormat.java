package androidx.media3.extractor.text.ssa;

/* JADX INFO: loaded from: classes.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i, int i2, int i3, int i4, int i5) {
        this.startTimeIndex = i;
        this.endTimeIndex = i2;
        this.styleIndex = i3;
        this.textIndex = i4;
        this.length = i5;
    }

    public static androidx.media3.extractor.text.ssa.SsaDialogueFormat fromFormatLine(java.lang.String str) {
        androidx.media3.common.util.Assertions.checkArgument(str.startsWith("Format:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(strArrSplit[i5].trim());
            lowerCase.hashCode();
            switch (lowerCase) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new androidx.media3.extractor.text.ssa.SsaDialogueFormat(i, i2, i3, i4, strArrSplit.length);
    }
}

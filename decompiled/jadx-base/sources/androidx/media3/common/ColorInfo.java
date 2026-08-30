package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class ColorInfo {
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;
    public static final androidx.media3.common.ColorInfo SDR_BT709_LIMITED = new androidx.media3.common.ColorInfo.Builder().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();
    public static final androidx.media3.common.ColorInfo SRGB_BT709_FULL = new androidx.media3.common.ColorInfo.Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    private static final java.lang.String FIELD_COLOR_SPACE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_COLOR_RANGE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_COLOR_TRANSFER = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_HDR_STATIC_INFO = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_LUMA_BITDEPTH = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_CHROMA_BITDEPTH = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    @org.checkerframework.dataflow.qual.Pure
    public static int isoColorPrimariesToColorSpace(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static final class Builder {
        private int chromaBitdepth;
        private int colorRange;
        private int colorSpace;
        private int colorTransfer;
        private byte[] hdrStaticInfo;
        private int lumaBitdepth;

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
            this.lumaBitdepth = -1;
            this.chromaBitdepth = -1;
        }

        private Builder(androidx.media3.common.ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
            this.lumaBitdepth = colorInfo.lumaBitdepth;
            this.chromaBitdepth = colorInfo.chromaBitdepth;
        }

        public androidx.media3.common.ColorInfo.Builder setColorSpace(int i) {
            this.colorSpace = i;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setColorRange(int i) {
            this.colorRange = i;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setColorTransfer(int i) {
            this.colorTransfer = i;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setHdrStaticInfo(byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setLumaBitdepth(int i) {
            this.lumaBitdepth = i;
            return this;
        }

        public androidx.media3.common.ColorInfo.Builder setChromaBitdepth(int i) {
            this.chromaBitdepth = i;
            return this;
        }

        public androidx.media3.common.ColorInfo build() {
            return new androidx.media3.common.ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo, this.lumaBitdepth, this.chromaBitdepth);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEquivalentToAssumedSdrDefault(androidx.media3.common.ColorInfo colorInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        if (colorInfo == null) {
            return true;
        }
        int i5 = colorInfo.colorSpace;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = colorInfo.colorRange) == -1 || i == 2) && (((i2 = colorInfo.colorTransfer) == -1 || i2 == 3) && colorInfo.hdrStaticInfo == null && (((i3 = colorInfo.chromaBitdepth) == -1 || i3 == 8) && ((i4 = colorInfo.lumaBitdepth) == -1 || i4 == 8)));
    }

    public static boolean isTransferHdr(androidx.media3.common.ColorInfo colorInfo) {
        int i;
        return colorInfo != null && ((i = colorInfo.colorTransfer) == 7 || i == 6);
    }

    private ColorInfo(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i4;
        this.chromaBitdepth = i5;
    }

    public androidx.media3.common.ColorInfo.Builder buildUpon() {
        return new androidx.media3.common.ColorInfo.Builder();
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public boolean isBitdepthValid() {
        return (this.lumaBitdepth == -1 || this.chromaBitdepth == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public java.lang.String toLogString() {
        return (isDataSpaceValid() ? androidx.media3.common.util.Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer)) : "NA/NA/NA") + "/" + (isBitdepthValid() ? this.lumaBitdepth + "/" + this.chromaBitdepth : "NA/NA");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.ColorInfo colorInfo = (androidx.media3.common.ColorInfo) obj;
        return this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && java.util.Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + java.util.Arrays.hashCode(this.hdrStaticInfo)) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.hashCode;
    }

    public java.lang.String toString() {
        return "ColorInfo(" + colorSpaceToString(this.colorSpace) + ", " + colorRangeToString(this.colorRange) + ", " + colorTransferToString(this.colorTransfer) + ", " + (this.hdrStaticInfo != null) + ", " + lumaBitdepthToString(this.lumaBitdepth) + ", " + chromaBitdepthToString(this.chromaBitdepth) + ")";
    }

    private static java.lang.String lumaBitdepthToString(int i) {
        return i != -1 ? i + "bit Luma" : "NA";
    }

    private static java.lang.String chromaBitdepthToString(int i) {
        return i != -1 ? i + "bit Chroma" : "NA";
    }

    private static java.lang.String colorSpaceToString(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? "Undefined color space " + i : "BT601";
        }
        return "BT709";
    }

    private static java.lang.String colorTransferToString(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? "Undefined color transfer " + i : "HLG";
        }
        return "ST2084 PQ";
    }

    private static java.lang.String colorRangeToString(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? "Undefined color range " + i : "Limited range";
        }
        return "Full range";
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_COLOR_SPACE, this.colorSpace);
        bundle.putInt(FIELD_COLOR_RANGE, this.colorRange);
        bundle.putInt(FIELD_COLOR_TRANSFER, this.colorTransfer);
        bundle.putByteArray(FIELD_HDR_STATIC_INFO, this.hdrStaticInfo);
        bundle.putInt(FIELD_LUMA_BITDEPTH, this.lumaBitdepth);
        bundle.putInt(FIELD_CHROMA_BITDEPTH, this.chromaBitdepth);
        return bundle;
    }

    public static androidx.media3.common.ColorInfo fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.ColorInfo(bundle.getInt(FIELD_COLOR_SPACE, -1), bundle.getInt(FIELD_COLOR_RANGE, -1), bundle.getInt(FIELD_COLOR_TRANSFER, -1), bundle.getByteArray(FIELD_HDR_STATIC_INFO), bundle.getInt(FIELD_LUMA_BITDEPTH, -1), bundle.getInt(FIELD_CHROMA_BITDEPTH, -1));
    }
}

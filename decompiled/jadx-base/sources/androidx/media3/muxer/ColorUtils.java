package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class ColorUtils {
    private static final short MATRIX_BT2020 = 9;
    private static final short MATRIX_BT2020_CONSTANT = 10;
    private static final short MATRIX_BT470_6_M = 4;
    private static final short MATRIX_BT601_6 = 6;
    private static final short MATRIX_BT709_5 = 1;
    private static final short MATRIX_SMPTE240_M = 7;
    private static final short MATRIX_UNSPECIFIED = 2;
    public static final com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Short>> MEDIAFORMAT_STANDARD_TO_PRIMARIES_AND_MATRIX = com.google.common.collect.ImmutableList.of(com.google.common.collect.ImmutableList.of((short) 2, (short) 2), com.google.common.collect.ImmutableList.of((short) 1, (short) 1), com.google.common.collect.ImmutableList.of((short) 5, (short) 6), com.google.common.collect.ImmutableList.of((short) 5, (short) 1), com.google.common.collect.ImmutableList.of((short) 6, (short) 6), com.google.common.collect.ImmutableList.of((short) 6, (short) 7), com.google.common.collect.ImmutableList.of((short) 9, (short) 9), com.google.common.collect.ImmutableList.of((short) 9, (short) 10), com.google.common.collect.ImmutableList.of((short) 4, (short) 4), com.google.common.collect.ImmutableList.of((short) 8, (short) 9));
    public static final com.google.common.collect.ImmutableList<java.lang.Short> MEDIAFORMAT_TRANSFER_TO_MP4_TRANSFER = com.google.common.collect.ImmutableList.of((short) 2, (short) 8, (short) 13, (short) 1, (short) 4, (short) 5, (short) 16, (short) 18);
    private static final short PRIMARIES_BT2020 = 9;
    private static final short PRIMARIES_BT470_6_M = 4;
    private static final short PRIMARIES_BT601_6_525 = 6;
    private static final short PRIMARIES_BT601_6_625 = 5;
    private static final short PRIMARIES_BT709_5 = 1;
    private static final short PRIMARIES_GENERIC_FILM = 8;
    private static final short PRIMARIES_UNSPECIFIED = 2;
    private static final short TRANSFER_BT1361 = 12;
    private static final short TRANSFER_GAMMA22 = 4;
    private static final short TRANSFER_GAMMA28 = 5;
    private static final short TRANSFER_HLG = 18;
    private static final short TRANSFER_LINEAR = 8;
    private static final short TRANSFER_OTHER = 9;
    private static final short TRANSFER_SMPTE170_M = 1;
    private static final short TRANSFER_SMPTE240_M = 7;
    private static final short TRANSFER_SRGB = 13;
    private static final short TRANSFER_ST2084 = 16;
    private static final short TRANSFER_ST428 = 17;
    private static final short TRANSFER_UNSPECIFIED = 2;
    private static final short TRANSFER_XV_YCC = 11;

    private ColorUtils() {
    }
}

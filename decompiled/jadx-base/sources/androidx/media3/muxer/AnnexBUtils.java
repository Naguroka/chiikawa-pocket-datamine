package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class AnnexBUtils {
    private static final int THREE_BYTE_NAL_START_CODE_SIZE = 3;

    private AnnexBUtils() {
    }

    public static com.google.common.collect.ImmutableList<java.nio.ByteBuffer> findNalUnits(java.nio.ByteBuffer byteBuffer) {
        int i;
        boolean z;
        if (byteBuffer.remaining() == 0) {
            return com.google.common.collect.ImmutableList.of();
        }
        int iLimit = byteBuffer.limit();
        int i2 = 0;
        while (true) {
            if (i2 >= iLimit) {
                i = -1;
                z = false;
                break;
            }
            if (isThreeByteNalStartCode(byteBuffer, i2)) {
                i = i2 + 3;
                z = true;
                break;
            }
            if (byteBuffer.get(i2) != 0) {
                throw new java.lang.IllegalStateException("Sample does not start with a NAL unit");
            }
            i2++;
        }
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        boolean z2 = z;
        int i3 = i;
        while (i < iLimit) {
            if (z2) {
                if (isThreeByteNalStartCode(byteBuffer, i)) {
                    builder.add(getBytes(byteBuffer, i3, i - i3));
                    i3 = i + 3;
                    i = i3;
                } else {
                    if (isThreeBytesZeroSequence(byteBuffer, i)) {
                        builder.add(getBytes(byteBuffer, i3, i - i3));
                        i++;
                        z2 = false;
                    } else {
                        i++;
                    }
                    if (i != iLimit && z2) {
                        builder.add(getBytes(byteBuffer, i3, i - i3));
                    }
                }
            } else {
                if (isThreeByteNalStartCode(byteBuffer, i)) {
                    i += 3;
                    i3 = i;
                    z2 = true;
                } else {
                    if (byteBuffer.get(i) != 0) {
                        throw new java.lang.IllegalStateException("Invalid NAL units");
                    }
                    i++;
                }
                if (i != iLimit) {
                }
            }
        }
        byteBuffer.rewind();
        return builder.build();
    }

    public static java.nio.ByteBuffer stripEmulationPrevention(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.limit());
        int i = 0;
        for (int i2 = 0; i2 < byteBuffer.limit(); i2++) {
            if (!(byteBuffer.get(i2) == 3 && i >= 2)) {
                byteBufferAllocate.put(byteBuffer.get(i2));
            }
            i = byteBuffer.get(i2) == 0 ? i + 1 : 0;
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static boolean doesSampleContainAnnexBNalUnits(java.lang.String str) {
        return str.equals("video/avc") || str.equals("video/hevc");
    }

    private static boolean isThreeByteNalStartCode(java.nio.ByteBuffer byteBuffer, int i) {
        return i < byteBuffer.limit() + (-3) && byteBuffer.get(i) == 0 && byteBuffer.get(i + 1) == 0 && byteBuffer.get(i + 2) == 1;
    }

    private static boolean isThreeBytesZeroSequence(java.nio.ByteBuffer byteBuffer, int i) {
        return i < byteBuffer.limit() + (-3) && byteBuffer.get(i) == 0 && byteBuffer.get(i + 1) == 0 && byteBuffer.get(i + 2) == 0;
    }

    private static java.nio.ByteBuffer getBytes(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        return byteBufferDuplicate.slice();
    }
}

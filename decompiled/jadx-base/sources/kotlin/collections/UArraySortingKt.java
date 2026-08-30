package kotlin.collections;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", androidx.media3.extractor.text.ttml.TtmlNode.LEFT, androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m1758partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM1378getw2LRezQ = kotlin.UByteArray.m1378getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM1378getw2LRezQ & 255;
                if (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m1378getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.m1378getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM1378getw2LRezQ2 = kotlin.UByteArray.m1378getw2LRezQ(bArr, i);
                kotlin.UByteArray.m1383setVurrAj0(bArr, i, kotlin.UByteArray.m1378getw2LRezQ(bArr, i2));
                kotlin.UByteArray.m1383setVurrAj0(bArr, i2, bM1378getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m1762quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM1758partition4UcCI2c = m1758partition4UcCI2c(bArr, i, i2);
        int i3 = iM1758partition4UcCI2c - 1;
        if (i < i3) {
            m1762quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM1758partition4UcCI2c < i2) {
            m1762quickSort4UcCI2c(bArr, iM1758partition4UcCI2c, i2);
        }
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m1759partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM1641getMh2AYeg = kotlin.UShortArray.m1641getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM1641getMh2AYeg = kotlin.UShortArray.m1641getMh2AYeg(sArr, i) & kotlin.UShort.MAX_VALUE;
                i3 = sM1641getMh2AYeg & kotlin.UShort.MAX_VALUE;
                if (kotlin.jvm.internal.Intrinsics.compare(iM1641getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UShortArray.m1641getMh2AYeg(sArr, i2) & kotlin.UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM1641getMh2AYeg2 = kotlin.UShortArray.m1641getMh2AYeg(sArr, i);
                kotlin.UShortArray.m1646set01HTLdE(sArr, i, kotlin.UShortArray.m1641getMh2AYeg(sArr, i2));
                kotlin.UShortArray.m1646set01HTLdE(sArr, i2, sM1641getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m1763quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM1759partitionAa5vz7o = m1759partitionAa5vz7o(sArr, i, i2);
        int i3 = iM1759partitionAa5vz7o - 1;
        if (i < i3) {
            m1763quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM1759partitionAa5vz7o < i2) {
            m1763quickSortAa5vz7o(sArr, iM1759partitionAa5vz7o, i2);
        }
    }

    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m1760partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM1457getpVg5ArA = kotlin.UIntArray.m1457getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (java.lang.Integer.compare(kotlin.UIntArray.m1457getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, iM1457getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (java.lang.Integer.compare(kotlin.UIntArray.m1457getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, iM1457getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM1457getpVg5ArA2 = kotlin.UIntArray.m1457getpVg5ArA(iArr, i);
                kotlin.UIntArray.m1462setVXSXFK8(iArr, i, kotlin.UIntArray.m1457getpVg5ArA(iArr, i2));
                kotlin.UIntArray.m1462setVXSXFK8(iArr, i2, iM1457getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m1764quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM1760partitionoBK06Vg = m1760partitionoBK06Vg(iArr, i, i2);
        int i3 = iM1760partitionoBK06Vg - 1;
        if (i < i3) {
            m1764quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM1760partitionoBK06Vg < i2) {
            m1764quickSortoBK06Vg(iArr, iM1760partitionoBK06Vg, i2);
        }
    }

    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m1757partitionnroSd4(long[] jArr, int i, int i2) {
        long jM1536getsVKNKU = kotlin.ULongArray.m1536getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (java.lang.Long.compare(kotlin.ULongArray.m1536getsVKNKU(jArr, i) ^ Long.MIN_VALUE, jM1536getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (java.lang.Long.compare(kotlin.ULongArray.m1536getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, jM1536getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM1536getsVKNKU2 = kotlin.ULongArray.m1536getsVKNKU(jArr, i);
                kotlin.ULongArray.m1541setk8EXiF4(jArr, i, kotlin.ULongArray.m1536getsVKNKU(jArr, i2));
                kotlin.ULongArray.m1541setk8EXiF4(jArr, i2, jM1536getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m1761quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM1757partitionnroSd4 = m1757partitionnroSd4(jArr, i, i2);
        int i3 = iM1757partitionnroSd4 - 1;
        if (i < i3) {
            m1761quickSortnroSd4(jArr, i, i3);
        }
        if (iM1757partitionnroSd4 < i2) {
            m1761quickSortnroSd4(jArr, iM1757partitionnroSd4, i2);
        }
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m1766sortArray4UcCI2c(byte[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1762quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m1767sortArrayAa5vz7o(short[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1763quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m1768sortArrayoBK06Vg(int[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1764quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m1765sortArraynroSd4(long[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m1761quickSortnroSd4(array, i, i2 - 1);
    }
}

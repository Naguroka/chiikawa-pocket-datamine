package kotlin.internal;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m2509differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iM = kotlin.UByte$$ExternalSyntheticBackport0.m(i, i3);
        int iM2 = kotlin.UByte$$ExternalSyntheticBackport0.m(i2, i3);
        int iCompare = java.lang.Integer.compare(iM ^ Integer.MIN_VALUE, iM2 ^ Integer.MIN_VALUE);
        int iM1397constructorimpl = kotlin.UInt.m1397constructorimpl(iM - iM2);
        return iCompare >= 0 ? iM1397constructorimpl : kotlin.UInt.m1397constructorimpl(iM1397constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m2510differenceModulosambcqE(long j, long j2, long j3) {
        long jM1370m = kotlin.UByte$$ExternalSyntheticBackport0.m1370m(j, j3);
        long jM1370m2 = kotlin.UByte$$ExternalSyntheticBackport0.m1370m(j2, j3);
        int iCompare = java.lang.Long.compare(jM1370m ^ Long.MIN_VALUE, jM1370m2 ^ Long.MIN_VALUE);
        long jM1476constructorimpl = kotlin.ULong.m1476constructorimpl(jM1370m - jM1370m2);
        return iCompare >= 0 ? jM1476constructorimpl : kotlin.ULong.m1476constructorimpl(jM1476constructorimpl + j3);
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m2512getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return java.lang.Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) >= 0 ? i2 : kotlin.UInt.m1397constructorimpl(i2 - m2509differenceModuloWZ9TVnA(i2, i, kotlin.UInt.m1397constructorimpl(i3)));
        }
        if (i3 < 0) {
            return java.lang.Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) <= 0 ? i2 : kotlin.UInt.m1397constructorimpl(i2 + m2509differenceModuloWZ9TVnA(i, i2, kotlin.UInt.m1397constructorimpl(-i3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m2511getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : kotlin.ULong.m1476constructorimpl(j2 - m2510differenceModulosambcqE(j2, j, kotlin.ULong.m1476constructorimpl(j3)));
        }
        if (j3 < 0) {
            return java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : kotlin.ULong.m1476constructorimpl(j2 + m2510differenceModulosambcqE(j, j2, kotlin.ULong.m1476constructorimpl(-j3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }
}

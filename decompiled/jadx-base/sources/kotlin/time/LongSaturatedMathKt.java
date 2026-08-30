package kotlin.time;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongSaturatedMathKt {
    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m2757saturatingAddNuflL3o(long j, kotlin.time.DurationUnit unit, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        long jM2674toLongimpl = kotlin.time.Duration.m2674toLongimpl(j2, unit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m2756checkInfiniteSumDefinedPjuGub4(j, j2, jM2674toLongimpl);
        }
        if ((1 | (jM2674toLongimpl - 1)) == Long.MAX_VALUE) {
            return m2758saturatingAddInHalvesNuflL3o(j, unit, j2);
        }
        long j3 = j + jM2674toLongimpl;
        if (((j ^ j3) & (jM2674toLongimpl ^ j3)) < 0) {
            return j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m2756checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!kotlin.time.Duration.m2660isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException("Summing infinities of different signs");
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m2758saturatingAddInHalvesNuflL3o(long j, kotlin.time.DurationUnit durationUnit, long j2) {
        long jM2631divUwyO8pc = kotlin.time.Duration.m2631divUwyO8pc(j2, 2);
        long jM2674toLongimpl = kotlin.time.Duration.m2674toLongimpl(jM2631divUwyO8pc, durationUnit);
        return ((1 | (jM2674toLongimpl - 1)) > Long.MAX_VALUE ? 1 : ((1 | (jM2674toLongimpl - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? jM2674toLongimpl : m2757saturatingAddNuflL3o(m2757saturatingAddNuflL3o(j, durationUnit, jM2631divUwyO8pc), durationUnit, kotlin.time.Duration.m2663minusLRDsOJo(j2, jM2631divUwyO8pc));
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? kotlin.time.Duration.INSTANCE.m2730getNEG_INFINITEUwyO8pc$kotlin_stdlib() : kotlin.time.Duration.INSTANCE.m2729getINFINITEUwyO8pc();
    }

    public static final long saturatingDiff(long j, long j2, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return kotlin.time.Duration.m2681unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    public static final long saturatingOriginsDiff(long j, long j2, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return kotlin.time.Duration.INSTANCE.m2731getZEROUwyO8pc();
            }
            return kotlin.time.Duration.m2681unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return infinityOfSign(j);
        }
        return saturatingFiniteDiff(j, j2, unit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, kotlin.time.DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            if (durationUnit.compareTo(kotlin.time.DurationUnit.MILLISECONDS) < 0) {
                long jConvertDurationUnit = kotlin.time.DurationUnitKt.convertDurationUnit(1L, kotlin.time.DurationUnit.MILLISECONDS, durationUnit);
                long j4 = (j / jConvertDurationUnit) - (j2 / jConvertDurationUnit);
                long j5 = (j % jConvertDurationUnit) - (j2 % jConvertDurationUnit);
                kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                return kotlin.time.Duration.m2664plusLRDsOJo(kotlin.time.DurationKt.toDuration(j4, kotlin.time.DurationUnit.MILLISECONDS), kotlin.time.DurationKt.toDuration(j5, durationUnit));
            }
            return kotlin.time.Duration.m2681unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        return kotlin.time.DurationKt.toDuration(j3, durationUnit);
    }
}

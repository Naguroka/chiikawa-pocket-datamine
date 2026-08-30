package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", "", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractLongTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    private final kotlin.time.DurationUnit unit;

    /* JADX INFO: renamed from: zero$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy zero;

    protected abstract long read();

    public AbstractLongTimeSource(kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Long>() { // from class: kotlin.time.AbstractLongTimeSource$zero$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Long invoke() {
                return java.lang.Long.valueOf(this.this$0.read());
            }
        });
    }

    protected final kotlin.time.DurationUnit getUnit() {
        return this.unit;
    }

    private final long getZero() {
        return ((java.lang.Number) this.zero.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    /* JADX INFO: compiled from: TimeSources.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class LongTimeMark implements kotlin.time.ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final kotlin.time.AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j, kotlin.time.AbstractLongTimeSource abstractLongTimeSource, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        private LongTimeMark(long j, kotlin.time.AbstractLongTimeSource timeSource, long j2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j;
            this.timeSource = timeSource;
            this.offset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo2619minusLRDsOJo(long j) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.m2623minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo2618elapsedNowUwyO8pc() {
            return kotlin.time.Duration.m2663minusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo2621plusLRDsOJo(long duration) {
            kotlin.time.DurationUnit unit = this.timeSource.getUnit();
            if (kotlin.time.Duration.m2660isInfiniteimpl(duration)) {
                return new kotlin.time.AbstractLongTimeSource.LongTimeMark(kotlin.time.LongSaturatedMathKt.m2757saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, kotlin.time.Duration.INSTANCE.m2731getZEROUwyO8pc(), null);
            }
            long jM2680truncateToUwyO8pc$kotlin_stdlib = kotlin.time.Duration.m2680truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long jM2664plusLRDsOJo = kotlin.time.Duration.m2664plusLRDsOJo(kotlin.time.Duration.m2663minusLRDsOJo(duration, jM2680truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long jM2757saturatingAddNuflL3o = kotlin.time.LongSaturatedMathKt.m2757saturatingAddNuflL3o(this.startedAt, unit, jM2680truncateToUwyO8pc$kotlin_stdlib);
            long jM2680truncateToUwyO8pc$kotlin_stdlib2 = kotlin.time.Duration.m2680truncateToUwyO8pc$kotlin_stdlib(jM2664plusLRDsOJo, unit);
            long jM2757saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m2757saturatingAddNuflL3o(jM2757saturatingAddNuflL3o, unit, jM2680truncateToUwyO8pc$kotlin_stdlib2);
            long jM2663minusLRDsOJo = kotlin.time.Duration.m2663minusLRDsOJo(jM2664plusLRDsOJo, jM2680truncateToUwyO8pc$kotlin_stdlib2);
            long jM2648getInWholeNanosecondsimpl = kotlin.time.Duration.m2648getInWholeNanosecondsimpl(jM2663minusLRDsOJo);
            if (jM2757saturatingAddNuflL3o2 != 0 && jM2648getInWholeNanosecondsimpl != 0 && (jM2757saturatingAddNuflL3o2 ^ jM2648getInWholeNanosecondsimpl) < 0) {
                long duration2 = kotlin.time.DurationKt.toDuration(kotlin.math.MathKt.getSign(jM2648getInWholeNanosecondsimpl), unit);
                jM2757saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m2757saturatingAddNuflL3o(jM2757saturatingAddNuflL3o2, unit, duration2);
                jM2663minusLRDsOJo = kotlin.time.Duration.m2663minusLRDsOJo(jM2663minusLRDsOJo, duration2);
            }
            if ((1 | (jM2757saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                jM2663minusLRDsOJo = kotlin.time.Duration.INSTANCE.m2731getZEROUwyO8pc();
            }
            return new kotlin.time.AbstractLongTimeSource.LongTimeMark(jM2757saturatingAddNuflL3o2, this.timeSource, jM2663minusLRDsOJo, null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo2620minusUwyO8pc(kotlin.time.ComparableTimeMark other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) {
                kotlin.time.AbstractLongTimeSource.LongTimeMark longTimeMark = (kotlin.time.AbstractLongTimeSource.LongTimeMark) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return kotlin.time.Duration.m2664plusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), kotlin.time.Duration.m2663minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new java.lang.IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(java.lang.Object other) {
            return (other instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeSource, ((kotlin.time.AbstractLongTimeSource.LongTimeMark) other).timeSource) && kotlin.time.Duration.m2633equalsimpl0(mo2620minusUwyO8pc((kotlin.time.ComparableTimeMark) other), kotlin.time.Duration.INSTANCE.m2731getZEROUwyO8pc());
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (kotlin.time.Duration.m2656hashCodeimpl(this.offset) * 37) + java.lang.Long.hashCode(this.startedAt);
        }

        public java.lang.String toString() {
            return "LongTimeMark(" + this.startedAt + kotlin.time.DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((java.lang.Object) kotlin.time.Duration.m2677toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }
    }

    @Override // kotlin.time.TimeSource
    public kotlin.time.ComparableTimeMark markNow() {
        return new kotlin.time.AbstractLongTimeSource.LongTimeMark(adjustedRead(), this, kotlin.time.Duration.INSTANCE.m2731getZEROUwyO8pc(), null);
    }
}

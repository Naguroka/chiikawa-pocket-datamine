package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TestTimeSource extends kotlin.time.AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(kotlin.time.DurationUnit.NANOSECONDS);
        markNow();
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* JADX INFO: renamed from: read, reason: from getter */
    protected long getReading() {
        return this.reading;
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m2764plusAssignLRDsOJo(long duration) {
        long jM2674toLongimpl = kotlin.time.Duration.m2674toLongimpl(duration, getUnit());
        if (!(((jM2674toLongimpl - 1) | 1) == Long.MAX_VALUE)) {
            long j = this.reading;
            long j2 = j + jM2674toLongimpl;
            if ((jM2674toLongimpl ^ j) >= 0 && (j ^ j2) < 0) {
                m2763overflowLRDsOJo(duration);
            }
            this.reading = j2;
            return;
        }
        long jM2631divUwyO8pc = kotlin.time.Duration.m2631divUwyO8pc(duration, 2);
        if (!((1 | (kotlin.time.Duration.m2674toLongimpl(jM2631divUwyO8pc, getUnit()) - 1)) == Long.MAX_VALUE)) {
            long j3 = this.reading;
            try {
                m2764plusAssignLRDsOJo(jM2631divUwyO8pc);
                m2764plusAssignLRDsOJo(kotlin.time.Duration.m2663minusLRDsOJo(duration, jM2631divUwyO8pc));
                return;
            } catch (java.lang.IllegalStateException e) {
                this.reading = j3;
                throw e;
            }
        }
        m2763overflowLRDsOJo(duration);
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m2763overflowLRDsOJo(long duration) {
        throw new java.lang.IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + kotlin.time.DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((java.lang.Object) kotlin.time.Duration.m2677toStringimpl(duration)) + '.');
    }
}

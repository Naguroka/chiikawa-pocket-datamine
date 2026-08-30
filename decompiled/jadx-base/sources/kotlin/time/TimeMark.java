package kotlin.time;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TimeMark {
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo2618elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* JADX INFO: renamed from: minus-LRDsOJo */
    kotlin.time.TimeMark mo2619minusLRDsOJo(long duration);

    /* JADX INFO: renamed from: plus-LRDsOJo */
    kotlin.time.TimeMark mo2621plusLRDsOJo(long duration);

    /* JADX INFO: compiled from: TimeSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m2766plusLRDsOJo(kotlin.time.TimeMark timeMark, long j) {
            return new kotlin.time.AdjustedTimeMark(timeMark, j, null);
        }

        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static kotlin.time.TimeMark m2765minusLRDsOJo(kotlin.time.TimeMark timeMark, long j) {
            return timeMark.mo2621plusLRDsOJo(kotlin.time.Duration.m2681unaryMinusUwyO8pc(j));
        }

        public static boolean hasPassedNow(kotlin.time.TimeMark timeMark) {
            return !kotlin.time.Duration.m2661isNegativeimpl(timeMark.mo2618elapsedNowUwyO8pc());
        }

        public static boolean hasNotPassedNow(kotlin.time.TimeMark timeMark) {
            return kotlin.time.Duration.m2661isNegativeimpl(timeMark.mo2618elapsedNowUwyO8pc());
        }
    }
}

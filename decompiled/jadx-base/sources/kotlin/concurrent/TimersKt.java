package kotlin.concurrent;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001aM\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a'\u0010\u0011\u001a\u00020\f2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", "time", "delay", "scheduleAtFixedRate", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TimersKt {
    private static final java.util.TimerTask schedule(java.util.Timer timer, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt.AnonymousClass1 anonymousClass1 = new kotlin.concurrent.TimersKt.AnonymousClass1(action);
        timer.schedule(anonymousClass1, j);
        return anonymousClass1;
    }

    private static final java.util.TimerTask schedule(java.util.Timer timer, java.util.Date time, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt.AnonymousClass1 anonymousClass1 = new kotlin.concurrent.TimersKt.AnonymousClass1(action);
        timer.schedule(anonymousClass1, time);
        return anonymousClass1;
    }

    private static final java.util.TimerTask schedule(java.util.Timer timer, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt.AnonymousClass1 anonymousClass1 = new kotlin.concurrent.TimersKt.AnonymousClass1(action);
        timer.schedule(anonymousClass1, j, j2);
        return anonymousClass1;
    }

    private static final java.util.TimerTask schedule(java.util.Timer timer, java.util.Date time, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt.AnonymousClass1 anonymousClass1 = new kotlin.concurrent.TimersKt.AnonymousClass1(action);
        timer.schedule(anonymousClass1, time, j);
        return anonymousClass1;
    }

    private static final java.util.TimerTask scheduleAtFixedRate(java.util.Timer timer, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt.AnonymousClass1 anonymousClass1 = new kotlin.concurrent.TimersKt.AnonymousClass1(action);
        timer.scheduleAtFixedRate(anonymousClass1, j, j2);
        return anonymousClass1;
    }

    private static final java.util.TimerTask scheduleAtFixedRate(java.util.Timer timer, java.util.Date time, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.concurrent.TimersKt.AnonymousClass1 anonymousClass1 = new kotlin.concurrent.TimersKt.AnonymousClass1(action);
        timer.scheduleAtFixedRate(anonymousClass1, time, j);
        return anonymousClass1;
    }

    public static final java.util.Timer timer(java.lang.String str, boolean z) {
        return str == null ? new java.util.Timer(z) : new java.util.Timer(str, z);
    }

    static /* synthetic */ java.util.Timer timer$default(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt.AnonymousClass1(action), j, j2);
        return timer;
    }

    private static final java.util.Timer timer(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt.AnonymousClass1(action), j, j2);
        return timer;
    }

    static /* synthetic */ java.util.Timer timer$default(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt.AnonymousClass1(action), startAt, j);
        return timer;
    }

    private static final java.util.Timer timer(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.schedule(new kotlin.concurrent.TimersKt.AnonymousClass1(action), startAt, j);
        return timer;
    }

    static /* synthetic */ java.util.Timer fixedRateTimer$default(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt.AnonymousClass1(action), j, j2);
        return timer;
    }

    private static final java.util.Timer fixedRateTimer(java.lang.String str, boolean z, long j, long j2, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt.AnonymousClass1(action), j, j2);
        return timer;
    }

    static /* synthetic */ java.util.Timer fixedRateTimer$default(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt.AnonymousClass1(action), startAt, j);
        return timer;
    }

    private static final java.util.Timer fixedRateTimer(java.lang.String str, boolean z, java.util.Date startAt, long j, kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startAt, "startAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.util.Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new kotlin.concurrent.TimersKt.AnonymousClass1(action), startAt, j);
        return timer;
    }

    /* JADX INFO: renamed from: kotlin.concurrent.TimersKt$timerTask$1, reason: invalid class name */
    /* JADX INFO: compiled from: Timer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass1 extends java.util.TimerTask {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.util.TimerTask, kotlin.Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> function1) {
            this.$action = function1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.$action.invoke(this);
        }
    }

    private static final java.util.TimerTask timerTask(kotlin.jvm.functions.Function1<? super java.util.TimerTask, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return new kotlin.concurrent.TimersKt.AnonymousClass1(action);
    }
}

package kotlinx.coroutines.time;

/* JADX INFO: compiled from: Time.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001aU\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\r\u001aJ\u0010\u000e\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0003H\u0002\u001a&\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0007\u001aD\u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00150\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a&\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0003H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"delay", "", "duration", "Ljava/time/Duration;", "(Ljava/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/time/Duration;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "coerceToMillis", "", "debounce", "Lkotlinx/coroutines/flow/Flow;", "timeout", "onTimeout", "R", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlin/Function1;", "(Lkotlinx/coroutines/selects/SelectBuilder;Ljava/time/Duration;Lkotlin/jvm/functions/Function1;)V", "sample", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TimeKt {
    public static final java.lang.Object delay(java.time.Duration duration, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objDelay = kotlinx.coroutines.DelayKt.delay(coerceToMillis(duration), continuation);
        return objDelay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : kotlin.Unit.INSTANCE;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, java.time.Duration duration) {
        return kotlinx.coroutines.flow.FlowKt.debounce(flow, coerceToMillis(duration));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> flow, java.time.Duration duration) {
        return kotlinx.coroutines.flow.FlowKt.sample(flow, coerceToMillis(duration));
    }

    public static final <R> void onTimeout(kotlinx.coroutines.selects.SelectBuilder<? super R> selectBuilder, java.time.Duration duration, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1) {
        kotlinx.coroutines.selects.OnTimeoutKt.onTimeout(selectBuilder, coerceToMillis(duration), function1);
    }

    public static final <T> java.lang.Object withTimeout(java.time.Duration duration, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeout(coerceToMillis(duration), function2, continuation);
    }

    public static final <T> java.lang.Object withTimeoutOrNull(java.time.Duration duration, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(coerceToMillis(duration), function2, continuation);
    }

    private static final long coerceToMillis(java.time.Duration duration) {
        if (duration.compareTo(java.time.Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(java.time.temporal.ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }
}

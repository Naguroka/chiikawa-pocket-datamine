package kotlinx.coroutines.stream;

/* JADX INFO: compiled from: Stream.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, d2 = {"consumeAsFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Ljava/util/stream/Stream;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StreamKt {
    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(java.util.stream.Stream<T> stream) {
        return new kotlinx.coroutines.stream.StreamFlow(stream);
    }
}

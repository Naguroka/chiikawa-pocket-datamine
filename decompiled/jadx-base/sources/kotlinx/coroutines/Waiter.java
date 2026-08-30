package kotlinx.coroutines;

/* JADX INFO: compiled from: Waiter.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/Waiter;", "", "invokeOnCancellation", "", com.json.y3.i, "Lkotlinx/coroutines/internal/Segment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Waiter {
    void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index);
}

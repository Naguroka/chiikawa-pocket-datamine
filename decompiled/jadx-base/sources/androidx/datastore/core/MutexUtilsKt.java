package androidx.datastore.core;

/* JADX INFO: compiled from: MutexUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aH\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00010\u0006H\u0081\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"withTryLock", "R", "Lkotlinx/coroutines/sync/Mutex;", "owner", "", "block", "Lkotlin/Function1;", "", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MutexUtilsKt {
    public static /* synthetic */ java.lang.Object withTryLock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function1 block, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        boolean zTryLock = mutex.tryLock(obj);
        try {
            return block.invoke(java.lang.Boolean.valueOf(zTryLock));
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (zTryLock) {
                mutex.unlock(obj);
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withTryLock(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends R> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        boolean zTryLock = mutex.tryLock(obj);
        try {
            return block.invoke(java.lang.Boolean.valueOf(zTryLock));
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (zTryLock) {
                mutex.unlock(obj);
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}

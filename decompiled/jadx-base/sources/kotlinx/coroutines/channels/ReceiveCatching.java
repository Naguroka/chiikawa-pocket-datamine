package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001c\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0001R\u001f\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveCatching;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlinx/coroutines/channels/ChannelResult;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invokeOnCancellation", "", com.json.y3.i, "Lkotlinx/coroutines/internal/Segment;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ReceiveCatching<E> implements kotlinx.coroutines.Waiter {
    public final kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> cont;

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
        this.cont.invokeOnCancellation(segment, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveCatching(kotlinx.coroutines.CancellableContinuationImpl<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> cancellableContinuationImpl) {
        this.cont = cancellableContinuationImpl;
    }
}

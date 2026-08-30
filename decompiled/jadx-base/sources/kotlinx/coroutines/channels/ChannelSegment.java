package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ)\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001fJ\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b$J\"\u0010%\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010*\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0015J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b-\u0010\"J\u001a\u0010.\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0002J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b1J\u001f\u00102\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004R\u0014\u0010\u0011\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/ChannelSegment;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/internal/Segment;", "id", "", "prev", "channel", "Lkotlinx/coroutines/channels/BufferedChannel;", "pointers", "", "(JLkotlinx/coroutines/channels/ChannelSegment;Lkotlinx/coroutines/channels/BufferedChannel;I)V", "_channel", "getChannel", "()Lkotlinx/coroutines/channels/BufferedChannel;", "data", "Lkotlinx/atomicfu/AtomicArray;", "", "numberOfSlots", "getNumberOfSlots", "()I", "casState", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "casState$kotlinx_coroutines_core", "cleanElement", "", "cleanElement$kotlinx_coroutines_core", "getAndSetState", "update", "getAndSetState$kotlinx_coroutines_core", "getElement", "getElement$kotlinx_coroutines_core", "(I)Ljava/lang/Object;", "getState", "getState$kotlinx_coroutines_core", "onCancellation", "cause", "", "context", "Lkotlin/coroutines/CoroutineContext;", "onCancelledRequest", "receiver", "retrieveElement", "retrieveElement$kotlinx_coroutines_core", "setElementLazy", "value", "setState", "setState$kotlinx_coroutines_core", "storeElement", "element", "storeElement$kotlinx_coroutines_core", "(ILjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChannelSegment<E> extends kotlinx.coroutines.internal.Segment<kotlinx.coroutines.channels.ChannelSegment<E>> {
    private final kotlinx.coroutines.channels.BufferedChannel<E> _channel;
    private final java.util.concurrent.atomic.AtomicReferenceArray data;

    public ChannelSegment(long j, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, int i) {
        super(j, channelSegment, i);
        this._channel = bufferedChannel;
        this.data = new java.util.concurrent.atomic.AtomicReferenceArray(kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    public final kotlinx.coroutines.channels.BufferedChannel<E> getChannel() {
        kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = this._channel;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel);
        return bufferedChannel;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
    }

    public final void storeElement$kotlinx_coroutines_core(int index, E element) {
        setElementLazy(index, element);
    }

    public final E getElement$kotlinx_coroutines_core(int index) {
        return (E) this.data.get(index * 2);
    }

    public final E retrieveElement$kotlinx_coroutines_core(int index) {
        E element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(index);
        cleanElement$kotlinx_coroutines_core(index);
        return element$kotlinx_coroutines_core;
    }

    public final void cleanElement$kotlinx_coroutines_core(int index) {
        setElementLazy(index, null);
    }

    private final void setElementLazy(int index, java.lang.Object value) {
        this.data.lazySet(index * 2, value);
    }

    public final java.lang.Object getState$kotlinx_coroutines_core(int index) {
        return this.data.get((index * 2) + 1);
    }

    public final void setState$kotlinx_coroutines_core(int index, java.lang.Object value) {
        this.data.set((index * 2) + 1, value);
    }

    public final boolean casState$kotlinx_coroutines_core(int index, java.lang.Object from, java.lang.Object to) {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.data, (index * 2) + 1, from, to);
    }

    public final java.lang.Object getAndSetState$kotlinx_coroutines_core(int index, java.lang.Object update) {
        return this.data.getAndSet((index * 2) + 1, update);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int index, java.lang.Throwable cause, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1;
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function2;
        boolean z = index >= kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
        if (z) {
            index -= kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
        }
        E element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(index);
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core(index);
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB)) {
                if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV) {
                    break;
                }
                if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB && state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV) {
                    if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV && state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED && state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                        throw new java.lang.IllegalStateException(("unexpected state: " + state$kotlinx_coroutines_core).toString());
                    }
                    return;
                }
            } else {
                if (casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, z ? kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND : kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV)) {
                    cleanElement$kotlinx_coroutines_core(index);
                    onCancelledRequest(index, !z);
                    if (!z || (function1 = getChannel().onUndeliveredElement) == null) {
                        return;
                    }
                    kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, element$kotlinx_coroutines_core, context);
                    return;
                }
            }
        }
        cleanElement$kotlinx_coroutines_core(index);
        if (!z || (function2 = getChannel().onUndeliveredElement) == null) {
            return;
        }
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function2, element$kotlinx_coroutines_core, context);
    }

    public final void onCancelledRequest(int index, boolean receiver) {
        if (receiver) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.id * ((long) kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE)) + ((long) index));
        }
        onSlotCleaned();
    }
}

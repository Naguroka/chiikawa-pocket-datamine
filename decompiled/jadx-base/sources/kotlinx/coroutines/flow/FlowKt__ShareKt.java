package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\b\f\u001aM\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u001cH\u0002¢\u0006\u0002\b\u001d\u001aS\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012-\u0010\u001f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0002\b$ø\u0001\u0000¢\u0006\u0002\u0010%\u001a6\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a/\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)\u001a9\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002¢\u0006\u0002\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"asSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "T", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "asStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "configureSharing", "Lkotlinx/coroutines/flow/SharingConfig;", "Lkotlinx/coroutines/flow/Flow;", "replay", "", "configureSharing$FlowKt__ShareKt", "launchSharing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "upstream", "shared", com.ironsource.y8.h.d0, "Lkotlinx/coroutines/flow/SharingStarted;", "initialValue", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "launchSharingDeferred", "", "result", "Lkotlinx/coroutines/CompletableDeferred;", "launchSharingDeferred$FlowKt__ShareKt", "onSubscription", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/SharedFlow;", "shareIn", "scope", "stateIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ShareKt {
    public static /* synthetic */ kotlinx.coroutines.flow.SharedFlow shareIn$default(kotlinx.coroutines.flow.Flow flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.SharingStarted sharingStarted, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlinx.coroutines.flow.FlowKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> shareIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.SharingStarted sharingStarted, int i) {
        kotlinx.coroutines.flow.SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i);
        kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(i, sharingConfigConfigureSharing$FlowKt__ShareKt.extraBufferCapacity, sharingConfigConfigureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new kotlinx.coroutines.flow.ReadonlySharedFlow(MutableSharedFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, sharingStarted, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    private static final <T> kotlinx.coroutines.flow.SharingConfig<T> configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow<? extends T> flow, int i) {
        kotlinx.coroutines.flow.internal.ChannelFlow channelFlow;
        kotlinx.coroutines.flow.Flow<T> flowDropChannelOperators;
        int i2 = 1;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(i >= 0)) {
                throw new java.lang.AssertionError();
            }
        }
        int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i, kotlinx.coroutines.channels.Channel.INSTANCE.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()) - i;
        if ((flow instanceof kotlinx.coroutines.flow.internal.ChannelFlow) && (flowDropChannelOperators = (channelFlow = (kotlinx.coroutines.flow.internal.ChannelFlow) flow).dropChannelOperators()) != null) {
            int i3 = channelFlow.capacity;
            if (i3 == -3 || i3 == -2 || i3 == 0) {
                if (channelFlow.onBufferOverflow == kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
                    if (channelFlow.capacity == 0) {
                        i2 = 0;
                    } else {
                        i2 = iCoerceAtLeast;
                    }
                } else if (i != 0) {
                    i2 = 0;
                }
            } else {
                i2 = channelFlow.capacity;
            }
            return new kotlinx.coroutines.flow.SharingConfig<>(flowDropChannelOperators, i2, channelFlow.onBufferOverflow, channelFlow.context);
        }
        return new kotlinx.coroutines.flow.SharingConfig<>(flow, iCoerceAtLeast, kotlinx.coroutines.channels.BufferOverflow.SUSPEND, kotlin.coroutines.EmptyCoroutineContext.INSTANCE);
    }

    private static final <T> kotlinx.coroutines.Job launchSharing$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.MutableSharedFlow<T> mutableSharedFlow, kotlinx.coroutines.flow.SharingStarted sharingStarted, T t) {
        return kotlinx.coroutines.BuildersKt.launch(coroutineScope, coroutineContext, kotlin.jvm.internal.Intrinsics.areEqual(sharingStarted, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly()) ? kotlinx.coroutines.CoroutineStart.DEFAULT : kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, t, null));
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> stateIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.SharingStarted sharingStarted, T t) {
        kotlinx.coroutines.flow.SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        kotlinx.coroutines.flow.MutableStateFlow MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(t);
        return new kotlinx.coroutines.flow.ReadonlyStateFlow(MutableStateFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, sharingStarted, t));
    }

    public static final <T> java.lang.Object stateIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlow<? extends T>> continuation) {
        kotlinx.coroutines.flow.SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        kotlinx.coroutines.CompletableDeferred completableDeferredCompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        launchSharingDeferred$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, completableDeferredCompletableDeferred$default);
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> completableDeferred) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, null), 2, null);
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> asSharedFlow(kotlinx.coroutines.flow.MutableSharedFlow<T> mutableSharedFlow) {
        return new kotlinx.coroutines.flow.ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final <T> kotlinx.coroutines.flow.StateFlow<T> asStateFlow(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow) {
        return new kotlinx.coroutines.flow.ReadonlyStateFlow(mutableStateFlow, null);
    }

    public static final <T> kotlinx.coroutines.flow.SharedFlow<T> onSubscription(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.SubscribedSharedFlow(sharedFlow, function2);
    }
}

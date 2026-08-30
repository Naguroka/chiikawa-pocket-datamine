package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: OperativeEventRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "", "()V", "_operativeEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getOperativeEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "addOperativeEvent", "", "operativeEventRequest", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OperativeEventRepository {
    private final kotlinx.coroutines.flow.MutableSharedFlow<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> _operativeEvents;
    private final kotlinx.coroutines.flow.SharedFlow<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> operativeEvents;

    public OperativeEventRepository() {
        kotlinx.coroutines.flow.MutableSharedFlow<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(10, 10, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        this._operativeEvents = MutableSharedFlow;
        this.operativeEvents = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final kotlinx.coroutines.flow.SharedFlow<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest> getOperativeEvents() {
        return this.operativeEvents;
    }

    public final void addOperativeEvent(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.tryEmit(operativeEventRequest);
    }
}

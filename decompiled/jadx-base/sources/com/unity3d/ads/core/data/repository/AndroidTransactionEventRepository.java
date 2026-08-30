package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidTransactionEventRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidTransactionEventRepository;", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "()V", "_transactionEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getTransactionEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "addTransactionEvent", "", "transactionEventRequest", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTransactionEventRepository implements com.unity3d.ads.core.data.repository.TransactionEventRepository {
    private final kotlinx.coroutines.flow.MutableSharedFlow<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> _transactionEvents;
    private final kotlinx.coroutines.flow.SharedFlow<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> transactionEvents;

    public AndroidTransactionEventRepository() {
        kotlinx.coroutines.flow.MutableSharedFlow<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(10, 10, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        this._transactionEvents = MutableSharedFlow;
        this.transactionEvents = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public kotlinx.coroutines.flow.SharedFlow<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents() {
        return this.transactionEvents;
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.tryEmit(transactionEventRequest);
    }
}

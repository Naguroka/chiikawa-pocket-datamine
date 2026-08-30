package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: TransactionEventRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "", "transactionEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "getTransactionEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "addTransactionEvent", "", "transactionEventRequest", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TransactionEventRepository {
    void addTransactionEvent(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    kotlinx.coroutines.flow.SharedFlow<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> getTransactionEvents();
}

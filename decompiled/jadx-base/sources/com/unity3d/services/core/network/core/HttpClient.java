package com.unity3d.services.core.network.core;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/unity3d/services/core/network/core/HttpClient;", "", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "(Lcom/unity3d/services/core/network/model/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HttpClient {
    java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation);

    com.unity3d.services.core.network.model.HttpResponse executeBlocking(com.unity3d.services.core.network.model.HttpRequest request) throws java.lang.Exception;
}

package com.unity3d.ads.network;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/network/HttpClient;", "", "execute", "Lcom/unity3d/ads/network/model/HttpResponse;", "request", "Lcom/unity3d/ads/network/model/HttpRequest;", "(Lcom/unity3d/ads/network/model/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HttpClient {
    java.lang.Object execute(com.unity3d.ads.network.model.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.unity3d.ads.network.model.HttpResponse> continuation);
}

package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AdRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AdRepository;", "", "addAd", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAd", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasOpportunityId", "", "removeAd", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AdRepository {
    java.lang.Object addAd(com.google.protobuf.ByteString byteString, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getAd(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.AdObject> continuation);

    java.lang.Object hasOpportunityId(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object removeAd(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}

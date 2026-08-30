package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: Show.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦\u0002J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/Show;", "", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "context", "Landroid/content/Context;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "terminate", "", "(Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Show {
    kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> invoke(android.content.Context context, com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.UnityAdsShowOptions showOptions);

    java.lang.Object terminate(com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}

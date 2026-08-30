package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: AdPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 82\u00020\u0001:\u00018J\u0011\u0010\u0017\u001a\u00020\u0018H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0018H&J\u0019\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0002\u0010!J)\u0010\"\u001a\u00020\u00182\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$H¦@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0011\u0010&\u001a\u00020\u0018H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H¦@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020)H¦@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u0010-\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010.\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020)H¦@ø\u0001\u0000¢\u0006\u0002\u0010*J\u0019\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203H¦@ø\u0001\u0000¢\u0006\u0002\u00104J\u0010\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u000207H\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer;", "", "onLoadEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "updateCampaignState", "Lkotlin/Pair;", "", "", "getUpdateCampaignState", "webViewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "destroy", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "onAllowedPiiChange", "value", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBroadcastEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestShow", "unityAdsShowOptions", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "sendFocusChange", "isFocused", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMuteChange", "isMuted", "sendPrivacyFsmChange", "sendUserConsentChange", "sendVisibilityChange", com.json.pg.k, "sendVolumeChange", "volume", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.json.j5.v, "showOptions", "Lcom/unity3d/ads/adplayer/ShowOptions;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AdPlayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.adplayer.AdPlayer.Companion INSTANCE = com.unity3d.ads.adplayer.AdPlayer.Companion.$$INSTANCE;

    java.lang.Object destroy(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void dispatchShowCompleted();

    kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> getOnLoadEvent();

    kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.ShowEvent> getOnShowEvent();

    kotlinx.coroutines.CoroutineScope getScope();

    kotlinx.coroutines.flow.Flow<kotlin.Pair<byte[], java.lang.Integer>> getUpdateCampaignState();

    com.unity3d.ads.adplayer.WebViewContainer getWebViewContainer();

    java.lang.Object onAllowedPiiChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object onBroadcastEvent(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object requestShow(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object sendActivityDestroyed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object sendFocusChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object sendMuteChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object sendPrivacyFsmChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object sendUserConsentChange(byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object sendVisibilityChange(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object sendVolumeChange(double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void show(com.unity3d.ads.adplayer.ShowOptions showOptions);

    /* JADX INFO: compiled from: AdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void show(com.unity3d.ads.adplayer.AdPlayer adPlayer, com.unity3d.ads.adplayer.ShowOptions showOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            throw new kotlin.NotImplementedError(null, 1, null);
        }

        public static java.lang.Object destroy(com.unity3d.ads.adplayer.AdPlayer adPlayer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(adPlayer.getScope(), null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AdPlayer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer$Companion;", "", "()V", "broadcastEventChannel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getBroadcastEventChannel", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.unity3d.ads.adplayer.AdPlayer.Companion $$INSTANCE = new com.unity3d.ads.adplayer.AdPlayer.Companion();
        private static final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> broadcastEventChannel = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

        private Companion() {
        }

        public final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }
}

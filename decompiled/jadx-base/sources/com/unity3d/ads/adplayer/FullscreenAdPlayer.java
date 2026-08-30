package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: FullscreenAdPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FullscreenAdPlayer extends com.unity3d.ads.adplayer.AdPlayer {

    /* JADX INFO: compiled from: FullscreenAdPlayer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object destroy(com.unity3d.ads.adplayer.FullscreenAdPlayer fullscreenAdPlayer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object objDestroy = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, continuation);
            return objDestroy == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDestroy : kotlin.Unit.INSTANCE;
        }

        public static void show(com.unity3d.ads.adplayer.FullscreenAdPlayer fullscreenAdPlayer, com.unity3d.ads.adplayer.ShowOptions showOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}

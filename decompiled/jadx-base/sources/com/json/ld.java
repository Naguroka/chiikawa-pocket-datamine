package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/ld;", "", "", "loadAd", "Lcom/ironsource/g1;", "c", "Landroid/app/Activity;", "activity", "", com.json.op.d, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "onAdInfoChanged", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface ld {
    default void a() {
    }

    void a(android.app.Activity activity, java.lang.String placementName);

    com.unity3d.mediation.LevelPlayAdInfo b();

    com.json.g1 c();

    void loadAd();

    default void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}

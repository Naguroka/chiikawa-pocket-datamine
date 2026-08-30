package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007R0\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u000bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/n1;", "", "", "adUnitId", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "providers", "", "limit", "Lcom/ironsource/p2;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "adUnitPerformance", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.HashMap<java.lang.String, com.json.p2> adUnitPerformance = new java.util.HashMap<>();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ironsource/n1$a;", "", "<init>", "(Ljava/lang/String;I)V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "e", "f", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final com.json.p2 a(java.lang.String adUnitId, java.util.List<? extends com.json.mediationsdk.model.NetworkSettings> providers, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providers, "providers");
        com.json.p2 p2Var = this.adUnitPerformance.get(adUnitId);
        if (p2Var != null) {
            return p2Var;
        }
        com.json.p2 p2Var2 = new com.json.p2(providers, limit);
        this.adUnitPerformance.put(adUnitId, p2Var2);
        return p2Var2;
    }
}

package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/to;", "", "Lcom/ironsource/y;", com.json.j5.p, "", com.json.op.d, "Lcom/ironsource/lk;", "publisherDataHolder", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "waterfallInstances", "winnerInstance", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface to {
    default void a(com.json.y instance, java.lang.String placementName, com.json.lk publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    default void a(java.util.List<? extends com.json.y> waterfallInstances, com.json.y winnerInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
    }
}

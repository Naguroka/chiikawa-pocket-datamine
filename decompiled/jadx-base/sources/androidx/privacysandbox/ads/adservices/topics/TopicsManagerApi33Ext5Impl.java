package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: TopicsManagerApi33Ext5Impl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0010¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi33Ext5Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "convertRequest", "Landroid/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "convertRequest$ads_adservices_release", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicsManagerApi33Ext5Impl extends androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext5Impl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService((java.lang.Class<java.lang.Object>) android.adservices.topics.TopicsManager.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super((android.adservices.topics.TopicsManager) systemService);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper.INSTANCE.convertRequestWithRecordObservation$ads_adservices_release(request);
    }
}

package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: TopicsManagerApi33Ext4Impl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicsManagerApi33Ext4Impl extends androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext4Impl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService((java.lang.Class<java.lang.Object>) android.adservices.topics.TopicsManager.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super((android.adservices.topics.TopicsManager) systemService);
    }
}

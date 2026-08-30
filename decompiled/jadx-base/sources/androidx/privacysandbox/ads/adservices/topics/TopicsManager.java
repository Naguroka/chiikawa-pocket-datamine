package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: TopicsManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "", "()V", "getTopics", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TopicsManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.topics.TopicsManager.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.topics.TopicsManager.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.topics.TopicsManager obtain(android.content.Context context) {
        return INSTANCE.obtain(context);
    }

    public abstract java.lang.Object getTopics(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest getTopicsRequest, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> continuation);

    /* JADX INFO: compiled from: TopicsManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManager$Companion;", "", "()V", "obtain", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "context", "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.topics.TopicsManager obtain(final android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 11) {
                return new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext11Impl(context);
            }
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 5) {
                return new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext5Impl(context);
            }
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() == 4) {
                return new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext4Impl(context);
            }
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 11) {
                return (androidx.privacysandbox.ads.adservices.topics.TopicsManager) androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE.getManager(context, "TopicsManager", new kotlin.jvm.functions.Function1<android.content.Context, androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi31Ext11Impl>() { // from class: androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi31Ext11Impl invoke(android.content.Context it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi31Ext11Impl(context);
                    }
                });
            }
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
                return (androidx.privacysandbox.ads.adservices.topics.TopicsManager) androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE.getManager(context, "TopicsManager", new kotlin.jvm.functions.Function1<android.content.Context, androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi31Ext9Impl invoke(android.content.Context it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi31Ext9Impl(context);
                    }
                });
            }
            return null;
        }
    }
}

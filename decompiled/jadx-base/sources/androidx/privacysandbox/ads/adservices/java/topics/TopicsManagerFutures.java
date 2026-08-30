package androidx.privacysandbox.ads.adservices.java.topics;

/* JADX INFO: compiled from: TopicsManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "", "()V", "getTopicsAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "CommonApiJavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TopicsManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures from(android.content.Context context) {
        return INSTANCE.from(context);
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> getTopicsAsync(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest request);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: TopicsManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$CommonApiJavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "mTopicsManager", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "(Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;)V", "getTopicsAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class CommonApiJavaImpl extends androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures {
        private final androidx.privacysandbox.ads.adservices.topics.TopicsManager mTopicsManager;

        public CommonApiJavaImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManager mTopicsManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
            this.mTopicsManager = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> getTopicsAsync(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: TopicsManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures from(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.topics.TopicsManager topicsManagerObtain = androidx.privacysandbox.ads.adservices.topics.TopicsManager.INSTANCE.obtain(context);
            return topicsManagerObtain != null ? new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.CommonApiJavaImpl(topicsManagerObtain) : null;
        }
    }
}

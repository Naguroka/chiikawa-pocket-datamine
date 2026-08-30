package androidx.privacysandbox.ads.adservices.java.customaudience;

/* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\tH'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000bH'¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures;", "", "()V", "fetchAndJoinCustomAudienceAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "request", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "joinCustomAudienceAsync", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "leaveCustomAudienceAsync", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "Api33Ext4JavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomAudienceManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures from(android.content.Context context) {
        return INSTANCE.from(context);
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> fetchAndJoinCustomAudienceAsync(androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest request);

    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> joinCustomAudienceAsync(androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest request);

    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> leaveCustomAudienceAsync(androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest request);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u000bH\u0017J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\rH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures;", "mCustomAudienceManager", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "(Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;)V", "fetchAndJoinCustomAudienceAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "request", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "joinCustomAudienceAsync", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "leaveCustomAudienceAsync", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Ext4JavaImpl extends androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures {
        private final androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager mCustomAudienceManager;

        public Api33Ext4JavaImpl(androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> joinCustomAudienceAsync(androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> fetchAndJoinCustomAudienceAsync(androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$fetchAndJoinCustomAudienceAsync$1(this, request, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> leaveCustomAudienceAsync(androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: CustomAudienceManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures from(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager customAudienceManagerObtain = androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager.INSTANCE.obtain(context);
            return customAudienceManagerObtain != null ? new androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures.Api33Ext4JavaImpl(customAudienceManagerObtain) : null;
        }
    }
}

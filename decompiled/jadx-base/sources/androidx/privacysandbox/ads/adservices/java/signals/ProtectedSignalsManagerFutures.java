package androidx.privacysandbox.ads.adservices.java.signals;

/* JADX INFO: compiled from: ProtectedSignalsManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "", "()V", "updateSignalsAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "Companion", "JavaImpl", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ProtectedSignalsManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures from(android.content.Context context) {
        return INSTANCE.from(context);
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> updateSignalsAsync(androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest request);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ProtectedSignalsManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "mProtectedSignalsManager", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "(Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;)V", "updateSignalsAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class JavaImpl extends androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures {
        private final androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager mProtectedSignalsManager;

        public JavaImpl(androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager protectedSignalsManager) {
            this.mProtectedSignalsManager = protectedSignalsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> updateSignalsAsync(androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: ProtectedSignalsManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/signals/ProtectedSignalsManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures from(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager protectedSignalsManagerObtain = androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager.INSTANCE.obtain(context);
            return protectedSignalsManagerObtain != null ? new androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures.JavaImpl(protectedSignalsManagerObtain) : null;
        }
    }
}

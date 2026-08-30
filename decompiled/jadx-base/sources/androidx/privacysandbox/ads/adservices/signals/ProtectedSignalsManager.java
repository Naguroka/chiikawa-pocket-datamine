package androidx.privacysandbox.ads.adservices.signals;

/* JADX INFO: compiled from: ProtectedSignalsManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "", "()V", "updateSignals", "", "request", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ProtectedSignalsManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager.Companion(null);
    private static final java.lang.String TAG = "ProtectedSignalsManager";

    @kotlin.jvm.JvmStatic
    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext12OptIn
    public static final androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager obtain(android.content.Context context) {
        return INSTANCE.obtain(context);
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext12OptIn
    public abstract java.lang.Object updateSignals(androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest updateSignalsRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX INFO: compiled from: ProtectedSignalsManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager$Companion;", "", "()V", "TAG", "", "obtain", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "context", "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext12OptIn
        public final androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager obtain(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 12) {
                android.util.Log.d(androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager.TAG, "Adservices version 12 detected, obtaining ProtectedSignalsManagerImpl.");
                android.adservices.signals.ProtectedSignalsManager protectedSignalsManager = android.adservices.signals.ProtectedSignalsManager.get(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(protectedSignalsManager, "get(context)");
                return new androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManagerImpl(protectedSignalsManager);
            }
            android.util.Log.d(androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager.TAG, "Adservices less than 12, returning null for ProtectedSignalsManager.obtain.");
            return null;
        }
    }
}

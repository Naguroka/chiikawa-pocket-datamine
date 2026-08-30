package androidx.privacysandbox.ads.adservices.measurement;

/* JADX INFO: compiled from: MeasurementManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH§@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "", "()V", "deleteRegistrations", "", "deletionRequest", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMeasurementApiStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSource", "attributionSource", "Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerTrigger", "trigger", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebSource", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebTrigger", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MeasurementManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.measurement.MeasurementManager.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.measurement.MeasurementManager.Companion(null);
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.measurement.MeasurementManager obtain(android.content.Context context) {
        return INSTANCE.obtain(context);
    }

    public abstract java.lang.Object deleteRegistrations(androidx.privacysandbox.ads.adservices.measurement.DeletionRequest deletionRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object getMeasurementApiStatus(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);

    public abstract java.lang.Object registerSource(android.net.Uri uri, android.view.InputEvent inputEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.RegisterSourceOptIn
    public abstract java.lang.Object registerSource(androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest sourceRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object registerTrigger(android.net.Uri uri, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object registerWebSource(androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object registerWebTrigger(androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX INFO: compiled from: MeasurementManager.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager$Companion;", "", "()V", "MEASUREMENT_API_STATE_DISABLED", "", "MEASUREMENT_API_STATE_ENABLED", "obtain", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "context", "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.measurement.MeasurementManager obtain(final android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            android.util.Log.d("MeasurementManager", "AdServicesInfo.version=" + androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion());
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 5) {
                return new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi33Ext5Impl(context);
            }
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
                return (androidx.privacysandbox.ads.adservices.measurement.MeasurementManager) androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE.getManager(context, "MeasurementManager", new kotlin.jvm.functions.Function1<android.content.Context, androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion$obtain$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi31Ext9Impl invoke(android.content.Context it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi31Ext9Impl(context);
                    }
                });
            }
            return null;
        }
    }
}

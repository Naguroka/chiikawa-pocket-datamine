package androidx.privacysandbox.ads.adservices.customaudience;

/* JADX INFO: compiled from: CustomAudienceManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "", "()V", "fetchAndJoinCustomAudience", "", "request", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinCustomAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leaveCustomAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomAudienceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager obtain(android.content.Context context) {
        return INSTANCE.obtain(context);
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext10OptIn
    public abstract java.lang.Object fetchAndJoinCustomAudience(androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object joinCustomAudience(androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object leaveCustomAudience(androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX INFO: compiled from: CustomAudienceManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager$Companion;", "", "()V", "obtain", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "context", "Landroid/content/Context;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager obtain(final android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.adServicesVersion() >= 4) {
                return new androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManagerApi33Ext4Impl(context);
            }
            if (androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
                return (androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager) androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE.getManager(context, "CustomAudienceManager", new kotlin.jvm.functions.Function1<android.content.Context, androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager$Companion$obtain$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManagerApi31Ext9Impl invoke(android.content.Context it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return new androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManagerApi31Ext9Impl(context);
                    }
                });
            }
            return null;
        }
    }
}

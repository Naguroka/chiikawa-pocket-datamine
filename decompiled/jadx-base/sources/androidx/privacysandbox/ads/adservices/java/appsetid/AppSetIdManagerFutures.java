package androidx.privacysandbox.ads.adservices.java.appsetid;

/* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures;", "", "()V", "getAppSetIdAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "Api33Ext4JavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AppSetIdManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures.Companion INSTANCE = new androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures from(android.content.Context context) {
        return INSTANCE.from(context);
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.appsetid.AppSetId> getAppSetIdAsync();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures;", "mAppSetIdManager", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "(Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;)V", "getAppSetIdAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Ext4JavaImpl extends androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures {
        private final androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.appsetid.AppSetId> getAppSetIdAsync() {
            return androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getDefault()), null, null, new androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AppSetIdManagerFutures.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/appsetid/AppSetIdManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures from(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager appSetIdManagerObtain = androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.INSTANCE.obtain(context);
            return appSetIdManagerObtain != null ? new androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures.Api33Ext4JavaImpl(appSetIdManagerObtain) : null;
        }
    }
}

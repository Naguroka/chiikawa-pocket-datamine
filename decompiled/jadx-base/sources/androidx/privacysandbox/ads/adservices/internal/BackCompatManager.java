package androidx.privacysandbox.ads.adservices.internal;

/* JADX INFO: compiled from: BackCompatManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/BackCompatManager;", "", "()V", "getManager", "T", "context", "Landroid/content/Context;", "tag", "", "manager", "Lkotlin/Function1;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackCompatManager {
    public static final androidx.privacysandbox.ads.adservices.internal.BackCompatManager INSTANCE = new androidx.privacysandbox.ads.adservices.internal.BackCompatManager();

    private BackCompatManager() {
    }

    public final <T> T getManager(android.content.Context context, java.lang.String tag, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> manager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (java.lang.NoClassDefFoundError unused) {
            android.util.Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE.extServicesVersionS());
            return null;
        }
    }
}

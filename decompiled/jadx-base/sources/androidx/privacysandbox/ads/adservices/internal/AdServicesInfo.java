package androidx.privacysandbox.ads.adservices.internal;

/* JADX INFO: compiled from: AdServicesInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo;", "", "()V", "adServicesVersion", "", "extServicesVersionS", "Extensions30ExtImpl", "Extensions30Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdServicesInfo {
    public static final androidx.privacysandbox.ads.adservices.internal.AdServicesInfo INSTANCE = new androidx.privacysandbox.ads.adservices.internal.AdServicesInfo();

    private AdServicesInfo() {
    }

    public final int adServicesVersion() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30Impl.INSTANCE.getAdServicesVersion();
        }
        return 0;
    }

    public final int extServicesVersionS() {
        if (android.os.Build.VERSION.SDK_INT == 31 || android.os.Build.VERSION.SDK_INT == 32) {
            return androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30ExtImpl.INSTANCE.getAdExtServicesVersionS();
        }
        return 0;
    }

    /* JADX INFO: compiled from: AdServicesInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30Impl;", "", "()V", "getAdServicesVersion", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Extensions30Impl {
        public static final androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30Impl INSTANCE = new androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30Impl();

        private Extensions30Impl() {
        }

        public final int getAdServicesVersion() {
            return android.os.ext.SdkExtensions.getExtensionVersion(1000000);
        }
    }

    /* JADX INFO: compiled from: AdServicesInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30ExtImpl;", "", "()V", "getAdExtServicesVersionS", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Extensions30ExtImpl {
        public static final androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30ExtImpl INSTANCE = new androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.Extensions30ExtImpl();

        private Extensions30ExtImpl() {
        }

        public final int getAdExtServicesVersionS() {
            return android.os.ext.SdkExtensions.getExtensionVersion(31);
        }
    }
}

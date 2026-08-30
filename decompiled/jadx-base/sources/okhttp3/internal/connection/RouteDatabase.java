package okhttp3.internal.connection;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "()V", "failedRoutes", "", "Lokhttp3/Route;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED, "", "route", com.ironsource.y8.h.t, "failedRoute", "shouldPostpone", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RouteDatabase {
    private final java.util.Set<okhttp3.Route> failedRoutes = new java.util.LinkedHashSet();

    public final synchronized void failed(okhttp3.Route failedRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized void connected(okhttp3.Route route) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized boolean shouldPostpone(okhttp3.Route route) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        return this.failedRoutes.contains(route);
    }
}

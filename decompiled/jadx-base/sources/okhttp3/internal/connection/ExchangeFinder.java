package okhttp3.internal.connection;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ0\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J8\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020$J\n\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", org.jacoco.core.runtime.AgentOptions.ADDRESS, "Lokhttp3/Address;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "getAddress$okhttp", "()Lokhttp3/Address;", "connectionShutdownCount", "", "nextRouteToTry", "Lokhttp3/Route;", "otherFailureCount", "refusedStreamCount", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "find", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "findConnection", "Lokhttp3/internal/connection/RealConnection;", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "", "findHealthyConnection", "doExtensiveHealthChecks", "retryAfterFailure", "retryRoute", "sameHostAndPort", "url", "Lokhttp3/HttpUrl;", "trackFailure", "", "e", "Ljava/io/IOException;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExchangeFinder {
    private final okhttp3.Address address;
    private final okhttp3.internal.connection.RealCall call;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final okhttp3.EventListener eventListener;
    private okhttp3.Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private okhttp3.internal.connection.RouteSelector.Selection routeSelection;
    private okhttp3.internal.connection.RouteSelector routeSelector;

    public ExchangeFinder(okhttp3.internal.connection.RealConnectionPool connectionPool, okhttp3.Address address, okhttp3.internal.connection.RealCall call, okhttp3.EventListener eventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX INFO: renamed from: getAddress$okhttp, reason: from getter */
    public final okhttp3.Address getAddress() {
        return this.address;
    }

    public final okhttp3.internal.http.ExchangeCodec find(okhttp3.OkHttpClient client, okhttp3.internal.http.RealInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            return findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), chain.getWriteTimeoutMillis(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !kotlin.jvm.internal.Intrinsics.areEqual(chain.getRequest().method(), "GET")).newCodec$okhttp(client, chain);
        } catch (java.io.IOException e) {
            trackFailure(e);
            throw new okhttp3.internal.connection.RouteException(e);
        } catch (okhttp3.internal.connection.RouteException e2) {
            trackFailure(e2.getLastConnectException());
            throw e2;
        }
    }

    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws java.io.IOException {
        while (true) {
            okhttp3.internal.connection.RealConnection realConnectionFindConnection = findConnection(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            if (realConnectionFindConnection.isHealthy(doExtensiveHealthChecks)) {
                return realConnectionFindConnection;
            }
            realConnectionFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                okhttp3.internal.connection.RouteSelector.Selection selection = this.routeSelection;
                if (selection != null ? selection.hasNext() : true) {
                    continue;
                } else {
                    okhttp3.internal.connection.RouteSelector routeSelector = this.routeSelector;
                    if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
                        throw new java.io.IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x0168  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final okhttp3.internal.connection.RealConnection findConnection(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) throws java.io.IOException {
        java.util.List<okhttp3.Route> routes;
        okhttp3.internal.connection.RealConnection realConnection;
        java.net.Socket socketReleaseConnectionNoEvents$okhttp;
        if (this.call.getCanceled()) {
            throw new java.io.IOException("Canceled");
        }
        okhttp3.internal.connection.RealConnection connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                socketReleaseConnectionNoEvents$okhttp = (connection.getNoNewExchanges() || !sameHostAndPort(connection.getRoute().address().url())) ? this.call.releaseConnectionNoEvents$okhttp() : null;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            if (this.call.getConnection() != null) {
                if (socketReleaseConnectionNoEvents$okhttp == null) {
                    return connection;
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                okhttp3.internal.Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            okhttp3.internal.connection.RealConnection connection2 = this.call.getConnection();
            kotlin.jvm.internal.Intrinsics.checkNotNull(connection2);
            this.eventListener.connectionAcquired(this.call, connection2);
            return connection2;
        }
        okhttp3.Route next = this.nextRouteToTry;
        try {
            if (next != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                this.nextRouteToTry = null;
            } else {
                okhttp3.internal.connection.RouteSelector.Selection selection = this.routeSelection;
                if (selection != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(selection);
                    if (selection.hasNext()) {
                        okhttp3.internal.connection.RouteSelector.Selection selection2 = this.routeSelection;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(selection2);
                        next = selection2.next();
                    }
                    realConnection = new okhttp3.internal.connection.RealConnection(this.connectionPool, next);
                    this.call.setConnectionToCancel(realConnection);
                    realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
                    this.call.setConnectionToCancel(null);
                    this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
                    if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                        okhttp3.internal.connection.RealConnection connection3 = this.call.getConnection();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(connection3);
                        this.nextRouteToTry = next;
                        okhttp3.internal.Util.closeQuietly(realConnection.socket());
                        this.eventListener.connectionAcquired(this.call, connection3);
                        return connection3;
                    }
                    synchronized (realConnection) {
                        this.connectionPool.put(realConnection);
                        this.call.acquireConnectionNoEvents(realConnection);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    this.eventListener.connectionAcquired(this.call, realConnection);
                    return realConnection;
                }
                okhttp3.internal.connection.RouteSelector routeSelector = this.routeSelector;
                if (routeSelector == null) {
                    routeSelector = new okhttp3.internal.connection.RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = routeSelector;
                }
                okhttp3.internal.connection.RouteSelector.Selection next2 = routeSelector.next();
                this.routeSelection = next2;
                routes = next2.getRoutes();
                if (this.call.getCanceled()) {
                    throw new java.io.IOException("Canceled");
                }
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                    okhttp3.internal.connection.RealConnection connection4 = this.call.getConnection();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(connection4);
                    this.eventListener.connectionAcquired(this.call, connection4);
                    return connection4;
                }
                next = next2.next();
                realConnection = new okhttp3.internal.connection.RealConnection(this.connectionPool, next);
                this.call.setConnectionToCancel(realConnection);
                realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                    okhttp3.internal.connection.RealConnection connection5 = this.call.getConnection();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(connection5);
                    this.nextRouteToTry = next;
                    okhttp3.internal.Util.closeQuietly(realConnection.socket());
                    this.eventListener.connectionAcquired(this.call, connection5);
                    return connection5;
                }
                synchronized (realConnection) {
                    this.connectionPool.put(realConnection);
                    this.call.acquireConnectionNoEvents(realConnection);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    this.eventListener.connectionAcquired(this.call, realConnection);
                    return realConnection;
                }
            }
            realConnection.connect(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
            this.call.setConnectionToCancel(null);
            this.call.getClient().getRouteDatabase().connected(realConnection.getRoute());
            if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                okhttp3.internal.connection.RealConnection connection6 = this.call.getConnection();
                kotlin.jvm.internal.Intrinsics.checkNotNull(connection6);
                this.nextRouteToTry = next;
                okhttp3.internal.Util.closeQuietly(realConnection.socket());
                this.eventListener.connectionAcquired(this.call, connection6);
                return connection6;
            }
            synchronized (realConnection) {
                this.connectionPool.put(realConnection);
                this.call.acquireConnectionNoEvents(realConnection);
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                this.eventListener.connectionAcquired(this.call, realConnection);
                return realConnection;
            }
        } catch (java.lang.Throwable th) {
            this.call.setConnectionToCancel(null);
            throw th;
        }
        routes = null;
        realConnection = new okhttp3.internal.connection.RealConnection(this.connectionPool, next);
        this.call.setConnectionToCancel(realConnection);
    }

    public final void trackFailure(java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        this.nextRouteToTry = null;
        if ((e instanceof okhttp3.internal.http2.StreamResetException) && ((okhttp3.internal.http2.StreamResetException) e).errorCode == okhttp3.internal.http2.ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e instanceof okhttp3.internal.http2.ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }

    public final boolean retryAfterFailure() {
        okhttp3.internal.connection.RouteSelector routeSelector;
        boolean z = false;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        okhttp3.Route routeRetryRoute = retryRoute();
        if (routeRetryRoute != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        okhttp3.internal.connection.RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            z = true;
        }
        if (z || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    private final okhttp3.Route retryRoute() {
        okhttp3.internal.connection.RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount() != 0) {
                return null;
            }
            if (okhttp3.internal.Util.canReuseConnectionFor(connection.getRoute().address().url(), this.address.url())) {
                return connection.getRoute();
            }
            return null;
        }
    }

    public final boolean sameHostAndPort(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        okhttp3.HttpUrl httpUrlUrl = this.address.url();
        return url.port() == httpUrlUrl.port() && kotlin.jvm.internal.Intrinsics.areEqual(url.host(), httpUrlUrl.host());
    }
}

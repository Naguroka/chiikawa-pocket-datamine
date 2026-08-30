package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u000e\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0005J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u000e\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "maxIdleConnections", "", "keepAliveDuration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupTask", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/connection/RealConnection;", "keepAliveDurationNs", "callAcquirePooledConnection", "", org.jacoco.core.runtime.AgentOptions.ADDRESS, "Lokhttp3/Address;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "routes", "", "Lokhttp3/Route;", "requireMultiplexed", "cleanup", "now", "connectionBecameIdle", "connection", "connectionCount", "evictAll", "", "idleConnectionCount", "pruneAndGetAllocationCount", "put", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealConnectionPool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.connection.RealConnectionPool.Companion INSTANCE = new okhttp3.internal.connection.RealConnectionPool.Companion(null);
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;
    private final okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 cleanupTask;
    private final java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX WARN: Type inference failed for: r4v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(okhttp3.internal.concurrent.TaskRunner taskRunner, int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = taskRunner.newQueue();
        final java.lang.String str = okhttp3.internal.Util.okHttpName + " ConnectionPool";
        this.cleanupTask = new okhttp3.internal.concurrent.Task(str) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.this$0.cleanup(java.lang.System.nanoTime());
            }
        };
        this.connections = new java.util.concurrent.ConcurrentLinkedQueue<>();
        if (!(j > 0)) {
            throw new java.lang.IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
        }
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> concurrentLinkedQueue = this.connections;
        int i = 0;
        if (!(concurrentLinkedQueue instanceof java.util.Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (okhttp3.internal.connection.RealConnection it : concurrentLinkedQueue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                synchronized (it) {
                    zIsEmpty = it.getCalls().isEmpty();
                }
                if (zIsEmpty && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final boolean callAcquirePooledConnection(okhttp3.Address address, okhttp3.internal.connection.RealCall call, java.util.List<okhttp3.Route> routes, boolean requireMultiplexed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        for (okhttp3.internal.connection.RealConnection connection : this.connections) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (requireMultiplexed) {
                    if (connection.isMultiplexed$okhttp()) {
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                if (connection.isEligible$okhttp(address, routes)) {
                    call.acquireConnectionNoEvents(connection);
                    return true;
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
        return false;
    }

    public final void evictAll() {
        java.net.Socket socket;
        java.util.Iterator<okhttp3.internal.connection.RealConnection> it = this.connections.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "connections.iterator()");
        while (it.hasNext()) {
            okhttp3.internal.connection.RealConnection connection = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (connection.getCalls().isEmpty()) {
                    it.remove();
                    connection.setNoNewExchanges(true);
                    socket = connection.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                okhttp3.internal.Util.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final long cleanup(long now) {
        int i = 0;
        long j = Long.MIN_VALUE;
        okhttp3.internal.connection.RealConnection realConnection = null;
        int i2 = 0;
        for (okhttp3.internal.connection.RealConnection connection : this.connections) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (pruneAndGetAllocationCount(connection, now) > 0) {
                    java.lang.Integer.valueOf(i2);
                    i2++;
                } else {
                    i++;
                    long idleAtNs = now - connection.getIdleAtNs();
                    if (idleAtNs > j) {
                        realConnection = connection;
                        j = idleAtNs;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
        long j2 = this.keepAliveDurationNs;
        if (j < j2 && i <= this.maxIdleConnections) {
            if (i > 0) {
                return j2 - j;
            }
            if (i2 > 0) {
                return j2;
            }
            return -1L;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(realConnection);
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() + j != now) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            okhttp3.internal.Util.closeQuietly(realConnection.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final okhttp3.internal.connection.RealConnectionPool get(okhttp3.ConnectionPool connectionPool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            return connectionPool.getDelegate();
        }
    }

    public final void put(okhttp3.internal.connection.RealConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(connection)) {
            this.connections.add(connection);
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final boolean connectionBecameIdle(okhttp3.internal.connection.RealConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(connection)) {
            if (connection.getNoNewExchanges() || this.maxIdleConnections == 0) {
                connection.setNoNewExchanges(true);
                this.connections.remove(connection);
                if (this.connections.isEmpty()) {
                    this.cleanupQueue.cancelAll();
                }
                return true;
            }
            okhttp3.internal.concurrent.TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    private final int pruneAndGetAllocationCount(okhttp3.internal.connection.RealConnection connection, long now) {
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(connection)) {
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls = connection.getCalls();
            int i = 0;
            while (i < calls.size()) {
                java.lang.ref.Reference<okhttp3.internal.connection.RealCall> reference = calls.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                    okhttp3.internal.platform.Platform.INSTANCE.get().logCloseableLeak("A connection to " + connection.getRoute().address().url() + " was leaked. Did you forget to close a response body?", ((okhttp3.internal.connection.RealCall.CallReference) reference).getCallStackTrace());
                    calls.remove(i);
                    connection.setNoNewExchanges(true);
                    if (calls.isEmpty()) {
                        connection.setIdleAtNs$okhttp(now - this.keepAliveDurationNs);
                        return 0;
                    }
                }
            }
            return calls.size();
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}

package okhttp3;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010 \u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b$J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b%J\u0016\u0010&\u001a\b\u0018\u00010\u001aR\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0002J)\u0010)\u001a\u00020\u001f\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H*0,2\u0006\u0010!\u001a\u0002H*H\u0002¢\u0006\u0002\u0010-J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0000¢\u0006\u0002\b.J\u0019\u0010)\u001a\u00020\u001f2\n\u0010!\u001a\u00060\u001aR\u00020\u001bH\u0000¢\u0006\u0002\b.J\b\u0010/\u001a\u000200H\u0002J\f\u00101\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00104\u001a\u00020\u0010J\f\u00105\u001a\b\u0012\u0004\u0012\u00020302J\u0006\u00106\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u001aR\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lokhttp3/Dispatcher;", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Ljava/util/concurrent/ExecutorService;)V", "()V", "()Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "<set-?>", "Ljava/lang/Runnable;", "idleCallback", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "maxRequests", "", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "runningAsyncCalls", "runningSyncCalls", "cancelAll", "", "enqueue", androidx.core.app.NotificationCompat.CATEGORY_CALL, "enqueue$okhttp", "executed", "executed$okhttp", "-deprecated_executorService", "findExistingCallWithHost", "host", "", "finished", "T", "calls", "Ljava/util/Deque;", "(Ljava/util/Deque;Ljava/lang/Object;)V", "finished$okhttp", "promoteAndExecute", "", "queuedCalls", "", "Lokhttp3/Call;", "queuedCallsCount", "runningCalls", "runningCallsCount", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Dispatcher {
    private java.util.concurrent.ExecutorService executorServiceOrNull;
    private java.lang.Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> readyAsyncCalls;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> runningAsyncCalls;
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new java.util.ArrayDeque<>();
        this.runningAsyncCalls = new java.util.ArrayDeque<>();
        this.runningSyncCalls = new java.util.ArrayDeque<>();
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final void setMaxRequests(int i) {
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.maxRequests = i;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final void setMaxRequestsPerHost(int i) {
        if (!(i >= 1)) {
            throw new java.lang.IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    public final synchronized java.lang.Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized void setIdleCallback(java.lang.Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final synchronized java.util.concurrent.ExecutorService executorService() {
        java.util.concurrent.ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), okhttp3.internal.Util.threadFactory(okhttp3.internal.Util.okHttpName + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(java.util.concurrent.ExecutorService executorService) {
        this();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }

    public final void enqueue$okhttp(okhttp3.internal.connection.RealCall.AsyncCall call) {
        okhttp3.internal.connection.RealCall.AsyncCall asyncCallFindExistingCallWithHost;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getThis$0().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        promoteAndExecute();
    }

    private final okhttp3.internal.connection.RealCall.AsyncCall findExistingCallWithHost(java.lang.String host) {
        for (okhttp3.internal.connection.RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(asyncCall.getHost(), host)) {
                return asyncCall;
            }
        }
        for (okhttp3.internal.connection.RealCall.AsyncCall asyncCall2 : this.readyAsyncCalls) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(asyncCall2.getHost(), host)) {
                return asyncCall2;
            }
        }
        return null;
    }

    public final synchronized void cancelAll() {
        java.util.Iterator<okhttp3.internal.connection.RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getThis$0().cancel();
        }
        java.util.Iterator<okhttp3.internal.connection.RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getThis$0().cancel();
        }
        java.util.Iterator<okhttp3.internal.connection.RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final synchronized void executed$okhttp(okhttp3.internal.connection.RealCall call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final void finished$okhttp(okhttp3.internal.connection.RealCall.AsyncCall call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        call.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, call);
    }

    public final void finished$okhttp(okhttp3.internal.connection.RealCall call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        finished(this.runningSyncCalls, call);
    }

    private final <T> void finished(java.util.Deque<T> calls, T call) {
        java.lang.Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new java.lang.AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final synchronized java.util.List<okhttp3.Call> queuedCalls() {
        java.util.List<okhttp3.Call> listUnmodifiableList;
        java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayDeque, 10));
        java.util.Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((okhttp3.internal.connection.RealCall.AsyncCall) it.next()).getThis$0());
        }
        listUnmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized java.util.List<okhttp3.Call> runningCalls() {
        java.util.List<okhttp3.Call> listUnmodifiableList;
        java.util.ArrayDeque<okhttp3.internal.connection.RealCall> arrayDeque = this.runningSyncCalls;
        java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayDeque2, 10));
        java.util.Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((okhttp3.internal.connection.RealCall.AsyncCall) it.next()).getThis$0());
        }
        listUnmodifiableList = java.util.Collections.unmodifiableList(kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayDeque, (java.lang.Iterable) arrayList));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "executorService", imports = {}))
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final java.util.concurrent.ExecutorService m2913deprecated_executorService() {
        return executorService();
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z;
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (this) {
                java.util.Iterator<okhttp3.internal.connection.RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    okhttp3.internal.connection.RealCall.AsyncCall asyncCall = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        asyncCall.getCallsPerHost().incrementAndGet();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.runningAsyncCalls.add(asyncCall);
                    }
                }
                z = runningCallsCount() > 0;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((okhttp3.internal.connection.RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
            }
            return z;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}

package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001.\u0018\u00002\u00020\u0001:\u0002deB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u00101\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u000fJ!\u00103\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u00106\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u000202H\u0002J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u00020\u0000H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0016J\u0016\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0007J\b\u0010E\u001a\u00020FH\u0016J\u0015\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u0007H\u0000¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020FH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NH\u0000¢\u0006\u0002\bOJ\b\u0010P\u001a\u00020\u0007H\u0016J\b\u0010Q\u001a\u00020\u0007H\u0016J;\u0010R\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u00106\u001a\u0002H4H\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\u000f\u0010\\\u001a\u0004\u0018\u00010]H\u0000¢\u0006\u0002\b^J\b\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010_\u001a\u00020\u0007J\b\u0010-\u001a\u00020`H\u0016J\u0006\u00100\u001a\u000202J!\u0010a\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010b\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u0010c\u001a\u00020ZH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "client", "Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "forWebSocket", "", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "callStackTrace", "", "canceled", "getClient", "()Lokhttp3/OkHttpClient;", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "connection", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionToCancel", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "exchange", "Lokhttp3/internal/connection/Exchange;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "expectMoreExchanges", "getForWebSocket", "()Z", "interceptorScopedExchange", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getOriginalRequest", "()Lokhttp3/Request;", "requestBodyOpen", "responseBodyOpen", "timeout", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "timeoutEarlyExit", "acquireConnectionNoEvents", "", "callDone", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "callStart", "cancel", "clone", "createAddress", "Lokhttp3/Address;", "url", "Lokhttp3/HttpUrl;", "enqueue", "responseCallback", "Lokhttp3/Callback;", "enterNetworkInterceptorExchange", "request", "newExchangeFinder", "execute", "Lokhttp3/Response;", "exitNetworkInterceptorExchange", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "getResponseWithInterceptorChain", "getResponseWithInterceptorChain$okhttp", "initExchange", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "initExchange$okhttp", "isCanceled", "isExecuted", "messageDone", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "noMoreExchanges$okhttp", "redactedUrl", "", "redactedUrl$okhttp", "releaseConnectionNoEvents", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "retryAfterFailure", "Lokio/AsyncTimeout;", "timeoutExit", "cause", "toLoggableString", "AsyncCall", "CallReference", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealCall implements okhttp3.Call {
    private java.lang.Object callStackTrace;
    private volatile boolean canceled;
    private final okhttp3.OkHttpClient client;
    private okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private volatile okhttp3.internal.connection.RealConnection connectionToCancel;
    private final okhttp3.EventListener eventListener;
    private volatile okhttp3.internal.connection.Exchange exchange;
    private okhttp3.internal.connection.ExchangeFinder exchangeFinder;
    private final java.util.concurrent.atomic.AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private okhttp3.internal.connection.Exchange interceptorScopedExchange;
    private final okhttp3.Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final okhttp3.internal.connection.RealCall.AnonymousClass1 timeout;
    private boolean timeoutEarlyExit;

    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(okhttp3.OkHttpClient client, okhttp3.Request originalRequest, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z;
        this.connectionPool = client.connectionPool().getDelegate();
        this.eventListener = client.eventListenerFactory().create(this);
        ?? r4 = new okio.AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            @Override // okio.AsyncTimeout
            protected void timedOut() {
                okhttp3.internal.connection.RealCall.this.cancel();
            }
        };
        r4.timeout(client.callTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        this.timeout = r4;
        this.executed = new java.util.concurrent.atomic.AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    public final okhttp3.OkHttpClient getClient() {
        return this.client;
    }

    public final okhttp3.Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final okhttp3.EventListener getEventListener() {
        return this.eventListener;
    }

    public final okhttp3.internal.connection.RealConnection getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final okhttp3.internal.connection.Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final okhttp3.internal.connection.RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final void setConnectionToCancel(okhttp3.internal.connection.RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    @Override // okhttp3.Call
    public okio.AsyncTimeout timeout() {
        return this.timeout;
    }

    @Override // okhttp3.Call
    public okhttp3.internal.connection.RealCall clone() {
        return new okhttp3.internal.connection.RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    public okhttp3.Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        okhttp3.internal.connection.RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public okhttp3.Response execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed".toString());
        }
        enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    @Override // okhttp3.Call
    public void enqueue(okhttp3.Callback responseCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed".toString());
        }
        callStart();
        this.client.dispatcher().enqueue$okhttp(new okhttp3.internal.connection.RealCall.AsyncCall(this, responseCallback));
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    private final void callStart() {
        this.callStackTrace = okhttp3.internal.platform.Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a8  */
    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.collections.CollectionsKt.addAll(arrayList2, this.client.interceptors());
        arrayList2.add(new okhttp3.internal.http.RetryAndFollowUpInterceptor(this.client));
        arrayList2.add(new okhttp3.internal.http.BridgeInterceptor(this.client.cookieJar()));
        arrayList2.add(new okhttp3.internal.cache.CacheInterceptor(this.client.cache()));
        arrayList2.add(okhttp3.internal.connection.ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, this.client.networkInterceptors());
        }
        arrayList2.add(new okhttp3.internal.http.CallServerInterceptor(this.forWebSocket));
        boolean z = false;
        try {
            try {
                okhttp3.Response responseProceed = new okhttp3.internal.http.RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (getCanceled()) {
                    okhttp3.internal.Util.closeQuietly(responseProceed);
                    throw new java.io.IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return responseProceed;
            } catch (java.io.IOException e) {
                z = true;
                java.io.IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                kotlin.jvm.internal.Intrinsics.checkNotNull(iOExceptionNoMoreExchanges$okhttp, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (java.lang.Throwable th) {
            if (!z) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
        if (!z) {
            noMoreExchanges$okhttp(null);
        }
        throw th;
    }

    public final void enterNetworkInterceptorExchange(okhttp3.Request request, boolean newExchangeFinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.interceptorScopedExchange == null)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.responseBodyOpen)) {
                throw new java.lang.IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.requestBodyOpen)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (newExchangeFinder) {
            this.exchangeFinder = new okhttp3.internal.connection.ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
        }
    }

    public final okhttp3.internal.connection.Exchange initExchange$okhttp(okhttp3.internal.http.RealInterceptorChain chain) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new java.lang.IllegalStateException("released".toString());
            }
            if (!(!this.responseBodyOpen)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!(!this.requestBodyOpen)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        okhttp3.internal.connection.ExchangeFinder exchangeFinder = this.exchangeFinder;
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchangeFinder);
        okhttp3.internal.connection.Exchange exchange = new okhttp3.internal.connection.Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        if (this.canceled) {
            throw new java.io.IOException("Canceled");
        }
        return exchange;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends java.io.IOException> E messageDone$okhttp(okhttp3.internal.connection.Exchange exchange, boolean requestDone, boolean responseDone, E e) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(exchange, this.exchange)) {
            return e;
        }
        synchronized (this) {
            z = false;
            if (requestDone) {
                try {
                    if (this.requestBodyOpen) {
                        if (requestDone) {
                            this.requestBodyOpen = false;
                        }
                        if (responseDone) {
                            this.responseBodyOpen = false;
                        }
                        z3 = this.requestBodyOpen;
                        if (z3) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (!z3) {
                            z = true;
                        }
                        z2 = z;
                        z = z4;
                    } else if (responseDone || !this.responseBodyOpen) {
                        z2 = false;
                    } else {
                        if (requestDone) {
                            this.requestBodyOpen = false;
                        }
                        if (responseDone) {
                            this.responseBodyOpen = false;
                        }
                        z3 = this.requestBodyOpen;
                        if (z3 || this.responseBodyOpen) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (!z3 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                            z = true;
                        }
                        z2 = z;
                        z = z4;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            } else {
                if (responseDone) {
                }
                z2 = false;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (z) {
            this.exchange = null;
            okhttp3.internal.connection.RealConnection realConnection = this.connection;
            if (realConnection != null) {
                realConnection.incrementSuccessCount$okhttp();
            }
        }
        return z2 ? (E) callDone(e) : e;
    }

    public final java.io.IOException noMoreExchanges$okhttp(java.io.IOException e) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z = true;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return z ? callDone(e) : e;
    }

    public final java.net.Socket releaseConnectionNoEvents$okhttp() {
        okhttp3.internal.connection.RealConnection realConnection = this.connection;
        kotlin.jvm.internal.Intrinsics.checkNotNull(realConnection);
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(realConnection)) {
            java.util.List<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> calls = realConnection.getCalls();
            java.util.Iterator<java.lang.ref.Reference<okhttp3.internal.connection.RealCall>> it = calls.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().get(), this)) {
                    break;
                }
                i++;
            }
            if (!(i != -1)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            calls.remove(i);
            this.connection = null;
            if (calls.isEmpty()) {
                realConnection.setIdleAtNs$okhttp(java.lang.System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.socket();
                }
            }
            return null;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }

    private final <E extends java.io.IOException> E timeoutExit(E cause) {
        if (this.timeoutEarlyExit || !exit()) {
            return cause;
        }
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final void timeoutEarlyExit() {
        if (!(!this.timeoutEarlyExit)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.timeoutEarlyExit = true;
        exit();
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        okhttp3.internal.connection.Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new java.lang.IllegalStateException("released".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (closeExchange && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    private final okhttp3.Address createAddress(okhttp3.HttpUrl url) {
        javax.net.ssl.SSLSocketFactory sslSocketFactory;
        javax.net.ssl.HostnameVerifier hostnameVerifier;
        okhttp3.CertificatePinner certificatePinner;
        if (url.getIsHttps()) {
            sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new okhttp3.Address(url.host(), url.port(), this.client.dns(), this.client.socketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    public final boolean retryAfterFailure() {
        okhttp3.internal.connection.ExchangeFinder exchangeFinder = this.exchangeFinder;
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String toLoggableString() {
        return (getCanceled() ? "canceled " : "") + (this.forWebSocket ? "web socket" : androidx.core.app.NotificationCompat.CATEGORY_CALL) + " to " + redactedUrl$okhttp();
    }

    public final java.lang.String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0000R\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "responseCallback", "Lokhttp3/Callback;", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "getCall", "()Lokhttp3/internal/connection/RealCall;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "host", "", "getHost", "()Ljava/lang/String;", "request", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "executeOn", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "reuseCallsPerHostFrom", "other", "run", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AsyncCall implements java.lang.Runnable {
        private volatile java.util.concurrent.atomic.AtomicInteger callsPerHost;
        private final okhttp3.Callback responseCallback;
        final /* synthetic */ okhttp3.internal.connection.RealCall this$0;

        public AsyncCall(okhttp3.internal.connection.RealCall realCall, okhttp3.Callback responseCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = responseCallback;
            this.callsPerHost = new java.util.concurrent.atomic.AtomicInteger(0);
        }

        public final java.util.concurrent.atomic.AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final void reuseCallsPerHostFrom(okhttp3.internal.connection.RealCall.AsyncCall other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        public final java.lang.String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final okhttp3.Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        /* JADX INFO: renamed from: getCall, reason: from getter */
        public final okhttp3.internal.connection.RealCall getThis$0() {
            return this.this$0;
        }

        public final void executeOn(java.util.concurrent.ExecutorService executorService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "executorService");
            okhttp3.Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(dispatcher)) {
                try {
                    try {
                        executorService.execute(this);
                        return;
                    } catch (java.util.concurrent.RejectedExecutionException e) {
                        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                        this.responseCallback.onFailure(this.this$0, interruptedIOException);
                        this.this$0.getClient().dispatcher().finished$okhttp(this);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                    throw th;
                }
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
        }

        @Override // java.lang.Runnable
        public void run() {
            okhttp3.Dispatcher dispatcher;
            java.lang.String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            okhttp3.internal.connection.RealCall realCall = this.this$0;
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            java.lang.String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                realCall.timeout.enter();
                boolean z = false;
                try {
                    try {
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            dispatcher = realCall.getClient().dispatcher();
                        } catch (java.io.IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                okhttp3.internal.platform.Platform.INSTANCE.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            dispatcher = realCall.getClient().dispatcher();
                        } catch (java.lang.Throwable th) {
                            th = th;
                            z = true;
                            realCall.cancel();
                            if (!z) {
                                java.io.IOException iOException = new java.io.IOException("canceled due to " + th);
                                kotlin.ExceptionsKt.addSuppressed(iOException, th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th2;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
                dispatcher.finished$okhttp(this);
                threadCurrentThread.setName(name);
            } catch (java.lang.Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.RealCall> {
        private final java.lang.Object callStackTrace;

        public final java.lang.Object getCallStackTrace() {
            return this.callStackTrace;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(okhttp3.internal.connection.RealCall referent, java.lang.Object obj) {
            super(referent);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referent, "referent");
            this.callStackTrace = obj;
        }
    }

    public final void acquireConnectionNoEvents(okhttp3.internal.connection.RealConnection connection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        if (!okhttp3.internal.Util.assertionsEnabled || java.lang.Thread.holdsLock(connection)) {
            if (!(this.connection == null)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            this.connection = connection;
            connection.getCalls().add(new okhttp3.internal.connection.RealCall.CallReference(this, this.callStackTrace));
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final <E extends java.io.IOException> E callDone(E e) {
        java.net.Socket socketReleaseConnectionNoEvents$okhttp;
        if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(this)) {
            okhttp3.internal.connection.RealConnection realConnection = this.connection;
            if (realConnection != null) {
                if (!okhttp3.internal.Util.assertionsEnabled || !java.lang.Thread.holdsLock(realConnection)) {
                    synchronized (realConnection) {
                        socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
                    }
                    if (this.connection == null) {
                        if (socketReleaseConnectionNoEvents$okhttp != null) {
                            okhttp3.internal.Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                        }
                        this.eventListener.connectionReleased(this, realConnection);
                    } else {
                        if (!(socketReleaseConnectionNoEvents$okhttp == null)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
                }
            }
            E e2 = (E) timeoutExit(e);
            if (e != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(e2);
                this.eventListener.callFailed(this, e2);
            } else {
                this.eventListener.callEnd(this);
            }
            return e2;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }
}

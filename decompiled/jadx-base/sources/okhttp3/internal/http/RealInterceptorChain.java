package okhttp3.internal.http;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0002\u001a\u00020\u001cH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "interceptors", "", "Lokhttp3/Interceptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "getConnectTimeoutMillis$okhttp", "()I", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getReadTimeoutMillis$okhttp", "getRequest$okhttp", "()Lokhttp3/Request;", "getWriteTimeoutMillis$okhttp", "Lokhttp3/Call;", "connection", "Lokhttp3/Connection;", "copy", "copy$okhttp", "proceed", "Lokhttp3/Response;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealInterceptorChain implements okhttp3.Interceptor.Chain {
    private final okhttp3.internal.connection.RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final okhttp3.internal.connection.Exchange exchange;
    private final int index;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final okhttp3.Request request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(okhttp3.internal.connection.RealCall call, java.util.List<? extends okhttp3.Interceptor> interceptors, int i, okhttp3.internal.connection.Exchange exchange, okhttp3.Request request, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
    }

    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final okhttp3.internal.connection.RealCall getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
    public final okhttp3.internal.connection.Exchange getExchange() {
        return this.exchange;
    }

    /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
    public final okhttp3.Request getRequest() {
        return this.request;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    /* JADX INFO: renamed from: getReadTimeoutMillis$okhttp, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: getWriteTimeoutMillis$okhttp, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public static /* synthetic */ okhttp3.internal.http.RealInterceptorChain copy$okhttp$default(okhttp3.internal.http.RealInterceptorChain realInterceptorChain, int i, okhttp3.internal.connection.Exchange exchange, okhttp3.Request request, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        if ((i5 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        okhttp3.internal.connection.Exchange exchange2 = exchange;
        if ((i5 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        okhttp3.Request request2 = request;
        if ((i5 & 8) != 0) {
            i2 = realInterceptorChain.connectTimeoutMillis;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = realInterceptorChain.readTimeoutMillis;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(i, exchange2, request2, i6, i7, i4);
    }

    public final okhttp3.internal.http.RealInterceptorChain copy$okhttp(int index, okhttp3.internal.connection.Exchange exchange, okhttp3.Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return new okhttp3.internal.http.RealInterceptorChain(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Connection connection() {
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        return exchange != null ? exchange.getConnection() : null;
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: connectTimeoutMillis, reason: from getter */
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withConnectTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(this.exchange == null)) {
            throw new java.lang.IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        return copy$okhttp$default(this, 0, null, null, okhttp3.internal.Util.checkDuration("connectTimeout", timeout, unit), 0, 0, 55, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withReadTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(this.exchange == null)) {
            throw new java.lang.IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        return copy$okhttp$default(this, 0, null, null, 0, okhttp3.internal.Util.checkDuration("readTimeout", timeout, unit), 0, 47, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withWriteTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(this.exchange == null)) {
            throw new java.lang.IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
        }
        return copy$okhttp$default(this, 0, null, null, 0, 0, okhttp3.internal.Util.checkDuration("writeTimeout", timeout, unit), 31, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Response proceed(okhttp3.Request request) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.index < this.interceptors.size())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.calls++;
        okhttp3.internal.connection.Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder().sameHostAndPort(request.url())) {
                throw new java.lang.IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (!(this.calls == 1)) {
                throw new java.lang.IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        okhttp3.internal.http.RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        okhttp3.Interceptor interceptor = this.interceptors.get(this.index);
        okhttp3.Response responseIntercept = interceptor.intercept(realInterceptorChainCopy$okhttp$default);
        if (responseIntercept == null) {
            throw new java.lang.NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange != null) {
            if (!(this.index + 1 >= this.interceptors.size() || realInterceptorChainCopy$okhttp$default.calls == 1)) {
                throw new java.lang.IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
            }
        }
        if (responseIntercept.body() != null) {
            return responseIntercept;
        }
        throw new java.lang.IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }
}

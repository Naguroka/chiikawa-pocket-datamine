package okhttp3;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lokhttp3/Interceptor;", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Chain", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Interceptor.Companion INSTANCE = okhttp3.Interceptor.Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Interceptor.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lokhttp3/Interceptor$Chain;", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "connectTimeoutMillis", "", "connection", "Lokhttp3/Connection;", "proceed", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "readTimeoutMillis", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "writeTimeoutMillis", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Chain {
        okhttp3.Call call();

        int connectTimeoutMillis();

        okhttp3.Connection connection();

        okhttp3.Response proceed(okhttp3.Request request) throws java.io.IOException;

        int readTimeoutMillis();

        okhttp3.Request request();

        okhttp3.Interceptor.Chain withConnectTimeout(int timeout, java.util.concurrent.TimeUnit unit);

        okhttp3.Interceptor.Chain withReadTimeout(int timeout, java.util.concurrent.TimeUnit unit);

        okhttp3.Interceptor.Chain withWriteTimeout(int timeout, java.util.concurrent.TimeUnit unit);

        int writeTimeoutMillis();
    }

    okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException;

    /* JADX INFO: compiled from: Interceptor.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042#\b\u0004\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086\nø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lokhttp3/Interceptor$Companion;", "", "()V", "invoke", "Lokhttp3/Interceptor;", "block", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ okhttp3.Interceptor.Companion $$INSTANCE = new okhttp3.Interceptor.Companion();

        private Companion() {
        }

        public final okhttp3.Interceptor invoke(final kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            return new okhttp3.Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return block.invoke(it);
                }
            };
        }
    }
}

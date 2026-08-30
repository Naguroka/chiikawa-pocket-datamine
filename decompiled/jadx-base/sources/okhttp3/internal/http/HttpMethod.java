package okhttp3.internal.http;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpMethod {
    public static final okhttp3.internal.http.HttpMethod INSTANCE = new okhttp3.internal.http.HttpMethod();

    private HttpMethod() {
    }

    public final boolean invalidatesCache(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        return kotlin.jvm.internal.Intrinsics.areEqual(method, "POST") || kotlin.jvm.internal.Intrinsics.areEqual(method, "PATCH") || kotlin.jvm.internal.Intrinsics.areEqual(method, "PUT") || kotlin.jvm.internal.Intrinsics.areEqual(method, "DELETE") || kotlin.jvm.internal.Intrinsics.areEqual(method, "MOVE");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean requiresRequestBody(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        return kotlin.jvm.internal.Intrinsics.areEqual(method, "POST") || kotlin.jvm.internal.Intrinsics.areEqual(method, "PUT") || kotlin.jvm.internal.Intrinsics.areEqual(method, "PATCH") || kotlin.jvm.internal.Intrinsics.areEqual(method, "PROPPATCH") || kotlin.jvm.internal.Intrinsics.areEqual(method, "REPORT");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean permitsRequestBody(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        return (kotlin.jvm.internal.Intrinsics.areEqual(method, "GET") || kotlin.jvm.internal.Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    public final boolean redirectsWithBody(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        return kotlin.jvm.internal.Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsToGet(java.lang.String method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        return !kotlin.jvm.internal.Intrinsics.areEqual(method, "PROPFIND");
    }
}

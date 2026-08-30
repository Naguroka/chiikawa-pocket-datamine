package okhttp3.internal.http;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", "", "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final okhttp3.OkHttpClient client;

    public RetryAndFollowUpInterceptor(okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        okhttp3.Response responseProceed;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        okhttp3.Request request = realInterceptorChain.getRequest();
        okhttp3.internal.connection.RealCall call = realInterceptorChain.getCall();
        java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        int i = 0;
        okhttp3.Response response = null;
        while (true) {
            boolean z = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z);
                try {
                    if (call.getCanceled()) {
                        throw new java.io.IOException("Canceled");
                    }
                    try {
                        responseProceed = realInterceptorChain.proceed(request);
                    } catch (java.io.IOException e) {
                        if (!recover(e, call, request, !(e instanceof okhttp3.internal.http2.ConnectionShutdownException))) {
                            throw okhttp3.internal.Util.withSuppressed(e, listEmptyList);
                        }
                        listEmptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.io.IOException>) listEmptyList, e);
                        call.exitNetworkInterceptorExchange$okhttp(true);
                        z = false;
                    } catch (okhttp3.internal.connection.RouteException e2) {
                        if (!recover(e2.getLastConnectException(), call, request, false)) {
                            throw okhttp3.internal.Util.withSuppressed(e2.getFirstConnectException(), listEmptyList);
                        }
                        listEmptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.io.IOException>) listEmptyList, e2.getFirstConnectException());
                        call.exitNetworkInterceptorExchange$okhttp(true);
                        z = false;
                    }
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    z = false;
                } catch (java.lang.Throwable th) {
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    throw th;
                }
            }
            if (response != null) {
                responseProceed = responseProceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
            }
            response = responseProceed;
            okhttp3.internal.connection.Exchange interceptorScopedExchange = call.getInterceptorScopedExchange();
            okhttp3.Request requestFollowUpRequest = followUpRequest(response, interceptorScopedExchange);
            if (requestFollowUpRequest == null) {
                if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                    call.timeoutEarlyExit();
                }
                call.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            okhttp3.RequestBody requestBodyBody = requestFollowUpRequest.body();
            if (requestBodyBody != null && requestBodyBody.isOneShot()) {
                call.exitNetworkInterceptorExchange$okhttp(false);
                return response;
            }
            okhttp3.ResponseBody responseBodyBody = response.body();
            if (responseBodyBody != null) {
                okhttp3.internal.Util.closeQuietly(responseBodyBody);
            }
            i++;
            if (i > 20) {
                throw new java.net.ProtocolException("Too many follow-up requests: " + i);
            }
            call.exitNetworkInterceptorExchange$okhttp(true);
            request = requestFollowUpRequest;
        }
    }

    private final boolean recover(java.io.IOException e, okhttp3.internal.connection.RealCall call, okhttp3.Request userRequest, boolean requestSendStarted) {
        if (this.client.retryOnConnectionFailure()) {
            return !(requestSendStarted && requestIsOneShot(e, userRequest)) && isRecoverable(e, requestSendStarted) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(java.io.IOException e, okhttp3.Request userRequest) {
        okhttp3.RequestBody requestBodyBody = userRequest.body();
        return (requestBodyBody != null && requestBodyBody.isOneShot()) || (e instanceof java.io.FileNotFoundException);
    }

    private final boolean isRecoverable(java.io.IOException e, boolean requestSendStarted) {
        if (e instanceof java.net.ProtocolException) {
            return false;
        }
        if (e instanceof java.io.InterruptedIOException) {
            return (e instanceof java.net.SocketTimeoutException) && !requestSendStarted;
        }
        return (((e instanceof javax.net.ssl.SSLHandshakeException) && (e.getCause() instanceof java.security.cert.CertificateException)) || (e instanceof javax.net.ssl.SSLPeerUnverifiedException)) ? false : true;
    }

    private final okhttp3.Request followUpRequest(okhttp3.Response userResponse, okhttp3.internal.connection.Exchange exchange) throws java.io.IOException {
        okhttp3.internal.connection.RealConnection connection;
        okhttp3.Route route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int iCode = userResponse.code();
        java.lang.String strMethod = userResponse.request().method();
        if (iCode != 307 && iCode != 308) {
            if (iCode == 401) {
                return this.client.authenticator().authenticate(route, userResponse);
            }
            if (iCode == 421) {
                okhttp3.RequestBody requestBodyBody = userResponse.request().body();
                if ((requestBodyBody != null && requestBodyBody.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection().noCoalescedConnections$okhttp();
                return userResponse.request();
            }
            if (iCode == 503) {
                okhttp3.Response responsePriorResponse = userResponse.priorResponse();
                if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && retryAfter(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.request();
                }
                return null;
            }
            if (iCode == 407) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(route);
                if (route.proxy().type() != java.net.Proxy.Type.HTTP) {
                    throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route, userResponse);
            }
            if (iCode == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                okhttp3.RequestBody requestBodyBody2 = userResponse.request().body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    return null;
                }
                okhttp3.Response responsePriorResponse2 = userResponse.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.request();
                }
                return null;
            }
            switch (iCode) {
                case com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, strMethod);
    }

    private final okhttp3.Request buildRedirectRequest(okhttp3.Response userResponse, java.lang.String method) {
        java.lang.String strHeader$default;
        okhttp3.HttpUrl httpUrlResolve;
        if (!this.client.followRedirects() || (strHeader$default = okhttp3.Response.header$default(userResponse, com.google.common.net.HttpHeaders.LOCATION, null, 2, null)) == null || (httpUrlResolve = userResponse.request().url().resolve(strHeader$default)) == null) {
            return null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(httpUrlResolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        okhttp3.Request.Builder builderNewBuilder = userResponse.request().newBuilder();
        if (okhttp3.internal.http.HttpMethod.permitsRequestBody(method)) {
            int iCode = userResponse.code();
            boolean z = okhttp3.internal.http.HttpMethod.INSTANCE.redirectsWithBody(method) || iCode == 308 || iCode == 307;
            if (okhttp3.internal.http.HttpMethod.INSTANCE.redirectsToGet(method) && iCode != 308 && iCode != 307) {
                builderNewBuilder.method("GET", null);
            } else {
                builderNewBuilder.method(method, z ? userResponse.request().body() : null);
            }
            if (!z) {
                builderNewBuilder.removeHeader(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
                builderNewBuilder.removeHeader(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
                builderNewBuilder.removeHeader("Content-Type");
            }
        }
        if (!okhttp3.internal.Util.canReuseConnectionFor(userResponse.request().url(), httpUrlResolve)) {
            builderNewBuilder.removeHeader(com.google.common.net.HttpHeaders.AUTHORIZATION);
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    private final int retryAfter(okhttp3.Response userResponse, int defaultDelay) {
        java.lang.String strHeader$default = okhttp3.Response.header$default(userResponse, com.google.common.net.HttpHeaders.RETRY_AFTER, null, 2, null);
        if (strHeader$default == null) {
            return defaultDelay;
        }
        if (!new kotlin.text.Regex("\\d+").matches(strHeader$default)) {
            return Integer.MAX_VALUE;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(strHeader$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }
}

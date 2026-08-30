package okhttp3.internal.http;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CallServerInterceptor implements okhttp3.Interceptor {
    private final boolean forWebSocket;

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095 A[Catch: IOException -> 0x009a, TRY_LEAVE, TryCatch #0 {IOException -> 0x009a, blocks: (B:15:0x0053, B:17:0x0059, B:26:0x008f, B:28:0x0095, B:18:0x0068, B:19:0x0077, B:21:0x0084), top: B:82:0x002e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r10v4, types: [okhttp3.Response$Builder] */
    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        boolean z;
        ?? PermitsRequestBody;
        ?? responseHeaders;
        okhttp3.Response responseBuild;
        ?? r10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        okhttp3.internal.connection.Exchange exchange = realInterceptorChain.getExchange();
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchange);
        okhttp3.Request request = realInterceptorChain.getRequest();
        okhttp3.RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            exchange.writeRequestHeaders(request);
            PermitsRequestBody = okhttp3.internal.http.HttpMethod.permitsRequestBody(request.method());
            try {
                if (PermitsRequestBody != 0 && requestBodyBody != null) {
                    if (kotlin.text.StringsKt.equals("100-continue", request.header(com.google.common.net.HttpHeaders.EXPECT), true)) {
                        exchange.flushRequest();
                        PermitsRequestBody = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z = false;
                            r10 = PermitsRequestBody;
                        } catch (java.io.IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof okhttp3.internal.http2.ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                responseHeaders = PermitsRequestBody;
                                throw e;
                            }
                        }
                    } else {
                        z = true;
                        r10 = 0;
                    }
                    if (r10 == 0) {
                        if (requestBodyBody.isDuplex()) {
                            exchange.flushRequest();
                            requestBodyBody.writeTo(okio.Okio.buffer(exchange.createRequestBody(request, true)));
                        } else {
                            okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(exchange.createRequestBody(request, false));
                            requestBodyBody.writeTo(bufferedSinkBuffer);
                            bufferedSinkBuffer.close();
                        }
                    } else {
                        exchange.noRequestBody();
                        if (!exchange.getConnection().isMultiplexed$okhttp()) {
                            PermitsRequestBody = r10;
                            exchange.noNewExchangesOnConnection();
                            PermitsRequestBody = r10;
                        }
                    }
                } else {
                    exchange.noRequestBody();
                    z = true;
                    PermitsRequestBody = 0;
                }
                if (requestBodyBody != null) {
                    PermitsRequestBody = r10;
                    if (!requestBodyBody.isDuplex()) {
                        PermitsRequestBody = r10;
                        PermitsRequestBody = r10;
                        PermitsRequestBody = r10;
                        exchange.finishRequest();
                    }
                } else {
                    PermitsRequestBody = r10;
                    PermitsRequestBody = r10;
                    PermitsRequestBody = r10;
                    exchange.finishRequest();
                }
                PermitsRequestBody = r10;
                e = null;
                responseHeaders = PermitsRequestBody;
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            z = true;
            PermitsRequestBody = 0;
        }
        if (responseHeaders == 0) {
            try {
                responseHeaders = exchange.readResponseHeaders(false);
                kotlin.jvm.internal.Intrinsics.checkNotNull(responseHeaders);
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (java.io.IOException e4) {
                if (e != null) {
                    kotlin.ExceptionsKt.addSuppressed(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        okhttp3.Response responseBuild2 = responseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
        int iCode = responseBuild2.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            okhttp3.Response.Builder responseHeaders2 = exchange.readResponseHeaders(false);
            kotlin.jvm.internal.Intrinsics.checkNotNull(responseHeaders2);
            if (z) {
                exchange.responseHeadersStart();
            }
            responseBuild2 = responseHeaders2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
            iCode = responseBuild2.code();
        }
        exchange.responseHeadersEnd(responseBuild2);
        if (this.forWebSocket && iCode == 101) {
            responseBuild = responseBuild2.newBuilder().body(okhttp3.internal.Util.EMPTY_RESPONSE).build();
        } else {
            responseBuild = responseBuild2.newBuilder().body(exchange.openResponseBody(responseBuild2)).build();
        }
        if (kotlin.text.StringsKt.equals("close", responseBuild.request().header(com.google.common.net.HttpHeaders.CONNECTION), true) || kotlin.text.StringsKt.equals("close", okhttp3.Response.header$default(responseBuild, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (iCode == 204 || iCode == 205) {
            okhttp3.ResponseBody responseBodyBody = responseBuild.body();
            if ((responseBodyBody != null ? responseBodyBody.getContentLength() : -1L) > 0) {
                java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("HTTP ").append(iCode).append(" had non-zero Content-Length: ");
                okhttp3.ResponseBody responseBodyBody2 = responseBuild.body();
                throw new java.net.ProtocolException(sbAppend.append(responseBodyBody2 != null ? java.lang.Long.valueOf(responseBodyBody2.getContentLength()) : null).toString());
            }
        }
        return responseBuild;
    }
}

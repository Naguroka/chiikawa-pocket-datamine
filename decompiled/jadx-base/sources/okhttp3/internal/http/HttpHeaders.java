package okhttp3.internal.http;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n\u001a\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0010H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "hasBody", "", com.json.hs.n, "Lokhttp3/Response;", "parseChallenges", "", "Lokhttp3/Challenge;", "Lokhttp3/Headers;", "headerName", "", "promisesBody", "readChallengeHeader", "", "Lokio/Buffer;", "result", "", "readQuotedString", "readToken", "receiveHeaders", "Lokhttp3/CookieJar;", "url", "Lokhttp3/HttpUrl;", "headers", "skipCommasAndWhitespace", "startsWith", "prefix", "", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpHeaders {
    private static final okio.ByteString QUOTED_STRING_DELIMITERS = okio.ByteString.INSTANCE.encodeUtf8("\"\\");
    private static final okio.ByteString TOKEN_DELIMITERS = okio.ByteString.INSTANCE.encodeUtf8("\t ,=");

    public static final java.util.List<okhttp3.Challenge> parseChallenges(okhttp3.Headers headers, java.lang.String headerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerName, "headerName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.text.StringsKt.equals(headerName, headers.name(i), true)) {
                try {
                    readChallengeHeader(new okio.Buffer().writeUtf8(headers.value(i)), arrayList);
                } catch (java.io.EOFException e) {
                    okhttp3.internal.platform.Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0 A[EDGE_INSN: B:59:0x00c0->B:48:0x00c0 BREAK  A[LOOP:2: B:22:0x0077->B:47:0x00be], SYNTHETIC] */
    private static final void readChallengeHeader(okio.Buffer buffer, java.util.List<okhttp3.Challenge> list) throws java.io.EOFException {
        java.lang.String token;
        while (true) {
            java.lang.String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(buffer);
                    token2 = readToken(buffer);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(buffer);
                java.lang.String token3 = readToken(buffer);
                if (token3 == null) {
                    if (buffer.exhausted()) {
                        list.add(new okhttp3.Challenge(token2, (java.util.Map<java.lang.String, java.lang.String>) kotlin.collections.MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                int iSkipAll = okhttp3.internal.Util.skipAll(buffer, kotlin.io.encoding.Base64.padSymbol);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(buffer);
                if (!zSkipCommasAndWhitespace && (zSkipCommasAndWhitespace2 || buffer.exhausted())) {
                    java.util.Map mapSingletonMap = java.util.Collections.singletonMap(null, token3 + kotlin.text.StringsKt.repeat(com.ironsource.y8.i.b, iSkipAll));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new okhttp3.Challenge(token2, (java.util.Map<java.lang.String, java.lang.String>) mapSingletonMap));
                } else {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    int iSkipAll2 = iSkipAll + okhttp3.internal.Util.skipAll(buffer, kotlin.io.encoding.Base64.padSymbol);
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(buffer, (byte) 34)) {
                                token = readQuotedString(buffer);
                            } else {
                                token = readToken(buffer);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(buffer)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(buffer);
                            if (!skipCommasAndWhitespace(buffer)) {
                                iSkipAll2 = okhttp3.internal.Util.skipAll(buffer, kotlin.io.encoding.Base64.padSymbol);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(buffer)) {
                                    return;
                                }
                                if (startsWith(buffer, (byte) 34)) {
                                    token = readQuotedString(buffer);
                                } else {
                                    token = readToken(buffer);
                                }
                                if (token != null || ((java.lang.String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(buffer) && !buffer.exhausted()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new okhttp3.Challenge(token2, linkedHashMap));
                    token2 = token3;
                }
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(okio.Buffer buffer) throws java.io.EOFException {
        boolean z = false;
        while (!buffer.exhausted()) {
            byte b = buffer.getByte(0L);
            boolean z2 = true;
            if (b != 44) {
                if (b != 32 && b != 9) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(okio.Buffer buffer, byte b) {
        return !buffer.exhausted() && buffer.getByte(0L) == b;
    }

    private static final java.lang.String readQuotedString(okio.Buffer buffer) throws java.io.EOFException {
        if (!(buffer.readByte() == 34)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        okio.Buffer buffer2 = new okio.Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == 34) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final java.lang.String readToken(okio.Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(okhttp3.CookieJar cookieJar, okhttp3.HttpUrl url, okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == okhttp3.CookieJar.NO_COOKIES) {
            return;
        }
        java.util.List<okhttp3.Cookie> all = okhttp3.Cookie.INSTANCE.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    public static final boolean promisesBody(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "<this>");
        if (kotlin.jvm.internal.Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && okhttp3.internal.Util.headersContentLength(response) == -1 && !kotlin.text.StringsKt.equals("chunked", okhttp3.Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) ? false : true;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @kotlin.ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }
}

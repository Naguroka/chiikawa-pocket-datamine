package okhttp3;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", com.applovin.sdk.AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", com.json.zb.M, "Ljava/nio/charset/Charset;", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Credentials {
    public static final okhttp3.Credentials INSTANCE = new okhttp3.Credentials();

    @kotlin.jvm.JvmStatic
    public static final java.lang.String basic(java.lang.String username, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    private Credentials() {
    }

    public static /* synthetic */ java.lang.String basic$default(java.lang.String str, java.lang.String str2, java.nio.charset.Charset ISO_8859_1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        }
        return basic(str, str2, ISO_8859_1);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String basic(java.lang.String username, java.lang.String password, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + okio.ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }
}

package okio;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedUtf8.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Deprecated(message = "changed in Okio 2.x")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lokio/-DeprecatedUtf8;", "", "()V", "size", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "", "beginIndex", "", "endIndex", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeprecatedUtf8 {
    public static final okio.DeprecatedUtf8 INSTANCE = new okio.DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long size(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        return okio.Utf8.size$default(string, 0, 0, 3, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long size(java.lang.String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        return okio.Utf8.size(string, beginIndex, endIndex);
    }
}

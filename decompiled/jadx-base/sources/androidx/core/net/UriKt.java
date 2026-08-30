package androidx.core.net;

/* JADX INFO: compiled from: Uri.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"toFile", "Ljava/io/File;", "Landroid/net/Uri;", "toUri", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UriKt {
    public static final android.net.Uri toUri(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        android.net.Uri uri = android.net.Uri.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        return uri;
    }

    public static final android.net.Uri toUri(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        android.net.Uri uriFromFile = android.net.Uri.fromFile(file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(this)");
        return uriFromFile;
    }

    public static final java.io.File toFile(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), com.ironsource.y8.h.b)) {
            throw new java.lang.IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        java.lang.String path = uri.getPath();
        if (path != null) {
            return new java.io.File(path);
        }
        throw new java.lang.IllegalArgumentException(("Uri path is null: " + uri).toString());
    }
}

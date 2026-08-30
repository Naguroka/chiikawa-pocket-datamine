package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
    }

    public static android.database.Cursor query(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, androidx.core.os.CancellationSignal cancellationSignal) throws java.lang.Exception {
        java.lang.Object cancellationSignalObject;
        if (cancellationSignal != null) {
            try {
                cancellationSignalObject = cancellationSignal.getCancellationSignalObject();
            } catch (java.lang.Exception e) {
                if (e instanceof android.os.OperationCanceledException) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw e;
            }
        } else {
            cancellationSignalObject = null;
        }
        return androidx.core.content.ContentResolverCompat.Api16Impl.query(contentResolver, uri, strArr, str, strArr2, str2, (android.os.CancellationSignal) cancellationSignalObject);
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static android.database.Cursor query(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }
}

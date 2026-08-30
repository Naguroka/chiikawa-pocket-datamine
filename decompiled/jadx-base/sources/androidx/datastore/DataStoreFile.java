package androidx.datastore;

/* JADX INFO: compiled from: DataStoreFile.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"dataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", com.ironsource.rc.c.b, "", "datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DataStoreFile {
    public static final java.io.File dataStoreFile(android.content.Context context, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new java.io.File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}

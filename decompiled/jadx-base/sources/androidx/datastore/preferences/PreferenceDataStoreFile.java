package androidx.datastore.preferences;

/* JADX INFO: compiled from: PreferenceDataStoreFile.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"preferencesDataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", "name", "", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreFile {
    public static final java.io.File preferencesDataStoreFile(android.content.Context context, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return androidx.datastore.DataStoreFile.dataStoreFile(context, name + ".preferences_pb");
    }
}

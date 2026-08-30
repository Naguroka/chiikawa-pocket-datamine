package androidx.startup;

/* JADX INFO: loaded from: classes3.dex */
public class InitializationProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                androidx.startup.AppInitializer.getInstance(context).discoverAndInitialize();
                return true;
            }
            androidx.startup.StartupLogger.w("Deferring initialization because `applicationContext` is null.");
            return true;
        }
        throw new androidx.startup.StartupException("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }
}

package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public final class DropDataContentProvider extends android.content.ContentProvider {
    org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface mImpl;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        return getDropImpl().openFile(this, uri);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return getDropImpl().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return getDropImpl().getType(uri);
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("Insert method is not supported.");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("update method is not supported.");
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return getDropImpl().call(str, str2, bundle);
    }

    private org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropImpl() {
        if (this.mImpl == null) {
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface dropDataProvider = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getDropDataProvider();
            this.mImpl = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.mImpl;
    }
}

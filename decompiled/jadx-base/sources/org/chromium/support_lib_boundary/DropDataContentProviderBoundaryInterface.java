package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes6.dex */
public interface DropDataContentProviderBoundaryInterface {
    android.net.Uri cache(byte[] bArr, java.lang.String str, java.lang.String str2);

    android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle);

    java.lang.String[] getStreamTypes(android.net.Uri uri, java.lang.String str);

    java.lang.String getType(android.net.Uri uri);

    boolean onCreate();

    void onDragEnd(boolean z);

    android.os.ParcelFileDescriptor openFile(android.content.ContentProvider contentProvider, android.net.Uri uri) throws java.io.FileNotFoundException;

    android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2);

    void setClearCachedDataIntervalMs(int i);
}

package com.pairip.licensecheck;

/* JADX INFO: loaded from: classes2.dex */
public class LicenseContentProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.pairip.licensecheck.LicenseClient.checkLicense(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
        throw new java.lang.UnsupportedOperationException("Query is not supported ");
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.UnsupportedOperationException("GetType is not supported ");
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues values) {
        throw new java.lang.UnsupportedOperationException("Insert is not supported ");
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
        throw new java.lang.UnsupportedOperationException("Delete is not supported ");
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) {
        throw new java.lang.UnsupportedOperationException("Update is not supported ");
    }
}

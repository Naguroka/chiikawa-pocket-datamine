package com.json.environment;

/* JADX INFO: loaded from: classes5.dex */
public class CrashProvider extends android.content.ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.content.Context f2621a;
    com.json.ca b;
    java.lang.String c;
    android.net.Uri e;
    java.lang.String h;
    java.lang.String i;
    android.content.UriMatcher d = new android.content.UriMatcher(-1);
    final int f = 1;
    final int g = 2;
    final java.lang.String j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        int iMatch = this.d.match(uri);
        if (iMatch == 1) {
            return this.h;
        }
        if (iMatch == 2) {
            return this.i;
        }
        throw new java.lang.IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f2621a = getContext();
        this.b = new com.json.ca(this.f2621a);
        this.c = this.f2621a.getPackageName();
        this.e = android.net.Uri.parse("content://" + this.c + "/REPORTS");
        this.h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int iMatch = this.d.match(uri);
        if (iMatch == 1) {
            return com.json.ca.c();
        }
        if (iMatch == 2) {
            return com.json.ca.a(java.lang.Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new java.lang.IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}

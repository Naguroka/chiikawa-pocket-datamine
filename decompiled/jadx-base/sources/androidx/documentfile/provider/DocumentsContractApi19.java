package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes.dex */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final java.lang.String TAG = "DocumentFile";

    public static boolean isVirtual(android.content.Context context, android.net.Uri uri) {
        return android.provider.DocumentsContract.isDocumentUri(context, uri) && (getFlags(context, uri) & 512) != 0;
    }

    public static java.lang.String getName(android.content.Context context, android.net.Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    private static java.lang.String getRawType(android.content.Context context, android.net.Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    public static java.lang.String getType(android.content.Context context, android.net.Uri uri) {
        java.lang.String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static long getFlags(android.content.Context context, android.net.Uri uri) {
        return queryForLong(context, uri, "flags", 0L);
    }

    public static boolean isDirectory(android.content.Context context, android.net.Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(android.content.Context context, android.net.Uri uri) {
        java.lang.String rawType = getRawType(context, uri);
        return ("vnd.android.document/directory".equals(rawType) || android.text.TextUtils.isEmpty(rawType)) ? false : true;
    }

    public static long lastModified(android.content.Context context, android.net.Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(android.content.Context context, android.net.Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }

    public static boolean canRead(android.content.Context context, android.net.Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !android.text.TextUtils.isEmpty(getRawType(context, uri));
    }

    public static boolean canWrite(android.content.Context context, android.net.Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        java.lang.String rawType = getRawType(context, uri);
        int iQueryForInt = queryForInt(context, uri, "flags", 0);
        if (android.text.TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((iQueryForInt & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(rawType) || (iQueryForInt & 8) == 0) {
            return (android.text.TextUtils.isEmpty(rawType) || (iQueryForInt & 2) == 0) ? false : true;
        }
        return true;
    }

    public static boolean exists(android.content.Context context, android.net.Uri uri) {
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed query: " + e);
            return false;
        } finally {
            closeQuietly(cursorQuery);
        }
    }

    private static java.lang.String queryForString(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed query: " + e);
            return str2;
        } finally {
            closeQuietly(cursorQuery);
        }
        closeQuietly(cursorQuery);
    }

    private static int queryForInt(android.content.Context context, android.net.Uri uri, java.lang.String str, int i) {
        return (int) queryForLong(context, uri, str, i);
    }

    private static long queryForLong(android.content.Context context, android.net.Uri uri, java.lang.String str, long j) {
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j : cursorQuery.getLong(0);
        } catch (java.lang.Exception e) {
            android.util.Log.w(TAG, "Failed query: " + e);
            return j;
        } finally {
            closeQuietly(cursorQuery);
        }
        closeQuietly(cursorQuery);
    }

    private static void closeQuietly(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private DocumentsContractApi19() {
    }
}

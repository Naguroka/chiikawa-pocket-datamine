package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes.dex */
class TreeDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.content.Context mContext;
    private android.net.Uri mUri;

    TreeDocumentFile(androidx.documentfile.provider.DocumentFile documentFile, android.content.Context context, android.net.Uri uri) {
        super(documentFile);
        this.mContext = context;
        this.mUri = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String str, java.lang.String str2) {
        android.net.Uri uriCreateFile = createFile(this.mContext, this.mUri, str, str2);
        if (uriCreateFile != null) {
            return new androidx.documentfile.provider.TreeDocumentFile(this, this.mContext, uriCreateFile);
        }
        return null;
    }

    private static android.net.Uri createFile(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        try {
            return android.provider.DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String str) {
        android.net.Uri uriCreateFile = createFile(this.mContext, this.mUri, "vnd.android.document/directory", str);
        if (uriCreateFile != null) {
            return new androidx.documentfile.provider.TreeDocumentFile(this, this.mContext, uriCreateFile);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
        return this.mUri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
        return androidx.documentfile.provider.DocumentsContractApi19.getName(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
        return androidx.documentfile.provider.DocumentsContractApi19.getType(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return androidx.documentfile.provider.DocumentsContractApi19.isDirectory(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return androidx.documentfile.provider.DocumentsContractApi19.isFile(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return androidx.documentfile.provider.DocumentsContractApi19.isVirtual(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return androidx.documentfile.provider.DocumentsContractApi19.lastModified(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return androidx.documentfile.provider.DocumentsContractApi19.length(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return androidx.documentfile.provider.DocumentsContractApi19.canRead(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return androidx.documentfile.provider.DocumentsContractApi19.canWrite(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        try {
            return android.provider.DocumentsContract.deleteDocument(this.mContext.getContentResolver(), this.mUri);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return androidx.documentfile.provider.DocumentsContractApi19.exists(this.mContext, this.mUri);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
        android.content.ContentResolver contentResolver = this.mContext.getContentResolver();
        android.net.Uri uri = this.mUri;
        android.net.Uri uriBuildChildDocumentsUriUsingTree = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(uri, android.provider.DocumentsContract.getDocumentId(uri));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new java.lang.String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(android.provider.DocumentsContract.buildDocumentUriUsingTree(this.mUri, cursorQuery.getString(0)));
                }
            } catch (java.lang.Exception e) {
                android.util.Log.w("DocumentFile", "Failed query: " + e);
            }
            closeQuietly(cursorQuery);
            android.net.Uri[] uriArr = (android.net.Uri[]) arrayList.toArray(new android.net.Uri[arrayList.size()]);
            androidx.documentfile.provider.DocumentFile[] documentFileArr = new androidx.documentfile.provider.DocumentFile[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                documentFileArr[i] = new androidx.documentfile.provider.TreeDocumentFile(this, this.mContext, uriArr[i]);
            }
            return documentFileArr;
        } catch (java.lang.Throwable th) {
            closeQuietly(cursorQuery);
            throw th;
        }
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

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String str) {
        try {
            android.net.Uri uriRenameDocument = android.provider.DocumentsContract.renameDocument(this.mContext.getContentResolver(), this.mUri, str);
            if (uriRenameDocument != null) {
                this.mUri = uriRenameDocument;
                return true;
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }
}

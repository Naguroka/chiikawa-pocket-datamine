package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes.dex */
class SingleDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.content.Context mContext;
    private android.net.Uri mUri;

    SingleDocumentFile(androidx.documentfile.provider.DocumentFile documentFile, android.content.Context context, android.net.Uri uri) {
        super(documentFile);
        this.mContext = context;
        this.mUri = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String str, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
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
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }
}

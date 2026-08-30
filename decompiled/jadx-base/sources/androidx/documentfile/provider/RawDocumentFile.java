package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes.dex */
class RawDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private java.io.File mFile;

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return false;
    }

    RawDocumentFile(androidx.documentfile.provider.DocumentFile documentFile, java.io.File file) {
        super(documentFile);
        this.mFile = file;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String str, java.lang.String str2) {
        java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        java.io.File file = new java.io.File(this.mFile, str2);
        try {
            file.createNewFile();
            return new androidx.documentfile.provider.RawDocumentFile(this, file);
        } catch (java.io.IOException e) {
            android.util.Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String str) {
        java.io.File file = new java.io.File(this.mFile, str);
        if (file.isDirectory() || file.mkdir()) {
            return new androidx.documentfile.provider.RawDocumentFile(this, file);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
        return android.net.Uri.fromFile(this.mFile);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
        return this.mFile.getName();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
        if (this.mFile.isDirectory()) {
            return null;
        }
        return getTypeForName(this.mFile.getName());
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return this.mFile.isDirectory();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return this.mFile.isFile();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return this.mFile.lastModified();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return this.mFile.length();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return this.mFile.canRead();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return this.mFile.canWrite();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        deleteContents(this.mFile);
        return this.mFile.delete();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return this.mFile.exists();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] fileArrListFiles = this.mFile.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file : fileArrListFiles) {
                arrayList.add(new androidx.documentfile.provider.RawDocumentFile(this, file));
            }
        }
        return (androidx.documentfile.provider.DocumentFile[]) arrayList.toArray(new androidx.documentfile.provider.DocumentFile[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String str) {
        java.io.File file = new java.io.File(this.mFile.getParentFile(), str);
        if (!this.mFile.renameTo(file)) {
            return false;
        }
        this.mFile = file;
        return true;
    }

    private static java.lang.String getTypeForName(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    private static boolean deleteContents(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        boolean zDeleteContents = true;
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteContents &= deleteContents(file2);
                }
                if (!file2.delete()) {
                    android.util.Log.w("DocumentFile", "Failed to delete " + file2);
                    zDeleteContents = false;
                }
            }
        }
        return zDeleteContents;
    }
}

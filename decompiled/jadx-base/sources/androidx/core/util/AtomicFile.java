package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class AtomicFile {
    private static final java.lang.String LOG_TAG = "AtomicFile";
    private final java.io.File mBaseName;
    private final java.io.File mLegacyBackupName;
    private final java.io.File mNewName;

    public AtomicFile(java.io.File file) {
        this.mBaseName = file;
        this.mNewName = new java.io.File(file.getPath() + ".new");
        this.mLegacyBackupName = new java.io.File(file.getPath() + ".bak");
    }

    public java.io.File getBaseFile() {
        return this.mBaseName;
    }

    public void delete() {
        this.mBaseName.delete();
        this.mNewName.delete();
        this.mLegacyBackupName.delete();
    }

    public java.io.FileOutputStream startWrite() throws java.io.IOException {
        if (this.mLegacyBackupName.exists()) {
            rename(this.mLegacyBackupName, this.mBaseName);
        }
        try {
            return new java.io.FileOutputStream(this.mNewName);
        } catch (java.io.FileNotFoundException unused) {
            if (!this.mNewName.getParentFile().mkdirs()) {
                throw new java.io.IOException("Failed to create directory for " + this.mNewName);
            }
            try {
                return new java.io.FileOutputStream(this.mNewName);
            } catch (java.io.FileNotFoundException e) {
                throw new java.io.IOException("Failed to create new file " + this.mNewName, e);
            }
        }
    }

    public void finishWrite(java.io.FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!sync(fileOutputStream)) {
            android.util.Log.e(LOG_TAG, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (java.io.IOException e) {
            android.util.Log.e(LOG_TAG, "Failed to close file output stream", e);
        }
        rename(this.mNewName, this.mBaseName);
    }

    public void failWrite(java.io.FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!sync(fileOutputStream)) {
            android.util.Log.e(LOG_TAG, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (java.io.IOException e) {
            android.util.Log.e(LOG_TAG, "Failed to close file output stream", e);
        }
        if (this.mNewName.delete()) {
            return;
        }
        android.util.Log.e(LOG_TAG, "Failed to delete new file " + this.mNewName);
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
        if (this.mLegacyBackupName.exists()) {
            rename(this.mLegacyBackupName, this.mBaseName);
        }
        if (this.mNewName.exists() && this.mBaseName.exists() && !this.mNewName.delete()) {
            android.util.Log.e(LOG_TAG, "Failed to delete outdated new file " + this.mNewName);
        }
        return new java.io.FileInputStream(this.mBaseName);
    }

    public byte[] readFully() throws java.io.IOException {
        java.io.FileInputStream fileInputStreamOpenRead = openRead();
        try {
            byte[] bArr = new byte[fileInputStreamOpenRead.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamOpenRead.read(bArr, i, bArr.length - i);
                if (i2 > 0) {
                    i += i2;
                    int iAvailable = fileInputStreamOpenRead.available();
                    if (iAvailable > bArr.length - i) {
                        byte[] bArr2 = new byte[iAvailable + i];
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                } else {
                    fileInputStreamOpenRead.close();
                    return bArr;
                }
            }
        } catch (java.lang.Throwable th) {
            fileInputStreamOpenRead.close();
            throw th;
        }
    }

    private static boolean sync(java.io.FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private static void rename(java.io.File file, java.io.File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            android.util.Log.e(LOG_TAG, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        android.util.Log.e(LOG_TAG, "Failed to rename " + file + " to " + file2);
    }
}

package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class LibraryLoader {
    private static final java.lang.String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private java.lang.String[] nativeLibraries;

    protected abstract void loadLibrary(java.lang.String str);

    public LibraryLoader(java.lang.String... strArr) {
        this.nativeLibraries = strArr;
    }

    public synchronized void setLibraries(java.lang.String... strArr) {
        androidx.media3.common.util.Assertions.checkState(!this.loadAttempted, "Cannot set libraries after loading");
        this.nativeLibraries = strArr;
    }

    public synchronized boolean isAvailable() {
        if (this.loadAttempted) {
            return this.isAvailable;
        }
        this.loadAttempted = true;
        try {
            for (java.lang.String str : this.nativeLibraries) {
                loadLibrary(str);
            }
            this.isAvailable = true;
        } catch (java.lang.UnsatisfiedLinkError unused) {
            androidx.media3.common.util.Log.w(TAG, "Failed to load " + java.util.Arrays.toString(this.nativeLibraries));
        }
        return this.isAvailable;
    }
}

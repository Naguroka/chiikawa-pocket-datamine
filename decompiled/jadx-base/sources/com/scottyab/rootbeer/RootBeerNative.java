package com.scottyab.rootbeer;

/* JADX INFO: loaded from: classes3.dex */
public class RootBeerNative {
    private static boolean libraryLoaded = false;

    public native int checkForRoot(java.lang.Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    static {
        try {
            java.lang.System.loadLibrary("toolChecker");
            libraryLoaded = true;
        } catch (java.lang.UnsatisfiedLinkError e) {
            com.scottyab.rootbeer.util.QLog.e(e);
        }
    }

    public boolean wasNativeLibraryLoaded() {
        return libraryLoaded;
    }
}

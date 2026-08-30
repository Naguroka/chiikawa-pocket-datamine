package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
public class CrashpadMain {
    public static native void crashpadMain(java.lang.String[] strArr);

    public static void main(java.lang.String[] strArr) {
        try {
            java.lang.String str = strArr[1];
            android.util.Log.d(com.google.firebase.crashlytics.internal.Logger.TAG, "Path to shared objects is " + str);
            java.lang.System.load(str + "libcrashlytics-handler.so");
            crashpadMain(strArr);
        } catch (java.lang.UnsatisfiedLinkError e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}

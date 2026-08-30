package com.google.googlesignin;

/* JADX INFO: loaded from: classes5.dex */
public class GoogleSignInHelper {
    private static final java.lang.String TAG = "SignInFragment";
    public static boolean loggingEnabled = false;

    public static native void nativeOnResult(long j, int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount);

    public static void enableDebugLogging(boolean z) {
        loggingEnabled = z;
    }

    public static void configure(android.app.Activity activity, boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, java.lang.String str2, java.lang.String[] strArr, long j) {
        logDebug("TokenFragment.configure called");
        com.google.googlesignin.TokenRequest tokenRequest = new com.google.googlesignin.TokenRequest(z, str, z2, z3, z4, z5, z6, str2, strArr, j);
        com.google.googlesignin.GoogleSignInFragment googleSignInFragment = com.google.googlesignin.GoogleSignInFragment.getInstance(activity);
        if (tokenRequest.isValid()) {
            if (googleSignInFragment.submitRequest(tokenRequest)) {
                return;
            }
            logError("There is already a pending authentication token request!");
            return;
        }
        nativeOnResult(j, 10, null);
    }

    public static void signIn(android.app.Activity activity, long j) {
        logDebug("AuthHelperFragment.authenticate called!");
        if (com.google.googlesignin.GoogleSignInFragment.getInstance(activity).startSignIn()) {
            return;
        }
        nativeOnResult(j, 10, null);
    }

    public static void signInSilently(android.app.Activity activity, long j) {
        logDebug("AuthHelperFragment.signinSilently called!");
        if (com.google.googlesignin.GoogleSignInFragment.getInstance(activity).startSignInSilently()) {
            return;
        }
        nativeOnResult(j, 10, null);
    }

    public static void signOut(android.app.Activity activity) {
        com.google.googlesignin.GoogleSignInFragment.getInstance(activity).signOut();
    }

    public static void disconnect(android.app.Activity activity) {
        com.google.googlesignin.GoogleSignInFragment.getInstance(activity).disconnect();
    }

    public static void logInfo(java.lang.String str) {
        if (loggingEnabled) {
            android.util.Log.i(TAG, str);
        }
    }

    public static void logError(java.lang.String str) {
        android.util.Log.e(TAG, str);
    }

    public static void logDebug(java.lang.String str) {
        if (loggingEnabled) {
            android.util.Log.d(TAG, str);
        }
    }
}

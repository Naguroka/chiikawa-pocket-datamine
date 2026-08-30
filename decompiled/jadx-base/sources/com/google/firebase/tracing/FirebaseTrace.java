package com.google.firebase.tracing;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseTrace {
    private FirebaseTrace() {
    }

    public static void pushTrace(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }

    public static void popTrace() {
        android.os.Trace.endSection();
    }
}

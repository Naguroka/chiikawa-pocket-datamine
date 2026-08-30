package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static java.lang.String detectVersion() {
        try {
            return kotlin.KotlinVersion.CURRENT.toString();
        } catch (java.lang.NoClassDefFoundError unused) {
            return null;
        }
    }
}

package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class CrashUtils {
    private static final java.lang.String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean addDynamiteErrorToDropBox(android.content.Context context, java.lang.Throwable th) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(th);
            return false;
        } catch (java.lang.Exception e) {
            android.util.Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}

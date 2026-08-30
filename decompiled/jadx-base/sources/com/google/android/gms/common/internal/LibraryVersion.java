package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class LibraryVersion {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("LibraryVersion", "");
    private static final com.google.android.gms.common.internal.LibraryVersion zzb = new com.google.android.gms.common.internal.LibraryVersion();
    private final java.util.concurrent.ConcurrentHashMap zzc = new java.util.concurrent.ConcurrentHashMap();

    protected LibraryVersion() {
    }

    public static com.google.android.gms.common.internal.LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    @java.lang.Deprecated
    public java.lang.String getVersion(java.lang.String str) throws java.lang.Throwable {
        ?? r4;
        java.io.InputStream resourceAsStream;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzc.containsKey(str)) {
            return (java.lang.String) this.zzc.get(str);
        }
        java.util.Properties properties = new java.util.Properties();
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        java.io.InputStream inputStream = null;
        try {
            try {
                resourceAsStream = com.google.android.gms.common.internal.LibraryVersion.class.getResourceAsStream(java.lang.String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        java.lang.String property = properties.getProperty("version", null);
                        zza.v("LibraryVersion", str + " version is " + property);
                        r3 = property;
                    } else {
                        zza.w("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    r4 = r3;
                    inputStream = resourceAsStream;
                    zza.e("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    ?? r7 = r4;
                    resourceAsStream = inputStream;
                    r3 = r7;
                } catch (java.lang.Throwable th) {
                    th = th;
                    r3 = resourceAsStream;
                    if (r3 != 0) {
                        com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r3);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            r4 = 0;
        }
        if (resourceAsStream != null) {
            com.google.android.gms.common.util.IOUtils.closeQuietly(resourceAsStream);
        }
        if (r3 == 0) {
            zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            r3 = "UNKNOWN";
        }
        this.zzc.put(str, r3);
        return r3;
    }
}

package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public interface ContentMetadata {
    public static final java.lang.String KEY_CONTENT_LENGTH = "exo_len";
    public static final java.lang.String KEY_CUSTOM_PREFIX = "custom_";
    public static final java.lang.String KEY_REDIRECTED_URI = "exo_redir";

    boolean contains(java.lang.String str);

    long get(java.lang.String str, long j);

    java.lang.String get(java.lang.String str, java.lang.String str2);

    byte[] get(java.lang.String str, byte[] bArr);

    static long getContentLength(androidx.media3.datasource.cache.ContentMetadata contentMetadata) {
        return contentMetadata.get(KEY_CONTENT_LENGTH, -1L);
    }

    static android.net.Uri getRedirectedUri(androidx.media3.datasource.cache.ContentMetadata contentMetadata) {
        java.lang.String str = contentMetadata.get(KEY_REDIRECTED_URI, (java.lang.String) null);
        if (str == null) {
            return null;
        }
        return android.net.Uri.parse(str);
    }
}

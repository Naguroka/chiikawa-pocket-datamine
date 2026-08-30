package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class ContentProviderCompat {
    private ContentProviderCompat() {
    }

    public static android.content.Context requireContext(android.content.ContentProvider contentProvider) {
        android.content.Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("Cannot find context from the provider.");
    }
}

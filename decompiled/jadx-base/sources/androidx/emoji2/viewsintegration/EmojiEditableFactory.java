package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiEditableFactory extends android.text.Editable.Factory {
    private static final java.lang.Object INSTANCE_LOCK = new java.lang.Object();
    private static volatile android.text.Editable.Factory sInstance;
    private static java.lang.Class<?> sWatcherClass;

    private EmojiEditableFactory() {
        try {
            sWatcherClass = java.lang.Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static android.text.Editable.Factory getInstance() {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                if (sInstance == null) {
                    sInstance = new androidx.emoji2.viewsintegration.EmojiEditableFactory();
                }
            }
        }
        return sInstance;
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class<?> cls = sWatcherClass;
        if (cls != null) {
            return androidx.emoji2.text.SpannableBuilder.create(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}

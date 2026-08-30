package androidx.window.embedding;

/* JADX INFO: compiled from: EmbeddingCompat.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "()V", "embeddingExtension", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/EmbeddingAdapter;)V", "setEmbeddingCallback", "", "embeddingCallback", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "setSplitRules", "rules", "", "Landroidx/window/embedding/EmbeddingRule;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EmbeddingCompat implements androidx.window.embedding.EmbeddingInterfaceCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.EmbeddingCompat.Companion INSTANCE = new androidx.window.embedding.EmbeddingCompat.Companion(null);
    public static final boolean DEBUG = true;
    private static final java.lang.String TAG = "EmbeddingCompat";
    private final androidx.window.embedding.EmbeddingAdapter adapter;
    private final androidx.window.extensions.embedding.ActivityEmbeddingComponent embeddingExtension;

    public EmbeddingCompat(androidx.window.extensions.embedding.ActivityEmbeddingComponent embeddingExtension, androidx.window.embedding.EmbeddingAdapter adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingExtension, "embeddingExtension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }

    public EmbeddingCompat() {
        this(INSTANCE.embeddingComponent(), new androidx.window.embedding.EmbeddingAdapter());
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(rules));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingCallback, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new androidx.window.embedding.EmbeddingTranslatingCallback(embeddingCallback, this.adapter));
    }

    /* JADX INFO: compiled from: EmbeddingCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\r\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "()V", "DEBUG", "", "TAG", "", "embeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "getExtensionApiLevel", "", "()Ljava/lang/Integer;", "isEmbeddingAvailable", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.Integer getExtensionApiLevel() {
            try {
                return java.lang.Integer.valueOf(androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (java.lang.NoClassDefFoundError unused) {
                android.util.Log.d(androidx.window.embedding.EmbeddingCompat.TAG, "Embedding extension version not found");
                return null;
            } catch (java.lang.UnsupportedOperationException unused2) {
                android.util.Log.d(androidx.window.embedding.EmbeddingCompat.TAG, "Stub Extension");
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            try {
                return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (java.lang.NoClassDefFoundError unused) {
                android.util.Log.d(androidx.window.embedding.EmbeddingCompat.TAG, "Embedding extension version not found");
                return false;
            } catch (java.lang.UnsupportedOperationException unused2) {
                android.util.Log.d(androidx.window.embedding.EmbeddingCompat.TAG, "Stub Extension");
                return false;
            }
        }

        public final androidx.window.extensions.embedding.ActivityEmbeddingComponent embeddingComponent() {
            if (isEmbeddingAvailable()) {
                androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                return activityEmbeddingComponent == null ? new androidx.window.embedding.EmptyEmbeddingComponent() : activityEmbeddingComponent;
            }
            return new androidx.window.embedding.EmptyEmbeddingComponent();
        }
    }
}

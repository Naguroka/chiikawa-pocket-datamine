package androidx.window.embedding;

/* JADX INFO: compiled from: EmbeddingBackend.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J,\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H&J\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u001c\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H&¨\u0006\u0018"}, d2 = {"Landroidx/window/embedding/EmbeddingBackend;", "", "getSplitRules", "", "Landroidx/window/embedding/EmbeddingRule;", "isSplitSupported", "", "registerRule", "", "rule", "registerSplitListenerForActivity", "activity", "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "setSplitRules", "rules", "unregisterRule", "unregisterSplitListenerForActivity", "consumer", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface EmbeddingBackend {
    java.util.Set<androidx.window.embedding.EmbeddingRule> getSplitRules();

    boolean isSplitSupported();

    void registerRule(androidx.window.embedding.EmbeddingRule rule);

    void registerSplitListenerForActivity(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> callback);

    void setSplitRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> rules);

    void unregisterRule(androidx.window.embedding.EmbeddingRule rule);

    void unregisterSplitListenerForActivity(androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> consumer);
}

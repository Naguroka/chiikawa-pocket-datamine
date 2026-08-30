package androidx.window.embedding;

/* JADX INFO: compiled from: SplitController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u0006\u0010\u0012\u001a\u00020\tJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007J\u001a\u0010\u0018\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u0016\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/window/embedding/SplitController;", "", "()V", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "staticSplitRules", "", "Landroidx/window/embedding/EmbeddingRule;", "addSplitListener", "", "activity", "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "consumer", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "clearRegisteredRules", "getSplitRules", "isSplitSupported", "", "registerRule", "rule", "removeSplitListener", "setStaticSplitRules", "staticRules", "unregisterRule", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplitController {
    private static volatile androidx.window.embedding.SplitController globalInstance = null;
    public static final boolean sDebug = false;
    private final androidx.window.embedding.EmbeddingBackend embeddingBackend;
    private java.util.Set<? extends androidx.window.embedding.EmbeddingRule> staticSplitRules;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.SplitController.Companion INSTANCE = new androidx.window.embedding.SplitController.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock globalLock = new java.util.concurrent.locks.ReentrantLock();

    public /* synthetic */ SplitController(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.embedding.SplitController getInstance() {
        return INSTANCE.getInstance();
    }

    @kotlin.jvm.JvmStatic
    public static final void initialize(android.content.Context context, int i) {
        INSTANCE.initialize(context, i);
    }

    private SplitController() {
        this.embeddingBackend = androidx.window.embedding.ExtensionEmbeddingBackend.INSTANCE.getInstance();
        this.staticSplitRules = kotlin.collections.SetsKt.emptySet();
    }

    public final java.util.Set<androidx.window.embedding.EmbeddingRule> getSplitRules() {
        return kotlin.collections.CollectionsKt.toSet(this.embeddingBackend.getSplitRules());
    }

    public final void registerRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "rule");
        this.embeddingBackend.registerRule(rule);
    }

    public final void unregisterRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "rule");
        this.embeddingBackend.unregisterRule(rule);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final void addSplitListener(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void removeSplitListener(androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(consumer);
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> staticRules) {
        this.staticSplitRules = staticRules;
        this.embeddingBackend.setSplitRules(staticRules);
    }

    /* JADX INFO: compiled from: SplitController.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "()V", "globalInstance", "Landroidx/window/embedding/SplitController;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "sDebug", "", "getInstance", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "context", "Landroid/content/Context;", "staticRuleResourceId", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.embedding.SplitController getInstance() {
            if (androidx.window.embedding.SplitController.globalInstance == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = androidx.window.embedding.SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (androidx.window.embedding.SplitController.globalInstance == null) {
                        androidx.window.embedding.SplitController.Companion companion = androidx.window.embedding.SplitController.INSTANCE;
                        androidx.window.embedding.SplitController.globalInstance = new androidx.window.embedding.SplitController(null);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            androidx.window.embedding.SplitController splitController = androidx.window.embedding.SplitController.globalInstance;
            kotlin.jvm.internal.Intrinsics.checkNotNull(splitController);
            return splitController;
        }

        @kotlin.jvm.JvmStatic
        public final void initialize(android.content.Context context, int staticRuleResourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.util.Set<androidx.window.embedding.EmbeddingRule> splitRules$window_release = new androidx.window.embedding.SplitRuleParser().parseSplitRules$window_release(context, staticRuleResourceId);
            androidx.window.embedding.SplitController companion = getInstance();
            if (splitRules$window_release == null) {
                splitRules$window_release = kotlin.collections.SetsKt.emptySet();
            }
            companion.setStaticSplitRules(splitRules$window_release);
        }
    }
}

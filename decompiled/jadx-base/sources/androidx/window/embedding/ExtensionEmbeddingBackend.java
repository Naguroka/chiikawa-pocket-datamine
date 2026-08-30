package androidx.window.embedding;

/* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J,\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!H\u0016J\u0016\u0010$\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001c\u0010'\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "splitChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "getSplitChangeCallbacks$annotations", "()V", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "splitInfoEmbeddingCallback", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "splitRules", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "", "isSplitSupported", "", "registerRule", "", "rule", "registerSplitListenerForActivity", "activity", "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "setSplitRules", "rules", "unregisterRule", "unregisterSplitListenerForActivity", "consumer", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExtensionEmbeddingBackend implements androidx.window.embedding.EmbeddingBackend {
    private static final java.lang.String TAG = "EmbeddingBackend";
    private static volatile androidx.window.embedding.ExtensionEmbeddingBackend globalInstance;
    private androidx.window.embedding.EmbeddingInterfaceCompat embeddingExtension;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper> splitChangeCallbacks;
    private final androidx.window.embedding.ExtensionEmbeddingBackend.EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.window.embedding.EmbeddingRule> splitRules;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.ExtensionEmbeddingBackend.Companion INSTANCE = new androidx.window.embedding.ExtensionEmbeddingBackend.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock globalLock = new java.util.concurrent.locks.ReentrantLock();

    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    public ExtensionEmbeddingBackend(androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        androidx.window.embedding.ExtensionEmbeddingBackend.EmbeddingCallbackImpl embeddingCallbackImpl = new androidx.window.embedding.ExtensionEmbeddingBackend.EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();
        androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new java.util.concurrent.CopyOnWriteArraySet<>();
    }

    public final androidx.window.embedding.EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    public final void setEmbeddingExtension(androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "()V", "TAG", "", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "initAndVerifyEmbeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "isExtensionVersionSupported", "", "extensionVersion", "", "(Ljava/lang/Integer;)Z", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.window.embedding.ExtensionEmbeddingBackend getInstance() {
            if (androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = androidx.window.embedding.ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance == null) {
                        androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompatInitAndVerifyEmbeddingExtension = androidx.window.embedding.ExtensionEmbeddingBackend.INSTANCE.initAndVerifyEmbeddingExtension();
                        androidx.window.embedding.ExtensionEmbeddingBackend.Companion companion = androidx.window.embedding.ExtensionEmbeddingBackend.INSTANCE;
                        androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance = new androidx.window.embedding.ExtensionEmbeddingBackend(embeddingInterfaceCompatInitAndVerifyEmbeddingExtension);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            androidx.window.embedding.ExtensionEmbeddingBackend extensionEmbeddingBackend = androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance;
            kotlin.jvm.internal.Intrinsics.checkNotNull(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        private final androidx.window.embedding.EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            androidx.window.embedding.EmbeddingCompat embeddingCompat = null;
            try {
                if (isExtensionVersionSupported(androidx.window.embedding.EmbeddingCompat.INSTANCE.getExtensionApiLevel()) && androidx.window.embedding.EmbeddingCompat.INSTANCE.isEmbeddingAvailable()) {
                    embeddingCompat = new androidx.window.embedding.EmbeddingCompat();
                }
            } catch (java.lang.Throwable th) {
                android.util.Log.d(androidx.window.embedding.ExtensionEmbeddingBackend.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Failed to load embedding extension: ", th));
            }
            if (embeddingCompat == null) {
                android.util.Log.d(androidx.window.embedding.ExtensionEmbeddingBackend.TAG, "No supported embedding extension found");
            }
            return embeddingCompat;
        }

        public final boolean isExtensionVersionSupported(java.lang.Integer extensionVersion) {
            return extensionVersion != null && extensionVersion.intValue() >= 1;
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public java.util.Set<androidx.window.embedding.EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "rule");
        if (this.splitRules.contains(rule)) {
            return;
        }
        this.splitRules.add(rule);
        androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat == null) {
                return;
            }
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0002\u0010\nJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "activity", "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "getCallback", "()Landroidx/core/util/Consumer;", "lastValue", "accept", "", "splitInfoList", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SplitListenerWrapper {
        private final android.app.Activity activity;
        private final androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> callback;
        private final java.util.concurrent.Executor executor;
        private java.util.List<androidx.window.embedding.SplitInfo> lastValue;

        public SplitListenerWrapper(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        public final androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> getCallback() {
            return this.callback;
        }

        public final void accept(java.util.List<androidx.window.embedding.SplitInfo> splitInfoList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : splitInfoList) {
                if (((androidx.window.embedding.SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            final java.util.ArrayList arrayList2 = arrayList;
            if (kotlin.jvm.internal.Intrinsics.areEqual(arrayList2, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList2;
            this.executor.execute(new java.lang.Runnable() { // from class: androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper.m476accept$lambda1(this.f$0, arrayList2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: accept$lambda-1, reason: not valid java name */
        public static final void m476accept$lambda1(androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper this$0, java.util.List splitsWithActivity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                android.util.Log.v(TAG, "Extension not loaded, skipping callback registration.");
                callback.accept(kotlin.collections.CollectionsKt.emptyList());
                return;
            }
            androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper = new androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper(activity, executor, callback);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                java.util.List<androidx.window.embedding.SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(kotlin.collections.CollectionsKt.emptyList());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterSplitListenerForActivity(androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "consumer");
        java.util.concurrent.locks.ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            for (androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper : getSplitChangeCallbacks()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(splitListenerWrapper.getCallback(), consumer)) {
                    getSplitChangeCallbacks().remove(splitListenerWrapper);
                    break;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "lastInfo", "", "Landroidx/window/embedding/SplitInfo;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "(Ljava/util/List;)V", "onSplitInfoChanged", "", "splitInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class EmbeddingCallbackImpl implements androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private java.util.List<androidx.window.embedding.SplitInfo> lastInfo;
        final /* synthetic */ androidx.window.embedding.ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(androidx.window.embedding.ExtensionEmbeddingBackend this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        public final java.util.List<androidx.window.embedding.SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(java.util.List<androidx.window.embedding.SplitInfo> list) {
            this.lastInfo = list;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(java.util.List<androidx.window.embedding.SplitInfo> splitInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            java.util.Iterator<androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }
}

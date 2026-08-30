package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements androidx.startup.Initializer<java.lang.Boolean> {
    private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500;
    private static final java.lang.String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public java.lang.Boolean create(android.content.Context context) {
        androidx.emoji2.text.EmojiCompat.init(new androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultConfig(context));
        delayUntilFirstResume(context);
        return true;
    }

    void delayUntilFirstResume(android.content.Context context) {
        final androidx.lifecycle.Lifecycle lifecycle = ((androidx.lifecycle.LifecycleOwner) androidx.startup.AppInitializer.getInstance(context).initializeComponent(androidx.lifecycle.ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new androidx.lifecycle.DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
                androidx.emoji2.text.EmojiCompatInitializer.this.loadEmojiCompatAfterDelay();
                lifecycle.removeObserver(this);
            }
        });
    }

    void loadEmojiCompatAfterDelay() {
        androidx.emoji2.text.ConcurrencyHelpers.mainHandlerAsync().postDelayed(new androidx.emoji2.text.EmojiCompatInitializer.LoadEmojiCompatRunnable(), 500L);
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return java.util.Collections.singletonList(androidx.lifecycle.ProcessLifecycleInitializer.class);
    }

    static class LoadEmojiCompatRunnable implements java.lang.Runnable {
        LoadEmojiCompatRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.EmojiCompat.isConfigured()) {
                    androidx.emoji2.text.EmojiCompat.get().load();
                }
            } finally {
                androidx.core.os.TraceCompat.endSection();
            }
        }
    }

    static class BackgroundDefaultConfig extends androidx.emoji2.text.EmojiCompat.Config {
        protected BackgroundDefaultConfig(android.content.Context context) {
            super(new androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader(context));
            setMetadataLoadStrategy(1);
        }
    }

    static class BackgroundDefaultLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private final android.content.Context mContext;

        BackgroundDefaultLoader(android.content.Context context) {
            this.mContext = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(final androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final java.util.concurrent.ThreadPoolExecutor threadPoolExecutorCreateBackgroundPriorityExecutor = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor(androidx.emoji2.text.EmojiCompatInitializer.S_INITIALIZER_THREAD_NAME);
            threadPoolExecutorCreateBackgroundPriorityExecutor.execute(new java.lang.Runnable() { // from class: androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m47x5cc8028a(metadataRepoLoaderCallback, threadPoolExecutorCreateBackgroundPriorityExecutor);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: doLoad, reason: merged with bridge method [inline-methods] */
        public void m47x5cc8028a(final androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, final java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            try {
                androidx.emoji2.text.FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigCreate = androidx.emoji2.text.DefaultEmojiCompatConfig.create(this.mContext);
                if (fontRequestEmojiCompatConfigCreate == null) {
                    throw new java.lang.RuntimeException("EmojiCompat font provider not available on this device.");
                }
                fontRequestEmojiCompatConfigCreate.setLoadingExecutor(threadPoolExecutor);
                fontRequestEmojiCompatConfigCreate.getMetadataRepoLoader().load(new androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(androidx.emoji2.text.MetadataRepo metadataRepo) {
                        try {
                            metadataRepoLoaderCallback.onLoaded(metadataRepo);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(java.lang.Throwable th) {
                        try {
                            metadataRepoLoaderCallback.onFailed(th);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }
                });
            } catch (java.lang.Throwable th) {
                metadataRepoLoaderCallback.onFailed(th);
                threadPoolExecutor.shutdown();
            }
        }
    }
}

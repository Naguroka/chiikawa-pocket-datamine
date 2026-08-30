package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallerInitializer implements androidx.startup.Initializer<androidx.profileinstaller.ProfileInstallerInitializer.Result> {
    private static final int DELAY_MS = 5000;

    public static class Result {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public androidx.profileinstaller.ProfileInstallerInitializer.Result create(android.content.Context context) {
        delayAfterFirstFrame(context.getApplicationContext());
        return new androidx.profileinstaller.ProfileInstallerInitializer.Result();
    }

    void delayAfterFirstFrame(final android.content.Context context) {
        androidx.profileinstaller.ProfileInstallerInitializer.Choreographer16Impl.postFrameCallback(new java.lang.Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m465xfbd6c934(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: installAfterDelay, reason: merged with bridge method [inline-methods] */
    public void m465xfbd6c934(final android.content.Context context) {
        android.os.Handler handler;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            handler = androidx.profileinstaller.ProfileInstallerInitializer.Handler28Impl.createAsync(android.os.Looper.getMainLooper());
        } else {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.postDelayed(new java.lang.Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.ProfileInstallerInitializer.writeInBackground(context);
            }
        }, new java.util.Random().nextInt(java.lang.Math.max(1000, 1)) + 5000);
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return java.util.Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeInBackground(final android.content.Context context) {
        new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.ProfileInstaller.writeProfile(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Choreographer16Impl {
        private Choreographer16Impl() {
        }

        public static void postFrameCallback(final java.lang.Runnable runnable) {
            android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$Choreographer16Impl$$ExternalSyntheticLambda0
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    private static class Handler28Impl {
        private Handler28Impl() {
        }

        public static android.os.Handler createAsync(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }
}

package com.google.firebase.crashlytics.internal.concurrency;

/* JADX INFO: compiled from: CrashlyticsWorkers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers;", "", "backgroundExecutorService", "Ljava/util/concurrent/ExecutorService;", "blockingExecutorService", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "common", "Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorker;", "dataCollect", "diskWrite", "network", "Companion", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CrashlyticsWorkers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion INSTANCE = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion(null);
    private static boolean enforcement;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker common;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker dataCollect;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker diskWrite;
    public final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker network;

    @kotlin.jvm.JvmStatic
    public static final void checkBackgroundThread() {
        INSTANCE.checkBackgroundThread();
    }

    @kotlin.jvm.JvmStatic
    public static final void checkBlockingThread() {
        INSTANCE.checkBlockingThread();
    }

    @kotlin.jvm.JvmStatic
    public static final void checkNotMainThread() {
        INSTANCE.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return INSTANCE.getEnforcement();
    }

    public static final void setEnforcement(boolean z) {
        INSTANCE.setEnforcement(z);
    }

    public CrashlyticsWorkers(java.util.concurrent.ExecutorService backgroundExecutorService, java.util.concurrent.ExecutorService blockingExecutorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.common = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker(backgroundExecutorService);
        this.diskWrite = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker(backgroundExecutorService);
        this.dataCollect = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker(backgroundExecutorService);
        this.network = new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker(blockingExecutorService);
    }

    /* JADX INFO: compiled from: CrashlyticsWorkers.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0007J$\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers$Companion;", "", "()V", "enforcement", "", "getEnforcement$annotations", "getEnforcement", "()Z", "setEnforcement", "(Z)V", "threadName", "", "kotlin.jvm.PlatformType", "getThreadName", "()Ljava/lang/String;", "checkBackgroundThread", "", "checkBlockingThread", "checkNotMainThread", "checkThread", "isCorrectThread", "Lkotlin/Function0;", "failureMessage", "isBackgroundThread", "isBlockingThread", "isNotMainThread", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void getEnforcement$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String getThreadName() {
            return java.lang.Thread.currentThread().getName();
        }

        public final boolean getEnforcement() {
            return com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z) {
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.enforcement = z;
        }

        @kotlin.jvm.JvmStatic
        public final void checkNotMainThread() {
            checkThread(new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    return "Must not be called on a main thread, was called on " + com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.INSTANCE.getThreadName() + '.';
                }
            });
        }

        @kotlin.jvm.JvmStatic
        public final void checkBlockingThread() {
            checkThread(new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    return "Must be called on a blocking thread, was called on " + com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.INSTANCE.getThreadName() + '.';
                }
            });
        }

        @kotlin.jvm.JvmStatic
        public final void checkBackgroundThread() {
            checkThread(new com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.String invoke() {
                    return "Must be called on a background thread, was called on " + com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.INSTANCE.getThreadName() + '.';
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !android.os.Looper.getMainLooper().isCurrentThread();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            java.lang.String threadName = getThreadName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
            return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) threadName, (java.lang.CharSequence) "Firebase Blocking Thread #", false, 2, (java.lang.Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            java.lang.String threadName = getThreadName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
            return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) threadName, (java.lang.CharSequence) "Firebase Background Thread #", false, 2, (java.lang.Object) null);
        }

        private final void checkThread(kotlin.jvm.functions.Function0<java.lang.Boolean> isCorrectThread, kotlin.jvm.functions.Function0<java.lang.String> failureMessage) {
            if (isCorrectThread.invoke().booleanValue()) {
                return;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().d(failureMessage.invoke());
            getEnforcement();
        }
    }
}

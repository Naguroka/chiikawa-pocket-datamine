package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class CrashlyticsUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener crashListener;
    private final java.lang.Thread.UncaughtExceptionHandler defaultHandler;
    private final java.util.concurrent.atomic.AtomicBoolean isHandlingException = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent nativeComponent;
    private final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;

    interface CrashListener {
        void onUncaughtException(com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, java.lang.Thread thread, java.lang.Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener crashListener, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:577)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:603)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.isHandlingException.set(true);
        try {
            try {
                if (shouldRecordUncaughtException(thread, th)) {
                    this.crashListener.onUncaughtException(this.settingsProvider, thread, th);
                } else {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.defaultHandler != null) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                    this.defaultHandler.uncaughtException(thread, th);
                } else {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing, but no default exception handler.");
                    java.lang.System.exit(1);
                }
            } catch (java.lang.Exception e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("An error occurred in the uncaught exception handler", e);
                if (this.defaultHandler != null) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                    this.defaultHandler.uncaughtException(thread, th);
                }
            }
            this.isHandlingException.set(false);
        } catch (java.lang.Throwable th2) {
            if (this.defaultHandler != null) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                this.defaultHandler.uncaughtException(thread, th);
            } else {
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing, but no default exception handler.");
                java.lang.System.exit(1);
            }
            this.isHandlingException.set(false);
            throw th2;
        }
    }

    boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    private boolean shouldRecordUncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        if (thread == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }
}

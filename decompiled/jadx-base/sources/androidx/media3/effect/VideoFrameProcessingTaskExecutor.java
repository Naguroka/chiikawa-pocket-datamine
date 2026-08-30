package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class VideoFrameProcessingTaskExecutor {
    private static final long RELEASE_WAIT_TIME_MS = 500;
    private final androidx.media3.effect.VideoFrameProcessingTaskExecutor.ErrorListener errorListener;
    private boolean shouldCancelTasks;
    private final boolean shouldShutdownExecutorService;
    private final java.util.concurrent.ExecutorService singleThreadExecutorService;
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.Queue<androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task> highPriorityTasks = new java.util.ArrayDeque();

    interface ErrorListener {
        void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException);
    }

    interface Task {
        void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException;
    }

    static /* synthetic */ void lambda$submitWithHighPriority$0() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
    }

    public VideoFrameProcessingTaskExecutor(java.util.concurrent.ExecutorService executorService, boolean z, androidx.media3.effect.VideoFrameProcessingTaskExecutor.ErrorListener errorListener) {
        this.singleThreadExecutorService = executorService;
        this.shouldShutdownExecutorService = z;
        this.errorListener = errorListener;
    }

    public void submit(androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task) {
        synchronized (this.lock) {
            if (this.shouldCancelTasks) {
                return;
            }
            try {
                wrapTaskAndSubmitToExecutorService(task, false);
                e = null;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                handleException(e);
            }
        }
    }

    public void submitWithHighPriority(androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task) {
        synchronized (this.lock) {
            if (this.shouldCancelTasks) {
                return;
            }
            this.highPriorityTasks.add(task);
            submit(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.VideoFrameProcessingTaskExecutor$$ExternalSyntheticLambda1
                @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
                public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                    androidx.media3.effect.VideoFrameProcessingTaskExecutor.lambda$submitWithHighPriority$0();
                }
            });
        }
    }

    public void flush() throws java.lang.InterruptedException {
        synchronized (this.lock) {
            this.shouldCancelTasks = true;
            this.highPriorityTasks.clear();
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        wrapTaskAndSubmitToExecutorService(new androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task() { // from class: androidx.media3.effect.VideoFrameProcessingTaskExecutor$$ExternalSyntheticLambda0
            @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
            public final void run() throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
                this.f$0.m111x9f36b2cf(countDownLatch);
            }
        }, true);
        countDownLatch.await();
    }

    /* JADX INFO: renamed from: lambda$flush$1$androidx-media3-effect-VideoFrameProcessingTaskExecutor, reason: not valid java name */
    /* synthetic */ void m111x9f36b2cf(java.util.concurrent.CountDownLatch countDownLatch) throws androidx.media3.common.VideoFrameProcessingException, androidx.media3.common.util.GlUtil.GlException {
        synchronized (this.lock) {
            this.shouldCancelTasks = false;
        }
        countDownLatch.countDown();
    }

    public void release(androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task) throws java.lang.InterruptedException {
        synchronized (this.lock) {
            this.shouldCancelTasks = true;
            this.highPriorityTasks.clear();
        }
        wrapTaskAndSubmitToExecutorService(task, true);
        if (this.shouldShutdownExecutorService) {
            this.singleThreadExecutorService.shutdown();
            if (this.singleThreadExecutorService.awaitTermination(500L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return;
            }
            this.errorListener.onError(new androidx.media3.common.VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    private java.util.concurrent.Future<?> wrapTaskAndSubmitToExecutorService(final androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task, final boolean z) {
        return this.singleThreadExecutorService.submit(new java.lang.Runnable() { // from class: androidx.media3.effect.VideoFrameProcessingTaskExecutor$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m112x7c7dc14d(z, task);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$wrapTaskAndSubmitToExecutorService$2$androidx-media3-effect-VideoFrameProcessingTaskExecutor, reason: not valid java name */
    /* synthetic */ void m112x7c7dc14d(boolean z, androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task task) {
        androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task taskPoll;
        try {
            synchronized (this.lock) {
                if (this.shouldCancelTasks && !z) {
                    return;
                }
                while (true) {
                    synchronized (this.lock) {
                        taskPoll = this.highPriorityTasks.poll();
                    }
                    if (taskPoll != null) {
                        taskPoll.run();
                    } else {
                        task.run();
                        return;
                    }
                }
            }
        } catch (java.lang.Exception e) {
            handleException(e);
        }
    }

    private void handleException(java.lang.Exception exc) {
        synchronized (this.lock) {
            if (this.shouldCancelTasks) {
                return;
            }
            this.shouldCancelTasks = true;
            this.errorListener.onError(androidx.media3.common.VideoFrameProcessingException.from(exc));
        }
    }
}

package com.json.environment.workerthread;

/* JADX INFO: loaded from: classes5.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.util.List<java.util.concurrent.Callable<T>> f2628a = new java.util.ArrayList();
    private final java.util.concurrent.ExecutorService b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(java.util.List<com.json.environment.workerthread.WorkerResult<T>> list, long j);

        void onWorkFailed(java.lang.String str);
    }

    public WorkerManager(java.util.concurrent.ExecutorService executorService) {
        this.b = executorService;
    }

    public void addCallable(java.util.concurrent.Callable<T> callable) {
        this.f2628a.add(callable);
    }

    public void startWork(com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener<T> workEndedListener, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.ironsource.environment.workerthread.WorkerResult.Canceled canceled;
        if (this.b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f2628a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.List<java.util.concurrent.Future<T>> listInvokeAll = this.b.invokeAll(this.f2628a, j, timeUnit);
            for (int i = 0; i < listInvokeAll.size(); i++) {
                java.util.concurrent.Future<T> future = listInvokeAll.get(i);
                if (!future.isDone() || future.isCancelled()) {
                    canceled = new com.ironsource.environment.workerthread.WorkerResult.Canceled(this.f2628a.get(i));
                } else {
                    try {
                        arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Completed(future.get()));
                    } catch (java.lang.InterruptedException e) {
                        e = e;
                        com.json.l9.d().a(e);
                        arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Failed(this.f2628a.get(i), e));
                    } catch (java.util.concurrent.CancellationException e2) {
                        com.json.l9.d().a(e2);
                        canceled = new com.ironsource.environment.workerthread.WorkerResult.Canceled(this.f2628a.get(i));
                        arrayList.add(canceled);
                    } catch (java.util.concurrent.ExecutionException e3) {
                        e = e3;
                        com.json.l9.d().a(e);
                        arrayList.add(new com.ironsource.environment.workerthread.WorkerResult.Failed(this.f2628a.get(i), e));
                    }
                }
                arrayList.add(canceled);
            }
            workEndedListener.onWorkCompleted(arrayList, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
            this.b.shutdownNow();
        } catch (java.lang.Exception e4) {
            com.json.l9.d().a(e4);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e4.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e4.getMessage());
            this.b.shutdownNow();
        }
    }
}

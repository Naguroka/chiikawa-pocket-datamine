package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class w7 {

    class a implements com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener<com.json.x7> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.w7.b f3527a;

        a(com.ironsource.w7.b bVar) {
            this.f3527a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(java.util.List<com.json.environment.workerthread.WorkerResult<com.json.x7>> list, long j) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.json.environment.workerthread.WorkerResult<com.json.x7> workerResult : list) {
                if (workerResult instanceof com.ironsource.environment.workerthread.WorkerResult.Completed) {
                    arrayList2.add((com.json.x7) ((com.ironsource.environment.workerthread.WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof com.ironsource.environment.workerthread.WorkerResult.Canceled) {
                    arrayList.add(((com.json.t7) ((com.ironsource.environment.workerthread.WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof com.ironsource.environment.workerthread.WorkerResult.Failed) {
                    com.ironsource.environment.workerthread.WorkerResult.Failed failed = (com.ironsource.environment.workerthread.WorkerResult.Failed) workerResult;
                    com.json.t7 t7Var = (com.json.t7) failed.callable;
                    arrayList2.add(new com.json.x7(t7Var.d(), t7Var.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            com.json.w7.this.a(arrayList2, arrayList, j);
            this.f3527a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(java.lang.String str) {
            java.lang.String str2 = "failed to collect bidding data, error= " + str;
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(str2);
            this.f3527a.onFailure(str2);
        }
    }

    public interface b {
        void a(java.util.List<com.json.x7> list, long j, java.util.List<java.lang.String> list2);

        void onFailure(java.lang.String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.List<com.json.x7> list, java.util.List<java.lang.String> list2, long j) {
        com.json.mediationsdk.logger.IronLog ironLog;
        java.lang.StringBuilder sbAppend;
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (com.json.x7 x7Var : list) {
            if (x7Var.a() != null) {
                ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                sbAppend = new java.lang.StringBuilder().append(x7Var.c()).append(" - success (").append(x7Var.e()).append(" millis)");
            } else {
                ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
                sbAppend = new java.lang.StringBuilder().append(x7Var.c()).append(" - failed (").append(x7Var.e()).append(" millis) error: ").append(x7Var.b());
            }
            ironLog.verbose(sbAppend.toString());
        }
        java.util.Iterator<java.lang.String> it = list2.iterator();
        while (it.hasNext()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(it.next() + " reached timeout");
        }
    }

    public void a(java.util.List<com.json.t7> list, com.ironsource.w7.b bVar, long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            com.json.environment.workerthread.WorkerManager workerManager = new com.json.environment.workerthread.WorkerManager(com.json.environment.thread.IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            java.util.Iterator<com.json.t7> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new com.ironsource.w7.a(bVar), j, timeUnit);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }
}

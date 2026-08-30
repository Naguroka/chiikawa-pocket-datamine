package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class RequestDeduplicator {
    private final java.util.concurrent.Executor executor;
    private final java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult>> getTokenRequests = new androidx.collection.ArrayMap();

    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    interface GetTokenRequest {
        com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> start();
    }

    RequestDeduplicator(java.util.concurrent.Executor executor) {
        this.executor = executor;
    }

    synchronized com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> getOrStartGetTokenRequest(java.lang.String str, java.lang.String str2, com.google.firebase.iid.RequestDeduplicator.GetTokenRequest getTokenRequest) {
        final android.util.Pair<java.lang.String, java.lang.String> pair = new android.util.Pair<>(str, str2);
        com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> task = this.getTokenRequests.get(pair);
        if (task != null) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                java.lang.String strValueOf = java.lang.String.valueOf(pair);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                android.util.Log.d("FirebaseInstanceId", sb.toString());
            }
            return task;
        }
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(pair);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            android.util.Log.d("FirebaseInstanceId", sb2.toString());
        }
        com.google.android.gms.tasks.Task taskContinueWithTask = getTokenRequest.start().continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation(this, pair) { // from class: com.google.firebase.iid.RequestDeduplicator$$Lambda$0
            private final com.google.firebase.iid.RequestDeduplicator arg$1;
            private final android.util.Pair arg$2;

            {
                this.arg$1 = this;
                this.arg$2 = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public java.lang.Object then(com.google.android.gms.tasks.Task task2) throws java.lang.Exception {
                this.arg$1.lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(this.arg$2, task2);
                return task2;
            }
        });
        this.getTokenRequests.put(pair, (com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult>) taskContinueWithTask);
        return taskContinueWithTask;
    }

    final /* synthetic */ com.google.android.gms.tasks.Task lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(android.util.Pair pair, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        synchronized (this) {
            this.getTokenRequests.remove(pair);
        }
        return task;
    }
}

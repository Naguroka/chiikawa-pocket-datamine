package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    com.google.android.gms.tasks.Task<TContinuationResult> then(TResult tresult) throws java.lang.Exception;
}

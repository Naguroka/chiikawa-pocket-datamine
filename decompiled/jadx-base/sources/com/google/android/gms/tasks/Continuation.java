package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(com.google.android.gms.tasks.Task<TResult> task) throws java.lang.Exception;
}

package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Task<TResult> {
    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(android.app.Activity activity, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        throw new java.lang.UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(android.app.Activity activity, com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        throw new java.lang.UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(android.app.Activity activity, com.google.android.gms.tasks.OnFailureListener onFailureListener);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(com.google.android.gms.tasks.OnFailureListener onFailureListener);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnFailureListener onFailureListener);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(android.app.Activity activity, com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener);

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation) {
        throw new java.lang.UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> continuation) {
        throw new java.lang.UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract java.lang.Exception getException();

    public abstract TResult getResult();

    public abstract <X extends java.lang.Throwable> TResult getResult(java.lang.Class<X> cls) throws java.lang.Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new java.lang.UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        throw new java.lang.UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        throw new java.lang.UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation) {
        throw new java.lang.UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> continuation) {
        throw new java.lang.UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(java.util.concurrent.Executor executor, com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new java.lang.UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        throw new java.lang.UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        throw new java.lang.UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}

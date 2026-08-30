package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
public final class DuplicateTaskCompletionException extends java.lang.IllegalStateException {
    private DuplicateTaskCompletionException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public static java.lang.IllegalStateException of(com.google.android.gms.tasks.Task<?> task) {
        java.lang.String strConcat;
        if (!task.isComplete()) {
            return new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        java.lang.Exception exception = task.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (task.isSuccessful()) {
            strConcat = "result ".concat(java.lang.String.valueOf(java.lang.String.valueOf(task.getResult())));
        } else {
            strConcat = task.isCanceled() ? "cancellation" : "unknown issue";
        }
        return new com.google.android.gms.tasks.DuplicateTaskCompletionException("Complete with: ".concat(strConcat), exception);
    }
}

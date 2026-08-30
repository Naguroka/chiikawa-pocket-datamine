package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* JADX INFO: loaded from: classes5.dex */
public class NativeOnCompleteListener implements com.google.android.gms.tasks.OnCompleteListener<java.lang.Object> {
    private final long zza;

    public NativeOnCompleteListener(long j) {
        this.zza = j;
    }

    public static void createAndAddCallback(com.google.android.gms.tasks.Task<java.lang.Object> task, long j) {
        task.addOnCompleteListener(new com.google.android.gms.tasks.NativeOnCompleteListener(j));
    }

    public native void nativeOnComplete(long j, java.lang.Object obj, boolean z, boolean z2, java.lang.String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(com.google.android.gms.tasks.Task<java.lang.Object> task) {
        java.lang.Object result;
        java.lang.String message;
        java.lang.Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}

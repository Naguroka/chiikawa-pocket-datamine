package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
final class AwaitListener implements com.google.android.gms.tasks.OnCompleteListener<java.lang.Void> {
    private final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);

    AwaitListener() {
    }

    public void onSuccess() {
        this.latch.countDown();
    }

    public boolean await(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.latch.await(j, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(com.google.android.gms.tasks.Task<java.lang.Void> task) {
        this.latch.countDown();
    }
}

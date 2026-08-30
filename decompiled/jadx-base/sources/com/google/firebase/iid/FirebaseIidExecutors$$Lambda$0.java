package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class FirebaseIidExecutors$$Lambda$0 implements java.util.concurrent.Executor {
    static final java.util.concurrent.Executor $instance = new com.google.firebase.iid.FirebaseIidExecutors$$Lambda$0();

    private FirebaseIidExecutors$$Lambda$0() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}

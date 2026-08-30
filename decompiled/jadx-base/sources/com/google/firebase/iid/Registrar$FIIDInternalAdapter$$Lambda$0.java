package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class Registrar$FIIDInternalAdapter$$Lambda$0 implements com.google.android.gms.tasks.Continuation {
    static final com.google.android.gms.tasks.Continuation $instance = new com.google.firebase.iid.Registrar$FIIDInternalAdapter$$Lambda$0();

    private Registrar$FIIDInternalAdapter$$Lambda$0() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public java.lang.Object then(com.google.android.gms.tasks.Task task) {
        return ((com.google.firebase.iid.InstanceIdResult) task.getResult()).getToken();
    }
}

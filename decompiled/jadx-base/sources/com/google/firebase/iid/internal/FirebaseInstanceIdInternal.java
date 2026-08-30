package com.google.firebase.iid.internal;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface FirebaseInstanceIdInternal {

    /* JADX INFO: compiled from: com.google.firebase:firebase-iid-interop@@17.1.0 */
    public interface NewTokenListener {
        void onNewToken(java.lang.String str);
    }

    void addNewTokenListener(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener newTokenListener);

    void deleteToken(java.lang.String str, java.lang.String str2) throws java.io.IOException;

    java.lang.String getId();

    java.lang.String getToken();

    com.google.android.gms.tasks.Task<java.lang.String> getTokenTask();
}

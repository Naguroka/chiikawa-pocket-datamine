package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class InstanceIdResultImpl implements com.google.firebase.iid.InstanceIdResult {
    private final java.lang.String id;
    private final java.lang.String token;

    InstanceIdResultImpl(java.lang.String str, java.lang.String str2) {
        this.id = str;
        this.token = str2;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public java.lang.String getId() {
        return this.id;
    }

    @Override // com.google.firebase.iid.InstanceIdResult
    public java.lang.String getToken() {
        return this.token;
    }
}

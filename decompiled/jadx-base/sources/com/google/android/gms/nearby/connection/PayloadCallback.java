package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class PayloadCallback {
    public abstract void onPayloadReceived(java.lang.String str, com.google.android.gms.nearby.connection.Payload payload);

    public abstract void onPayloadTransferUpdate(java.lang.String str, com.google.android.gms.nearby.connection.PayloadTransferUpdate payloadTransferUpdate);
}

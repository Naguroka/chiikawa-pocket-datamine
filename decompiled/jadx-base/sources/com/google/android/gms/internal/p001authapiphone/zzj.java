package com.google.android.gms.internal.p001authapiphone;

/* JADX INFO: loaded from: classes4.dex */
public final class zzj extends com.google.android.gms.auth.api.phone.SmsRetrieverClient {
    public zzj(android.app.Activity activity) {
        super(activity);
    }

    public zzj(android.content.Context context) {
        super(context);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever() {
        return doWrite(new com.google.android.gms.internal.p001authapiphone.zzk(this));
    }
}

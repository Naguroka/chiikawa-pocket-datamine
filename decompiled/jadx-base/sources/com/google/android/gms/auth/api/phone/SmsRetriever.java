package com.google.android.gms.auth.api.phone;

/* JADX INFO: loaded from: classes4.dex */
public final class SmsRetriever {
    public static final java.lang.String EXTRA_SMS_MESSAGE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE";
    public static final java.lang.String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final java.lang.String SMS_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";

    private SmsRetriever() {
    }

    public static com.google.android.gms.auth.api.phone.SmsRetrieverClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p001authapiphone.zzj(activity);
    }

    public static com.google.android.gms.auth.api.phone.SmsRetrieverClient getClient(android.content.Context context) {
        return new com.google.android.gms.internal.p001authapiphone.zzj(context);
    }
}

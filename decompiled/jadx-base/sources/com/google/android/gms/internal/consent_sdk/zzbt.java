package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbt extends android.content.ContextWrapper {
    private android.app.Activity zza;

    public zzbt(android.app.Application application) {
        super(application);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        android.app.Activity activity = this.zza;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent) {
        android.app.Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }

    public final void zza(android.app.Activity activity) {
        this.zza = activity;
    }
}

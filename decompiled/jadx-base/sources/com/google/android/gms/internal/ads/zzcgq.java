package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcgq extends android.content.MutableContextWrapper {
    private android.app.Activity zza;
    private android.content.Context zzb;
    private android.content.Context zzc;

    public zzcgq(android.content.Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        return this.zzc.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zza = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        this.zzc = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent) {
        android.app.Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
        }
    }

    public final android.app.Activity zza() {
        return this.zza;
    }

    public final android.content.Context zzb() {
        return this.zzc;
    }

    public final void zzc(android.content.Intent intent, int i) {
        if (this.zza == null) {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Starting activity for result with intent: " + java.lang.String.valueOf(intent.getData()) + " and requestCode: 236");
        this.zza.startActivityForResult(intent, 236);
    }
}

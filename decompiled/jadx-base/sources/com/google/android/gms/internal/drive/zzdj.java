package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzdj implements com.google.android.gms.drive.events.ChangeListener {
    private final com.google.android.gms.drive.events.OnChangeListener zzgi;

    private zzdj(com.google.android.gms.drive.events.OnChangeListener onChangeListener) {
        this.zzgi = onChangeListener;
    }

    static com.google.android.gms.drive.events.ChangeListener zza(com.google.android.gms.drive.events.OnChangeListener onChangeListener) {
        return new com.google.android.gms.internal.drive.zzdj(onChangeListener);
    }

    @Override // com.google.android.gms.drive.events.ChangeListener
    public final void onChange(com.google.android.gms.drive.events.ChangeEvent changeEvent) {
        this.zzgi.onChange(changeEvent);
    }
}

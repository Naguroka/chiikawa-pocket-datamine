package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class zzp extends com.google.android.gms.drive.ExecutionOptions.Builder {
    private boolean zzat = true;

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions build() {
        zzo();
        return new com.google.android.gms.drive.zzn(this.zzaq, this.zzar, this.zzas, this.zzat);
    }

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions.Builder setConflictStrategy(int i) {
        super.setConflictStrategy(i);
        return this;
    }

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions.Builder setNotifyOnCompletion(boolean z) {
        super.setNotifyOnCompletion(z);
        return this;
    }

    @Override // com.google.android.gms.drive.ExecutionOptions.Builder
    public final /* synthetic */ com.google.android.gms.drive.ExecutionOptions.Builder setTrackingTag(java.lang.String str) {
        super.setTrackingTag(str);
        return this;
    }
}

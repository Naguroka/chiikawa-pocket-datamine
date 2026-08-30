package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class zzt {
    private java.lang.String zzba;
    private com.google.android.gms.drive.DriveId zzbd;
    private java.lang.Integer zzdk;
    private final int zzdl = 0;
    private com.google.android.gms.drive.MetadataChangeSet zzdm;

    public zzt(int i) {
    }

    public final void zza(com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        this.zzdm = (com.google.android.gms.drive.MetadataChangeSet) com.google.android.gms.common.internal.Preconditions.checkNotNull(metadataChangeSet);
    }

    public final com.google.android.gms.drive.MetadataChangeSet zzc() {
        return this.zzdm;
    }

    public final void zza(com.google.android.gms.drive.DriveId driveId) {
        this.zzbd = (com.google.android.gms.drive.DriveId) com.google.android.gms.common.internal.Preconditions.checkNotNull(driveId);
    }

    public final com.google.android.gms.drive.DriveId zzd() {
        return this.zzbd;
    }

    public final void zzc(java.lang.String str) {
        this.zzba = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
    }

    public final java.lang.String zze() {
        return this.zzba;
    }

    public final void zzd(int i) {
        this.zzdk = java.lang.Integer.valueOf(i);
    }

    public final int getRequestId() {
        return this.zzdk.intValue();
    }

    public final void zzg() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzdm, "Must provide initial metadata via setInitialMetadata.");
        java.lang.Integer num = this.zzdk;
        this.zzdk = java.lang.Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final android.content.IntentSender build(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkState(googleApiClient.isConnected(), "Client must be connected");
        zzg();
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY);
        this.zzdm.zzq().zza(zzawVar.getContext());
        try {
            return ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzu(this.zzdm.zzq(), this.zzdk.intValue(), this.zzba, this.zzbd, 0));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException("Unable to connect Drive Play Service", e);
        }
    }
}

package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletionEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.ResourceEvent {
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;
    private final int status;
    private final java.lang.String zzca;
    private final android.os.ParcelFileDescriptor zzcb;
    private final android.os.ParcelFileDescriptor zzcc;
    private final com.google.android.gms.drive.metadata.internal.MetadataBundle zzcd;
    private final java.util.List<java.lang.String> zzce;
    private final android.os.IBinder zzcf;
    private boolean zzcg = false;
    private boolean zzch = false;
    private boolean zzci = false;
    private final com.google.android.gms.drive.DriveId zzk;
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = new com.google.android.gms.common.internal.GmsLogger("CompletionEvent", "");
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.CompletionEvent> CREATOR = new com.google.android.gms.drive.events.zzg();

    CompletionEvent(com.google.android.gms.drive.DriveId driveId, java.lang.String str, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2, com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle, java.util.List<java.lang.String> list, int i, android.os.IBinder iBinder) {
        this.zzk = driveId;
        this.zzca = str;
        this.zzcb = parcelFileDescriptor;
        this.zzcc = parcelFileDescriptor2;
        this.zzcd = metadataBundle;
        this.zzce = list;
        this.status = i;
        this.zzcf = iBinder;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
        return 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = i | 1;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzk, i2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzca, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzcb, i2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzcc, i2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzcd, i2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 7, this.zzce, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.status);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 9, this.zzcf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.drive.events.ResourceEvent
    public final com.google.android.gms.drive.DriveId getDriveId() {
        zzv();
        return this.zzk;
    }

    public final java.lang.String getAccountName() {
        zzv();
        return this.zzca;
    }

    public final java.io.InputStream getBaseContentsInputStream() {
        zzv();
        if (this.zzcb == null) {
            return null;
        }
        if (this.zzcg) {
            throw new java.lang.IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        }
        this.zzcg = true;
        return new java.io.FileInputStream(this.zzcb.getFileDescriptor());
    }

    public final java.io.InputStream getModifiedContentsInputStream() {
        zzv();
        if (this.zzcc == null) {
            return null;
        }
        if (this.zzch) {
            throw new java.lang.IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        }
        this.zzch = true;
        return new java.io.FileInputStream(this.zzcc.getFileDescriptor());
    }

    public final com.google.android.gms.drive.MetadataChangeSet getModifiedMetadataChangeSet() {
        zzv();
        if (this.zzcd != null) {
            return new com.google.android.gms.drive.MetadataChangeSet(this.zzcd);
        }
        return null;
    }

    public final java.util.List<java.lang.String> getTrackingTags() {
        zzv();
        return new java.util.ArrayList(this.zzce);
    }

    public final int getStatus() {
        zzv();
        return this.status;
    }

    public final void dismiss() {
        zza(false);
    }

    public final void snooze() {
        zza(true);
    }

    private final void zza(boolean z) {
        zzv();
        this.zzci = true;
        com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzcb);
        com.google.android.gms.common.util.IOUtils.closeQuietly(this.zzcc);
        com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle = this.zzcd;
        if (metadataBundle != null && metadataBundle.zzd(com.google.android.gms.internal.drive.zzhs.zzkq)) {
            ((com.google.android.gms.common.data.BitmapTeleporter) this.zzcd.zza(com.google.android.gms.internal.drive.zzhs.zzkq)).release();
        }
        android.os.IBinder iBinder = this.zzcf;
        if (iBinder == null) {
            zzbz.efmt("CompletionEvent", "No callback on %s", z ? "snooze" : "dismiss");
            return;
        }
        try {
            com.google.android.gms.internal.drive.zzev.zza(iBinder).zza(z);
        } catch (android.os.RemoteException e) {
            zzbz.e("CompletionEvent", java.lang.String.format("RemoteException on %s", z ? "snooze" : "dismiss"), e);
        }
    }

    private final void zzv() {
        if (this.zzci) {
            throw new java.lang.IllegalStateException("Event has already been dismissed or snoozed.");
        }
    }

    public final java.lang.String toString() {
        java.lang.String string;
        java.util.List<java.lang.String> list = this.zzce;
        if (list == null) {
            string = "<null>";
        } else {
            java.lang.String strJoin = android.text.TextUtils.join("','", list);
            string = new java.lang.StringBuilder(java.lang.String.valueOf(strJoin).length() + 2).append("'").append(strJoin).append("'").toString();
        }
        return java.lang.String.format(java.util.Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", this.zzk, java.lang.Integer.valueOf(this.status), string);
    }
}

package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.cloudmessaging.zzd> CREATOR = new com.google.android.gms.cloudmessaging.zzb();
    android.os.Messenger zza;
    com.google.android.gms.cloudmessaging.IMessengerCompat zzb;

    public zzd(android.os.IBinder iBinder) {
        this.zza = new android.os.Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return zza().equals(((com.google.android.gms.cloudmessaging.zzd) obj).zza());
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Messenger messenger = this.zza;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.zzb.asBinder());
        }
    }

    public final android.os.IBinder zza() {
        android.os.Messenger messenger = this.zza;
        return messenger != null ? messenger.getBinder() : this.zzb.asBinder();
    }

    public final void zzb(android.os.Message message) throws android.os.RemoteException {
        android.os.Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.zzb.send(message);
        }
    }
}

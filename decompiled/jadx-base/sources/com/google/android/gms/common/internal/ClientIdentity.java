package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ClientIdentity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ClientIdentity> CREATOR = new com.google.android.gms.common.internal.zaa();
    public final java.lang.String packageName;
    public final int uid;

    public ClientIdentity(int i, java.lang.String str) {
        this.uid = i;
        this.packageName = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.internal.ClientIdentity)) {
            return false;
        }
        com.google.android.gms.common.internal.ClientIdentity clientIdentity = (com.google.android.gms.common.internal.ClientIdentity) obj;
        return clientIdentity.uid == this.uid && com.google.android.gms.common.internal.Objects.equal(clientIdentity.packageName, this.packageName);
    }

    public final int hashCode() {
        return this.uid;
    }

    public final java.lang.String toString() {
        return this.uid + ":" + this.packageName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.uid;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

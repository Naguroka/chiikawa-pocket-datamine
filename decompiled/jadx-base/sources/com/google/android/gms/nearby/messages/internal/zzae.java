package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzae extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.zzae> CREATOR = new com.google.android.gms.nearby.messages.internal.zzaf();
    final int zza;
    public final com.google.android.gms.nearby.messages.Message zzb;

    zzae(int i, com.google.android.gms.nearby.messages.Message message) {
        this.zza = i;
        this.zzb = (com.google.android.gms.nearby.messages.Message) com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
    }

    public static final com.google.android.gms.nearby.messages.internal.zzae zza(com.google.android.gms.nearby.messages.Message message) {
        return new com.google.android.gms.nearby.messages.internal.zzae(1, message);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.messages.internal.zzae) {
            return com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.nearby.messages.internal.zzae) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb);
    }

    public final java.lang.String toString() {
        java.lang.String string = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 24);
        sb.append("MessageWrapper{message=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

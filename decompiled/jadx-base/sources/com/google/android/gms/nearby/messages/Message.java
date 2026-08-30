package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class Message extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final int MAX_CONTENT_SIZE_BYTES = 102400;
    public static final int MAX_TYPE_LENGTH = 32;
    public static final java.lang.String MESSAGE_NAMESPACE_RESERVED = "__reserved_namespace";
    public static final java.lang.String MESSAGE_TYPE_AUDIO_BYTES = "__audio_bytes";
    public static final java.lang.String MESSAGE_TYPE_EDDYSTONE_UID = "__eddystone_uid";
    public static final java.lang.String MESSAGE_TYPE_I_BEACON_ID = "__i_beacon_id";
    final int zza;

    @java.lang.Deprecated
    final com.google.android.gms.internal.nearby.zzhj[] zzb;
    private final byte[] zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final long zzg;
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.Message> CREATOR = new com.google.android.gms.nearby.messages.zza();
    private static final com.google.android.gms.internal.nearby.zzhj[] zzc = {com.google.android.gms.internal.nearby.zzhj.zza};

    Message(int i, byte[] bArr, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.nearby.zzhj[] zzhjVarArr, long j) {
        this.zza = i;
        this.zze = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        this.zzf = str == null ? "" : str;
        this.zzg = j;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        com.google.android.gms.common.internal.Preconditions.checkArgument(length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(MAX_CONTENT_SIZE_BYTES));
        this.zzd = bArr;
        this.zzb = (zzhjVarArr == null || zzhjVarArr.length == 0) ? zzc : zzhjVarArr;
        com.google.android.gms.common.internal.Preconditions.checkArgument(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", java.lang.Integer.valueOf(str2.length()), 32);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.Message)) {
            return false;
        }
        com.google.android.gms.nearby.messages.Message message = (com.google.android.gms.nearby.messages.Message) obj;
        return android.text.TextUtils.equals(this.zzf, message.zzf) && android.text.TextUtils.equals(this.zze, message.zze) && java.util.Arrays.equals(this.zzd, message.zzd) && this.zzg == message.zzg;
    }

    public byte[] getContent() {
        return this.zzd;
    }

    public java.lang.String getNamespace() {
        return this.zzf;
    }

    public java.lang.String getType() {
        return this.zze;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzf, this.zze, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzd)), java.lang.Long.valueOf(this.zzg));
    }

    public java.lang.String toString() {
        java.lang.String str = this.zzf;
        java.lang.String str2 = this.zze;
        byte[] bArr = this.zzd;
        int length = bArr == null ? 0 : bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 59 + java.lang.String.valueOf(str2).length());
        sb.append("Message{namespace='");
        sb.append(str);
        sb.append("', type='");
        sb.append(str2);
        sb.append("', content=[");
        sb.append(length);
        sb.append(" bytes]}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, getContent(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getNamespace(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 4, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(java.lang.String str) {
        return MESSAGE_NAMESPACE_RESERVED.equals(getNamespace()) && str.equals(getType());
    }

    public Message(byte[] bArr) {
        this(bArr, "", "", zzc, 0L);
    }

    public Message(byte[] bArr, java.lang.String str) {
        this(bArr, "", str, zzc, 0L);
    }

    public Message(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this(bArr, MESSAGE_NAMESPACE_RESERVED, MESSAGE_TYPE_AUDIO_BYTES, zzc, 0L);
    }

    public Message(byte[] bArr, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.nearby.zzhj[] zzhjVarArr, long j) {
        this(2, bArr, str, str2, zzhjVarArr, 0L);
    }
}

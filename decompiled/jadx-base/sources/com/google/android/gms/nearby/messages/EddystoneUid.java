package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class EddystoneUid {
    public static final int INSTANCE_LENGTH = 6;
    public static final int LENGTH = 16;
    public static final int NAMESPACE_LENGTH = 10;
    private final com.google.android.gms.nearby.messages.internal.zzg zza;

    public EddystoneUid(java.lang.String str) {
        this(com.google.android.gms.nearby.messages.internal.zzc.zzb(str));
    }

    public static com.google.android.gms.nearby.messages.EddystoneUid from(com.google.android.gms.nearby.messages.Message message) {
        boolean zZza = message.zza(com.google.android.gms.nearby.messages.Message.MESSAGE_TYPE_EDDYSTONE_UID);
        java.lang.String type = message.getType();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(type).length() + 58);
        sb.append("Message type '");
        sb.append(type);
        sb.append("' is not Message.MESSAGE_TYPE_EDDYSTONE_UID.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(zZza, sb.toString());
        return new com.google.android.gms.nearby.messages.EddystoneUid(message.getContent());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.messages.EddystoneUid) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.nearby.messages.EddystoneUid) obj).zza);
        }
        return false;
    }

    public java.lang.String getHex() {
        return this.zza.zzd();
    }

    public java.lang.String getInstance() {
        byte[] bArrZzc = this.zza.zzc();
        if (bArrZzc.length < 16) {
            return null;
        }
        return com.google.android.gms.nearby.messages.internal.zzc.zza(java.util.Arrays.copyOfRange(bArrZzc, 10, 16));
    }

    public java.lang.String getNamespace() {
        return com.google.android.gms.nearby.messages.internal.zzc.zza(java.util.Arrays.copyOfRange(this.zza.zzc(), 0, 10));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public java.lang.String toString() {
        java.lang.String hex = getHex();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(hex).length() + 17);
        sb.append("EddystoneUid{id=");
        sb.append(hex);
        sb.append('}');
        return sb.toString();
    }

    public EddystoneUid(java.lang.String str, java.lang.String str2) {
        this.zza = new com.google.android.gms.nearby.messages.internal.zzg(str, str2);
    }

    public EddystoneUid(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 16, "Bytes must be a namespace plus instance (16 bytes).");
        this.zza = new com.google.android.gms.nearby.messages.internal.zzg(bArr);
    }
}

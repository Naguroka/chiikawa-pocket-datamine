package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class IBeaconId {
    public static final int LENGTH = 20;
    private final com.google.android.gms.nearby.messages.internal.zzl zza;

    public IBeaconId(java.util.UUID uuid, short s, short s2) {
        this.zza = new com.google.android.gms.nearby.messages.internal.zzl(uuid, java.lang.Short.valueOf(s), java.lang.Short.valueOf(s2));
    }

    public static com.google.android.gms.nearby.messages.IBeaconId from(com.google.android.gms.nearby.messages.Message message) {
        boolean zZza = message.zza(com.google.android.gms.nearby.messages.Message.MESSAGE_TYPE_I_BEACON_ID);
        java.lang.String type = message.getType();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(type).length() + 55);
        sb.append("Message type '");
        sb.append(type);
        sb.append("' is not Message.MESSAGE_TYPE_I_BEACON_ID");
        com.google.android.gms.common.internal.Preconditions.checkArgument(zZza, sb.toString());
        return new com.google.android.gms.nearby.messages.IBeaconId(message.getContent());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.nearby.messages.IBeaconId) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.nearby.messages.IBeaconId) obj).zza);
        }
        return false;
    }

    public short getMajor() {
        return this.zza.zzf().shortValue();
    }

    public short getMinor() {
        return this.zza.zzg().shortValue();
    }

    public java.util.UUID getProximityUuid() {
        return this.zza.zze();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(getProximityUuid());
        short major = getMajor();
        short minor = getMinor();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 53);
        sb.append("IBeaconId{proximityUuid=");
        sb.append(strValueOf);
        sb.append(", major=");
        sb.append((int) major);
        sb.append(", minor=");
        sb.append((int) minor);
        sb.append('}');
        return sb.toString();
    }

    public IBeaconId(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 20, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        this.zza = new com.google.android.gms.nearby.messages.internal.zzl(bArr);
    }
}

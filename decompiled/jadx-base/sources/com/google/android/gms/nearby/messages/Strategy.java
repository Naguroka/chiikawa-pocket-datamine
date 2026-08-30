package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class Strategy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final com.google.android.gms.nearby.messages.Strategy BLE_ONLY;
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.Strategy> CREATOR = new com.google.android.gms.nearby.messages.zzf();
    public static final com.google.android.gms.nearby.messages.Strategy DEFAULT = new com.google.android.gms.nearby.messages.Strategy.Builder().build();
    public static final int DISCOVERY_MODE_BROADCAST = 1;
    public static final int DISCOVERY_MODE_DEFAULT = 3;
    public static final int DISCOVERY_MODE_SCAN = 2;
    public static final int DISTANCE_TYPE_DEFAULT = 0;
    public static final int DISTANCE_TYPE_EARSHOT = 1;
    public static final int TTL_SECONDS_DEFAULT = 300;
    public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
    public static final int TTL_SECONDS_MAX = 86400;

    @java.lang.Deprecated
    public static final com.google.android.gms.nearby.messages.Strategy zza;
    final int zzb;

    @java.lang.Deprecated
    final int zzc;
    final int zzd;
    final int zze;

    @java.lang.Deprecated
    final boolean zzf;
    final int zzg;
    final int zzh;
    private final int zzi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static class Builder {
        private int zza = 3;
        private int zzb = com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT;
        private int zzc = 0;
        private int zzd = -1;

        public com.google.android.gms.nearby.messages.Strategy.Builder setDiscoveryMode(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.nearby.messages.Strategy.Builder setDistanceType(int i) {
            this.zzc = i;
            return this;
        }

        public com.google.android.gms.nearby.messages.Strategy.Builder setTtlSeconds(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i == Integer.MAX_VALUE || (i > 0 && i <= 86400), "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_MAX));
            this.zzb = i;
            return this;
        }

        public final com.google.android.gms.nearby.messages.Strategy.Builder zza(int i) {
            this.zzd = 2;
            return this;
        }

        public com.google.android.gms.nearby.messages.Strategy build() {
            int i = this.zzd;
            if (i == 2 && this.zzc == 1) {
                throw new java.lang.IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new com.google.android.gms.nearby.messages.Strategy(2, 0, this.zzb, this.zzc, false, i, this.zza, 0);
        }
    }

    static {
        com.google.android.gms.nearby.messages.Strategy.Builder builder = new com.google.android.gms.nearby.messages.Strategy.Builder();
        builder.zza(2);
        builder.setTtlSeconds(Integer.MAX_VALUE);
        com.google.android.gms.nearby.messages.Strategy strategyBuild = builder.build();
        BLE_ONLY = strategyBuild;
        zza = strategyBuild;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b A[PHI: r8
  0x000b: PHI (r8v2 int) = (r8v0 int), (r8v1 int) binds: [B:3:0x0009, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    Strategy(int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7) {
        this.zzb = i;
        this.zzc = i2;
        if (i2 == 0) {
            this.zzh = i6;
        } else if (i2 != 2) {
            i6 = 3;
            if (i2 != 3) {
                this.zzh = i6;
            } else {
                this.zzh = 2;
            }
        } else {
            this.zzh = 1;
        }
        this.zze = i4;
        this.zzf = z;
        if (z) {
            this.zzg = 2;
            this.zzd = Integer.MAX_VALUE;
        } else {
            this.zzd = i3;
            if (i5 == -1 || i5 == 0 || i5 == 1 || i5 == 6) {
                this.zzg = -1;
            } else {
                this.zzg = i5;
            }
        }
        this.zzi = i7;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.Strategy)) {
            return false;
        }
        com.google.android.gms.nearby.messages.Strategy strategy = (com.google.android.gms.nearby.messages.Strategy) obj;
        return this.zzb == strategy.zzb && this.zzh == strategy.zzh && this.zzd == strategy.zzd && this.zze == strategy.zze && this.zzg == strategy.zzg && this.zzi == strategy.zzi;
    }

    public int hashCode() {
        return (((((((((this.zzb * 31) + this.zzh) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzg) * 31) + this.zzi;
    }

    public java.lang.String toString() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        int i = this.zzd;
        int i2 = this.zze;
        java.lang.String string4 = "DEFAULT";
        if (i2 == 0) {
            string = "DEFAULT";
        } else if (i2 != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
            sb.append("UNKNOWN:");
            sb.append(i2);
            string = sb.toString();
        } else {
            string = "EARSHOT";
        }
        int i3 = this.zzg;
        if (i3 == -1) {
            string2 = "DEFAULT";
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(19);
                sb2.append("UNKNOWN:");
                sb2.append(i3);
                string2 = sb2.toString();
            } else {
                string2 = arrayList.toString();
            }
        }
        int i4 = this.zzh;
        if (i4 == 3) {
            string3 = "DEFAULT";
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(19);
                sb3.append("UNKNOWN:");
                sb3.append(i4);
                string3 = sb3.toString();
            } else {
                string3 = arrayList2.toString();
            }
        }
        int i5 = this.zzi;
        if (i5 != 0) {
            if (i5 != 1) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(20);
                sb4.append("UNKNOWN: ");
                sb4.append(i5);
                string4 = sb4.toString();
            } else {
                string4 = "ALWAYS_ON";
            }
        }
        int length = java.lang.String.valueOf(string).length();
        int length2 = java.lang.String.valueOf(string2).length();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder(length + 102 + length2 + java.lang.String.valueOf(string3).length() + java.lang.String.valueOf(string4).length());
        sb5.append("Strategy{ttlSeconds=");
        sb5.append(i);
        sb5.append(", distanceType=");
        sb5.append(string);
        sb5.append(", discoveryMedium=");
        sb5.append(string2);
        sb5.append(", discoveryMode=");
        sb5.append(string3);
        sb5.append(", backgroundScanMode=");
        sb5.append(string4);
        sb5.append('}');
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzi;
    }
}

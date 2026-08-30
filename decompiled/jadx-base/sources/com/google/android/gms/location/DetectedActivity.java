package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class DetectedActivity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    int zzb;
    int zzc;
    public static final java.util.Comparator<com.google.android.gms.location.DetectedActivity> zza = new com.google.android.gms.location.zzq();
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.DetectedActivity> CREATOR = new com.google.android.gms.location.zzr();

    public DetectedActivity(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.location.DetectedActivity) {
            com.google.android.gms.location.DetectedActivity detectedActivity = (com.google.android.gms.location.DetectedActivity) obj;
            if (this.zzb == detectedActivity.zzb && this.zzc == detectedActivity.zzc) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int i = this.zzb;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }

    public java.lang.String toString() {
        java.lang.String string;
        int type = getType();
        if (type == 0) {
            string = "IN_VEHICLE";
        } else if (type == 1) {
            string = "ON_BICYCLE";
        } else if (type == 2) {
            string = "ON_FOOT";
        } else if (type == 3) {
            string = "STILL";
        } else if (type == 4) {
            string = "UNKNOWN";
        } else if (type == 5) {
            string = "TILTING";
        } else if (type == 7) {
            string = "WALKING";
        } else if (type == 8) {
            string = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING;
        } else if (type != 16) {
            string = type != 17 ? java.lang.Integer.toString(type) : "IN_RAIL_VEHICLE";
        } else {
            string = "IN_ROAD_VEHICLE";
        }
        int i = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(string);
        sb.append(", confidence=");
        sb.append(i);
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

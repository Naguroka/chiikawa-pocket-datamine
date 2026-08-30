package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class SleepSegmentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int CLASSIFY_EVENTS_ONLY = 2;
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.SleepSegmentRequest> CREATOR = new com.google.android.gms.location.zzbw();
    public static final int SEGMENT_AND_CLASSIFY_EVENTS = 0;
    public static final int SEGMENT_EVENTS_ONLY = 1;
    private final java.util.List<com.google.android.gms.location.zzbx> zza;
    private final int zzb;

    public SleepSegmentRequest(int i) {
        this(null, i);
    }

    public static com.google.android.gms.location.SleepSegmentRequest getDefaultSleepSegmentRequest() {
        return new com.google.android.gms.location.SleepSegmentRequest(null, 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.SleepSegmentRequest)) {
            return false;
        }
        com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest = (com.google.android.gms.location.SleepSegmentRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, sleepSegmentRequest.zza) && this.zzb == sleepSegmentRequest.zzb;
    }

    public int getRequestedDataType() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getRequestedDataType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public SleepSegmentRequest(java.util.List<com.google.android.gms.location.zzbx> list, int i) {
        this.zza = list;
        this.zzb = i;
    }
}

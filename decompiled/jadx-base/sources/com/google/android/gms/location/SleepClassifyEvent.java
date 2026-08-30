package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class SleepClassifyEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.SleepClassifyEvent> CREATOR = new com.google.android.gms.location.zzbu();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final boolean zzh;
    private final int zzi;

    public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = z;
        this.zzi = i8;
    }

    public static java.util.List<com.google.android.gms.location.SleepClassifyEvent> extractEvents(android.content.Intent intent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            arrayList2.add((com.google.android.gms.location.SleepClassifyEvent) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return java.util.Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.SleepClassifyEvent)) {
            return false;
        }
        com.google.android.gms.location.SleepClassifyEvent sleepClassifyEvent = (com.google.android.gms.location.SleepClassifyEvent) obj;
        return this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb;
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return ((long) this.zza) * 1000;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb));
    }

    public java.lang.String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(65);
        sb.append(i);
        sb.append(" Conf:");
        sb.append(i2);
        sb.append(" Motion:");
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getConfidence());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getMotion());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getLight());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

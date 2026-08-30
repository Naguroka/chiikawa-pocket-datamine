package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public class DriveSpace extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.DriveSpace> CREATOR = new com.google.android.gms.drive.zzm();
    public static final com.google.android.gms.drive.DriveSpace zzah;
    public static final com.google.android.gms.drive.DriveSpace zzai;
    public static final com.google.android.gms.drive.DriveSpace zzaj;
    private static final java.util.Set<com.google.android.gms.drive.DriveSpace> zzak;
    private static final java.lang.String zzal;
    private static final java.util.regex.Pattern zzam;
    private final java.lang.String name;

    DriveSpace(java.lang.String str) {
        this.name = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || obj.getClass() != com.google.android.gms.drive.DriveSpace.class) {
            return false;
        }
        return this.name.equals(((com.google.android.gms.drive.DriveSpace) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1247068382;
    }

    public java.lang.String toString() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    static {
        com.google.android.gms.drive.DriveSpace driveSpace = new com.google.android.gms.drive.DriveSpace(com.google.android.gms.stats.CodePackage.DRIVE);
        zzah = driveSpace;
        com.google.android.gms.drive.DriveSpace driveSpace2 = new com.google.android.gms.drive.DriveSpace("APP_DATA_FOLDER");
        zzai = driveSpace2;
        com.google.android.gms.drive.DriveSpace driveSpace3 = new com.google.android.gms.drive.DriveSpace("PHOTOS");
        zzaj = driveSpace3;
        java.util.Set<com.google.android.gms.drive.DriveSpace> of = com.google.android.gms.common.util.CollectionUtils.setOf(driveSpace, driveSpace2, driveSpace3);
        zzak = of;
        zzal = android.text.TextUtils.join(",", of.toArray());
        zzam = java.util.regex.Pattern.compile("[A-Z0-9_]*");
    }
}

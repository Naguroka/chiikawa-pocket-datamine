package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzem implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzem> CREATOR = new com.google.android.gms.internal.ads.zzek();
    public final java.lang.String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* synthetic */ zzem(android.os.Parcel parcel, com.google.android.gms.internal.ads.zzel zzelVar) {
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zza = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.zzb = bArrCreateByteArray;
        this.zzc = parcel.readInt();
        int i2 = parcel.readInt();
        this.zzd = i2;
        zzb(string, bArrCreateByteArray, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    private static void zzb(java.lang.String str, byte[] bArr, int i) {
        byte b;
        byte b2;
        boolean z = true;
        switch (str) {
            case "com.android.capture.fps":
                b = 0;
                break;
            case "editable.tracks.samples.location":
                b = 4;
                break;
            case "editable.tracks.length":
                b = 2;
                break;
            case "editable.tracks.offset":
                b = 1;
                break;
            case "editable.tracks.map":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            com.google.android.gms.internal.ads.zzcw.zzd(i == 23 && bArr.length == 4);
            return;
        }
        if (b == 1 || b == 2) {
            com.google.android.gms.internal.ads.zzcw.zzd(i == 78 && bArr.length == 8);
            return;
        }
        if (b == 3) {
            com.google.android.gms.internal.ads.zzcw.zzd(i == 0);
            return;
        }
        if (b != 4) {
            return;
        }
        if (i != 75 || bArr.length != 1 || ((b2 = bArr[0]) != 0 && b2 != 1)) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzem zzemVar = (com.google.android.gms.internal.ads.zzem) obj;
            if (this.zza.equals(zzemVar.zza) && java.util.Arrays.equals(this.zzb, zzemVar.zzb) && this.zzc == zzemVar.zzc && this.zzd == zzemVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
    }

    public zzem(java.lang.String str, byte[] bArr, int i, int i2) {
        zzb(str, bArr, i2);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae A[LOOP:0: B:26:0x00ab->B:28:0x00ae, LOOP_END] */
    public final java.lang.String toString() {
        java.lang.String string;
        byte[] bArr;
        java.lang.StringBuilder sb;
        int i = this.zzd;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                string = com.google.android.gms.internal.ads.zzei.zzB(this.zzb);
            } else if (i == 23) {
                string = java.lang.String.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.ads.zzgaq.zzd(this.zzb)));
            } else if (i == 67) {
                string = java.lang.String.valueOf(com.google.android.gms.internal.ads.zzgaq.zzd(this.zzb));
            } else if (i == 75) {
                string = java.lang.String.valueOf(this.zzb[0] & 255);
            } else if (i != 78) {
                bArr = this.zzb;
                int length = bArr.length;
                sb = new java.lang.StringBuilder(length + length);
                while (i2 < bArr.length) {
                    sb.append(java.lang.Character.forDigit((bArr[i2] >> 4) & 15, 16));
                    sb.append(java.lang.Character.forDigit(bArr[i2] & 15, 16));
                    i2++;
                }
                string = sb.toString();
            } else {
                string = java.lang.String.valueOf(new com.google.android.gms.internal.ads.zzdy(this.zzb).zzw());
            }
        } else if (this.zza.equals("editable.tracks.map")) {
            com.google.android.gms.internal.ads.zzcw.zzg(this.zza.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
            byte b = this.zzb[1];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (i2 < b) {
                arrayList.add(java.lang.Integer.valueOf(this.zzb[i2 + 2]));
                i2++;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("track types = ");
            com.google.android.gms.internal.ads.zzfuf.zzb(sb2, arrayList, ",");
            string = sb2.toString();
        } else {
            bArr = this.zzb;
            int length2 = bArr.length;
            sb = new java.lang.StringBuilder(length2 + length2);
            while (i2 < bArr.length) {
                sb.append(java.lang.Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(java.lang.Character.forDigit(bArr[i2] & 15, 16));
                i2++;
            }
            string = sb.toString();
        }
        return "mdta: key=" + this.zza + ", value=" + string;
    }
}

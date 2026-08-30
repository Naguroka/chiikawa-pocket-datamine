package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhi {
    private static final android.os.ParcelUuid zza = android.os.ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private final int zzb;
    private final java.util.List<android.os.ParcelUuid> zzc;
    private final android.util.SparseArray<byte[]> zzd;
    private final java.util.Map<android.os.ParcelUuid, byte[]> zze;
    private final int zzf;
    private final java.lang.String zzg;
    private final byte[] zzh;

    private zzhi(java.util.List<android.os.ParcelUuid> list, android.util.SparseArray<byte[]> sparseArray, java.util.Map<android.os.ParcelUuid, byte[]> map, int i, int i2, java.lang.String str, byte[] bArr) {
        this.zzc = list;
        this.zzd = sparseArray;
        this.zze = map;
        this.zzg = str;
        this.zzb = i;
        this.zzf = i2;
        this.zzh = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    public static com.google.android.gms.internal.nearby.zzhi zza(byte[] bArr) {
        java.util.ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.HashMap map = new java.util.HashMap();
        int i = 0;
        java.lang.String str = null;
        byte b = -2147483648;
        int i2 = -1;
        while (i < bArr.length) {
            try {
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                if (i4 == 0) {
                    if (true != arrayList2.isEmpty()) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    return new com.google.android.gms.internal.nearby.zzhi(arrayList, sparseArray, map, i2, b, str, bArr);
                }
                int i5 = i4 - 1;
                int i6 = i3 + 1;
                int i7 = bArr[i3] & 255;
                if (i7 == 22) {
                    map.put(zzd(zzc(bArr, i6, 2)), zzc(bArr, i6 + 2, i5 - 2));
                } else if (i7 != 255) {
                    switch (i7) {
                        case 1:
                            i2 = bArr[i6] & 255;
                            break;
                        case 2:
                        case 3:
                            zzb(bArr, i6, i5, 2, arrayList2);
                            break;
                        case 4:
                        case 5:
                            zzb(bArr, i6, i5, 4, arrayList2);
                            break;
                        case 6:
                        case 7:
                            zzb(bArr, i6, i5, 16, arrayList2);
                            break;
                        case 8:
                        case 9:
                            str = new java.lang.String(zzc(bArr, i6, i5));
                            break;
                        case 10:
                            b = bArr[i6];
                            break;
                    }
                } else {
                    sparseArray.put(((bArr[i6 + 1] & 255) << 8) + (255 & bArr[i6]), zzc(bArr, i6 + 2, i5 - 2));
                }
                i = i5 + i6;
            } catch (java.lang.Exception e) {
                java.lang.String strValueOf = java.lang.String.valueOf(java.util.Arrays.toString(bArr));
                android.util.Log.w("BleRecord", strValueOf.length() != 0 ? "Unable to parse scan record: ".concat(strValueOf) : new java.lang.String("Unable to parse scan record: "), e);
                return null;
            }
        }
        if (true != arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.google.android.gms.internal.nearby.zzhi(arrayList, sparseArray, map, i2, b, str, bArr);
    }

    private static int zzb(byte[] bArr, int i, int i2, int i3, java.util.List<android.os.ParcelUuid> list) {
        while (i2 > 0) {
            list.add(zzd(zzc(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.nearby.zzhi) {
            return java.util.Arrays.equals(this.zzh, ((com.google.android.gms.internal.nearby.zzhi) obj).zzh);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zzh);
    }

    public final java.lang.String toString() {
        java.lang.String string;
        int i = this.zzb;
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzc);
        android.util.SparseArray<byte[]> sparseArray = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = sparseArray.size();
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        int i2 = 0;
        if (size <= 0) {
            string = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
        } else {
            sb.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int iKeyAt = sparseArray.keyAt(i3);
                byte[] bArrValueAt = sparseArray.valueAt(i3);
                sb.append(iKeyAt);
                sb.append('=');
                sb.append(bArrValueAt == null ? null : com.google.android.gms.common.util.Hex.bytesToStringUppercase(bArrValueAt));
            }
            sb.append('}');
            string = sb.toString();
        }
        java.util.Map<android.os.ParcelUuid, byte[]> map = this.zze;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (map.keySet().size() > 0) {
            sb2.append('{');
            for (java.util.Map.Entry<android.os.ParcelUuid, byte[]> entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                byte[] value = entry.getValue();
                sb2.append(value == null ? null : com.google.android.gms.common.util.Hex.bytesToStringUppercase(value));
                i2++;
            }
            sb2.append('}');
            string2 = sb2.toString();
        }
        int i4 = this.zzf;
        java.lang.String str = this.zzg;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 139 + java.lang.String.valueOf(string).length() + java.lang.String.valueOf(string2).length() + java.lang.String.valueOf(str).length());
        sb3.append("BleRecord [mAdvertiseFlags=");
        sb3.append(i);
        sb3.append(", mServiceUuids=");
        sb3.append(strValueOf);
        sb3.append(", mManufacturerSpecificData=");
        sb3.append(string);
        sb3.append(", mServiceData=");
        sb3.append(string2);
        sb3.append(", mTxPowerLevel=");
        sb3.append(i4);
        sb3.append(", mDeviceName=");
        sb3.append(str);
        sb3.append(com.ironsource.y8.i.e);
        return sb3.toString();
    }

    private static android.os.ParcelUuid zzd(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(38);
            sb.append("uuidBytes length invalid - ");
            sb.append(length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (length == 16) {
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return new android.os.ParcelUuid(new java.util.UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
        } else {
            j = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
        }
        android.os.ParcelUuid parcelUuid = zza;
        return new android.os.ParcelUuid(new java.util.UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }
}

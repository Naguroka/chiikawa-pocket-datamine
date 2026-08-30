package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(android.os.Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(android.os.Parcel parcel, int i) {
        zzb(parcel, i);
    }

    public static void writeBigDecimal(android.os.Parcel parcel, int i, java.math.BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigDecimalArray(android.os.Parcel parcel, int i, java.math.BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        zzb(parcel, iZza);
    }

    public static void writeBigInteger(android.os.Parcel parcel, int i, java.math.BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigIntegerArray(android.os.Parcel parcel, int i, java.math.BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(bigIntegerArr.length);
        for (java.math.BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, iZza);
    }

    public static void writeBoolean(android.os.Parcel parcel, int i, boolean z) {
        zzc(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void writeBooleanArray(android.os.Parcel parcel, int i, boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeBooleanList(android.os.Parcel parcel, int i, java.util.List<java.lang.Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).booleanValue() ? 1 : 0);
        }
        zzb(parcel, iZza);
    }

    public static void writeBooleanObject(android.os.Parcel parcel, int i, java.lang.Boolean bool, boolean z) {
        if (bool != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeBundle(android.os.Parcel parcel, int i, android.os.Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBundle(bundle);
            zzb(parcel, iZza);
        }
    }

    public static void writeByte(android.os.Parcel parcel, int i, byte b) {
        zzc(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void writeByteArray(android.os.Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeByteArray(bArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeByteArrayArray(android.os.Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, iZza);
    }

    public static void writeByteArraySparseArray(android.os.Parcel parcel, int i, android.util.SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeByteArray(sparseArray.valueAt(i2));
        }
        zzb(parcel, iZza);
    }

    public static void writeChar(android.os.Parcel parcel, int i, char c) {
        zzc(parcel, i, 4);
        parcel.writeInt(c);
    }

    public static void writeCharArray(android.os.Parcel parcel, int i, char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeCharArray(cArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDouble(android.os.Parcel parcel, int i, double d) {
        zzc(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void writeDoubleArray(android.os.Parcel parcel, int i, double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDoubleList(android.os.Parcel parcel, int i, java.util.List<java.lang.Double> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeDouble(list.get(i2).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeDoubleObject(android.os.Parcel parcel, int i, java.lang.Double d, boolean z) {
        if (d != null) {
            zzc(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeDoubleSparseArray(android.os.Parcel parcel, int i, android.util.SparseArray<java.lang.Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeDouble(sparseArray.valueAt(i2).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloat(android.os.Parcel parcel, int i, float f) {
        zzc(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void writeFloatArray(android.os.Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeFloatArray(fArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeFloatList(android.os.Parcel parcel, int i, java.util.List<java.lang.Float> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeFloat(list.get(i2).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloatObject(android.os.Parcel parcel, int i, java.lang.Float f, boolean z) {
        if (f != null) {
            zzc(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeFloatSparseArray(android.os.Parcel parcel, int i, android.util.SparseArray<java.lang.Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeFloat(sparseArray.valueAt(i2).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIBinder(android.os.Parcel parcel, int i, android.os.IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderArray(android.os.Parcel parcel, int i, android.os.IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderList(android.os.Parcel parcel, int i, java.util.List<android.os.IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBinderList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderSparseArray(android.os.Parcel parcel, int i, android.util.SparseArray<android.os.IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeStrongBinder(sparseArray.valueAt(i2));
        }
        zzb(parcel, iZza);
    }

    public static void writeInt(android.os.Parcel parcel, int i, int i2) {
        zzc(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void writeIntArray(android.os.Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeIntArray(iArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIntegerList(android.os.Parcel parcel, int i, java.util.List<java.lang.Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIntegerObject(android.os.Parcel parcel, int i, java.lang.Integer num, boolean z) {
        if (num != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeList(android.os.Parcel parcel, int i, java.util.List list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeLong(android.os.Parcel parcel, int i, long j) {
        zzc(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void writeLongArray(android.os.Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeLongArray(jArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeLongList(android.os.Parcel parcel, int i, java.util.List<java.lang.Long> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(list.get(i2).longValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeLongObject(android.os.Parcel parcel, int i, java.lang.Long l, boolean z) {
        if (l != null) {
            zzc(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeParcel(android.os.Parcel parcel, int i, android.os.Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, iZza);
        }
    }

    public static void writeParcelArray(android.os.Parcel parcel, int i, android.os.Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(parcelArr.length);
        for (android.os.Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelList(android.os.Parcel parcel, int i, java.util.List<android.os.Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            android.os.Parcel parcel2 = list.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelSparseArray(android.os.Parcel parcel, int i, android.util.SparseArray<android.os.Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            android.os.Parcel parcelValueAt = sparseArray.valueAt(i2);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelable(android.os.Parcel parcel, int i, android.os.Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            zzb(parcel, iZza);
        }
    }

    public static void writePendingIntent(android.os.Parcel parcel, int i, android.app.PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            android.app.PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, iZza);
        }
    }

    public static void writeShort(android.os.Parcel parcel, int i, short s) {
        zzc(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void writeSparseBooleanArray(android.os.Parcel parcel, int i, android.util.SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, iZza);
        }
    }

    public static void writeSparseIntArray(android.os.Parcel parcel, int i, android.util.SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseIntArray.keyAt(i2));
            parcel.writeInt(sparseIntArray.valueAt(i2));
        }
        zzb(parcel, iZza);
    }

    public static void writeSparseLongArray(android.os.Parcel parcel, int i, android.util.SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseLongArray.keyAt(i2));
            parcel.writeLong(sparseLongArray.valueAt(i2));
        }
        zzb(parcel, iZza);
    }

    public static void writeString(android.os.Parcel parcel, int i, java.lang.String str, boolean z) {
        if (str == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeString(str);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringArray(android.os.Parcel parcel, int i, java.lang.String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeStringArray(strArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringList(android.os.Parcel parcel, int i, java.util.List<java.lang.String> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeStringList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringSparseArray(android.os.Parcel parcel, int i, android.util.SparseArray<java.lang.String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeString(sparseArray.valueAt(i2));
        }
        zzb(parcel, iZza);
    }

    public static <T extends android.os.Parcelable> void writeTypedArray(android.os.Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, i2);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends android.os.Parcelable> void writeTypedList(android.os.Parcel parcel, int i, java.util.List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t, 0);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends android.os.Parcelable> void writeTypedSparseArray(android.os.Parcel parcel, int i, android.util.SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            T tValueAt = sparseArray.valueAt(i2);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzb(parcel, iZza);
    }

    private static int zza(android.os.Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(android.os.Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzc(android.os.Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static void zzd(android.os.Parcel parcel, android.os.Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}

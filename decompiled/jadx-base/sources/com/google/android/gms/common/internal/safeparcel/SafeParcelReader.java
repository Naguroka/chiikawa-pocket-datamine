package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class SafeParcelReader {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static class ParseException extends java.lang.RuntimeException {
        public ParseException(java.lang.String str, android.os.Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    public static java.math.BigDecimal createBigDecimal(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + size);
        return new java.math.BigDecimal(new java.math.BigInteger(bArrCreateByteArray), i2);
    }

    public static java.math.BigDecimal[] createBigDecimalArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        java.math.BigDecimal[] bigDecimalArr = new java.math.BigDecimal[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i3] = new java.math.BigDecimal(new java.math.BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + size);
        return bigDecimalArr;
    }

    public static java.math.BigInteger createBigInteger(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + size);
        return new java.math.BigInteger(bArrCreateByteArray);
    }

    public static java.math.BigInteger[] createBigIntegerArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bigIntegerArr[i3] = new java.math.BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + size);
        return bigIntegerArr;
    }

    public static boolean[] createBooleanArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + size);
        return zArrCreateBooleanArray;
    }

    public static java.util.ArrayList<java.lang.Boolean> createBooleanList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Boolean> arrayList = new java.util.ArrayList<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static android.os.Bundle createBundle(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.os.Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + size);
        return bundle;
    }

    public static byte[] createByteArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + size);
        return bArrCreateByteArray;
    }

    public static byte[][] createByteArrayArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + size);
        return bArr;
    }

    public static android.util.SparseArray<byte[]> createByteArraySparseArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        android.util.SparseArray<byte[]> sparseArray = new android.util.SparseArray<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static char[] createCharArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(iDataPosition + size);
        return cArrCreateCharArray;
    }

    public static double[] createDoubleArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + size);
        return dArrCreateDoubleArray;
    }

    public static java.util.ArrayList<java.lang.Double> createDoubleList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Double> arrayList = new java.util.ArrayList<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static android.util.SparseArray<java.lang.Double> createDoubleSparseArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.Double> sparseArray = new android.util.SparseArray<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            sparseArray.append(parcel.readInt(), java.lang.Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static float[] createFloatArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + size);
        return fArrCreateFloatArray;
    }

    public static java.util.ArrayList<java.lang.Float> createFloatList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static android.util.SparseArray<java.lang.Float> createFloatSparseArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.Float> sparseArray = new android.util.SparseArray<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            sparseArray.append(parcel.readInt(), java.lang.Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static android.os.IBinder[] createIBinderArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.os.IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(iDataPosition + size);
        return iBinderArrCreateBinderArray;
    }

    public static java.util.ArrayList<android.os.IBinder> createIBinderList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<android.os.IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(iDataPosition + size);
        return arrayListCreateBinderArrayList;
    }

    public static android.util.SparseArray<android.os.IBinder> createIBinderSparseArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        android.util.SparseArray<android.os.IBinder> sparseArray = new android.util.SparseArray<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static int[] createIntArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + size);
        return iArrCreateIntArray;
    }

    public static java.util.ArrayList<java.lang.Integer> createIntegerList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static long[] createLongArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + size);
        return jArrCreateLongArray;
    }

    public static java.util.ArrayList<java.lang.Long> createLongList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static android.os.Parcel createParcel(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, size);
        parcel.setDataPosition(iDataPosition + size);
        return parcelObtain;
    }

    public static android.os.Parcel[] createParcelArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        android.os.Parcel[] parcelArr = new android.os.Parcel[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parcel.readInt();
            if (i4 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i4);
                parcelArr[i3] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i4);
            } else {
                parcelArr[i3] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return parcelArr;
    }

    public static java.util.ArrayList<android.os.Parcel> createParcelList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        java.util.ArrayList<android.os.Parcel> arrayList = new java.util.ArrayList<>();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parcel.readInt();
            if (i4 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i4);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i4);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return arrayList;
    }

    public static android.util.SparseArray<android.os.Parcel> createParcelSparseArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        android.util.SparseArray<android.os.Parcel> sparseArray = new android.util.SparseArray<>();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            if (i5 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i5);
                sparseArray.append(i4, parcelObtain);
                parcel.setDataPosition(iDataPosition2 + i5);
            } else {
                sparseArray.append(i4, null);
            }
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static <T extends android.os.Parcelable> T createParcelable(android.os.Parcel parcel, int i, android.os.Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + size);
        return tCreateFromParcel;
    }

    public static android.util.SparseBooleanArray createSparseBooleanArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.util.SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(iDataPosition + size);
        return sparseBooleanArray;
    }

    public static android.util.SparseIntArray createSparseIntArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseIntArray;
    }

    public static android.util.SparseLongArray createSparseLongArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.util.SparseLongArray sparseLongArray = new android.util.SparseLongArray();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseLongArray;
    }

    public static java.lang.String createString(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.lang.String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + size);
        return string;
    }

    public static java.lang.String[] createStringArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + size);
        return strArrCreateStringArray;
    }

    public static java.util.ArrayList<java.lang.String> createStringList(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + size);
        return arrayListCreateStringArrayList;
    }

    public static android.util.SparseArray<java.lang.String> createStringSparseArray(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static <T> T[] createTypedArray(android.os.Parcel parcel, int i, android.os.Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + size);
        return tArr;
    }

    public static <T> java.util.ArrayList<T> createTypedList(android.os.Parcel parcel, int i, android.os.Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        java.util.ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + size);
        return arrayListCreateTypedArrayList;
    }

    public static <T> android.util.SparseArray<T> createTypedSparseArray(android.os.Parcel parcel, int i, android.os.Parcelable.Creator<T> creator) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        android.util.SparseArray<T> sparseArray = new android.util.SparseArray<>();
        for (int i3 = 0; i3 < i2; i3++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(iDataPosition + size);
        return sparseArray;
    }

    public static void ensureAtEnd(android.os.Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Overread allowed size end=" + i, parcel);
    }

    public static int getFieldId(int i) {
        return (char) i;
    }

    public static boolean readBoolean(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static java.lang.Boolean readBooleanObject(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        if (size == 0) {
            return null;
        }
        zza(parcel, i, size, 4);
        return java.lang.Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 8);
        return parcel.readDouble();
    }

    public static java.lang.Double readDoubleObject(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        if (size == 0) {
            return null;
        }
        zza(parcel, i, size, 8);
        return java.lang.Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return parcel.readFloat();
    }

    public static java.lang.Float readFloatObject(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        if (size == 0) {
            return null;
        }
        zza(parcel, i, size, 4);
        return java.lang.Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(android.os.Parcel parcel) {
        return parcel.readInt();
    }

    public static android.os.IBinder readIBinder(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + size);
        return strongBinder;
    }

    public static int readInt(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return parcel.readInt();
    }

    public static java.lang.Integer readIntegerObject(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        if (size == 0) {
            return null;
        }
        zza(parcel, i, size, 4);
        return java.lang.Integer.valueOf(parcel.readInt());
    }

    public static void readList(android.os.Parcel parcel, int i, java.util.List list, java.lang.ClassLoader classLoader) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + size);
    }

    public static long readLong(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 8);
        return parcel.readLong();
    }

    public static java.lang.Long readLongObject(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        if (size == 0) {
            return null;
        }
        zza(parcel, i, size, 8);
        return java.lang.Long.valueOf(parcel.readLong());
    }

    public static android.app.PendingIntent readPendingIntent(android.os.Parcel parcel, int i) {
        int size = readSize(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        android.app.PendingIntent pendingIntentOrNullFromParcel = android.app.PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + size);
        return pendingIntentOrNullFromParcel;
    }

    public static short readShort(android.os.Parcel parcel, int i) {
        zzb(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(android.os.Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(android.os.Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, i));
    }

    public static int validateObjectHeader(android.os.Parcel parcel) {
        int header = readHeader(parcel);
        int size = readSize(parcel, header);
        int fieldId = getFieldId(header);
        int iDataPosition = parcel.dataPosition();
        if (fieldId != 20293) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(header))), parcel);
        }
        int i = size + iDataPosition;
        if (i >= iDataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Size read is invalid start=" + iDataPosition + " end=" + i, parcel);
    }

    private static void zza(android.os.Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Expected size " + i3 + " got " + i2 + " (0x" + java.lang.Integer.toHexString(i2) + ")", parcel);
    }

    private static void zzb(android.os.Parcel parcel, int i, int i2) {
        int size = readSize(parcel, i);
        if (size == i2) {
            return;
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Expected size " + i2 + " got " + size + " (0x" + java.lang.Integer.toHexString(size) + ")", parcel);
    }
}

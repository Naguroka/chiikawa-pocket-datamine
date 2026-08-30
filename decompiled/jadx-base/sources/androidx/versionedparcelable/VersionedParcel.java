package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final java.lang.String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.Class> mParcelizerCache;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> mReadCache;
    protected final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> mWriteCache;

    protected abstract void closeField();

    protected abstract androidx.versionedparcelable.VersionedParcel createSubParcel();

    public boolean isStream() {
        return false;
    }

    protected abstract boolean readBoolean();

    protected abstract android.os.Bundle readBundle();

    protected abstract byte[] readByteArray();

    protected abstract java.lang.CharSequence readCharSequence();

    protected abstract double readDouble();

    protected abstract boolean readField(int i);

    protected abstract float readFloat();

    protected abstract int readInt();

    protected abstract long readLong();

    protected abstract <T extends android.os.Parcelable> T readParcelable();

    protected abstract java.lang.String readString();

    protected abstract android.os.IBinder readStrongBinder();

    protected abstract void setOutputField(int i);

    public void setSerializationFlags(boolean z, boolean z2) {
    }

    protected abstract void writeBoolean(boolean z);

    protected abstract void writeBundle(android.os.Bundle bundle);

    protected abstract void writeByteArray(byte[] bArr);

    protected abstract void writeByteArray(byte[] bArr, int i, int i2);

    protected abstract void writeCharSequence(java.lang.CharSequence charSequence);

    protected abstract void writeDouble(double d);

    protected abstract void writeFloat(float f);

    protected abstract void writeInt(int i);

    protected abstract void writeLong(long j);

    protected abstract void writeParcelable(android.os.Parcelable parcelable);

    protected abstract void writeString(java.lang.String str);

    protected abstract void writeStrongBinder(android.os.IBinder iBinder);

    protected abstract void writeStrongInterface(android.os.IInterface iInterface);

    public VersionedParcel(androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap2, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> arrayMap3) {
        this.mReadCache = arrayMap;
        this.mWriteCache = arrayMap2;
        this.mParcelizerCache = arrayMap3;
    }

    public void writeStrongInterface(android.os.IInterface iInterface, int i) {
        setOutputField(i);
        writeStrongInterface(iInterface);
    }

    public void writeBundle(android.os.Bundle bundle, int i) {
        setOutputField(i);
        writeBundle(bundle);
    }

    public void writeBoolean(boolean z, int i) {
        setOutputField(i);
        writeBoolean(z);
    }

    public void writeByteArray(byte[] bArr, int i) {
        setOutputField(i);
        writeByteArray(bArr);
    }

    public void writeByteArray(byte[] bArr, int i, int i2, int i3) {
        setOutputField(i3);
        writeByteArray(bArr, i, i2);
    }

    public void writeCharSequence(java.lang.CharSequence charSequence, int i) {
        setOutputField(i);
        writeCharSequence(charSequence);
    }

    public void writeInt(int i, int i2) {
        setOutputField(i2);
        writeInt(i);
    }

    public void writeLong(long j, int i) {
        setOutputField(i);
        writeLong(j);
    }

    public void writeFloat(float f, int i) {
        setOutputField(i);
        writeFloat(f);
    }

    public void writeDouble(double d, int i) {
        setOutputField(i);
        writeDouble(d);
    }

    public void writeString(java.lang.String str, int i) {
        setOutputField(i);
        writeString(str);
    }

    public void writeStrongBinder(android.os.IBinder iBinder, int i) {
        setOutputField(i);
        writeStrongBinder(iBinder);
    }

    public void writeParcelable(android.os.Parcelable parcelable, int i) {
        setOutputField(i);
        writeParcelable(parcelable);
    }

    public boolean readBoolean(boolean z, int i) {
        return !readField(i) ? z : readBoolean();
    }

    public int readInt(int i, int i2) {
        return !readField(i2) ? i : readInt();
    }

    public long readLong(long j, int i) {
        return !readField(i) ? j : readLong();
    }

    public float readFloat(float f, int i) {
        return !readField(i) ? f : readFloat();
    }

    public double readDouble(double d, int i) {
        return !readField(i) ? d : readDouble();
    }

    public java.lang.String readString(java.lang.String str, int i) {
        return !readField(i) ? str : readString();
    }

    public android.os.IBinder readStrongBinder(android.os.IBinder iBinder, int i) {
        return !readField(i) ? iBinder : readStrongBinder();
    }

    public byte[] readByteArray(byte[] bArr, int i) {
        return !readField(i) ? bArr : readByteArray();
    }

    public <T extends android.os.Parcelable> T readParcelable(T t, int i) {
        return !readField(i) ? t : (T) readParcelable();
    }

    public android.os.Bundle readBundle(android.os.Bundle bundle, int i) {
        return !readField(i) ? bundle : readBundle();
    }

    public void writeByte(byte b, int i) {
        setOutputField(i);
        writeInt(b);
    }

    public void writeSize(android.util.Size size, int i) {
        setOutputField(i);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    public void writeSizeF(android.util.SizeF sizeF, int i) {
        setOutputField(i);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(android.util.SparseBooleanArray sparseBooleanArray, int i) {
        setOutputField(i);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            writeInt(sparseBooleanArray.keyAt(i2));
            writeBoolean(sparseBooleanArray.valueAt(i2));
        }
    }

    public void writeBooleanArray(boolean[] zArr, int i) {
        setOutputField(i);
        writeBooleanArray(zArr);
    }

    protected void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z : zArr) {
                writeInt(z ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i) {
        return !readField(i) ? zArr : readBooleanArray();
    }

    protected boolean[] readBooleanArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        boolean[] zArr = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            zArr[i2] = readInt() != 0;
        }
        return zArr;
    }

    public void writeCharArray(char[] cArr, int i) {
        setOutputField(i);
        if (cArr != null) {
            writeInt(cArr.length);
            for (char c : cArr) {
                writeInt(c);
            }
            return;
        }
        writeInt(-1);
    }

    public java.lang.CharSequence readCharSequence(java.lang.CharSequence charSequence, int i) {
        return !readField(i) ? charSequence : readCharSequence();
    }

    public char[] readCharArray(char[] cArr, int i) {
        if (!readField(i)) {
            return cArr;
        }
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        char[] cArr2 = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr2[i3] = (char) readInt();
        }
        return cArr2;
    }

    public void writeIntArray(int[] iArr, int i) {
        setOutputField(i);
        writeIntArray(iArr);
    }

    protected void writeIntArray(int[] iArr) {
        if (iArr != null) {
            writeInt(iArr.length);
            for (int i : iArr) {
                writeInt(i);
            }
            return;
        }
        writeInt(-1);
    }

    public int[] readIntArray(int[] iArr, int i) {
        return !readField(i) ? iArr : readIntArray();
    }

    protected int[] readIntArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public void writeLongArray(long[] jArr, int i) {
        setOutputField(i);
        writeLongArray(jArr);
    }

    protected void writeLongArray(long[] jArr) {
        if (jArr != null) {
            writeInt(jArr.length);
            for (long j : jArr) {
                writeLong(j);
            }
            return;
        }
        writeInt(-1);
    }

    public long[] readLongArray(long[] jArr, int i) {
        return !readField(i) ? jArr : readLongArray();
    }

    protected long[] readLongArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong();
        }
        return jArr;
    }

    public void writeFloatArray(float[] fArr, int i) {
        setOutputField(i);
        writeFloatArray(fArr);
    }

    protected void writeFloatArray(float[] fArr) {
        if (fArr != null) {
            writeInt(fArr.length);
            for (float f : fArr) {
                writeFloat(f);
            }
            return;
        }
        writeInt(-1);
    }

    public float[] readFloatArray(float[] fArr, int i) {
        return !readField(i) ? fArr : readFloatArray();
    }

    protected float[] readFloatArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = readFloat();
        }
        return fArr;
    }

    public void writeDoubleArray(double[] dArr, int i) {
        setOutputField(i);
        writeDoubleArray(dArr);
    }

    protected void writeDoubleArray(double[] dArr) {
        if (dArr != null) {
            writeInt(dArr.length);
            for (double d : dArr) {
                writeDouble(d);
            }
            return;
        }
        writeInt(-1);
    }

    public double[] readDoubleArray(double[] dArr, int i) {
        return !readField(i) ? dArr : readDoubleArray();
    }

    protected double[] readDoubleArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        double[] dArr = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = readDouble();
        }
        return dArr;
    }

    public <T> void writeSet(java.util.Set<T> set, int i) {
        writeCollection(set, i);
    }

    public <T> void writeList(java.util.List<T> list, int i) {
        writeCollection(list, i);
    }

    public <K, V> void writeMap(java.util.Map<K, V> map, int i) {
        setOutputField(i);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        writeCollection(arrayList);
        writeCollection(arrayList2);
    }

    private <T> void writeCollection(java.util.Collection<T> collection, int i) {
        setOutputField(i);
        writeCollection(collection);
    }

    private <T> void writeCollection(java.util.Collection<T> collection) {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    java.util.Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        writeVersionedParcelable((androidx.versionedparcelable.VersionedParcelable) it.next());
                    }
                    break;
                case 2:
                    java.util.Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((android.os.Parcelable) it2.next());
                    }
                    break;
                case 3:
                    java.util.Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        writeSerializable((java.io.Serializable) it3.next());
                    }
                    break;
                case 4:
                    java.util.Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((java.lang.String) it4.next());
                    }
                    break;
                case 5:
                    java.util.Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((android.os.IBinder) it5.next());
                    }
                    break;
                case 7:
                    java.util.Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((java.lang.Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    java.util.Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((java.lang.Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    public <T> void writeArray(T[] tArr, int i) {
        setOutputField(i);
        writeArray(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void writeArray(T[] tArr) {
        if (tArr == 0) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i < length) {
                    writeVersionedParcelable((androidx.versionedparcelable.VersionedParcelable) tArr[i]);
                    i++;
                }
                return;
            }
            if (type == 2) {
                while (i < length) {
                    writeParcelable((android.os.Parcelable) tArr[i]);
                    i++;
                }
                return;
            }
            if (type == 3) {
                while (i < length) {
                    writeSerializable((java.io.Serializable) tArr[i]);
                    i++;
                }
            } else if (type == 4) {
                while (i < length) {
                    writeString((java.lang.String) tArr[i]);
                    i++;
                }
            } else {
                if (type != 5) {
                    return;
                }
                while (i < length) {
                    writeStrongBinder((android.os.IBinder) tArr[i]);
                    i++;
                }
            }
        }
    }

    private <T> int getType(T t) {
        if (t instanceof java.lang.String) {
            return 4;
        }
        if (t instanceof android.os.Parcelable) {
            return 2;
        }
        if (t instanceof androidx.versionedparcelable.VersionedParcelable) {
            return 1;
        }
        if (t instanceof java.io.Serializable) {
            return 3;
        }
        if (t instanceof android.os.IBinder) {
            return 5;
        }
        if (t instanceof java.lang.Integer) {
            return 7;
        }
        if (t instanceof java.lang.Float) {
            return 8;
        }
        throw new java.lang.IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    public void writeVersionedParcelable(androidx.versionedparcelable.VersionedParcelable versionedParcelable, int i) {
        setOutputField(i);
        writeVersionedParcelable(versionedParcelable);
    }

    protected void writeVersionedParcelable(androidx.versionedparcelable.VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(versionedParcelable);
        androidx.versionedparcelable.VersionedParcel versionedParcelCreateSubParcel = createSubParcel();
        writeToParcel(versionedParcelable, versionedParcelCreateSubParcel);
        versionedParcelCreateSubParcel.closeField();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(androidx.versionedparcelable.VersionedParcelable versionedParcelable) {
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public void writeSerializable(java.io.Serializable serializable, int i) {
        setOutputField(i);
        writeSerializable(serializable);
    }

    private void writeSerializable(java.io.Serializable serializable) {
        if (serializable == null) {
            writeString(null);
            return;
        }
        java.lang.String name = serializable.getClass().getName();
        writeString(name);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(java.lang.Exception exc, int i) {
        int i2;
        setOutputField(i);
        if (exc == 0) {
            writeNoException();
            return;
        }
        if ((exc instanceof android.os.Parcelable) && exc.getClass().getClassLoader() == android.os.Parcelable.class.getClassLoader()) {
            i2 = -9;
        } else if (exc instanceof java.lang.SecurityException) {
            i2 = -1;
        } else if (exc instanceof android.os.BadParcelableException) {
            i2 = -2;
        } else if (exc instanceof java.lang.IllegalArgumentException) {
            i2 = -3;
        } else if (exc instanceof java.lang.NullPointerException) {
            i2 = -4;
        } else if (exc instanceof java.lang.IllegalStateException) {
            i2 = -5;
        } else if (exc instanceof android.os.NetworkOnMainThreadException) {
            i2 = -6;
        } else {
            i2 = exc instanceof java.lang.UnsupportedOperationException ? -7 : 0;
        }
        writeInt(i2);
        if (i2 == 0) {
            if (exc instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) exc);
            }
            throw new java.lang.RuntimeException(exc);
        }
        writeString(exc.getMessage());
        if (i2 != -9) {
            return;
        }
        writeParcelable((android.os.Parcelable) exc);
    }

    protected void writeNoException() {
        writeInt(0);
    }

    public java.lang.Exception readException(java.lang.Exception exc, int i) {
        int exceptionCode;
        return (readField(i) && (exceptionCode = readExceptionCode()) != 0) ? readException(exceptionCode, readString()) : exc;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private java.lang.Exception readException(int i, java.lang.String str) {
        return createException(i, str);
    }

    protected static java.lang.Throwable getRootCause(java.lang.Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private java.lang.Exception createException(int i, java.lang.String str) {
        switch (i) {
            case -9:
                return (java.lang.Exception) readParcelable();
            case -8:
            default:
                return new java.lang.RuntimeException("Unknown exception code: " + i + " msg " + str);
            case -7:
                return new java.lang.UnsupportedOperationException(str);
            case -6:
                return new android.os.NetworkOnMainThreadException();
            case -5:
                return new java.lang.IllegalStateException(str);
            case -4:
                return new java.lang.NullPointerException(str);
            case -3:
                return new java.lang.IllegalArgumentException(str);
            case -2:
                return new android.os.BadParcelableException(str);
            case -1:
                return new java.lang.SecurityException(str);
        }
    }

    public byte readByte(byte b, int i) {
        return !readField(i) ? b : (byte) (readInt() & 255);
    }

    public android.util.Size readSize(android.util.Size size, int i) {
        if (!readField(i)) {
            return size;
        }
        if (readBoolean()) {
            return new android.util.Size(readInt(), readInt());
        }
        return null;
    }

    public android.util.SizeF readSizeF(android.util.SizeF sizeF, int i) {
        if (!readField(i)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new android.util.SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public android.util.SparseBooleanArray readSparseBooleanArray(android.util.SparseBooleanArray sparseBooleanArray, int i) {
        if (!readField(i)) {
            return sparseBooleanArray;
        }
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        android.util.SparseBooleanArray sparseBooleanArray2 = new android.util.SparseBooleanArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public <T> java.util.Set<T> readSet(java.util.Set<T> set, int i) {
        return !readField(i) ? set : (java.util.Set) readCollection(new androidx.collection.ArraySet());
    }

    public <T> java.util.List<T> readList(java.util.List<T> list, int i) {
        return !readField(i) ? list : (java.util.List) readCollection(new java.util.ArrayList());
    }

    private <T, S extends java.util.Collection<T>> S readCollection(S s) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        if (i != 0) {
            int i2 = readInt();
            if (i < 0) {
                return null;
            }
            if (i2 == 1) {
                while (i > 0) {
                    s.add(readVersionedParcelable());
                    i--;
                }
            } else if (i2 == 2) {
                while (i > 0) {
                    s.add(readParcelable());
                    i--;
                }
            } else if (i2 == 3) {
                while (i > 0) {
                    s.add(readSerializable());
                    i--;
                }
            } else if (i2 == 4) {
                while (i > 0) {
                    s.add(readString());
                    i--;
                }
            } else if (i2 == 5) {
                while (i > 0) {
                    s.add(readStrongBinder());
                    i--;
                }
            }
        }
        return s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> java.util.Map<K, V> readMap(java.util.Map<K, V> map, int i) {
        if (!readField(i)) {
            return map;
        }
        int i2 = readInt();
        if (i2 < 0) {
            return null;
        }
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        if (i2 == 0) {
            return arrayMap;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        readCollection(arrayList);
        readCollection(arrayList2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayMap.put(arrayList.get(i3), arrayList2.get(i3));
        }
        return arrayMap;
    }

    public <T> T[] readArray(T[] tArr, int i) {
        return !readField(i) ? tArr : (T[]) readArray(tArr);
    }

    protected <T> T[] readArray(T[] tArr) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        if (i != 0) {
            int i2 = readInt();
            if (i < 0) {
                return null;
            }
            if (i2 == 1) {
                while (i > 0) {
                    arrayList.add(readVersionedParcelable());
                    i--;
                }
            } else if (i2 == 2) {
                while (i > 0) {
                    arrayList.add(readParcelable());
                    i--;
                }
            } else if (i2 == 3) {
                while (i > 0) {
                    arrayList.add(readSerializable());
                    i--;
                }
            } else if (i2 == 4) {
                while (i > 0) {
                    arrayList.add(readString());
                    i--;
                }
            } else if (i2 == 5) {
                while (i > 0) {
                    arrayList.add(readStrongBinder());
                    i--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public <T extends androidx.versionedparcelable.VersionedParcelable> T readVersionedParcelable(T t, int i) {
        return !readField(i) ? t : (T) readVersionedParcelable();
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> T readVersionedParcelable() {
        java.lang.String string = readString();
        if (string == null) {
            return null;
        }
        return (T) readFromParcel(string, createSubParcel());
    }

    protected java.io.Serializable readSerializable() {
        java.lang.String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (java.io.Serializable) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(readByteArray())) { // from class: androidx.versionedparcelable.VersionedParcel.1
                @Override // java.io.ObjectInputStream
                protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass objectStreamClass) throws java.lang.ClassNotFoundException, java.io.IOException {
                    java.lang.Class<?> cls = java.lang.Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
                    return cls != null ? cls : super.resolveClass(objectStreamClass);
                }
            }.readObject();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + string + ")", e);
        } catch (java.lang.ClassNotFoundException e2) {
            throw new java.lang.RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + string + ")", e2);
        }
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> T readFromParcel(java.lang.String str, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        try {
            return (T) getReadMethod(str).invoke(null, versionedParcel);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            if (e4.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e4.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    protected <T extends androidx.versionedparcelable.VersionedParcelable> void writeToParcel(T t, androidx.versionedparcelable.VersionedParcel versionedParcel) {
        try {
            getWriteMethod(t.getClass()).invoke(null, t, versionedParcel);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            if (e4.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e4.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    private java.lang.reflect.Method getReadMethod(java.lang.String str) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        java.lang.reflect.Method method = this.mReadCache.get(str);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, androidx.versionedparcelable.VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", androidx.versionedparcelable.VersionedParcel.class);
        this.mReadCache.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.reflect.Method getWriteMethod(java.lang.Class cls) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        java.lang.reflect.Method method = this.mWriteCache.get(cls.getName());
        if (method != null) {
            return method;
        }
        java.lang.Class clsFindParcelClass = findParcelClass(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = clsFindParcelClass.getDeclaredMethod("write", cls, androidx.versionedparcelable.VersionedParcel.class);
        this.mWriteCache.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private java.lang.Class findParcelClass(java.lang.Class<? extends androidx.versionedparcelable.VersionedParcelable> cls) throws java.lang.ClassNotFoundException {
        java.lang.Class cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(java.lang.String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), cls3);
        return cls3;
    }

    public static class ParcelException extends java.lang.RuntimeException {
        public ParcelException(java.lang.Throwable th) {
            super(th);
        }
    }
}

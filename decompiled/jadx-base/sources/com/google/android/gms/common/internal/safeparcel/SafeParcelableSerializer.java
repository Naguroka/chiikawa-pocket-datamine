package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromBytes(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(creator);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromIntentExtra(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromString(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(str), creator);
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBundle(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        org.objectweb.asm.tree.MethodNode.AnonymousClass1 anonymousClass1 = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            anonymousClass1.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return anonymousClass1;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBundleSafe(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBytes(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        try {
            java.util.ArrayList<T> arrayList = new java.util.ArrayList<>();
            parcelObtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            parcelObtain.recycle();
        }
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromIntentExtra(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        org.objectweb.asm.tree.MethodNode.AnonymousClass1 anonymousClass1 = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            anonymousClass1.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return anonymousClass1;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromIntentExtraSafe(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToBundle(java.lang.Iterable<T> iterable, android.os.Bundle bundle, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToBundleSafe(java.lang.Iterable<T> iterable, android.os.Bundle bundle, java.lang.String str) {
        bundle.putByteArray(str, serializeIterableToBytes(iterable));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> byte[] serializeIterableToBytes(java.lang.Iterable<T> iterable) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeTypedList(com.google.android.gms.internal.common.zzal.zzk(iterable));
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToIntentExtra(java.lang.Iterable<T> iterable, android.content.Intent intent, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToIntentExtraSafe(java.lang.Iterable<T> iterable, android.content.Intent intent, java.lang.String str) {
        intent.putExtra(str, serializeIterableToBytes(iterable));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> byte[] serializeToBytes(T t) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeToIntentExtra(T t, android.content.Intent intent, java.lang.String str) {
        intent.putExtra(str, serializeToBytes(t));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.lang.String serializeToString(T t) {
        return com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }
}

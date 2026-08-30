package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class MetadataBundle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private final android.os.Bundle zzjh;
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = new com.google.android.gms.common.internal.GmsLogger("MetadataBundle", "");
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.MetadataBundle> CREATOR = new com.google.android.gms.drive.metadata.internal.zzj();

    MetadataBundle(android.os.Bundle bundle) {
        int i;
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        this.zzjh = bundle2;
        bundle2.setClassLoader(getClass().getClassLoader());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String next = it.next();
            if (com.google.android.gms.drive.metadata.internal.zzf.zzf(next) == null) {
                arrayList.add(next);
                zzbz.wfmt("MetadataBundle", "Ignored unknown metadata field in bundle: %s", next);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            this.zzjh.remove((java.lang.String) obj);
        }
    }

    public static com.google.android.gms.drive.metadata.internal.MetadataBundle zzbe() {
        return new com.google.android.gms.drive.metadata.internal.MetadataBundle(new android.os.Bundle());
    }

    public static <T> com.google.android.gms.drive.metadata.internal.MetadataBundle zza(com.google.android.gms.drive.metadata.MetadataField<T> metadataField, T t) {
        com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundleZzbe = zzbe();
        metadataBundleZzbe.zzb(metadataField, t);
        return metadataBundleZzbe;
    }

    public final com.google.android.gms.drive.metadata.internal.MetadataBundle zzbf() {
        return new com.google.android.gms.drive.metadata.internal.MetadataBundle(new android.os.Bundle(this.zzjh));
    }

    public final <T> void zzb(com.google.android.gms.drive.metadata.MetadataField<T> metadataField, T t) {
        if (com.google.android.gms.drive.metadata.internal.zzf.zzf(metadataField.getName()) == null) {
            java.lang.String strValueOf = java.lang.String.valueOf(metadataField.getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unregistered field: ".concat(strValueOf) : new java.lang.String("Unregistered field: "));
        }
        metadataField.zza(t, this.zzjh);
    }

    public final <T> T zza(com.google.android.gms.drive.metadata.MetadataField<T> metadataField) {
        return metadataField.zza(this.zzjh);
    }

    public final <T> T zzc(com.google.android.gms.drive.metadata.MetadataField<T> metadataField) {
        T t = (T) zza(metadataField);
        this.zzjh.remove(metadataField.getName());
        return t;
    }

    public final boolean zzd(com.google.android.gms.drive.metadata.MetadataField<?> metadataField) {
        return this.zzjh.containsKey(metadataField.getName());
    }

    public final java.util.Set<com.google.android.gms.drive.metadata.MetadataField<?>> zzbg() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<java.lang.String> it = this.zzjh.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(com.google.android.gms.drive.metadata.internal.zzf.zzf(it.next()));
        }
        return hashSet;
    }

    public final void zza(android.content.Context context) {
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = (com.google.android.gms.common.data.BitmapTeleporter) zza(com.google.android.gms.internal.drive.zzhs.zzkq);
        if (bitmapTeleporter != null) {
            bitmapTeleporter.setTempDir(context.getCacheDir());
        }
    }

    public final int hashCode() {
        java.util.Iterator<java.lang.String> it = this.zzjh.keySet().iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + this.zzjh.get(it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        com.google.android.gms.drive.metadata.internal.MetadataBundle metadataBundle = (com.google.android.gms.drive.metadata.internal.MetadataBundle) obj;
        java.util.Set<java.lang.String> setKeySet = this.zzjh.keySet();
        if (!setKeySet.equals(metadataBundle.zzjh.keySet())) {
            return false;
        }
        for (java.lang.String str : setKeySet) {
            if (!com.google.android.gms.common.internal.Objects.equal(this.zzjh.get(str), metadataBundle.zzjh.get(str))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, this.zzjh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

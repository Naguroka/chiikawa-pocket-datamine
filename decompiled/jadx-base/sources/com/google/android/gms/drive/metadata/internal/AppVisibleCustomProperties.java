package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class AppVisibleCustomProperties extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, java.lang.Iterable<com.google.android.gms.drive.metadata.internal.zzc> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties> CREATOR = new com.google.android.gms.drive.metadata.internal.zza();
    public static final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties zzjb = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza().zzbb();
    private final java.util.List<com.google.android.gms.drive.metadata.internal.zzc> zzjc;

    AppVisibleCustomProperties(java.util.Collection<com.google.android.gms.drive.metadata.internal.zzc> collection) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(collection);
        this.zzjc = new java.util.ArrayList(collection);
    }

    public static class zza {
        private final java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, com.google.android.gms.drive.metadata.internal.zzc> zzjd = new java.util.HashMap();

        public final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zza(com.google.android.gms.drive.metadata.CustomPropertyKey customPropertyKey, java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(customPropertyKey, com.ironsource.y8.h.W);
            this.zzjd.put(customPropertyKey, new com.google.android.gms.drive.metadata.internal.zzc(customPropertyKey, str));
            return this;
        }

        public final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zza(com.google.android.gms.drive.metadata.internal.zzc zzcVar) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzcVar, "property");
            this.zzjd.put(zzcVar.zzje, zzcVar);
            return this;
        }

        public final com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties zzbb() {
            return new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties(this.zzjd.values());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzjc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.google.android.gms.drive.metadata.internal.zzc> iterator() {
        return this.zzjc.iterator();
    }

    public final java.util.Map<com.google.android.gms.drive.metadata.CustomPropertyKey, java.lang.String> zzba() {
        java.util.HashMap map = new java.util.HashMap(this.zzjc.size());
        for (com.google.android.gms.drive.metadata.internal.zzc zzcVar : this.zzjc) {
            map.put(zzcVar.zzje, zzcVar.value);
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzjc);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return zzba().equals(((com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties) obj).zzba());
    }
}

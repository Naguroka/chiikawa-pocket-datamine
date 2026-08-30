package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ApiFeatureRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest> CREATOR = new com.google.android.gms.common.moduleinstall.internal.zac();
    private static final java.util.Comparator zaa = new java.util.Comparator() { // from class: com.google.android.gms.common.moduleinstall.internal.zab
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.common.Feature feature = (com.google.android.gms.common.Feature) obj;
            com.google.android.gms.common.Feature feature2 = (com.google.android.gms.common.Feature) obj2;
            android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest> creator = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.CREATOR;
            return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : java.lang.Long.compare(feature.getVersion(), feature2.getVersion());
        }
    };
    private final java.util.List zab;
    private final boolean zac;
    private final java.lang.String zad;
    private final java.lang.String zae;

    public ApiFeatureRequest(java.util.List list, boolean z, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zab = list;
        this.zac = z;
        this.zad = str;
        this.zae = str2;
    }

    public static com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest fromModuleInstallRequest(com.google.android.gms.common.moduleinstall.ModuleInstallRequest moduleInstallRequest) {
        return zaa(moduleInstallRequest.getApis(), true);
    }

    static com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zaa(java.util.List list, boolean z) {
        java.util.TreeSet treeSet = new java.util.TreeSet(zaa);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Collections.addAll(treeSet, ((com.google.android.gms.common.api.OptionalModuleApi) it.next()).getOptionalFeatures());
        }
        return new com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest(new java.util.ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest)) {
            return false;
        }
        com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest = (com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest) obj;
        return this.zac == apiFeatureRequest.zac && com.google.android.gms.common.internal.Objects.equal(this.zab, apiFeatureRequest.zab) && com.google.android.gms.common.internal.Objects.equal(this.zad, apiFeatureRequest.zad) && com.google.android.gms.common.internal.Objects.equal(this.zae, apiFeatureRequest.zae);
    }

    public java.util.List<com.google.android.gms.common.Feature> getApiFeatures() {
        return this.zab;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zac), this.zab, this.zad, this.zae);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getApiFeatures(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zad, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zae, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

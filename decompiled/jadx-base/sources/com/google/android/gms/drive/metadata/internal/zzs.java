package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzs extends com.google.android.gms.drive.metadata.zzb<java.lang.String> {
    public zzs(java.lang.String str, int i) {
        super(str, java.util.Collections.singleton(str), java.util.Collections.emptySet(), com.google.android.gms.common.util.GmsVersion.VERSION_JARLSBERG);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.zzb
    /* JADX INFO: renamed from: zzd */
    public final java.util.Collection<java.lang.String> zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        try {
            java.lang.String string = dataHolder.getString(getName(), i, i2);
            if (string == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray = new org.json.JSONArray(string);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                arrayList.add(jSONArray.getString(i3));
            }
            return java.util.Collections.unmodifiableCollection(arrayList);
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalStateException("DataHolder supplied invalid JSON", e);
        }
    }

    @Override // com.google.android.gms.drive.metadata.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        return zzc(dataHolder, i, i2);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle bundle, java.lang.Object obj) {
        bundle.putStringArrayList(getName(), new java.util.ArrayList<>((java.util.Collection) obj));
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzb(android.os.Bundle bundle) {
        return bundle.getStringArrayList(getName());
    }
}

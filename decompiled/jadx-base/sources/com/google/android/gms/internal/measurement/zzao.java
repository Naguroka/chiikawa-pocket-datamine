package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzao extends com.google.android.gms.internal.measurement.zzai implements com.google.android.gms.internal.measurement.zzal {
    protected final java.util.List zza;
    protected final java.util.List zzb;
    protected com.google.android.gms.internal.measurement.zzg zzc;

    private zzao(com.google.android.gms.internal.measurement.zzao zzaoVar) {
        super(zzaoVar.zzd);
        java.util.ArrayList arrayList = new java.util.ArrayList(zzaoVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzaoVar.zza);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(zzaoVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzaoVar.zzb);
        this.zzc = zzaoVar.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzg zzgVarZza = this.zzc.zza();
        int i = 0;
        while (true) {
            java.util.List list2 = this.zza;
            if (i >= list2.size()) {
                break;
            }
            if (i < list.size()) {
                zzgVarZza.zze((java.lang.String) list2.get(i), zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i)));
            } else {
                zzgVarZza.zze((java.lang.String) list2.get(i), zzf);
            }
            i++;
        }
        for (com.google.android.gms.internal.measurement.zzap zzapVar : this.zzb) {
            com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVarZza.zzb(zzapVar);
            if (zzapVarZzb instanceof com.google.android.gms.internal.measurement.zzaq) {
                zzapVarZzb = zzgVarZza.zzb(zzapVar);
            }
            if (zzapVarZzb instanceof com.google.android.gms.internal.measurement.zzag) {
                return ((com.google.android.gms.internal.measurement.zzag) zzapVarZzb).zzb();
            }
        }
        return com.google.android.gms.internal.measurement.zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
        return new com.google.android.gms.internal.measurement.zzao(this);
    }

    public zzao(java.lang.String str, java.util.List list, java.util.List list2, com.google.android.gms.internal.measurement.zzg zzgVar) {
        super(str);
        this.zza = new java.util.ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zza.add(((com.google.android.gms.internal.measurement.zzap) it.next()).zzi());
            }
        }
        this.zzb = new java.util.ArrayList(list2);
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs extends com.google.android.gms.internal.measurement.zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(com.google.android.gms.internal.measurement.zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.zzc = zztVar;
        this.zza = z;
        this.zzb = z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[LOOP:0: B:24:0x0088->B:26:0x0092, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        int i;
        int i2;
        java.lang.String strZzi;
        java.util.ArrayList arrayList;
        com.google.android.gms.internal.measurement.zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi(), java.util.Collections.emptyList(), this.zza, this.zzb);
            return zzf;
        }
        int iZzb = com.google.android.gms.internal.measurement.zzh.zzb(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzh().doubleValue());
        if (iZzb != 2) {
            i = 3;
            if (iZzb == 3) {
                i2 = 1;
            } else if (iZzb == 5) {
                i2 = 5;
            } else if (iZzb == 6) {
                i2 = 2;
            }
            strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzi();
            if (list.size() == 2) {
                this.zzc.zza.zza(i2, strZzi, java.util.Collections.emptyList(), this.zza, this.zzb);
                return zzf;
            }
            arrayList = new java.util.ArrayList();
            for (int i3 = 2; i3 < java.lang.Math.min(list.size(), 5); i3++) {
                arrayList.add(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i3)).zzi());
            }
            this.zzc.zza.zza(i2, strZzi, arrayList, this.zza, this.zzb);
            return zzf;
        }
        i = 4;
        i2 = i;
        strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            this.zzc.zza.zza(i2, strZzi, java.util.Collections.emptyList(), this.zza, this.zzb);
            return zzf;
        }
        arrayList = new java.util.ArrayList();
        while (i3 < java.lang.Math.min(list.size(), 5)) {
            arrayList.add(zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(i3)).zzi());
        }
        this.zzc.zza.zza(i2, strZzi, arrayList, this.zza, this.zzb);
        return zzf;
    }
}

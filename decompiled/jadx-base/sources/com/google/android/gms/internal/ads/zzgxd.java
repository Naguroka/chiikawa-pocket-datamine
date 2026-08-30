package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgxd extends com.google.android.gms.internal.ads.zzgxc {
    zzgxd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    final void zza(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzgxn) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    final void zzb(com.google.android.gms.internal.ads.zzhaw zzhawVar, java.util.Map.Entry entry) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgxo zzgxoVar = (com.google.android.gms.internal.ads.zzgxo) entry.getKey();
        if (!zzgxoVar.zzc) {
            com.google.android.gms.internal.ads.zzhau zzhauVar = com.google.android.gms.internal.ads.zzhau.DOUBLE;
            switch (zzgxoVar.zzb) {
                case DOUBLE:
                    zzhawVar.zzf(zzgxoVar.zza, ((java.lang.Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzhawVar.zzo(zzgxoVar.zza, ((java.lang.Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzhawVar.zzt(zzgxoVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzhawVar.zzK(zzgxoVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzhawVar.zzr(zzgxoVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzhawVar.zzm(zzgxoVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzhawVar.zzk(zzgxoVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzhawVar.zzb(zzgxoVar.zza, ((java.lang.Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzhawVar.zzG(zzgxoVar.zza, (java.lang.String) entry.getValue());
                    break;
                case GROUP:
                    zzhawVar.zzq(zzgxoVar.zza, entry.getValue(), com.google.android.gms.internal.ads.zzgzm.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzhawVar.zzv(zzgxoVar.zza, entry.getValue(), com.google.android.gms.internal.ads.zzgzm.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzhawVar.zzd(zzgxoVar.zza, (com.google.android.gms.internal.ads.zzgwj) entry.getValue());
                    break;
                case UINT32:
                    zzhawVar.zzI(zzgxoVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzhawVar.zzr(zzgxoVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzhawVar.zzx(zzgxoVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzhawVar.zzz(zzgxoVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzhawVar.zzB(zzgxoVar.zza, ((java.lang.Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzhawVar.zzD(zzgxoVar.zza, ((java.lang.Long) entry.getValue()).longValue());
                    break;
            }
        }
        com.google.android.gms.internal.ads.zzhau zzhauVar2 = com.google.android.gms.internal.ads.zzhau.DOUBLE;
        switch (zzgxoVar.zzb) {
            case DOUBLE:
                com.google.android.gms.internal.ads.zzgzx.zzt(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case FLOAT:
                com.google.android.gms.internal.ads.zzgzx.zzx(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case INT64:
                com.google.android.gms.internal.ads.zzgzx.zzA(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case UINT64:
                com.google.android.gms.internal.ads.zzgzx.zzI(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case INT32:
                com.google.android.gms.internal.ads.zzgzx.zzz(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case FIXED64:
                com.google.android.gms.internal.ads.zzgzx.zzw(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case FIXED32:
                com.google.android.gms.internal.ads.zzgzx.zzv(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case BOOL:
                com.google.android.gms.internal.ads.zzgzx.zzr(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case STRING:
                com.google.android.gms.internal.ads.zzgzx.zzG(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar);
                break;
            case GROUP:
                java.util.List list = (java.util.List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    com.google.android.gms.internal.ads.zzgzx.zzy(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, com.google.android.gms.internal.ads.zzgzm.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                java.util.List list2 = (java.util.List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    com.google.android.gms.internal.ads.zzgzx.zzB(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, com.google.android.gms.internal.ads.zzgzm.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                com.google.android.gms.internal.ads.zzgzx.zzs(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar);
                break;
            case UINT32:
                com.google.android.gms.internal.ads.zzgzx.zzH(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case ENUM:
                com.google.android.gms.internal.ads.zzgzx.zzz(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case SFIXED32:
                com.google.android.gms.internal.ads.zzgzx.zzC(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case SFIXED64:
                com.google.android.gms.internal.ads.zzgzx.zzD(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case SINT32:
                com.google.android.gms.internal.ads.zzgzx.zzE(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case SINT64:
                com.google.android.gms.internal.ads.zzgzx.zzF(zzgxoVar.zza, (java.util.List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
        }
    }
}

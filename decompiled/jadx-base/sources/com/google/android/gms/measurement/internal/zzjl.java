package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjl implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjl(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        this.zzc = zzjpVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03dc A[Catch: all -> 0x0535, TryCatch #3 {all -> 0x0535, blocks: (B:98:0x03b9, B:99:0x03d6, B:101:0x03dc, B:103:0x03f0, B:104:0x03fb, B:106:0x0445, B:107:0x0453, B:109:0x045b, B:110:0x045e, B:112:0x0466, B:115:0x046f, B:118:0x0486, B:119:0x0489, B:114:0x046c, B:131:0x051b, B:60:0x01f9, B:62:0x0201, B:64:0x0207), top: B:146:0x01f9, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0445 A[Catch: all -> 0x0535, TryCatch #3 {all -> 0x0535, blocks: (B:98:0x03b9, B:99:0x03d6, B:101:0x03dc, B:103:0x03f0, B:104:0x03fb, B:106:0x0445, B:107:0x0453, B:109:0x045b, B:110:0x045e, B:112:0x0466, B:115:0x046f, B:118:0x0486, B:119:0x0489, B:114:0x046c, B:131:0x051b, B:60:0x01f9, B:62:0x0201, B:64:0x0207), top: B:146:0x01f9, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x045b A[Catch: all -> 0x0535, TryCatch #3 {all -> 0x0535, blocks: (B:98:0x03b9, B:99:0x03d6, B:101:0x03dc, B:103:0x03f0, B:104:0x03fb, B:106:0x0445, B:107:0x0453, B:109:0x045b, B:110:0x045e, B:112:0x0466, B:115:0x046f, B:118:0x0486, B:119:0x0489, B:114:0x046c, B:131:0x051b, B:60:0x01f9, B:62:0x0201, B:64:0x0207), top: B:146:0x01f9, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0466 A[Catch: all -> 0x0535, TryCatch #3 {all -> 0x0535, blocks: (B:98:0x03b9, B:99:0x03d6, B:101:0x03dc, B:103:0x03f0, B:104:0x03fb, B:106:0x0445, B:107:0x0453, B:109:0x045b, B:110:0x045e, B:112:0x0466, B:115:0x046f, B:118:0x0486, B:119:0x0489, B:114:0x046c, B:131:0x051b, B:60:0x01f9, B:62:0x0201, B:64:0x0207), top: B:146:0x01f9, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x046a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x046c A[Catch: all -> 0x0535, TryCatch #3 {all -> 0x0535, blocks: (B:98:0x03b9, B:99:0x03d6, B:101:0x03dc, B:103:0x03f0, B:104:0x03fb, B:106:0x0445, B:107:0x0453, B:109:0x045b, B:110:0x045e, B:112:0x0466, B:115:0x046f, B:118:0x0486, B:119:0x0489, B:114:0x046c, B:131:0x051b, B:60:0x01f9, B:62:0x0201, B:64:0x0207), top: B:146:0x01f9, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c8 A[Catch: all -> 0x0537, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0537, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x0110, B:34:0x011d, B:36:0x0137, B:38:0x0147, B:40:0x014f, B:42:0x0155, B:43:0x0158, B:45:0x0167, B:47:0x016d, B:49:0x017f, B:51:0x0189, B:52:0x019a, B:54:0x019e, B:56:0x01ab, B:59:0x01c8, B:60:0x01f9, B:62:0x0201, B:64:0x0207, B:65:0x021e, B:67:0x0228, B:68:0x0235, B:69:0x0247, B:71:0x024d, B:78:0x0265, B:81:0x028e, B:82:0x0295, B:84:0x029b, B:85:0x02cf, B:80:0x0269, B:31:0x0114, B:33:0x011a), top: B:148:0x0058, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0201 A[Catch: SecurityException -> 0x0518, all -> 0x0537, TryCatch #4 {SecurityException -> 0x0518, blocks: (B:60:0x01f9, B:62:0x0201, B:64:0x0207), top: B:146:0x01f9, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0228 A[Catch: all -> 0x0537, TryCatch #5 {all -> 0x0537, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x0110, B:34:0x011d, B:36:0x0137, B:38:0x0147, B:40:0x014f, B:42:0x0155, B:43:0x0158, B:45:0x0167, B:47:0x016d, B:49:0x017f, B:51:0x0189, B:52:0x019a, B:54:0x019e, B:56:0x01ab, B:59:0x01c8, B:60:0x01f9, B:62:0x0201, B:64:0x0207, B:65:0x021e, B:67:0x0228, B:68:0x0235, B:69:0x0247, B:71:0x024d, B:78:0x0265, B:81:0x028e, B:82:0x0295, B:84:0x029b, B:85:0x02cf, B:80:0x0269, B:31:0x0114, B:33:0x011a), top: B:148:0x0058, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x024d A[Catch: all -> 0x0537, TryCatch #5 {all -> 0x0537, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x0110, B:34:0x011d, B:36:0x0137, B:38:0x0147, B:40:0x014f, B:42:0x0155, B:43:0x0158, B:45:0x0167, B:47:0x016d, B:49:0x017f, B:51:0x0189, B:52:0x019a, B:54:0x019e, B:56:0x01ab, B:59:0x01c8, B:60:0x01f9, B:62:0x0201, B:64:0x0207, B:65:0x021e, B:67:0x0228, B:68:0x0235, B:69:0x0247, B:71:0x024d, B:78:0x0265, B:81:0x028e, B:82:0x0295, B:84:0x029b, B:85:0x02cf, B:80:0x0269, B:31:0x0114, B:33:0x011a), top: B:148:0x0058, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0265 A[Catch: all -> 0x0537, TryCatch #5 {all -> 0x0537, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x0110, B:34:0x011d, B:36:0x0137, B:38:0x0147, B:40:0x014f, B:42:0x0155, B:43:0x0158, B:45:0x0167, B:47:0x016d, B:49:0x017f, B:51:0x0189, B:52:0x019a, B:54:0x019e, B:56:0x01ab, B:59:0x01c8, B:60:0x01f9, B:62:0x0201, B:64:0x0207, B:65:0x021e, B:67:0x0228, B:68:0x0235, B:69:0x0247, B:71:0x024d, B:78:0x0265, B:81:0x028e, B:82:0x0295, B:84:0x029b, B:85:0x02cf, B:80:0x0269, B:31:0x0114, B:33:0x011a), top: B:148:0x0058, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0269 A[Catch: all -> 0x0537, TryCatch #5 {all -> 0x0537, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x0110, B:34:0x011d, B:36:0x0137, B:38:0x0147, B:40:0x014f, B:42:0x0155, B:43:0x0158, B:45:0x0167, B:47:0x016d, B:49:0x017f, B:51:0x0189, B:52:0x019a, B:54:0x019e, B:56:0x01ab, B:59:0x01c8, B:60:0x01f9, B:62:0x0201, B:64:0x0207, B:65:0x021e, B:67:0x0228, B:68:0x0235, B:69:0x0247, B:71:0x024d, B:78:0x0265, B:81:0x028e, B:82:0x0295, B:84:0x029b, B:85:0x02cf, B:80:0x0269, B:31:0x0114, B:33:0x011a), top: B:148:0x0058, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x029b A[Catch: all -> 0x0537, LOOP:1: B:82:0x0295->B:84:0x029b, LOOP_END, TryCatch #5 {all -> 0x0537, blocks: (B:8:0x0058, B:10:0x0063, B:13:0x007d, B:15:0x0083, B:16:0x0095, B:18:0x00ac, B:19:0x00b3, B:21:0x00bd, B:22:0x00ca, B:24:0x00d4, B:25:0x00e1, B:27:0x00ec, B:28:0x00f4, B:30:0x0110, B:34:0x011d, B:36:0x0137, B:38:0x0147, B:40:0x014f, B:42:0x0155, B:43:0x0158, B:45:0x0167, B:47:0x016d, B:49:0x017f, B:51:0x0189, B:52:0x019a, B:54:0x019e, B:56:0x01ab, B:59:0x01c8, B:60:0x01f9, B:62:0x0201, B:64:0x0207, B:65:0x021e, B:67:0x0228, B:68:0x0235, B:69:0x0247, B:71:0x024d, B:78:0x0265, B:81:0x028e, B:82:0x0295, B:84:0x029b, B:85:0x02cf, B:80:0x0269, B:31:0x0114, B:33:0x011a), top: B:148:0x0058, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0336 A[Catch: all -> 0x0514, TryCatch #2 {all -> 0x0514, blocks: (B:87:0x030a, B:89:0x0336, B:90:0x034a, B:92:0x0356, B:94:0x03a2, B:93:0x0388), top: B:144:0x030a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0356 A[Catch: all -> 0x0514, TryCatch #2 {all -> 0x0514, blocks: (B:87:0x030a, B:89:0x0336, B:90:0x034a, B:92:0x0356, B:94:0x03a2, B:93:0x0388), top: B:144:0x030a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0388 A[Catch: all -> 0x0514, TryCatch #2 {all -> 0x0514, blocks: (B:87:0x030a, B:89:0x0336, B:90:0x034a, B:92:0x0356, B:94:0x03a2, B:93:0x0388), top: B:144:0x030a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.measurement.internal.zzbh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.measurement.internal.zzoz] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        byte[] bArr;
        com.google.android.gms.measurement.internal.zzpv zzpvVar;
        java.lang.String strZzC;
        com.google.android.gms.measurement.internal.zzpv zzpvVar2;
        java.util.List listZzE;
        java.util.Iterator it;
        com.google.android.gms.measurement.internal.zzqd zzqdVar;
        com.google.android.gms.internal.measurement.zzio[] zzioVarArr;
        int i;
        com.google.android.gms.measurement.internal.zzio zzioVar;
        android.os.Bundle bundle;
        java.lang.String str;
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzs;
        com.google.android.gms.measurement.internal.zzh zzhVar;
        java.lang.Object obj;
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzc;
        long j;
        com.google.android.gms.internal.measurement.zzhl zzhlVarZze;
        com.google.android.gms.measurement.internal.zzbf zzbfVar;
        com.google.android.gms.measurement.internal.zzbe zzbeVar;
        long jZzs;
        long jZzu;
        java.lang.String strZzL;
        com.google.android.gms.internal.measurement.zzhp zzhpVarZze;
        java.lang.Object objZzf;
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj;
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzc;
        zzjpVar.zza.zzL();
        com.google.android.gms.measurement.internal.zzmc zzmcVarZzv = zzjpVar.zza.zzv();
        zzmcVarZzv.zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzmcVarZzv.zzu;
        com.google.android.gms.measurement.internal.zzio.zzP();
        ?? r4 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r4);
        java.lang.String str2 = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        java.lang.String str3 = r4.zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzmcVarZzv.zzu.zzaW().zzd().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        com.google.android.gms.measurement.internal.zzpv zzpvVar3 = zzmcVarZzv.zzg;
        com.google.android.gms.internal.measurement.zzht zzhtVarZzb = com.google.android.gms.internal.measurement.zzhv.zzb();
        zzpvVar3.zzj().zzH();
        try {
            com.google.android.gms.measurement.internal.zzh zzhVarZzl = zzpvVar3.zzj().zzl(str2);
            if (zzhVarZzl != null) {
                if (zzhVarZzl.zzaJ()) {
                    com.google.android.gms.internal.measurement.zzhw zzhwVarZzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                    zzhwVarZzz.zzar(1);
                    zzhwVarZzz.zzan("android");
                    if (!android.text.TextUtils.isEmpty(zzhVarZzl.zzC())) {
                        zzhwVarZzz.zzI(zzhVarZzl.zzC());
                    }
                    if (!android.text.TextUtils.isEmpty(zzhVarZzl.zzE())) {
                        zzhwVarZzz.zzK((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzE()));
                    }
                    if (!android.text.TextUtils.isEmpty(zzhVarZzl.zzF())) {
                        zzhwVarZzz.zzL((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzF()));
                    }
                    if (zzhVarZzl.zze() != -2147483648L) {
                        zzhwVarZzz.zzM((int) zzhVarZzl.zze());
                    }
                    zzhwVarZzz.zzai(zzhVarZzl.zzq());
                    zzhwVarZzz.zzZ(zzhVarZzl.zzo());
                    java.lang.String strZzH = zzhVarZzl.zzH();
                    java.lang.String strZzA = zzhVarZzl.zzA();
                    if (!android.text.TextUtils.isEmpty(strZzH)) {
                        zzhwVarZzz.zzah(strZzH);
                    } else if (!android.text.TextUtils.isEmpty(strZzA)) {
                        zzhwVarZzz.zzH(strZzA);
                    }
                    zzhwVarZzz.zzay(zzhVarZzl.zzw());
                    com.google.android.gms.measurement.internal.zzjx zzjxVarZzu = zzmcVarZzv.zzg.zzu(str2);
                    zzhwVarZzz.zzW(zzhVarZzl.zzn());
                    if (zzioVar2.zzJ() && zzmcVarZzv.zzu.zzf().zzy(zzhwVarZzz.zzaF()) && zzjxVarZzu.zzr(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE) && !android.text.TextUtils.isEmpty(null)) {
                        zzhwVarZzz.zzY(null);
                    }
                    zzhwVarZzz.zzT(zzjxVarZzu.zzp());
                    if (zzjxVarZzu.zzr(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE) && zzhVarZzl.zzaI()) {
                        android.util.Pair pairZzd = zzpvVar3.zzw().zzd(zzhVarZzl.zzC(), zzjxVarZzu);
                        if (!zzhVarZzl.zzaI() || android.text.TextUtils.isEmpty((java.lang.CharSequence) pairZzd.first)) {
                            com.google.android.gms.measurement.internal.zzio zzioVar3 = zzmcVarZzv.zzu;
                            zzioVar3.zzg().zzv();
                            zzhwVarZzz.zzX(android.os.Build.MODEL);
                            zzioVar3.zzg().zzv();
                            zzhwVarZzz.zzam(android.os.Build.VERSION.RELEASE);
                            zzhwVarZzz.zzaz((int) zzioVar3.zzg().zza());
                            zzhwVarZzz.zzaD(zzioVar3.zzg().zzb());
                            if (zzjxVarZzu.zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE)) {
                                zzhwVarZzz.zzJ(com.google.android.gms.measurement.internal.zzmc.zza((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzD()), java.lang.Long.toString(r4.zzd)));
                            }
                            if (!android.text.TextUtils.isEmpty(zzhVarZzl.zzG())) {
                                zzhwVarZzz.zzag((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzG()));
                            }
                            strZzC = zzhVarZzl.zzC();
                            zzpvVar2 = zzmcVarZzv.zzg;
                            listZzE = zzpvVar2.zzj().zzE(strZzC);
                            it = listZzE.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzqdVar = null;
                                    break;
                                }
                                zzqdVar = (com.google.android.gms.measurement.internal.zzqd) it.next();
                            } while (!"_lte".equals(zzqdVar.zzc));
                            if (zzqdVar != null) {
                                com.google.android.gms.measurement.internal.zzqd zzqdVar2 = new com.google.android.gms.measurement.internal.zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar2);
                                zzpvVar2.zzj().zzai(zzqdVar2);
                            } else {
                                com.google.android.gms.measurement.internal.zzqd zzqdVar3 = new com.google.android.gms.measurement.internal.zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar3);
                                zzpvVar2.zzj().zzai(zzqdVar3);
                            }
                            zzioVarArr = new com.google.android.gms.internal.measurement.zzio[listZzE.size()];
                            for (i = 0; i < listZzE.size(); i++) {
                                com.google.android.gms.internal.measurement.zzin zzinVarZze = com.google.android.gms.internal.measurement.zzio.zze();
                                zzinVarZze.zzf(((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zzc);
                                zzinVarZze.zzg(((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zzd);
                                zzpvVar2.zzA().zzx(zzinVarZze, ((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zze);
                                zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zzinVarZze.zzba();
                            }
                            zzhwVarZzz.zzm(java.util.Arrays.asList(zzioVarArr));
                            com.google.android.gms.measurement.internal.zzpv zzpvVar4 = zzmcVarZzv.zzg;
                            zzpvVar4.zzQ(zzhVarZzl, zzhwVarZzz);
                            zzpvVar4.zzaa(zzhVarZzl, zzhwVarZzz);
                            com.google.android.gms.measurement.internal.zzhf zzhfVarZzb = com.google.android.gms.measurement.internal.zzhf.zzb(r4);
                            zzioVar = zzmcVarZzv.zzu;
                            com.google.android.gms.measurement.internal.zzqf zzqfVarZzw = zzioVar.zzw();
                            bundle = zzhfVarZzb.zzd;
                            zzqfVarZzw.zzO(bundle, zzpvVar2.zzj().zzk(str2));
                            zzioVar.zzw().zzQ(zzhfVarZzb, zzioVar.zzf().zzf(str2));
                            bundle.putLong("_c", 1L);
                            zzioVar.zzaW().zzd().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            java.lang.String str4 = r4.zzc;
                            bundle.putString("_o", str4);
                            if (zzioVar.zzw().zzak(zzhwVarZzz.zzaF(), zzhVarZzl.zzM())) {
                                zzioVar.zzw().zzS(bundle, "_dbg", 1L);
                                zzioVar.zzw().zzS(bundle, "_r", 1L);
                            }
                            com.google.android.gms.measurement.internal.zzaw zzawVarZzj2 = zzpvVar2.zzj();
                            str = r4.zza;
                            zzbdVarZzs = zzawVarZzj2.zzs(str2, str);
                            if (zzbdVarZzs == null) {
                                zzhVar = zzhVarZzl;
                                obj = null;
                                zzbdVarZzc = new com.google.android.gms.measurement.internal.zzbd(str2, str, 0L, 0L, 0L, r4.zzd, 0L, null, null, null, null);
                                j = 0;
                            } else {
                                zzhVar = zzhVarZzl;
                                obj = null;
                                long j2 = zzbdVarZzs.zzf;
                                zzbdVarZzc = zzbdVarZzs.zzc(r4.zzd);
                                j = j2;
                            }
                            zzpvVar2.zzj().zzV(zzbdVarZzc);
                            com.google.android.gms.measurement.internal.zzbc zzbcVar = new com.google.android.gms.measurement.internal.zzbc(zzmcVarZzv.zzu, str4, str2, str, r4.zzd, j, bundle);
                            zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
                            zzhlVarZze.zzm(zzbcVar.zzd);
                            zzhlVarZze.zzi(zzbcVar.zzb);
                            zzhlVarZze.zzl(zzbcVar.zze);
                            zzbfVar = zzbcVar.zzf;
                            zzbeVar = new com.google.android.gms.measurement.internal.zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                java.lang.String next = zzbeVar.next();
                                java.lang.String str5 = next;
                                zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zzhpVarZze.zzj(next);
                                objZzf = zzbfVar.zzf(next);
                                if (objZzf != null) {
                                    zzpvVar2.zzA().zzw(zzhpVarZze, objZzf);
                                    zzhlVarZze.zze(zzhpVarZze);
                                }
                            }
                            zzhwVarZzz.zzn(zzhlVarZze);
                            com.google.android.gms.internal.measurement.zzhy zzhyVarZza = com.google.android.gms.internal.measurement.zzia.zza();
                            com.google.android.gms.internal.measurement.zzhn zzhnVarZza = com.google.android.gms.internal.measurement.zzho.zza();
                            zzhnVarZza.zza(zzbdVarZzc.zzc);
                            zzhnVarZza.zzb(str);
                            zzhyVarZza.zza(zzhnVarZza);
                            zzhwVarZzz.zzao(zzhyVarZza);
                            zzhwVarZzz.zzi(zzpvVar2.zzh().zza(zzhVar.zzC(), java.util.Collections.emptyList(), zzhwVarZzz.zzaN(), java.lang.Long.valueOf(zzhlVarZze.zzc()), java.lang.Long.valueOf(zzhlVarZze.zzc()), false));
                            if (zzhlVarZze.zzq()) {
                                zzhwVarZzz.zzax(zzhlVarZze.zzc());
                                zzhwVarZzz.zzab(zzhlVarZze.zzc());
                            }
                            jZzs = zzhVar.zzs();
                            if (jZzs != 0) {
                                zzhwVarZzz.zzap(jZzs);
                            }
                            jZzu = zzhVar.zzu();
                            if (jZzu != 0) {
                                zzhwVarZzz.zzaq(jZzu);
                            } else if (jZzs != 0) {
                                zzhwVarZzz.zzaq(jZzs);
                            }
                            strZzL = zzhVar.zzL();
                            com.google.android.gms.internal.measurement.zzrd.zzb();
                            if (zzioVar.zzf().zzx(str2, com.google.android.gms.measurement.internal.zzgi.zzaL)) {
                                zzhwVarZzz.zzav(strZzL);
                            }
                            zzhVar.zzP();
                            zzhwVarZzz.zzP((int) zzhVar.zzt());
                            zzioVar.zzf().zzj();
                            zzhwVarZzz.zzaB(119002L);
                            zzhwVarZzz.zzaA(zzioVar.zzaU().currentTimeMillis());
                            zzhwVarZzz.zzau(java.lang.Boolean.TRUE.booleanValue());
                            zzpvVar4.zzN(zzhwVarZzz.zzaF(), zzhwVarZzz);
                            zzhtVarZzb.zzc(zzhwVarZzz);
                            com.google.android.gms.measurement.internal.zzh zzhVar2 = zzhVar;
                            zzhVar2.zzau(zzhwVarZzz.zzf());
                            zzhVar2.zzas(zzhwVarZzz.zze());
                            zzpvVar2.zzj().zzT(zzhVar2, false, false);
                            zzpvVar2.zzj().zzS();
                            zzpvVar2.zzj().zzL();
                            return zzpvVar2.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVarZzb.zzba()).zzcd());
                        }
                        try {
                            zzhwVarZzz.zzas(com.google.android.gms.measurement.internal.zzmc.zza((java.lang.String) pairZzd.first, java.lang.Long.toString(r4.zzd)));
                            if (pairZzd.second != null) {
                                zzhwVarZzz.zzal(((java.lang.Boolean) pairZzd.second).booleanValue());
                            }
                            com.google.android.gms.measurement.internal.zzio zzioVar4 = zzmcVarZzv.zzu;
                            zzioVar4.zzg().zzv();
                            zzhwVarZzz.zzX(android.os.Build.MODEL);
                            zzioVar4.zzg().zzv();
                            zzhwVarZzz.zzam(android.os.Build.VERSION.RELEASE);
                            zzhwVarZzz.zzaz((int) zzioVar4.zzg().zza());
                            zzhwVarZzz.zzaD(zzioVar4.zzg().zzb());
                            if (zzjxVarZzu.zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE)) {
                                zzhwVarZzz.zzJ(com.google.android.gms.measurement.internal.zzmc.zza((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzD()), java.lang.Long.toString(r4.zzd)));
                            }
                            if (!android.text.TextUtils.isEmpty(zzhVarZzl.zzG())) {
                                zzhwVarZzz.zzag((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzG()));
                            }
                            strZzC = zzhVarZzl.zzC();
                            zzpvVar2 = zzmcVarZzv.zzg;
                            listZzE = zzpvVar2.zzj().zzE(strZzC);
                            it = listZzE.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzqdVar = null;
                                    break;
                                }
                                zzqdVar = (com.google.android.gms.measurement.internal.zzqd) it.next();
                            } while (!"_lte".equals(zzqdVar.zzc));
                            if (zzqdVar != null) {
                                com.google.android.gms.measurement.internal.zzqd zzqdVar4 = new com.google.android.gms.measurement.internal.zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar4);
                                zzpvVar2.zzj().zzai(zzqdVar4);
                            } else {
                                com.google.android.gms.measurement.internal.zzqd zzqdVar5 = new com.google.android.gms.measurement.internal.zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar5);
                                zzpvVar2.zzj().zzai(zzqdVar5);
                            }
                            zzioVarArr = new com.google.android.gms.internal.measurement.zzio[listZzE.size()];
                            while (i < listZzE.size()) {
                                com.google.android.gms.internal.measurement.zzin zzinVarZze2 = com.google.android.gms.internal.measurement.zzio.zze();
                                zzinVarZze2.zzf(((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zzc);
                                zzinVarZze2.zzg(((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zzd);
                                zzpvVar2.zzA().zzx(zzinVarZze2, ((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zze);
                                zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zzinVarZze2.zzba();
                            }
                            zzhwVarZzz.zzm(java.util.Arrays.asList(zzioVarArr));
                            com.google.android.gms.measurement.internal.zzpv zzpvVar5 = zzmcVarZzv.zzg;
                            zzpvVar5.zzQ(zzhVarZzl, zzhwVarZzz);
                            zzpvVar5.zzaa(zzhVarZzl, zzhwVarZzz);
                            com.google.android.gms.measurement.internal.zzhf zzhfVarZzb2 = com.google.android.gms.measurement.internal.zzhf.zzb(r4);
                            zzioVar = zzmcVarZzv.zzu;
                            com.google.android.gms.measurement.internal.zzqf zzqfVarZzw2 = zzioVar.zzw();
                            bundle = zzhfVarZzb2.zzd;
                            zzqfVarZzw2.zzO(bundle, zzpvVar2.zzj().zzk(str2));
                            zzioVar.zzw().zzQ(zzhfVarZzb2, zzioVar.zzf().zzf(str2));
                            bundle.putLong("_c", 1L);
                            zzioVar.zzaW().zzd().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            java.lang.String str6 = r4.zzc;
                            bundle.putString("_o", str6);
                            if (zzioVar.zzw().zzak(zzhwVarZzz.zzaF(), zzhVarZzl.zzM())) {
                                zzioVar.zzw().zzS(bundle, "_dbg", 1L);
                                zzioVar.zzw().zzS(bundle, "_r", 1L);
                            }
                            com.google.android.gms.measurement.internal.zzaw zzawVarZzj3 = zzpvVar2.zzj();
                            str = r4.zza;
                            zzbdVarZzs = zzawVarZzj3.zzs(str2, str);
                            if (zzbdVarZzs == null) {
                                zzhVar = zzhVarZzl;
                                obj = null;
                                zzbdVarZzc = new com.google.android.gms.measurement.internal.zzbd(str2, str, 0L, 0L, 0L, r4.zzd, 0L, null, null, null, null);
                                j = 0;
                            } else {
                                zzhVar = zzhVarZzl;
                                obj = null;
                                long j3 = zzbdVarZzs.zzf;
                                zzbdVarZzc = zzbdVarZzs.zzc(r4.zzd);
                                j = j3;
                            }
                            zzpvVar2.zzj().zzV(zzbdVarZzc);
                            com.google.android.gms.measurement.internal.zzbc zzbcVar2 = new com.google.android.gms.measurement.internal.zzbc(zzmcVarZzv.zzu, str6, str2, str, r4.zzd, j, bundle);
                            zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
                            zzhlVarZze.zzm(zzbcVar2.zzd);
                            zzhlVarZze.zzi(zzbcVar2.zzb);
                            zzhlVarZze.zzl(zzbcVar2.zze);
                            zzbfVar = zzbcVar2.zzf;
                            zzbeVar = new com.google.android.gms.measurement.internal.zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                java.lang.String next2 = zzbeVar.next();
                                java.lang.String str7 = next2;
                                zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zzhpVarZze.zzj(next2);
                                objZzf = zzbfVar.zzf(next2);
                                if (objZzf != null) {
                                    zzpvVar2.zzA().zzw(zzhpVarZze, objZzf);
                                    zzhlVarZze.zze(zzhpVarZze);
                                }
                            }
                            zzhwVarZzz.zzn(zzhlVarZze);
                            com.google.android.gms.internal.measurement.zzhy zzhyVarZza2 = com.google.android.gms.internal.measurement.zzia.zza();
                            com.google.android.gms.internal.measurement.zzhn zzhnVarZza2 = com.google.android.gms.internal.measurement.zzho.zza();
                            zzhnVarZza2.zza(zzbdVarZzc.zzc);
                            zzhnVarZza2.zzb(str);
                            zzhyVarZza2.zza(zzhnVarZza2);
                            zzhwVarZzz.zzao(zzhyVarZza2);
                            zzhwVarZzz.zzi(zzpvVar2.zzh().zza(zzhVar.zzC(), java.util.Collections.emptyList(), zzhwVarZzz.zzaN(), java.lang.Long.valueOf(zzhlVarZze.zzc()), java.lang.Long.valueOf(zzhlVarZze.zzc()), false));
                            if (zzhlVarZze.zzq()) {
                                zzhwVarZzz.zzax(zzhlVarZze.zzc());
                                zzhwVarZzz.zzab(zzhlVarZze.zzc());
                            }
                            jZzs = zzhVar.zzs();
                            if (jZzs != 0) {
                                zzhwVarZzz.zzap(jZzs);
                            }
                            jZzu = zzhVar.zzu();
                            if (jZzu != 0) {
                                zzhwVarZzz.zzaq(jZzu);
                            } else if (jZzs != 0) {
                                zzhwVarZzz.zzaq(jZzs);
                            }
                            strZzL = zzhVar.zzL();
                            com.google.android.gms.internal.measurement.zzrd.zzb();
                            if (zzioVar.zzf().zzx(str2, com.google.android.gms.measurement.internal.zzgi.zzaL)) {
                                zzhwVarZzz.zzav(strZzL);
                            }
                            zzhVar.zzP();
                            zzhwVarZzz.zzP((int) zzhVar.zzt());
                            zzioVar.zzf().zzj();
                            zzhwVarZzz.zzaB(119002L);
                            zzhwVarZzz.zzaA(zzioVar.zzaU().currentTimeMillis());
                            zzhwVarZzz.zzau(java.lang.Boolean.TRUE.booleanValue());
                            zzpvVar5.zzN(zzhwVarZzz.zzaF(), zzhwVarZzz);
                            zzhtVarZzb.zzc(zzhwVarZzz);
                            com.google.android.gms.measurement.internal.zzh zzhVar3 = zzhVar;
                            zzhVar3.zzau(zzhwVarZzz.zzf());
                            zzhVar3.zzas(zzhwVarZzz.zze());
                            zzpvVar2.zzj().zzT(zzhVar3, false, false);
                            zzpvVar2.zzj().zzS();
                            zzpvVar2.zzj().zzL();
                            return zzpvVar2.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVarZzb.zzba()).zzcd());
                        } catch (java.lang.SecurityException e) {
                            zzmcVarZzv.zzu.zzaW().zzd().zzb("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzpvVar = zzmcVarZzv.zzg;
                            zzawVarZzj = zzpvVar.zzj();
                            zzawVarZzj.zzL();
                            return bArr;
                        }
                    }
                    com.google.android.gms.measurement.internal.zzio zzioVar5 = zzmcVarZzv.zzu;
                    zzioVar5.zzg().zzv();
                    zzhwVarZzz.zzX(android.os.Build.MODEL);
                    zzioVar5.zzg().zzv();
                    zzhwVarZzz.zzam(android.os.Build.VERSION.RELEASE);
                    zzhwVarZzz.zzaz((int) zzioVar5.zzg().zza());
                    zzhwVarZzz.zzaD(zzioVar5.zzg().zzb());
                    try {
                        try {
                            if (zzjxVarZzu.zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE) && zzhVarZzl.zzD() != null) {
                                zzhwVarZzz.zzJ(com.google.android.gms.measurement.internal.zzmc.zza((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzD()), java.lang.Long.toString(r4.zzd)));
                            }
                            if (!android.text.TextUtils.isEmpty(zzhVarZzl.zzG())) {
                                zzhwVarZzz.zzag((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVarZzl.zzG()));
                            }
                            strZzC = zzhVarZzl.zzC();
                            zzpvVar2 = zzmcVarZzv.zzg;
                            listZzE = zzpvVar2.zzj().zzE(strZzC);
                            it = listZzE.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzqdVar = null;
                                    break;
                                }
                                zzqdVar = (com.google.android.gms.measurement.internal.zzqd) it.next();
                            } while (!"_lte".equals(zzqdVar.zzc));
                            if (zzqdVar != null || zzqdVar.zze == null) {
                                com.google.android.gms.measurement.internal.zzqd zzqdVar6 = new com.google.android.gms.measurement.internal.zzqd(strZzC, "auto", "_lte", zzmcVarZzv.zzu.zzaU().currentTimeMillis(), 0L);
                                listZzE.add(zzqdVar6);
                                zzpvVar2.zzj().zzai(zzqdVar6);
                            }
                            zzioVarArr = new com.google.android.gms.internal.measurement.zzio[listZzE.size()];
                            while (i < listZzE.size()) {
                                com.google.android.gms.internal.measurement.zzin zzinVarZze3 = com.google.android.gms.internal.measurement.zzio.zze();
                                zzinVarZze3.zzf(((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zzc);
                                zzinVarZze3.zzg(((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zzd);
                                zzpvVar2.zzA().zzx(zzinVarZze3, ((com.google.android.gms.measurement.internal.zzqd) listZzE.get(i)).zze);
                                zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zzinVarZze3.zzba();
                            }
                            zzhwVarZzz.zzm(java.util.Arrays.asList(zzioVarArr));
                            com.google.android.gms.measurement.internal.zzpv zzpvVar6 = zzmcVarZzv.zzg;
                            zzpvVar6.zzQ(zzhVarZzl, zzhwVarZzz);
                            zzpvVar6.zzaa(zzhVarZzl, zzhwVarZzz);
                            com.google.android.gms.measurement.internal.zzhf zzhfVarZzb3 = com.google.android.gms.measurement.internal.zzhf.zzb(r4);
                            zzioVar = zzmcVarZzv.zzu;
                            com.google.android.gms.measurement.internal.zzqf zzqfVarZzw3 = zzioVar.zzw();
                            bundle = zzhfVarZzb3.zzd;
                            zzqfVarZzw3.zzO(bundle, zzpvVar2.zzj().zzk(str2));
                            zzioVar.zzw().zzQ(zzhfVarZzb3, zzioVar.zzf().zzf(str2));
                            try {
                                bundle.putLong("_c", 1L);
                                zzioVar.zzaW().zzd().zza("Marking in-app purchase as real-time");
                                bundle.putLong("_r", 1L);
                                java.lang.String str8 = r4.zzc;
                                bundle.putString("_o", str8);
                                if (zzioVar.zzw().zzak(zzhwVarZzz.zzaF(), zzhVarZzl.zzM())) {
                                    zzioVar.zzw().zzS(bundle, "_dbg", 1L);
                                    zzioVar.zzw().zzS(bundle, "_r", 1L);
                                }
                                com.google.android.gms.measurement.internal.zzaw zzawVarZzj4 = zzpvVar2.zzj();
                                str = r4.zza;
                                zzbdVarZzs = zzawVarZzj4.zzs(str2, str);
                                if (zzbdVarZzs == null) {
                                    zzhVar = zzhVarZzl;
                                    obj = null;
                                    zzbdVarZzc = new com.google.android.gms.measurement.internal.zzbd(str2, str, 0L, 0L, 0L, r4.zzd, 0L, null, null, null, null);
                                    j = 0;
                                } else {
                                    zzhVar = zzhVarZzl;
                                    obj = null;
                                    long j4 = zzbdVarZzs.zzf;
                                    zzbdVarZzc = zzbdVarZzs.zzc(r4.zzd);
                                    j = j4;
                                }
                                zzpvVar2.zzj().zzV(zzbdVarZzc);
                                try {
                                    com.google.android.gms.measurement.internal.zzbc zzbcVar3 = new com.google.android.gms.measurement.internal.zzbc(zzmcVarZzv.zzu, str8, str2, str, r4.zzd, j, bundle);
                                    zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
                                    zzhlVarZze.zzm(zzbcVar3.zzd);
                                    zzhlVarZze.zzi(zzbcVar3.zzb);
                                    zzhlVarZze.zzl(zzbcVar3.zze);
                                    zzbfVar = zzbcVar3.zzf;
                                    zzbeVar = new com.google.android.gms.measurement.internal.zzbe(zzbfVar);
                                    while (zzbeVar.hasNext()) {
                                        java.lang.String next3 = zzbeVar.next();
                                        java.lang.String str9 = next3;
                                        zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                                        zzhpVarZze.zzj(next3);
                                        objZzf = zzbfVar.zzf(next3);
                                        if (objZzf != null) {
                                            zzpvVar2.zzA().zzw(zzhpVarZze, objZzf);
                                            zzhlVarZze.zze(zzhpVarZze);
                                        }
                                    }
                                    zzhwVarZzz.zzn(zzhlVarZze);
                                    com.google.android.gms.internal.measurement.zzhy zzhyVarZza3 = com.google.android.gms.internal.measurement.zzia.zza();
                                    com.google.android.gms.internal.measurement.zzhn zzhnVarZza3 = com.google.android.gms.internal.measurement.zzho.zza();
                                    zzhnVarZza3.zza(zzbdVarZzc.zzc);
                                    zzhnVarZza3.zzb(str);
                                    zzhyVarZza3.zza(zzhnVarZza3);
                                    zzhwVarZzz.zzao(zzhyVarZza3);
                                    zzhwVarZzz.zzi(zzpvVar2.zzh().zza(zzhVar.zzC(), java.util.Collections.emptyList(), zzhwVarZzz.zzaN(), java.lang.Long.valueOf(zzhlVarZze.zzc()), java.lang.Long.valueOf(zzhlVarZze.zzc()), false));
                                    if (zzhlVarZze.zzq()) {
                                        zzhwVarZzz.zzax(zzhlVarZze.zzc());
                                        zzhwVarZzz.zzab(zzhlVarZze.zzc());
                                    }
                                    jZzs = zzhVar.zzs();
                                    if (jZzs != 0) {
                                        zzhwVarZzz.zzap(jZzs);
                                    }
                                    jZzu = zzhVar.zzu();
                                    if (jZzu != 0) {
                                        zzhwVarZzz.zzaq(jZzu);
                                    } else if (jZzs != 0) {
                                        zzhwVarZzz.zzaq(jZzs);
                                    }
                                    strZzL = zzhVar.zzL();
                                    com.google.android.gms.internal.measurement.zzrd.zzb();
                                    if (zzioVar.zzf().zzx(str2, com.google.android.gms.measurement.internal.zzgi.zzaL) && strZzL != null) {
                                        zzhwVarZzz.zzav(strZzL);
                                    }
                                    zzhVar.zzP();
                                    zzhwVarZzz.zzP((int) zzhVar.zzt());
                                    zzioVar.zzf().zzj();
                                    zzhwVarZzz.zzaB(119002L);
                                    zzhwVarZzz.zzaA(zzioVar.zzaU().currentTimeMillis());
                                    zzhwVarZzz.zzau(java.lang.Boolean.TRUE.booleanValue());
                                    zzpvVar6.zzN(zzhwVarZzz.zzaF(), zzhwVarZzz);
                                    zzhtVarZzb.zzc(zzhwVarZzz);
                                    com.google.android.gms.measurement.internal.zzh zzhVar4 = zzhVar;
                                    zzhVar4.zzau(zzhwVarZzz.zzf());
                                    zzhVar4.zzas(zzhwVarZzz.zze());
                                    zzpvVar2.zzj().zzT(zzhVar4, false, false);
                                    zzpvVar2.zzj().zzS();
                                    zzpvVar2.zzj().zzL();
                                    try {
                                        return zzpvVar2.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVarZzb.zzba()).zzcd());
                                    } catch (java.io.IOException e2) {
                                        zzmcVarZzv.zzu.zzaW().zze().zzc("Data loss. Failed to bundle and serialize. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str2), e2);
                                        return obj;
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    r4 = zzmcVarZzv;
                                    r4.zzg.zzj().zzL();
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                r4 = zzmcVarZzv;
                            }
                        } catch (java.lang.SecurityException e3) {
                            zzmcVarZzv.zzu.zzaW().zzd().zzb("app instance id encryption failed", e3.getMessage());
                            bArr = new byte[0];
                            zzpvVar = zzmcVarZzv.zzg;
                            zzawVarZzj = zzpvVar.zzj();
                            zzawVarZzj.zzL();
                            return bArr;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                } else {
                    zzmcVarZzv.zzu.zzaW().zzd().zzb("Log and bundle disabled. package_name", str2);
                    bArr = new byte[0];
                }
                zzawVarZzj.zzL();
                return bArr;
            }
            zzmcVarZzv.zzu.zzaW().zzd().zzb("Log and bundle not available. package_name", str2);
            bArr = new byte[0];
            zzawVarZzj = zzpvVar3.zzj();
            zzawVarZzj.zzL();
            return bArr;
        } catch (java.lang.Throwable th4) {
            th = th4;
            r4 = zzmcVarZzv;
        }
    }
}

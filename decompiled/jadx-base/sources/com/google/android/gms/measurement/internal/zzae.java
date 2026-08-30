package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzae extends com.google.android.gms.measurement.internal.zzpg {
    private java.lang.String zza;
    private java.util.Set zzb;
    private java.util.Map zzc;
    private java.lang.Long zzd;
    private java.lang.Long zze;

    zzae(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
    }

    private final com.google.android.gms.measurement.internal.zzy zzd(java.lang.Integer num) {
        if (this.zzc.containsKey(num)) {
            return (com.google.android.gms.measurement.internal.zzy) this.zzc.get(num);
        }
        com.google.android.gms.measurement.internal.zzy zzyVar = new com.google.android.gms.measurement.internal.zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzf(int i, int i2) {
        com.google.android.gms.measurement.internal.zzy zzyVar = (com.google.android.gms.measurement.internal.zzy) this.zzc.get(java.lang.Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zze.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0262  */
    /* JADX WARN: Code duplicated, block: B:104:0x026d  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a0 A[Catch: all -> 0x02d9, SQLiteException -> 0x02dc, LOOP:11: B:110:0x02a0->B:117:0x02d0, LOOP_START, PHI: r7
  0x02a0: PHI (r7v6 int) = (r7v5 int), (r7v10 int) binds: [B:109:0x029e, B:117:0x02d0] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {SQLiteException -> 0x02dc, blocks: (B:108:0x029a, B:110:0x02a0, B:112:0x02b0, B:113:0x02b8, B:118:0x02d2), top: B:446:0x029a }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02b0 A[Catch: all -> 0x02d9, SQLiteException -> 0x02dc, TryCatch #6 {SQLiteException -> 0x02dc, blocks: (B:108:0x029a, B:110:0x02a0, B:112:0x02b0, B:113:0x02b8, B:118:0x02d2), top: B:446:0x029a }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02cc A[PHI: r0 r5
  0x02cc: PHI (r0v57 java.util.Map) = (r0v43 java.util.Map), (r0v59 java.util.Map), (r0v37 java.util.Map) binds: [B:133:0x02ff, B:119:0x02d6, B:115:0x02ca] A[DONT_GENERATE, DONT_INLINE]
  0x02cc: PHI (r5v22 android.database.Cursor) = (r5v9 android.database.Cursor), (r5v23 android.database.Cursor), (r5v23 android.database.Cursor) binds: [B:133:0x02ff, B:119:0x02d6, B:115:0x02ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0 A[LOOP:11: B:110:0x02a0->B:117:0x02d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x02d2 A[Catch: all -> 0x02d9, SQLiteException -> 0x02dc, TRY_ENTER, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x02dc, blocks: (B:108:0x029a, B:110:0x02a0, B:112:0x02b0, B:113:0x02b8, B:118:0x02d2), top: B:446:0x029a }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0315  */
    /* JADX WARN: Code duplicated, block: B:141:0x0323  */
    /* JADX WARN: Code duplicated, block: B:143:0x033f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0410  */
    /* JADX WARN: Code duplicated, block: B:173:0x041d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0442  */
    /* JADX WARN: Code duplicated, block: B:181:0x0457  */
    /* JADX WARN: Code duplicated, block: B:185:0x0471  */
    /* JADX WARN: Code duplicated, block: B:186:0x047a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0486  */
    /* JADX WARN: Code duplicated, block: B:196:0x049b  */
    /* JADX WARN: Code duplicated, block: B:203:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:208:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:210:0x0508  */
    /* JADX WARN: Code duplicated, block: B:211:0x050c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:244:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:246:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:250:0x060d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0659  */
    /* JADX WARN: Code duplicated, block: B:265:0x0681 A[Catch: SQLiteException -> 0x06ac, all -> 0x06ba, TryCatch #13 {all -> 0x06ba, blocks: (B:256:0x0653, B:260:0x065c, B:261:0x0660, B:263:0x0671, B:265:0x0681, B:266:0x0689, B:269:0x069f, B:268:0x068e, B:294:0x06d5, B:277:0x06b0), top: B:450:0x0653 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:276:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:279:0x06b6 A[PHI: r0 r5 r16 r29
  0x06b6: PHI (r0v72 java.util.Map) = (r0v74 java.util.Map), (r0v81 java.util.Map) binds: [B:295:0x06ea, B:278:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06b6: PHI (r5v39 android.database.Cursor) = (r5v40 android.database.Cursor), (r5v42 android.database.Cursor) binds: [B:295:0x06ea, B:278:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06b6: PHI (r16v14 long) = (r16v15 long), (r16v18 long) binds: [B:295:0x06ea, B:278:0x06b4] A[DONT_GENERATE, DONT_INLINE]
  0x06b6: PHI (r29v7 java.lang.String) = (r29v8 java.lang.String), (r29v10 java.lang.String) binds: [B:295:0x06ea, B:278:0x06b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:305:0x070f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0744  */
    /* JADX WARN: Code duplicated, block: B:313:0x076f A[LOOP:10: B:309:0x073e->B:313:0x076f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:317:0x078b  */
    /* JADX WARN: Code duplicated, block: B:322:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:325:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:328:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:330:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:338:0x0817 A[Catch: SQLiteException -> 0x0878, all -> 0x08a5, LOOP:3: B:338:0x0817->B:487:?, LOOP_START, TRY_LEAVE, TryCatch #3 {all -> 0x08a5, blocks: (B:336:0x0811, B:338:0x0817, B:339:0x081c, B:341:0x082d, B:343:0x083d, B:345:0x0848, B:348:0x0861, B:347:0x084d, B:353:0x086e, B:367:0x0889), top: B:440:0x0811 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x083d A[Catch: SQLiteException -> 0x0878, all -> 0x08a5, TryCatch #3 {all -> 0x08a5, blocks: (B:336:0x0811, B:338:0x0817, B:339:0x081c, B:341:0x082d, B:343:0x083d, B:345:0x0848, B:348:0x0861, B:347:0x084d, B:353:0x086e, B:367:0x0889), top: B:440:0x0811 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x0846  */
    /* JADX WARN: Code duplicated, block: B:351:0x0869  */
    /* JADX WARN: Code duplicated, block: B:353:0x086e A[Catch: SQLiteException -> 0x0878, all -> 0x08a5, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x08a5, blocks: (B:336:0x0811, B:338:0x0817, B:339:0x081c, B:341:0x082d, B:343:0x083d, B:345:0x0848, B:348:0x0861, B:347:0x084d, B:353:0x086e, B:367:0x0889), top: B:440:0x0811 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x0874 A[PHI: r0 r3 r31
  0x0874: PHI (r0v140 java.util.Map) = (r0v138 java.util.Map), (r0v147 java.util.Map) binds: [B:368:0x089e, B:354:0x0872] A[DONT_GENERATE, DONT_INLINE]
  0x0874: PHI (r3v61 android.database.Cursor) = (r3v60 android.database.Cursor), (r3v65 android.database.Cursor) binds: [B:368:0x089e, B:354:0x0872] A[DONT_GENERATE, DONT_INLINE]
  0x0874: PHI (r31v10 java.util.Iterator) = (r31v9 java.util.Iterator), (r31v12 java.util.Iterator) binds: [B:368:0x089e, B:354:0x0872] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:376:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:380:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:383:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:386:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:388:0x090c  */
    /* JADX WARN: Code duplicated, block: B:390:0x091e  */
    /* JADX WARN: Code duplicated, block: B:391:0x092b  */
    /* JADX WARN: Code duplicated, block: B:393:0x0959  */
    /* JADX WARN: Code duplicated, block: B:396:0x0963  */
    /* JADX WARN: Code duplicated, block: B:405:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:406:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:410:0x09ce A[PHI: r16 r32
  0x09ce: PHI (r16v22 java.lang.String) = (r16v23 java.lang.String), (r1v26 java.lang.String) binds: [B:409:0x09cc, B:407:0x09be] A[DONT_GENERATE, DONT_INLINE]
  0x09ce: PHI (r32v6 java.util.Map) = (r32v7 java.util.Map), (r32v9 java.util.Map) binds: [B:409:0x09cc, B:407:0x09be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:416:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:421:0x0a5d A[Catch: SQLiteException -> 0x0a71, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0a71, blocks: (B:419:0x0a53, B:421:0x0a5d), top: B:452:0x0a53 }] */
    /* JADX WARN: Code duplicated, block: B:430:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:488:0x08d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x09d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x09c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x09a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0a88 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x07a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x07a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x05ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0725 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x077d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x02ca A[EDGE_INSN: B:516:0x02ca->B:115:0x02ca BREAK  A[LOOP:11: B:110:0x02a0->B:117:0x02d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x03fb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0587 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0495 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x0213 A[EDGE_INSN: B:559:0x0213->B:79:0x0213 BREAK  A[LOOP:20: B:68:0x01c7->B:82:0x021b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2 A[Catch: SQLiteException -> 0x0226, all -> 0x0a93, TRY_LEAVE, TryCatch #11 {SQLiteException -> 0x0226, blocks: (B:61:0x01ac, B:63:0x01b2, B:67:0x01c2, B:68:0x01c7, B:69:0x01d1, B:70:0x01e1, B:72:0x01f0), top: B:449:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c2 A[Catch: SQLiteException -> 0x0226, all -> 0x0a93, TRY_ENTER, TryCatch #11 {SQLiteException -> 0x0226, blocks: (B:61:0x01ac, B:63:0x01b2, B:67:0x01c2, B:68:0x01c7, B:69:0x01d1, B:70:0x01e1, B:72:0x01f0), top: B:449:0x01ac }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0215  */
    /* JADX WARN: Code duplicated, block: B:82:0x021b A[LOOP:20: B:68:0x01c7->B:82:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x024f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v191, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v60, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v64, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    final java.util.List zza(java.lang.String str, java.util.List list, java.util.List list2, java.lang.Long l, java.lang.Long l2, boolean z) throws java.lang.Throwable {
        int i;
        int i2;
        boolean z2;
        ?? r5;
        java.util.Map map;
        android.database.Cursor cursor;
        java.lang.String str2;
        android.database.Cursor cursorQuery;
        java.util.Map map2;
        java.util.Map map3;
        java.util.Iterator it;
        java.lang.String str3;
        int iIntValue;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        java.util.BitSet bitSet;
        java.util.BitSet bitSet2;
        androidx.collection.ArrayMap arrayMap;
        java.util.List<com.google.android.gms.internal.measurement.zzfj> list3;
        int i3;
        java.lang.String str4;
        java.lang.Long lValueOf;
        java.lang.String str5;
        java.util.Map arrayMap2;
        ?? Zzj;
        android.database.Cursor cursorRawQuery;
        androidx.collection.ArrayMap arrayMap3;
        java.util.Iterator it2;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        java.util.List list4;
        java.util.Map map4;
        java.util.Iterator it3;
        int i4;
        java.lang.Integer numValueOf;
        java.util.List arrayList;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.google.android.gms.measurement.internal.zzz zzzVar;
        androidx.collection.ArrayMap arrayMap4;
        java.util.Iterator it4;
        com.google.android.gms.internal.measurement.zzhm zzhmVar;
        com.google.android.gms.internal.measurement.zzhm zzhmVarZza;
        com.google.android.gms.measurement.internal.zzpv zzpvVar;
        com.google.android.gms.measurement.internal.zzbd zzbdVarZzr;
        long j;
        java.lang.String strZzh;
        java.util.Map mapEmptyMap;
        long j2;
        java.lang.String str9;
        java.util.Iterator it5;
        int iIntValue2;
        java.util.Set set;
        java.lang.Integer numValueOf2;
        java.util.Iterator it6;
        boolean zZzd;
        long j3;
        com.google.android.gms.measurement.internal.zzaa zzaaVar;
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj;
        java.lang.String str10;
        androidx.collection.ArrayMap arrayMap5;
        java.lang.String str11;
        android.database.Cursor cursorQuery2;
        java.lang.Integer numValueOf3;
        java.util.List arrayList2;
        java.lang.String str12;
        java.lang.String str13;
        java.util.ArrayList arrayList3;
        java.util.Iterator it7;
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj2;
        java.lang.String str14;
        android.content.ContentValues contentValues;
        androidx.collection.ArrayMap arrayMap6;
        java.util.Iterator it8;
        java.lang.String strZzg;
        java.util.Map mapEmptyMap2;
        java.util.Iterator it9;
        java.lang.String str15;
        java.util.Iterator it10;
        int iIntValue3;
        java.util.Set set2;
        java.lang.Integer numValueOf4;
        java.util.Iterator it11;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzfr zzfrVar;
        com.google.android.gms.measurement.internal.zzio zzioVar;
        java.lang.Integer numValueOf5;
        com.google.android.gms.measurement.internal.zzac zzacVar;
        java.lang.Integer numValueOf6;
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj3;
        java.lang.String str16;
        androidx.collection.ArrayMap arrayMap7;
        android.database.Cursor cursor2;
        android.database.Cursor cursorQuery3;
        java.lang.Integer numValueOf7;
        java.util.List list5;
        java.util.List arrayList4;
        androidx.collection.ArrayMap arrayMap8;
        int i5;
        android.database.Cursor cursorQuery4;
        java.util.List arrayList5;
        java.lang.String str17 = "current_results";
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new java.util.HashSet();
        this.zzc = new androidx.collection.ArrayMap();
        this.zzd = l;
        this.zze = l2;
        java.util.Iterator it12 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it12.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhm) it12.next()).zzh())) {
                z2 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzpq.zzb();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
        boolean zZzx = zzioVar2.zzf().zzx(this.zza, com.google.android.gms.measurement.internal.zzgi.zzaE);
        com.google.android.gms.internal.measurement.zzpq.zzb();
        boolean zZzx2 = zzioVar2.zzf().zzx(this.zza, com.google.android.gms.measurement.internal.zzgi.zzaD);
        if (z2) {
            com.google.android.gms.measurement.internal.zzaw zzawVarZzj4 = this.zzg.zzj();
            java.lang.String str18 = this.zza;
            zzawVarZzj4.zzav();
            zzawVarZzj4.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str18);
            ?? contentValues2 = new android.content.ContentValues();
            ?? r6 = 0;
            contentValues2.put("current_session_count", r6);
            try {
                r6 = "events";
                zzawVarZzj4.zzj().update("events", contentValues2, "app_id = ?", new java.lang.String[]{str18});
                r5 = "events";
            } catch (android.database.sqlite.SQLiteException e) {
                zzawVarZzj4.zzu.zzaW().zze().zzc("Error resetting session-scoped event counts. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str18), e);
                r5 = r6;
            }
        }
        java.util.Map mapEmptyMap3 = java.util.Collections.emptyMap();
        java.lang.String str19 = "Failed to merge filter. appId";
        java.lang.String str20 = "data";
        java.lang.String str21 = "audience_id";
        if (zZzx2 && zZzx) {
            com.google.android.gms.measurement.internal.zzaw zzawVarZzj5 = this.zzg.zzj();
            java.lang.String str22 = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str22);
            androidx.collection.ArrayMap arrayMap9 = new androidx.collection.ArrayMap();
            try {
                try {
                    cursorQuery4 = zzawVarZzj5.zzj().query("event_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=?", new java.lang.String[]{str22}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzfj zzfjVar = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery4.getBlob(i2))).zzba();
                                    if (zzfjVar.zzo()) {
                                        java.lang.Integer numValueOf8 = java.lang.Integer.valueOf(cursorQuery4.getInt(i));
                                        java.util.List list6 = (java.util.List) arrayMap9.get(numValueOf8);
                                        if (list6 == null) {
                                            arrayList5 = new java.util.ArrayList();
                                            arrayMap9.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzfjVar);
                                    }
                                } catch (java.io.IOException e2) {
                                    zzawVarZzj5.zzu.zzaW().zze().zzc("Failed to merge filter. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str22), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = arrayMap9;
                        } else {
                            mapEmptyMap3 = java.util.Collections.emptyMap();
                            if (cursorQuery4 != null) {
                                cursorQuery4.close();
                            }
                            map = mapEmptyMap3;
                        }
                    } catch (android.database.sqlite.SQLiteException e3) {
                        e = e3;
                        zzawVarZzj5.zzu.zzaW().zze().zzc("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str22), e);
                        mapEmptyMap3 = java.util.Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        com.google.android.gms.measurement.internal.zzaw zzawVarZzj6 = this.zzg.zzj();
                        java.lang.String str23 = this.zza;
                        zzawVarZzj6.zzav();
                        zzawVarZzj6.zzg();
                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str23);
                        cursorQuery = zzawVarZzj6.zzj().query("audience_filter_values", new java.lang.String[]{"audience_id", "current_results"}, "app_id=?", new java.lang.String[]{str23}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    arrayMap8 = new androidx.collection.ArrayMap();
                                    while (true) {
                                        i5 = cursorQuery.getInt(0);
                                        try {
                                            arrayMap8.put(java.lang.Integer.valueOf(i5), (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzic.zze(), cursorQuery.getBlob(1))).zzba());
                                            str2 = str21;
                                        } catch (java.io.IOException e4) {
                                            str2 = str21;
                                            try {
                                                zzawVarZzj6.zzu.zzaW().zze().zzd("Failed to merge filter results. appId, audienceId, error", com.google.android.gms.measurement.internal.zzhe.zzn(str23), java.lang.Integer.valueOf(i5), e4);
                                            } catch (android.database.sqlite.SQLiteException e5) {
                                                e = e5;
                                                str20 = str20;
                                                zzawVarZzj6.zzu.zzaW().zze().zzc("Database error querying filter results. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str23), e);
                                                java.util.Map mapEmptyMap4 = java.util.Collections.emptyMap();
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = mapEmptyMap4;
                                                if (map2.isEmpty()) {
                                                    str3 = "Failed to merge filter. appId";
                                                } else {
                                                    java.util.HashSet hashSet = new java.util.HashSet(map2.keySet());
                                                    if (z2) {
                                                        java.lang.String str24 = this.zza;
                                                        com.google.android.gms.measurement.internal.zzaw zzawVarZzj7 = this.zzg.zzj();
                                                        str5 = this.zza;
                                                        zzawVarZzj7.zzav();
                                                        zzawVarZzj7.zzg();
                                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str5);
                                                        arrayMap2 = new androidx.collection.ArrayMap();
                                                        Zzj = zzawVarZzj7.zzj();
                                                        try {
                                                            try {
                                                                i4 = 0;
                                                                cursorRawQuery = Zzj.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new java.lang.String[]{str5, str5});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        while (true) {
                                                                            numValueOf = java.lang.Integer.valueOf(cursorRawQuery.getInt(i4));
                                                                            arrayList = (java.util.List) arrayMap2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new java.util.ArrayList();
                                                                                arrayMap2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(java.lang.Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                            if (!cursorRawQuery.moveToNext()) {
                                                                                break;
                                                                            }
                                                                            i4 = 0;
                                                                        }
                                                                        if (cursorRawQuery != null) {
                                                                            cursorRawQuery.close();
                                                                        }
                                                                    } else {
                                                                        arrayMap2 = java.util.Collections.emptyMap();
                                                                        if (cursorRawQuery != null) {
                                                                            cursorRawQuery.close();
                                                                        }
                                                                    }
                                                                } catch (android.database.sqlite.SQLiteException e6) {
                                                                    e = e6;
                                                                    zzawVarZzj7.zzu.zzaW().zze().zzc("Database error querying scoped filters. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str5), e);
                                                                    arrayMap2 = java.util.Collections.emptyMap();
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str24);
                                                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(map2);
                                                                    arrayMap3 = new androidx.collection.ArrayMap();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            int iIntValue4 = ((java.lang.Integer) it2.next()).intValue();
                                                                            java.lang.Integer numValueOf9 = java.lang.Integer.valueOf(iIntValue4);
                                                                            zzicVar2 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf9);
                                                                            list4 = (java.util.List) arrayMap2.get(numValueOf9);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = arrayMap2;
                                                                            it3 = it2;
                                                                            arrayMap3.put(numValueOf9, zzicVar2);
                                                                            arrayMap2 = map4;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    map3 = arrayMap3;
                                                                    it = hashSet.iterator();
                                                                    while (it.hasNext()) {
                                                                        iIntValue = ((java.lang.Integer) it.next()).intValue();
                                                                        zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(java.lang.Integer.valueOf(iIntValue));
                                                                        bitSet = new java.util.BitSet();
                                                                        bitSet2 = new java.util.BitSet();
                                                                        arrayMap = new androidx.collection.ArrayMap();
                                                                        if (zzicVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzhk zzhkVar : zzicVar.zzh()) {
                                                                                if (zzhkVar.zzh()) {
                                                                                    java.lang.Integer numValueOf10 = java.lang.Integer.valueOf(zzhkVar.zza());
                                                                                    if (zzhkVar.zzg()) {
                                                                                        lValueOf = java.lang.Long.valueOf(zzhkVar.zzb());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    arrayMap.put(numValueOf10, lValueOf);
                                                                                }
                                                                            }
                                                                        }
                                                                        androidx.collection.ArrayMap arrayMap10 = new androidx.collection.ArrayMap();
                                                                        if (zzicVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzie zzieVar : zzicVar.zzj()) {
                                                                                if (!zzieVar.zzi()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        java.util.Map map5 = map3;
                                                                        if (zzicVar != null) {
                                                                            i3 = 0;
                                                                            while (i3 < zzicVar.zzd() * 64) {
                                                                                if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzk(), i3)) {
                                                                                    str4 = str19;
                                                                                    this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(i3));
                                                                                    bitSet2.set(i3);
                                                                                    if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzi(), i3)) {
                                                                                        bitSet.set(i3);
                                                                                    }
                                                                                    i3++;
                                                                                    str19 = str4;
                                                                                } else {
                                                                                    str4 = str19;
                                                                                }
                                                                                arrayMap.remove(java.lang.Integer.valueOf(i3));
                                                                                i3++;
                                                                                str19 = str4;
                                                                            }
                                                                        }
                                                                        java.lang.String str25 = str19;
                                                                        java.lang.Integer numValueOf11 = java.lang.Integer.valueOf(iIntValue);
                                                                        com.google.android.gms.internal.measurement.zzic zzicVar3 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf11);
                                                                        if (!zZzx2) {
                                                                        }
                                                                        this.zzc.put(java.lang.Integer.valueOf(iIntValue), new com.google.android.gms.measurement.internal.zzy(this, this.zza, zzicVar3, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                                        str19 = str25;
                                                                        map = map;
                                                                        map3 = map5;
                                                                        map2 = map2;
                                                                    }
                                                                    str3 = str19;
                                                                    str6 = str2;
                                                                    str7 = str20;
                                                                    str8 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new com.google.android.gms.measurement.internal.zzz(this, null);
                                                                        arrayMap4 = new androidx.collection.ArrayMap();
                                                                        it4 = list.iterator();
                                                                        while (it4.hasNext()) {
                                                                            zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it4.next();
                                                                            zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                                                                            if (zzhmVarZza != null) {
                                                                                zzpvVar = this.zzg;
                                                                                zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                                                                                zzpvVar.zzj().zzV(zzbdVarZzr);
                                                                                if (!z) {
                                                                                    j = zzbdVarZzr.zzc;
                                                                                    strZzh = zzhmVarZza.zzh();
                                                                                    mapEmptyMap = (java.util.Map) arrayMap4.get(strZzh);
                                                                                    if (mapEmptyMap == null) {
                                                                                        zzawVarZzj = zzpvVar.zzj();
                                                                                        str10 = this.zza;
                                                                                        zzawVarZzj.zzav();
                                                                                        zzawVarZzj.zzg();
                                                                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str10);
                                                                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzh);
                                                                                        arrayMap5 = new androidx.collection.ArrayMap();
                                                                                        str9 = str6;
                                                                                        str11 = str7;
                                                                                        try {
                                                                                            try {
                                                                                                str7 = str11;
                                                                                                try {
                                                                                                    cursorQuery2 = zzawVarZzj.zzj().query("event_filters", new java.lang.String[]{str9, str11}, "app_id=? AND event_name=?", new java.lang.String[]{str10, strZzh}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                                j2 = j;
                                                                                                                do {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzfj zzfjVar2 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery2.getBlob(1))).zzba();
                                                                                                                            numValueOf3 = java.lang.Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                            arrayList2 = (java.util.List) arrayMap5.get(numValueOf3);
                                                                                                                            if (arrayList2 == null) {
                                                                                                                                arrayList2 = new java.util.ArrayList();
                                                                                                                                arrayMap5.put(numValueOf3, arrayList2);
                                                                                                                            }
                                                                                                                            arrayList2.add(zzfjVar2);
                                                                                                                        } catch (java.io.IOException e7) {
                                                                                                                            zzawVarZzj.zzu.zzaW().zze().zzc(str3, com.google.android.gms.measurement.internal.zzhe.zzn(str10), e7);
                                                                                                                        }
                                                                                                                    } catch (android.database.sqlite.SQLiteException e8) {
                                                                                                                        e = e8;
                                                                                                                        zzawVarZzj.zzu.zzaW().zze().zzc(r8, com.google.android.gms.measurement.internal.zzhe.zzn(str10), e);
                                                                                                                        mapEmptyMap = java.util.Collections.emptyMap();
                                                                                                                        if (cursorQuery2 != null) {
                                                                                                                            cursorQuery2.close();
                                                                                                                        }
                                                                                                                    }
                                                                                                                } while (cursorQuery2.moveToNext());
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                mapEmptyMap = arrayMap5;
                                                                                                            } else {
                                                                                                                j2 = j;
                                                                                                                mapEmptyMap = java.util.Collections.emptyMap();
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th) {
                                                                                                            th = th;
                                                                                                            if (cursorQuery2 != null) {
                                                                                                                cursorQuery2.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (android.database.sqlite.SQLiteException e9) {
                                                                                                        e = e9;
                                                                                                        j2 = j;
                                                                                                    }
                                                                                                } catch (android.database.sqlite.SQLiteException e10) {
                                                                                                    e = e10;
                                                                                                    j2 = j;
                                                                                                    cursorQuery2 = null;
                                                                                                    zzawVarZzj.zzu.zzaW().zze().zzc(r8, com.google.android.gms.measurement.internal.zzhe.zzn(str10), e);
                                                                                                    mapEmptyMap = java.util.Collections.emptyMap();
                                                                                                    if (cursorQuery2 != null) {
                                                                                                        cursorQuery2.close();
                                                                                                    }
                                                                                                    arrayMap4.put(strZzh, mapEmptyMap);
                                                                                                    it5 = mapEmptyMap.keySet().iterator();
                                                                                                    while (it5.hasNext()) {
                                                                                                        iIntValue2 = ((java.lang.Integer) it5.next()).intValue();
                                                                                                        set = this.zzb;
                                                                                                        numValueOf2 = java.lang.Integer.valueOf(iIntValue2);
                                                                                                        if (set.contains(numValueOf2)) {
                                                                                                            this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                        } else {
                                                                                                            it6 = ((java.util.List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                                            zZzd = true;
                                                                                                            while (true) {
                                                                                                                if (!it6.hasNext()) {
                                                                                                                    j3 = j2;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzfj zzfjVar3 = (com.google.android.gms.internal.measurement.zzfj) it6.next();
                                                                                                                zzaaVar = new com.google.android.gms.measurement.internal.zzaa(this, this.zza, iIntValue2, zzfjVar3);
                                                                                                                j3 = j2;
                                                                                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j3, zzbdVarZzr, zzf(iIntValue2, zzfjVar3.zzb()));
                                                                                                                if (!zZzd) {
                                                                                                                    this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzd(java.lang.Integer.valueOf(iIntValue2)).zzc(zzaaVar);
                                                                                                                j2 = j3;
                                                                                                            }
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                                                                            }
                                                                                                            j2 = j3;
                                                                                                        }
                                                                                                    }
                                                                                                    zzzVar = zzzVar;
                                                                                                    it4 = it4;
                                                                                                    str6 = str9;
                                                                                                    str17 = str17;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th2) {
                                                                                                th = th2;
                                                                                                cursorQuery2 = null;
                                                                                            }
                                                                                        } catch (android.database.sqlite.SQLiteException e11) {
                                                                                            e = e11;
                                                                                            str7 = str11;
                                                                                        }
                                                                                        arrayMap4.put(strZzh, mapEmptyMap);
                                                                                    } else {
                                                                                        j2 = j;
                                                                                        str9 = str6;
                                                                                    }
                                                                                    it5 = mapEmptyMap.keySet().iterator();
                                                                                    while (it5.hasNext()) {
                                                                                        iIntValue2 = ((java.lang.Integer) it5.next()).intValue();
                                                                                        set = this.zzb;
                                                                                        numValueOf2 = java.lang.Integer.valueOf(iIntValue2);
                                                                                        if (set.contains(numValueOf2)) {
                                                                                            this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                        } else {
                                                                                            it6 = ((java.util.List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                                            zZzd = true;
                                                                                            while (true) {
                                                                                                if (!it6.hasNext()) {
                                                                                                    j3 = j2;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzfj zzfjVar4 = (com.google.android.gms.internal.measurement.zzfj) it6.next();
                                                                                                zzaaVar = new com.google.android.gms.measurement.internal.zzaa(this, this.zza, iIntValue2, zzfjVar4);
                                                                                                j3 = j2;
                                                                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j3, zzbdVarZzr, zzf(iIntValue2, zzfjVar4.zzb()));
                                                                                                if (!zZzd) {
                                                                                                    this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                                                                    break;
                                                                                                }
                                                                                                zzd(java.lang.Integer.valueOf(iIntValue2)).zzc(zzaaVar);
                                                                                                j2 = j3;
                                                                                            }
                                                                                            if (!zZzd) {
                                                                                                this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                                                            }
                                                                                            j2 = j3;
                                                                                        }
                                                                                    }
                                                                                    zzzVar = zzzVar;
                                                                                    it4 = it4;
                                                                                    str6 = str9;
                                                                                    str17 = str17;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    str12 = str17;
                                                                    str13 = str6;
                                                                    if (!z) {
                                                                        return new java.util.ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        arrayMap6 = new androidx.collection.ArrayMap();
                                                                        it8 = list2.iterator();
                                                                        while (it8.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zzio zzioVar3 = (com.google.android.gms.internal.measurement.zzio) it8.next();
                                                                            strZzg = zzioVar3.zzg();
                                                                            mapEmptyMap2 = (java.util.Map) arrayMap6.get(strZzg);
                                                                            if (mapEmptyMap2 == null) {
                                                                                zzawVarZzj3 = this.zzg.zzj();
                                                                                str16 = this.zza;
                                                                                zzawVarZzj3.zzav();
                                                                                zzawVarZzj3.zzg();
                                                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str16);
                                                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzg);
                                                                                arrayMap7 = new androidx.collection.ArrayMap();
                                                                                str15 = str7;
                                                                                try {
                                                                                    try {
                                                                                        it9 = it8;
                                                                                        try {
                                                                                            cursorQuery3 = zzawVarZzj3.zzj().query("property_filters", new java.lang.String[]{str13, str15}, "app_id=? AND property_name=?", new java.lang.String[]{str16, strZzg}, null, null, null);
                                                                                            try {
                                                                                                try {
                                                                                                    if (cursorQuery3.moveToFirst()) {
                                                                                                        do {
                                                                                                            try {
                                                                                                                com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery3.getBlob(1))).zzba();
                                                                                                                numValueOf7 = java.lang.Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                list5 = (java.util.List) arrayMap7.get(numValueOf7);
                                                                                                                if (list5 == null) {
                                                                                                                    arrayList4 = new java.util.ArrayList();
                                                                                                                    arrayMap7.put(numValueOf7, arrayList4);
                                                                                                                } else {
                                                                                                                    arrayList4 = list5;
                                                                                                                }
                                                                                                                arrayList4.add(zzfrVar2);
                                                                                                            } catch (java.io.IOException e12) {
                                                                                                                zzawVarZzj3.zzu.zzaW().zze().zzc("Failed to merge filter", com.google.android.gms.measurement.internal.zzhe.zzn(str16), e12);
                                                                                                            }
                                                                                                        } while (cursorQuery3.moveToNext());
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                        mapEmptyMap2 = arrayMap7;
                                                                                                    } else {
                                                                                                        mapEmptyMap2 = java.util.Collections.emptyMap();
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th3) {
                                                                                                    th = th3;
                                                                                                    cursor2 = cursorQuery3;
                                                                                                    if (cursor2 != null) {
                                                                                                        cursor2.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (android.database.sqlite.SQLiteException e13) {
                                                                                                e = e13;
                                                                                                zzawVarZzj3.zzu.zzaW().zze().zzc("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str16), e);
                                                                                                mapEmptyMap2 = java.util.Collections.emptyMap();
                                                                                                if (cursorQuery3 != null) {
                                                                                                    cursorQuery3.close();
                                                                                                }
                                                                                            }
                                                                                        } catch (android.database.sqlite.SQLiteException e14) {
                                                                                            e = e14;
                                                                                            cursorQuery3 = null;
                                                                                            zzawVarZzj3.zzu.zzaW().zze().zzc("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str16), e);
                                                                                            mapEmptyMap2 = java.util.Collections.emptyMap();
                                                                                            if (cursorQuery3 != null) {
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                            arrayMap6.put(strZzg, mapEmptyMap2);
                                                                                            it10 = mapEmptyMap2.keySet().iterator();
                                                                                            while (it10.hasNext()) {
                                                                                                iIntValue3 = ((java.lang.Integer) it10.next()).intValue();
                                                                                                set2 = this.zzb;
                                                                                                numValueOf4 = java.lang.Integer.valueOf(iIntValue3);
                                                                                                if (set2.contains(numValueOf4)) {
                                                                                                    this.zzu.zzaW().zzj().zzb(str8, numValueOf4);
                                                                                                    break;
                                                                                                }
                                                                                                it11 = ((java.util.List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                                                                zZzd2 = true;
                                                                                                while (true) {
                                                                                                    if (it11.hasNext()) {
                                                                                                        zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it11.next();
                                                                                                        zzioVar = this.zzu;
                                                                                                        if (android.util.Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                                                                            com.google.android.gms.measurement.internal.zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
                                                                                                            java.lang.Integer numValueOf12 = java.lang.Integer.valueOf(iIntValue3);
                                                                                                            if (zzfrVar.zzj()) {
                                                                                                                numValueOf6 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                                                                            } else {
                                                                                                                numValueOf6 = null;
                                                                                                            }
                                                                                                            zzhcVarZzj.zzd("Evaluating filter. audience, filter, property", numValueOf12, numValueOf6, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                                                                            zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                                                                        } else {
                                                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                                                        }
                                                                                                        if (zzfrVar.zzj()) {
                                                                                                        }
                                                                                                        com.google.android.gms.measurement.internal.zzhc zzhcVarZzk = zzioVar.zzaW().zzk();
                                                                                                        java.lang.Object objZzn = com.google.android.gms.measurement.internal.zzhe.zzn(this.zza);
                                                                                                        if (zzfrVar.zzj()) {
                                                                                                            numValueOf5 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                                                                        } else {
                                                                                                            numValueOf5 = null;
                                                                                                        }
                                                                                                        zzhcVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, java.lang.String.valueOf(numValueOf5));
                                                                                                        this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                                        str8 = str8;
                                                                                                    } else {
                                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                                        str8 = str8;
                                                                                                    }
                                                                                                    if (!zZzd2) {
                                                                                                        this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                                                                                    }
                                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                                    str8 = str8;
                                                                                                    zzd(java.lang.Integer.valueOf(iIntValue3)).zzc(zzacVar);
                                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                                    str8 = str8;
                                                                                                }
                                                                                            }
                                                                                            it8 = it9;
                                                                                            str7 = str15;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th4) {
                                                                                        th = th4;
                                                                                        cursor2 = null;
                                                                                    }
                                                                                } catch (android.database.sqlite.SQLiteException e15) {
                                                                                    e = e15;
                                                                                    it9 = it8;
                                                                                }
                                                                                arrayMap6.put(strZzg, mapEmptyMap2);
                                                                            } else {
                                                                                it9 = it8;
                                                                                str15 = str7;
                                                                            }
                                                                            it10 = mapEmptyMap2.keySet().iterator();
                                                                            while (it10.hasNext()) {
                                                                                iIntValue3 = ((java.lang.Integer) it10.next()).intValue();
                                                                                set2 = this.zzb;
                                                                                numValueOf4 = java.lang.Integer.valueOf(iIntValue3);
                                                                                if (set2.contains(numValueOf4)) {
                                                                                    this.zzu.zzaW().zzj().zzb(str8, numValueOf4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it11 = ((java.util.List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                                                zZzd2 = true;
                                                                                while (true) {
                                                                                    if (it11.hasNext()) {
                                                                                        zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it11.next();
                                                                                        zzioVar = this.zzu;
                                                                                        if (android.util.Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                                                            com.google.android.gms.measurement.internal.zzhc zzhcVarZzj2 = zzioVar.zzaW().zzj();
                                                                                            java.lang.Integer numValueOf13 = java.lang.Integer.valueOf(iIntValue3);
                                                                                            if (zzfrVar.zzj()) {
                                                                                                numValueOf6 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                                                            } else {
                                                                                                numValueOf6 = null;
                                                                                            }
                                                                                            zzhcVarZzj2.zzd("Evaluating filter. audience, filter, property", numValueOf13, numValueOf6, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                                                            zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                                                        } else {
                                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                                        }
                                                                                        if (zzfrVar.zzj()) {
                                                                                        }
                                                                                        com.google.android.gms.measurement.internal.zzhc zzhcVarZzk2 = zzioVar.zzaW().zzk();
                                                                                        java.lang.Object objZzn2 = com.google.android.gms.measurement.internal.zzhe.zzn(this.zza);
                                                                                        if (zzfrVar.zzj()) {
                                                                                            numValueOf5 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                                                        } else {
                                                                                            numValueOf5 = null;
                                                                                        }
                                                                                        zzhcVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, java.lang.String.valueOf(numValueOf5));
                                                                                        this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                        str8 = str8;
                                                                                    } else {
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                        str8 = str8;
                                                                                    }
                                                                                    if (!zZzd2) {
                                                                                        this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                                                                    }
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                    str8 = str8;
                                                                                    zzd(java.lang.Integer.valueOf(iIntValue3)).zzc(zzacVar);
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                    str8 = str8;
                                                                                }
                                                                            }
                                                                            it8 = it9;
                                                                            str7 = str15;
                                                                        }
                                                                    }
                                                                    arrayList3 = new java.util.ArrayList();
                                                                    java.util.Set setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    it7 = setKeySet.iterator();
                                                                    while (it7.hasNext()) {
                                                                        int iIntValue5 = ((java.lang.Integer) it7.next()).intValue();
                                                                        java.util.Map map6 = this.zzc;
                                                                        java.lang.Integer numValueOf14 = java.lang.Integer.valueOf(iIntValue5);
                                                                        com.google.android.gms.measurement.internal.zzy zzyVar = (com.google.android.gms.measurement.internal.zzy) map6.get(numValueOf14);
                                                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzyVar);
                                                                        com.google.android.gms.internal.measurement.zzhi zzhiVarZza = zzyVar.zza(iIntValue5);
                                                                        arrayList3.add(zzhiVarZza);
                                                                        zzawVarZzj2 = this.zzg.zzj();
                                                                        str14 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzic zzicVarZzd = zzhiVarZza.zzd();
                                                                        zzawVarZzj2.zzav();
                                                                        zzawVarZzj2.zzg();
                                                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str14);
                                                                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzicVarZzd);
                                                                        byte[] bArrZzcd = zzicVarZzd.zzcd();
                                                                        contentValues = new android.content.ContentValues();
                                                                        contentValues.put("app_id", str14);
                                                                        contentValues.put(str13, numValueOf14);
                                                                        java.lang.String str26 = str12;
                                                                        contentValues.put(str26, bArrZzcd);
                                                                        try {
                                                                            try {
                                                                                if (zzawVarZzj2.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzawVarZzj2.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str14));
                                                                                }
                                                                            } catch (android.database.sqlite.SQLiteException e16) {
                                                                                e = e16;
                                                                                zzawVarZzj2.zzu.zzaW().zze().zzc("Error storing filter results. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str14), e);
                                                                            }
                                                                        } catch (android.database.sqlite.SQLiteException e17) {
                                                                            e = e17;
                                                                        }
                                                                        str12 = str26;
                                                                    }
                                                                    return arrayList3;
                                                                }
                                                            } catch (android.database.sqlite.SQLiteException e18) {
                                                                e = e18;
                                                                cursorRawQuery = null;
                                                            } catch (java.lang.Throwable th5) {
                                                                th = th5;
                                                                Zzj = 0;
                                                                if (Zzj != 0) {
                                                                    Zzj.close();
                                                                }
                                                                throw th;
                                                            }
                                                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str24);
                                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(map2);
                                                            arrayMap3 = new androidx.collection.ArrayMap();
                                                            if (!map2.isEmpty()) {
                                                                it2 = map2.keySet().iterator();
                                                                while (it2.hasNext()) {
                                                                    int iIntValue6 = ((java.lang.Integer) it2.next()).intValue();
                                                                    java.lang.Integer numValueOf15 = java.lang.Integer.valueOf(iIntValue6);
                                                                    zzicVar2 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf15);
                                                                    list4 = (java.util.List) arrayMap2.get(numValueOf15);
                                                                    if (list4 != null) {
                                                                    }
                                                                    map4 = arrayMap2;
                                                                    it3 = it2;
                                                                    arrayMap3.put(numValueOf15, zzicVar2);
                                                                    arrayMap2 = map4;
                                                                    it2 = it3;
                                                                }
                                                            }
                                                            map3 = arrayMap3;
                                                        } catch (java.lang.Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } else {
                                                        map3 = map2;
                                                    }
                                                    it = hashSet.iterator();
                                                    while (it.hasNext()) {
                                                        iIntValue = ((java.lang.Integer) it.next()).intValue();
                                                        zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(java.lang.Integer.valueOf(iIntValue));
                                                        bitSet = new java.util.BitSet();
                                                        bitSet2 = new java.util.BitSet();
                                                        arrayMap = new androidx.collection.ArrayMap();
                                                        if (zzicVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (zzhkVar.zzh()) {
                                                                    java.lang.Integer numValueOf16 = java.lang.Integer.valueOf(zzhkVar.zza());
                                                                    if (zzhkVar.zzg()) {
                                                                        lValueOf = java.lang.Long.valueOf(zzhkVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    arrayMap.put(numValueOf16, lValueOf);
                                                                }
                                                            }
                                                        }
                                                        androidx.collection.ArrayMap arrayMap11 = new androidx.collection.ArrayMap();
                                                        if (zzicVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (!zzieVar.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        java.util.Map map7 = map3;
                                                        if (zzicVar != null) {
                                                            i3 = 0;
                                                            while (i3 < zzicVar.zzd() * 64) {
                                                                if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzk(), i3)) {
                                                                    str4 = str19;
                                                                    this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(i3));
                                                                    bitSet2.set(i3);
                                                                    if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzi(), i3)) {
                                                                        bitSet.set(i3);
                                                                    }
                                                                    i3++;
                                                                    str19 = str4;
                                                                } else {
                                                                    str4 = str19;
                                                                }
                                                                arrayMap.remove(java.lang.Integer.valueOf(i3));
                                                                i3++;
                                                                str19 = str4;
                                                            }
                                                        }
                                                        java.lang.String str27 = str19;
                                                        java.lang.Integer numValueOf17 = java.lang.Integer.valueOf(iIntValue);
                                                        com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf17);
                                                        if (!zZzx2) {
                                                        }
                                                        this.zzc.put(java.lang.Integer.valueOf(iIntValue), new com.google.android.gms.measurement.internal.zzy(this, this.zza, zzicVar4, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                                        str19 = str27;
                                                        map = map;
                                                        map3 = map7;
                                                        map2 = map2;
                                                    }
                                                    str3 = str19;
                                                }
                                                str6 = str2;
                                                str7 = str20;
                                                str8 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new com.google.android.gms.measurement.internal.zzz(this, null);
                                                    arrayMap4 = new androidx.collection.ArrayMap();
                                                    it4 = list.iterator();
                                                    while (it4.hasNext()) {
                                                        zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it4.next();
                                                        zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                                                        if (zzhmVarZza != null) {
                                                            zzpvVar = this.zzg;
                                                            zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                                                            zzpvVar.zzj().zzV(zzbdVarZzr);
                                                            if (!z) {
                                                                j = zzbdVarZzr.zzc;
                                                                strZzh = zzhmVarZza.zzh();
                                                                mapEmptyMap = (java.util.Map) arrayMap4.get(strZzh);
                                                                if (mapEmptyMap == null) {
                                                                    zzawVarZzj = zzpvVar.zzj();
                                                                    str10 = this.zza;
                                                                    zzawVarZzj.zzav();
                                                                    zzawVarZzj.zzg();
                                                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str10);
                                                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzh);
                                                                    arrayMap5 = new androidx.collection.ArrayMap();
                                                                    str9 = str6;
                                                                    str11 = str7;
                                                                    str7 = str11;
                                                                    cursorQuery2 = zzawVarZzj.zzj().query("event_filters", new java.lang.String[]{str9, str11}, "app_id=? AND event_name=?", new java.lang.String[]{str10, strZzh}, null, null, null);
                                                                    if (cursorQuery2.moveToFirst()) {
                                                                        j2 = j;
                                                                        do {
                                                                            com.google.android.gms.internal.measurement.zzfj zzfjVar5 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery2.getBlob(1))).zzba();
                                                                            numValueOf3 = java.lang.Integer.valueOf(cursorQuery2.getInt(0));
                                                                            arrayList2 = (java.util.List) arrayMap5.get(numValueOf3);
                                                                            if (arrayList2 == null) {
                                                                                arrayList2 = new java.util.ArrayList();
                                                                                arrayMap5.put(numValueOf3, arrayList2);
                                                                            }
                                                                            arrayList2.add(zzfjVar5);
                                                                        } while (cursorQuery2.moveToNext());
                                                                        if (cursorQuery2 != null) {
                                                                            cursorQuery2.close();
                                                                        }
                                                                        mapEmptyMap = arrayMap5;
                                                                    } else {
                                                                        j2 = j;
                                                                        mapEmptyMap = java.util.Collections.emptyMap();
                                                                        if (cursorQuery2 != null) {
                                                                            cursorQuery2.close();
                                                                        }
                                                                    }
                                                                    arrayMap4.put(strZzh, mapEmptyMap);
                                                                } else {
                                                                    j2 = j;
                                                                    str9 = str6;
                                                                }
                                                                it5 = mapEmptyMap.keySet().iterator();
                                                                while (it5.hasNext()) {
                                                                    iIntValue2 = ((java.lang.Integer) it5.next()).intValue();
                                                                    set = this.zzb;
                                                                    numValueOf2 = java.lang.Integer.valueOf(iIntValue2);
                                                                    if (set.contains(numValueOf2)) {
                                                                        this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                    } else {
                                                                        it6 = ((java.util.List) mapEmptyMap.get(numValueOf2)).iterator();
                                                                        zZzd = true;
                                                                        while (true) {
                                                                            if (!it6.hasNext()) {
                                                                                j3 = j2;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.zzfj zzfjVar6 = (com.google.android.gms.internal.measurement.zzfj) it6.next();
                                                                            zzaaVar = new com.google.android.gms.measurement.internal.zzaa(this, this.zza, iIntValue2, zzfjVar6);
                                                                            j3 = j2;
                                                                            zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j3, zzbdVarZzr, zzf(iIntValue2, zzfjVar6.zzb()));
                                                                            if (!zZzd) {
                                                                                this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                                                break;
                                                                            }
                                                                            zzd(java.lang.Integer.valueOf(iIntValue2)).zzc(zzaaVar);
                                                                            j2 = j3;
                                                                        }
                                                                        if (!zZzd) {
                                                                            this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                                        }
                                                                        j2 = j3;
                                                                    }
                                                                }
                                                                zzzVar = zzzVar;
                                                                it4 = it4;
                                                                str6 = str9;
                                                                str17 = str17;
                                                            }
                                                        }
                                                    }
                                                }
                                                str12 = str17;
                                                str13 = str6;
                                                if (!z) {
                                                    return new java.util.ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    arrayMap6 = new androidx.collection.ArrayMap();
                                                    it8 = list2.iterator();
                                                    while (it8.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzio zzioVar4 = (com.google.android.gms.internal.measurement.zzio) it8.next();
                                                        strZzg = zzioVar4.zzg();
                                                        mapEmptyMap2 = (java.util.Map) arrayMap6.get(strZzg);
                                                        if (mapEmptyMap2 == null) {
                                                            zzawVarZzj3 = this.zzg.zzj();
                                                            str16 = this.zza;
                                                            zzawVarZzj3.zzav();
                                                            zzawVarZzj3.zzg();
                                                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str16);
                                                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzg);
                                                            arrayMap7 = new androidx.collection.ArrayMap();
                                                            str15 = str7;
                                                            it9 = it8;
                                                            cursorQuery3 = zzawVarZzj3.zzj().query("property_filters", new java.lang.String[]{str13, str15}, "app_id=? AND property_name=?", new java.lang.String[]{str16, strZzg}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                do {
                                                                    com.google.android.gms.internal.measurement.zzfr zzfrVar3 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery3.getBlob(1))).zzba();
                                                                    numValueOf7 = java.lang.Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list5 = (java.util.List) arrayMap7.get(numValueOf7);
                                                                    if (list5 == null) {
                                                                        arrayList4 = new java.util.ArrayList();
                                                                        arrayMap7.put(numValueOf7, arrayList4);
                                                                    } else {
                                                                        arrayList4 = list5;
                                                                    }
                                                                    arrayList4.add(zzfrVar3);
                                                                } while (cursorQuery3.moveToNext());
                                                                if (cursorQuery3 != null) {
                                                                    cursorQuery3.close();
                                                                }
                                                                mapEmptyMap2 = arrayMap7;
                                                            } else {
                                                                mapEmptyMap2 = java.util.Collections.emptyMap();
                                                                if (cursorQuery3 != null) {
                                                                    cursorQuery3.close();
                                                                }
                                                            }
                                                            arrayMap6.put(strZzg, mapEmptyMap2);
                                                        } else {
                                                            it9 = it8;
                                                            str15 = str7;
                                                        }
                                                        it10 = mapEmptyMap2.keySet().iterator();
                                                        while (it10.hasNext()) {
                                                            iIntValue3 = ((java.lang.Integer) it10.next()).intValue();
                                                            set2 = this.zzb;
                                                            numValueOf4 = java.lang.Integer.valueOf(iIntValue3);
                                                            if (set2.contains(numValueOf4)) {
                                                                this.zzu.zzaW().zzj().zzb(str8, numValueOf4);
                                                                break;
                                                                break;
                                                            }
                                                            it11 = ((java.util.List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it11.hasNext()) {
                                                                    zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it11.next();
                                                                    zzioVar = this.zzu;
                                                                    if (android.util.Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                                        com.google.android.gms.measurement.internal.zzhc zzhcVarZzj3 = zzioVar.zzaW().zzj();
                                                                        java.lang.Integer numValueOf18 = java.lang.Integer.valueOf(iIntValue3);
                                                                        if (zzfrVar.zzj()) {
                                                                            numValueOf6 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                                        } else {
                                                                            numValueOf6 = null;
                                                                        }
                                                                        zzhcVarZzj3.zzd("Evaluating filter. audience, filter, property", numValueOf18, numValueOf6, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                                        zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                                    } else {
                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                    }
                                                                    if (zzfrVar.zzj()) {
                                                                    }
                                                                    com.google.android.gms.measurement.internal.zzhc zzhcVarZzk3 = zzioVar.zzaW().zzk();
                                                                    java.lang.Object objZzn3 = com.google.android.gms.measurement.internal.zzhe.zzn(this.zza);
                                                                    if (zzfrVar.zzj()) {
                                                                        numValueOf5 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                                    } else {
                                                                        numValueOf5 = null;
                                                                    }
                                                                    zzhcVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, java.lang.String.valueOf(numValueOf5));
                                                                    this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                    str8 = str8;
                                                                } else {
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                    str8 = str8;
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                                                }
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                str8 = str8;
                                                                zzd(java.lang.Integer.valueOf(iIntValue3)).zzc(zzacVar);
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                str8 = str8;
                                                            }
                                                        }
                                                        it8 = it9;
                                                        str7 = str15;
                                                    }
                                                }
                                                arrayList3 = new java.util.ArrayList();
                                                java.util.Set setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                it7 = setKeySet2.iterator();
                                                while (it7.hasNext()) {
                                                    int iIntValue7 = ((java.lang.Integer) it7.next()).intValue();
                                                    java.util.Map map8 = this.zzc;
                                                    java.lang.Integer numValueOf19 = java.lang.Integer.valueOf(iIntValue7);
                                                    com.google.android.gms.measurement.internal.zzy zzyVar2 = (com.google.android.gms.measurement.internal.zzy) map8.get(numValueOf19);
                                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzyVar2);
                                                    com.google.android.gms.internal.measurement.zzhi zzhiVarZza2 = zzyVar2.zza(iIntValue7);
                                                    arrayList3.add(zzhiVarZza2);
                                                    zzawVarZzj2 = this.zzg.zzj();
                                                    str14 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzic zzicVarZzd2 = zzhiVarZza2.zzd();
                                                    zzawVarZzj2.zzav();
                                                    zzawVarZzj2.zzg();
                                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str14);
                                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzicVarZzd2);
                                                    byte[] bArrZzcd2 = zzicVarZzd2.zzcd();
                                                    contentValues = new android.content.ContentValues();
                                                    contentValues.put("app_id", str14);
                                                    contentValues.put(str13, numValueOf19);
                                                    java.lang.String str28 = str12;
                                                    contentValues.put(str28, bArrZzcd2);
                                                    if (zzawVarZzj2.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzawVarZzj2.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str14));
                                                    }
                                                    str12 = str28;
                                                }
                                                return arrayList3;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayMap8 = arrayMap8;
                                            str21 = str2;
                                            str20 = str20;
                                        } catch (android.database.sqlite.SQLiteException e19) {
                                            e = e19;
                                            zzawVarZzj6.zzu.zzaW().zze().zzc("Database error querying filter results. appId", com.google.android.gms.measurement.internal.zzhe.zzn(str23), e);
                                            java.util.Map mapEmptyMap5 = java.util.Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap5;
                                        }
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = arrayMap8;
                                } else {
                                    java.util.Map mapEmptyMap6 = java.util.Collections.emptyMap();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = mapEmptyMap6;
                                    str2 = "audience_id";
                                    str20 = "data";
                                }
                            } catch (android.database.sqlite.SQLiteException e20) {
                                e = e20;
                                str2 = "audience_id";
                            }
                            if (map2.isEmpty()) {
                                str3 = "Failed to merge filter. appId";
                            } else {
                                java.util.HashSet hashSet2 = new java.util.HashSet(map2.keySet());
                                if (z2) {
                                    java.lang.String str29 = this.zza;
                                    com.google.android.gms.measurement.internal.zzaw zzawVarZzj8 = this.zzg.zzj();
                                    str5 = this.zza;
                                    zzawVarZzj8.zzav();
                                    zzawVarZzj8.zzg();
                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str5);
                                    arrayMap2 = new androidx.collection.ArrayMap();
                                    Zzj = zzawVarZzj8.zzj();
                                    i4 = 0;
                                    cursorRawQuery = Zzj.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new java.lang.String[]{str5, str5});
                                    if (cursorRawQuery.moveToFirst()) {
                                        while (true) {
                                            numValueOf = java.lang.Integer.valueOf(cursorRawQuery.getInt(i4));
                                            arrayList = (java.util.List) arrayMap2.get(numValueOf);
                                            if (arrayList == null) {
                                                arrayList = new java.util.ArrayList();
                                                arrayMap2.put(numValueOf, arrayList);
                                            }
                                            arrayList.add(java.lang.Integer.valueOf(cursorRawQuery.getInt(1)));
                                            if (!cursorRawQuery.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            i4 = 0;
                                        }
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    } else {
                                        arrayMap2 = java.util.Collections.emptyMap();
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    }
                                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str29);
                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(map2);
                                    arrayMap3 = new androidx.collection.ArrayMap();
                                    if (!map2.isEmpty()) {
                                        it2 = map2.keySet().iterator();
                                        while (it2.hasNext()) {
                                            int iIntValue8 = ((java.lang.Integer) it2.next()).intValue();
                                            java.lang.Integer numValueOf110 = java.lang.Integer.valueOf(iIntValue8);
                                            zzicVar2 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf110);
                                            list4 = (java.util.List) arrayMap2.get(numValueOf110);
                                            if (list4 != null) {
                                            }
                                            map4 = arrayMap2;
                                            it3 = it2;
                                            arrayMap3.put(numValueOf110, zzicVar2);
                                            arrayMap2 = map4;
                                            it2 = it3;
                                        }
                                    }
                                    map3 = arrayMap3;
                                } else {
                                    map3 = map2;
                                }
                                it = hashSet2.iterator();
                                while (it.hasNext()) {
                                    iIntValue = ((java.lang.Integer) it.next()).intValue();
                                    zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(java.lang.Integer.valueOf(iIntValue));
                                    bitSet = new java.util.BitSet();
                                    bitSet2 = new java.util.BitSet();
                                    arrayMap = new androidx.collection.ArrayMap();
                                    if (zzicVar != null) {
                                        while (r2.hasNext()) {
                                            if (zzhkVar.zzh()) {
                                                java.lang.Integer numValueOf111 = java.lang.Integer.valueOf(zzhkVar.zza());
                                                if (zzhkVar.zzg()) {
                                                    lValueOf = java.lang.Long.valueOf(zzhkVar.zzb());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                arrayMap.put(numValueOf111, lValueOf);
                                            }
                                        }
                                    }
                                    androidx.collection.ArrayMap arrayMap12 = new androidx.collection.ArrayMap();
                                    if (zzicVar != null) {
                                        while (r2.hasNext()) {
                                            if (!zzieVar.zzi()) {
                                            }
                                        }
                                    }
                                    java.util.Map map9 = map3;
                                    if (zzicVar != null) {
                                        i3 = 0;
                                        while (i3 < zzicVar.zzd() * 64) {
                                            if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzk(), i3)) {
                                                str4 = str19;
                                                this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(i3));
                                                bitSet2.set(i3);
                                                if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzi(), i3)) {
                                                    bitSet.set(i3);
                                                }
                                                i3++;
                                                str19 = str4;
                                            } else {
                                                str4 = str19;
                                            }
                                            arrayMap.remove(java.lang.Integer.valueOf(i3));
                                            i3++;
                                            str19 = str4;
                                        }
                                    }
                                    java.lang.String str210 = str19;
                                    java.lang.Integer numValueOf112 = java.lang.Integer.valueOf(iIntValue);
                                    com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf112);
                                    if (!zZzx2) {
                                    }
                                    this.zzc.put(java.lang.Integer.valueOf(iIntValue), new com.google.android.gms.measurement.internal.zzy(this, this.zza, zzicVar5, bitSet, bitSet2, arrayMap, arrayMap12, null));
                                    str19 = str210;
                                    map = map;
                                    map3 = map9;
                                    map2 = map2;
                                }
                                str3 = str19;
                            }
                            str6 = str2;
                            str7 = str20;
                            str8 = "Skipping failed audience ID";
                            if (!list.isEmpty()) {
                                zzzVar = new com.google.android.gms.measurement.internal.zzz(this, null);
                                arrayMap4 = new androidx.collection.ArrayMap();
                                it4 = list.iterator();
                                while (it4.hasNext()) {
                                    zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it4.next();
                                    zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                                    if (zzhmVarZza != null) {
                                        zzpvVar = this.zzg;
                                        zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                                        zzpvVar.zzj().zzV(zzbdVarZzr);
                                        if (!z) {
                                            j = zzbdVarZzr.zzc;
                                            strZzh = zzhmVarZza.zzh();
                                            mapEmptyMap = (java.util.Map) arrayMap4.get(strZzh);
                                            if (mapEmptyMap == null) {
                                                zzawVarZzj = zzpvVar.zzj();
                                                str10 = this.zza;
                                                zzawVarZzj.zzav();
                                                zzawVarZzj.zzg();
                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str10);
                                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzh);
                                                arrayMap5 = new androidx.collection.ArrayMap();
                                                str9 = str6;
                                                str11 = str7;
                                                str7 = str11;
                                                cursorQuery2 = zzawVarZzj.zzj().query("event_filters", new java.lang.String[]{str9, str11}, "app_id=? AND event_name=?", new java.lang.String[]{str10, strZzh}, null, null, null);
                                                if (cursorQuery2.moveToFirst()) {
                                                    j2 = j;
                                                    do {
                                                        com.google.android.gms.internal.measurement.zzfj zzfjVar7 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery2.getBlob(1))).zzba();
                                                        numValueOf3 = java.lang.Integer.valueOf(cursorQuery2.getInt(0));
                                                        arrayList2 = (java.util.List) arrayMap5.get(numValueOf3);
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new java.util.ArrayList();
                                                            arrayMap5.put(numValueOf3, arrayList2);
                                                        }
                                                        arrayList2.add(zzfjVar7);
                                                    } while (cursorQuery2.moveToNext());
                                                    if (cursorQuery2 != null) {
                                                        cursorQuery2.close();
                                                    }
                                                    mapEmptyMap = arrayMap5;
                                                } else {
                                                    j2 = j;
                                                    mapEmptyMap = java.util.Collections.emptyMap();
                                                    if (cursorQuery2 != null) {
                                                        cursorQuery2.close();
                                                    }
                                                }
                                                arrayMap4.put(strZzh, mapEmptyMap);
                                            } else {
                                                j2 = j;
                                                str9 = str6;
                                            }
                                            it5 = mapEmptyMap.keySet().iterator();
                                            while (it5.hasNext()) {
                                                iIntValue2 = ((java.lang.Integer) it5.next()).intValue();
                                                set = this.zzb;
                                                numValueOf2 = java.lang.Integer.valueOf(iIntValue2);
                                                if (set.contains(numValueOf2)) {
                                                    this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                } else {
                                                    it6 = ((java.util.List) mapEmptyMap.get(numValueOf2)).iterator();
                                                    zZzd = true;
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            j3 = j2;
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.zzfj zzfjVar8 = (com.google.android.gms.internal.measurement.zzfj) it6.next();
                                                        zzaaVar = new com.google.android.gms.measurement.internal.zzaa(this, this.zza, iIntValue2, zzfjVar8);
                                                        j3 = j2;
                                                        zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j3, zzbdVarZzr, zzf(iIntValue2, zzfjVar8.zzb()));
                                                        if (!zZzd) {
                                                            this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                            break;
                                                        }
                                                        zzd(java.lang.Integer.valueOf(iIntValue2)).zzc(zzaaVar);
                                                        j2 = j3;
                                                    }
                                                    if (!zZzd) {
                                                        this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                                    }
                                                    j2 = j3;
                                                }
                                            }
                                            zzzVar = zzzVar;
                                            it4 = it4;
                                            str6 = str9;
                                            str17 = str17;
                                        }
                                    }
                                }
                            }
                            str12 = str17;
                            str13 = str6;
                            if (!z) {
                                return new java.util.ArrayList();
                            }
                            if (!list2.isEmpty()) {
                                arrayMap6 = new androidx.collection.ArrayMap();
                                it8 = list2.iterator();
                                while (it8.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzio zzioVar5 = (com.google.android.gms.internal.measurement.zzio) it8.next();
                                    strZzg = zzioVar5.zzg();
                                    mapEmptyMap2 = (java.util.Map) arrayMap6.get(strZzg);
                                    if (mapEmptyMap2 == null) {
                                        zzawVarZzj3 = this.zzg.zzj();
                                        str16 = this.zza;
                                        zzawVarZzj3.zzav();
                                        zzawVarZzj3.zzg();
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str16);
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzg);
                                        arrayMap7 = new androidx.collection.ArrayMap();
                                        str15 = str7;
                                        it9 = it8;
                                        cursorQuery3 = zzawVarZzj3.zzj().query("property_filters", new java.lang.String[]{str13, str15}, "app_id=? AND property_name=?", new java.lang.String[]{str16, strZzg}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            do {
                                                com.google.android.gms.internal.measurement.zzfr zzfrVar4 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery3.getBlob(1))).zzba();
                                                numValueOf7 = java.lang.Integer.valueOf(cursorQuery3.getInt(0));
                                                list5 = (java.util.List) arrayMap7.get(numValueOf7);
                                                if (list5 == null) {
                                                    arrayList4 = new java.util.ArrayList();
                                                    arrayMap7.put(numValueOf7, arrayList4);
                                                } else {
                                                    arrayList4 = list5;
                                                }
                                                arrayList4.add(zzfrVar4);
                                            } while (cursorQuery3.moveToNext());
                                            if (cursorQuery3 != null) {
                                                cursorQuery3.close();
                                            }
                                            mapEmptyMap2 = arrayMap7;
                                        } else {
                                            mapEmptyMap2 = java.util.Collections.emptyMap();
                                            if (cursorQuery3 != null) {
                                                cursorQuery3.close();
                                            }
                                        }
                                        arrayMap6.put(strZzg, mapEmptyMap2);
                                    } else {
                                        it9 = it8;
                                        str15 = str7;
                                    }
                                    it10 = mapEmptyMap2.keySet().iterator();
                                    while (it10.hasNext()) {
                                        iIntValue3 = ((java.lang.Integer) it10.next()).intValue();
                                        set2 = this.zzb;
                                        numValueOf4 = java.lang.Integer.valueOf(iIntValue3);
                                        if (set2.contains(numValueOf4)) {
                                            this.zzu.zzaW().zzj().zzb(str8, numValueOf4);
                                            break;
                                            break;
                                        }
                                        it11 = ((java.util.List) mapEmptyMap2.get(numValueOf4)).iterator();
                                        zZzd2 = true;
                                        while (true) {
                                            if (it11.hasNext()) {
                                                zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it11.next();
                                                zzioVar = this.zzu;
                                                if (android.util.Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                                    com.google.android.gms.measurement.internal.zzhc zzhcVarZzj4 = zzioVar.zzaW().zzj();
                                                    java.lang.Integer numValueOf113 = java.lang.Integer.valueOf(iIntValue3);
                                                    if (zzfrVar.zzj()) {
                                                        numValueOf6 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                    } else {
                                                        numValueOf6 = null;
                                                    }
                                                    zzhcVarZzj4.zzd("Evaluating filter. audience, filter, property", numValueOf113, numValueOf6, zzioVar.zzj().zzf(zzfrVar.zze()));
                                                    zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                                } else {
                                                    mapEmptyMap2 = mapEmptyMap2;
                                                }
                                                if (zzfrVar.zzj()) {
                                                }
                                                com.google.android.gms.measurement.internal.zzhc zzhcVarZzk4 = zzioVar.zzaW().zzk();
                                                java.lang.Object objZzn4 = com.google.android.gms.measurement.internal.zzhe.zzn(this.zza);
                                                if (zzfrVar.zzj()) {
                                                    numValueOf5 = java.lang.Integer.valueOf(zzfrVar.zza());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                zzhcVarZzk4.zzc("Invalid property filter ID. appId, id", objZzn4, java.lang.String.valueOf(numValueOf5));
                                                this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                                mapEmptyMap2 = mapEmptyMap2;
                                                str8 = str8;
                                            } else {
                                                mapEmptyMap2 = mapEmptyMap2;
                                                str8 = str8;
                                            }
                                            if (!zZzd2) {
                                                this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                            }
                                            mapEmptyMap2 = mapEmptyMap2;
                                            str8 = str8;
                                            zzd(java.lang.Integer.valueOf(iIntValue3)).zzc(zzacVar);
                                            mapEmptyMap2 = mapEmptyMap2;
                                            str8 = str8;
                                        }
                                    }
                                    it8 = it9;
                                    str7 = str15;
                                }
                            }
                            arrayList3 = new java.util.ArrayList();
                            java.util.Set setKeySet3 = this.zzc.keySet();
                            setKeySet3.removeAll(this.zzb);
                            it7 = setKeySet3.iterator();
                            while (it7.hasNext()) {
                                int iIntValue9 = ((java.lang.Integer) it7.next()).intValue();
                                java.util.Map map10 = this.zzc;
                                java.lang.Integer numValueOf114 = java.lang.Integer.valueOf(iIntValue9);
                                com.google.android.gms.measurement.internal.zzy zzyVar3 = (com.google.android.gms.measurement.internal.zzy) map10.get(numValueOf114);
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzyVar3);
                                com.google.android.gms.internal.measurement.zzhi zzhiVarZza3 = zzyVar3.zza(iIntValue9);
                                arrayList3.add(zzhiVarZza3);
                                zzawVarZzj2 = this.zzg.zzj();
                                str14 = this.zza;
                                com.google.android.gms.internal.measurement.zzic zzicVarZzd3 = zzhiVarZza3.zzd();
                                zzawVarZzj2.zzav();
                                zzawVarZzj2.zzg();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str14);
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzicVarZzd3);
                                byte[] bArrZzcd3 = zzicVarZzd3.zzcd();
                                contentValues = new android.content.ContentValues();
                                contentValues.put("app_id", str14);
                                contentValues.put(str13, numValueOf114);
                                java.lang.String str211 = str12;
                                contentValues.put(str211, bArrZzcd3);
                                if (zzawVarZzj2.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    zzawVarZzj2.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str14));
                                }
                                str12 = str211;
                            }
                            return arrayList3;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (android.database.sqlite.SQLiteException e21) {
                e = e21;
                cursorQuery4 = null;
            } catch (java.lang.Throwable th9) {
                th = th9;
                r5 = 0;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        com.google.android.gms.measurement.internal.zzaw zzawVarZzj9 = this.zzg.zzj();
        java.lang.String str212 = this.zza;
        zzawVarZzj9.zzav();
        zzawVarZzj9.zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str212);
        try {
            cursorQuery = zzawVarZzj9.zzj().query("audience_filter_values", new java.lang.String[]{"audience_id", "current_results"}, "app_id=?", new java.lang.String[]{str212}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                java.util.Map mapEmptyMap7 = java.util.Collections.emptyMap();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = mapEmptyMap7;
                str2 = "audience_id";
                str20 = "data";
            } else {
                arrayMap8 = new androidx.collection.ArrayMap();
                while (true) {
                    i5 = cursorQuery.getInt(0);
                    arrayMap8.put(java.lang.Integer.valueOf(i5), (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzic.zze(), cursorQuery.getBlob(1))).zzba());
                    str2 = str21;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    arrayMap8 = arrayMap8;
                    str21 = str2;
                    str20 = str20;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                map2 = arrayMap8;
            }
        } catch (android.database.sqlite.SQLiteException e22) {
            e = e22;
            str2 = "audience_id";
            str20 = "data";
            cursorQuery = null;
        } catch (java.lang.Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (map2.isEmpty()) {
            str3 = "Failed to merge filter. appId";
        } else {
            java.util.HashSet hashSet3 = new java.util.HashSet(map2.keySet());
            if (z2) {
                java.lang.String str213 = this.zza;
                com.google.android.gms.measurement.internal.zzaw zzawVarZzj10 = this.zzg.zzj();
                str5 = this.zza;
                zzawVarZzj10.zzav();
                zzawVarZzj10.zzg();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str5);
                arrayMap2 = new androidx.collection.ArrayMap();
                Zzj = zzawVarZzj10.zzj();
                i4 = 0;
                cursorRawQuery = Zzj.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new java.lang.String[]{str5, str5});
                if (cursorRawQuery.moveToFirst()) {
                    while (true) {
                        numValueOf = java.lang.Integer.valueOf(cursorRawQuery.getInt(i4));
                        arrayList = (java.util.List) arrayMap2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                            arrayMap2.put(numValueOf, arrayList);
                        }
                        arrayList.add(java.lang.Integer.valueOf(cursorRawQuery.getInt(1)));
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                            break;
                        }
                        i4 = 0;
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } else {
                    arrayMap2 = java.util.Collections.emptyMap();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str213);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(map2);
                arrayMap3 = new androidx.collection.ArrayMap();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        int iIntValue10 = ((java.lang.Integer) it2.next()).intValue();
                        java.lang.Integer numValueOf115 = java.lang.Integer.valueOf(iIntValue10);
                        zzicVar2 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf115);
                        list4 = (java.util.List) arrayMap2.get(numValueOf115);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = arrayMap2;
                            it3 = it2;
                            arrayMap3.put(numValueOf115, zzicVar2);
                            arrayMap2 = map4;
                            it2 = it3;
                        } else {
                            com.google.android.gms.measurement.internal.zzpv zzpvVar2 = this.zzg;
                            map4 = arrayMap2;
                            java.util.List listZzt = zzpvVar2.zzA().zzt(zzicVar2.zzi(), list4);
                            if (listZzt.isEmpty()) {
                                arrayMap2 = map4;
                            } else {
                                com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) zzicVar2.zzch();
                                zzibVar.zzf();
                                zzibVar.zzb(listZzt);
                                java.util.List listZzt2 = zzpvVar2.zzA().zzt(zzicVar2.zzk(), list4);
                                zzibVar.zzh();
                                zzibVar.zzd(listZzt2);
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                java.util.Iterator it13 = zzicVar2.zzh().iterator();
                                while (it13.hasNext()) {
                                    java.util.Iterator it14 = it2;
                                    com.google.android.gms.internal.measurement.zzhk zzhkVar2 = (com.google.android.gms.internal.measurement.zzhk) it13.next();
                                    java.util.Iterator it15 = it13;
                                    if (!list4.contains(java.lang.Integer.valueOf(zzhkVar2.zza()))) {
                                        arrayList6.add(zzhkVar2);
                                    }
                                    it2 = it14;
                                    it13 = it15;
                                }
                                it3 = it2;
                                zzibVar.zze();
                                zzibVar.zza(arrayList6);
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                for (com.google.android.gms.internal.measurement.zzie zzieVar2 : zzicVar2.zzj()) {
                                    if (!list4.contains(java.lang.Integer.valueOf(zzieVar2.zzb()))) {
                                        arrayList7.add(zzieVar2);
                                    }
                                }
                                zzibVar.zzg();
                                zzibVar.zzc(arrayList7);
                                arrayMap3.put(java.lang.Integer.valueOf(iIntValue10), (com.google.android.gms.internal.measurement.zzic) zzibVar.zzba());
                                arrayMap2 = map4;
                                it2 = it3;
                            }
                        }
                    }
                }
                map3 = arrayMap3;
            } else {
                map3 = map2;
            }
            it = hashSet3.iterator();
            while (it.hasNext()) {
                iIntValue = ((java.lang.Integer) it.next()).intValue();
                zzicVar = (com.google.android.gms.internal.measurement.zzic) map3.get(java.lang.Integer.valueOf(iIntValue));
                bitSet = new java.util.BitSet();
                bitSet2 = new java.util.BitSet();
                arrayMap = new androidx.collection.ArrayMap();
                if (zzicVar != null && zzicVar.zza() != 0) {
                    while (r2.hasNext()) {
                        if (zzhkVar.zzh()) {
                            java.lang.Integer numValueOf116 = java.lang.Integer.valueOf(zzhkVar.zza());
                            if (zzhkVar.zzg()) {
                                lValueOf = java.lang.Long.valueOf(zzhkVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            arrayMap.put(numValueOf116, lValueOf);
                        }
                    }
                }
                androidx.collection.ArrayMap arrayMap13 = new androidx.collection.ArrayMap();
                if (zzicVar != null && zzicVar.zzc() != 0) {
                    while (r2.hasNext()) {
                        if (!zzieVar.zzi() && zzieVar.zza() > 0) {
                            arrayMap13.put(java.lang.Integer.valueOf(zzieVar.zzb()), java.lang.Long.valueOf(zzieVar.zzc(zzieVar.zza() - 1)));
                            map3 = map3;
                        }
                    }
                }
                java.util.Map map11 = map3;
                if (zzicVar != null) {
                    i3 = 0;
                    while (i3 < zzicVar.zzd() * 64) {
                        if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzk(), i3)) {
                            str4 = str19;
                            this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (com.google.android.gms.measurement.internal.zzqa.zzy(zzicVar.zzi(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            str19 = str4;
                        } else {
                            str4 = str19;
                        }
                        arrayMap.remove(java.lang.Integer.valueOf(i3));
                        i3++;
                        str19 = str4;
                    }
                }
                java.lang.String str214 = str19;
                java.lang.Integer numValueOf117 = java.lang.Integer.valueOf(iIntValue);
                com.google.android.gms.internal.measurement.zzic zzicVar6 = (com.google.android.gms.internal.measurement.zzic) map2.get(numValueOf117);
                if (!zZzx2 && zZzx && (list3 = (java.util.List) map.get(numValueOf117)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzfj zzfjVar9 : list3) {
                        int iZzb = zzfjVar9.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzfjVar9.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        java.lang.Integer numValueOf20 = java.lang.Integer.valueOf(iZzb);
                        if (arrayMap.containsKey(numValueOf20)) {
                            arrayMap.put(numValueOf20, java.lang.Long.valueOf(jLongValue));
                        }
                        if (arrayMap13.containsKey(numValueOf20)) {
                            arrayMap13.put(numValueOf20, java.lang.Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(java.lang.Integer.valueOf(iIntValue), new com.google.android.gms.measurement.internal.zzy(this, this.zza, zzicVar6, bitSet, bitSet2, arrayMap, arrayMap13, null));
                str19 = str214;
                map = map;
                map3 = map11;
                map2 = map2;
            }
            str3 = str19;
        }
        str6 = str2;
        str7 = str20;
        str8 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new com.google.android.gms.measurement.internal.zzz(this, null);
            arrayMap4 = new androidx.collection.ArrayMap();
            it4 = list.iterator();
            while (it4.hasNext()) {
                zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it4.next();
                zzhmVarZza = zzzVar.zza(this.zza, zzhmVar);
                if (zzhmVarZza != null) {
                    zzpvVar = this.zzg;
                    zzbdVarZzr = zzpvVar.zzj().zzr(this.zza, zzhmVar, zzhmVarZza.zzh());
                    zzpvVar.zzj().zzV(zzbdVarZzr);
                    if (!z) {
                        j = zzbdVarZzr.zzc;
                        strZzh = zzhmVarZza.zzh();
                        mapEmptyMap = (java.util.Map) arrayMap4.get(strZzh);
                        if (mapEmptyMap == null) {
                            zzawVarZzj = zzpvVar.zzj();
                            str10 = this.zza;
                            zzawVarZzj.zzav();
                            zzawVarZzj.zzg();
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str10);
                            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzh);
                            arrayMap5 = new androidx.collection.ArrayMap();
                            str9 = str6;
                            str11 = str7;
                            str7 = str11;
                            cursorQuery2 = zzawVarZzj.zzj().query("event_filters", new java.lang.String[]{str9, str11}, "app_id=? AND event_name=?", new java.lang.String[]{str10, strZzh}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                j2 = j;
                                do {
                                    com.google.android.gms.internal.measurement.zzfj zzfjVar10 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursorQuery2.getBlob(1))).zzba();
                                    numValueOf3 = java.lang.Integer.valueOf(cursorQuery2.getInt(0));
                                    arrayList2 = (java.util.List) arrayMap5.get(numValueOf3);
                                    if (arrayList2 == null) {
                                        arrayList2 = new java.util.ArrayList();
                                        arrayMap5.put(numValueOf3, arrayList2);
                                    }
                                    arrayList2.add(zzfjVar10);
                                } while (cursorQuery2.moveToNext());
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                                mapEmptyMap = arrayMap5;
                            } else {
                                j2 = j;
                                mapEmptyMap = java.util.Collections.emptyMap();
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                            }
                            arrayMap4.put(strZzh, mapEmptyMap);
                        } else {
                            j2 = j;
                            str9 = str6;
                        }
                        it5 = mapEmptyMap.keySet().iterator();
                        while (it5.hasNext()) {
                            iIntValue2 = ((java.lang.Integer) it5.next()).intValue();
                            set = this.zzb;
                            numValueOf2 = java.lang.Integer.valueOf(iIntValue2);
                            if (set.contains(numValueOf2)) {
                                this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", numValueOf2);
                            } else {
                                it6 = ((java.util.List) mapEmptyMap.get(numValueOf2)).iterator();
                                zZzd = true;
                                while (true) {
                                    if (!it6.hasNext()) {
                                        j3 = j2;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzfj zzfjVar11 = (com.google.android.gms.internal.measurement.zzfj) it6.next();
                                    zzaaVar = new com.google.android.gms.measurement.internal.zzaa(this, this.zza, iIntValue2, zzfjVar11);
                                    j3 = j2;
                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhmVarZza, j3, zzbdVarZzr, zzf(iIntValue2, zzfjVar11.zzb()));
                                    if (!zZzd) {
                                        this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                        break;
                                    }
                                    zzd(java.lang.Integer.valueOf(iIntValue2)).zzc(zzaaVar);
                                    j2 = j3;
                                }
                                if (!zZzd) {
                                    this.zzb.add(java.lang.Integer.valueOf(iIntValue2));
                                }
                                j2 = j3;
                            }
                        }
                        zzzVar = zzzVar;
                        it4 = it4;
                        str6 = str9;
                        str17 = str17;
                    }
                }
            }
        }
        str12 = str17;
        str13 = str6;
        if (!z) {
            return new java.util.ArrayList();
        }
        if (!list2.isEmpty()) {
            arrayMap6 = new androidx.collection.ArrayMap();
            it8 = list2.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzio zzioVar6 = (com.google.android.gms.internal.measurement.zzio) it8.next();
                strZzg = zzioVar6.zzg();
                mapEmptyMap2 = (java.util.Map) arrayMap6.get(strZzg);
                if (mapEmptyMap2 == null) {
                    zzawVarZzj3 = this.zzg.zzj();
                    str16 = this.zza;
                    zzawVarZzj3.zzav();
                    zzawVarZzj3.zzg();
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str16);
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(strZzg);
                    arrayMap7 = new androidx.collection.ArrayMap();
                    str15 = str7;
                    it9 = it8;
                    cursorQuery3 = zzawVarZzj3.zzj().query("property_filters", new java.lang.String[]{str13, str15}, "app_id=? AND property_name=?", new java.lang.String[]{str16, strZzg}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        do {
                            com.google.android.gms.internal.measurement.zzfr zzfrVar5 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) com.google.android.gms.measurement.internal.zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursorQuery3.getBlob(1))).zzba();
                            numValueOf7 = java.lang.Integer.valueOf(cursorQuery3.getInt(0));
                            list5 = (java.util.List) arrayMap7.get(numValueOf7);
                            if (list5 == null) {
                                arrayList4 = new java.util.ArrayList();
                                arrayMap7.put(numValueOf7, arrayList4);
                            } else {
                                arrayList4 = list5;
                            }
                            arrayList4.add(zzfrVar5);
                        } while (cursorQuery3.moveToNext());
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        mapEmptyMap2 = arrayMap7;
                    } else {
                        mapEmptyMap2 = java.util.Collections.emptyMap();
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                    }
                    arrayMap6.put(strZzg, mapEmptyMap2);
                } else {
                    it9 = it8;
                    str15 = str7;
                }
                it10 = mapEmptyMap2.keySet().iterator();
                while (it10.hasNext()) {
                    iIntValue3 = ((java.lang.Integer) it10.next()).intValue();
                    set2 = this.zzb;
                    numValueOf4 = java.lang.Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf4)) {
                        this.zzu.zzaW().zzj().zzb(str8, numValueOf4);
                        break;
                        break;
                    }
                    it11 = ((java.util.List) mapEmptyMap2.get(numValueOf4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it11.hasNext()) {
                            zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it11.next();
                            zzioVar = this.zzu;
                            if (android.util.Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                com.google.android.gms.measurement.internal.zzhc zzhcVarZzj5 = zzioVar.zzaW().zzj();
                                java.lang.Integer numValueOf118 = java.lang.Integer.valueOf(iIntValue3);
                                if (zzfrVar.zzj()) {
                                    numValueOf6 = java.lang.Integer.valueOf(zzfrVar.zza());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzhcVarZzj5.zzd("Evaluating filter. audience, filter, property", numValueOf118, numValueOf6, zzioVar.zzj().zzf(zzfrVar.zze()));
                                zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                            } else {
                                mapEmptyMap2 = mapEmptyMap2;
                            }
                            if (zzfrVar.zzj() || zzfrVar.zza() > 256) {
                                com.google.android.gms.measurement.internal.zzhc zzhcVarZzk5 = zzioVar.zzaW().zzk();
                                java.lang.Object objZzn5 = com.google.android.gms.measurement.internal.zzhe.zzn(this.zza);
                                if (zzfrVar.zzj()) {
                                    numValueOf5 = java.lang.Integer.valueOf(zzfrVar.zza());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzhcVarZzk5.zzc("Invalid property filter ID. appId, id", objZzn5, java.lang.String.valueOf(numValueOf5));
                                this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                mapEmptyMap2 = mapEmptyMap2;
                                str8 = str8;
                            } else {
                                zzacVar = new com.google.android.gms.measurement.internal.zzac(this, this.zza, iIntValue3, zzfrVar);
                                zZzd2 = zzacVar.zzd(this.zzd, this.zze, zzioVar6, zzf(iIntValue3, zzfrVar.zza()));
                                if (zZzd2) {
                                    zzd(java.lang.Integer.valueOf(iIntValue3)).zzc(zzacVar);
                                    mapEmptyMap2 = mapEmptyMap2;
                                    str8 = str8;
                                } else {
                                    this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                                }
                            }
                        } else {
                            mapEmptyMap2 = mapEmptyMap2;
                            str8 = str8;
                        }
                        if (!zZzd2) {
                            this.zzb.add(java.lang.Integer.valueOf(iIntValue3));
                        }
                        mapEmptyMap2 = mapEmptyMap2;
                        str8 = str8;
                    }
                }
                it8 = it9;
                str7 = str15;
            }
        }
        arrayList3 = new java.util.ArrayList();
        java.util.Set setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        it7 = setKeySet4.iterator();
        while (it7.hasNext()) {
            int iIntValue11 = ((java.lang.Integer) it7.next()).intValue();
            java.util.Map map12 = this.zzc;
            java.lang.Integer numValueOf119 = java.lang.Integer.valueOf(iIntValue11);
            com.google.android.gms.measurement.internal.zzy zzyVar4 = (com.google.android.gms.measurement.internal.zzy) map12.get(numValueOf119);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzyVar4);
            com.google.android.gms.internal.measurement.zzhi zzhiVarZza4 = zzyVar4.zza(iIntValue11);
            arrayList3.add(zzhiVarZza4);
            zzawVarZzj2 = this.zzg.zzj();
            str14 = this.zza;
            com.google.android.gms.internal.measurement.zzic zzicVarZzd4 = zzhiVarZza4.zzd();
            zzawVarZzj2.zzav();
            zzawVarZzj2.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str14);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzicVarZzd4);
            byte[] bArrZzcd4 = zzicVarZzd4.zzcd();
            contentValues = new android.content.ContentValues();
            contentValues.put("app_id", str14);
            contentValues.put(str13, numValueOf119);
            java.lang.String str215 = str12;
            contentValues.put(str215, bArrZzcd4);
            if (zzawVarZzj2.zzj().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzawVarZzj2.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(str14));
            }
            str12 = str215;
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }
}

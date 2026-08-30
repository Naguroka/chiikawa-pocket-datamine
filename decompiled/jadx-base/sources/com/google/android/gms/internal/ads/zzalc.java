package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalc {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final com.google.android.gms.internal.ads.zzali zzf;
    public final java.lang.String zzg;
    public final java.lang.String zzh;
    public final com.google.android.gms.internal.ads.zzalc zzi;
    private final java.lang.String[] zzj;
    private final java.util.HashMap zzk;
    private final java.util.HashMap zzl;
    private java.util.List zzm;

    public static com.google.android.gms.internal.ads.zzalc zzb(java.lang.String str, long j, long j2, com.google.android.gms.internal.ads.zzali zzaliVar, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzalc zzalcVar) {
        return new com.google.android.gms.internal.ads.zzalc(str, null, j, j2, zzaliVar, strArr, str2, str3, zzalcVar);
    }

    public static com.google.android.gms.internal.ads.zzalc zzc(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzalc(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, null, null, "", null, null);
    }

    private static android.text.SpannableStringBuilder zzi(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
            zzcmVar.zzl(new android.text.SpannableStringBuilder());
            map.put(str, zzcmVar);
        }
        java.lang.CharSequence charSequenceZzq = ((com.google.android.gms.internal.ads.zzcm) map.get(str)).zzq();
        charSequenceZzq.getClass();
        return (android.text.SpannableStringBuilder) charSequenceZzq;
    }

    private final void zzj(java.util.TreeSet treeSet, boolean z) {
        java.lang.String str = this.zza;
        boolean zEquals = androidx.media3.extractor.text.ttml.TtmlNode.TAG_P.equals(str);
        boolean zEquals2 = androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV.equals(str);
        if (z || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(java.lang.Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(java.lang.Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                com.google.android.gms.internal.ads.zzalc zzalcVar = (com.google.android.gms.internal.ads.zzalc) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzalcVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV.equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new android.util.Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j, str, list);
        }
    }

    private final void zzl(long j, java.util.Map map, java.util.Map map2, java.lang.String str, java.util.Map map3) {
        com.google.android.gms.internal.ads.zzalc zzalcVar;
        com.google.android.gms.internal.ads.zzali zzaliVarZza;
        int i;
        if (zzg(j)) {
            java.lang.String str2 = !"".equals(this.zzg) ? this.zzg : str;
            java.util.Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str3 = (java.lang.String) entry.getKey();
                int iIntValue = this.zzk.containsKey(str3) ? ((java.lang.Integer) this.zzk.get(str3)).intValue() : 0;
                int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    com.google.android.gms.internal.ads.zzcm zzcmVar = (com.google.android.gms.internal.ads.zzcm) map3.get(str3);
                    zzcmVar.getClass();
                    com.google.android.gms.internal.ads.zzalg zzalgVar = (com.google.android.gms.internal.ads.zzalg) map2.get(str2);
                    zzalgVar.getClass();
                    int i2 = zzalgVar.zzj;
                    com.google.android.gms.internal.ads.zzali zzaliVarZza2 = com.google.android.gms.internal.ads.zzalh.zza(this.zzf, this.zzj, map);
                    android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) zzcmVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new android.text.SpannableStringBuilder();
                        zzcmVar.zzl(spannableStringBuilder);
                    }
                    if (zzaliVarZza2 != null) {
                        com.google.android.gms.internal.ads.zzalc zzalcVar2 = this.zzi;
                        if (zzaliVarZza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(zzaliVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzI()) {
                            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzJ()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzH()) {
                            com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.ForegroundColorSpan(zzaliVarZza2.zzd()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzG()) {
                            com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.BackgroundColorSpan(zzaliVarZza2.zzc()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzD() != null) {
                            com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.TypefaceSpan(zzaliVarZza2.zzD()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzk() != null) {
                            com.google.android.gms.internal.ads.zzalb zzalbVarZzk = zzaliVarZza2.zzk();
                            zzalbVarZzk.getClass();
                            int i3 = zzalbVarZzk.zza;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzalbVarZzk.zzb;
                            }
                            int i4 = zzalbVarZzk.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new com.google.android.gms.internal.ads.zzcu(i3, i, i4), iIntValue, iIntValue2, 33);
                        }
                        int iZzg = zzaliVarZza2.zzg();
                        if (iZzg == 2) {
                            while (true) {
                                if (zzalcVar2 == null) {
                                    zzalcVar2 = null;
                                    break;
                                }
                                com.google.android.gms.internal.ads.zzali zzaliVarZza3 = com.google.android.gms.internal.ads.zzalh.zza(zzalcVar2.zzf, zzalcVar2.zzj, map);
                                if (zzaliVarZza3 != null && zzaliVarZza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzalcVar2 = zzalcVar2.zzi;
                                }
                            }
                            if (zzalcVar2 != null) {
                                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                                arrayDeque.push(zzalcVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalcVar = null;
                                        break;
                                    }
                                    com.google.android.gms.internal.ads.zzalc zzalcVar3 = (com.google.android.gms.internal.ads.zzalc) arrayDeque.pop();
                                    com.google.android.gms.internal.ads.zzali zzaliVarZza4 = com.google.android.gms.internal.ads.zzalh.zza(zzalcVar3.zzf, zzalcVar3.zzj, map);
                                    if (zzaliVarZza4 != null && zzaliVarZza4.zzg() == 3) {
                                        zzalcVar = zzalcVar3;
                                        break;
                                    }
                                    for (int iZza = zzalcVar3.zza() - 1; iZza >= 0; iZza--) {
                                        arrayDeque.push(zzalcVar3.zzd(iZza));
                                    }
                                }
                                if (zzalcVar != null) {
                                    if (zzalcVar.zza() != 1 || zzalcVar.zzd(0).zzb == null) {
                                        com.google.android.gms.internal.ads.zzdo.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        java.lang.String str4 = zzalcVar.zzd(0).zzb;
                                        int i5 = com.google.android.gms.internal.ads.zzei.zza;
                                        com.google.android.gms.internal.ads.zzali zzaliVarZza5 = com.google.android.gms.internal.ads.zzalh.zza(zzalcVar.zzf, zzalcVar.zzj, map);
                                        int iZzf = zzaliVarZza5 != null ? zzaliVarZza5.zzf() : -1;
                                        if (iZzf == -1 && (zzaliVarZza = com.google.android.gms.internal.ads.zzalh.zza(zzalcVar2.zzf, zzalcVar2.zzj, map)) != null) {
                                            iZzf = zzaliVarZza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzcs(str4, iZzf), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzg == 3 || iZzg == 4) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzala(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzF()) {
                            com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new com.google.android.gms.internal.ads.zzcr(), iIntValue, iIntValue2, 33);
                        }
                        int iZze = zzaliVarZza2.zze();
                        if (iZze == 1) {
                            com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) zzaliVarZza2.zza(), true), iIntValue, iIntValue2, 33);
                        } else if (iZze == 2) {
                            com.google.android.gms.internal.ads.zzct.zzb(spannableStringBuilder, new android.text.style.RelativeSizeSpan(zzaliVarZza2.zza()), iIntValue, iIntValue2, 33);
                        } else if (iZze == 3) {
                            com.google.android.gms.internal.ads.zzct.zza(spannableStringBuilder, zzaliVarZza2.zza() / 100.0f, iIntValue, iIntValue2, 33);
                        }
                        if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_P.equals(this.zza)) {
                            if (zzaliVarZza2.zzb() != Float.MAX_VALUE) {
                                zzcmVar.zzj((zzaliVarZza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zzaliVarZza2.zzj() != null) {
                                zzcmVar.zzm(zzaliVarZza2.zzj());
                            }
                            if (zzaliVarZza2.zzi() != null) {
                                zzcmVar.zzg(zzaliVarZza2.zzi());
                            }
                        }
                        it = it;
                    }
                }
            }
            for (int i6 = 0; i6 < zza(); i6++) {
                zzd(i6).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, java.lang.String str, java.util.Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA.equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z) {
            android.text.SpannableStringBuilder spannableStringBuilderZzi = zzi(str, map);
            java.lang.String str2 = this.zzb;
            str2.getClass();
            spannableStringBuilderZzi.append((java.lang.CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.util.HashMap map2 = this.zzk;
                java.lang.String str3 = (java.lang.String) entry.getKey();
                java.lang.CharSequence charSequenceZzq = ((com.google.android.gms.internal.ads.zzcm) entry.getValue()).zzq();
                charSequenceZzq.getClass();
                map2.put(str3, java.lang.Integer.valueOf(charSequenceZzq.length()));
            }
            boolean zEquals = androidx.media3.extractor.text.ttml.TtmlNode.TAG_P.equals(this.zza);
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzm(j, z || zEquals, str, map);
            }
            if (zEquals) {
                android.text.SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str, map);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                java.util.HashMap map3 = this.zzl;
                java.lang.String str4 = (java.lang.String) entry2.getKey();
                java.lang.CharSequence charSequenceZzq2 = ((com.google.android.gms.internal.ads.zzcm) entry2.getValue()).zzq();
                charSequenceZzq2.getClass();
                map3.put(str4, java.lang.Integer.valueOf(charSequenceZzq2.length()));
            }
        }
    }

    public final int zza() {
        java.util.List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final com.google.android.gms.internal.ads.zzalc zzd(int i) {
        java.util.List list = this.zzm;
        if (list != null) {
            return (com.google.android.gms.internal.ads.zzalc) list.get(i);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final java.util.List zze(long j, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.util.List arrayList = new java.util.ArrayList();
        zzk(j, this.zzg, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.util.Pair pair = (android.util.Pair) arrayList.get(i);
            java.lang.String str = (java.lang.String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = android.util.Base64.decode(str, 0);
                android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                com.google.android.gms.internal.ads.zzalg zzalgVar = (com.google.android.gms.internal.ads.zzalg) map2.get(pair.first);
                zzalgVar.getClass();
                com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
                zzcmVar.zzc(bitmapDecodeByteArray);
                zzcmVar.zzh(zzalgVar.zzb);
                zzcmVar.zzi(0);
                zzcmVar.zze(zzalgVar.zzc, 0);
                zzcmVar.zzf(zzalgVar.zze);
                zzcmVar.zzk(zzalgVar.zzf);
                zzcmVar.zzd(zzalgVar.zzg);
                zzcmVar.zzo(zzalgVar.zzj);
                arrayList2.add(zzcmVar.zzp());
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            com.google.android.gms.internal.ads.zzalg zzalgVar2 = (com.google.android.gms.internal.ads.zzalg) map2.get(entry.getKey());
            zzalgVar2.getClass();
            com.google.android.gms.internal.ads.zzcm zzcmVar2 = (com.google.android.gms.internal.ads.zzcm) entry.getValue();
            java.lang.CharSequence charSequenceZzq = zzcmVar2.zzq();
            charSequenceZzq.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) charSequenceZzq;
            for (com.google.android.gms.internal.ads.zzala zzalaVar : (com.google.android.gms.internal.ads.zzala[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), com.google.android.gms.internal.ads.zzala.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalaVar), spannableStringBuilder.getSpanEnd(zzalaVar), (java.lang.CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcmVar2.zze(zzalgVar2.zzc, zzalgVar2.zzd);
            zzcmVar2.zzf(zzalgVar2.zze);
            zzcmVar2.zzh(zzalgVar2.zzb);
            zzcmVar2.zzk(zzalgVar2.zzf);
            zzcmVar2.zzn(zzalgVar2.zzi, zzalgVar2.zzh);
            zzcmVar2.zzo(zzalgVar2.zzj);
            arrayList2.add(zzcmVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(com.google.android.gms.internal.ads.zzalc zzalcVar) {
        if (this.zzm == null) {
            this.zzm = new java.util.ArrayList();
        }
        this.zzm.add(zzalcVar);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == androidx.media3.common.C.TIME_UNSET) {
            if (this.zze == androidx.media3.common.C.TIME_UNSET) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == androidx.media3.common.C.TIME_UNSET) {
            return true;
        }
        if (j2 != androidx.media3.common.C.TIME_UNSET || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((java.lang.Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private zzalc(java.lang.String str, java.lang.String str2, long j, long j2, com.google.android.gms.internal.ads.zzali zzaliVar, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.zzalc zzalcVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaliVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalcVar;
        this.zzk = new java.util.HashMap();
        this.zzl = new java.util.HashMap();
    }
}

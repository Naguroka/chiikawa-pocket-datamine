package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqa extends com.google.android.gms.measurement.internal.zzpg {
    zzqa(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
    }

    static boolean zzA(java.lang.String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static android.os.Bundle[] zzC(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it.next();
            if (zzhqVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                for (com.google.android.gms.internal.measurement.zzhq zzhqVar2 : zzhqVar.zzi()) {
                    if (zzhqVar2.zzy()) {
                        bundle.putString(zzhqVar2.zzg(), zzhqVar2.zzh());
                    } else if (zzhqVar2.zzw()) {
                        bundle.putLong(zzhqVar2.zzg(), zzhqVar2.zzd());
                    } else if (zzhqVar2.zzu()) {
                        bundle.putDouble(zzhqVar2.zzg(), zzhqVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (android.os.Bundle[]) arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    static final void zzD(com.google.android.gms.internal.measurement.zzhl zzhlVar, java.lang.String str, java.lang.Object obj) {
        java.util.List listZzp = zzhlVar.zzp();
        int i = 0;
        while (true) {
            if (i >= listZzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhq) listZzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
        zzhpVarZze.zzj(str);
        zzhpVarZze.zzi(((java.lang.Long) obj).longValue());
        if (i >= 0) {
            zzhlVar.zzj(i, zzhpVarZze);
        } else {
            zzhlVar.zze(zzhpVarZze);
        }
    }

    static final boolean zzE(com.google.android.gms.measurement.internal.zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbhVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        return (android.text.TextUtils.isEmpty(zzrVar.zzb) && android.text.TextUtils.isEmpty(zzrVar.zzp)) ? false : true;
    }

    static final android.os.Bundle zzF(java.util.List list) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it.next();
            java.lang.String strZzg = zzhqVar.zzg();
            if (zzhqVar.zzu()) {
                bundle.putDouble(strZzg, zzhqVar.zza());
            } else if (zzhqVar.zzv()) {
                bundle.putFloat(strZzg, zzhqVar.zzb());
            } else if (zzhqVar.zzy()) {
                bundle.putString(strZzg, zzhqVar.zzh());
            } else if (zzhqVar.zzw()) {
                bundle.putLong(strZzg, zzhqVar.zzd());
            }
        }
        return bundle;
    }

    static final com.google.android.gms.internal.measurement.zzhq zzG(com.google.android.gms.internal.measurement.zzhm zzhmVar, java.lang.String str) {
        for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zzhmVar.zzi()) {
            if (zzhqVar.zzg().equals(str)) {
                return zzhqVar;
            }
        }
        return null;
    }

    static final java.lang.Object zzH(com.google.android.gms.internal.measurement.zzhm zzhmVar, java.lang.String str) {
        com.google.android.gms.internal.measurement.zzhq zzhqVarZzG = zzG(zzhmVar, str);
        if (zzhqVarZzG == null) {
            return null;
        }
        if (zzhqVarZzG.zzy()) {
            return zzhqVarZzG.zzh();
        }
        if (zzhqVarZzG.zzw()) {
            return java.lang.Long.valueOf(zzhqVarZzG.zzd());
        }
        if (zzhqVarZzG.zzu()) {
            return java.lang.Double.valueOf(zzhqVarZzG.zza());
        }
        if (zzhqVarZzG.zzc() > 0) {
            return zzC(zzhqVarZzG.zzi());
        }
        return null;
    }

    static final java.lang.Object zzI(com.google.android.gms.internal.measurement.zzhm zzhmVar, java.lang.String str, java.lang.Object obj) {
        java.lang.Object objZzH = zzH(zzhmVar, str);
        return objZzH == null ? obj : objZzH;
    }

    private final void zzJ(java.lang.StringBuilder sb, int i, java.util.List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it.next();
            if (zzhqVar != null) {
                zzL(sb, i2);
                sb.append("param {\n");
                zzQ(sb, i2, "name", zzhqVar.zzx() ? this.zzu.zzj().zze(zzhqVar.zzg()) : null);
                zzQ(sb, i2, "string_value", zzhqVar.zzy() ? zzhqVar.zzh() : null);
                zzQ(sb, i2, "int_value", zzhqVar.zzw() ? java.lang.Long.valueOf(zzhqVar.zzd()) : null);
                zzQ(sb, i2, "double_value", zzhqVar.zzu() ? java.lang.Double.valueOf(zzhqVar.zza()) : null);
                if (zzhqVar.zzc() > 0) {
                    zzJ(sb, i2, zzhqVar.zzi());
                }
                zzL(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zzK(java.lang.StringBuilder sb, int i, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        java.lang.String str;
        if (zzflVar == null) {
            return;
        }
        zzL(sb, i);
        sb.append("filter {\n");
        if (zzflVar.zzh()) {
            zzQ(sb, i, "complement", java.lang.Boolean.valueOf(zzflVar.zzg()));
        }
        if (zzflVar.zzj()) {
            zzQ(sb, i, "param_name", this.zzu.zzj().zze(zzflVar.zze()));
        }
        if (zzflVar.zzk()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzfv zzfvVarZzd = zzflVar.zzd();
            if (zzfvVarZzd != null) {
                zzL(sb, i2);
                sb.append("string_filter {\n");
                if (zzfvVarZzd.zzi()) {
                    switch (zzfvVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzQ(sb, i2, "match_type", str);
                }
                if (zzfvVarZzd.zzh()) {
                    zzQ(sb, i2, "expression", zzfvVarZzd.zzd());
                }
                if (zzfvVarZzd.zzg()) {
                    zzQ(sb, i2, "case_sensitive", java.lang.Boolean.valueOf(zzfvVarZzd.zzf()));
                }
                if (zzfvVarZzd.zza() > 0) {
                    zzL(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (java.lang.String str2 : zzfvVarZzd.zze()) {
                        zzL(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzL(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzflVar.zzi()) {
            zzR(sb, i + 1, "number_filter", zzflVar.zzc());
        }
        zzL(sb, i);
        sb.append("}\n");
    }

    private static final void zzL(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final void zzM(android.net.Uri.Builder builder, java.lang.String str, java.lang.String str2, java.util.Set set) {
        if (set.contains(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static final java.lang.String zzN(boolean z, boolean z2, boolean z3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzO(android.net.Uri.Builder builder, java.lang.String[] strArr, android.os.Bundle bundle, java.util.Set set) {
        for (java.lang.String str : strArr) {
            java.lang.String[] strArrSplit = str.split(",");
            java.lang.String str2 = strArrSplit[0];
            java.lang.String str3 = strArrSplit[strArrSplit.length - 1];
            java.lang.String string = bundle.getString(str2);
            if (string != null) {
                zzM(builder, str3, string, set);
            }
        }
    }

    private static final void zzP(java.lang.StringBuilder sb, int i, java.lang.String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
        if (zzicVar == null) {
            return;
        }
        zzL(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzicVar.zzb() != 0) {
            zzL(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (java.lang.Long l : zzicVar.zzi()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzicVar.zzd() != 0) {
            zzL(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (java.lang.Long l2 : zzicVar.zzk()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzicVar.zza() != 0) {
            zzL(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.zzhk zzhkVar : zzicVar.zzh()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhkVar.zzh() ? java.lang.Integer.valueOf(zzhkVar.zza()) : null);
                sb.append(":");
                sb.append(zzhkVar.zzg() ? java.lang.Long.valueOf(zzhkVar.zzb()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzicVar.zzc() != 0) {
            zzL(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.zzie zzieVar : zzicVar.zzj()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzieVar.zzi() ? java.lang.Integer.valueOf(zzieVar.zzb()) : null);
                sb.append(": [");
                java.util.Iterator it = zzieVar.zzf().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((java.lang.Long) it.next()).longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append(com.ironsource.y8.i.e);
                i8 = i9;
            }
            sb.append("}\n");
        }
        zzL(sb, 3);
        sb.append("}\n");
    }

    private static final void zzQ(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        zzL(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzR(java.lang.StringBuilder sb, int i, java.lang.String str, com.google.android.gms.internal.measurement.zzfp zzfpVar) {
        java.lang.String str2;
        if (zzfpVar == null) {
            return;
        }
        zzL(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzfpVar.zzg()) {
            int iZzm = zzfpVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            zzQ(sb, i, "comparison_type", str2);
        }
        if (zzfpVar.zzi()) {
            zzQ(sb, i, "match_as_float", java.lang.Boolean.valueOf(zzfpVar.zzf()));
        }
        if (zzfpVar.zzh()) {
            zzQ(sb, i, "comparison_value", zzfpVar.zzc());
        }
        if (zzfpVar.zzk()) {
            zzQ(sb, i, "min_comparison_value", zzfpVar.zze());
        }
        if (zzfpVar.zzj()) {
            zzQ(sb, i, "max_comparison_value", zzfpVar.zzd());
        }
        zzL(sb, i);
        sb.append("}\n");
    }

    static int zza(com.google.android.gms.internal.measurement.zzhw zzhwVar, java.lang.String str) {
        for (int i = 0; i < zzhwVar.zzd(); i++) {
            if (str.equals(zzhwVar.zzaE(i).zzg())) {
                return i;
            }
        }
        return -1;
    }

    static com.google.android.gms.internal.measurement.zzng zzp(com.google.android.gms.internal.measurement.zzng zzngVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzmm {
        com.google.android.gms.internal.measurement.zzlp zzlpVarZza = com.google.android.gms.internal.measurement.zzlp.zza();
        return zzlpVarZza != null ? zzngVar.zzaV(bArr, zzlpVarZza) : zzngVar.zzaU(bArr);
    }

    static java.util.List zzu(java.util.BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    static boolean zzy(java.util.List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((java.lang.Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    final byte[] zzB(byte[] bArr) throws java.io.IOException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            this.zzu.zzaW().zze().zzb("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }

    final long zzd(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzf(str.getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING)));
    }

    final long zzf(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzw().zzg();
        java.security.MessageDigest messageDigestZzI = com.google.android.gms.measurement.internal.zzqf.zzI();
        if (messageDigestZzI != null) {
            return com.google.android.gms.measurement.internal.zzqf.zzr(messageDigestZzI.digest(bArr));
        }
        zzioVar.zzaW().zze().zza("Failed to get MD5");
        return 0L;
    }

    final android.os.Bundle zzh(java.util.Map map, boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            } else if (!(obj instanceof java.util.ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzh((java.util.Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (android.os.Parcelable[]) arrayList2.toArray(new android.os.Parcelable[0]));
            }
        }
        return bundle;
    }

    final android.os.Parcelable zzi(byte[] bArr, android.os.Parcelable.Creator creator) {
        android.os.Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (android.os.Parcelable) creator.createFromParcel(parcelObtain);
        } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused) {
            this.zzu.zzaW().zze().zza("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    final com.google.android.gms.measurement.internal.zzbh zzj(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        java.lang.Object obj;
        android.os.Bundle bundleZzh = zzh(zzaaVar.zzf(), true);
        java.lang.String string = (!bundleZzh.containsKey("_o") || (obj = bundleZzh.get("_o")) == null) ? "app" : obj.toString();
        java.lang.String strZzb = com.google.android.gms.measurement.internal.zzjy.zzb(zzaaVar.zze());
        if (strZzb == null) {
            strZzb = zzaaVar.zze();
        }
        return new com.google.android.gms.measurement.internal.zzbh(strZzb, new com.google.android.gms.measurement.internal.zzbf(bundleZzh), string, zzaaVar.zza());
    }

    final com.google.android.gms.measurement.internal.zzov zzl(java.lang.String str, com.google.android.gms.internal.measurement.zzhw zzhwVar, com.google.android.gms.internal.measurement.zzhl zzhlVar, java.lang.String str2) {
        int iIndexOf;
        com.google.android.gms.internal.measurement.zzqr.zzb();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzx(str, com.google.android.gms.measurement.internal.zzgi.zzaV)) {
            return null;
        }
        long jCurrentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        java.lang.String[] strArrSplit = zzioVar.zzf().zzr(str, com.google.android.gms.measurement.internal.zzgi.zzat).split(",");
        java.util.HashSet hashSet = new java.util.HashSet(strArrSplit.length);
        for (java.lang.String str3 : strArrSplit) {
            if (!hashSet.add(java.util.Objects.requireNonNull(str3))) {
                throw new java.lang.IllegalArgumentException("duplicate element: ".concat(java.lang.String.valueOf(str3)));
            }
        }
        java.util.Set setUnmodifiableSet = java.util.Collections.unmodifiableSet(hashSet);
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzg;
        com.google.android.gms.measurement.internal.zzpi zzpiVarZzy = zzpvVar.zzy();
        java.lang.String strZzm = zzpiVarZzy.zzg.zzr().zzm(str);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzpiVarZzy.zzu;
        builder.scheme(zzioVar2.zzf().zzr(str, com.google.android.gms.measurement.internal.zzgi.zzam));
        if (android.text.TextUtils.isEmpty(strZzm)) {
            builder.authority(zzioVar2.zzf().zzr(str, com.google.android.gms.measurement.internal.zzgi.zzan));
        } else {
            builder.authority(strZzm + "." + zzioVar2.zzf().zzr(str, com.google.android.gms.measurement.internal.zzgi.zzan));
        }
        builder.path(zzioVar2.zzf().zzr(str, com.google.android.gms.measurement.internal.zzgi.zzao));
        zzM(builder, "gmp_app_id", zzhwVar.zzaJ(), setUnmodifiableSet);
        zzioVar.zzf().zzj();
        zzM(builder, "gmp_version", java.lang.String.valueOf(119002L), setUnmodifiableSet);
        java.lang.String strZzaG = zzhwVar.zzaG();
        com.google.android.gms.measurement.internal.zzam zzamVarZzf = zzioVar.zzf();
        com.google.android.gms.measurement.internal.zzgg zzggVar = com.google.android.gms.measurement.internal.zzgi.zzaY;
        if (zzamVarZzf.zzx(str, zzggVar) && zzpvVar.zzr().zzA(str)) {
            strZzaG = "";
        }
        zzM(builder, "app_instance_id", strZzaG, setUnmodifiableSet);
        zzM(builder, "rdid", zzhwVar.zzaL(), setUnmodifiableSet);
        zzM(builder, "bundle_id", zzhwVar.zzaF(), setUnmodifiableSet);
        java.lang.String strZzo = zzhlVar.zzo();
        java.lang.String strZza = com.google.android.gms.measurement.internal.zzjy.zza(strZzo);
        if (true != android.text.TextUtils.isEmpty(strZza)) {
            strZzo = strZza;
        }
        zzM(builder, "app_event_name", strZzo, setUnmodifiableSet);
        zzM(builder, "app_version", java.lang.String.valueOf(zzhwVar.zzb()), setUnmodifiableSet);
        java.lang.String strZzaK = zzhwVar.zzaK();
        if (zzioVar.zzf().zzx(str, zzggVar) && zzpvVar.zzr().zzE(str) && !android.text.TextUtils.isEmpty(strZzaK) && (iIndexOf = strZzaK.indexOf(".")) != -1) {
            strZzaK = strZzaK.substring(0, iIndexOf);
        }
        zzM(builder, "os_version", strZzaK, setUnmodifiableSet);
        zzM(builder, com.ironsource.aa.a.d, java.lang.String.valueOf(zzhlVar.zzc()), setUnmodifiableSet);
        if (zzhwVar.zzaP()) {
            zzM(builder, com.json.ce.q, "1", setUnmodifiableSet);
        }
        zzM(builder, "privacy_sandbox_version", java.lang.String.valueOf(zzhwVar.zza()), setUnmodifiableSet);
        zzM(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        zzM(builder, "trigger_uri_timestamp", java.lang.String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        zzM(builder, "request_uuid", str2, setUnmodifiableSet);
        java.util.List<com.google.android.gms.internal.measurement.zzhq> listZzp = zzhlVar.zzp();
        android.os.Bundle bundle = new android.os.Bundle();
        for (com.google.android.gms.internal.measurement.zzhq zzhqVar : listZzp) {
            java.lang.String strZzg = zzhqVar.zzg();
            if (zzhqVar.zzu()) {
                bundle.putString(strZzg, java.lang.String.valueOf(zzhqVar.zza()));
            } else if (zzhqVar.zzv()) {
                bundle.putString(strZzg, java.lang.String.valueOf(zzhqVar.zzb()));
            } else if (zzhqVar.zzy()) {
                bundle.putString(strZzg, zzhqVar.zzh());
            } else if (zzhqVar.zzw()) {
                bundle.putString(strZzg, java.lang.String.valueOf(zzhqVar.zzd()));
            }
        }
        zzO(builder, zzioVar.zzf().zzr(str, com.google.android.gms.measurement.internal.zzgi.zzas).split("\\|"), bundle, setUnmodifiableSet);
        java.util.List<com.google.android.gms.internal.measurement.zzio> listZzaN = zzhwVar.zzaN();
        android.os.Bundle bundle2 = new android.os.Bundle();
        for (com.google.android.gms.internal.measurement.zzio zzioVar3 : listZzaN) {
            java.lang.String strZzg2 = zzioVar3.zzg();
            if (zzioVar3.zzr()) {
                bundle2.putString(strZzg2, java.lang.String.valueOf(zzioVar3.zza()));
            } else if (zzioVar3.zzs()) {
                bundle2.putString(strZzg2, java.lang.String.valueOf(zzioVar3.zzb()));
            } else if (zzioVar3.zzv()) {
                bundle2.putString(strZzg2, zzioVar3.zzh());
            } else if (zzioVar3.zzt()) {
                bundle2.putString(strZzg2, java.lang.String.valueOf(zzioVar3.zzc()));
            }
        }
        zzO(builder, zzioVar.zzf().zzr(str, com.google.android.gms.measurement.internal.zzgi.zzar).split("\\|"), bundle2, setUnmodifiableSet);
        zzM(builder, "dma", true != zzhwVar.zzaO() ? "0" : "1", setUnmodifiableSet);
        if (!zzhwVar.zzaI().isEmpty()) {
            zzM(builder, "dma_cps", zzhwVar.zzaI(), setUnmodifiableSet);
        }
        if (zzhwVar.zzaQ()) {
            com.google.android.gms.internal.measurement.zzhc zzhcVarZzg = zzhwVar.zzg();
            if (!zzhcVarZzg.zzh().isEmpty()) {
                zzM(builder, "dl_gclid", zzhcVarZzg.zzh(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzg().isEmpty()) {
                zzM(builder, "dl_gbraid", zzhcVarZzg.zzg(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzf().isEmpty()) {
                zzM(builder, "dl_gs", zzhcVarZzg.zzf(), setUnmodifiableSet);
            }
            if (zzhcVarZzg.zza() > 0) {
                zzM(builder, "dl_ss_ts", java.lang.String.valueOf(zzhcVarZzg.zza()), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzk().isEmpty()) {
                zzM(builder, "mr_gclid", zzhcVarZzg.zzk(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzj().isEmpty()) {
                zzM(builder, "mr_gbraid", zzhcVarZzg.zzj(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzi().isEmpty()) {
                zzM(builder, "mr_gs", zzhcVarZzg.zzi(), setUnmodifiableSet);
            }
            if (zzhcVarZzg.zzb() > 0) {
                zzM(builder, "mr_click_ts", java.lang.String.valueOf(zzhcVarZzg.zzb()), setUnmodifiableSet);
            }
        }
        return new com.google.android.gms.measurement.internal.zzov(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    final com.google.android.gms.internal.measurement.zzhm zzm(com.google.android.gms.measurement.internal.zzbc zzbcVar) {
        com.google.android.gms.internal.measurement.zzhl zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
        zzhlVarZze.zzl(zzbcVar.zze);
        com.google.android.gms.measurement.internal.zzbf zzbfVar = zzbcVar.zzf;
        com.google.android.gms.measurement.internal.zzbe zzbeVar = new com.google.android.gms.measurement.internal.zzbe(zzbfVar);
        while (zzbeVar.hasNext()) {
            java.lang.String next = zzbeVar.next();
            com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
            zzhpVarZze.zzj(next);
            java.lang.Object objZzf = zzbfVar.zzf(next);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(objZzf);
            zzw(zzhpVarZze, objZzf);
            zzhlVarZze.zze(zzhpVarZze);
        }
        java.lang.String str = zzbcVar.zzc;
        if (!android.text.TextUtils.isEmpty(str) && zzbfVar.zzf("_o") == null) {
            com.google.android.gms.internal.measurement.zzhp zzhpVarZze2 = com.google.android.gms.internal.measurement.zzhq.zze();
            zzhpVarZze2.zzj("_o");
            zzhpVarZze2.zzk(str);
            zzhlVarZze.zzf((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze2.zzba());
        }
        return (com.google.android.gms.internal.measurement.zzhm) zzhlVarZze.zzba();
    }

    final java.lang.String zzq(com.google.android.gms.internal.measurement.zzhv zzhvVar) {
        java.lang.String str;
        java.lang.String str2;
        com.google.android.gms.internal.measurement.zzhg zzhgVarZzx;
        if (zzhvVar == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nbatch {\n");
        if (zzhvVar.zzq()) {
            zzQ(sb, 0, "upload_subdomain", zzhvVar.zzg());
        }
        if (zzhvVar.zzp()) {
            zzQ(sb, 0, "sgtm_join_id", zzhvVar.zzf());
        }
        for (com.google.android.gms.internal.measurement.zzhx zzhxVar : zzhvVar.zzh()) {
            if (zzhxVar != null) {
                zzL(sb, 1);
                sb.append("bundle {\n");
                if (zzhxVar.zzbQ()) {
                    zzQ(sb, 1, "protocol_version", java.lang.Integer.valueOf(zzhxVar.zzf()));
                }
                com.google.android.gms.internal.measurement.zzrd.zzb();
                com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
                if (zzioVar.zzf().zzx(zzhxVar.zzF(), com.google.android.gms.measurement.internal.zzgi.zzaL) && zzhxVar.zzbT()) {
                    zzQ(sb, 1, "session_stitching_token", zzhxVar.zzU());
                }
                zzQ(sb, 1, com.json.ce.A, zzhxVar.zzS());
                if (zzhxVar.zzbL()) {
                    zzQ(sb, 1, "gmp_version", java.lang.Long.valueOf(zzhxVar.zzp()));
                }
                if (zzhxVar.zzbZ()) {
                    zzQ(sb, 1, "uploading_gmp_version", java.lang.Long.valueOf(zzhxVar.zzv()));
                }
                if (zzhxVar.zzbJ()) {
                    zzQ(sb, 1, "dynamite_version", java.lang.Long.valueOf(zzhxVar.zzn()));
                }
                if (zzhxVar.zzbC()) {
                    zzQ(sb, 1, "config_version", java.lang.Long.valueOf(zzhxVar.zzk()));
                }
                zzQ(sb, 1, "gmp_app_id", zzhxVar.zzP());
                zzQ(sb, 1, "admob_app_id", zzhxVar.zzE());
                zzQ(sb, 1, "app_id", zzhxVar.zzF());
                zzQ(sb, 1, "app_version", zzhxVar.zzI());
                if (zzhxVar.zzby()) {
                    zzQ(sb, 1, "app_version_major", java.lang.Integer.valueOf(zzhxVar.zzb()));
                }
                zzQ(sb, 1, "firebase_instance_id", zzhxVar.zzO());
                if (zzhxVar.zzbH()) {
                    zzQ(sb, 1, "dev_cert_hash", java.lang.Long.valueOf(zzhxVar.zzm()));
                }
                zzQ(sb, 1, "app_store", zzhxVar.zzH());
                if (zzhxVar.zzbY()) {
                    zzQ(sb, 1, "upload_timestamp_millis", java.lang.Long.valueOf(zzhxVar.zzu()));
                }
                if (zzhxVar.zzbV()) {
                    zzQ(sb, 1, "start_timestamp_millis", java.lang.Long.valueOf(zzhxVar.zzs()));
                }
                if (zzhxVar.zzbK()) {
                    zzQ(sb, 1, "end_timestamp_millis", java.lang.Long.valueOf(zzhxVar.zzo()));
                }
                if (zzhxVar.zzbP()) {
                    zzQ(sb, 1, "previous_bundle_start_timestamp_millis", java.lang.Long.valueOf(zzhxVar.zzr()));
                }
                if (zzhxVar.zzbO()) {
                    zzQ(sb, 1, "previous_bundle_end_timestamp_millis", java.lang.Long.valueOf(zzhxVar.zzq()));
                }
                zzQ(sb, 1, "app_instance_id", zzhxVar.zzG());
                zzQ(sb, 1, "resettable_device_id", zzhxVar.zzT());
                zzQ(sb, 1, "ds_id", zzhxVar.zzN());
                if (zzhxVar.zzbN()) {
                    zzQ(sb, 1, "limited_ad_tracking", java.lang.Boolean.valueOf(zzhxVar.zzbv()));
                }
                zzQ(sb, 1, "os_version", zzhxVar.zzR());
                zzQ(sb, 1, "device_model", zzhxVar.zzM());
                zzQ(sb, 1, "user_default_language", zzhxVar.zzV());
                if (zzhxVar.zzbX()) {
                    zzQ(sb, 1, "time_zone_offset_minutes", java.lang.Integer.valueOf(zzhxVar.zzh()));
                }
                if (zzhxVar.zzbB()) {
                    zzQ(sb, 1, "bundle_sequential_index", java.lang.Integer.valueOf(zzhxVar.zzc()));
                }
                if (zzhxVar.zzbG()) {
                    zzQ(sb, 1, "delivery_index", java.lang.Integer.valueOf(zzhxVar.zzd()));
                }
                if (zzhxVar.zzbS()) {
                    zzQ(sb, 1, "service_upload", java.lang.Boolean.valueOf(zzhxVar.zzbw()));
                }
                zzQ(sb, 1, "health_monitor", zzhxVar.zzQ());
                if (zzhxVar.zzbR()) {
                    zzQ(sb, 1, "retry_counter", java.lang.Integer.valueOf(zzhxVar.zzg()));
                }
                if (zzhxVar.zzbE()) {
                    zzQ(sb, 1, "consent_signals", zzhxVar.zzK());
                }
                if (zzhxVar.zzbM()) {
                    zzQ(sb, 1, "is_dma_region", java.lang.Boolean.valueOf(zzhxVar.zzbu()));
                }
                if (zzhxVar.zzbF()) {
                    zzQ(sb, 1, "core_platform_services", zzhxVar.zzL());
                }
                if (zzhxVar.zzbD()) {
                    zzQ(sb, 1, "consent_diagnostics", zzhxVar.zzJ());
                }
                if (zzhxVar.zzbW()) {
                    zzQ(sb, 1, "target_os_version", java.lang.Long.valueOf(zzhxVar.zzt()));
                }
                com.google.android.gms.internal.measurement.zzqr.zzb();
                if (zzioVar.zzf().zzx(zzhxVar.zzF(), com.google.android.gms.measurement.internal.zzgi.zzaV)) {
                    zzQ(sb, 1, "ad_services_version", java.lang.Integer.valueOf(zzhxVar.zza()));
                    if (zzhxVar.zzbz() && (zzhgVarZzx = zzhxVar.zzx()) != null) {
                        zzL(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        zzQ(sb, 2, "eligible", java.lang.Boolean.valueOf(zzhgVarZzx.zzn()));
                        zzQ(sb, 2, "no_access_adservices_attribution_permission", java.lang.Boolean.valueOf(zzhgVarZzx.zzp()));
                        zzQ(sb, 2, "pre_r", java.lang.Boolean.valueOf(zzhgVarZzx.zzq()));
                        zzQ(sb, 2, "r_extensions_too_old", java.lang.Boolean.valueOf(zzhgVarZzx.zzr()));
                        zzQ(sb, 2, "adservices_extension_too_old", java.lang.Boolean.valueOf(zzhgVarZzx.zzm()));
                        zzQ(sb, 2, "ad_storage_not_allowed", java.lang.Boolean.valueOf(zzhgVarZzx.zzk()));
                        zzQ(sb, 2, "measurement_manager_disabled", java.lang.Boolean.valueOf(zzhgVarZzx.zzo()));
                        zzL(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (zzhxVar.zzbx()) {
                    com.google.android.gms.internal.measurement.zzhc zzhcVarZzw = zzhxVar.zzw();
                    zzL(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (zzhcVarZzw.zzC()) {
                        zzQ(sb, 2, "deep_link_gclid", zzhcVarZzw.zzh());
                    }
                    if (zzhcVarZzw.zzB()) {
                        zzQ(sb, 2, "deep_link_gbraid", zzhcVarZzw.zzg());
                    }
                    if (zzhcVarZzw.zzA()) {
                        zzQ(sb, 2, "deep_link_gad_source", zzhcVarZzw.zzf());
                    }
                    if (zzhcVarZzw.zzD()) {
                        zzQ(sb, 2, "deep_link_session_millis", java.lang.Long.valueOf(zzhcVarZzw.zza()));
                    }
                    if (zzhcVarZzw.zzH()) {
                        zzQ(sb, 2, "market_referrer_gclid", zzhcVarZzw.zzk());
                    }
                    if (zzhcVarZzw.zzG()) {
                        zzQ(sb, 2, "market_referrer_gbraid", zzhcVarZzw.zzj());
                    }
                    if (zzhcVarZzw.zzF()) {
                        zzQ(sb, 2, "market_referrer_gad_source", zzhcVarZzw.zzi());
                    }
                    if (zzhcVarZzw.zzE()) {
                        zzQ(sb, 2, "market_referrer_click_millis", java.lang.Long.valueOf(zzhcVarZzw.zzb()));
                    }
                    zzL(sb, 2);
                    sb.append("}\n");
                }
                if (zzhxVar.zzbA()) {
                    zzQ(sb, 1, "batching_timestamp_millis", java.lang.Long.valueOf(zzhxVar.zzj()));
                }
                if (zzhxVar.zzbU()) {
                    com.google.android.gms.internal.measurement.zzim zzimVarZzC = zzhxVar.zzC();
                    zzL(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int iZzg = zzimVarZzC.zzg();
                    if (iZzg == 1) {
                        str = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iZzg == 2) {
                        str = "GA_UPLOAD";
                    } else if (iZzg != 3) {
                        str = iZzg != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str = "SDK_CLIENT_UPLOAD";
                    }
                    zzQ(sb, 2, "upload_type", str);
                    zzQ(sb, 2, "client_upload_eligibility", zzimVarZzC.zzb().name());
                    int iZzf = zzimVarZzC.zzf();
                    if (iZzf == 1) {
                        str2 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iZzf == 2) {
                        str2 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iZzf == 3) {
                        str2 = "NOT_IN_ROLLOUT";
                    } else if (iZzf != 4) {
                        str2 = iZzf != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str2 = "MISSING_SGTM_SETTINGS";
                    }
                    zzQ(sb, 2, "service_upload_eligibility", str2);
                    zzL(sb, 2);
                    sb.append("}\n");
                }
                java.util.List<com.google.android.gms.internal.measurement.zzio> listZzY = zzhxVar.zzY();
                if (listZzY != null) {
                    for (com.google.android.gms.internal.measurement.zzio zzioVar2 : listZzY) {
                        if (zzioVar2 != null) {
                            zzL(sb, 2);
                            sb.append("user_property {\n");
                            zzQ(sb, 2, "set_timestamp_millis", zzioVar2.zzu() ? java.lang.Long.valueOf(zzioVar2.zzd()) : null);
                            zzQ(sb, 2, "name", zzioVar.zzj().zzf(zzioVar2.zzg()));
                            zzQ(sb, 2, "string_value", zzioVar2.zzh());
                            zzQ(sb, 2, "int_value", zzioVar2.zzt() ? java.lang.Long.valueOf(zzioVar2.zzc()) : null);
                            zzQ(sb, 2, "double_value", zzioVar2.zzr() ? java.lang.Double.valueOf(zzioVar2.zza()) : null);
                            zzL(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzhi> listZzW = zzhxVar.zzW();
                if (listZzW != null) {
                    for (com.google.android.gms.internal.measurement.zzhi zzhiVar : listZzW) {
                        if (zzhiVar != null) {
                            zzL(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzhiVar.zzk()) {
                                zzQ(sb, 2, "audience_id", java.lang.Integer.valueOf(zzhiVar.zza()));
                            }
                            if (zzhiVar.zzm()) {
                                zzQ(sb, 2, "new_audience", java.lang.Boolean.valueOf(zzhiVar.zzj()));
                            }
                            zzP(sb, 2, "current_data", zzhiVar.zzd());
                            if (zzhiVar.zzn()) {
                                zzP(sb, 2, "previous_data", zzhiVar.zze());
                            }
                            zzL(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzhm> listZzX = zzhxVar.zzX();
                if (listZzX != null) {
                    for (com.google.android.gms.internal.measurement.zzhm zzhmVar : listZzX) {
                        if (zzhmVar != null) {
                            zzL(sb, 2);
                            sb.append("event {\n");
                            zzQ(sb, 2, "name", zzioVar.zzj().zzd(zzhmVar.zzh()));
                            if (zzhmVar.zzu()) {
                                zzQ(sb, 2, "timestamp_millis", java.lang.Long.valueOf(zzhmVar.zzd()));
                            }
                            if (zzhmVar.zzt()) {
                                zzQ(sb, 2, "previous_timestamp_millis", java.lang.Long.valueOf(zzhmVar.zzc()));
                            }
                            if (zzhmVar.zzs()) {
                                zzQ(sb, 2, "count", java.lang.Integer.valueOf(zzhmVar.zza()));
                            }
                            if (zzhmVar.zzb() != 0) {
                                zzJ(sb, 2, zzhmVar.zzi());
                            }
                            zzL(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zzL(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    final java.lang.String zzr(com.google.android.gms.internal.measurement.zzfj zzfjVar) {
        if (zzfjVar == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzfjVar.zzp()) {
            zzQ(sb, 0, "filter_id", java.lang.Integer.valueOf(zzfjVar.zzb()));
        }
        zzQ(sb, 0, "event_name", this.zzu.zzj().zzd(zzfjVar.zzg()));
        java.lang.String strZzN = zzN(zzfjVar.zzk(), zzfjVar.zzm(), zzfjVar.zzn());
        if (!strZzN.isEmpty()) {
            zzQ(sb, 0, "filter_type", strZzN);
        }
        if (zzfjVar.zzo()) {
            zzR(sb, 1, "event_count_filter", zzfjVar.zzf());
        }
        if (zzfjVar.zza() > 0) {
            sb.append("  filters {\n");
            java.util.Iterator it = zzfjVar.zzh().iterator();
            while (it.hasNext()) {
                zzK(sb, 2, (com.google.android.gms.internal.measurement.zzfl) it.next());
            }
        }
        zzL(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final java.lang.String zzs(com.google.android.gms.internal.measurement.zzfr zzfrVar) {
        if (zzfrVar == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzfrVar.zzj()) {
            zzQ(sb, 0, "filter_id", java.lang.Integer.valueOf(zzfrVar.zza()));
        }
        zzQ(sb, 0, "property_name", this.zzu.zzj().zzf(zzfrVar.zze()));
        java.lang.String strZzN = zzN(zzfrVar.zzg(), zzfrVar.zzh(), zzfrVar.zzi());
        if (!strZzN.isEmpty()) {
            zzQ(sb, 0, "filter_type", strZzN);
        }
        zzK(sb, 1, zzfrVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    final java.util.List zzt(java.util.List list, java.util.List list2) {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num.intValue() < 0) {
                this.zzu.zzaW().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzu.zzaW().zzk().zzc("Ignoring bit index greater than bitSet size", num, java.lang.Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, java.lang.Long.valueOf(((java.lang.Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((java.lang.Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final java.util.Map zzv(android.os.Bundle bundle, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            boolean z2 = obj instanceof android.os.Parcelable[];
            if (z2 || (obj instanceof java.util.ArrayList) || (obj instanceof android.os.Bundle)) {
                if (z) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (z2) {
                        for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
                            if (parcelable instanceof android.os.Bundle) {
                                arrayList.add(zzv((android.os.Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            java.lang.Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof android.os.Bundle) {
                                arrayList.add(zzv((android.os.Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof android.os.Bundle) {
                        arrayList.add(zzv((android.os.Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final void zzw(com.google.android.gms.internal.measurement.zzhp zzhpVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzhpVar.zzg();
        zzhpVar.zze();
        zzhpVar.zzd();
        zzhpVar.zzf();
        if (obj instanceof java.lang.String) {
            zzhpVar.zzk((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzhpVar.zzi(((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            zzhpVar.zzh(((java.lang.Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof android.os.Bundle[])) {
            this.zzu.zzaW().zze().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.Bundle bundle : (android.os.Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                for (java.lang.String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhp zzhpVarZze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                    zzhpVarZze2.zzj(str);
                    java.lang.Object obj2 = bundle.get(str);
                    if (obj2 instanceof java.lang.Long) {
                        zzhpVarZze2.zzi(((java.lang.Long) obj2).longValue());
                    } else if (obj2 instanceof java.lang.String) {
                        zzhpVarZze2.zzk((java.lang.String) obj2);
                    } else if (obj2 instanceof java.lang.Double) {
                        zzhpVarZze2.zzh(((java.lang.Double) obj2).doubleValue());
                    }
                    zzhpVarZze.zzc(zzhpVarZze2);
                }
                if (zzhpVarZze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze.zzba());
                }
            }
        }
        zzhpVar.zzb(arrayList);
    }

    final void zzx(com.google.android.gms.internal.measurement.zzin zzinVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzinVar.zzc();
        zzinVar.zzb();
        zzinVar.zza();
        if (obj instanceof java.lang.String) {
            zzinVar.zzh((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzinVar.zze(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.Double) {
            zzinVar.zzd(((java.lang.Double) obj).doubleValue());
        } else {
            this.zzu.zzaW().zze().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean zzz(long j, long j2) {
        return j == 0 || j2 <= 0 || java.lang.Math.abs(this.zzu.zzaU().currentTimeMillis() - j) > j2;
    }
}

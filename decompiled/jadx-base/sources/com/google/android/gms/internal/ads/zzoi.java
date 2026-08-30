package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzoi {
    static final com.google.android.gms.internal.ads.zzfxq zzb;
    private final android.util.SparseArray zzd = new android.util.SparseArray();
    private final int zze;
    public static final com.google.android.gms.internal.ads.zzoi zza = new com.google.android.gms.internal.ads.zzoi(com.google.android.gms.internal.ads.zzfxn.zzo(com.google.android.gms.internal.ads.zzoh.zza));
    private static final com.google.android.gms.internal.ads.zzfxn zzc = com.google.android.gms.internal.ads.zzfxn.zzq(2, 5, 6);

    static {
        com.google.android.gms.internal.ads.zzfxp zzfxpVar = new com.google.android.gms.internal.ads.zzfxp();
        zzfxpVar.zza(5, 6);
        zzfxpVar.zza(17, 6);
        zzfxpVar.zza(7, 6);
        zzfxpVar.zza(30, 10);
        zzfxpVar.zza(18, 6);
        zzfxpVar.zza(6, 8);
        zzfxpVar.zza(8, 8);
        zzfxpVar.zza(14, 8);
        zzb = zzfxpVar.zzc();
    }

    private zzoi(java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.ads.zzoh zzohVar = (com.google.android.gms.internal.ads.zzoh) list.get(i);
            this.zzd.put(zzohVar.zzb, zzohVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            iMax = java.lang.Math.max(iMax, ((com.google.android.gms.internal.ads.zzoh) this.zzd.valueAt(i2)).zzc);
        }
        this.zze = iMax;
    }

    static android.net.Uri zza() {
        if (zzf()) {
            return android.provider.Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static com.google.android.gms.internal.ads.zzoi zzc(android.content.Context context, com.google.android.gms.internal.ads.zze zzeVar, com.google.android.gms.internal.ads.zzoo zzooVar) {
        return zzd(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzeVar, zzooVar);
    }

    static com.google.android.gms.internal.ads.zzoi zzd(android.content.Context context, android.content.Intent intent, com.google.android.gms.internal.ads.zze zzeVar, com.google.android.gms.internal.ads.zzoo zzooVar) {
        java.lang.Object systemService = context.getSystemService("audio");
        systemService.getClass();
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        if (zzooVar == null) {
            com.google.android.gms.internal.ads.zzoo zzooVar2 = null;
            if (com.google.android.gms.internal.ads.zzei.zza >= 33) {
                try {
                    java.util.List<android.media.AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzeVar.zza().zza);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        zzooVar2 = new com.google.android.gms.internal.ads.zzoo(audioDevicesForAttributes.get(0));
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
            zzooVar = zzooVar2;
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 33 && (com.google.android.gms.internal.ads.zzei.zzM(context) || com.google.android.gms.internal.ads.zzei.zzI(context))) {
            java.util.List<android.media.AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzeVar.zza().zza);
            java.util.HashMap map = new java.util.HashMap();
            map.put(2, new java.util.HashSet(com.google.android.gms.internal.ads.zzgaq.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                android.media.AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (com.google.android.gms.internal.ads.zzei.zzJ(format) || zzb.containsKey(java.lang.Integer.valueOf(format))) {
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            java.util.Set set = (java.util.Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(com.google.android.gms.internal.ads.zzgaq.zzg(audioProfile.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new java.util.HashSet(com.google.android.gms.internal.ads.zzgaq.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
            for (java.util.Map.Entry entry : map.entrySet()) {
                zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzoh(((java.lang.Integer) entry.getKey()).intValue(), (java.util.Set) entry.getValue()));
            }
            return new com.google.android.gms.internal.ads.zzoi(zzfxkVar.zzi());
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 23) {
            android.media.AudioDeviceInfo[] devices = zzooVar == null ? audioManager.getDevices(2) : new android.media.AudioDeviceInfo[]{zzooVar.zza};
            com.google.android.gms.internal.ads.zzfxr zzfxrVar = new com.google.android.gms.internal.ads.zzfxr();
            zzfxrVar.zzg(8, 7);
            if (com.google.android.gms.internal.ads.zzei.zza >= 31) {
                zzfxrVar.zzg(26, 27);
            }
            if (com.google.android.gms.internal.ads.zzei.zza >= 33) {
                zzfxrVar.zzf((java.lang.Object) 30);
            }
            com.google.android.gms.internal.ads.zzfxs zzfxsVarZzi = zzfxrVar.zzi();
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                if (zzfxsVarZzi.contains(java.lang.Integer.valueOf(audioDeviceInfo.getType()))) {
                    return zza;
                }
            }
        }
        com.google.android.gms.internal.ads.zzfxr zzfxrVar2 = new com.google.android.gms.internal.ads.zzfxr();
        zzfxrVar2.zzf((java.lang.Object) 2);
        if (com.google.android.gms.internal.ads.zzei.zza >= 29 && (com.google.android.gms.internal.ads.zzei.zzM(context) || com.google.android.gms.internal.ads.zzei.zzI(context))) {
            com.google.android.gms.internal.ads.zzfxk zzfxkVar2 = new com.google.android.gms.internal.ads.zzfxk();
            com.google.android.gms.internal.ads.zzfzt it = zzb.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((java.lang.Integer) it.next()).intValue();
                if (com.google.android.gms.internal.ads.zzei.zza >= com.google.android.gms.internal.ads.zzei.zzh(iIntValue) && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(androidx.media3.extractor.OpusUtil.SAMPLE_RATE).build(), zzeVar.zza().zza)) {
                    zzfxkVar2.zzf(java.lang.Integer.valueOf(iIntValue));
                }
            }
            zzfxkVar2.zzf((java.lang.Object) 2);
            zzfxrVar2.zzh(zzfxkVar2.zzi());
            return new com.google.android.gms.internal.ads.zzoi(zze(com.google.android.gms.internal.ads.zzgaq.zzh(zzfxrVar2.zzi()), 10));
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        boolean z = android.provider.Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzf()) && android.provider.Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfxrVar2.zzh(zzc);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new com.google.android.gms.internal.ads.zzoi(zze(com.google.android.gms.internal.ads.zzgaq.zzh(zzfxrVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfxrVar2.zzh(com.google.android.gms.internal.ads.zzgaq.zzg(intArrayExtra));
        }
        return new com.google.android.gms.internal.ads.zzoi(zze(com.google.android.gms.internal.ads.zzgaq.zzh(zzfxrVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static com.google.android.gms.internal.ads.zzfxn zze(int[] iArr, int i) {
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        for (int i2 : iArr) {
            zzfxkVar.zzf(new com.google.android.gms.internal.ads.zzoh(i2, i));
        }
        return zzfxkVar.zzi();
    }

    private static boolean zzf() {
        return "Amazon".equals(com.google.android.gms.internal.ads.zzei.zzc) || "Xiaomi".equals(com.google.android.gms.internal.ads.zzei.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzoi)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzoi zzoiVar = (com.google.android.gms.internal.ads.zzoi) obj;
        android.util.SparseArray sparseArray = this.zzd;
        android.util.SparseArray<?> sparseArray2 = zzoiVar.zzd;
        if (com.google.android.gms.internal.ads.zzei.zza < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (java.util.Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                    }
                }
                if (this.zze == zzoiVar.zze) {
                    return true;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zze == zzoiVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        android.util.SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + java.util.Objects.hashCode(sparseArray.valueAt(i2));
            }
            iContentHashCode = iKeyAt;
        }
        return this.zze + (iContentHashCode * 31);
    }

    public final java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + com.ironsource.y8.i.e;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d A[PHI: r0
  0x003d: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zze zzeVar) {
        java.lang.String str = zzabVar.zzo;
        str.getClass();
        int iZza = com.google.android.gms.internal.ads.zzbb.zza(str, zzabVar.zzk);
        if (!zzb.containsKey(java.lang.Integer.valueOf(iZza))) {
            return null;
        }
        int i = 6;
        if (iZza != 18) {
            if (iZza != 8) {
                if (iZza == 30 && !com.google.android.gms.internal.ads.zzei.zzG(this.zzd, 30)) {
                    iZza = 7;
                }
            } else if (com.google.android.gms.internal.ads.zzei.zzG(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else if (com.google.android.gms.internal.ads.zzei.zzG(this.zzd, 18)) {
            iZza = 18;
            if (iZza != 8) {
                if (iZza == 30) {
                    iZza = 7;
                }
            } else if (com.google.android.gms.internal.ads.zzei.zzG(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else {
            iZza = 6;
        }
        if (!com.google.android.gms.internal.ads.zzei.zzG(this.zzd, iZza)) {
            return null;
        }
        com.google.android.gms.internal.ads.zzoh zzohVar = (com.google.android.gms.internal.ads.zzoh) this.zzd.get(iZza);
        zzohVar.getClass();
        int iZza2 = zzabVar.zzD;
        if (iZza2 == -1 || iZza == 18) {
            int i2 = zzabVar.zzE;
            if (i2 == -1) {
                i2 = androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
            }
            iZza2 = zzohVar.zza(i2, zzeVar);
        } else if (!zzabVar.zzo.equals(androidx.media3.common.MimeTypes.AUDIO_DTS_X) || com.google.android.gms.internal.ads.zzei.zza >= 33) {
            if (!zzohVar.zzb(iZza2)) {
                return null;
            }
        } else if (iZza2 > 10) {
            return null;
        }
        if (com.google.android.gms.internal.ads.zzei.zza > 28) {
            i = iZza2;
        } else if (iZza2 == 7) {
            i = 8;
        } else if (iZza2 != 3 && iZza2 != 4 && iZza2 != 5) {
            i = iZza2;
        }
        if (com.google.android.gms.internal.ads.zzei.zza <= 26 && "fugu".equals(com.google.android.gms.internal.ads.zzei.zzb) && i == 1) {
            i = 2;
        }
        int iZzi = com.google.android.gms.internal.ads.zzei.zzi(i);
        if (iZzi != 0) {
            return android.util.Pair.create(java.lang.Integer.valueOf(iZza), java.lang.Integer.valueOf(iZzi));
        }
        return null;
    }
}

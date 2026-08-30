package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzged {
    private final java.util.List zza = new java.util.ArrayList();
    private final com.google.android.gms.internal.ads.zzglo zzb = com.google.android.gms.internal.ads.zzglo.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzgeb) it.next()).zza = false;
        }
    }

    public final com.google.android.gms.internal.ads.zzged zza(com.google.android.gms.internal.ads.zzgeb zzgebVar) {
        if (zzgebVar.zzf != null) {
            throw new java.lang.IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgebVar.zza) {
            zzd();
        }
        zzgebVar.zzf = this;
        this.zza.add(zzgebVar);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgeg zzb() throws java.security.GeneralSecurityException {
        int i;
        int i2;
        if (this.zzc) {
            throw new java.security.GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        java.util.List list = this.zza;
        com.google.android.gms.internal.ads.zzgst zzgstVarZzc = com.google.android.gms.internal.ads.zzgsx.zzc();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.List list2 = this.zza;
        int i3 = 0;
        int i4 = 0;
        while (i4 < list2.size() - 1) {
            int i5 = i4 + 1;
            if (((com.google.android.gms.internal.ads.zzgeb) list2.get(i4)).zze == com.google.android.gms.internal.ads.zzgec.zza && ((com.google.android.gms.internal.ads.zzgeb) list2.get(i5)).zze != com.google.android.gms.internal.ads.zzgec.zza) {
                throw new java.security.GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i4 = i5;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.android.gms.internal.ads.zzgef zzgefVar = null;
        java.lang.Integer num = null;
        for (com.google.android.gms.internal.ads.zzgeb zzgebVar : this.zza) {
            com.google.android.gms.internal.ads.zzgdz unused = zzgebVar.zzb;
            if (zzgebVar.zze == null) {
                throw new java.security.GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i6 = 4;
            if (zzgebVar.zze == com.google.android.gms.internal.ads.zzgec.zza) {
                i = i3;
                while (true) {
                    if (i != 0 && !hashSet.contains(java.lang.Integer.valueOf(i))) {
                        break;
                    }
                    java.security.SecureRandom secureRandom = new java.security.SecureRandom();
                    byte[] bArr = new byte[i6];
                    int i7 = i3;
                    while (i7 == 0) {
                        secureRandom.nextBytes(bArr);
                        i7 = ((bArr[2] & 255) << 8) | ((bArr[i3] & 255) << 24) | ((bArr[c] & 255) << 16) | (bArr[3] & 255);
                        i3 = 0;
                        i6 = 4;
                    }
                    i = i7;
                }
            } else {
                com.google.android.gms.internal.ads.zzgec unused2 = zzgebVar.zze;
                i = 0;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new java.security.GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            com.google.android.gms.internal.ads.zzgeb.zza(zzgebVar);
            com.google.android.gms.internal.ads.zzgdx zzgdxVarZza = com.google.android.gms.internal.ads.zzgma.zzb().zza(zzgebVar.zzd, c != zzgebVar.zzd.zza() ? null : numValueOf);
            com.google.android.gms.internal.ads.zzgee zzgeeVar = new com.google.android.gms.internal.ads.zzgee(zzgdxVarZza, zzgebVar.zzb, i, zzgebVar.zza, null);
            com.google.android.gms.internal.ads.zzgdz zzgdzVar = zzgebVar.zzb;
            com.google.android.gms.internal.ads.zzgnh zzgnhVar = (com.google.android.gms.internal.ads.zzgnh) com.google.android.gms.internal.ads.zzgmk.zzc().zzd(zzgdxVarZza, com.google.android.gms.internal.ads.zzgnh.class, com.google.android.gms.internal.ads.zzgeo.zza());
            java.lang.Integer numZzf = zzgnhVar.zzf();
            if (numZzf != null && numZzf.intValue() != i) {
                throw new java.security.GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (com.google.android.gms.internal.ads.zzgdz.zza.equals(zzgdzVar)) {
                i2 = 3;
            } else if (com.google.android.gms.internal.ads.zzgdz.zzb.equals(zzgdzVar)) {
                i2 = 4;
            } else {
                if (!com.google.android.gms.internal.ads.zzgdz.zzc.equals(zzgdzVar)) {
                    throw new java.lang.IllegalStateException("Unknown key status");
                }
                i2 = 5;
            }
            com.google.android.gms.internal.ads.zzgsu zzgsuVarZzc = com.google.android.gms.internal.ads.zzgsv.zzc();
            com.google.android.gms.internal.ads.zzgsi zzgsiVarZza = com.google.android.gms.internal.ads.zzgsl.zza();
            zzgsiVarZza.zzb(zzgnhVar.zzg());
            zzgsiVarZza.zzc(zzgnhVar.zze());
            zzgsiVarZza.zza(zzgnhVar.zzb());
            zzgsuVarZzc.zza(zzgsiVarZza);
            zzgsuVarZzc.zzd(i2);
            zzgsuVarZzc.zzb(i);
            zzgsuVarZzc.zzc(zzgnhVar.zzc());
            zzgstVarZzc.zza((com.google.android.gms.internal.ads.zzgsv) zzgsuVarZzc.zzbr());
            if (zzgebVar.zza) {
                if (num != null) {
                    throw new java.security.GeneralSecurityException("Two primaries were set");
                }
                if (zzgebVar.zzb != com.google.android.gms.internal.ads.zzgdz.zza) {
                    throw new java.security.GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgeeVar);
            c = 1;
            i3 = 0;
        }
        if (num == null) {
            throw new java.security.GeneralSecurityException("No primary was set");
        }
        zzgstVarZzc.zzb(num.intValue());
        com.google.android.gms.internal.ads.zzgsx zzgsxVar = (com.google.android.gms.internal.ads.zzgsx) zzgstVarZzc.zzbr();
        com.google.android.gms.internal.ads.zzgeg.zzh(zzgsxVar);
        return new com.google.android.gms.internal.ads.zzgeg(zzgsxVar, arrayList, this.zzb, zzgefVar);
    }
}

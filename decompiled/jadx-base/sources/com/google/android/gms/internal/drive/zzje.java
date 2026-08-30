package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzje implements java.util.Comparator<com.google.android.gms.internal.drive.zzjc> {
    zzje() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.internal.drive.zzjc zzjcVar, com.google.android.gms.internal.drive.zzjc zzjcVar2) {
        com.google.android.gms.internal.drive.zzjc zzjcVar3 = zzjcVar;
        com.google.android.gms.internal.drive.zzjc zzjcVar4 = zzjcVar2;
        com.google.android.gms.internal.drive.zzjj zzjjVar = (com.google.android.gms.internal.drive.zzjj) zzjcVar3.iterator();
        com.google.android.gms.internal.drive.zzjj zzjjVar2 = (com.google.android.gms.internal.drive.zzjj) zzjcVar4.iterator();
        while (zzjjVar.hasNext() && zzjjVar2.hasNext()) {
            int iCompare = java.lang.Integer.compare(com.google.android.gms.internal.drive.zzjc.zza(zzjjVar.nextByte()), com.google.android.gms.internal.drive.zzjc.zza(zzjjVar2.nextByte()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return java.lang.Integer.compare(zzjcVar3.size(), zzjcVar4.size());
    }
}
